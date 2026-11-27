// default package

import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
