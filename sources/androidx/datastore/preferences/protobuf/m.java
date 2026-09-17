package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class m {
    public static volatile m a;
    public static final m b;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        m mVar = new m();
        Map map = Collections.EMPTY_MAP;
        b = mVar;
    }

    public static m a() {
        m mVar;
        m mVar2 = a;
        if (mVar2 != null) {
            return mVar2;
        }
        synchronized (m.class) {
            try {
                mVar = a;
                if (mVar == null) {
                    Class cls = l.a;
                    if (cls != null) {
                        try {
                            mVar = (m) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                        a = mVar;
                    }
                    mVar = b;
                    a = mVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }
}
