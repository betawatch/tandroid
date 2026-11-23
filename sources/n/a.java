package n;

import android.os.Looper;
import c8.x9;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class a extends x9 {
    public static volatile a b;
    public final b a = new b();

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
        b bVar = this.a;
        if (bVar.c == null) {
            synchronized (bVar.a) {
                try {
                    if (bVar.c == null) {
                        bVar.c = b.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        bVar.c.post(runnable);
    }
}
