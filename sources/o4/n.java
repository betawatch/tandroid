package o4;

import j3.h2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public final void E1(t tVar) {
        s sVar = this.f;
        int i10 = h5.d0.a;
        sVar.E1(this);
    }

    @Override // o4.n0
    public final long H() {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.H();
    }

    @Override // o4.t
    public final void J(s sVar, long j10) {
        this.f = sVar;
        t tVar = this.e;
        if (tVar != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.b;
            }
            tVar.J(this, j11);
        }
    }

    @Override // o4.m0
    public final void X1(n0 n0Var) {
        s sVar = this.f;
        int i10 = h5.d0.a;
        sVar.X1(this);
    }

    @Override // o4.t
    public final long Y(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
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
        return tVar.Y(cVarArr, zArr, l0VarArr, zArr2, j11);
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
            b10.J(this, j10);
        }
    }

    @Override // o4.t
    public final long a1() {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.a1();
    }

    @Override // o4.n0
    public final boolean b() {
        t tVar = this.e;
        return tVar != null && tVar.b();
    }

    @Override // o4.t
    public final void d0() {
        t tVar = this.e;
        if (tVar != null) {
            tVar.d0();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // o4.t
    public final long j0(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.j0(j10);
    }

    @Override // o4.n0
    public final void k2(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.a;
        tVar.k2(j10);
    }

    @Override // o4.t
    public final void m0(long j10) {
        t tVar = this.e;
        int i10 = h5.d0.a;
        tVar.m0(j10);
    }

    @Override // o4.n0
    public final boolean n0(long j10) {
        t tVar = this.e;
        return tVar != null && tVar.n0(j10);
    }

    @Override // o4.t
    public final t0 o1() {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.o1();
    }

    @Override // o4.n0
    public final long y1() {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.y1();
    }

    @Override // o4.t
    public final long z(long j10, h2 h2Var) {
        t tVar = this.e;
        int i10 = h5.d0.a;
        return tVar.z(j10, h2Var);
    }
}
