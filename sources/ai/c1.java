package ai;

import android.os.Bundle;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public abstract class c1 implements b2.f1 {
    public Object a;

    @Override // b2.f1
    public void E() {
        b1(6);
    }

    @Override // b2.f1
    public void G() {
        Y0(((i2.g0) this).n0(), -9223372036854775807L, false);
    }

    @Override // b2.f1
    public void H0() {
        int e;
        i2.g0 g0Var = (i2.g0) this;
        if (g0Var.y0().p() || g0Var.n()) {
            U0();
            return;
        }
        if (!S0()) {
            if (P0() && v0()) {
                Y0(g0Var.n0(), -9223372036854775807L, false);
                return;
            } else {
                U0();
                return;
            }
        }
        b2.o1 y02 = g0Var.y0();
        if (y02.p()) {
            e = -1;
        } else {
            int n02 = g0Var.n0();
            g0Var.F1();
            int i10 = g0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            g0Var.F1();
            e = y02.e(n02, i10, g0Var.I);
        }
        if (e == -1) {
            U0();
        } else if (e == g0Var.n0()) {
            Y0(g0Var.n0(), -9223372036854775807L, true);
        } else {
            Y0(e, -9223372036854775807L, false);
        }
    }

    @Override // b2.f1
    public void I0() {
        i2.g0 g0Var = (i2.g0) this;
        g0Var.F1();
        a1(12, g0Var.m0);
    }

    @Override // b2.f1
    public void J0() {
        i2.g0 g0Var = (i2.g0) this;
        g0Var.F1();
        a1(11, -g0Var.l0);
    }

    @Override // b2.f1
    public boolean P() {
        return true;
    }

    @Override // b2.f1
    public boolean P0() {
        i2.g0 g0Var = (i2.g0) this;
        b2.o1 y02 = g0Var.y0();
        return !y02.p() && y02.m(g0Var.n0(), (b2.n1) this.a, 0L).a();
    }

    @Override // b2.f1
    public void Q(int i10) {
        ((i2.g0) this).R(i10, i10 + 1);
    }

    public abstract Object Q0(Object obj);

    public Object R0(Object obj) {
        synchronized (((HashMap) this.a)) {
            try {
                if (((HashMap) this.a).containsKey(obj)) {
                    return ((HashMap) this.a).get(obj);
                }
                Object Q0 = Q0(obj);
                ((HashMap) this.a).put(obj, Q0);
                return Q0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean S0() {
        int e;
        i2.g0 g0Var = (i2.g0) this;
        b2.o1 y02 = g0Var.y0();
        if (y02.p()) {
            e = -1;
        } else {
            int n02 = g0Var.n0();
            g0Var.F1();
            int i10 = g0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            g0Var.F1();
            e = y02.e(n02, i10, g0Var.I);
        }
        return e != -1;
    }

    public boolean T0() {
        int k10;
        i2.g0 g0Var = (i2.g0) this;
        b2.o1 y02 = g0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int n02 = g0Var.n0();
            g0Var.F1();
            int i10 = g0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            g0Var.F1();
            k10 = y02.k(n02, i10, g0Var.I);
        }
        return k10 != -1;
    }

    public void U0() {
        ((i2.g0) this).F1();
    }

    @Override // b2.f1
    public void V() {
        i2.g0 g0Var = (i2.g0) this;
        if (g0Var.y0().p() || g0Var.n()) {
            U0();
            return;
        }
        boolean T0 = T0();
        if (P0() && !e0()) {
            if (T0) {
                b1(7);
                return;
            } else {
                U0();
                return;
            }
        }
        if (T0) {
            long M0 = g0Var.M0();
            g0Var.F1();
            if (M0 <= g0Var.n0) {
                b1(7);
                return;
            }
        }
        Z0(7, 0L);
    }

    public abstract void V0();

    public abstract r0.k1 W0(r0.k1 k1Var, List list);

    public void X0() {
        synchronized (this.a) {
        }
    }

    @Override // b2.f1
    public void Y(int i10) {
        Y0(i10, -9223372036854775807L, false);
    }

    public abstract void Y0(int i10, long j10, boolean z10);

    public void Z0(int i10, long j10) {
        Y0(((i2.g0) this).n0(), j10, false);
    }

    @Override // b2.f1
    public void a(float f7) {
        i2.g0 g0Var = (i2.g0) this;
        g0Var.f(new b2.z0(f7, g0Var.h().b));
    }

    public void a1(int i10, long j10) {
        i2.g0 g0Var = (i2.g0) this;
        long M0 = g0Var.M0() + j10;
        long duration = g0Var.getDuration();
        if (duration != -9223372036854775807L) {
            M0 = Math.min(M0, duration);
        }
        Z0(i10, Math.max(M0, 0L));
    }

    public void b1(int i10) {
        int k10;
        i2.g0 g0Var = (i2.g0) this;
        b2.o1 y02 = g0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int n02 = g0Var.n0();
            g0Var.F1();
            int i11 = g0Var.H;
            if (i11 == 1) {
                i11 = 0;
            }
            g0Var.F1();
            k10 = y02.k(n02, i11, g0Var.I);
        }
        if (k10 == -1) {
            U0();
        } else if (k10 == g0Var.n0()) {
            Y0(g0Var.n0(), -9223372036854775807L, true);
        } else {
            Y0(k10, -9223372036854775807L, false);
        }
    }

    public void c1() {
        synchronized (this) {
        }
    }

    public void d1() {
        synchronized (this) {
        }
        c1();
    }

    @Override // b2.f1
    public void e() {
        ((i2.g0) this).X(false);
    }

    @Override // b2.f1
    public boolean e0() {
        i2.g0 g0Var = (i2.g0) this;
        b2.o1 y02 = g0Var.y0();
        return !y02.p() && y02.m(g0Var.n0(), (b2.n1) this.a, 0L).h;
    }

    @Override // b2.f1
    public void f0() {
        int e;
        i2.g0 g0Var = (i2.g0) this;
        b2.o1 y02 = g0Var.y0();
        if (y02.p()) {
            e = -1;
        } else {
            int n02 = g0Var.n0();
            g0Var.F1();
            int i10 = g0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            g0Var.F1();
            e = y02.e(n02, i10, g0Var.I);
        }
        if (e == -1) {
            U0();
        } else if (e == g0Var.n0()) {
            Y0(g0Var.n0(), -9223372036854775807L, true);
        } else {
            Y0(e, -9223372036854775807L, false);
        }
    }

    @Override // b2.f1
    public void g(long j10) {
        Z0(5, j10);
    }

    @Override // b2.f1
    public void i() {
        ((i2.g0) this).X(true);
    }

    @Override // b2.f1
    public boolean j0() {
        i2.g0 g0Var = (i2.g0) this;
        return g0Var.d() == 3 && g0Var.t() && g0Var.w0() == 0;
    }

    @Override // b2.f1
    public void k(b2.o0 o0Var, long j10) {
        ((i2.g0) this).S(j10, 0, e9.n0.y(o0Var));
    }

    @Override // b2.f1
    public void l0(b2.o0 o0Var) {
        ((i2.g0) this).L0(e9.n0.y(o0Var));
    }

    @Override // b2.f1
    public long o() {
        b2.n1 n1Var = (b2.n1) this.a;
        i2.g0 g0Var = (i2.g0) this;
        b2.o1 y02 = g0Var.y0();
        if (y02.p() || y02.m(g0Var.n0(), n1Var, 0L).f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (e2.m0.C(n1Var.g) - n1Var.f) - g0Var.a0();
    }

    @Override // b2.f1
    public boolean o0(int i10) {
        i2.g0 g0Var = (i2.g0) this;
        g0Var.F1();
        return g0Var.P.a(i10);
    }

    @Override // b2.f1
    public void r(int i10, long j10) {
        Y0(i10, j10, false);
    }

    @Override // b2.f1
    public void r0(b2.o0 o0Var) {
        ((i2.g0) this).L0(e9.n0.y(o0Var));
    }

    @Override // b2.f1
    public void s0(int i10, int i11) {
        if (i10 != i11) {
            ((i2.g0) this).t0(i10, i10 + 1, i11);
        }
    }

    @Override // b2.f1
    public void stop() {
        synchronized (this) {
        }
    }

    @Override // b2.f1
    public void u() {
        ((i2.g0) this).R(0, ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    @Override // b2.f1
    public void u0(b2.o0 o0Var, int i10) {
        ((i2.g0) this).O(i10, i10 + 1, e9.n0.y(o0Var));
    }

    @Override // b2.f1
    public b2.o0 v() {
        i2.g0 g0Var = (i2.g0) this;
        b2.o1 y02 = g0Var.y0();
        if (y02.p()) {
            return null;
        }
        return y02.m(g0Var.n0(), (b2.n1) this.a, 0L).c;
    }

    @Override // b2.f1
    public boolean v0() {
        i2.g0 g0Var = (i2.g0) this;
        b2.o1 y02 = g0Var.y0();
        return !y02.p() && y02.m(g0Var.n0(), (b2.n1) this.a, 0L).i;
    }

    @Override // b2.f1
    public int x() {
        if (!o0(16)) {
            return 0;
        }
        i2.g0 g0Var = (i2.g0) this;
        long d02 = g0Var.d0();
        long duration = g0Var.getDuration();
        if (d02 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        String str = e2.m0.a;
        long d = v7.n7.d(d02, 100L);
        return e2.m0.i(v7.b8.e((d == Long.MAX_VALUE || d == Long.MIN_VALUE) ? d02 / (duration / 100) : d / duration), 0, 100);
    }

    @Override // b2.f1
    public void x0(List list) {
        ((i2.g0) this).b0(ConnectionsManager.DEFAULT_DATACENTER_ID, list);
    }

    @Override // b2.f1
    public long z() {
        i2.g0 g0Var = (i2.g0) this;
        b2.o1 y02 = g0Var.y0();
        if (y02.p()) {
            return -9223372036854775807L;
        }
        return e2.m0.h0(y02.m(g0Var.n0(), (b2.n1) this.a, 0L).m);
    }

    public c1(String str, Bundle data) {
        kotlin.jvm.internal.i.e(data, "data");
        this.a = data;
    }

    public c1(int i10) {
        switch (i10) {
            case 4:
                this.a = new Object();
                break;
            case 6:
                this.a = new HashMap();
                break;
            case 9:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new b2.n1();
                break;
        }
    }

    public c1(tc.u uVar, String str, rb.b bVar) {
        this.a = uVar;
    }
}
