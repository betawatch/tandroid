// default package

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class lqd {
    public static final ukd b = new ukd((byte) 1);
    public final ard a;

    public lqd() {
        ssd ssdVar;
        try {
            ssdVar = (ssd) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            ssdVar = b;
        }
        ssd[] ssdVarArr = {ukd.b, ssdVar};
        ard ardVar = new ard();
        ardVar.a = ssdVarArr;
        Charset charset = gld.a;
        this.a = ardVar;
    }
}
