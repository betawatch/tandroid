package j4;

import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j0 implements b5.t {
    public final b5.t a;
    public final i1 b;

    public j0(b5.t tVar, i1 i1Var) {
        this.a = tVar;
        this.b = i1Var;
    }

    @Override // b5.t
    public final int a(h3.t0 t0Var) {
        return this.a.a(t0Var);
    }

    @Override // b5.t
    public final i1 b() {
        return this.b;
    }

    @Override // b5.t
    public final boolean c(long j10, l4.e eVar, List list) {
        return this.a.c(j10, eVar, list);
    }

    @Override // b5.t
    public final int d() {
        return this.a.d();
    }

    @Override // b5.t
    public final boolean e(int i9, long j10) {
        return this.a.e(i9, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.a.equals(j0Var.a) && this.b.equals(j0Var.b);
    }

    @Override // b5.t
    public final boolean f(int i9, long j10) {
        return this.a.f(i9, j10);
    }

    @Override // b5.t
    public final void g(boolean z10) {
        this.a.g(z10);
    }

    @Override // b5.t
    public final h3.t0 h(int i9) {
        return this.a.h(i9);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + 527) * 31);
    }

    @Override // b5.t
    public final void i() {
        this.a.i();
    }

    @Override // b5.t
    public final int j(int i9) {
        return this.a.j(i9);
    }

    @Override // b5.t
    public final int k(long j10, List list) {
        return this.a.k(j10, list);
    }

    @Override // b5.t
    public final void l() {
        this.a.l();
    }

    @Override // b5.t
    public final int length() {
        return this.a.length();
    }

    @Override // b5.t
    public final void m(long j10, long j11, long j12, List list, l4.l[] lVarArr) {
        this.a.m(j10, j11, j12, list, lVarArr);
    }

    @Override // b5.t
    public final int n() {
        return this.a.n();
    }

    @Override // b5.t
    public final h3.t0 o() {
        return this.a.o();
    }

    @Override // b5.t
    public final int p() {
        return this.a.p();
    }

    @Override // b5.t
    public final void q(float f10) {
        this.a.q(f10);
    }

    @Override // b5.t
    public final Object r() {
        return this.a.r();
    }

    @Override // b5.t
    public final void s() {
        this.a.s();
    }

    @Override // b5.t
    public final void t() {
        this.a.t();
    }

    @Override // b5.t
    public final int u(int i9) {
        return this.a.u(i9);
    }
}
