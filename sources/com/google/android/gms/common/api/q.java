package com.google.android.gms.common.api;

import android.os.Bundle;
import c8.g1;
import c8.t0;
import e2.c1;
import e2.k1;
import e2.l1;
import e2.w0;
import h2.l0;
import h9.i0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import l2.f0;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class q implements c1 {
    public Object a;

    public /* synthetic */ q(Object obj) {
        this.a = obj;
    }

    @Override // e2.c1
    public long A() {
        f0 f0Var = (f0) this;
        l1 y02 = f0Var.y0();
        if (y02.p()) {
            return -9223372036854775807L;
        }
        return l0.h0(y02.m(f0Var.o0(), (k1) this.a, 0L).m);
    }

    @Override // e2.c1
    public void E() {
        b1(6);
    }

    @Override // e2.c1
    public void G() {
        Y0(((f0) this).o0(), -9223372036854775807L, false);
    }

    @Override // e2.c1
    public void H0() {
        int e10;
        f0 f0Var = (f0) this;
        if (f0Var.y0().p() || f0Var.p()) {
            U0();
            return;
        }
        if (!S0()) {
            if (P0() && v0()) {
                Y0(f0Var.o0(), -9223372036854775807L, false);
                return;
            } else {
                U0();
                return;
            }
        }
        l1 y02 = f0Var.y0();
        if (y02.p()) {
            e10 = -1;
        } else {
            int o02 = f0Var.o0();
            f0Var.F1();
            int i7 = f0Var.H;
            if (i7 == 1) {
                i7 = 0;
            }
            f0Var.F1();
            e10 = y02.e(o02, i7, f0Var.I);
        }
        if (e10 == -1) {
            U0();
        } else if (e10 == f0Var.o0()) {
            Y0(f0Var.o0(), -9223372036854775807L, true);
        } else {
            Y0(e10, -9223372036854775807L, false);
        }
    }

    @Override // e2.c1
    public void I(e2.l0 l0Var) {
        ((f0) this).N0(i0.u(l0Var));
    }

    @Override // e2.c1
    public void J0() {
        f0 f0Var = (f0) this;
        f0Var.F1();
        a1(12, f0Var.m0);
    }

    @Override // e2.c1
    public void L0() {
        f0 f0Var = (f0) this;
        f0Var.F1();
        a1(11, -f0Var.l0);
    }

    @Override // e2.c1
    public boolean P() {
        return true;
    }

    @Override // e2.c1
    public boolean P0() {
        f0 f0Var = (f0) this;
        l1 y02 = f0Var.y0();
        return !y02.p() && y02.m(f0Var.o0(), (k1) this.a, 0L).a();
    }

    @Override // e2.c1
    public void Q(int i7) {
        ((f0) this).R(i7, i7 + 1);
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
        int e10;
        f0 f0Var = (f0) this;
        l1 y02 = f0Var.y0();
        if (y02.p()) {
            e10 = -1;
        } else {
            int o02 = f0Var.o0();
            f0Var.F1();
            int i7 = f0Var.H;
            if (i7 == 1) {
                i7 = 0;
            }
            f0Var.F1();
            e10 = y02.e(o02, i7, f0Var.I);
        }
        return e10 != -1;
    }

    public boolean T0() {
        int k10;
        f0 f0Var = (f0) this;
        l1 y02 = f0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int o02 = f0Var.o0();
            f0Var.F1();
            int i7 = f0Var.H;
            if (i7 == 1) {
                i7 = 0;
            }
            f0Var.F1();
            k10 = y02.k(o02, i7, f0Var.I);
        }
        return k10 != -1;
    }

    @Override // e2.c1
    public void U() {
        f0 f0Var = (f0) this;
        if (f0Var.y0().p() || f0Var.p()) {
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
            long l10 = f0Var.l();
            f0Var.F1();
            if (l10 <= f0Var.n0) {
                b1(7);
                return;
            }
        }
        Z0(7, 0L);
    }

    public void U0() {
        ((f0) this).F1();
    }

    public abstract void V0();

    public abstract r0.k1 W0(r0.k1 k1Var, List list);

    public void X0() {
        synchronized (this.a) {
        }
    }

    @Override // e2.c1
    public void Y(int i7) {
        Y0(i7, -9223372036854775807L, false);
    }

    public abstract void Y0(int i7, long j3, boolean z10);

    public void Z0(int i7, long j3) {
        Y0(((f0) this).o0(), j3, false);
    }

    public void a1(int i7, long j3) {
        f0 f0Var = (f0) this;
        long l10 = f0Var.l() + j3;
        long duration = f0Var.getDuration();
        if (duration != -9223372036854775807L) {
            l10 = Math.min(l10, duration);
        }
        Z0(i7, Math.max(l10, 0L));
    }

    @Override // e2.c1
    public void b() {
        ((f0) this).X(false);
    }

    public void b1(int i7) {
        int k10;
        f0 f0Var = (f0) this;
        l1 y02 = f0Var.y0();
        if (y02.p()) {
            k10 = -1;
        } else {
            int o02 = f0Var.o0();
            f0Var.F1();
            int i10 = f0Var.H;
            if (i10 == 1) {
                i10 = 0;
            }
            f0Var.F1();
            k10 = y02.k(o02, i10, f0Var.I);
        }
        if (k10 == -1) {
            U0();
        } else if (k10 == f0Var.o0()) {
            Y0(f0Var.o0(), -9223372036854775807L, true);
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
        f0 f0Var = (f0) this;
        f0Var.e(new w0(f10, f0Var.j().b));
    }

    public void d1() {
        synchronized (this) {
        }
        c1();
    }

    @Override // e2.c1
    public boolean e0() {
        f0 f0Var = (f0) this;
        l1 y02 = f0Var.y0();
        return !y02.p() && y02.m(f0Var.o0(), (k1) this.a, 0L).h;
    }

    @Override // e2.c1
    public void f() {
        ((f0) this).X(true);
    }

    @Override // e2.c1
    public void f0(e2.l0 l0Var, long j3) {
        ((f0) this).V(i0.u(l0Var), 0, j3);
    }

    @Override // e2.c1
    public void g0() {
        int e10;
        f0 f0Var = (f0) this;
        l1 y02 = f0Var.y0();
        if (y02.p()) {
            e10 = -1;
        } else {
            int o02 = f0Var.o0();
            f0Var.F1();
            int i7 = f0Var.H;
            if (i7 == 1) {
                i7 = 0;
            }
            f0Var.F1();
            e10 = y02.e(o02, i7, f0Var.I);
        }
        if (e10 == -1) {
            U0();
        } else if (e10 == f0Var.o0()) {
            Y0(f0Var.o0(), -9223372036854775807L, true);
        } else {
            Y0(e10, -9223372036854775807L, false);
        }
    }

    @Override // e2.c1
    public boolean h() {
        f0 f0Var = (f0) this;
        return f0Var.i() == 3 && f0Var.u() && f0Var.w0() == 0;
    }

    @Override // e2.c1
    public void m0(e2.l0 l0Var) {
        ((f0) this).N0(i0.u(l0Var));
    }

    @Override // e2.c1
    public void o(int i7, e2.l0 l0Var) {
        f0 f0Var = (f0) this;
        f0Var.s0(i0.u(l0Var), i7, i7 + 1);
    }

    @Override // e2.c1
    public boolean p0(int i7) {
        f0 f0Var = (f0) this;
        f0Var.F1();
        return f0Var.P.a(i7);
    }

    @Override // e2.c1
    public long q() {
        k1 k1Var = (k1) this.a;
        f0 f0Var = (f0) this;
        l1 y02 = f0Var.y0();
        if (y02.p() || y02.m(f0Var.o0(), k1Var, 0L).f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (l0.C(k1Var.g) - k1Var.f) - f0Var.a0();
    }

    @Override // e2.c1
    public void s(int i7, long j3) {
        Y0(i7, j3, false);
    }

    @Override // e2.c1
    public void stop() {
        synchronized (this) {
        }
    }

    @Override // e2.c1
    public void t0(int i7, int i10) {
        if (i7 != i10) {
            ((f0) this).u0(i7, i7 + 1, i10);
        }
    }

    @Override // e2.c1
    public void v() {
        ((f0) this).R(0, ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    @Override // e2.c1
    public boolean v0() {
        f0 f0Var = (f0) this;
        l1 y02 = f0Var.y0();
        return !y02.p() && y02.m(f0Var.o0(), (k1) this.a, 0L).i;
    }

    @Override // e2.c1
    public e2.l0 w() {
        f0 f0Var = (f0) this;
        l1 y02 = f0Var.y0();
        if (y02.p()) {
            return null;
        }
        return y02.m(f0Var.o0(), (k1) this.a, 0L).c;
    }

    @Override // e2.c1
    public void x0(List list) {
        ((f0) this).b0(ConnectionsManager.DEFAULT_DATACENTER_ID, list);
    }

    @Override // e2.c1
    public int y() {
        if (!p0(16)) {
            return 0;
        }
        f0 f0Var = (f0) this;
        long d02 = f0Var.d0();
        long duration = f0Var.getDuration();
        if (d02 == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        String str = l0.a;
        long d = t0.d(d02, 100L);
        return l0.i(g1.e((d == Long.MAX_VALUE || d == Long.MIN_VALUE) ? d02 / (duration / 100) : d / duration), 0, 100);
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
