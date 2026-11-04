package o4;

import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import b8.zb;
import d2.a2;
import d2.v1;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l1 implements d2.e1 {
    public final d2.e1 a;
    public final IdentityHashMap b = new IdentityHashMap();

    public l1(d2.e1 e1Var) {
        this.a = e1Var;
    }

    @Override // d2.e1
    public final long A() {
        V0();
        return this.a.A();
    }

    @Override // d2.e1
    public final void A0(d2.f fVar, boolean z10) {
        this.a.A0(fVar, z10);
    }

    @Override // d2.e1
    public final int B() {
        V0();
        return this.a.B();
    }

    @Override // d2.e1
    public final Looper B0() {
        return this.a.B0();
    }

    @Override // d2.e1
    public final a2 C() {
        V0();
        return this.a.C();
    }

    @Override // d2.e1
    public final void C0() {
        V0();
        this.a.C0();
    }

    @Override // d2.e1
    public final void D() {
        V0();
        this.a.D();
    }

    @Override // d2.e1
    public final void D0() {
        V0();
        this.a.D0();
    }

    @Override // d2.e1
    public final float E() {
        V0();
        return this.a.E();
    }

    @Override // d2.e1
    public final boolean E0() {
        V0();
        return this.a.E0();
    }

    @Override // d2.e1
    public final void F() {
        V0();
        this.a.F();
    }

    @Override // d2.e1
    public final d2.s1 F0() {
        V0();
        return this.a.F0();
    }

    @Override // d2.e1
    public final d2.f G() {
        V0();
        return this.a.G();
    }

    @Override // d2.e1
    public final long G0() {
        V0();
        return this.a.G0();
    }

    @Override // d2.e1
    public final void H(int i3, boolean z10) {
        V0();
        this.a.H(i3, z10);
    }

    @Override // d2.e1
    public final void H0(int i3) {
        V0();
        this.a.H0(i3);
    }

    @Override // d2.e1
    public final d2.p I() {
        V0();
        return this.a.I();
    }

    @Override // d2.e1
    public final void I0() {
        V0();
        this.a.I0();
    }

    @Override // d2.e1
    public final void J() {
        V0();
        this.a.J();
    }

    @Override // d2.e1
    public final void J0() {
        V0();
        this.a.J0();
    }

    @Override // d2.e1
    public final void K(int i3, int i10) {
        V0();
        this.a.K(i3, i10);
    }

    @Override // d2.e1
    public final void K0() {
        V0();
        this.a.K0();
    }

    @Override // d2.e1
    public final void L(int i3) {
        V0();
        this.a.L(i3);
    }

    @Override // d2.e1
    public final d2.q0 L0() {
        V0();
        return this.a.L0();
    }

    @Override // d2.e1
    public final int M() {
        V0();
        return this.a.M();
    }

    @Override // d2.e1
    public final void M0(List list) {
        V0();
        this.a.M0(list);
    }

    @Override // d2.e1
    public final boolean N() {
        return this.a.N();
    }

    @Override // d2.e1
    public final long N0() {
        V0();
        return this.a.N0();
    }

    @Override // d2.e1
    public final void O(int i3) {
        V0();
        this.a.O(i3);
    }

    @Override // d2.e1
    public final long O0() {
        V0();
        return this.a.O0();
    }

    @Override // d2.e1
    public final void P(int i3, int i10) {
        V0();
        this.a.P(i3, i10);
    }

    @Override // d2.e1
    public final boolean P0() {
        V0();
        return this.a.P0();
    }

    @Override // d2.e1
    public final void Q(SurfaceHolder surfaceHolder) {
        V0();
        this.a.Q(surfaceHolder);
    }

    public final d2.d1 Q0() {
        boolean m0 = m0(16);
        boolean m02 = m0(17);
        int l02 = m02 ? l0() : 0;
        zb.p(l02 >= 0);
        int B = m02 ? B() : 0;
        zb.p(B >= 0);
        if (m02) {
            d2.n1 y02 = y0();
            if (!y02.p()) {
                zb.p(l02 < y02.o());
                d2.m1 m10 = y02.m(l02, new d2.m1(), 0L);
                zb.p(B == g2.n0.i(B, m10.n, m10.o));
            }
        }
        long j10 = 0;
        d2.n0 w10 = m0 ? w() : null;
        long N0 = m0 ? N0() : 0L;
        if (m0) {
            j10 = Y();
        }
        return new d2.d1(null, l02, w10, null, B, N0, j10, m0 ? k0() : -1, m0 ? M() : -1);
    }

    @Override // d2.e1
    public final void R(float f10) {
        V0();
        this.a.R(f10);
    }

    public final q1 R0() {
        boolean m0 = m0(16);
        return new q1(Q0(), m0 && n(), SystemClock.elapsedRealtime(), m0 ? getDuration() : -9223372036854775807L, m0 ? b0() : 0L, m0 ? y() : 0, m0 ? q() : 0L, m0 ? p() : -9223372036854775807L, m0 ? A() : -9223372036854775807L, m0 ? G0() : 0L);
    }

    @Override // d2.e1
    public final void S() {
        V0();
        this.a.S();
    }

    public final d2.n0 S0() {
        if (m0(16)) {
            return w();
        }
        return null;
    }

    @Override // d2.e1
    public final void T(List list, int i3, long j10) {
        V0();
        this.a.T(list, i3, j10);
    }

    public final d2.n1 T0() {
        return m0(17) ? y0() : S0() != null ? new k1(this) : d2.n1.a;
    }

    @Override // d2.e1
    public final d2.x0 U() {
        V0();
        return this.a.U();
    }

    public final d2.q0 U0() {
        return m0(18) ? L0() : d2.q0.L;
    }

    @Override // d2.e1
    public final void V(boolean z10) {
        V0();
        this.a.V(z10);
    }

    public final void V0() {
        zb.p(Looper.myLooper() == this.a.B0());
    }

    @Override // d2.e1
    public final void W(int i3) {
        V0();
        this.a.W(i3);
    }

    @Override // d2.e1
    public final long X() {
        V0();
        return this.a.X();
    }

    @Override // d2.e1
    public final long Y() {
        V0();
        return this.a.Y();
    }

    @Override // d2.e1
    public final void Z(int i3, List list) {
        V0();
        this.a.Z(i3, list);
    }

    @Override // d2.e1
    public final void a() {
        V0();
        this.a.a();
    }

    @Override // d2.e1
    public final void a0() {
        V0();
        this.a.a0();
    }

    @Override // d2.e1
    public final void b(float f10) {
        V0();
        this.a.b(f10);
    }

    @Override // d2.e1
    public final long b0() {
        V0();
        return this.a.b0();
    }

    @Override // d2.e1
    public final void c(d2.y0 y0Var) {
        V0();
        this.a.c(y0Var);
    }

    @Override // d2.e1
    public final boolean c0() {
        V0();
        return this.a.c0();
    }

    @Override // d2.e1
    public final boolean d() {
        V0();
        return this.a.d();
    }

    @Override // d2.e1
    public final void d0() {
        V0();
        this.a.d0();
    }

    @Override // d2.e1
    public final void e() {
        V0();
        this.a.e();
    }

    @Override // d2.e1
    public final void e0(int i3) {
        V0();
        this.a.e0(i3);
    }

    @Override // d2.e1
    public final void f(long j10) {
        V0();
        this.a.f(j10);
    }

    @Override // d2.e1
    public final v1 f0() {
        V0();
        return this.a.f0();
    }

    @Override // d2.e1
    public final d2.y0 g() {
        V0();
        return this.a.g();
    }

    @Override // d2.e1
    public final void g0(d2.s1 s1Var) {
        V0();
        this.a.g0(s1Var);
    }

    @Override // d2.e1
    public final long getDuration() {
        V0();
        return this.a.getDuration();
    }

    @Override // d2.e1
    public final int h() {
        V0();
        return this.a.h();
    }

    @Override // d2.e1
    public final d2.q0 h0() {
        V0();
        return this.a.h0();
    }

    @Override // d2.e1
    public final int i() {
        V0();
        return this.a.i();
    }

    @Override // d2.e1
    public final boolean i0() {
        V0();
        return this.a.i0();
    }

    @Override // d2.e1
    public final void j() {
        V0();
        this.a.j();
    }

    @Override // d2.e1
    public final f2.c j0() {
        V0();
        return this.a.j0();
    }

    @Override // d2.e1
    public final void k(int i3) {
        V0();
        this.a.k(i3);
    }

    @Override // d2.e1
    public final int k0() {
        V0();
        return this.a.k0();
    }

    @Override // d2.e1
    public final void l(d2.q0 q0Var) {
        V0();
        this.a.l(q0Var);
    }

    @Override // d2.e1
    public final int l0() {
        V0();
        return this.a.l0();
    }

    @Override // d2.e1
    public final int m() {
        V0();
        return this.a.m();
    }

    @Override // d2.e1
    public final boolean m0(int i3) {
        V0();
        return this.a.m0(i3);
    }

    @Override // d2.e1
    public final boolean n() {
        V0();
        return this.a.n();
    }

    @Override // d2.e1
    public final void n0(int i3, d2.n0 n0Var) {
        V0();
        this.a.n0(i3, n0Var);
    }

    @Override // d2.e1
    public final void o(d2.n0 n0Var, long j10) {
        V0();
        this.a.o(n0Var, j10);
    }

    @Override // d2.e1
    public final void o0(boolean z10) {
        V0();
        this.a.o0(z10);
    }

    @Override // d2.e1
    public final long p() {
        V0();
        return this.a.p();
    }

    @Override // d2.e1
    public final void p0(List list, int i3, int i10) {
        V0();
        this.a.p0(list, i3, i10);
    }

    @Override // d2.e1
    public final long q() {
        V0();
        return this.a.q();
    }

    @Override // d2.e1
    public final void q0(int i3, int i10) {
        V0();
        this.a.q0(i3, i10);
    }

    @Override // d2.e1
    public final void r(int i3, long j10) {
        V0();
        this.a.r(i3, j10);
    }

    @Override // d2.e1
    public final void r0(int i3, int i10, int i11) {
        V0();
        this.a.r0(i3, i10, i11);
    }

    @Override // d2.e1
    public final void s(d2.c1 c1Var) {
        V0();
        synchronized (this.b) {
            d2.c1 c1Var2 = (d2.c1) this.b.remove(c1Var);
            d2.e1 e1Var = this.a;
            if (c1Var2 != null) {
                c1Var = c1Var2;
            }
            e1Var.s(c1Var);
        }
    }

    @Override // d2.e1
    public final boolean s0() {
        V0();
        return this.a.s0();
    }

    @Override // d2.e1
    public final void stop() {
        V0();
        this.a.stop();
    }

    @Override // d2.e1
    public final d2.a1 t() {
        V0();
        return this.a.t();
    }

    @Override // d2.e1
    public final int t0() {
        V0();
        return this.a.t0();
    }

    @Override // d2.e1
    public final boolean u() {
        V0();
        return this.a.u();
    }

    @Override // d2.e1
    public final void u0(d2.c1 c1Var) {
        V0();
        synchronized (this.b) {
            try {
                d2.w wVar = (d2.w) this.b.get(c1Var);
                if (wVar == null) {
                    wVar = new d2.w(this, c1Var);
                }
                this.a.u0(wVar);
                this.b.put(c1Var, wVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // d2.e1
    public final void v() {
        V0();
        this.a.v();
    }

    @Override // d2.e1
    public final void v0(d2.n0 n0Var) {
        V0();
        this.a.v0(n0Var);
    }

    @Override // d2.e1
    public final d2.n0 w() {
        V0();
        return this.a.w();
    }

    @Override // d2.e1
    public final void w0(List list) {
        V0();
        this.a.w0(list);
    }

    @Override // d2.e1
    public final void x(boolean z10) {
        V0();
        this.a.x(z10);
    }

    @Override // d2.e1
    public final void x0(d2.n0 n0Var) {
        V0();
        this.a.x0(n0Var);
    }

    @Override // d2.e1
    public final int y() {
        V0();
        return this.a.y();
    }

    @Override // d2.e1
    public final d2.n1 y0() {
        V0();
        return this.a.y0();
    }

    @Override // d2.e1
    public final long z() {
        V0();
        return this.a.z();
    }

    @Override // d2.e1
    public final boolean z0() {
        V0();
        return this.a.z0();
    }
}
