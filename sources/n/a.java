package n;

import android.os.Looper;
import w7.z;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
