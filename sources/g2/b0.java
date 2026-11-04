package g2;

import android.os.SystemClock;
import d2.k1;
import d2.n1;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b0 {
    public long a;
    public long b;
    public long c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public Object h;
    public final Object i;

    public b0(f0 f0Var, int i3) {
        this.i = f0Var;
        this.d = i3;
    }

    public void a() {
        int i3 = this.d;
        f0 f0Var = (f0) this.i;
        j0 j0Var = (j0) f0Var.f;
        k2.i0 i0Var = (k2.i0) f0Var.a;
        if (i0Var.h() != 2 || !i0Var.u() || i0Var.t0() != 0) {
            if (this.e) {
                j0Var.e(1);
            }
            this.e = false;
            return;
        }
        n1 y02 = i0Var.y0();
        Object l10 = y02.p() ? null : y02.l(i0Var.B());
        int k02 = i0Var.k0();
        int M = i0Var.M();
        long b02 = i0Var.b0();
        long max = Math.max(0L, i0Var.q() - Math.max(0L, b02 - i0Var.N0()));
        if (l10 != null && k02 == -1) {
            b02 -= n0.h0(y02.g(l10, (k1) f0Var.e).e);
        }
        ((h0) f0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.e && Objects.equals(l10, this.h) && k02 == this.f && M == this.g && b02 == this.a && max == this.b) {
            if (elapsedRealtime - this.c >= i3) {
                ((k2.c0) f0Var.c).a.A1(new k2.l(2, new g0(1, i3), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.c = elapsedRealtime;
        this.h = l10;
        this.f = k02;
        this.g = M;
        this.a = b02;
        this.b = max;
        j0Var.e(1);
        j0Var.a.sendEmptyMessageDelayed(1, i3);
    }

    public b0(String str, long j10, long j11, long j12, kg.l0 l0Var) {
        this.i = l0Var;
        this.h = str;
        this.a = j10;
        this.b = j11;
        this.c = j12;
    }
}
