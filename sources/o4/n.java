package o4;

import j3.h2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n implements t, s {
    public final v a;
    public final long b;
    public final g5.q c;
    public a d;
    public t e;
    public s f;
    public long h = -9223372036854775807L;

    public n(v vVar, g5.q qVar, long j10) {
        this.a = vVar;
        this.c = qVar;
        this.b = j10;
    }

    @Override // o4.t
    public final void B(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.a;
        tVar.B(j10);
    }

    @Override // o4.n0
    public final boolean C(long j10) {
        t tVar = this.e;
        return tVar != null && tVar.C(j10);
    }

    @Override // o4.t
    public final long K() {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.K();
    }

    @Override // o4.t
    public final t0 V() {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.V();
    }

    @Override // o4.n0
    public final long X() {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.X();
    }

    @Override // o4.m0
    public final void Z(n0 n0Var) {
        s sVar = this.f;
        int i10 = h5.d0.a;
        sVar.Z(this);
    }

    public final void a(v vVar) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        t b10 = aVar.b(vVar, this.c, j10);
        this.e = b10;
        if (this.f != null) {
            b10.p(this, j10);
        }
    }

    @Override // o4.n0
    public final boolean b() {
        t tVar = this.e;
        return tVar != null && tVar.b();
    }

    @Override // o4.n0
    public final void f0(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.a;
        tVar.f0(j10);
    }

    @Override // o4.t
    public final long h(long j10, h2 h2Var) {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.h(j10, h2Var);
    }

    @Override // o4.n0
    public final long l() {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.l();
    }

    @Override // o4.s
    public final void n(t tVar) {
        s sVar = this.f;
        int i10 = h5.d0.a;
        sVar.n(this);
    }

    @Override // o4.t
    public final void p(s sVar, long j10) {
        this.f = sVar;
        t tVar = this.e;
        if (tVar != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.b;
            }
            tVar.p(this, j11);
        }
    }

    @Override // o4.t
    public final long v(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 == -9223372036854775807L || j10 != this.b) {
            j11 = j10;
        } else {
            this.h = -9223372036854775807L;
            j11 = j12;
        }
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.v(cVarArr, zArr, l0VarArr, zArr2, j11);
    }

    @Override // o4.t
    public final void x() {
        t tVar = this.e;
        if (tVar != null) {
            tVar.x();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // o4.t
    public final long z(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.z(j10);
    }
}
