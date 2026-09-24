package n;

import android.os.Looper;
import w7.z;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class a extends z {
    public static volatile a b;
    public final c a = new c();

    public static a a() {
        if (b != null) {
            return b;
        }
        synchronized (a.class) {
            try {
                if (b == null) {
                    b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b;
    }

    public final void b(Runnable runnable) {
        c cVar = this.a;
        if (cVar.c == null) {
            synchronized (cVar.a) {
                try {
                    if (cVar.c == null) {
                        cVar.c = c.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        cVar.c.post(runnable);
    }
}
