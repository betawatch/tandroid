package e2;

import android.os.Handler;
import b2.b1;
import b2.b2;
import b2.c1;
import b2.d1;
import b2.e1;
import b2.o1;
import b2.p0;
import b2.s0;
import b2.u0;
import b2.u1;
import b2.w1;
import b2.y0;
import b2.z0;
import java.util.List;
import li.x0;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z implements d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // b2.d1
    public final /* synthetic */ void A(d2.d dVar) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void C(int i10, p0 p0Var) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final void D(c1 c1Var) {
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.b;
                e0Var.g.a();
                e0Var.h.a();
                e0Var.i.a();
                e0Var.j.a();
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void F(u0 u0Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final void H(y0 y0Var) {
        switch (this.a) {
            case 1:
                ((ki.k) this.b).g(y0Var);
                break;
            case 2:
                x0 x0Var = (x0) this.b;
                x0Var.m.b("preview player error: code=" + y0Var.a);
                x0Var.h(y0Var);
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void I(List list) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final void K(int i10, boolean z10) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                u61 u61Var = (u61) this.b;
                if (!u61Var.H && i10 == 3) {
                    u61Var.H = true;
                    if (u61Var.G && u61Var.I) {
                        u61Var.h0();
                        break;
                    }
                }
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void M(int i10, int i11) {
        int i12 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void N(w1 w1Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void O(o1 o1Var, int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final void P(boolean z10) {
        switch (this.a) {
            case 1:
                ki.k kVar = (ki.k) this.b;
                ki.e eVar = kVar.E;
                Handler handler = kVar.i;
                if (kVar.u != z10) {
                    kVar.u = z10;
                    handler.removeCallbacks(eVar);
                    if (z10) {
                        handler.post(eVar);
                    }
                    kVar.f.getClass();
                    kVar.m();
                    break;
                }
                break;
            case 2:
                x0 x0Var = (x0) this.b;
                if (x0Var.Z == 5) {
                    x0Var.y(z10);
                    break;
                }
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void a(int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void c(int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void d(b2 b2Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void e(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void f(int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void g(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void h(int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void i(s0 s0Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void k(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void m(s0 s0Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void o(int i10, boolean z10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 2:
                x0 x0Var = (x0) this.b;
                if (x0Var.Z == 5) {
                    d50.n((d50) x0Var.d.a);
                    break;
                }
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void p(b1 b1Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void q(float f7) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void s(e1 e1Var, e1 e1Var2, int i10) {
        int i11 = this.a;
    }

    @Override // b2.d1
    public final void u(int i10) {
        i2.i0 i0Var;
        i2.i0 i0Var2;
        switch (this.a) {
            case 1:
                ki.k kVar = (ki.k) this.b;
                if (i10 == 4 && kVar.G == 5 && (i0Var = kVar.A) != null) {
                    i0Var.Z0(5, kVar.r);
                    kVar.A.e();
                    break;
                }
                break;
            case 2:
                x0 x0Var = (x0) this.b;
                x0Var.m.b("preview playback state=" + i10);
                if (x0Var.Z == 5 && i10 == 4 && (i0Var2 = x0Var.V) != null) {
                    i0Var2.Z0(5, x0Var.J);
                    x0Var.V.j();
                    break;
                }
                break;
        }
    }

    @Override // b2.d1
    public final /* synthetic */ void v(y0 y0Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void w(u1 u1Var) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void x(boolean z10) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void y(b2.f fVar) {
        int i10 = this.a;
    }

    @Override // b2.d1
    public final /* synthetic */ void z(z0 z0Var) {
        int i10 = this.a;
    }

    private final /* synthetic */ void h1() {
    }

    private final /* synthetic */ void i1() {
    }

    private final /* synthetic */ void j1() {
    }

    private final /* synthetic */ void B(int i10) {
    }

    private final /* synthetic */ void C0(z0 z0Var) {
    }

    private final /* synthetic */ void D0(z0 z0Var) {
    }

    private final /* synthetic */ void E(int i10) {
    }

    private final /* synthetic */ void E0(z0 z0Var) {
    }

    private final /* synthetic */ void E1(u1 u1Var) {
    }

    private final /* synthetic */ void F0(z0 z0Var) {
    }

    private final /* synthetic */ void F1(u1 u1Var) {
    }

    private final /* synthetic */ void G(b1 b1Var) {
    }

    private final /* synthetic */ void G0(int i10) {
    }

    private final /* synthetic */ void G1(u1 u1Var) {
    }

    private final /* synthetic */ void H0(int i10) {
    }

    private final /* synthetic */ void H1(u1 u1Var) {
    }

    private final /* synthetic */ void I0(int i10) {
    }

    private final /* synthetic */ void I1(w1 w1Var) {
    }

    private final /* synthetic */ void J(b1 b1Var) {
    }

    private final /* synthetic */ void J0(int i10) {
    }

    private final /* synthetic */ void J1(w1 w1Var) {
    }

    private final /* synthetic */ void K0(int i10) {
    }

    private final /* synthetic */ void K1(w1 w1Var) {
    }

    private final /* synthetic */ void L(b1 b1Var) {
    }

    private final /* synthetic */ void L0(int i10) {
    }

    private final /* synthetic */ void L1(w1 w1Var) {
    }

    private final /* synthetic */ void M0(y0 y0Var) {
    }

    private final /* synthetic */ void M1(b2 b2Var) {
    }

    private final /* synthetic */ void N0(y0 y0Var) {
    }

    private final /* synthetic */ void N1(b2 b2Var) {
    }

    private final /* synthetic */ void O0(y0 y0Var) {
    }

    private final /* synthetic */ void O1(b2 b2Var) {
    }

    private final /* synthetic */ void P0(y0 y0Var) {
    }

    private final /* synthetic */ void P1(b2 b2Var) {
    }

    private final /* synthetic */ void Q(b1 b1Var) {
    }

    private final /* synthetic */ void Q0(y0 y0Var) {
    }

    private final /* synthetic */ void Q1(float f7) {
    }

    private final /* synthetic */ void R(d2.d dVar) {
    }

    private final /* synthetic */ void R0(y0 y0Var) {
    }

    private final /* synthetic */ void R1(float f7) {
    }

    private final /* synthetic */ void S(List list) {
    }

    private final /* synthetic */ void S1(float f7) {
    }

    private final /* synthetic */ void T(d2.d dVar) {
    }

    private final /* synthetic */ void T1(float f7) {
    }

    private final /* synthetic */ void U(List list) {
    }

    private final /* synthetic */ void V(d2.d dVar) {
    }

    private final /* synthetic */ void V0(s0 s0Var) {
    }

    private final /* synthetic */ void W(List list) {
    }

    private final /* synthetic */ void W0(s0 s0Var) {
    }

    private final /* synthetic */ void X(d2.d dVar) {
    }

    private final /* synthetic */ void X0(s0 s0Var) {
    }

    private final /* synthetic */ void Y(List list) {
    }

    private final /* synthetic */ void Y0(s0 s0Var) {
    }

    private final /* synthetic */ void Z(c1 c1Var) {
    }

    private final /* synthetic */ void Z0(int i10) {
    }

    private final /* synthetic */ void a0(c1 c1Var) {
    }

    private final /* synthetic */ void b(b2.f fVar) {
    }

    private final /* synthetic */ void b0(c1 c1Var) {
    }

    private final /* synthetic */ void b1(int i10) {
    }

    private final /* synthetic */ void c0(boolean z10) {
    }

    private final /* synthetic */ void d0(boolean z10) {
    }

    private final /* synthetic */ void d1(int i10) {
    }

    private final /* synthetic */ void e0(boolean z10) {
    }

    private final /* synthetic */ void f0(boolean z10) {
    }

    private final /* synthetic */ void f1(int i10) {
    }

    private final /* synthetic */ void g0(boolean z10) {
    }

    private final /* synthetic */ void h0(boolean z10) {
    }

    private final /* synthetic */ void i0(boolean z10) {
    }

    private final /* synthetic */ void j(b2.f fVar) {
    }

    private final /* synthetic */ void j0(boolean z10) {
    }

    private final /* synthetic */ void k0(boolean z10) {
    }

    private final /* synthetic */ void k1(int i10) {
    }

    private final /* synthetic */ void l(b2.f fVar) {
    }

    private final /* synthetic */ void l0(boolean z10) {
    }

    private final /* synthetic */ void l1(int i10) {
    }

    private final /* synthetic */ void m1(int i10) {
    }

    private final /* synthetic */ void n(b2.f fVar) {
    }

    private final /* synthetic */ void n1(int i10) {
    }

    private final /* synthetic */ void o1(boolean z10) {
    }

    private final /* synthetic */ void p1(boolean z10) {
    }

    private final /* synthetic */ void q0(s0 s0Var) {
    }

    private final /* synthetic */ void q1(boolean z10) {
    }

    private final /* synthetic */ void r(int i10) {
    }

    private final /* synthetic */ void r0(s0 s0Var) {
    }

    private final /* synthetic */ void r1(boolean z10) {
    }

    private final /* synthetic */ void s0(s0 s0Var) {
    }

    private final /* synthetic */ void s1(boolean z10) {
    }

    private final /* synthetic */ void t(int i10) {
    }

    private final /* synthetic */ void t0(s0 s0Var) {
    }

    private final /* synthetic */ void t1(boolean z10) {
    }

    private final /* synthetic */ void u0(u0 u0Var) {
    }

    private final /* synthetic */ void u1(boolean z10) {
    }

    private final /* synthetic */ void v0(u0 u0Var) {
    }

    private final /* synthetic */ void v1(boolean z10) {
    }

    private final /* synthetic */ void w0(u0 u0Var) {
    }

    private final /* synthetic */ void x0(u0 u0Var) {
    }

    private final /* synthetic */ void A0(int i10, boolean z10) {
    }

    private final /* synthetic */ void A1(o1 o1Var, int i10) {
    }

    private final /* synthetic */ void B0(int i10, boolean z10) {
    }

    private final /* synthetic */ void B1(o1 o1Var, int i10) {
    }

    private final /* synthetic */ void C1(o1 o1Var, int i10) {
    }

    private final /* synthetic */ void D1(o1 o1Var, int i10) {
    }

    private final /* synthetic */ void S0(int i10, boolean z10) {
    }

    private final /* synthetic */ void T0(int i10, boolean z10) {
    }

    private final /* synthetic */ void U0(int i10, boolean z10) {
    }

    private final /* synthetic */ void m0(int i10, p0 p0Var) {
    }

    private final /* synthetic */ void n0(int i10, p0 p0Var) {
    }

    private final /* synthetic */ void o0(int i10, p0 p0Var) {
    }

    private final /* synthetic */ void p0(int i10, p0 p0Var) {
    }

    private final /* synthetic */ void w1(int i10, int i11) {
    }

    private final /* synthetic */ void x1(int i10, int i11) {
    }

    private final /* synthetic */ void y0(int i10, boolean z10) {
    }

    private final /* synthetic */ void y1(int i10, int i11) {
    }

    private final /* synthetic */ void z0(int i10, boolean z10) {
    }

    private final /* synthetic */ void z1(int i10, int i11) {
    }

    private final /* synthetic */ void a1(e1 e1Var, e1 e1Var2, int i10) {
    }

    private final /* synthetic */ void c1(e1 e1Var, e1 e1Var2, int i10) {
    }

    private final /* synthetic */ void e1(e1 e1Var, e1 e1Var2, int i10) {
    }

    private final /* synthetic */ void g1(e1 e1Var, e1 e1Var2, int i10) {
    }
}
