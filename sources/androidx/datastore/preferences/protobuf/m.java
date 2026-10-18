package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
