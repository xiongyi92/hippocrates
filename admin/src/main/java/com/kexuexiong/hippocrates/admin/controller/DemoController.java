package com.kexuexiong.hippocrates.admin.controller;

import com.kexuexiong.hippocrates.common.util.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@Api(tags = "demo say hi")
public class DemoController extends BaseController {
    @ApiOperation(value = "say hi")
    @RequestMapping(value = "/sayHi",method = RequestMethod.GET)
    public String sayHello(){
      return "hello";
    };
}
