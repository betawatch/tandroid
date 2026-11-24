// default package

import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cf8 implements re8 {
    public final re8 a;
    public final IdentityHashMap b = new IdentityHashMap();

    public cf8(re8 re8Var) {
        this.a = re8Var;
    }

    @Override // re8
    public final int A() {
        V0();
        return this.a.A();
    }

    @Override // re8
    public final void A0(int i, bt6 bt6Var) {
        V0();
        this.a.A0(i, bt6Var);
    }

    @Override // re8
    public final jec B() {
        V0();
        return this.a.B();
    }

    @Override // re8
    public final Looper B0() {
        return this.a.B0();
    }

    @Override // re8
    public final void C() {
        V0();
        this.a.C();
    }

    @Override // re8
    public final void C0() {
        V0();
        this.a.C0();
    }

    @Override // re8
    public final float D() {
        V0();
        return this.a.D();
    }

    @Override // re8
    public final void D0(bt6 bt6Var) {
        V0();
        this.a.D0(bt6Var);
    }

    @Override // re8
    public final void E() {
        V0();
        this.a.E();
    }

    @Override // re8
    public final void E0() {
        V0();
        this.a.E0();
    }

    @Override // re8
    public final o00 F() {
        V0();
        return this.a.F();
    }

    @Override // re8
    public final boolean F0() {
        V0();
        return this.a.F0();
    }

    @Override // re8
    public final void G(int i, boolean z) {
        V0();
        this.a.G(i, z);
    }

    @Override // re8
    public final d0c G0() {
        V0();
        return this.a.G0();
    }

    @Override // re8
    public final of3 H() {
        V0();
        return this.a.H();
    }

    @Override // re8
    public final long H0() {
        V0();
        return this.a.H0();
    }

    @Override // re8
    public final void I() {
        V0();
        this.a.I();
    }

    @Override // re8
    public final void I0(int i) {
        V0();
        this.a.I0(i);
    }

    @Override // re8
    public final void J(int i, int i2) {
        V0();
        this.a.J(i, i2);
    }

    @Override // re8
    public final void J0() {
        V0();
        this.a.J0();
    }

    @Override // re8
    public final void K(int i) {
        V0();
        this.a.K(i);
    }

    @Override // re8
    public final void K0() {
        V0();
        this.a.K0();
    }

    @Override // re8
    public final int L() {
        V0();
        return this.a.L();
    }

    @Override // re8
    public final void L0() {
        V0();
        this.a.L0();
    }

    @Override // re8
    public final void M(d0c d0cVar) {
        V0();
        this.a.M(d0cVar);
    }

    @Override // re8
    public final jt6 M0() {
        V0();
        return this.a.M0();
    }

    @Override // re8
    public final boolean N() {
        return this.a.N();
    }

    @Override // re8
    public final void N0(List list) {
        V0();
        this.a.N0(list);
    }

    @Override // re8
    public final void O(int i) {
        V0();
        this.a.O(i);
    }

    @Override // re8
    public final long O0() {
        V0();
        return this.a.O0();
    }

    @Override // re8
    public final void P(int i, int i2) {
        V0();
        this.a.P(i, i2);
    }

    @Override // re8
    public final boolean P0() {
        V0();
        return this.a.P0();
    }

    @Override // re8
    public final void Q(SurfaceHolder surfaceHolder) {
        V0();
        this.a.Q(surfaceHolder);
    }

    public final qe8 Q0() {
        long j;
        long j2;
        int i;
        int i2;
        boolean m0 = m0(16);
        boolean m02 = m0(17);
        int l0 = m02 ? l0() : 0;
        jte.p(l0 >= 0);
        int A = m02 ? A() : 0;
        jte.p(A >= 0);
        if (m02) {
            bqb y0 = y0();
            if (!y0.p()) {
                jte.p(l0 < y0.o());
                aqb m = y0.m(l0, new aqb(), 0L);
                jte.p(A == hac.i(A, m.m, m.n));
            }
        }
        bt6 u = m0 ? u() : null;
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
        return new qe8(null, l0, u, null, A, j, j2, i, i2);
    }

    @Override // re8
    public final void R(float f) {
        V0();
        this.a.R(f);
    }

    public final n8a R0() {
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
        qe8 Q0 = Q0();
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
        return new n8a(Q0, z, j5, j6, j7, i, j3, j, j2, j4);
    }

    @Override // re8
    public final void S() {
        V0();
        this.a.S();
    }

    public final bt6 S0() {
        if (m0(16)) {
            return u();
        }
        return null;
    }

    @Override // re8
    public final void T(List list, int i, long j) {
        V0();
        this.a.T(list, i, j);
    }

    public final bqb T0() {
        return m0(17) ? y0() : S0() != null ? new bf8(this) : bqb.a;
    }

    @Override // re8
    public final u64 U() {
        V0();
        return this.a.U();
    }

    public final jt6 U0() {
        return m0(18) ? M0() : jt6.M;
    }

    @Override // re8
    public final void V(boolean z) {
        V0();
        this.a.V(z);
    }

    public final void V0() {
        jte.p(Looper.myLooper() == this.a.B0());
    }

    @Override // re8
    public final void W(int i) {
        V0();
        this.a.W(i);
    }

    @Override // re8
    public final long X() {
        V0();
        return this.a.X();
    }

    @Override // re8
    public final long Y() {
        V0();
        return this.a.Y();
    }

    @Override // re8
    public final void Z(int i, List list) {
        V0();
        this.a.Z(i, list);
    }

    @Override // re8
    public final void a() {
        V0();
        this.a.a();
    }

    @Override // re8
    public final void a0() {
        V0();
        this.a.a0();
    }

    @Override // re8
    public final void b(ce8 ce8Var) {
        V0();
        this.a.b(ce8Var);
    }

    @Override // re8
    public final long b0() {
        V0();
        return this.a.b0();
    }

    @Override // re8
    public final void c() {
        V0();
        this.a.c();
    }

    @Override // re8
    public final boolean c0() {
        V0();
        return this.a.c0();
    }

    @Override // re8
    public final void d(float f) {
        V0();
        this.a.d(f);
    }

    @Override // re8
    public final void d0() {
        V0();
        this.a.d0();
    }

    @Override // re8
    public final void e(long j) {
        V0();
        this.a.e(j);
    }

    @Override // re8
    public final void e0(int i) {
        V0();
        this.a.e0(i);
    }

    @Override // re8
    public final boolean f() {
        V0();
        return this.a.f();
    }

    @Override // re8
    public final g0c f0() {
        V0();
        return this.a.f0();
    }

    @Override // re8
    public final ce8 g() {
        V0();
        return this.a.g();
    }

    @Override // re8
    public final jt6 g0() {
        V0();
        return this.a.g0();
    }

    @Override // re8
    public final long getDuration() {
        V0();
        return this.a.getDuration();
    }

    @Override // re8
    public final int h() {
        V0();
        return this.a.h();
    }

    @Override // re8
    public final g53 h0() {
        V0();
        return this.a.h0();
    }

    @Override // re8
    public final boolean i() {
        V0();
        return this.a.i();
    }

    @Override // re8
    public final void i0(o00 o00Var, boolean z) {
        this.a.i0(o00Var, z);
    }

    @Override // re8
    public final void j() {
        V0();
        this.a.j();
    }

    @Override // re8
    public final void j0(jt6 jt6Var) {
        V0();
        this.a.j0(jt6Var);
    }

    @Override // re8
    public final long k() {
        V0();
        return this.a.k();
    }

    @Override // re8
    public final int k0() {
        V0();
        return this.a.k0();
    }

    @Override // re8
    public final int l() {
        V0();
        return this.a.l();
    }

    @Override // re8
    public final int l0() {
        V0();
        return this.a.l0();
    }

    @Override // re8
    public final boolean m() {
        V0();
        return this.a.m();
    }

    @Override // re8
    public final boolean m0(int i) {
        V0();
        return this.a.m0(i);
    }

    @Override // re8
    public final long n() {
        V0();
        return this.a.n();
    }

    @Override // re8
    public final void n0(int i) {
        V0();
        this.a.n0(i);
    }

    @Override // re8
    public final long o() {
        V0();
        return this.a.o();
    }

    @Override // re8
    public final void o0(boolean z) {
        V0();
        this.a.o0(z);
    }

    @Override // re8
    public final void p(int i, long j) {
        V0();
        this.a.p(i, j);
    }

    @Override // re8
    public final void p0(pe8 pe8Var) {
        V0();
        synchronized (this.b) {
            pe8 pe8Var2 = (pe8) this.b.remove(pe8Var);
            re8 re8Var = this.a;
            if (pe8Var2 != null) {
                pe8Var = pe8Var2;
            }
            re8Var.p0(pe8Var);
        }
    }

    @Override // re8
    public final ne8 q() {
        V0();
        return this.a.q();
    }

    @Override // re8
    public final void q0(bt6 bt6Var) {
        V0();
        this.a.q0(bt6Var);
    }

    @Override // re8
    public final void r(bt6 bt6Var, long j) {
        V0();
        this.a.r(bt6Var, j);
    }

    @Override // re8
    public final void r0(List list, int i, int i2) {
        V0();
        this.a.r0(list, i, i2);
    }

    @Override // re8
    public final boolean s() {
        V0();
        return this.a.s();
    }

    @Override // re8
    public final void s0(int i, int i2) {
        V0();
        this.a.s0(i, i2);
    }

    @Override // re8
    public final void stop() {
        V0();
        this.a.stop();
    }

    @Override // re8
    public final void t() {
        V0();
        this.a.t();
    }

    @Override // re8
    public final void t0(int i, int i2, int i3) {
        V0();
        this.a.t0(i, i2, i3);
    }

    @Override // re8
    public final bt6 u() {
        V0();
        return this.a.u();
    }

    @Override // re8
    public final boolean u0() {
        V0();
        return this.a.u0();
    }

    @Override // re8
    public final void v(boolean z) {
        V0();
        this.a.v(z);
    }

    @Override // re8
    public final int v0() {
        V0();
        return this.a.v0();
    }

    @Override // re8
    public final int w() {
        V0();
        return this.a.w();
    }

    @Override // re8
    public final void w0(List list) {
        V0();
        this.a.w0(list);
    }

    @Override // re8
    public final long x() {
        V0();
        return this.a.x();
    }

    @Override // re8
    public final int x0() {
        V0();
        return this.a.x0();
    }

    @Override // re8
    public final void y(pe8 pe8Var) {
        V0();
        synchronized (this.b) {
            ro4 ro4Var = (ro4) this.b.get(pe8Var);
            if (ro4Var == null) {
                ro4Var = new ro4(this, pe8Var);
            }
            this.a.y(ro4Var);
            this.b.put(pe8Var, ro4Var);
        }
    }

    @Override // re8
    public final bqb y0() {
        V0();
        return this.a.y0();
    }

    @Override // re8
    public final long z() {
        V0();
        return this.a.z();
    }

    @Override // re8
    public final boolean z0() {
        V0();
        return this.a.z0();
    }
}
