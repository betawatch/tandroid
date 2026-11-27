// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class bb3 {
    public static final vd3 a;

    static {
        String str;
        vd3 vd3Var;
        int i = chb.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            qc3 qc3Var = bp3.a;
            le5 le5Var = zi6.a;
            le5 le5Var2 = le5Var.e;
            vd3Var = le5Var;
            if (le5Var == null) {
                vd3Var = ab3.w;
            }
        } else {
            vd3Var = ab3.w;
        }
        a = vd3Var;
    }
}
