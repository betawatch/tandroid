// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
