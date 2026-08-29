package l4;

import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i0 implements d5.r {
    public final d5.r a;
    public final j1 b;

    public i0(d5.r rVar, j1 j1Var) {
        this.a = rVar;
        this.b = j1Var;
    }

    @Override // d5.r
    public final j1 a() {
        return this.b;
    }

    @Override // d5.r
    public final void b(long j10, long j11, long j12, List list, n4.l[] lVarArr) {
        this.a.b(j10, j11, j12, list, lVarArr);
    }

    @Override // d5.r
    public final int c() {
        return this.a.c();
    }

    @Override // d5.r
    public final boolean d(int i10, long j10) {
        return this.a.d(i10, j10);
    }

    @Override // d5.r
    public final boolean e(int i10, long j10) {
        return this.a.e(i10, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.a.equals(i0Var.a) && this.b.equals(i0Var.b);
    }

    @Override // d5.r
    public final void f(boolean z10) {
        this.a.f(z10);
    }

    @Override // d5.r
    public final j3.t0 g(int i10) {
        return this.a.g(i10);
    }

    @Override // d5.r
    public final void h() {
        this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    @Override // d5.r
    public final int i(int i10) {
        return this.a.i(i10);
    }

    @Override // d5.r
    public final int j(long j10, List list) {
        return this.a.j(j10, list);
    }

    @Override // d5.r
    public final void k() {
        this.a.k();
    }

    @Override // d5.r
    public final int l() {
        return this.a.l();
    }

    @Override // d5.r
    public final int length() {
        return this.a.length();
    }

    @Override // d5.r
    public final int m(j3.t0 t0Var) {
        return this.a.m(t0Var);
    }

    @Override // d5.r
    public final j3.t0 n() {
        return this.a.n();
    }

    @Override // d5.r
    public final int o() {
        return this.a.o();
    }

    @Override // d5.r
    public final boolean p(long j10, n4.e eVar, List list) {
        return this.a.p(j10, eVar, list);
    }

    @Override // d5.r
    public final void q(float f9) {
        this.a.q(f9);
    }

    @Override // d5.r
    public final Object r() {
        return this.a.r();
    }

    @Override // d5.r
    public final void s() {
        this.a.s();
    }

    @Override // d5.r
    public final void t() {
        this.a.t();
    }

    @Override // d5.r
    public final int u(int i10) {
        return this.a.u(i10);
    }
}
