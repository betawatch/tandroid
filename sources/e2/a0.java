package e2;

import android.os.SystemClock;
import b2.p1;
import j$.util.Objects;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class a0 {
    public final int a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public long f;
    public boolean g;
    public long h;
    public final /* synthetic */ e0 i;

    public a0(e0 e0Var, int i10) {
        this.i = e0Var;
        this.a = i10;
    }

    public final void a() {
        Object obj;
        e0 e0Var = this.i;
        i0 i0Var = e0Var.f;
        i2.h0 h0Var = e0Var.a;
        if (h0Var.d() != 2 || !h0Var.t() || h0Var.w0() != 0) {
            if (this.g) {
                i0Var.e(1);
            }
            this.g = false;
            return;
        }
        p1 y02 = h0Var.y0();
        Object l4 = y02.p() ? null : y02.l(h0Var.A());
        int m0 = h0Var.m0();
        int N = h0Var.N();
        long d02 = h0Var.d0();
        long max = Math.max(0L, h0Var.q() - Math.max(0L, d02 - h0Var.M0()));
        if (l4 != null && m0 == -1) {
            d02 -= m0.h0(y02.g(l4, e0Var.e).e);
        }
        e0Var.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = this.g;
        int i10 = this.a;
        if (z10 && Objects.equals(l4, this.b) && m0 == this.c && N == this.d) {
            obj = l4;
            if (d02 == this.e && max == this.f) {
                if (elapsedRealtime - this.h >= i10) {
                    e0Var.c.a.A1(new i2.m(2, new f0(1, i10), 1003));
                    return;
                }
                return;
            }
        } else {
            obj = l4;
        }
        this.g = true;
        this.h = elapsedRealtime;
        this.b = obj;
        this.c = m0;
        this.d = N;
        this.e = d02;
        this.f = max;
        i0Var.e(1);
        i0Var.a.sendEmptyMessageDelayed(1, i10);
    }
}
