package j3;

import android.os.Looper;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k2 extends ab.e implements s {
    public final k0 b;
    public final f5.c c;

    public k2(r rVar) {
        super(3);
        f5.c cVar = new f5.c();
        this.c = cVar;
        try {
            this.b = new k0(rVar, this);
            cVar.c();
        } catch (Throwable th2) {
            this.c.c();
            throw th2;
        }
    }

    @Override // j3.c2
    public final r2 A() {
        Q();
        return this.b.A();
    }

    @Override // j3.c2
    public final Looper B() {
        Q();
        return this.b.s;
    }

    @Override // j3.c2
    public final boolean C() {
        Q();
        k0 k0Var = this.b;
        k0Var.q0();
        return k0Var.G;
    }

    @Override // j3.c2
    public final long D() {
        Q();
        return this.b.D();
    }

    @Override // j3.c2
    public final long E() {
        Q();
        k0 k0Var = this.b;
        k0Var.q0();
        return k0Var.u;
    }

    @Override // ab.e
    public final void N() {
        Q();
        this.b.N();
    }

    @Override // ab.e
    public final void O(long j10, int i10, int i11, boolean z10) {
        Q();
        this.b.O(j10, i10, i11, z10);
    }

    public final void Q() {
        this.c.a();
    }

    public final void R(float f9) {
        Q();
        this.b.k0(f9);
    }

    @Override // j3.c2
    public final void a() {
        Q();
        this.b.a();
    }

    @Override // j3.c2
    public final int b() {
        Q();
        return this.b.b();
    }

    @Override // j3.c2
    public final boolean c() {
        Q();
        return this.b.c();
    }

    @Override // j3.c2
    public final long d() {
        Q();
        return this.b.d();
    }

    @Override // j3.c2
    public final void e(int i10) {
        Q();
        this.b.e(i10);
    }

    @Override // j3.c2
    public final y1 f() {
        Q();
        k0 k0Var = this.b;
        k0Var.q0();
        return k0Var.N;
    }

    @Override // j3.c2
    public final int g() {
        Q();
        k0 k0Var = this.b;
        k0Var.q0();
        return k0Var.F;
    }

    @Override // j3.c2
    public final long getDuration() {
        Q();
        return this.b.getDuration();
    }

    @Override // j3.c2
    public final x1 getPlaybackParameters() {
        Q();
        return this.b.getPlaybackParameters();
    }

    @Override // j3.c2
    public final boolean h() {
        Q();
        return this.b.h();
    }

    @Override // j3.c2
    public final void i(boolean z10) {
        Q();
        this.b.i(z10);
    }

    @Override // j3.c2
    public final void j() {
        Q();
        this.b.q0();
    }

    @Override // j3.c2
    public final int k() {
        Q();
        return this.b.k();
    }

    @Override // j3.c2
    public final void l(a2 a2Var) {
        Q();
        this.b.l(a2Var);
    }

    @Override // j3.c2
    public final int m() {
        Q();
        return this.b.m();
    }

    @Override // j3.c2
    public final void n(int i10, int i11) {
        Q();
        this.b.n(i10, i11);
    }

    @Override // j3.c2
    public final void o(boolean z10) {
        Q();
        this.b.o(z10);
    }

    @Override // j3.c2
    public final long p() {
        Q();
        k0 k0Var = this.b;
        k0Var.q0();
        return k0Var.v;
    }

    @Override // j3.c2
    public final long q() {
        Q();
        return this.b.q();
    }

    @Override // j3.c2
    public final void r(int i10, List list) {
        Q();
        this.b.r(i10, list);
    }

    @Override // j3.c2
    public final long s() {
        Q();
        return this.b.s();
    }

    @Override // j3.c2
    public final void setPlaybackParameters(x1 x1Var) {
        Q();
        this.b.setPlaybackParameters(x1Var);
    }

    @Override // j3.c2
    public final void stop() {
        Q();
        this.b.stop();
    }

    @Override // j3.c2
    public final t2 t() {
        Q();
        return this.b.t();
    }

    @Override // j3.c2
    public final void u(a2 a2Var) {
        Q();
        this.b.u(a2Var);
    }

    @Override // j3.c2
    public final n v() {
        Q();
        k0 k0Var = this.b;
        k0Var.q0();
        return k0Var.i0.f;
    }

    @Override // j3.c2
    public final int w() {
        Q();
        return this.b.w();
    }

    @Override // j3.c2
    public final int x() {
        Q();
        return this.b.x();
    }

    @Override // j3.c2
    public final void y(int i10, int i11, int i12) {
        Q();
        this.b.y(i10, i11, i12);
    }

    @Override // j3.c2
    public final int z() {
        Q();
        return this.b.z();
    }
}
