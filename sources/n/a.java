package n;

import android.os.Looper;
import w7.b0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends b0 {
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
