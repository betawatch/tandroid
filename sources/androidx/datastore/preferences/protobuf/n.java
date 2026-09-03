package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n {
    public static volatile n a;
    public static final n b;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        n nVar = new n();
        Map map = Collections.EMPTY_MAP;
        b = nVar;
    }

    public static n a() {
        n nVar;
        n nVar2 = a;
        if (nVar2 != null) {
            return nVar2;
        }
        synchronized (n.class) {
            try {
                nVar = a;
                if (nVar == null) {
                    Class cls = m.a;
                    if (cls != null) {
                        try {
                            nVar = (n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                        a = nVar;
                    }
                    nVar = b;
                    a = nVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }
}
