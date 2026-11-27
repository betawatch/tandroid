// default package

import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class f37 implements e74 {
    public final e74 a;
    public final t1c b;

    public f37(e74 e74Var, t1c t1cVar) {
        this.a = e74Var;
        this.b = t1cVar;
    }

    @Override // e74
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // e74
    public final void b(long j, long j2, long j3, List list, gm6[] gm6VarArr) {
        this.a.b(j, j2, j3, list, gm6VarArr);
    }

    @Override // e74
    public final t1c c() {
        return this.b;
    }

    @Override // e74
    public final int d() {
        return this.a.d();
    }

    @Override // e74
    public final int e(ko4 ko4Var) {
        return this.a.u(this.b.a(ko4Var));
    }

    @Override // e74
    public final void enable() {
        this.a.enable();
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof f37)) {
            return this.b.equals(((f37) obj).b);
        }
        return false;
    }

    @Override // e74
    public final void f() {
        this.a.f();
    }

    @Override // e74
    public final boolean g(long j, rh2 rh2Var, List list) {
        return this.a.g(j, rh2Var, list);
    }

    @Override // e74
    public final void h(boolean z) {
        this.a.h(z);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // e74
    public final ko4 i(int i) {
        return this.b.d[this.a.j(i)];
    }

    @Override // e74
    public final int j(int i) {
        return this.a.j(i);
    }

    @Override // e74
    public final int k(long j, List list) {
        return this.a.k(j, list);
    }

    @Override // e74
    public final void l() {
        this.a.l();
    }

    @Override // e74
    public final int length() {
        return this.a.length();
    }

    @Override // e74
    public final int m() {
        return this.a.m();
    }

    @Override // e74
    public final ko4 n() {
        return this.b.d[this.a.m()];
    }

    @Override // e74
    public final int o() {
        return this.a.o();
    }

    @Override // e74
    public final boolean p(int i, long j) {
        return this.a.p(i, j);
    }

    @Override // e74
    public final void q(float f) {
        this.a.q(f);
    }

    @Override // e74
    public final Object r() {
        return this.a.r();
    }

    @Override // e74
    public final void s() {
        this.a.s();
    }

    @Override // e74
    public final void t() {
        this.a.t();
    }

    @Override // e74
    public final int u(int i) {
        return this.a.u(i);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f37) {
            return this.a.equals(((f37) obj).a);
        }
        return false;
    }
}
