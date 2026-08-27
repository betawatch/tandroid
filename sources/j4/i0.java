package j4;

import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i0 implements b5.s {
    public final b5.s a;
    public final i1 b;

    public i0(b5.s sVar, i1 i1Var) {
        this.a = sVar;
        this.b = i1Var;
    }

    @Override // b5.s
    public final int a(h3.t0 t0Var) {
        return this.a.a(t0Var);
    }

    @Override // b5.s
    public final i1 b() {
        return this.b;
    }

    @Override // b5.s
    public final boolean c(long j10, l4.e eVar, List list) {
        return this.a.c(j10, eVar, list);
    }

    @Override // b5.s
    public final int d() {
        return this.a.d();
    }

    @Override // b5.s
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

    @Override // b5.s
    public final boolean f(int i10, long j10) {
        return this.a.f(i10, j10);
    }

    @Override // b5.s
    public final void g(boolean z10) {
        this.a.g(z10);
    }

    @Override // b5.s
    public final h3.t0 h(int i10) {
        return this.a.h(i10);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    @Override // b5.s
    public final void i() {
        this.a.i();
    }

    @Override // b5.s
    public final int j(int i10) {
        return this.a.j(i10);
    }

    @Override // b5.s
    public final int k(long j10, List list) {
        return this.a.k(j10, list);
    }

    @Override // b5.s
    public final void l() {
        this.a.l();
    }

    @Override // b5.s
    public final int length() {
        return this.a.length();
    }

    @Override // b5.s
    public final void m(long j10, long j11, long j12, List list, l4.l[] lVarArr) {
        this.a.m(j10, j11, j12, list, lVarArr);
    }

    @Override // b5.s
    public final int n() {
        return this.a.n();
    }

    @Override // b5.s
    public final h3.t0 o() {
        return this.a.o();
    }

    @Override // b5.s
    public final int p() {
        return this.a.p();
    }

    @Override // b5.s
    public final void q(float f10) {
        this.a.q(f10);
    }

    @Override // b5.s
    public final Object r() {
        return this.a.r();
    }

    @Override // b5.s
    public final void s() {
        this.a.s();
    }

    @Override // b5.s
    public final void t() {
        this.a.t();
    }

    @Override // b5.s
    public final int u(int i10) {
        return this.a.u(i10);
    }
}
