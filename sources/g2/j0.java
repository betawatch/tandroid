package g2;

import android.os.Handler;
import b8.zb;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j0 {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public j0(Handler handler) {
        this.a = handler;
    }

    public static i0 c() {
        i0 i0Var;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            try {
                i0Var = arrayList.isEmpty() ? new i0() : (i0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i0Var;
    }

    public final i0 a(int i3) {
        i0 c2 = c();
        c2.a = this.a.obtainMessage(i3);
        return c2;
    }

    public final i0 b(int i3, Object obj) {
        i0 c2 = c();
        c2.a = this.a.obtainMessage(i3, obj);
        return c2;
    }

    public final boolean d(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final void e(int i3) {
        zb.f(i3 != 0);
        this.a.removeMessages(i3);
    }

    public final boolean f(int i3) {
        return this.a.sendEmptyMessage(i3);
    }
}
