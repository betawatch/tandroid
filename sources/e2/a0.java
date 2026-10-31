package e2;

import android.os.SystemClock;
import b2.o1;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a0 {
    public long a;
    public long b;
    public long c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public Object h;
    public final Object i;

    public a0(e0 e0Var, int i10) {
        this.i = e0Var;
        this.d = i10;
    }

    public void a() {
        int i10 = this.d;
        e0 e0Var = (e0) this.i;
        i0 i0Var = e0Var.f;
        i2.i0 i0Var2 = e0Var.a;
        if (i0Var2.h() != 2 || !i0Var2.t() || i0Var2.w0() != 0) {
            if (this.e) {
                i0Var.e(1);
            }
            this.e = false;
            return;
        }
        o1 y02 = i0Var2.y0();
        Object l4 = y02.p() ? null : y02.l(i0Var2.A());
        int l02 = i0Var2.l0();
        int N = i0Var2.N();
        long c02 = i0Var2.c0();
        long max = Math.max(0L, i0Var2.q() - Math.max(0L, c02 - i0Var2.M0()));
        if (l4 != null && l02 == -1) {
            c02 -= l0.h0(y02.g(l4, e0Var.e).e);
        }
        e0Var.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.e && Objects.equals(l4, this.h) && l02 == this.f && N == this.g && c02 == this.a && max == this.b) {
            if (elapsedRealtime - this.c >= i10) {
                e0Var.c.a.A1(new i2.l(2, new f0(1, i10), 1003));
                return;
            }
            return;
        }
        this.e = true;
        this.c = elapsedRealtime;
        this.h = l4;
        this.f = l02;
        this.g = N;
        this.a = c02;
        this.b = max;
        i0Var.e(1);
        i0Var.a.sendEmptyMessageDelayed(1, i10);
    }

    public a0(String str, long j10, long j11, long j12, zf.e0 e0Var) {
        this.i = e0Var;
        this.h = str;
        this.a = j10;
        this.b = j11;
        this.c = j12;
    }
}
