package e2;

import android.os.SystemClock;
import b2.l1;
import b2.o1;
import j$.util.Objects;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
        l1 l1Var = e0Var.e;
        i0 i0Var = e0Var.f;
        i2.i0 i0Var2 = e0Var.a;
        o1 y02 = i0Var2.y0();
        Object l4 = y02.p() ? null : y02.l(i0Var2.A());
        int m0 = i0Var2.m0();
        int N = i0Var2.N();
        long M0 = i0Var2.M0();
        if (l4 == null || m0 != -1) {
            duration = m0 != -1 ? i0Var2.getDuration() : -9223372036854775807L;
        } else {
            y02.g(l4, l1Var);
            M0 -= m0.h0(l1Var.e);
            duration = m0.h0(l1Var.d);
        }
        boolean j02 = i0Var2.j0();
        if (!j02 || duration == -9223372036854775807L || M0 < duration) {
            i0Var.e(3);
            if (j02 && duration != -9223372036854775807L) {
                i0Var.a.sendEmptyMessageDelayed(3, (int) Math.ceil((duration - M0) / i0Var2.h().a));
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
                e0Var.c.a.A1(new i2.n(2, new f0(3, i10), 1003));
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
