package n;

import android.os.Looper;
import c8.v9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a extends v9 {
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
