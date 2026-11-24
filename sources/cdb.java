// default package

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class cdb {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public cdb(Handler handler) {
        this.a = handler;
    }

    public static bdb d() {
        bdb bdbVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            bdbVar = arrayList.isEmpty() ? new bdb() : (bdb) arrayList.remove(arrayList.size() - 1);
        }
        return bdbVar;
    }

    public final bdb a(int i) {
        bdb d = d();
        d.a = this.a.obtainMessage(i);
        return d;
    }

    public final bdb b(int i, int i2, int i3) {
        bdb d = d();
        d.a = this.a.obtainMessage(i, i2, i3);
        return d;
    }

    public final bdb c(int i, Object obj) {
        bdb d = d();
        d.a = this.a.obtainMessage(i, obj);
        return d;
    }

    public final void e(Runnable runnable) {
        this.a.post(runnable);
    }

    public final void f() {
        this.a.removeCallbacksAndMessages(null);
    }

    public final void g(int i) {
        gre.f(i != 0);
        this.a.removeMessages(i);
    }

    public final void h(int i) {
        this.a.sendEmptyMessage(i);
    }
}
