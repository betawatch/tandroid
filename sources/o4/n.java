package o4;

import j3.h2;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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

    @Override // o4.s
    public final void a(t tVar) {
        s sVar = this.f;
        int i10 = h5.d0.a;
        sVar.a(this);
    }

    @Override // o4.n0
    public final boolean b() {
        t tVar = this.e;
        return tVar != null && tVar.b();
    }

    public final void c(v vVar) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        t b10 = aVar.b(vVar, this.c, j10);
        this.e = b10;
        if (this.f != null) {
            b10.f(this, j10);
        }
    }

    @Override // o4.t
    public final long d(long j10, h2 h2Var) {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.d(j10, h2Var);
    }

    @Override // o4.n0
    public final long e() {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.e();
    }

    @Override // o4.t
    public final void f(s sVar, long j10) {
        this.f = sVar;
        t tVar = this.e;
        if (tVar != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.b;
            }
            tVar.f(this, j11);
        }
    }

    @Override // o4.t
    public final long g(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
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
        return tVar.g(cVarArr, zArr, l0VarArr, zArr2, j11);
    }

    @Override // o4.t
    public final void i() {
        t tVar = this.e;
        if (tVar != null) {
            tVar.i();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // o4.t
    public final long j(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.j(j10);
    }

    @Override // o4.t
    public final void k(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.a;
        tVar.k(j10);
    }

    @Override // o4.n0
    public final boolean m(long j10) {
        t tVar = this.e;
        return tVar != null && tVar.m(j10);
    }

    @Override // o4.t
    public final long n() {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.n();
    }

    @Override // o4.t
    public final t0 o() {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.o();
    }

    @Override // o4.n0
    public final long r() {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.r();
    }

    @Override // o4.m0
    public final void s(n0 n0Var) {
        s sVar = this.f;
        int i10 = h5.d0.a;
        sVar.s(this);
    }

    @Override // o4.n0
    public final void t(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.a;
        tVar.t(j10);
    }
}
