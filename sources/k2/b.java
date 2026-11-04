package k2;

import b8.zb;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class b implements l1 {
    public boolean E;
    public boolean F;
    public w2.g0 H;
    public z2.n I;
    public final int b;
    public q1 d;
    public int e;
    public l2.k f;
    public g2.h0 h;
    public int n;
    public w2.d1 r;
    public d2.v[] s;
    public long w;
    public long x;
    public final Object a = new Object();
    public final tf.b c = new tf.b();
    public long y = Long.MIN_VALUE;
    public d2.n1 G = d2.n1.a;

    public b(int i3) {
        this.b = i3;
    }

    public final int B(long j10) {
        w2.d1 d1Var = this.r;
        d1Var.getClass();
        return d1Var.m(j10 - this.w);
    }

    public abstract int C(d2.v vVar);

    public int D() {
        return 0;
    }

    public boolean E(long j10) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l e(Throwable th2, d2.v vVar, boolean z10, int i3) {
        int i10;
        if (vVar != null && !this.F) {
            this.F = true;
            try {
                i10 = C(vVar) & 7;
            } catch (l unused) {
            } finally {
                this.F = false;
            }
            return new l(1, th2, i3, j(), this.e, vVar, vVar != null ? 4 : i10, this.H, z10);
        }
        i10 = 4;
        return new l(1, th2, i3, j(), this.e, vVar, vVar != null ? 4 : i10, this.H, z10);
    }

    public long h(long j10, long j11) {
        if (this.n == 1) {
            return (m() || l()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public w0 i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        return this.y == Long.MIN_VALUE;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j10, boolean z10, boolean z11);

    public final int w(tf.b bVar, j2.h hVar, int i3) {
        w2.d1 d1Var = this.r;
        d1Var.getClass();
        int o10 = d1Var.o(bVar, hVar, i3);
        if (o10 == -4) {
            if (hVar.isEndOfStream()) {
                this.y = Long.MIN_VALUE;
                return this.E ? -4 : -3;
            }
            long j10 = hVar.e + this.w;
            hVar.e = j10;
            this.y = Math.max(this.y, j10);
            return o10;
        }
        if (o10 == -5) {
            d2.v vVar = (d2.v) bVar.b;
            vVar.getClass();
            long j11 = vVar.x;
            if (j11 != Long.MAX_VALUE) {
                d2.u a10 = vVar.a();
                a10.w = j11 + this.w;
                bVar.b = new d2.v(a10);
            }
        }
        return o10;
    }

    public abstract void x(long j10, long j11);

    public final void y(d2.v[] vVarArr, w2.d1 d1Var, long j10, long j11, w2.g0 g0Var) {
        zb.p(!this.E);
        this.r = d1Var;
        this.H = g0Var;
        if (this.y == Long.MIN_VALUE) {
            this.y = j10;
        }
        this.s = vVarArr;
        this.w = j11;
        u(vVarArr, j10, j11, g0Var);
    }

    public final void z(long j10, boolean z10, boolean z11) {
        this.E = false;
        this.x = j10;
        this.y = j10;
        if (!z11) {
            z11 = B(j10) != 0;
        }
        p(j10, z10, z11);
    }

    public void f() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void v() {
    }

    public void A(float f10, float f11) {
    }

    @Override // k2.l1
    public void d(int i3, Object obj) {
    }

    public void o(boolean z10, boolean z11) {
    }

    public void u(d2.v[] vVarArr, long j10, long j11, w2.g0 g0Var) {
    }
}
