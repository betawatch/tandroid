package com.google.android.gms.common.api;

import android.os.Bundle;
import e2.c1;
import e2.k1;
import e2.l1;
import e2.w0;
import h2.l0;
import h9.i0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import l2.g0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class q implements c1 {
    public Object a;

    public /* synthetic */ q(Object obj) {
        this.a = obj;
    }

    @Override // e2.c1
    public long B() {
        g0 g0Var = (g0) this;
        l1 z02 = g0Var.z0();
        if (z02.p()) {
            return -9223372036854775807L;
        }
        return l0.h0(z02.m(g0Var.p0(), (k1) this.a, 0L).m);
    }

    @Override // e2.c1
    public void F() {
        b1(6);
    }

    @Override // e2.c1
    public void H() {
        Y0(((g0) this).p0(), -9223372036854775807L, false);
    }

    @Override // e2.c1
    public void I0() {
        int e10;
        g0 g0Var = (g0) this;
        if (g0Var.z0().p() || g0Var.q()) {
            U0();
            return;
        }
        if (!S0()) {
            if (Q0() && w0()) {
                Y0(g0Var.p0(), -9223372036854775807L, false);
                return;
            } else {
                U0();
                return;
            }
        }
        l1 z02 = g0Var.z0();
        if (z02.p()) {
            e10 = -1;
        } else {
            int p02 = g0Var.p0();
            g0Var.F1();
            int i7 = g0Var.H;
            if (i7 == 1) {
                i7 = 0;
            }
            g0Var.F1();
            e10 = z02.e(p02, i7, g0Var.I);
        }
        if (e10 == -1) {
            U0();
        } else if (e10 == g0Var.p0()) {
            Y0(g0Var.p0(), -9223372036854775807L, true);
        } else {
            Y0(e10, -9223372036854775807L, false);
        }
    }

    @Override // e2.c1
    public void J(e2.l0 l0Var) {
        ((g0) this).O0(i0.u(l0Var));
    }

    @Override // e2.c1
    public void K0() {
        g0 g0Var = (g0) this;
        g0Var.F1();
        a1(12, g0Var.m0);
    }

    @Override // e2.c1
    public void M0() {
        g0 g0Var = (g0) this;
        g0Var.F1();
        a1(11, -g0Var.l0);
    }

    @Override // e2.c1
    public boolean Q() {
        return true;
    }

    @Override // e2.c1
    public boolean Q0() {
        g0 g0Var = (g0) this;
        l1 z02 = g0Var.z0();
        return !z02.p() && z02.m(g0Var.p0(), (k1) this.a, 0L).a();
    }

    @Override // e2.c1
    public void R(int i7) {
        ((g0) this).S(i7, i7 + 1);
    }

    public Object R0(Object obj) {
        synchronized (((HashMap) this.a)) {
            try {
                if (((HashMap) this.a).containsKey(obj)) {
                    return ((HashMap) this.a).get(obj);
                }
                Object h = h(obj);
                ((HashMap) this.a).put(obj, h);
                return h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean S0() {
        int e10;
        g0 g0Var = (g0) this;
        l1 z02 = g0Var.z0();
        if (z02.p()) {
            e10 = -1;
        } else {
            int p02 = g0Var.p0();
            g0Var.F1();
            int i7 = g0Var.H;
            if (i7 == 1) {
                i7 = 0;
            }
            g0Var.F1();
            e10 = z02.e(p02, i7, g0Var.I);
        }
        return e10 != -1;
    }

    public boolean T0() {
        int k10;
        g0 g0Var = (g0) this;
        l1 z02 = g0Var.z0();
        if (z02.p()) {
            k10 = -1;
        } else {
            int p02 = g0Var.p0();
            g0Var.F1();
            int i7 = g0Var.H;
            if (i7 == 1) {
                i7 = 0;
            }
            g0Var.F1();
            k10 = z02.k(p02, i7, g0Var.I);
        }
        return k10 != -1;
    }

    public void U0() {
        ((g0) this).F1();
    }

    @Override // e2.c1
    public void V() {
        g0 g0Var = (g0) this;
        if (g0Var.z0().p() || g0Var.q()) {
            U0();
            return;
        }
        boolean T0 = T0();
        if (Q0() && !f0()) {
            if (T0) {
                b1(7);
                return;
            } else {
                U0();
                return;
            }
        }
        if (T0) {
            long n10 = g0Var.n();
            g0Var.F1();
            if (n10 <= g0Var.n0) {
                b1(7);
                return;
            }
        }
        Z0(7, 0L);
    }

    public abstract void V0();

    public abstract r0.l1 W0(r0.l1 l1Var, List list);

    public void X0() {
        synchronized (this.a) {
        }
    }

    public abstract void Y0(int i7, long j3, boolean z10);

    @Override // e2.c1
    public void Z(int i7) {
        Y0(i7, -9223372036854775807L, false);
    }

    public void Z0(int i7, long j3) {
        Y0(((g0) this).p0(), j3, false);
    }

    public void a1(int i7, long j3) {
        g0 g0Var = (g0) this;
        long n10 = g0Var.n() + j3;
        long duration = g0Var.getDuration();
        if (duration != -9223372036854775807L) {
            n10 = Math.min(n10, duration);
        }
        Z0(i7, Math.max(n10, 0L));
    }

    @Override // e2.c1
    public void b() {
        ((g0) this).Y(false);
    }

    public void b1(int i7) {
        int k10;
        g0 g0Var = (g0) this;
        l1 z02 = g0Var.z0();
        if (z02.p()) {
            k10 = -1;
        } else {
            int p02 = g0Var.p0();
            g0Var.F1();
            int i10 = g0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            g0Var.F1();
            k10 = z02.k(p02, i10, g0Var.I);
        }
        if (k10 == -1) {
            U0();
        } else if (k10 == g0Var.p0()) {
            Y0(g0Var.p0(), -9223372036854775807L, true);
        } else {
            Y0(k10, -9223372036854775807L, false);
        }
    }

    @Override // e2.c1
    public void c(long j3) {
        Z0(5, j3);
    }

    public void c1() {
        synchronized (this) {
        }
    }

    @Override // e2.c1
    public void d(float f10) {
        g0 g0Var = (g0) this;
        g0Var.e(new w0(f10, g0Var.l().b));
    }

    public void d1() {
        synchronized (this) {
        }
        c1();
    }

    @Override // e2.c1
    public void f() {
        ((g0) this).Y(true);
    }

    @Override // e2.c1
    public boolean f0() {
        g0 g0Var = (g0) this;
        l1 z02 = g0Var.z0();
        return !z02.p() && z02.m(g0Var.p0(), (k1) this.a, 0L).h;
    }

    @Override // e2.c1
    public void g0(e2.l0 l0Var, long j3) {
        ((g0) this).W(i0.u(l0Var), 0, j3);
    }

    public abstract Object h(Object obj);

    @Override // e2.c1
    public void h0() {
        int e10;
        g0 g0Var = (g0) this;
        l1 z02 = g0Var.z0();
        if (z02.p()) {
            e10 = -1;
        } else {
            int p02 = g0Var.p0();
            g0Var.F1();
            int i7 = g0Var.H;
            if (i7 == 1) {
                i7 = 0;
            }
            g0Var.F1();
            e10 = z02.e(p02, i7, g0Var.I);
        }
        if (e10 == -1) {
            U0();
        } else if (e10 == g0Var.p0()) {
            Y0(g0Var.p0(), -9223372036854775807L, true);
        } else {
            Y0(e10, -9223372036854775807L, false);
        }
    }

    @Override // e2.c1
    public boolean j() {
        g0 g0Var = (g0) this;
        return g0Var.i() == 3 && g0Var.v() && g0Var.x0() == 0;
    }

    @Override // e2.c1
    public void n0(e2.l0 l0Var) {
        ((g0) this).O0(i0.u(l0Var));
    }

    @Override // e2.c1
    public void p(int i7, e2.l0 l0Var) {
        g0 g0Var = (g0) this;
        g0Var.t0(i0.u(l0Var), i7, i7 + 1);
    }

    @Override // e2.c1
    public boolean q0(int i7) {
        g0 g0Var = (g0) this;
        g0Var.F1();
        return g0Var.P.a(i7);
    }

    @Override // e2.c1
    public long r() {
        k1 k1Var = (k1) this.a;
        g0 g0Var = (g0) this;
        l1 z02 = g0Var.z0();
        if (z02.p() || z02.m(g0Var.p0(), k1Var, 0L).f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (l0.C(k1Var.g) - k1Var.f) - g0Var.b0();
    }

    @Override // e2.c1
    public void stop() {
        synchronized (this) {
        }
    }

    @Override // e2.c1
    public void t(int i7, long j3) {
        Y0(i7, j3, false);
    }

    @Override // e2.c1
    public void u0(int i7, int i10) {
        if (i7 != i10) {
            ((g0) this).v0(i7, i7 + 1, i10);
        }
    }

    @Override // e2.c1
    public void w() {
        ((g0) this).S(0, ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    @Override // e2.c1
    public boolean w0() {
        g0 g0Var = (g0) this;
        l1 z02 = g0Var.z0();
        return !z02.p() && z02.m(g0Var.p0(), (k1) this.a, 0L).i;
    }

    @Override // e2.c1
    public e2.l0 x() {
        g0 g0Var = (g0) this;
        l1 z02 = g0Var.z0();
        if (z02.p()) {
            return null;
        }
        return z02.m(g0Var.p0(), (k1) this.a, 0L).c;
    }

    @Override // e2.c1
    public void y0(List list) {
        ((g0) this).c0(ConnectionsManager.DEFAULT_DATACENTER_ID, list);
    }

    @Override // e2.c1
    public int z() {
        if (!q0(16)) {
            return 0;
        }
        g0 g0Var = (g0) this;
        long e02 = g0Var.e0();
        long duration = g0Var.getDuration();
        if (e02 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        String str = l0.a;
        long d = c8.w0.d(e02, 100L);
        return l0.i(c8.l1.e((d == Long.MAX_VALUE || d == Long.MIN_VALUE) ? e02 / (duration / 100) : d / duration), 0, 100);
    }

    public q(String str, Bundle data) {
        kotlin.jvm.internal.j.e(data, "data");
        this.a = data;
    }

    public q(int i7) {
        switch (i7) {
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
                this.a = new k1();
                break;
        }
    }

    public q(rc.u uVar, String str, pb.b bVar) {
        this.a = uVar;
    }
}
