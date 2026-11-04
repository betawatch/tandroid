package g2;

import android.os.SystemClock;
import d2.k1;
import d2.n1;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c0 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ f0 h;

    public c0(f0 f0Var, int i3) {
        this.h = f0Var;
        this.a = i3;
    }

    public final void a() {
        f0 f0Var = this.h;
        j0 j0Var = (j0) f0Var.f;
        k2.i0 i0Var = (k2.i0) f0Var.a;
        if (!i0Var.i0()) {
            if (this.f) {
                j0Var.e(2);
            }
            this.f = false;
            return;
        }
        n1 y02 = i0Var.y0();
        Object l10 = y02.p() ? null : y02.l(i0Var.B());
        int k02 = i0Var.k0();
        int M = i0Var.M();
        long N0 = i0Var.N0();
        if (l10 != null && k02 == -1) {
            N0 -= n0.h0(y02.g(l10, (k1) f0Var.e).e);
        }
        ((h0) f0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f;
        int i3 = this.a;
        if (z10 && Objects.equals(l10, this.b) && k02 == this.c && M == this.d && N0 == this.e) {
            if (elapsedRealtime - this.g >= i3) {
                ((k2.c0) f0Var.c).a.A1(new k2.l(2, new g0(2, i3), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = elapsedRealtime;
        this.b = l10;
        this.c = k02;
        this.d = M;
        this.e = N0;
        j0Var.e(2);
        j0Var.a.sendEmptyMessageDelayed(2, i3);
    }
}
