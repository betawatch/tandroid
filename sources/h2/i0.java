package h2;

import a8.ia;
import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class i0 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public i0(Handler handler) {
        this.a = handler;
    }

    public static h0 c() {
        h0 h0Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                h0Var = arrayList.isEmpty() ? new h0() : (h0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h0Var;
    }

    public final h0 a(int i7) {
        h0 c10 = c();
        c10.a = this.a.obtainMessage(i7);
        return c10;
    }

    public final h0 b(int i7, Object obj) {
        h0 c10 = c();
        c10.a = this.a.obtainMessage(i7, obj);
        return c10;
    }

    public final boolean d(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final void e(int i7) {
        ia.f(i7 != 0);
        this.a.removeMessages(i7);
    }

    public final boolean f(int i7) {
        return this.a.sendEmptyMessage(i7);
    }
}
