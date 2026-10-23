package e2;

import android.os.Handler;
import java.util.ArrayList;
import v7.u6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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

    public final h0 a(int i10) {
        h0 c10 = c();
        c10.a = this.a.obtainMessage(i10);
        return c10;
    }

    public final h0 b(int i10, Object obj) {
        h0 c10 = c();
        c10.a = this.a.obtainMessage(i10, obj);
        return c10;
    }

    public final boolean d(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final void e(int i10) {
        u6.g(i10 != 0);
        this.a.removeMessages(i10);
    }

    public final boolean f(int i10) {
        return this.a.sendEmptyMessage(i10);
    }
}
