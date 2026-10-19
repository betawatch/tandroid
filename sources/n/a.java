package n;

import android.os.Looper;
import w7.y;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class a extends y {
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
