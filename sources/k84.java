// default package

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k84 {
    public static volatile k84 a;
    public static final k84 b;

    static {
        k84 k84Var = new k84();
        Map map = Collections.EMPTY_MAP;
        b = k84Var;
    }

    public static k84 a() {
        k84 k84Var;
        gv8 gv8Var = gv8.c;
        k84 k84Var2 = a;
        if (k84Var2 != null) {
            return k84Var2;
        }
        synchronized (k84.class) {
            k84Var = a;
            if (k84Var == null) {
                Class cls = j84.a;
                k84 k84Var3 = null;
                if (cls != null) {
                    try {
                        k84Var3 = (k84) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                k84Var = k84Var3 != null ? k84Var3 : b;
                a = k84Var;
            }
        }
        return k84Var;
    }
}
