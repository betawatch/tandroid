// default package

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class lqd {
    public static String a(String str) {
        List list = null;
        if (str != null) {
            return v8b.r(new v8b(str, list));
        }
        w26.j("applicationId cannot be null");
        return null;
    }
}
