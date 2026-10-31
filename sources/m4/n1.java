package m4;

import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import b2.b2;
import b2.w1;
import java.util.IdentityHashMap;
import java.util.List;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n1 implements b2.f1 {
    public final b2.f1 a;
    public final IdentityHashMap b = new IdentityHashMap();

    public n1(b2.f1 f1Var) {
        this.a = f1Var;
    }

    @Override // b2.f1
    public final int A() {
        V0();
        return this.a.A();
    }

    @Override // b2.f1
    public final Looper A0() {
        return this.a.A0();
    }

    @Override // b2.f1
    public final void B(b2.s0 s0Var) {
        V0();
        this.a.B(s0Var);
    }

    @Override // b2.f1
    public final void B0() {
        V0();
        this.a.B0();
    }

    @Override // b2.f1
    public final void C(b2.d1 d1Var) {
        V0();
        synchronized (this.b) {
            b2.d1 d1Var2 = (b2.d1) this.b.remove(d1Var);
            b2.f1 f1Var = this.a;
            if (d1Var2 != null) {
                d1Var = d1Var2;
            }
            f1Var.C(d1Var);
        }
    }

    @Override // b2.f1
    public final void C0() {
        V0();
        this.a.C0();
    }

    @Override // b2.f1
    public final b2 D() {
        V0();
        return this.a.D();
    }

    @Override // b2.f1
    public final boolean D0() {
        V0();
        return this.a.D0();
    }

    @Override // b2.f1
    public final void E() {
        V0();
        this.a.E();
    }

    @Override // b2.f1
    public final b2.u1 E0() {
        V0();
        return this.a.E0();
    }

    @Override // b2.f1
    public final float F() {
        V0();
        return this.a.F();
    }

    @Override // b2.f1
    public final long F0() {
        V0();
        return this.a.F0();
    }

    @Override // b2.f1
    public final void G() {
        V0();
        this.a.G();
    }

    @Override // b2.f1
    public final void G0(int i10) {
        V0();
        this.a.G0(i10);
    }

    @Override // b2.f1
    public final b2.f H() {
        V0();
        return this.a.H();
    }

    @Override // b2.f1
    public final void H0() {
        V0();
        this.a.H0();
    }

    @Override // b2.f1
    public final void I(int i10, boolean z10) {
        V0();
        this.a.I(i10, z10);
    }

    @Override // b2.f1
    public final void I0() {
        V0();
        this.a.I0();
    }

    @Override // b2.f1
    public final b2.q J() {
        V0();
        return this.a.J();
    }

    @Override // b2.f1
    public final void J0() {
        V0();
        this.a.J0();
    }

    @Override // b2.f1
    public final void K() {
        V0();
        this.a.K();
    }

    @Override // b2.f1
    public final b2.s0 K0() {
        V0();
        return this.a.K0();
    }

    @Override // b2.f1
    public final void L(int i10, int i11) {
        V0();
        this.a.L(i10, i11);
    }

    @Override // b2.f1
    public final void L0(List list) {
        V0();
        this.a.L0(list);
    }

    @Override // b2.f1
    public final void M(int i10) {
        V0();
        this.a.M(i10);
    }

    @Override // b2.f1
    public final long M0() {
        V0();
        return this.a.M0();
    }

    @Override // b2.f1
    public final int N() {
        V0();
        return this.a.N();
    }

    @Override // b2.f1
    public final void N0(b2.f fVar, boolean z10) {
        this.a.N0(fVar, z10);
    }

    @Override // b2.f1
    public final boolean O() {
        return this.a.O();
    }

    @Override // b2.f1
    public final long O0() {
        V0();
        return this.a.O0();
    }

    @Override // b2.f1
    public final void P(int i10) {
        V0();
        this.a.P(i10);
    }

    @Override // b2.f1
    public final boolean P0() {
        V0();
        return this.a.P0();
    }

    @Override // b2.f1
    public final void Q(int i10, int i11) {
        V0();
        this.a.Q(i10, i11);
    }

    public final b2.e1 Q0() {
        boolean n02 = n0(16);
        boolean n03 = n0(17);
        int m0 = n03 ? m0() : 0;
        t6.p(m0 >= 0);
        int A = n03 ? A() : 0;
        t6.p(A >= 0);
        if (n03) {
            b2.o1 y02 = y0();
            if (!y02.p()) {
                t6.p(m0 < y02.o());
                b2.n1 m10 = y02.m(m0, new b2.n1(), 0L);
                t6.p(A == e2.l0.i(A, m10.n, m10.o));
            }
        }
        long j10 = 0;
        b2.p0 v = n02 ? v() : null;
        long M0 = n02 ? M0() : 0L;
        if (n02) {
            j10 = Z();
        }
        return new b2.e1(null, m0, v, null, A, M0, j10, n02 ? l0() : -1, n02 ? N() : -1);
    }

    @Override // b2.f1
    public final void R(SurfaceHolder surfaceHolder) {
        V0();
        this.a.R(surfaceHolder);
    }

    public final s1 R0() {
        boolean n02 = n0(16);
        return new s1(Q0(), n02 && n(), SystemClock.elapsedRealtime(), n02 ? getDuration() : -9223372036854775807L, n02 ? c0() : 0L, n02 ? x() : 0, n02 ? q() : 0L, n02 ? o() : -9223372036854775807L, n02 ? z() : -9223372036854775807L, n02 ? F0() : 0L);
    }

    @Override // b2.f1
    public final void S(float f7) {
        V0();
        this.a.S(f7);
    }

    public final b2.p0 S0() {
        if (n0(16)) {
            return v();
        }
        return null;
    }

    @Override // b2.f1
    public final void T() {
        V0();
        this.a.T();
    }

    public final b2.o1 T0() {
        return n0(17) ? y0() : S0() != null ? new m1(this) : b2.o1.a;
    }

    @Override // b2.f1
    public final void U(List list, int i10, long j10) {
        V0();
        this.a.U(list, i10, j10);
    }

    public final b2.s0 U0() {
        return n0(18) ? K0() : b2.s0.L;
    }

    @Override // b2.f1
    public final b2.y0 V() {
        V0();
        return this.a.V();
    }

    public final void V0() {
        t6.p(Looper.myLooper() == this.a.A0());
    }

    @Override // b2.f1
    public final void W(boolean z10) {
        V0();
        this.a.W(z10);
    }

    @Override // b2.f1
    public final void X(int i10) {
        V0();
        this.a.X(i10);
    }

    @Override // b2.f1
    public final long Y() {
        V0();
        return this.a.Y();
    }

    @Override // b2.f1
    public final long Z() {
        V0();
        return this.a.Z();
    }

    @Override // b2.f1
    public final void a() {
        V0();
        this.a.a();
    }

    @Override // b2.f1
    public final void a0(int i10, List list) {
        V0();
        this.a.a0(i10, list);
    }

    @Override // b2.f1
    public final void b(float f7) {
        V0();
        this.a.b(f7);
    }

    @Override // b2.f1
    public final void b0() {
        V0();
        this.a.b0();
    }

    @Override // b2.f1
    public final void c(b2.z0 z0Var) {
        V0();
        this.a.c(z0Var);
    }

    @Override // b2.f1
    public final long c0() {
        V0();
        return this.a.c0();
    }

    @Override // b2.f1
    public final boolean d() {
        V0();
        return this.a.d();
    }

    @Override // b2.f1
    public final boolean d0() {
        V0();
        return this.a.d0();
    }

    @Override // b2.f1
    public final void e() {
        V0();
        this.a.e();
    }

    @Override // b2.f1
    public final void e0() {
        V0();
        this.a.e0();
    }

    @Override // b2.f1
    public final void f(long j10) {
        V0();
        this.a.f(j10);
    }

    @Override // b2.f1
    public final void f0(int i10) {
        V0();
        this.a.f0(i10);
    }

    @Override // b2.f1
    public final b2.z0 g() {
        V0();
        return this.a.g();
    }

    @Override // b2.f1
    public final w1 g0() {
        V0();
        return this.a.g0();
    }

    @Override // b2.f1
    public final long getDuration() {
        V0();
        return this.a.getDuration();
    }

    @Override // b2.f1
    public final int h() {
        V0();
        return this.a.h();
    }

    @Override // b2.f1
    public final b2.s0 h0() {
        V0();
        return this.a.h0();
    }

    @Override // b2.f1
    public final void i(b2.p0 p0Var, long j10) {
        V0();
        this.a.i(p0Var, j10);
    }

    @Override // b2.f1
    public final boolean i0() {
        V0();
        return this.a.i0();
    }

    @Override // b2.f1
    public final void j() {
        V0();
        this.a.j();
    }

    @Override // b2.f1
    public final d2.d j0() {
        V0();
        return this.a.j0();
    }

    @Override // b2.f1
    public final void k(int i10) {
        V0();
        this.a.k(i10);
    }

    @Override // b2.f1
    public final void k0(b2.p0 p0Var) {
        V0();
        this.a.k0(p0Var);
    }

    @Override // b2.f1
    public final int l() {
        V0();
        return this.a.l();
    }

    @Override // b2.f1
    public final int l0() {
        V0();
        return this.a.l0();
    }

    @Override // b2.f1
    public final int m() {
        V0();
        return this.a.m();
    }

    @Override // b2.f1
    public final int m0() {
        V0();
        return this.a.m0();
    }

    @Override // b2.f1
    public final boolean n() {
        V0();
        return this.a.n();
    }

    @Override // b2.f1
    public final boolean n0(int i10) {
        V0();
        return this.a.n0(i10);
    }

    @Override // b2.f1
    public final long o() {
        V0();
        return this.a.o();
    }

    @Override // b2.f1
    public final void o0(b2.d1 d1Var) {
        V0();
        synchronized (this.b) {
            try {
                b2.y yVar = (b2.y) this.b.get(d1Var);
                if (yVar == null) {
                    yVar = new b2.y(this, d1Var);
                }
                this.a.o0(yVar);
                this.b.put(d1Var, yVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b2.f1
    public final void p(b2.u1 u1Var) {
        V0();
        this.a.p(u1Var);
    }

    @Override // b2.f1
    public final void p0(boolean z10) {
        V0();
        this.a.p0(z10);
    }

    @Override // b2.f1
    public final long q() {
        V0();
        return this.a.q();
    }

    @Override // b2.f1
    public final void q0(int i10, b2.p0 p0Var) {
        V0();
        this.a.q0(i10, p0Var);
    }

    @Override // b2.f1
    public final void r(int i10, long j10) {
        V0();
        this.a.r(i10, j10);
    }

    @Override // b2.f1
    public final void r0(List list, int i10, int i11) {
        V0();
        this.a.r0(list, i10, i11);
    }

    @Override // b2.f1
    public final b2.b1 s() {
        V0();
        return this.a.s();
    }

    @Override // b2.f1
    public final void s0(b2.p0 p0Var) {
        V0();
        this.a.s0(p0Var);
    }

    @Override // b2.f1
    public final void stop() {
        V0();
        this.a.stop();
    }

    @Override // b2.f1
    public final boolean t() {
        V0();
        return this.a.t();
    }

    @Override // b2.f1
    public final void t0(int i10, int i11) {
        V0();
        this.a.t0(i10, i11);
    }

    @Override // b2.f1
    public final void u() {
        V0();
        this.a.u();
    }

    @Override // b2.f1
    public final void u0(int i10, int i11, int i12) {
        V0();
        this.a.u0(i10, i11, i12);
    }

    @Override // b2.f1
    public final b2.p0 v() {
        V0();
        return this.a.v();
    }

    @Override // b2.f1
    public final boolean v0() {
        V0();
        return this.a.v0();
    }

    @Override // b2.f1
    public final void w(boolean z10) {
        V0();
        this.a.w(z10);
    }

    @Override // b2.f1
    public final int w0() {
        V0();
        return this.a.w0();
    }

    @Override // b2.f1
    public final int x() {
        V0();
        return this.a.x();
    }

    @Override // b2.f1
    public final void x0(List list) {
        V0();
        this.a.x0(list);
    }

    @Override // b2.f1
    public final long y() {
        V0();
        return this.a.y();
    }

    @Override // b2.f1
    public final b2.o1 y0() {
        V0();
        return this.a.y0();
    }

    @Override // b2.f1
    public final long z() {
        V0();
        return this.a.z();
    }

    @Override // b2.f1
    public final boolean z0() {
        V0();
        return this.a.z0();
    }
}
