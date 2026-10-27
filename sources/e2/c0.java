package e2;

import android.os.SystemClock;
import b2.m1;
import b2.p1;
import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c0 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public boolean e;
    public long f;
    public final /* synthetic */ e0 g;

    public c0(e0 e0Var, int i10) {
        this.g = e0Var;
        this.a = i10;
    }

    public final void a() {
        long duration;
        e0 e0Var = this.g;
        m1 m1Var = e0Var.e;
        i0 i0Var = e0Var.f;
        i2.j0 j0Var = e0Var.a;
        p1 y02 = j0Var.y0();
        Object l4 = y02.p() ? null : y02.l(j0Var.A());
        int m0 = j0Var.m0();
        int N = j0Var.N();
        long M0 = j0Var.M0();
        if (l4 == null || m0 != -1) {
            duration = m0 != -1 ? j0Var.getDuration() : -9223372036854775807L;
        } else {
            y02.g(l4, m1Var);
            M0 -= n0.h0(m1Var.e);
            duration = n0.h0(m1Var.d);
        }
        boolean j02 = j0Var.j0();
        if (!j02 || duration == -9223372036854775807L || M0 < duration) {
            i0Var.e(3);
            if (j02 && duration != -9223372036854775807L) {
                i0Var.a.sendEmptyMessageDelayed(3, (int) Math.ceil((duration - M0) / j0Var.h().a));
            }
            this.e = false;
            return;
        }
        e0Var.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.e;
        int i10 = this.a;
        if (z10 && Objects.equals(l4, this.b) && m0 == this.c && N == this.d) {
            if (elapsedRealtime - this.f >= i10) {
                e0Var.c.a.A1(new i2.m(2, new f0(3, i10), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.f = elapsedRealtime;
        this.b = l4;
        this.c = m0;
        this.d = N;
        i0Var.e(3);
        i0Var.a.sendEmptyMessageDelayed(3, i10);
    }
}
