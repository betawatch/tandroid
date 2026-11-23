package l2;

import a8.ma;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class b implements j1 {
    public boolean E;
    public boolean F;
    public x2.g0 H;
    public a3.s I;
    public final int b;
    public n1 d;
    public int e;
    public m2.i f;
    public h2.g0 h;
    public int n;
    public x2.d1 r;
    public e2.u[] s;
    public long w;
    public long x;
    public final Object a = new Object();
    public final jb.m c = new jb.m(2, false);
    public long y = Long.MIN_VALUE;
    public e2.l1 G = e2.l1.a;

    public b(int i7) {
        this.b = i7;
    }

    public final int B(long j3) {
        x2.d1 d1Var = this.r;
        d1Var.getClass();
        return d1Var.o(j3 - this.w);
    }

    public abstract int C(e2.u uVar);

    public int D() {
        return 0;
    }

    public boolean E(long j3) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m d(Throwable th2, e2.u uVar, boolean z10, int i7) {
        int i10;
        if (uVar != null && !this.F) {
            this.F = true;
            try {
                i10 = C(uVar) & 7;
            } catch (m unused) {
            } finally {
                this.F = false;
            }
            return new m(1, th2, i7, i(), this.e, uVar, uVar != null ? 4 : i10, this.H, z10);
        }
        i10 = 4;
        return new m(1, th2, i7, i(), this.e, uVar, uVar != null ? 4 : i10, this.H, z10);
    }

    public long g(long j3, long j10) {
        if (this.n == 1) {
            return (m() || k()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public u0 h() {
        return null;
    }

    public abstract String i();

    public final boolean j() {
        return this.y == Long.MIN_VALUE;
    }

    public abstract boolean k();

    public abstract boolean m();

    public abstract void n();

    public abstract void p(long j3, boolean z10, boolean z11);

    public final int w(jb.m mVar, k2.h hVar, int i7) {
        x2.d1 d1Var = this.r;
        d1Var.getClass();
        int b10 = d1Var.b(mVar, hVar, i7);
        if (b10 == -4) {
            if (hVar.isEndOfStream()) {
                this.y = Long.MIN_VALUE;
                return this.E ? -4 : -3;
            }
            long j3 = hVar.e + this.w;
            hVar.e = j3;
            this.y = Math.max(this.y, j3);
            return b10;
        }
        if (b10 == -5) {
            e2.u uVar = (e2.u) mVar.c;
            uVar.getClass();
            long j10 = uVar.x;
            if (j10 != Long.MAX_VALUE) {
                e2.t a10 = uVar.a();
                a10.w = j10 + this.w;
                mVar.c = new e2.u(a10);
            }
        }
        return b10;
    }

    public abstract void x(long j3, long j10);

    public final void y(e2.u[] uVarArr, x2.d1 d1Var, long j3, long j10, x2.g0 g0Var) {
        ma.p(!this.E);
        this.r = d1Var;
        this.H = g0Var;
        if (this.y == Long.MIN_VALUE) {
            this.y = j3;
        }
        this.s = uVarArr;
        this.w = j10;
        u(uVarArr, j3, j10, g0Var);
    }

    public final void z(long j3, boolean z10, boolean z11) {
        this.E = false;
        this.x = j3;
        this.y = j3;
        if (!z11) {
            z11 = B(j3) != 0;
        }
        p(j3, z10, z11);
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

    @Override // l2.j1
    public void c(int i7, Object obj) {
    }

    public void o(boolean z10, boolean z11) {
    }

    public void u(e2.u[] uVarArr, long j3, long j10, x2.g0 g0Var) {
    }
}
