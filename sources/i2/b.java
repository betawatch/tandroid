package i2;

import v7.u6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class b implements k1 {
    public boolean E;
    public u2.g0 G;
    public x2.n H;
    public final int b;
    public o1 d;
    public int e;
    public j2.k f;
    public e2.g0 h;
    public int n;
    public u2.d1 r;
    public b2.w[] s;
    public long v;
    public long w;
    public boolean y;
    public final Object a = new Object();
    public final qf.b c = new qf.b(22);
    public long x = Long.MIN_VALUE;
    public b2.o1 F = b2.o1.a;

    public b(int i10) {
        this.b = i10;
    }

    public final int B(long j10) {
        u2.d1 d1Var = this.r;
        d1Var.getClass();
        return d1Var.h(j10 - this.v);
    }

    public abstract int C(b2.w wVar);

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
    public final l d(Throwable th2, b2.w wVar, boolean z10, int i10) {
        int i11;
        if (wVar != null && !this.E) {
            this.E = true;
            try {
                i11 = C(wVar) & 7;
            } catch (l unused) {
            } finally {
                this.E = false;
            }
            return new l(1, th2, i10, j(), this.e, wVar, wVar != null ? 4 : i11, this.G, z10);
        }
        i11 = 4;
        return new l(1, th2, i10, j(), this.e, wVar, wVar != null ? 4 : i11, this.G, z10);
    }

    public long g(long j10, long j11) {
        if (this.n == 1) {
            return (m() || l()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public u0 i() {
        return null;
    }

    public abstract String j();

    public final boolean k() {
        return this.x == Long.MIN_VALUE;
    }

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j10, boolean z10, boolean z11);

    public final int w(qf.b bVar, h2.h hVar, int i10) {
        u2.d1 d1Var = this.r;
        d1Var.getClass();
        int f7 = d1Var.f(bVar, hVar, i10);
        if (f7 == -4) {
            if (hVar.isEndOfStream()) {
                this.x = Long.MIN_VALUE;
                return this.y ? -4 : -3;
            }
            long j10 = hVar.e + this.v;
            hVar.e = j10;
            this.x = Math.max(this.x, j10);
            return f7;
        }
        if (f7 == -5) {
            b2.w wVar = (b2.w) bVar.c;
            wVar.getClass();
            long j11 = wVar.x;
            if (j11 != Long.MAX_VALUE) {
                b2.v a2 = wVar.a();
                a2.w = j11 + this.v;
                bVar.c = new b2.w(a2);
            }
        }
        return f7;
    }

    public abstract void x(long j10, long j11);

    public final void y(b2.w[] wVarArr, u2.d1 d1Var, long j10, long j11, u2.g0 g0Var) {
        u6.p(!this.y);
        this.r = d1Var;
        this.G = g0Var;
        if (this.x == Long.MIN_VALUE) {
            this.x = j10;
        }
        this.s = wVarArr;
        this.v = j11;
        u(wVarArr, j10, j11, g0Var);
    }

    public final void z(long j10, boolean z10, boolean z11) {
        this.y = false;
        this.w = j10;
        this.x = j10;
        if (!z11) {
            z11 = B(j10) != 0;
        }
        p(j10, z10, z11);
    }

    public void e() {
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

    public void A(float f7, float f10) {
    }

    @Override // i2.k1
    public void c(int i10, Object obj) {
    }

    public void o(boolean z10, boolean z11) {
    }

    public void u(b2.w[] wVarArr, long j10, long j11, u2.g0 g0Var) {
    }
}
