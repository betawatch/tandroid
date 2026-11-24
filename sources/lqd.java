// default package

import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
