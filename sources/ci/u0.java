package ci;

import android.os.Bundle;
import b8.od;
import b8.xc;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class u0 implements d2.e1 {
    public Object a;

    @Override // d2.e1
    public long A() {
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p()) {
            return -9223372036854775807L;
        }
        return g2.n0.h0(y02.m(i0Var.l0(), (d2.m1) this.a, 0L).m);
    }

    @Override // d2.e1
    public void D() {
        b1(6);
    }

    @Override // d2.e1
    public void F() {
        Y0(((k2.i0) this).l0(), -9223372036854775807L, false);
    }

    @Override // d2.e1
    public void I0() {
        int e10;
        k2.i0 i0Var = (k2.i0) this;
        if (i0Var.y0().p() || i0Var.n()) {
            U0();
            return;
        }
        if (!S0()) {
            if (P0() && s0()) {
                Y0(i0Var.l0(), -9223372036854775807L, false);
                return;
            } else {
                U0();
                return;
            }
        }
        d2.n1 y02 = i0Var.y0();
        if (y02.p()) {
            e10 = -1;
        } else {
            int l02 = i0Var.l0();
            i0Var.F1();
            int i3 = i0Var.H;
            if (i3 == 1) {
                i3 = 0;
            }
            i0Var.F1();
            e10 = y02.e(l02, i3, i0Var.I);
        }
        if (e10 == -1) {
            U0();
        } else if (e10 == i0Var.l0()) {
            Y0(i0Var.l0(), -9223372036854775807L, true);
        } else {
            Y0(e10, -9223372036854775807L, false);
        }
    }

    @Override // d2.e1
    public void J0() {
        k2.i0 i0Var = (k2.i0) this;
        i0Var.F1();
        a1(12, i0Var.m0);
    }

    @Override // d2.e1
    public void K0() {
        k2.i0 i0Var = (k2.i0) this;
        i0Var.F1();
        a1(11, -i0Var.l0);
    }

    @Override // d2.e1
    public boolean N() {
        return true;
    }

    @Override // d2.e1
    public void O(int i3) {
        ((k2.i0) this).P(i3, i3 + 1);
    }

    @Override // d2.e1
    public boolean P0() {
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        return !y02.p() && y02.m(i0Var.l0(), (d2.m1) this.a, 0L).a();
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

    @Override // d2.e1
    public void S() {
        k2.i0 i0Var = (k2.i0) this;
        if (i0Var.y0().p() || i0Var.n()) {
            U0();
            return;
        }
        boolean T0 = T0();
        if (P0() && !c0()) {
            if (T0) {
                b1(7);
                return;
            } else {
                U0();
                return;
            }
        }
        if (T0) {
            long N0 = i0Var.N0();
            i0Var.F1();
            if (N0 <= i0Var.n0) {
                b1(7);
                return;
            }
        }
        Z0(7, 0L);
    }

    public boolean S0() {
        int e10;
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p()) {
            e10 = -1;
        } else {
            int l02 = i0Var.l0();
            i0Var.F1();
            int i3 = i0Var.H;
            if (i3 == 1) {
                i3 = 0;
            }
            i0Var.F1();
            e10 = y02.e(l02, i3, i0Var.I);
        }
        return e10 != -1;
    }

    public boolean T0() {
        int k10;
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int l02 = i0Var.l0();
            i0Var.F1();
            int i3 = i0Var.H;
            if (i3 == 1) {
                i3 = 0;
            }
            i0Var.F1();
            k10 = y02.k(l02, i3, i0Var.I);
        }
        return k10 != -1;
    }

    public void U0() {
        ((k2.i0) this).F1();
    }

    public abstract void V0();

    @Override // d2.e1
    public void W(int i3) {
        Y0(i3, -9223372036854775807L, false);
    }

    public abstract r0.k1 W0(r0.k1 k1Var, List list);

    public void X0() {
        synchronized (this.a) {
        }
    }

    public abstract void Y0(int i3, long j10, boolean z10);

    public void Z0(int i3, long j10) {
        Y0(((k2.i0) this).l0(), j10, false);
    }

    public void a1(int i3, long j10) {
        k2.i0 i0Var = (k2.i0) this;
        long N0 = i0Var.N0() + j10;
        long duration = i0Var.getDuration();
        if (duration != -9223372036854775807L) {
            N0 = Math.min(N0, duration);
        }
        Z0(i3, Math.max(N0, 0L));
    }

    @Override // d2.e1
    public void b(float f10) {
        k2.i0 i0Var = (k2.i0) this;
        i0Var.c(new d2.y0(f10, i0Var.g().b));
    }

    public void b1(int i3) {
        int k10;
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int l02 = i0Var.l0();
            i0Var.F1();
            int i10 = i0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            i0Var.F1();
            k10 = y02.k(l02, i10, i0Var.I);
        }
        if (k10 == -1) {
            U0();
        } else if (k10 == i0Var.l0()) {
            Y0(i0Var.l0(), -9223372036854775807L, true);
        } else {
            Y0(k10, -9223372036854775807L, false);
        }
    }

    @Override // d2.e1
    public boolean c0() {
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        return !y02.p() && y02.m(i0Var.l0(), (d2.m1) this.a, 0L).h;
    }

    public void c1() {
        synchronized (this) {
        }
    }

    @Override // d2.e1
    public void d0() {
        int e10;
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p()) {
            e10 = -1;
        } else {
            int l02 = i0Var.l0();
            i0Var.F1();
            int i3 = i0Var.H;
            if (i3 == 1) {
                i3 = 0;
            }
            i0Var.F1();
            e10 = y02.e(l02, i3, i0Var.I);
        }
        if (e10 == -1) {
            U0();
        } else if (e10 == i0Var.l0()) {
            Y0(i0Var.l0(), -9223372036854775807L, true);
        } else {
            Y0(e10, -9223372036854775807L, false);
        }
    }

    public void d1() {
        synchronized (this) {
        }
        c1();
    }

    @Override // d2.e1
    public void e() {
        ((k2.i0) this).V(false);
    }

    @Override // d2.e1
    public void f(long j10) {
        Z0(5, j10);
    }

    @Override // d2.e1
    public boolean i0() {
        k2.i0 i0Var = (k2.i0) this;
        return i0Var.h() == 3 && i0Var.u() && i0Var.t0() == 0;
    }

    @Override // d2.e1
    public void j() {
        ((k2.i0) this).V(true);
    }

    @Override // d2.e1
    public boolean m0(int i3) {
        k2.i0 i0Var = (k2.i0) this;
        i0Var.F1();
        return i0Var.P.a(i3);
    }

    @Override // d2.e1
    public void n0(int i3, d2.n0 n0Var) {
        k2.i0 i0Var = (k2.i0) this;
        i0Var.p0(g9.i0.u(n0Var), i3, i3 + 1);
    }

    @Override // d2.e1
    public void o(d2.n0 n0Var, long j10) {
        ((k2.i0) this).T(g9.i0.u(n0Var), 0, j10);
    }

    @Override // d2.e1
    public long p() {
        d2.m1 m1Var = (d2.m1) this.a;
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p() || y02.m(i0Var.l0(), m1Var, 0L).f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (g2.n0.C(m1Var.g) - m1Var.f) - i0Var.Y();
    }

    @Override // d2.e1
    public void q0(int i3, int i10) {
        if (i3 != i10) {
            ((k2.i0) this).r0(i3, i3 + 1, i10);
        }
    }

    @Override // d2.e1
    public void r(int i3, long j10) {
        Y0(i3, j10, false);
    }

    @Override // d2.e1
    public boolean s0() {
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        return !y02.p() && y02.m(i0Var.l0(), (d2.m1) this.a, 0L).i;
    }

    @Override // d2.e1
    public void stop() {
        synchronized (this) {
        }
    }

    @Override // d2.e1
    public void v() {
        ((k2.i0) this).P(0, ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    @Override // d2.e1
    public void v0(d2.n0 n0Var) {
        ((k2.i0) this).M0(g9.i0.u(n0Var));
    }

    @Override // d2.e1
    public d2.n0 w() {
        k2.i0 i0Var = (k2.i0) this;
        d2.n1 y02 = i0Var.y0();
        if (y02.p()) {
            return null;
        }
        return y02.m(i0Var.l0(), (d2.m1) this.a, 0L).c;
    }

    @Override // d2.e1
    public void w0(List list) {
        ((k2.i0) this).Z(ConnectionsManager.DEFAULT_DATACENTER_ID, list);
    }

    @Override // d2.e1
    public void x0(d2.n0 n0Var) {
        ((k2.i0) this).M0(g9.i0.u(n0Var));
    }

    @Override // d2.e1
    public int y() {
        if (!m0(16)) {
            return 0;
        }
        k2.i0 i0Var = (k2.i0) this;
        long b02 = i0Var.b0();
        long duration = i0Var.getDuration();
        if (b02 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        String str = g2.n0.a;
        long d = xc.d(b02, 100L);
        return g2.n0.i(od.e((d == Long.MAX_VALUE || d == Long.MIN_VALUE) ? b02 / (duration / 100) : d / duration), 0, 100);
    }

    public u0(String str, Bundle data) {
        kotlin.jvm.internal.j.e(data, "data");
        this.a = data;
    }

    public u0(int i3) {
        switch (i3) {
            case 4:
                this.a = new HashMap();
                break;
            case 7:
                this.a = new Object();
                break;
            case 9:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new d2.m1();
                break;
        }
    }

    public u0(oc.u uVar, String str, mb.b bVar) {
        this.a = uVar;
    }
}
