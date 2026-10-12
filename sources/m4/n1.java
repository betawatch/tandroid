package m4;

import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import b2.b2;
import b2.w1;
import java.util.IdentityHashMap;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class n1 implements b2.g1 {
    public final b2.g1 a;
    public final IdentityHashMap b = new IdentityHashMap();

    public n1(b2.g1 g1Var) {
        this.a = g1Var;
    }

    @Override // b2.g1
    public final int A() {
        V0();
        return this.a.A();
    }

    @Override // b2.g1
    public final Looper A0() {
        return this.a.A0();
    }

    @Override // b2.g1
    public final void B(b2.s0 s0Var) {
        V0();
        this.a.B(s0Var);
    }

    @Override // b2.g1
    public final void B0() {
        V0();
        this.a.B0();
    }

    @Override // b2.g1
    public final void C(b2.e1 e1Var) {
        V0();
        synchronized (this.b) {
            b2.e1 e1Var2 = (b2.e1) this.b.remove(e1Var);
            b2.g1 g1Var = this.a;
            if (e1Var2 != null) {
                e1Var = e1Var2;
            }
            g1Var.C(e1Var);
        }
    }

    @Override // b2.g1
    public final void C0() {
        V0();
        this.a.C0();
    }

    @Override // b2.g1
    public final b2 D() {
        V0();
        return this.a.D();
    }

    @Override // b2.g1
    public final boolean D0() {
        V0();
        return this.a.D0();
    }

    @Override // b2.g1
    public final void E() {
        V0();
        this.a.E();
    }

    @Override // b2.g1
    public final b2.u1 E0() {
        V0();
        return this.a.E0();
    }

    @Override // b2.g1
    public final float F() {
        V0();
        return this.a.F();
    }

    @Override // b2.g1
    public final long F0() {
        V0();
        return this.a.F0();
    }

    @Override // b2.g1
    public final void G() {
        V0();
        this.a.G();
    }

    @Override // b2.g1
    public final void G0(int i10) {
        V0();
        this.a.G0(i10);
    }

    @Override // b2.g1
    public final b2.f H() {
        V0();
        return this.a.H();
    }

    @Override // b2.g1
    public final void H0() {
        V0();
        this.a.H0();
    }

    @Override // b2.g1
    public final void I(int i10, boolean z10) {
        V0();
        this.a.I(i10, z10);
    }

    @Override // b2.g1
    public final void I0() {
        V0();
        this.a.I0();
    }

    @Override // b2.g1
    public final b2.q J() {
        V0();
        return this.a.J();
    }

    @Override // b2.g1
    public final void J0() {
        V0();
        this.a.J0();
    }

    @Override // b2.g1
    public final void K() {
        V0();
        this.a.K();
    }

    @Override // b2.g1
    public final b2.s0 K0() {
        V0();
        return this.a.K0();
    }

    @Override // b2.g1
    public final void L(int i10, int i11) {
        V0();
        this.a.L(i10, i11);
    }

    @Override // b2.g1
    public final void L0(List list) {
        V0();
        this.a.L0(list);
    }

    @Override // b2.g1
    public final void M(int i10) {
        V0();
        this.a.M(i10);
    }

    @Override // b2.g1
    public final long M0() {
        V0();
        return this.a.M0();
    }

    @Override // b2.g1
    public final int N() {
        V0();
        return this.a.N();
    }

    @Override // b2.g1
    public final void N0(b2.f fVar, boolean z10) {
        this.a.N0(fVar, z10);
    }

    @Override // b2.g1
    public final void O(int i10, int i11, List list) {
        V0();
        this.a.O(i10, i11, list);
    }

    @Override // b2.g1
    public final long O0() {
        V0();
        return this.a.O0();
    }

    @Override // b2.g1
    public final boolean P() {
        return this.a.P();
    }

    @Override // b2.g1
    public final boolean P0() {
        V0();
        return this.a.P0();
    }

    @Override // b2.g1
    public final void Q(int i10) {
        V0();
        this.a.Q(i10);
    }

    public final b2.f1 Q0() {
        boolean o02 = o0(16);
        boolean o03 = o0(17);
        int n02 = o03 ? n0() : 0;
        u6.p(n02 >= 0);
        int A = o03 ? A() : 0;
        u6.p(A >= 0);
        if (o03) {
            b2.p1 y02 = y0();
            if (!y02.p()) {
                u6.p(n02 < y02.o());
                b2.o1 m10 = y02.m(n02, new b2.o1(), 0L);
                u6.p(A == e2.m0.i(A, m10.n, m10.o));
            }
        }
        long j10 = 0;
        b2.p0 v = o02 ? v() : null;
        long M0 = o02 ? M0() : 0L;
        if (o02) {
            j10 = a0();
        }
        return new b2.f1(null, n02, v, null, A, M0, j10, o02 ? m0() : -1, o02 ? N() : -1);
    }

    @Override // b2.g1
    public final void R(int i10, int i11) {
        V0();
        this.a.R(i10, i11);
    }

    public final s1 R0() {
        boolean o02 = o0(16);
        return new s1(Q0(), o02 && n(), SystemClock.elapsedRealtime(), o02 ? getDuration() : -9223372036854775807L, o02 ? d0() : 0L, o02 ? x() : 0, o02 ? q() : 0L, o02 ? o() : -9223372036854775807L, o02 ? z() : -9223372036854775807L, o02 ? F0() : 0L);
    }

    @Override // b2.g1
    public final void S(long j10, int i10, List list) {
        V0();
        this.a.S(j10, i10, list);
    }

    public final b2.p0 S0() {
        if (o0(16)) {
            return v();
        }
        return null;
    }

    @Override // b2.g1
    public final void T(SurfaceHolder surfaceHolder) {
        V0();
        this.a.T(surfaceHolder);
    }

    public final b2.p1 T0() {
        return o0(17) ? y0() : S0() != null ? new m1(this) : b2.p1.a;
    }

    @Override // b2.g1
    public final void U(float f7) {
        V0();
        this.a.U(f7);
    }

    public final b2.s0 U0() {
        return o0(18) ? K0() : b2.s0.L;
    }

    @Override // b2.g1
    public final void V() {
        V0();
        this.a.V();
    }

    public final void V0() {
        u6.p(Looper.myLooper() == this.a.A0());
    }

    @Override // b2.g1
    public final b2.z0 W() {
        V0();
        return this.a.W();
    }

    @Override // b2.g1
    public final void X(boolean z10) {
        V0();
        this.a.X(z10);
    }

    @Override // b2.g1
    public final void Y(int i10) {
        V0();
        this.a.Y(i10);
    }

    @Override // b2.g1
    public final long Z() {
        V0();
        return this.a.Z();
    }

    @Override // b2.g1
    public final void a(float f7) {
        V0();
        this.a.a(f7);
    }

    @Override // b2.g1
    public final long a0() {
        V0();
        return this.a.a0();
    }

    @Override // b2.g1
    public final void b() {
        V0();
        this.a.b();
    }

    @Override // b2.g1
    public final void b0(int i10, List list) {
        V0();
        this.a.b0(i10, list);
    }

    @Override // b2.g1
    public final boolean c() {
        V0();
        return this.a.c();
    }

    @Override // b2.g1
    public final void c0() {
        V0();
        this.a.c0();
    }

    @Override // b2.g1
    public final int d() {
        V0();
        return this.a.d();
    }

    @Override // b2.g1
    public final long d0() {
        V0();
        return this.a.d0();
    }

    @Override // b2.g1
    public final void e() {
        V0();
        this.a.e();
    }

    @Override // b2.g1
    public final boolean e0() {
        V0();
        return this.a.e0();
    }

    @Override // b2.g1
    public final void f(b2.a1 a1Var) {
        V0();
        this.a.f(a1Var);
    }

    @Override // b2.g1
    public final void f0() {
        V0();
        this.a.f0();
    }

    @Override // b2.g1
    public final void g(long j10) {
        V0();
        this.a.g(j10);
    }

    @Override // b2.g1
    public final void g0(int i10) {
        V0();
        this.a.g0(i10);
    }

    @Override // b2.g1
    public final long getDuration() {
        V0();
        return this.a.getDuration();
    }

    @Override // b2.g1
    public final b2.a1 h() {
        V0();
        return this.a.h();
    }

    @Override // b2.g1
    public final w1 h0() {
        V0();
        return this.a.h0();
    }

    @Override // b2.g1
    public final void i() {
        V0();
        this.a.i();
    }

    @Override // b2.g1
    public final b2.s0 i0() {
        V0();
        return this.a.i0();
    }

    @Override // b2.g1
    public final void j(int i10) {
        V0();
        this.a.j(i10);
    }

    @Override // b2.g1
    public final boolean j0() {
        V0();
        return this.a.j0();
    }

    @Override // b2.g1
    public final void k(b2.p0 p0Var, long j10) {
        V0();
        this.a.k(p0Var, j10);
    }

    @Override // b2.g1
    public final d2.c k0() {
        V0();
        return this.a.k0();
    }

    @Override // b2.g1
    public final int l() {
        V0();
        return this.a.l();
    }

    @Override // b2.g1
    public final void l0(b2.p0 p0Var) {
        V0();
        this.a.l0(p0Var);
    }

    @Override // b2.g1
    public final int m() {
        V0();
        return this.a.m();
    }

    @Override // b2.g1
    public final int m0() {
        V0();
        return this.a.m0();
    }

    @Override // b2.g1
    public final boolean n() {
        V0();
        return this.a.n();
    }

    @Override // b2.g1
    public final int n0() {
        V0();
        return this.a.n0();
    }

    @Override // b2.g1
    public final long o() {
        V0();
        return this.a.o();
    }

    @Override // b2.g1
    public final boolean o0(int i10) {
        V0();
        return this.a.o0(i10);
    }

    @Override // b2.g1
    public final void p(b2.u1 u1Var) {
        V0();
        this.a.p(u1Var);
    }

    @Override // b2.g1
    public final void p0(b2.e1 e1Var) {
        V0();
        synchronized (this.b) {
            try {
                b2.y yVar = (b2.y) this.b.get(e1Var);
                if (yVar == null) {
                    yVar = new b2.y(this, e1Var);
                }
                this.a.p0(yVar);
                this.b.put(e1Var, yVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b2.g1
    public final long q() {
        V0();
        return this.a.q();
    }

    @Override // b2.g1
    public final void q0(boolean z10) {
        V0();
        this.a.q0(z10);
    }

    @Override // b2.g1
    public final void r(int i10, long j10) {
        V0();
        this.a.r(i10, j10);
    }

    @Override // b2.g1
    public final void r0(b2.p0 p0Var) {
        V0();
        this.a.r0(p0Var);
    }

    @Override // b2.g1
    public final b2.c1 s() {
        V0();
        return this.a.s();
    }

    @Override // b2.g1
    public final void s0(int i10, int i11) {
        V0();
        this.a.s0(i10, i11);
    }

    @Override // b2.g1
    public final void stop() {
        V0();
        this.a.stop();
    }

    @Override // b2.g1
    public final boolean t() {
        V0();
        return this.a.t();
    }

    @Override // b2.g1
    public final void t0(int i10, int i11, int i12) {
        V0();
        this.a.t0(i10, i11, i12);
    }

    @Override // b2.g1
    public final void u() {
        V0();
        this.a.u();
    }

    @Override // b2.g1
    public final void u0(b2.p0 p0Var, int i10) {
        V0();
        this.a.u0(p0Var, i10);
    }

    @Override // b2.g1
    public final b2.p0 v() {
        V0();
        return this.a.v();
    }

    @Override // b2.g1
    public final boolean v0() {
        V0();
        return this.a.v0();
    }

    @Override // b2.g1
    public final void w(boolean z10) {
        V0();
        this.a.w(z10);
    }

    @Override // b2.g1
    public final int w0() {
        V0();
        return this.a.w0();
    }

    @Override // b2.g1
    public final int x() {
        V0();
        return this.a.x();
    }

    @Override // b2.g1
    public final void x0(List list) {
        V0();
        this.a.x0(list);
    }

    @Override // b2.g1
    public final long y() {
        V0();
        return this.a.y();
    }

    @Override // b2.g1
    public final b2.p1 y0() {
        V0();
        return this.a.y0();
    }

    @Override // b2.g1
    public final long z() {
        V0();
        return this.a.z();
    }

    @Override // b2.g1
    public final boolean z0() {
        V0();
        return this.a.z0();
    }
}
