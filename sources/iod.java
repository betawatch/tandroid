// default package

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class iod {
    public static final sid b = new sid((byte) 1);
    public final xod a;

    public iod() {
        pqd pqdVar;
        try {
            pqdVar = (pqd) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            pqdVar = b;
        }
        pqd[] pqdVarArr = {sid.b, pqdVar};
        xod xodVar = new xod();
        xodVar.a = pqdVarArr;
        Charset charset = ejd.a;
        this.a = xodVar;
    }
}
