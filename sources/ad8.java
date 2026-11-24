// default package

import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ad8 implements oc8 {
    public final oc8 a;
    public final IdentityHashMap b = new IdentityHashMap();

    public ad8(oc8 oc8Var) {
        this.a = oc8Var;
    }

    @Override // oc8
    public final int A() {
        V0();
        return this.a.A();
    }

    @Override // oc8
    public final void A0(int i, br6 br6Var) {
        V0();
        this.a.A0(i, br6Var);
    }

    @Override // oc8
    public final icc B() {
        V0();
        return this.a.B();
    }

    @Override // oc8
    public final Looper B0() {
        return this.a.B0();
    }

    @Override // oc8
    public final void C() {
        V0();
        this.a.C();
    }

    @Override // oc8
    public final void C0() {
        V0();
        this.a.C0();
    }

    @Override // oc8
    public final float D() {
        V0();
        return this.a.D();
    }

    @Override // oc8
    public final void D0(br6 br6Var) {
        V0();
        this.a.D0(br6Var);
    }

    @Override // oc8
    public final void E() {
        V0();
        this.a.E();
    }

    @Override // oc8
    public final void E0() {
        V0();
        this.a.E0();
    }

    @Override // oc8
    public final nz F() {
        V0();
        return this.a.F();
    }

    @Override // oc8
    public final boolean F0() {
        V0();
        return this.a.F0();
    }

    @Override // oc8
    public final void G(int i, boolean z) {
        V0();
        this.a.G(i, z);
    }

    @Override // oc8
    public final byb G0() {
        V0();
        return this.a.G0();
    }

    @Override // oc8
    public final de3 H() {
        V0();
        return this.a.H();
    }

    @Override // oc8
    public final long H0() {
        V0();
        return this.a.H0();
    }

    @Override // oc8
    public final void I() {
        V0();
        this.a.I();
    }

    @Override // oc8
    public final void I0(int i) {
        V0();
        this.a.I0(i);
    }

    @Override // oc8
    public final void J(int i, int i2) {
        V0();
        this.a.J(i, i2);
    }

    @Override // oc8
    public final void J0() {
        V0();
        this.a.J0();
    }

    @Override // oc8
    public final void K(int i) {
        V0();
        this.a.K(i);
    }

    @Override // oc8
    public final void K0() {
        V0();
        this.a.K0();
    }

    @Override // oc8
    public final int L() {
        V0();
        return this.a.L();
    }

    @Override // oc8
    public final void L0() {
        V0();
        this.a.L0();
    }

    @Override // oc8
    public final void M(byb bybVar) {
        V0();
        this.a.M(bybVar);
    }

    @Override // oc8
    public final jr6 M0() {
        V0();
        return this.a.M0();
    }

    @Override // oc8
    public final boolean N() {
        return this.a.N();
    }

    @Override // oc8
    public final void N0(List list) {
        V0();
        this.a.N0(list);
    }

    @Override // oc8
    public final void O(int i) {
        V0();
        this.a.O(i);
    }

    @Override // oc8
    public final long O0() {
        V0();
        return this.a.O0();
    }

    @Override // oc8
    public final void P(int i, int i2) {
        V0();
        this.a.P(i, i2);
    }

    @Override // oc8
    public final boolean P0() {
        V0();
        return this.a.P0();
    }

    @Override // oc8
    public final void Q(SurfaceHolder surfaceHolder) {
        V0();
        this.a.Q(surfaceHolder);
    }

    public final nc8 Q0() {
        long j;
        long j2;
        int i;
        int i2;
        boolean m0 = m0(16);
        boolean m02 = m0(17);
        int l0 = m02 ? l0() : 0;
        gre.p(l0 >= 0);
        int A = m02 ? A() : 0;
        gre.p(A >= 0);
        if (m02) {
            aob y0 = y0();
            if (!y0.p()) {
                gre.p(l0 < y0.o());
                znb m = y0.m(l0, new znb(), 0L);
                gre.p(A == g8c.i(A, m.m, m.n));
            }
        }
        br6 u = m0 ? u() : null;
        if (m0) {
            long m2 = m();
            long Y = Y();
            int k0 = k0();
            i2 = L();
            j = m2;
            j2 = Y;
            i = k0;
        } else {
            j = 0;
            j2 = 0;
            i = -1;
            i2 = -1;
        }
        return new nc8(null, l0, u, null, A, j, j2, i, i2);
    }

    @Override // oc8
    public final void R(float f) {
        V0();
        this.a.R(f);
    }

    public final l6a R0() {
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
        nc8 Q0 = Q0();
        boolean z2 = m0 && l();
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
        return new l6a(Q0, z, j5, j6, j7, i, j3, j, j2, j4);
    }

    @Override // oc8
    public final void S() {
        V0();
        this.a.S();
    }

    public final br6 S0() {
        if (m0(16)) {
            return u();
        }
        return null;
    }

    @Override // oc8
    public final void T(List list, int i, long j) {
        V0();
        this.a.T(list, i, j);
    }

    public final aob T0() {
        return m0(17) ? y0() : S0() != null ? new zc8(this) : aob.a;
    }

    @Override // oc8
    public final j54 U() {
        V0();
        return this.a.U();
    }

    public final jr6 U0() {
        return m0(18) ? M0() : jr6.M;
    }

    @Override // oc8
    public final void V(boolean z) {
        V0();
        this.a.V(z);
    }

    public final void V0() {
        gre.p(Looper.myLooper() == this.a.B0());
    }

    @Override // oc8
    public final void W(int i) {
        V0();
        this.a.W(i);
    }

    @Override // oc8
    public final long X() {
        V0();
        return this.a.X();
    }

    @Override // oc8
    public final long Y() {
        V0();
        return this.a.Y();
    }

    @Override // oc8
    public final void Z(int i, List list) {
        V0();
        this.a.Z(i, list);
    }

    @Override // oc8
    public final void a() {
        V0();
        this.a.a();
    }

    @Override // oc8
    public final void a0() {
        V0();
        this.a.a0();
    }

    @Override // oc8
    public final void b(zb8 zb8Var) {
        V0();
        this.a.b(zb8Var);
    }

    @Override // oc8
    public final long b0() {
        V0();
        return this.a.b0();
    }

    @Override // oc8
    public final void c(float f) {
        V0();
        this.a.c(f);
    }

    @Override // oc8
    public final boolean c0() {
        V0();
        return this.a.c0();
    }

    @Override // oc8
    public final boolean d() {
        V0();
        return this.a.d();
    }

    @Override // oc8
    public final void d0() {
        V0();
        this.a.d0();
    }

    @Override // oc8
    public final void e() {
        V0();
        this.a.e();
    }

    @Override // oc8
    public final void e0(int i) {
        V0();
        this.a.e0(i);
    }

    @Override // oc8
    public final void f(long j) {
        V0();
        this.a.f(j);
    }

    @Override // oc8
    public final eyb f0() {
        V0();
        return this.a.f0();
    }

    @Override // oc8
    public final zb8 g() {
        V0();
        return this.a.g();
    }

    @Override // oc8
    public final jr6 g0() {
        V0();
        return this.a.g0();
    }

    @Override // oc8
    public final long getDuration() {
        V0();
        return this.a.getDuration();
    }

    @Override // oc8
    public final int h() {
        V0();
        return this.a.h();
    }

    @Override // oc8
    public final v33 h0() {
        V0();
        return this.a.h0();
    }

    @Override // oc8
    public final int i() {
        V0();
        return this.a.i();
    }

    @Override // oc8
    public final void i0(nz nzVar, boolean z) {
        this.a.i0(nzVar, z);
    }

    @Override // oc8
    public final boolean j() {
        V0();
        return this.a.j();
    }

    @Override // oc8
    public final void j0(jr6 jr6Var) {
        V0();
        this.a.j0(jr6Var);
    }

    @Override // oc8
    public final void k() {
        V0();
        this.a.k();
    }

    @Override // oc8
    public final int k0() {
        V0();
        return this.a.k0();
    }

    @Override // oc8
    public final boolean l() {
        V0();
        return this.a.l();
    }

    @Override // oc8
    public final int l0() {
        V0();
        return this.a.l0();
    }

    @Override // oc8
    public final long m() {
        V0();
        return this.a.m();
    }

    @Override // oc8
    public final boolean m0(int i) {
        V0();
        return this.a.m0(i);
    }

    @Override // oc8
    public final long n() {
        V0();
        return this.a.n();
    }

    @Override // oc8
    public final void n0(int i) {
        V0();
        this.a.n0(i);
    }

    @Override // oc8
    public final long o() {
        V0();
        return this.a.o();
    }

    @Override // oc8
    public final void o0(boolean z) {
        V0();
        this.a.o0(z);
    }

    @Override // oc8
    public final void p(int i, long j) {
        V0();
        this.a.p(i, j);
    }

    @Override // oc8
    public final void p0(mc8 mc8Var) {
        V0();
        synchronized (this.b) {
            mc8 mc8Var2 = (mc8) this.b.remove(mc8Var);
            oc8 oc8Var = this.a;
            if (mc8Var2 != null) {
                mc8Var = mc8Var2;
            }
            oc8Var.p0(mc8Var);
        }
    }

    @Override // oc8
    public final kc8 q() {
        V0();
        return this.a.q();
    }

    @Override // oc8
    public final void q0(br6 br6Var) {
        V0();
        this.a.q0(br6Var);
    }

    @Override // oc8
    public final void r(br6 br6Var, long j) {
        V0();
        this.a.r(br6Var, j);
    }

    @Override // oc8
    public final void r0(List list, int i, int i2) {
        V0();
        this.a.r0(list, i, i2);
    }

    @Override // oc8
    public final boolean s() {
        V0();
        return this.a.s();
    }

    @Override // oc8
    public final void s0(int i, int i2) {
        V0();
        this.a.s0(i, i2);
    }

    @Override // oc8
    public final void stop() {
        V0();
        this.a.stop();
    }

    @Override // oc8
    public final void t() {
        V0();
        this.a.t();
    }

    @Override // oc8
    public final void t0(int i, int i2, int i3) {
        V0();
        this.a.t0(i, i2, i3);
    }

    @Override // oc8
    public final br6 u() {
        V0();
        return this.a.u();
    }

    @Override // oc8
    public final boolean u0() {
        V0();
        return this.a.u0();
    }

    @Override // oc8
    public final void v(boolean z) {
        V0();
        this.a.v(z);
    }

    @Override // oc8
    public final int v0() {
        V0();
        return this.a.v0();
    }

    @Override // oc8
    public final int w() {
        V0();
        return this.a.w();
    }

    @Override // oc8
    public final void w0(List list) {
        V0();
        this.a.w0(list);
    }

    @Override // oc8
    public final long x() {
        V0();
        return this.a.x();
    }

    @Override // oc8
    public final int x0() {
        V0();
        return this.a.x0();
    }

    @Override // oc8
    public final void y(mc8 mc8Var) {
        V0();
        synchronized (this.b) {
            qm4 qm4Var = (qm4) this.b.get(mc8Var);
            if (qm4Var == null) {
                qm4Var = new qm4(this, mc8Var);
            }
            this.a.y(qm4Var);
            this.b.put(mc8Var, qm4Var);
        }
    }

    @Override // oc8
    public final aob y0() {
        V0();
        return this.a.y0();
    }

    @Override // oc8
    public final long z() {
        V0();
        return this.a.z();
    }

    @Override // oc8
    public final boolean z0() {
        V0();
        return this.a.z0();
    }
}
