package e2;

import android.os.SystemClock;
import b2.p1;
import j$.util.Objects;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b0 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ e0 h;

    public b0(e0 e0Var, int i10) {
        this.h = e0Var;
        this.a = i10;
    }

    public final void a() {
        e0 e0Var = this.h;
        i0 i0Var = e0Var.f;
        i2.j0 j0Var = e0Var.a;
        if (!j0Var.j0()) {
            if (this.f) {
                i0Var.e(2);
            }
            this.f = false;
            return;
        }
        p1 y02 = j0Var.y0();
        Object l4 = y02.p() ? null : y02.l(j0Var.A());
        int m0 = j0Var.m0();
        int N = j0Var.N();
        long M0 = j0Var.M0();
        if (l4 != null && m0 == -1) {
            M0 -= n0.h0(y02.g(l4, e0Var.e).e);
        }
        e0Var.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.f;
        int i10 = this.a;
        if (z10 && Objects.equals(l4, this.b) && m0 == this.c && N == this.d && M0 == this.e) {
            if (elapsedRealtime - this.g >= i10) {
                e0Var.c.a.A1(new i2.m(2, new f0(2, i10), 1003));
                return;
            }
            return;
        }
        this.f = true;
        this.g = elapsedRealtime;
        this.b = l4;
        this.c = m0;
        this.d = N;
        this.e = M0;
        i0Var.e(2);
        i0Var.a.sendEmptyMessageDelayed(2, i10);
    }
}
