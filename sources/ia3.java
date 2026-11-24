// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ia3 {
    public static final dd3 a;

    static {
        String str;
        dd3 dd3Var;
        int i = hdb.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            xb3 xb3Var = ko3.a;
            kc5 kc5Var = ug6.a;
            kc5 kc5Var2 = kc5Var.e;
            dd3Var = kc5Var;
            if (kc5Var == null) {
                dd3Var = ha3.w;
            }
        } else {
            dd3Var = ha3.w;
        }
        a = dd3Var;
    }
}
