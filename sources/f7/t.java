package f7;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class t {
    public static s a;

    public static synchronized r a(o oVar) {
        r rVar;
        synchronized (t.class) {
            try {
                if (a == null) {
                    a = new s(0);
                }
                rVar = (r) a.G(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public static Object b(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
