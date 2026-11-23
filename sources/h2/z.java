package h2;

import android.os.Handler;
import e2.a1;
import e2.b1;
import e2.l1;
import e2.q0;
import e2.q1;
import e2.s1;
import e2.v0;
import e2.w0;
import e2.x1;
import e2.y0;
import e2.z0;
import java.util.List;
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.i61;
import zi.u0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class z implements a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // e2.a1
    public final /* synthetic */ void B(List list) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final void D(int i7, boolean z10) {
        switch (this.a) {
            case 1:
                i61 i61Var = (i61) this.b;
                if (!i61Var.I && i7 == 3) {
                    i61Var.I = true;
                    if (i61Var.H && i61Var.J) {
                        i61Var.h0();
                        break;
                    }
                }
                break;
        }
    }

    @Override // e2.a1
    public final /* synthetic */ void E(q1 q1Var) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final void F(z0 z0Var) {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                ((a0) e0Var.g).a();
                ((b0) e0Var.h).a();
                ((c0) e0Var.i).a();
                ((d0) e0Var.j).a();
                break;
        }
    }

    @Override // e2.a1
    public final /* synthetic */ void H(w0 w0Var) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void J(int i7, int i10) {
        int i11 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void L(l1 l1Var, int i7) {
        int i10 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void M(q0 q0Var) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void O(y0 y0Var) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final void P(boolean z10) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                yi.j jVar = (yi.j) this.b;
                yi.d dVar = jVar.E;
                Handler handler = jVar.i;
                if (jVar.u != z10) {
                    jVar.u = z10;
                    handler.removeCallbacks(dVar);
                    if (z10) {
                        handler.post(dVar);
                    }
                    jVar.f.getClass();
                    jVar.m();
                    break;
                }
                break;
            default:
                u0 u0Var = (u0) this.b;
                if (u0Var.a0 == 5) {
                    u0Var.z(z10);
                    break;
                }
                break;
        }
    }

    @Override // e2.a1
    public final /* synthetic */ void a(x1 x1Var) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void d(int i7) {
        int i10 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void e(int i7) {
        int i10 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void f(boolean z10) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void g(int i7) {
        int i10 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void h(boolean z10) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void i(int i7) {
        int i10 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void j(boolean z10) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void k(int i7, boolean z10) {
        int i10 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void l(float f10) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final void m(int i7) {
        l2.f0 f0Var;
        l2.f0 f0Var2;
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                yi.j jVar = (yi.j) this.b;
                if (i7 == 4 && jVar.G == 5 && (f0Var = jVar.A) != null) {
                    f0Var.Z0(5, jVar.r);
                    jVar.A.b();
                    break;
                }
                break;
            default:
                u0 u0Var = (u0) this.b;
                u0Var.m.b("preview playback state=" + i7);
                if (u0Var.a0 == 5 && i7 == 4 && (f0Var2 = u0Var.W) != null) {
                    f0Var2.Z0(5, u0Var.K);
                    u0Var.W.f();
                    break;
                }
                break;
        }
    }

    @Override // e2.a1
    public final /* synthetic */ void n(e2.o0 o0Var) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void o(e2.e eVar) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                u0 u0Var = (u0) this.b;
                if (u0Var.a0 == 5) {
                    b50.o((b50) u0Var.d.b);
                    break;
                }
                break;
        }
    }

    @Override // e2.a1
    public final /* synthetic */ void p(e2.o0 o0Var) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void q(v0 v0Var) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void s(b1 b1Var, b1 b1Var2, int i7) {
        int i10 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void t(boolean z10) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void u(s1 s1Var) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void v(int i7, e2.l0 l0Var) {
        int i10 = this.a;
    }

    @Override // e2.a1
    public final /* synthetic */ void x(g2.c cVar) {
        int i7 = this.a;
    }

    @Override // e2.a1
    public final void y(v0 v0Var) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                ((yi.j) this.b).g(v0Var);
                break;
            default:
                u0 u0Var = (u0) this.b;
                u0Var.m.b("preview player error: code=" + v0Var.a);
                u0Var.h(v0Var);
                break;
        }
    }

    private final /* synthetic */ void h1() {
    }

    private final /* synthetic */ void i1() {
    }

    private final /* synthetic */ void j1() {
    }

    private final /* synthetic */ void A(int i7) {
    }

    private final /* synthetic */ void C(int i7) {
    }

    private final /* synthetic */ void C0(w0 w0Var) {
    }

    private final /* synthetic */ void D0(w0 w0Var) {
    }

    private final /* synthetic */ void E0(w0 w0Var) {
    }

    private final /* synthetic */ void E1(q1 q1Var) {
    }

    private final /* synthetic */ void F0(w0 w0Var) {
    }

    private final /* synthetic */ void F1(q1 q1Var) {
    }

    private final /* synthetic */ void G(int i7) {
    }

    private final /* synthetic */ void G0(int i7) {
    }

    private final /* synthetic */ void G1(q1 q1Var) {
    }

    private final /* synthetic */ void H0(int i7) {
    }

    private final /* synthetic */ void H1(q1 q1Var) {
    }

    private final /* synthetic */ void I(y0 y0Var) {
    }

    private final /* synthetic */ void I0(int i7) {
    }

    private final /* synthetic */ void I1(s1 s1Var) {
    }

    private final /* synthetic */ void J0(int i7) {
    }

    private final /* synthetic */ void J1(s1 s1Var) {
    }

    private final /* synthetic */ void K(y0 y0Var) {
    }

    private final /* synthetic */ void K0(int i7) {
    }

    private final /* synthetic */ void K1(s1 s1Var) {
    }

    private final /* synthetic */ void L0(int i7) {
    }

    private final /* synthetic */ void L1(s1 s1Var) {
    }

    private final /* synthetic */ void M0(v0 v0Var) {
    }

    private final /* synthetic */ void M1(x1 x1Var) {
    }

    private final /* synthetic */ void N(y0 y0Var) {
    }

    private final /* synthetic */ void N0(v0 v0Var) {
    }

    private final /* synthetic */ void N1(x1 x1Var) {
    }

    private final /* synthetic */ void O0(v0 v0Var) {
    }

    private final /* synthetic */ void O1(x1 x1Var) {
    }

    private final /* synthetic */ void P0(v0 v0Var) {
    }

    private final /* synthetic */ void P1(x1 x1Var) {
    }

    private final /* synthetic */ void Q(y0 y0Var) {
    }

    private final /* synthetic */ void Q0(v0 v0Var) {
    }

    private final /* synthetic */ void Q1(float f10) {
    }

    private final /* synthetic */ void R(g2.c cVar) {
    }

    private final /* synthetic */ void R0(v0 v0Var) {
    }

    private final /* synthetic */ void R1(float f10) {
    }

    private final /* synthetic */ void S(List list) {
    }

    private final /* synthetic */ void S1(float f10) {
    }

    private final /* synthetic */ void T(g2.c cVar) {
    }

    private final /* synthetic */ void T1(float f10) {
    }

    private final /* synthetic */ void U(List list) {
    }

    private final /* synthetic */ void V(g2.c cVar) {
    }

    private final /* synthetic */ void V0(e2.o0 o0Var) {
    }

    private final /* synthetic */ void W(List list) {
    }

    private final /* synthetic */ void W0(e2.o0 o0Var) {
    }

    private final /* synthetic */ void X(g2.c cVar) {
    }

    private final /* synthetic */ void X0(e2.o0 o0Var) {
    }

    private final /* synthetic */ void Y(List list) {
    }

    private final /* synthetic */ void Y0(e2.o0 o0Var) {
    }

    private final /* synthetic */ void Z(z0 z0Var) {
    }

    private final /* synthetic */ void Z0(int i7) {
    }

    private final /* synthetic */ void a0(z0 z0Var) {
    }

    private final /* synthetic */ void b(e2.e eVar) {
    }

    private final /* synthetic */ void b0(z0 z0Var) {
    }

    private final /* synthetic */ void b1(int i7) {
    }

    private final /* synthetic */ void c(e2.e eVar) {
    }

    private final /* synthetic */ void c0(boolean z10) {
    }

    private final /* synthetic */ void d0(boolean z10) {
    }

    private final /* synthetic */ void d1(int i7) {
    }

    private final /* synthetic */ void e0(boolean z10) {
    }

    private final /* synthetic */ void f0(boolean z10) {
    }

    private final /* synthetic */ void f1(int i7) {
    }

    private final /* synthetic */ void g0(boolean z10) {
    }

    private final /* synthetic */ void h0(boolean z10) {
    }

    private final /* synthetic */ void i0(boolean z10) {
    }

    private final /* synthetic */ void j0(boolean z10) {
    }

    private final /* synthetic */ void k0(boolean z10) {
    }

    private final /* synthetic */ void k1(int i7) {
    }

    private final /* synthetic */ void l0(boolean z10) {
    }

    private final /* synthetic */ void l1(int i7) {
    }

    private final /* synthetic */ void m1(int i7) {
    }

    private final /* synthetic */ void n1(int i7) {
    }

    private final /* synthetic */ void o1(boolean z10) {
    }

    private final /* synthetic */ void p1(boolean z10) {
    }

    private final /* synthetic */ void q0(e2.o0 o0Var) {
    }

    private final /* synthetic */ void q1(boolean z10) {
    }

    private final /* synthetic */ void r(e2.e eVar) {
    }

    private final /* synthetic */ void r0(e2.o0 o0Var) {
    }

    private final /* synthetic */ void r1(boolean z10) {
    }

    private final /* synthetic */ void s0(e2.o0 o0Var) {
    }

    private final /* synthetic */ void s1(boolean z10) {
    }

    private final /* synthetic */ void t0(e2.o0 o0Var) {
    }

    private final /* synthetic */ void t1(boolean z10) {
    }

    private final /* synthetic */ void u0(q0 q0Var) {
    }

    private final /* synthetic */ void u1(boolean z10) {
    }

    private final /* synthetic */ void v0(q0 q0Var) {
    }

    private final /* synthetic */ void v1(boolean z10) {
    }

    private final /* synthetic */ void w(e2.e eVar) {
    }

    private final /* synthetic */ void w0(q0 q0Var) {
    }

    private final /* synthetic */ void x0(q0 q0Var) {
    }

    private final /* synthetic */ void z(int i7) {
    }

    private final /* synthetic */ void A0(int i7, boolean z10) {
    }

    private final /* synthetic */ void A1(l1 l1Var, int i7) {
    }

    private final /* synthetic */ void B0(int i7, boolean z10) {
    }

    private final /* synthetic */ void B1(l1 l1Var, int i7) {
    }

    private final /* synthetic */ void C1(l1 l1Var, int i7) {
    }

    private final /* synthetic */ void D1(l1 l1Var, int i7) {
    }

    private final /* synthetic */ void S0(int i7, boolean z10) {
    }

    private final /* synthetic */ void T0(int i7, boolean z10) {
    }

    private final /* synthetic */ void U0(int i7, boolean z10) {
    }

    private final /* synthetic */ void m0(int i7, e2.l0 l0Var) {
    }

    private final /* synthetic */ void n0(int i7, e2.l0 l0Var) {
    }

    private final /* synthetic */ void o0(int i7, e2.l0 l0Var) {
    }

    private final /* synthetic */ void p0(int i7, e2.l0 l0Var) {
    }

    private final /* synthetic */ void w1(int i7, int i10) {
    }

    private final /* synthetic */ void x1(int i7, int i10) {
    }

    private final /* synthetic */ void y0(int i7, boolean z10) {
    }

    private final /* synthetic */ void y1(int i7, int i10) {
    }

    private final /* synthetic */ void z0(int i7, boolean z10) {
    }

    private final /* synthetic */ void z1(int i7, int i10) {
    }

    private final /* synthetic */ void a1(b1 b1Var, b1 b1Var2, int i7) {
    }

    private final /* synthetic */ void c1(b1 b1Var, b1 b1Var2, int i7) {
    }

    private final /* synthetic */ void e1(b1 b1Var, b1 b1Var2, int i7) {
    }

    private final /* synthetic */ void g1(b1 b1Var, b1 b1Var2, int i7) {
    }
}
