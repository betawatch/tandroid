package g2;

import android.os.Handler;
import d2.a1;
import d2.a2;
import d2.b1;
import d2.c1;
import d2.d1;
import d2.n1;
import d2.s0;
import d2.s1;
import d2.v1;
import d2.x0;
import d2.y0;
import java.util.List;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.m51;
import wi.t0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a0 implements c1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // d2.c1
    public final /* synthetic */ void B(s1 s1Var) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void C(d2.q0 q0Var) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void E(n1 n1Var, int i3) {
        int i10 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void F(List list) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final void G(int i3, boolean z10) {
        switch (this.a) {
            case 1:
                m51 m51Var = (m51) this.b;
                if (!m51Var.I && i3 == 3) {
                    m51Var.I = true;
                    if (m51Var.H && m51Var.J) {
                        m51Var.h0();
                        break;
                    }
                }
                break;
        }
    }

    @Override // d2.c1
    public final /* synthetic */ void H(y0 y0Var) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void J(int i3, int i10) {
        int i11 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void L(d2.q0 q0Var) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void N(a1 a1Var) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final void O(b1 b1Var) {
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.b;
                ((b0) f0Var.g).a();
                ((c0) f0Var.h).a();
                ((d0) f0Var.i).a();
                ((e0) f0Var.j).a();
                break;
        }
    }

    @Override // d2.c1
    public final void P(boolean z10) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                vi.j jVar = (vi.j) this.b;
                vi.d dVar = jVar.E;
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
                t0 t0Var = (t0) this.b;
                if (t0Var.Z == 5) {
                    t0Var.y(z10);
                    break;
                }
                break;
        }
    }

    @Override // d2.c1
    public final /* synthetic */ void a(int i3) {
        int i10 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void c(int i3) {
        int i10 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void e(boolean z10) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void f(a2 a2Var) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void g(int i3) {
        int i10 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void h(boolean z10) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void i(int i3) {
        int i10 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void k(f2.c cVar) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void l(x0 x0Var) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void m(s0 s0Var) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void n(int i3, d2.n0 n0Var) {
        int i10 = this.a;
    }

    @Override // d2.c1
    public final void o(x0 x0Var) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                ((vi.j) this.b).g(x0Var);
                break;
            default:
                t0 t0Var = (t0) this.b;
                t0Var.m.b("preview player error: code=" + x0Var.a);
                t0Var.h(x0Var);
                break;
        }
    }

    @Override // d2.c1
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                t0 t0Var = (t0) this.b;
                if (t0Var.Z == 5) {
                    j40.n((j40) t0Var.d.a);
                    break;
                }
                break;
        }
    }

    @Override // d2.c1
    public final /* synthetic */ void p(boolean z10) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void q(d1 d1Var, d1 d1Var2, int i3) {
        int i10 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void r(int i3, boolean z10) {
        int i10 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void s(float f10) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void u(d2.f fVar) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final /* synthetic */ void v(v1 v1Var) {
        int i3 = this.a;
    }

    @Override // d2.c1
    public final void w(int i3) {
        k2.i0 i0Var;
        k2.i0 i0Var2;
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                vi.j jVar = (vi.j) this.b;
                if (i3 == 4 && jVar.G == 5 && (i0Var = jVar.A) != null) {
                    i0Var.Z0(5, jVar.r);
                    jVar.A.e();
                    break;
                }
                break;
            default:
                t0 t0Var = (t0) this.b;
                t0Var.m.b("preview playback state=" + i3);
                if (t0Var.Z == 5 && i3 == 4 && (i0Var2 = t0Var.V) != null) {
                    i0Var2.Z0(5, t0Var.J);
                    t0Var.V.j();
                    break;
                }
                break;
        }
    }

    @Override // d2.c1
    public final /* synthetic */ void y(boolean z10) {
        int i3 = this.a;
    }

    private final /* synthetic */ void h1() {
    }

    private final /* synthetic */ void i1() {
    }

    private final /* synthetic */ void j1() {
    }

    private final /* synthetic */ void A(int i3) {
    }

    private final /* synthetic */ void C0(y0 y0Var) {
    }

    private final /* synthetic */ void D(int i3) {
    }

    private final /* synthetic */ void D0(y0 y0Var) {
    }

    private final /* synthetic */ void E0(y0 y0Var) {
    }

    private final /* synthetic */ void E1(s1 s1Var) {
    }

    private final /* synthetic */ void F0(y0 y0Var) {
    }

    private final /* synthetic */ void F1(s1 s1Var) {
    }

    private final /* synthetic */ void G0(int i3) {
    }

    private final /* synthetic */ void G1(s1 s1Var) {
    }

    private final /* synthetic */ void H0(int i3) {
    }

    private final /* synthetic */ void H1(s1 s1Var) {
    }

    private final /* synthetic */ void I(a1 a1Var) {
    }

    private final /* synthetic */ void I0(int i3) {
    }

    private final /* synthetic */ void I1(v1 v1Var) {
    }

    private final /* synthetic */ void J0(int i3) {
    }

    private final /* synthetic */ void J1(v1 v1Var) {
    }

    private final /* synthetic */ void K(a1 a1Var) {
    }

    private final /* synthetic */ void K0(int i3) {
    }

    private final /* synthetic */ void K1(v1 v1Var) {
    }

    private final /* synthetic */ void L0(int i3) {
    }

    private final /* synthetic */ void L1(v1 v1Var) {
    }

    private final /* synthetic */ void M(a1 a1Var) {
    }

    private final /* synthetic */ void M0(x0 x0Var) {
    }

    private final /* synthetic */ void M1(a2 a2Var) {
    }

    private final /* synthetic */ void N0(x0 x0Var) {
    }

    private final /* synthetic */ void N1(a2 a2Var) {
    }

    private final /* synthetic */ void O0(x0 x0Var) {
    }

    private final /* synthetic */ void O1(a2 a2Var) {
    }

    private final /* synthetic */ void P0(x0 x0Var) {
    }

    private final /* synthetic */ void P1(a2 a2Var) {
    }

    private final /* synthetic */ void Q(a1 a1Var) {
    }

    private final /* synthetic */ void Q0(x0 x0Var) {
    }

    private final /* synthetic */ void Q1(float f10) {
    }

    private final /* synthetic */ void R(f2.c cVar) {
    }

    private final /* synthetic */ void R0(x0 x0Var) {
    }

    private final /* synthetic */ void R1(float f10) {
    }

    private final /* synthetic */ void S(List list) {
    }

    private final /* synthetic */ void S1(float f10) {
    }

    private final /* synthetic */ void T(f2.c cVar) {
    }

    private final /* synthetic */ void T1(float f10) {
    }

    private final /* synthetic */ void U(List list) {
    }

    private final /* synthetic */ void V(f2.c cVar) {
    }

    private final /* synthetic */ void V0(d2.q0 q0Var) {
    }

    private final /* synthetic */ void W(List list) {
    }

    private final /* synthetic */ void W0(d2.q0 q0Var) {
    }

    private final /* synthetic */ void X(f2.c cVar) {
    }

    private final /* synthetic */ void X0(d2.q0 q0Var) {
    }

    private final /* synthetic */ void Y(List list) {
    }

    private final /* synthetic */ void Y0(d2.q0 q0Var) {
    }

    private final /* synthetic */ void Z(b1 b1Var) {
    }

    private final /* synthetic */ void Z0(int i3) {
    }

    private final /* synthetic */ void a0(b1 b1Var) {
    }

    private final /* synthetic */ void b(d2.f fVar) {
    }

    private final /* synthetic */ void b0(b1 b1Var) {
    }

    private final /* synthetic */ void b1(int i3) {
    }

    private final /* synthetic */ void c0(boolean z10) {
    }

    private final /* synthetic */ void d(d2.f fVar) {
    }

    private final /* synthetic */ void d0(boolean z10) {
    }

    private final /* synthetic */ void d1(int i3) {
    }

    private final /* synthetic */ void e0(boolean z10) {
    }

    private final /* synthetic */ void f0(boolean z10) {
    }

    private final /* synthetic */ void f1(int i3) {
    }

    private final /* synthetic */ void g0(boolean z10) {
    }

    private final /* synthetic */ void h0(boolean z10) {
    }

    private final /* synthetic */ void i0(boolean z10) {
    }

    private final /* synthetic */ void j(d2.f fVar) {
    }

    private final /* synthetic */ void j0(boolean z10) {
    }

    private final /* synthetic */ void k0(boolean z10) {
    }

    private final /* synthetic */ void k1(int i3) {
    }

    private final /* synthetic */ void l0(boolean z10) {
    }

    private final /* synthetic */ void l1(int i3) {
    }

    private final /* synthetic */ void m1(int i3) {
    }

    private final /* synthetic */ void n1(int i3) {
    }

    private final /* synthetic */ void o1(boolean z10) {
    }

    private final /* synthetic */ void p1(boolean z10) {
    }

    private final /* synthetic */ void q0(d2.q0 q0Var) {
    }

    private final /* synthetic */ void q1(boolean z10) {
    }

    private final /* synthetic */ void r0(d2.q0 q0Var) {
    }

    private final /* synthetic */ void r1(boolean z10) {
    }

    private final /* synthetic */ void s0(d2.q0 q0Var) {
    }

    private final /* synthetic */ void s1(boolean z10) {
    }

    private final /* synthetic */ void t(d2.f fVar) {
    }

    private final /* synthetic */ void t0(d2.q0 q0Var) {
    }

    private final /* synthetic */ void t1(boolean z10) {
    }

    private final /* synthetic */ void u0(s0 s0Var) {
    }

    private final /* synthetic */ void u1(boolean z10) {
    }

    private final /* synthetic */ void v0(s0 s0Var) {
    }

    private final /* synthetic */ void v1(boolean z10) {
    }

    private final /* synthetic */ void w0(s0 s0Var) {
    }

    private final /* synthetic */ void x(int i3) {
    }

    private final /* synthetic */ void x0(s0 s0Var) {
    }

    private final /* synthetic */ void z(int i3) {
    }

    private final /* synthetic */ void A0(int i3, boolean z10) {
    }

    private final /* synthetic */ void A1(n1 n1Var, int i3) {
    }

    private final /* synthetic */ void B0(int i3, boolean z10) {
    }

    private final /* synthetic */ void B1(n1 n1Var, int i3) {
    }

    private final /* synthetic */ void C1(n1 n1Var, int i3) {
    }

    private final /* synthetic */ void D1(n1 n1Var, int i3) {
    }

    private final /* synthetic */ void S0(int i3, boolean z10) {
    }

    private final /* synthetic */ void T0(int i3, boolean z10) {
    }

    private final /* synthetic */ void U0(int i3, boolean z10) {
    }

    private final /* synthetic */ void m0(int i3, d2.n0 n0Var) {
    }

    private final /* synthetic */ void n0(int i3, d2.n0 n0Var) {
    }

    private final /* synthetic */ void o0(int i3, d2.n0 n0Var) {
    }

    private final /* synthetic */ void p0(int i3, d2.n0 n0Var) {
    }

    private final /* synthetic */ void w1(int i3, int i10) {
    }

    private final /* synthetic */ void x1(int i3, int i10) {
    }

    private final /* synthetic */ void y0(int i3, boolean z10) {
    }

    private final /* synthetic */ void y1(int i3, int i10) {
    }

    private final /* synthetic */ void z0(int i3, boolean z10) {
    }

    private final /* synthetic */ void z1(int i3, int i10) {
    }

    private final /* synthetic */ void a1(d1 d1Var, d1 d1Var2, int i3) {
    }

    private final /* synthetic */ void c1(d1 d1Var, d1 d1Var2, int i3) {
    }

    private final /* synthetic */ void e1(d1 d1Var, d1 d1Var2, int i3) {
    }

    private final /* synthetic */ void g1(d1 d1Var, d1 d1Var2, int i3) {
    }
}
