package g2;

import android.os.SystemClock;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e0 {
    public final int a;
    public int b;
    public boolean c;
    public long d;
    public final /* synthetic */ f0 e;

    public e0(f0 f0Var, int i3) {
        this.e = f0Var;
        this.a = i3;
    }

    public final void a() {
        f0 f0Var = this.e;
        j0 j0Var = (j0) f0Var.f;
        k2.i0 i0Var = (k2.i0) f0Var.a;
        int t02 = i0Var.t0();
        if (!i0Var.u() || i0Var.h() == 1 || i0Var.h() == 4 || t02 == 0 || t02 == 1) {
            if (this.c) {
                j0Var.e(4);
            }
            this.c = false;
            return;
        }
        ((h0) f0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.c;
        int i3 = this.a;
        if (z10 && this.b == t02) {
            if (elapsedRealtime - this.d >= i3) {
                ((k2.c0) f0Var.c).a.A1(new k2.l(2, new g0(4, i3), 1003));
                return;
            }
            return;
        }
        this.c = true;
        this.d = elapsedRealtime;
        this.b = t02;
        j0Var.e(4);
        j0Var.a.sendEmptyMessageDelayed(4, i3);
    }
}
