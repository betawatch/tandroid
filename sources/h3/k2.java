package h3;

import android.os.Looper;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k2 extends a8.a implements s {
    public final k0 b;
    public final d5.c c;

    public k2(r rVar) {
        super(3);
        d5.c cVar = new d5.c();
        this.c = cVar;
        try {
            this.b = new k0(rVar, this);
            cVar.c();
        } catch (Throwable th) {
            this.c.c();
            throw th;
        }
    }

    @Override // h3.c2
    public final r2 A() {
        Q();
        return this.b.A();
    }

    @Override // h3.c2
    public final Looper B() {
        Q();
        return this.b.s;
    }

    @Override // h3.c2
    public final boolean C() {
        Q();
        k0 k0Var = this.b;
        k0Var.q0();
        return k0Var.G;
    }

    @Override // h3.c2
    public final long D() {
        Q();
        return this.b.D();
    }

    @Override // h3.c2
    public final long E() {
        Q();
        k0 k0Var = this.b;
        k0Var.q0();
        return k0Var.u;
    }

    @Override // a8.a
    public final void N() {
        Q();
        this.b.N();
    }

    @Override // a8.a
    public final void O(long j10, int i9, int i10, boolean z10) {
        Q();
        this.b.O(j10, i9, i10, z10);
    }

    public final void Q() {
        this.c.a();
    }

    public final void R(float f10) {
        Q();
        this.b.k0(f10);
    }

    @Override // h3.c2
    public final void a() {
        Q();
        this.b.a();
    }

    @Override // h3.c2
    public final int b() {
        Q();
        return this.b.b();
    }

    @Override // h3.c2
    public final boolean c() {
        Q();
        return this.b.c();
    }

    @Override // h3.c2
    public final long d() {
        Q();
        return this.b.d();
    }

    @Override // h3.c2
    public final void e(int i9) {
        Q();
        this.b.e(i9);
    }

    @Override // h3.c2
    public final y1 f() {
        Q();
        k0 k0Var = this.b;
        k0Var.q0();
        return k0Var.N;
    }

    @Override // h3.c2
    public final int g() {
        Q();
        k0 k0Var = this.b;
        k0Var.q0();
        return k0Var.F;
    }

    @Override // h3.c2
    public final long getDuration() {
        Q();
        return this.b.getDuration();
    }

    @Override // h3.c2
    public final x1 getPlaybackParameters() {
        Q();
        return this.b.getPlaybackParameters();
    }

    @Override // h3.c2
    public final boolean h() {
        Q();
        return this.b.h();
    }

    @Override // h3.c2
    public final void i(boolean z10) {
        Q();
        this.b.i(z10);
    }

    @Override // h3.c2
    public final void j() {
        Q();
        this.b.q0();
    }

    @Override // h3.c2
    public final void k(a2 a2Var) {
        Q();
        this.b.k(a2Var);
    }

    @Override // h3.c2
    public final int l() {
        Q();
        return this.b.l();
    }

    @Override // h3.c2
    public final int m() {
        Q();
        return this.b.m();
    }

    @Override // h3.c2
    public final void n(int i9, int i10) {
        Q();
        this.b.n(i9, i10);
    }

    @Override // h3.c2
    public final void o(boolean z10) {
        Q();
        this.b.o(z10);
    }

    @Override // h3.c2
    public final long p() {
        Q();
        k0 k0Var = this.b;
        k0Var.q0();
        return k0Var.v;
    }

    @Override // h3.c2
    public final long q() {
        Q();
        return this.b.q();
    }

    @Override // h3.c2
    public final void r(a2 a2Var) {
        Q();
        this.b.r(a2Var);
    }

    @Override // h3.c2
    public final void s(int i9, List list) {
        Q();
        this.b.s(i9, list);
    }

    @Override // h3.c2
    public final void setPlaybackParameters(x1 x1Var) {
        Q();
        this.b.setPlaybackParameters(x1Var);
    }

    @Override // h3.c2
    public final void stop() {
        Q();
        this.b.stop();
    }

    @Override // h3.c2
    public final long t() {
        Q();
        return this.b.t();
    }

    @Override // h3.c2
    public final t2 u() {
        Q();
        return this.b.u();
    }

    @Override // h3.c2
    public final n v() {
        Q();
        k0 k0Var = this.b;
        k0Var.q0();
        return k0Var.i0.f;
    }

    @Override // h3.c2
    public final int w() {
        Q();
        return this.b.w();
    }

    @Override // h3.c2
    public final int x() {
        Q();
        return this.b.x();
    }

    @Override // h3.c2
    public final void y(int i9, int i10, int i11) {
        Q();
        this.b.y(i9, i10, i11);
    }

    @Override // h3.c2
    public final int z() {
        Q();
        return this.b.z();
    }
}
