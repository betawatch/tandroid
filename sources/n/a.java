package n;

import android.os.Looper;
import c8.y9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a extends y9 {
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
