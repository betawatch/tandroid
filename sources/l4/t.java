package l4;

import j3.j2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // l4.z
    public final long A(d5.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.h;
        if (j12 == -9223372036854775807L || j10 != this.b) {
            j11 = j10;
        } else {
            this.h = -9223372036854775807L;
            j11 = j12;
        }
        z zVar = this.e;
        int i10 = f5.d0.a;
        return zVar.A(rVarArr, zArr, c1VarArr, zArr2, j11);
    }

    @Override // l4.z
    public final long E() {
        z zVar = this.e;
        int i10 = f5.d0.a;
        return zVar.E();
    }

    @Override // l4.z
    public final k1 J() {
        z zVar = this.e;
        int i10 = f5.d0.a;
        return zVar.J();
    }

    @Override // l4.e1
    public final long L() {
        z zVar = this.e;
        int i10 = f5.d0.a;
        return zVar.L();
    }

    @Override // l4.e1
    public final void U(long j10) {
        z zVar = this.e;
        int i10 = f5.d0.a;
        zVar.U(j10);
    }

    @Override // l4.d1
    public final void a(e1 e1Var) {
        y yVar = this.f;
        int i10 = f5.d0.a;
        yVar.a(this);
    }

    @Override // l4.e1
    public final boolean b() {
        z zVar = this.e;
        return zVar != null && zVar.b();
    }

    @Override // l4.y
    public final void c(z zVar) {
        y yVar = this.f;
        int i10 = f5.d0.a;
        yVar.c(this);
    }

    public final void d(c0 c0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        z b10 = aVar.b(c0Var, this.c, j10);
        this.e = b10;
        if (this.f != null) {
            b10.n(this, j10);
        }
    }

    @Override // l4.z
    public final long f(long j10, j2 j2Var) {
        z zVar = this.e;
        int i10 = f5.d0.a;
        return zVar.f(j10, j2Var);
    }

    @Override // l4.e1
    public final long h() {
        z zVar = this.e;
        int i10 = f5.d0.a;
        return zVar.h();
    }

    @Override // l4.z
    public final void n(y yVar, long j10) {
        this.f = yVar;
        z zVar = this.e;
        if (zVar != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.b;
            }
            zVar.n(this, j11);
        }
    }

    @Override // l4.z
    public final void o() {
        z zVar = this.e;
        if (zVar != null) {
            zVar.o();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // l4.z
    public final long p(long j10) {
        z zVar = this.e;
        int i10 = f5.d0.a;
        return zVar.p(j10);
    }

    @Override // l4.z
    public final void r(long j10) {
        z zVar = this.e;
        int i10 = f5.d0.a;
        zVar.r(j10);
    }

    @Override // l4.e1
    public final boolean s(long j10) {
        z zVar = this.e;
        return zVar != null && zVar.s(j10);
    }
}
