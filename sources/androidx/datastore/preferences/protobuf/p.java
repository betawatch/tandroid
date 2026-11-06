package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class p {
    public static volatile p a;
    public static final p b;

    static {
        p pVar = new p();
        Map map = Collections.EMPTY_MAP;
        b = pVar;
    }

    public static p a() {
        p pVar;
        y0 y0Var = y0.c;
        p pVar2 = a;
        if (pVar2 != null) {
            return pVar2;
        }
        synchronized (p.class) {
            try {
                pVar = a;
                if (pVar == null) {
                    Class cls = o.a;
                    p pVar3 = null;
                    if (cls != null) {
                        try {
                            pVar3 = (p) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    pVar = pVar3 != null ? pVar3 : b;
                    a = pVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }
}
