// default package

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class b74 {
    public static volatile b74 a;
    public static final b74 b;

    static {
        b74 b74Var = new b74();
        Map map = Collections.EMPTY_MAP;
        b = b74Var;
    }

    public static b74 a() {
        b74 b74Var;
        ft8 ft8Var = ft8.c;
        b74 b74Var2 = a;
        if (b74Var2 != null) {
            return b74Var2;
        }
        synchronized (b74.class) {
            b74Var = a;
            if (b74Var == null) {
                Class cls = a74.a;
                b74 b74Var3 = null;
                if (cls != null) {
                    try {
                        b74Var3 = (b74) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                b74Var = b74Var3 != null ? b74Var3 : b;
                a = b74Var;
            }
        }
        return b74Var;
    }
}
