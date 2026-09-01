package n;

import android.os.Looper;
import k7.w;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a extends w {
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
