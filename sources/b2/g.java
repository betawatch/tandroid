package b2;

import android.os.Bundle;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import v7.q7;
import v7.y7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class g implements b1 {
    public Object a;

    @Override // b2.b1
    public long A() {
        i2.e0 e0Var = (i2.e0) this;
        k1 w02 = e0Var.w0();
        if (w02.p()) {
            return -9223372036854775807L;
        }
        return e2.d0.e0(w02.m(e0Var.l0(), (j1) this.a, 0L).m);
    }

    @Override // b2.b1
    public void E0() {
        int e;
        i2.e0 e0Var = (i2.e0) this;
        if (e0Var.w0().p() || e0Var.o()) {
            R0();
            return;
        }
        if (!P0()) {
            if (M0() && t0()) {
                V0(e0Var.l0(), -9223372036854775807L, false);
                return;
            } else {
                R0();
                return;
            }
        }
        k1 w02 = e0Var.w0();
        if (w02.p()) {
            e = -1;
        } else {
            int l02 = e0Var.l0();
            e0Var.B1();
            int i10 = e0Var.F;
            if (i10 == 1) {
                i10 = 0;
            }
            e0Var.B1();
            e = w02.e(l02, i10, e0Var.G);
        }
        if (e == -1) {
            R0();
        } else if (e == e0Var.l0()) {
            V0(e0Var.l0(), -9223372036854775807L, true);
        } else {
            V0(e, -9223372036854775807L, false);
        }
    }

    @Override // b2.b1
    public void F() {
        Y0(6);
    }

    @Override // b2.b1
    public void F0() {
        i2.e0 e0Var = (i2.e0) this;
        e0Var.B1();
        X0(12, e0Var.w);
    }

    @Override // b2.b1
    public void G0() {
        i2.e0 e0Var = (i2.e0) this;
        e0Var.B1();
        X0(11, -e0Var.v);
    }

    @Override // b2.b1
    public void H() {
        V0(((i2.e0) this).l0(), -9223372036854775807L, false);
    }

    @Override // b2.b1
    public boolean M0() {
        i2.e0 e0Var = (i2.e0) this;
        k1 w02 = e0Var.w0();
        return !w02.p() && w02.m(e0Var.l0(), (j1) this.a, 0L).a();
    }

    public abstract Object N0(Object obj);

    public Object O0(Object obj) {
        synchronized (((HashMap) this.a)) {
            try {
                if (((HashMap) this.a).containsKey(obj)) {
                    return ((HashMap) this.a).get(obj);
                }
                Object N0 = N0(obj);
                ((HashMap) this.a).put(obj, N0);
                return N0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean P0() {
        int e;
        i2.e0 e0Var = (i2.e0) this;
        k1 w02 = e0Var.w0();
        if (w02.p()) {
            e = -1;
        } else {
            int l02 = e0Var.l0();
            e0Var.B1();
            int i10 = e0Var.F;
            if (i10 == 1) {
                i10 = 0;
            }
            e0Var.B1();
            e = w02.e(l02, i10, e0Var.G);
        }
        return e != -1;
    }

    @Override // b2.b1
    public boolean Q() {
        return true;
    }

    public boolean Q0() {
        int k10;
        i2.e0 e0Var = (i2.e0) this;
        k1 w02 = e0Var.w0();
        if (w02.p()) {
            k10 = -1;
        } else {
            int l02 = e0Var.l0();
            e0Var.B1();
            int i10 = e0Var.F;
            if (i10 == 1) {
                i10 = 0;
            }
            e0Var.B1();
            k10 = w02.k(l02, i10, e0Var.G);
        }
        return k10 != -1;
    }

    @Override // b2.b1
    public void R(int i10) {
        ((i2.e0) this).S(i10, i10 + 1);
    }

    public void R0() {
        ((i2.e0) this).B1();
    }

    public abstract void S0();

    public abstract r0.l1 T0(r0.l1 l1Var, List list);

    public void U0() {
        synchronized (this.a) {
        }
    }

    @Override // b2.b1
    public void V() {
        i2.e0 e0Var = (i2.e0) this;
        if (e0Var.w0().p() || e0Var.o()) {
            R0();
            return;
        }
        boolean Q0 = Q0();
        if (M0() && !d0()) {
            if (Q0) {
                Y0(7);
                return;
            } else {
                R0();
                return;
            }
        }
        if (Q0) {
            long J0 = e0Var.J0();
            e0Var.B1();
            if (J0 <= e0Var.x) {
                Y0(7);
                return;
            }
        }
        W0(7, 0L);
    }

    public abstract void V0(int i10, long j3, boolean z10);

    public void W0(int i10, long j3) {
        V0(((i2.e0) this).l0(), j3, false);
    }

    public void X0(int i10, long j3) {
        i2.e0 e0Var = (i2.e0) this;
        long J0 = e0Var.J0() + j3;
        long duration = e0Var.getDuration();
        if (duration != -9223372036854775807L) {
            J0 = Math.min(J0, duration);
        }
        W0(i10, Math.max(J0, 0L));
    }

    @Override // b2.b1
    public void Y(int i10) {
        V0(i10, -9223372036854775807L, false);
    }

    public void Y0(int i10) {
        int k10;
        i2.e0 e0Var = (i2.e0) this;
        k1 w02 = e0Var.w0();
        if (w02.p()) {
            k10 = -1;
        } else {
            int l02 = e0Var.l0();
            e0Var.B1();
            int i11 = e0Var.F;
            if (i11 == 1) {
                i11 = 0;
            }
            e0Var.B1();
            k10 = w02.k(l02, i11, e0Var.G);
        }
        if (k10 == -1) {
            R0();
        } else if (k10 == e0Var.l0()) {
            V0(e0Var.l0(), -9223372036854775807L, true);
        } else {
            V0(k10, -9223372036854775807L, false);
        }
    }

    @Override // b2.b1
    public void a(float f7) {
        i2.e0 e0Var = (i2.e0) this;
        e0Var.f(new v0(f7, e0Var.h().b));
    }

    @Override // b2.b1
    public boolean d0() {
        i2.e0 e0Var = (i2.e0) this;
        k1 w02 = e0Var.w0();
        return !w02.p() && w02.m(e0Var.l0(), (j1) this.a, 0L).h;
    }

    @Override // b2.b1
    public void e() {
        ((i2.e0) this).X(false);
    }

    @Override // b2.b1
    public void e0() {
        int e;
        i2.e0 e0Var = (i2.e0) this;
        k1 w02 = e0Var.w0();
        if (w02.p()) {
            e = -1;
        } else {
            int l02 = e0Var.l0();
            e0Var.B1();
            int i10 = e0Var.F;
            if (i10 == 1) {
                i10 = 0;
            }
            e0Var.B1();
            e = w02.e(l02, i10, e0Var.G);
        }
        if (e == -1) {
            R0();
        } else if (e == e0Var.l0()) {
            V0(e0Var.l0(), -9223372036854775807L, true);
        } else {
            V0(e, -9223372036854775807L, false);
        }
    }

    @Override // b2.b1
    public void g(long j3) {
        W0(5, j3);
    }

    @Override // b2.b1
    public void i() {
        ((i2.e0) this).X(true);
    }

    @Override // b2.b1
    public boolean i0() {
        i2.e0 e0Var = (i2.e0) this;
        return e0Var.d() == 3 && e0Var.u() && e0Var.u0() == 0;
    }

    @Override // b2.b1
    public void k(k0 k0Var, long j3) {
        ((i2.e0) this).T(j3, 0, e9.i0.z(k0Var));
    }

    @Override // b2.b1
    public boolean m0(int i10) {
        i2.e0 e0Var = (i2.e0) this;
        e0Var.B1();
        return e0Var.N.a(i10);
    }

    @Override // b2.b1
    public long p() {
        j1 j1Var = (j1) this.a;
        i2.e0 e0Var = (i2.e0) this;
        k1 w02 = e0Var.w0();
        if (w02.p() || w02.m(e0Var.l0(), j1Var, 0L).f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (e2.d0.A(j1Var.g) - j1Var.f) - e0Var.a0();
    }

    @Override // b2.b1
    public void p0(k0 k0Var) {
        ((i2.e0) this).I0(e9.i0.z(k0Var));
    }

    @Override // b2.b1
    public void q0(int i10, int i11) {
        if (i10 != i11) {
            ((i2.e0) this).r0(i10, i10 + 1, i11);
        }
    }

    @Override // b2.b1
    public void s(int i10, long j3) {
        V0(i10, j3, false);
    }

    @Override // b2.b1
    public void s0(k0 k0Var, int i10) {
        ((i2.e0) this).P(i10, i10 + 1, e9.i0.z(k0Var));
    }

    @Override // b2.b1
    public boolean t0() {
        i2.e0 e0Var = (i2.e0) this;
        k1 w02 = e0Var.w0();
        return !w02.p() && w02.m(e0Var.l0(), (j1) this.a, 0L).i;
    }

    @Override // b2.b1
    public void v() {
        ((i2.e0) this).S(0, ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    @Override // b2.b1
    public void v0(List list) {
        ((i2.e0) this).b0(ConnectionsManager.DEFAULT_DATACENTER_ID, list);
    }

    @Override // b2.b1
    public k0 w() {
        i2.e0 e0Var = (i2.e0) this;
        k1 w02 = e0Var.w0();
        if (w02.p()) {
            return null;
        }
        return w02.m(e0Var.l0(), (j1) this.a, 0L).c;
    }

    @Override // b2.b1
    public int y() {
        i2.e0 e0Var = (i2.e0) this;
        long c02 = e0Var.c0();
        long duration = e0Var.getDuration();
        if (c02 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        String str = e2.d0.a;
        long d = q7.d(c02, 100L);
        return e2.d0.h(y7.b((d == Long.MAX_VALUE || d == Long.MIN_VALUE) ? c02 / (duration / 100) : d / duration), 0, 100);
    }

    public g(String str, Bundle data) {
        kotlin.jvm.internal.i.e(data, "data");
        this.a = data;
    }

    public g(int i10) {
        switch (i10) {
            case 3:
                this.a = new Object();
                break;
            case 4:
                this.a = new HashMap();
                break;
            case 5:
            case 6:
            default:
                this.a = new j1();
                break;
            case 7:
                this.a = new LinkedHashMap();
                break;
        }
    }
}
