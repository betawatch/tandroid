package g2;

import android.os.SystemClock;
import d2.k1;
import d2.n1;
import j$.util.Objects;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d0 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ f0 g;

    public d0(f0 f0Var, int i3) {
        this.g = f0Var;
        this.a = i3;
    }

    public final void a() {
        long duration;
        f0 f0Var = this.g;
        k1 k1Var = (k1) f0Var.e;
        j0 j0Var = (j0) f0Var.f;
        k2.i0 i0Var = (k2.i0) f0Var.a;
        n1 y02 = i0Var.y0();
        Object l10 = y02.p() ? null : y02.l(i0Var.B());
        int k02 = i0Var.k0();
        int M = i0Var.M();
        long N0 = i0Var.N0();
        if (l10 == null || k02 != -1) {
            duration = k02 != -1 ? i0Var.getDuration() : -9223372036854775807L;
        } else {
            y02.g(l10, k1Var);
            N0 -= n0.h0(k1Var.e);
            duration = n0.h0(k1Var.d);
        }
        boolean i02 = i0Var.i0();
        if (!i02 || duration == -9223372036854775807L || N0 < duration) {
            j0Var.e(3);
            if (i02 && duration != -9223372036854775807L) {
                j0Var.a.sendEmptyMessageDelayed(3, (int) Math.ceil((duration - N0) / i0Var.g().a));
            }
            this.e = false;
            return;
        }
        ((h0) f0Var.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.e;
        int i3 = this.a;
        if (z10 && Objects.equals(l10, this.b) && k02 == this.c && M == this.d) {
            if (elapsedRealtime - this.f >= i3) {
                ((k2.c0) f0Var.c).a.A1(new k2.l(2, new g0(3, i3), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.f = elapsedRealtime;
        this.b = l10;
        this.c = k02;
        this.d = M;
        j0Var.e(3);
        j0Var.a.sendEmptyMessageDelayed(3, i3);
    }
}
