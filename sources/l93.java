// default package

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class l93 implements mc8, vx6, wq3 {
    public final adb a;
    public final xnb b;
    public final znb c;
    public final ep d;
    public final SparseArray e;
    public a66 f;
    public y54 h;
    public cdb n;
    public boolean r;

    public l93(adb adbVar) {
        adbVar.getClass();
        this.a = adbVar;
        this.f = new a66(g8c.z().getThread());
        xnb xnbVar = new xnb();
        this.b = xnbVar;
        this.c = new znb();
        ep epVar = new ep();
        epVar.a = xnbVar;
        km5 km5Var = mm5.b;
        epVar.b = w59.e;
        epVar.c = b69.h;
        this.d = epVar;
        this.e = new SparseArray();
    }

    @Override // mc8
    public final void A(int i, nc8 nc8Var, nc8 nc8Var2) {
        if (i == 1) {
            this.r = false;
        }
        y54 y54Var = this.h;
        y54Var.getClass();
        ep epVar = this.d;
        epVar.d = ep.e(y54Var, (mm5) epVar.b, (rx6) epVar.e, (xnb) epVar.a);
        tj Q = Q();
        V(Q, 11, new h93(Q, i, nc8Var, nc8Var2));
    }

    @Override // mc8
    public final void B(jr6 jr6Var) {
        tj Q = Q();
        V(Q, 14, new i93(Q, jr6Var, (byte) 3));
    }

    @Override // mc8
    public final void C(jr6 jr6Var) {
        tj Q = Q();
        V(Q, 15, new i93(Q, jr6Var, (byte) 27));
    }

    @Override // mc8
    public final void D(aob aobVar, int i) {
        y54 y54Var = this.h;
        y54Var.getClass();
        ep epVar = this.d;
        epVar.d = ep.e(y54Var, (mm5) epVar.b, (rx6) epVar.e, (xnb) epVar.a);
        epVar.q(y54Var.y0());
        tj Q = Q();
        V(Q, 0, new k93(Q, i));
    }

    @Override // mc8
    public final void E(j54 j54Var) {
        rx6 rx6Var;
        tj Q = (!(j54Var instanceof j54) || (rx6Var = j54Var.r) == null) ? Q() : R(rx6Var);
        V(Q, 10, new jz2(Q, (Object) j54Var, (byte) 18));
    }

    @Override // mc8
    public final void F(j54 j54Var) {
        rx6 rx6Var;
        tj Q = (!(j54Var instanceof j54) || (rx6Var = j54Var.r) == null) ? Q() : R(rx6Var);
        V(Q, 10, new vu2(Q, j54Var, (byte) 13));
    }

    @Override // mc8
    public final void G(w59 w59Var) {
        tj Q = Q();
        V(Q, 27, new jz2(Q, (Object) w59Var, (byte) 22));
    }

    @Override // mc8
    public final void H(int i, boolean z) {
        tj Q = Q();
        V(Q, -1, new jz2(Q, z, i, (byte) 11));
    }

    @Override // wq3
    public final void I(int i, rx6 rx6Var) {
        tj T = T(i, rx6Var);
        V(T, 1027, new i93(T, (byte) 18));
    }

    @Override // mc8
    public final void J(zb8 zb8Var) {
        tj Q = Q();
        V(Q, 12, new jz2(Q, (Object) zb8Var, (byte) 9));
    }

    @Override // mc8
    public final void K(kc8 kc8Var) {
        tj Q = Q();
        V(Q, 13, new k93(Q, kc8Var));
    }

    @Override // mc8
    public final void L(ld7 ld7Var) {
        tj Q = Q();
        V(Q, 28, new jz2(Q, (Object) ld7Var, (byte) 13));
    }

    @Override // mc8
    public final void M(int i, int i2) {
        tj U = U();
        V(U, 24, new jz2(U, i, i2));
    }

    @Override // wq3
    public final void N(int i, rx6 rx6Var, vi2 vi2Var) {
        tj T = T(i, rx6Var);
        V(T, 1023, new i93(T, vi2Var, (byte) 25));
    }

    @Override // vx6
    public final void O(int i, rx6 rx6Var, f86 f86Var, fr6 fr6Var, int i2) {
        tj T = T(i, rx6Var);
        V(T, 1000, new i93(T, f86Var, fr6Var, i2));
    }

    @Override // mc8
    public final void P(boolean z) {
        tj Q = Q();
        V(Q, 7, new jz2(Q, z));
    }

    public final tj Q() {
        return R((rx6) this.d.d);
    }

    public final tj R(rx6 rx6Var) {
        this.h.getClass();
        aob aobVar = rx6Var == null ? null : (aob) ((b69) this.d.c).get(rx6Var);
        if (rx6Var != null && aobVar != null) {
            return S(aobVar, aobVar.g(rx6Var.a, this.b).c, rx6Var);
        }
        int l0 = this.h.l0();
        aob y0 = this.h.y0();
        if (l0 >= y0.o()) {
            y0 = aob.a;
        }
        return S(y0, l0, null);
    }

    public final tj S(aob aobVar, int i, rx6 rx6Var) {
        rx6 rx6Var2 = aobVar.p() ? null : rx6Var;
        this.a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = aobVar.equals(this.h.y0()) && i == this.h.l0();
        long j = 0;
        if (rx6Var2 == null || !rx6Var2.c()) {
            if (z) {
                j = this.h.Y();
            } else if (!aobVar.p()) {
                j = g8c.i0(aobVar.m(i, this.c, 0L).k);
            }
        } else if (z && this.h.k0() == rx6Var2.b && this.h.L() == rx6Var2.c) {
            j = this.h.m();
        }
        return new tj(elapsedRealtime, aobVar, i, rx6Var2, j, this.h.y0(), this.h.l0(), (rx6) this.d.d, this.h.m(), this.h.o());
    }

    public final tj T(int i, rx6 rx6Var) {
        this.h.getClass();
        if (rx6Var != null) {
            return ((aob) ((b69) this.d.c).get(rx6Var)) != null ? R(rx6Var) : S(aob.a, i, rx6Var);
        }
        aob y0 = this.h.y0();
        if (i >= y0.o()) {
            y0 = aob.a;
        }
        return S(y0, i, null);
    }

    public final tj U() {
        return R((rx6) this.d.f);
    }

    public final void V(tj tjVar, int i, x56 x56Var) {
        this.e.put(i, tjVar);
        this.f.e(i, x56Var);
    }

    public final void W(y54 y54Var, Looper looper) {
        gre.p(this.h == null || ((mm5) this.d.b).isEmpty());
        this.h = y54Var;
        this.n = this.a.a(looper, null);
        a66 a66Var = this.f;
        v82 v82Var = new v82((Object) this, (Object) y54Var, (byte) 15);
        adb adbVar = this.a;
        gre.p(adbVar != null);
        this.f = new a66(a66Var.d, looper, looper.getThread(), adbVar, v82Var, a66Var.i);
    }

    @Override // mc8
    public final void a(icc iccVar) {
        tj U = U();
        V(U, 25, new j93(U, iccVar));
    }

    @Override // mc8
    public final void b(int i) {
        tj Q = Q();
        V(Q, 6, new jz2(Q, i, (byte) 16));
    }

    @Override // mc8
    public final void d(int i) {
        tj U = U();
        V(U, 21, new i93(U, i, (byte) 13));
    }

    @Override // mc8
    public final void g(int i) {
        tj Q = Q();
        V(Q, 8, new jz2(Q, i, (byte) 25));
    }

    @Override // mc8
    public final void h(boolean z) {
        tj U = U();
        V(U, 23, new i93(U, z, (byte) 21));
    }

    @Override // wq3
    public final void i(int i, rx6 rx6Var, Exception exc) {
        tj T = T(i, rx6Var);
        V(T, 1024, new i93(T, exc, (byte) 9));
    }

    @Override // vx6
    public final void j(int i, rx6 rx6Var, fr6 fr6Var) {
        tj T = T(i, rx6Var);
        V(T, 1004, new v82((Object) T, (Object) fr6Var, (byte) 16));
    }

    @Override // vx6
    public final void k(int i, rx6 rx6Var, fr6 fr6Var) {
        tj T = T(i, rx6Var);
        V(T, 1005, new i93(T, fr6Var, (byte) 17));
    }

    @Override // mc8
    public final void l(nz nzVar) {
        tj U = U();
        V(U, 20, new jz2(U, (Object) nzVar, (byte) 12));
    }

    @Override // mc8
    public final void m(byb bybVar) {
        tj Q = Q();
        V(Q, 19, new i93(Q, bybVar, (byte) 20));
    }

    @Override // wq3
    public final void n(int i, rx6 rx6Var, int i2) {
        tj T = T(i, rx6Var);
        V(T, 1022, new i93(T, i2, (byte) 8));
    }

    @Override // mc8
    public final void o(boolean z) {
        tj Q = Q();
        V(Q, 3, new i93(Q, z, (byte) 14));
    }

    @Override // mc8
    public final void p(int i, boolean z) {
        tj Q = Q();
        V(Q, 5, new jz2(Q, z, i, (byte) 20));
    }

    @Override // mc8
    public final void q(float f) {
        tj U = U();
        V(U, 22, new k93(U, f));
    }

    @Override // mc8
    public final void r(int i, br6 br6Var) {
        tj Q = Q();
        V(Q, 1, new k93(Q, br6Var, i));
    }

    @Override // vx6
    public final void s(int i, rx6 rx6Var, f86 f86Var, fr6 fr6Var) {
        tj T = T(i, rx6Var);
        V(T, 1002, new i93(T, (Object) f86Var, (Object) fr6Var, (byte) 6));
    }

    @Override // mc8
    public final void t(int i) {
        tj Q = Q();
        V(Q, 4, new jz2(Q, i, (byte) 24));
    }

    @Override // vx6
    public final void u(int i, rx6 rx6Var, f86 f86Var, fr6 fr6Var) {
        tj T = T(i, rx6Var);
        V(T, 1001, new i93(T, (Object) f86Var, (Object) fr6Var, (byte) 10));
    }

    @Override // mc8
    public final void v(boolean z) {
        tj Q = Q();
        V(Q, 9, new i93(Q, z, (byte) 28));
    }

    @Override // vx6
    public final void w(int i, rx6 rx6Var, f86 f86Var, fr6 fr6Var, IOException iOException, boolean z) {
        tj T = T(i, rx6Var);
        V(T, 1003, new vu2(T, f86Var, fr6Var, iOException, z));
    }

    @Override // mc8
    public final void x(v33 v33Var) {
        tj Q = Q();
        V(Q, 27, new jz2(Q, (Object) v33Var, (byte) 26));
    }

    @Override // wq3
    public final void y(int i, rx6 rx6Var) {
        tj T = T(i, rx6Var);
        V(T, 1025, new i93(T, (byte) 26));
    }

    @Override // mc8
    public final void z(eyb eybVar) {
        tj Q = Q();
        V(Q, 2, new jz2(Q, (Object) eybVar, (byte) 19));
    }

    @Override // mc8
    public final void onRenderedFirstFrame() {
    }

    @Override // mc8
    public final void c(lc8 lc8Var) {
    }

    @Override // mc8
    public final void e(boolean z) {
    }

    @Override // mc8
    public final void f(int i) {
    }
}
