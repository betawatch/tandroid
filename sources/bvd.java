// default package

import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class bvd {
    public static String a(String str) {
        List list = null;
        if (str != null) {
            return k7b.u(new k7b(str, list));
        }
        lq5.j("applicationId cannot be null");
        return null;
    }
}
