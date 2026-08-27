package j4;

import h3.j2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t implements z, y {
    public final c0 a;
    public final long b;
    public final com.google.android.exoplayer2.upstream.r c;
    public a d;
    public z e;
    public y f;
    public long h = -9223372036854775807L;

    public t(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        this.a = c0Var;
        this.c = rVar;
        this.b = j10;
    }

    @Override // j4.z
    public final long B(long j10, j2 j2Var) {
        z zVar = this.e;
        int i10 = d5.g0.a;
        return zVar.B(j10, j2Var);
    }

    @Override // j4.d1
    public final long D() {
        z zVar = this.e;
        int i10 = d5.g0.a;
        return zVar.D();
    }

    @Override // j4.z
    public final void E(y yVar, long j10) {
        this.f = yVar;
        z zVar = this.e;
        if (zVar != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.b;
            }
            zVar.E(this, j11);
        }
    }

    @Override // j4.z
    public final long F(b5.s[] sVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 == -9223372036854775807L || j10 != this.b) {
            j11 = j10;
        } else {
            this.h = -9223372036854775807L;
            j11 = j12;
        }
        z zVar = this.e;
        int i10 = d5.g0.a;
        return zVar.F(sVarArr, zArr, b1VarArr, zArr2, j11);
    }

    @Override // j4.d1
    public final void I(long j10) {
        z zVar = this.e;
        int i10 = d5.g0.a;
        zVar.I(j10);
    }

    @Override // j4.c1
    public final void a(d1 d1Var) {
        y yVar = this.f;
        int i10 = d5.g0.a;
        yVar.a(this);
    }

    @Override // j4.d1
    public final boolean b() {
        z zVar = this.e;
        return zVar != null && zVar.b();
    }

    public final void c(c0 c0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        z b10 = aVar.b(c0Var, this.c, j10);
        this.e = b10;
        if (this.f != null) {
            b10.E(this, j10);
        }
    }

    @Override // j4.y
    public final void e(z zVar) {
        y yVar = this.f;
        int i10 = d5.g0.a;
        yVar.e(this);
    }

    @Override // j4.d1
    public final long g() {
        z zVar = this.e;
        int i10 = d5.g0.a;
        return zVar.g();
    }

    @Override // j4.z
    public final void m() {
        z zVar = this.e;
        if (zVar != null) {
            zVar.m();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // j4.z
    public final long o(long j10) {
        z zVar = this.e;
        int i10 = d5.g0.a;
        return zVar.o(j10);
    }

    @Override // j4.z
    public final void p(long j10) {
        z zVar = this.e;
        int i10 = d5.g0.a;
        zVar.p(j10);
    }

    @Override // j4.d1
    public final boolean q(long j10) {
        z zVar = this.e;
        return zVar != null && zVar.q(j10);
    }

    @Override // j4.z
    public final long w() {
        z zVar = this.e;
        int i10 = d5.g0.a;
        return zVar.w();
    }

    @Override // j4.z
    public final j1 z() {
        z zVar = this.e;
        int i10 = d5.g0.a;
        return zVar.z();
    }
}
