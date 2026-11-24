// default package

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dfb {
    public static final ArrayList b = new ArrayList(50);
    public final Handler a;

    public dfb(Handler handler) {
        this.a = handler;
    }

    public static cfb d() {
        cfb cfbVar;
        ArrayList arrayList = b;
        synchronized (arrayList) {
            cfbVar = arrayList.isEmpty() ? new cfb() : (cfb) arrayList.remove(arrayList.size() - 1);
        }
        return cfbVar;
    }

    public final cfb a(int i) {
        cfb d = d();
        d.a = this.a.obtainMessage(i);
        return d;
    }

    public final cfb b(int i, int i2, int i3) {
        cfb d = d();
        d.a = this.a.obtainMessage(i, i2, i3);
        return d;
    }

    public final cfb c(int i, Object obj) {
        cfb d = d();
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
        jte.f(i != 0);
        this.a.removeMessages(i);
    }

    public final void h(int i) {
        this.a.sendEmptyMessage(i);
    }
}
