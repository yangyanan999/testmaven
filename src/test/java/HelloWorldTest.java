
import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.*;


public class HelloWorldTest {
    @Test
    public void testSayHello(){
        Assert.assertEquals("hello world",new HelloWorldM().sayHello());
    }
}

