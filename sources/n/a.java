package n;

import android.os.Looper;
import c8.w9;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a extends w9 {
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
