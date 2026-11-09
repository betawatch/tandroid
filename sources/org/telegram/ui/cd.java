package org.telegram.ui;

import java.io.Serializable;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd implements org.telegram.ui.Components.ft0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.a20 {
    public final /* synthetic */ zd a;

    public /* synthetic */ cd(zd zdVar) {
        this.a = zdVar;
    }

    @Override // org.telegram.ui.Components.ft0
    public int b() {
        return this.a.R0;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.a.m0.presentFragment(new bb1(6, null));
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        zd zdVar = this.a;
        dd ddVar = zdVar.s1;
        int i7 = zdVar.o0;
        long j3 = zdVar.p0;
        int i10 = ((org.telegram.ui.Components.y31) obj).d;
        if (i10 != 1) {
            if (i10 == 4) {
                zdVar.m0.presentFragment(new hi.q3(j3));
            }
        } else {
            if (zdVar.r0 >= org.telegram.messenger.qp.s1(i7).z4) {
                zdVar.j1 = !zdVar.j1;
                org.telegram.messenger.g0.r(ddVar);
                org.telegram.messenger.g0.i3(ddVar, 1000L);
                zdVar.X0.f3.O(true);
                return;
            }
            if (zdVar.q0 == null) {
                return;
            }
            ug.i0 i0Var = new ug.i0(30, zdVar.o0, zdVar.getContext(), zdVar.m0, zdVar.n0);
            i0Var.B1(j3);
            i0Var.z1(zdVar.q0, true);
            org.telegram.messenger.qp.s1(i7).G0().b(j3, zdVar.q0, new org.telegram.messenger.voip.k(8, zdVar, i0Var));
        }
    }
}
