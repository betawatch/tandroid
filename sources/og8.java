// default package

import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class og8 implements dg8 {
    public final dg8 a;
    public final IdentityHashMap b = new IdentityHashMap();

    public og8(dg8 dg8Var) {
        this.a = dg8Var;
    }

    @Override // dg8
    public final int A() {
        V0();
        return this.a.A();
    }

    @Override // dg8
    public final void A0(int i, ft6 ft6Var) {
        V0();
        this.a.A0(i, ft6Var);
    }

    @Override // dg8
    public final ggc B() {
        V0();
        return this.a.B();
    }

    @Override // dg8
    public final Looper B0() {
        return this.a.B0();
    }

    @Override // dg8
    public final void C() {
        V0();
        this.a.C();
    }

    @Override // dg8
    public final void C0() {
        V0();
        this.a.C0();
    }

    @Override // dg8
    public final float D() {
        V0();
        return this.a.D();
    }

    @Override // dg8
    public final void D0(ft6 ft6Var) {
        V0();
        this.a.D0(ft6Var);
    }

    @Override // dg8
    public final void E() {
        V0();
        this.a.E();
    }

    @Override // dg8
    public final void E0() {
        V0();
        this.a.E0();
    }

    @Override // dg8
    public final oz F() {
        V0();
        return this.a.F();
    }

    @Override // dg8
    public final boolean F0() {
        V0();
        return this.a.F0();
    }

    @Override // dg8
    public final void G(int i, boolean z) {
        V0();
        this.a.G(i, z);
    }

    @Override // dg8
    public final c2c G0() {
        V0();
        return this.a.G0();
    }

    @Override // dg8
    public final xe3 H() {
        V0();
        return this.a.H();
    }

    @Override // dg8
    public final long H0() {
        V0();
        return this.a.H0();
    }

    @Override // dg8
    public final void I() {
        V0();
        this.a.I();
    }

    @Override // dg8
    public final void I0(int i) {
        V0();
        this.a.I0(i);
    }

    @Override // dg8
    public final void J(int i, int i2) {
        V0();
        this.a.J(i, i2);
    }

    @Override // dg8
    public final void J0() {
        V0();
        this.a.J0();
    }

    @Override // dg8
    public final void K(int i) {
        V0();
        this.a.K(i);
    }

    @Override // dg8
    public final void K0() {
        V0();
        this.a.K0();
    }

    @Override // dg8
    public final int L() {
        V0();
        return this.a.L();
    }

    @Override // dg8
    public final void L0() {
        V0();
        this.a.L0();
    }

    @Override // dg8
    public final void M(c2c c2cVar) {
        V0();
        this.a.M(c2cVar);
    }

    @Override // dg8
    public final nt6 M0() {
        V0();
        return this.a.M0();
    }

    @Override // dg8
    public final boolean N() {
        return this.a.N();
    }

    @Override // dg8
    public final void N0(List list) {
        V0();
        this.a.N0(list);
    }

    @Override // dg8
    public final void O(int i) {
        V0();
        this.a.O(i);
    }

    @Override // dg8
    public final long O0() {
        V0();
        return this.a.O0();
    }

    @Override // dg8
    public final void P(int i, int i2) {
        V0();
        this.a.P(i, i2);
    }

    @Override // dg8
    public final boolean P0() {
        V0();
        return this.a.P0();
    }

    @Override // dg8
    public final void Q(SurfaceHolder surfaceHolder) {
        V0();
        this.a.Q(surfaceHolder);
    }

    public final cg8 Q0() {
        long j;
        long j2;
        int i;
        int i2;
        boolean m0 = m0(16);
        boolean m02 = m0(17);
        int l0 = m02 ? l0() : 0;
        yve.p(l0 >= 0);
        int A = m02 ? A() : 0;
        yve.p(A >= 0);
        if (m02) {
            asb y0 = y0();
            if (!y0.p()) {
                yve.p(l0 < y0.o());
                zrb m = y0.m(l0, new zrb(), 0L);
                yve.p(A == gcc.i(A, m.m, m.n));
            }
        }
        ft6 u = m0 ? u() : null;
        if (m0) {
            long k = k();
            long Y = Y();
            int k0 = k0();
            i2 = L();
            j = k;
            j2 = Y;
            i = k0;
        } else {
            j = 0;
            j2 = 0;
            i = -1;
            i2 = -1;
        }
        return new cg8(null, l0, u, null, A, j, j2, i, i2);
    }

    @Override // dg8
    public final void R(float f) {
        V0();
        this.a.R(f);
    }

    public final daa R0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        boolean z;
        long j5;
        long j6;
        long j7;
        boolean m0 = m0(16);
        cg8 Q0 = Q0();
        boolean z2 = m0 && m();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m0) {
            long duration = getDuration();
            long b0 = b0();
            int w = w();
            j3 = o();
            j = n();
            j2 = z();
            j4 = H0();
            i = w;
            z = z2;
            j5 = elapsedRealtime;
            j6 = duration;
            j7 = b0;
        } else {
            j = -9223372036854775807L;
            j2 = -9223372036854775807L;
            j3 = 0;
            j4 = 0;
            i = 0;
            z = z2;
            j5 = elapsedRealtime;
            j6 = -9223372036854775807L;
            j7 = 0;
        }
        return new daa(Q0, z, j5, j6, j7, i, j3, j, j2, j4);
    }

    @Override // dg8
    public final void S() {
        V0();
        this.a.S();
    }

    public final ft6 S0() {
        if (m0(16)) {
            return u();
        }
        return null;
    }

    @Override // dg8
    public final void T(List list, int i, long j) {
        V0();
        this.a.T(list, i, j);
    }

    public final asb T0() {
        return m0(17) ? y0() : S0() != null ? new ng8(this) : asb.a;
    }

    @Override // dg8
    public final e64 U() {
        V0();
        return this.a.U();
    }

    public final nt6 U0() {
        return m0(18) ? M0() : nt6.M;
    }

    @Override // dg8
    public final void V(boolean z) {
        V0();
        this.a.V(z);
    }

    public final void V0() {
        yve.p(Looper.myLooper() == this.a.B0());
    }

    @Override // dg8
    public final void W(int i) {
        V0();
        this.a.W(i);
    }

    @Override // dg8
    public final long X() {
        V0();
        return this.a.X();
    }

    @Override // dg8
    public final long Y() {
        V0();
        return this.a.Y();
    }

    @Override // dg8
    public final void Z(int i, List list) {
        V0();
        this.a.Z(i, list);
    }

    @Override // dg8
    public final void a() {
        V0();
        this.a.a();
    }

    @Override // dg8
    public final void a0() {
        V0();
        this.a.a0();
    }

    @Override // dg8
    public final void b() {
        V0();
        this.a.b();
    }

    @Override // dg8
    public final long b0() {
        V0();
        return this.a.b0();
    }

    @Override // dg8
    public final void c(of8 of8Var) {
        V0();
        this.a.c(of8Var);
    }

    @Override // dg8
    public final boolean c0() {
        V0();
        return this.a.c0();
    }

    @Override // dg8
    public final void d(float f) {
        V0();
        this.a.d(f);
    }

    @Override // dg8
    public final void d0() {
        V0();
        this.a.d0();
    }

    @Override // dg8
    public final boolean e() {
        V0();
        return this.a.e();
    }

    @Override // dg8
    public final void e0(int i) {
        V0();
        this.a.e0(i);
    }

    @Override // dg8
    public final of8 f() {
        V0();
        return this.a.f();
    }

    @Override // dg8
    public final f2c f0() {
        V0();
        return this.a.f0();
    }

    @Override // dg8
    public final void g(long j) {
        V0();
        this.a.g(j);
    }

    @Override // dg8
    public final nt6 g0() {
        V0();
        return this.a.g0();
    }

    @Override // dg8
    public final long getDuration() {
        V0();
        return this.a.getDuration();
    }

    @Override // dg8
    public final int h() {
        V0();
        return this.a.h();
    }

    @Override // dg8
    public final n43 h0() {
        V0();
        return this.a.h0();
    }

    @Override // dg8
    public final boolean i() {
        V0();
        return this.a.i();
    }

    @Override // dg8
    public final void i0(oz ozVar, boolean z) {
        this.a.i0(ozVar, z);
    }

    @Override // dg8
    public final void j() {
        V0();
        this.a.j();
    }

    @Override // dg8
    public final void j0(nt6 nt6Var) {
        V0();
        this.a.j0(nt6Var);
    }

    @Override // dg8
    public final long k() {
        V0();
        return this.a.k();
    }

    @Override // dg8
    public final int k0() {
        V0();
        return this.a.k0();
    }

    @Override // dg8
    public final int l() {
        V0();
        return this.a.l();
    }

    @Override // dg8
    public final int l0() {
        V0();
        return this.a.l0();
    }

    @Override // dg8
    public final boolean m() {
        V0();
        return this.a.m();
    }

    @Override // dg8
    public final boolean m0(int i) {
        V0();
        return this.a.m0(i);
    }

    @Override // dg8
    public final long n() {
        V0();
        return this.a.n();
    }

    @Override // dg8
    public final void n0(int i) {
        V0();
        this.a.n0(i);
    }

    @Override // dg8
    public final long o() {
        V0();
        return this.a.o();
    }

    @Override // dg8
    public final void o0(boolean z) {
        V0();
        this.a.o0(z);
    }

    @Override // dg8
    public final void p(int i, long j) {
        V0();
        this.a.p(i, j);
    }

    @Override // dg8
    public final void p0(bg8 bg8Var) {
        V0();
        synchronized (this.b) {
            bg8 bg8Var2 = (bg8) this.b.remove(bg8Var);
            dg8 dg8Var = this.a;
            if (bg8Var2 != null) {
                bg8Var = bg8Var2;
            }
            dg8Var.p0(bg8Var);
        }
    }

    @Override // dg8
    public final zf8 q() {
        V0();
        return this.a.q();
    }

    @Override // dg8
    public final void q0(ft6 ft6Var) {
        V0();
        this.a.q0(ft6Var);
    }

    @Override // dg8
    public final void r(ft6 ft6Var, long j) {
        V0();
        this.a.r(ft6Var, j);
    }

    @Override // dg8
    public final void r0(List list, int i, int i2) {
        V0();
        this.a.r0(list, i, i2);
    }

    @Override // dg8
    public final boolean s() {
        V0();
        return this.a.s();
    }

    @Override // dg8
    public final void s0(int i, int i2) {
        V0();
        this.a.s0(i, i2);
    }

    @Override // dg8
    public final void stop() {
        V0();
        this.a.stop();
    }

    @Override // dg8
    public final void t() {
        V0();
        this.a.t();
    }

    @Override // dg8
    public final void t0(int i, int i2, int i3) {
        V0();
        this.a.t0(i, i2, i3);
    }

    @Override // dg8
    public final ft6 u() {
        V0();
        return this.a.u();
    }

    @Override // dg8
    public final boolean u0() {
        V0();
        return this.a.u0();
    }

    @Override // dg8
    public final void v(boolean z) {
        V0();
        this.a.v(z);
    }

    @Override // dg8
    public final int v0() {
        V0();
        return this.a.v0();
    }

    @Override // dg8
    public final int w() {
        V0();
        return this.a.w();
    }

    @Override // dg8
    public final void w0(List list) {
        V0();
        this.a.w0(list);
    }

    @Override // dg8
    public final long x() {
        V0();
        return this.a.x();
    }

    @Override // dg8
    public final int x0() {
        V0();
        return this.a.x0();
    }

    @Override // dg8
    public final void y(bg8 bg8Var) {
        V0();
        synchronized (this.b) {
            vo4 vo4Var = (vo4) this.b.get(bg8Var);
            if (vo4Var == null) {
                vo4Var = new vo4(this, bg8Var);
            }
            this.a.y(vo4Var);
            this.b.put(bg8Var, vo4Var);
        }
    }

    @Override // dg8
    public final asb y0() {
        V0();
        return this.a.y0();
    }

    @Override // dg8
    public final long z() {
        V0();
        return this.a.z();
    }

    @Override // dg8
    public final boolean z0() {
        V0();
        return this.a.z0();
    }
}
