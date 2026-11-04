package l2;

import ai.n;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import b8.zb;
import d2.a1;
import d2.a2;
import d2.b1;
import d2.c1;
import d2.d1;
import d2.e1;
import d2.k1;
import d2.m1;
import d2.n1;
import d2.q0;
import d2.s0;
import d2.v1;
import d2.x0;
import d2.y0;
import ei.y8;
import g2.h0;
import g2.j0;
import g2.n0;
import g2.p;
import g2.s;
import g9.g0;
import g9.i0;
import g9.s1;
import g9.x1;
import ii.y3;
import java.io.IOException;
import java.util.List;
import k2.b0;
import k2.l;
import k2.q;
import k2.z;
import w2.c0;
import w2.k0;
import w2.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f implements c1, k0, p2.k {
    public final h0 a;
    public final k1 b;
    public final m1 c;
    public final e d;
    public final SparseArray e;
    public s f;
    public e1 h;
    public j0 n;
    public boolean r;

    public f(h0 h0Var) {
        h0Var.getClass();
        this.a = h0Var;
        String str = n0.a;
        Looper myLooper = Looper.myLooper();
        this.f = new s((myLooper == null ? Looper.getMainLooper() : myLooper).getThread());
        k1 k1Var = new k1();
        this.b = k1Var;
        this.c = new m1();
        e eVar = new e();
        eVar.a = k1Var;
        g0 g0Var = i0.b;
        eVar.b = s1.e;
        eVar.c = x1.h;
        this.d = eVar;
        this.e = new SparseArray();
    }

    @Override // p2.k
    public final void A(int i3, w2.g0 g0Var, Exception exc) {
        a T = T(i3, g0Var);
        V(T, 1024, new c(T, exc, 17));
    }

    @Override // d2.c1
    public final void B(d2.s1 s1Var) {
        a Q = Q();
        V(Q, 19, new c(Q, s1Var, 28));
    }

    @Override // d2.c1
    public final void C(q0 q0Var) {
        a Q = Q();
        V(Q, 15, new d(Q, q0Var, 5));
    }

    @Override // w2.k0
    public final void D(int i3, w2.g0 g0Var, c0 c0Var) {
        a T = T(i3, g0Var);
        V(T, 1005, new c(T, c0Var, 25));
    }

    @Override // d2.c1
    public final void E(n1 n1Var, int i3) {
        e1 e1Var = this.h;
        e1Var.getClass();
        e eVar = this.d;
        eVar.d = e.g(e1Var, (i0) eVar.b, (w2.g0) eVar.e, (k1) eVar.a);
        eVar.u(e1Var.y0());
        a Q = Q();
        V(Q, 0, new d(Q, i3));
    }

    @Override // d2.c1
    public final void F(List list) {
        a Q = Q();
        V(Q, 27, new z(Q, list));
    }

    @Override // d2.c1
    public final void G(int i3, boolean z10) {
        a Q = Q();
        V(Q, -1, new y3(i3, 20, Q, z10));
    }

    @Override // d2.c1
    public final void H(y0 y0Var) {
        a Q = Q();
        V(Q, 12, new y3(Q, y0Var, 18));
    }

    @Override // p2.k
    public final void I(int i3, w2.g0 g0Var) {
        a T = T(i3, g0Var);
        V(T, 1025, new d(T));
    }

    @Override // d2.c1
    public final void J(int i3, int i10) {
        a U = U();
        V(U, 24, new c(U, i3, i10));
    }

    @Override // w2.k0
    public final void K(int i3, w2.g0 g0Var, u uVar, c0 c0Var, int i10) {
        a T = T(i3, g0Var);
        V(T, 1000, new c(T, uVar, c0Var, i10));
    }

    @Override // d2.c1
    public final void L(q0 q0Var) {
        a Q = Q();
        V(Q, 14, new c(Q, q0Var, 11));
    }

    @Override // p2.k
    public final void M(int i3, w2.g0 g0Var, int i10) {
        a T = T(i3, g0Var);
        V(T, 1022, new c(T, i10, 16, (char) 0));
    }

    @Override // d2.c1
    public final void N(a1 a1Var) {
        a Q = Q();
        V(Q, 13, new d(Q, a1Var, 8));
    }

    @Override // d2.c1
    public final void P(boolean z10) {
        a Q = Q();
        V(Q, 7, new y3(Q, z10));
    }

    public final a Q() {
        return S((w2.g0) this.d.d);
    }

    public final a R(n1 n1Var, int i3, w2.g0 g0Var) {
        w2.g0 g0Var2 = n1Var.p() ? null : g0Var;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z10 = n1Var.equals(this.h.y0()) && i3 == this.h.l0();
        long j10 = 0;
        if (g0Var2 == null || !g0Var2.b()) {
            if (z10) {
                j10 = this.h.Y();
            } else if (!n1Var.p()) {
                j10 = n0.h0(n1Var.m(i3, this.c, 0L).l);
            }
        } else if (z10 && this.h.k0() == g0Var2.b && this.h.M() == g0Var2.c) {
            j10 = this.h.N0();
        }
        return new a(elapsedRealtime, n1Var, i3, g0Var2, j10, this.h.y0(), this.h.l0(), (w2.g0) this.d.d, this.h.N0(), this.h.q());
    }

    public final a S(w2.g0 g0Var) {
        this.h.getClass();
        n1 n1Var = g0Var == null ? null : (n1) ((x1) this.d.c).get(g0Var);
        if (g0Var != null && n1Var != null) {
            return R(n1Var, n1Var.g(g0Var.a, this.b).c, g0Var);
        }
        int l02 = this.h.l0();
        n1 y02 = this.h.y0();
        if (l02 >= y02.o()) {
            y02 = n1.a;
        }
        return R(y02, l02, null);
    }

    public final a T(int i3, w2.g0 g0Var) {
        this.h.getClass();
        if (g0Var != null) {
            return ((n1) ((x1) this.d.c).get(g0Var)) != null ? S(g0Var) : R(n1.a, i3, g0Var);
        }
        n1 y02 = this.h.y0();
        if (i3 >= y02.o()) {
            y02 = n1.a;
        }
        return R(y02, i3, null);
    }

    public final a U() {
        return S((w2.g0) this.d.f);
    }

    public final void V(a aVar, int i3, p pVar) {
        this.e.put(i3, aVar);
        this.f.e(i3, pVar);
    }

    public final void W(k2.i0 i0Var, Looper looper) {
        zb.p(this.h == null || ((i0) this.d.b).isEmpty());
        i0Var.getClass();
        this.h = i0Var;
        this.n = this.a.a(looper, null);
        s sVar = this.f;
        n nVar = new n(22, this, i0Var);
        sVar.getClass();
        h0 h0Var = this.a;
        zb.p(h0Var != null);
        this.f = new s(sVar.d, looper, looper.getThread(), h0Var, nVar, sVar.i);
    }

    @Override // d2.c1
    public final void a(int i3) {
        a U = U();
        V(U, 21, new c(U, i3, 21, (char) 0));
    }

    @Override // p2.k
    public final void b(int i3, w2.g0 g0Var) {
        a T = T(i3, g0Var);
        V(T, 1027, new c(T, 26));
    }

    @Override // d2.c1
    public final void c(int i3) {
        a Q = Q();
        V(Q, 8, new c(Q, i3, 3, (char) 0));
    }

    @Override // w2.k0
    public final void d(int i3, w2.g0 g0Var, c0 c0Var) {
        a T = T(i3, g0Var);
        V(T, 1004, new n(23, T, c0Var));
    }

    @Override // d2.c1
    public final void e(boolean z10) {
        a U = U();
        V(U, 23, new c(U, z10, 29));
    }

    @Override // d2.c1
    public final void f(a2 a2Var) {
        a U = U();
        V(U, 25, new b0(U, a2Var));
    }

    @Override // d2.c1
    public final void g(int i3) {
        a Q = Q();
        V(Q, 6, new y3(Q, i3));
    }

    @Override // w2.k0
    public final void j(int i3, w2.g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        a T = T(i3, g0Var);
        V(T, 1003, new y8(T, uVar, c0Var, iOException, z10));
    }

    @Override // d2.c1
    public final void k(f2.c cVar) {
        a Q = Q();
        V(Q, 27, new c(Q, cVar, 4));
    }

    @Override // d2.c1
    public final void l(x0 x0Var) {
        w2.g0 g0Var;
        a Q = (!(x0Var instanceof l) || (g0Var = ((l) x0Var).F) == null) ? Q() : S(g0Var);
        V(Q, 10, new y3(Q, x0Var, 27));
    }

    @Override // d2.c1
    public final void m(s0 s0Var) {
        a Q = Q();
        V(Q, 28, new y3(Q, s0Var, 22));
    }

    @Override // d2.c1
    public final void n(int i3, d2.n0 n0Var) {
        a Q = Q();
        V(Q, 1, new d(Q, n0Var, i3));
    }

    @Override // d2.c1
    public final void o(x0 x0Var) {
        w2.g0 g0Var;
        a Q = (!(x0Var instanceof l) || (g0Var = ((l) x0Var).F) == null) ? Q() : S(g0Var);
        V(Q, 10, new y8(Q, x0Var, 24));
    }

    @Override // d2.c1
    public final void p(boolean z10) {
        a Q = Q();
        V(Q, 3, new c(Q, z10, 22));
    }

    @Override // d2.c1
    public final void q(d1 d1Var, d1 d1Var2, int i3) {
        if (i3 == 1) {
            this.r = false;
        }
        e1 e1Var = this.h;
        e1Var.getClass();
        e eVar = this.d;
        eVar.d = e.g(e1Var, (i0) eVar.b, (w2.g0) eVar.e, (k1) eVar.a);
        a Q = Q();
        V(Q, 11, new q(Q, i3, d1Var, d1Var2));
    }

    @Override // d2.c1
    public final void r(int i3, boolean z10) {
        a Q = Q();
        V(Q, 5, new y3(i3, 29, Q, z10));
    }

    @Override // d2.c1
    public final void s(float f10) {
        a U = U();
        V(U, 22, new d(U, f10));
    }

    @Override // w2.k0
    public final void t(int i3, w2.g0 g0Var, u uVar, c0 c0Var) {
        a T = T(i3, g0Var);
        V(T, 1001, new c(T, (Object) uVar, (Object) c0Var, 18));
    }

    @Override // d2.c1
    public final void u(d2.f fVar) {
        a U = U();
        V(U, 20, new y3(U, fVar, 21));
    }

    @Override // d2.c1
    public final void v(v1 v1Var) {
        a Q = Q();
        V(Q, 2, new y3(Q, v1Var, 28));
    }

    @Override // d2.c1
    public final void w(int i3) {
        a Q = Q();
        V(Q, 4, new c(Q, i3, 2, (char) 0));
    }

    @Override // p2.k
    public final void x(int i3, w2.g0 g0Var, v7.s sVar) {
        a T = T(i3, g0Var);
        V(T, 1023, new d(T, sVar, 3));
    }

    @Override // d2.c1
    public final void y(boolean z10) {
        a Q = Q();
        V(Q, 9, new d(Q, z10));
    }

    @Override // w2.k0
    public final void z(int i3, w2.g0 g0Var, u uVar, c0 c0Var) {
        a T = T(i3, g0Var);
        V(T, 1002, new c(T, (Object) uVar, (Object) c0Var, 14));
    }

    @Override // d2.c1
    public final void onRenderedFirstFrame() {
    }

    @Override // d2.c1
    public final void O(b1 b1Var) {
    }

    @Override // d2.c1
    public final void h(boolean z10) {
    }

    @Override // d2.c1
    public final void i(int i3) {
    }
}
