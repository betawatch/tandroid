package h2;

import android.os.SystemClock;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d0 {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ e0 e;

    public d0(e0 e0Var, int i7) {
        this.e = e0Var;
        this.a = i7;
    }

    public final void a() {
        e0 e0Var = this.e;
        i0 i0Var = (i0) e0Var.f;
        l2.i0 i0Var2 = (l2.i0) e0Var.a;
        int w02 = i0Var2.w0();
        if (!i0Var2.u() || i0Var2.i() == 1 || i0Var2.i() == 4 || w02 == 0 || w02 == 1) {
            if (this.c) {
                i0Var.e(4);
            }
            this.c = false;
            return;
        }
        ((g0) e0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z9 = this.c;
        int i7 = this.a;
        if (z9 && this.b == w02) {
            if (elapsedRealtime - this.d >= i7) {
                ((l2.c0) e0Var.c).a.A1(new l2.l(2, new f0(4, i7), 1003));
                return;
            }
            return;
        }
        this.c = true;
        this.d = elapsedRealtime;
        this.b = w02;
        i0Var.e(4);
        i0Var.a.sendEmptyMessageDelayed(4, i7);
    }
}
