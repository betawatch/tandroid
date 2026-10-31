package org.telegram.ui;

import java.io.Serializable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld implements org.telegram.ui.Components.gu0, org.telegram.ui.ActionBar.u1, org.telegram.messenger.o20 {
    public final /* synthetic */ le a;

    public /* synthetic */ ld(le leVar) {
        this.a = leVar;
    }

    @Override // org.telegram.ui.Components.gu0
    public int c() {
        return this.a.R0;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.a.m0.presentFragment(new tc1(6, null));
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        le leVar = this.a;
        md mdVar = leVar.s1;
        int i10 = leVar.o0;
        long j10 = leVar.p0;
        int i11 = ((org.telegram.ui.Components.a51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                leVar.m0.presentFragment(new xh.z2(j10));
            }
        } else {
            if (leVar.r0 >= org.telegram.messenger.vp.r1(i10).A4) {
                leVar.j1 = !leVar.j1;
                org.telegram.messenger.i0.r(mdVar);
                org.telegram.messenger.i0.h3(mdVar, 1000L);
                leVar.X0.f3.O(true);
                return;
            }
            if (leVar.q0 == null) {
                return;
            }
            kg.q0 q0Var = new kg.q0(30, leVar.o0, leVar.getContext(), leVar.m0, leVar.n0);
            q0Var.B1(j10);
            q0Var.z1(leVar.q0, true);
            org.telegram.messenger.vp.r1(i10).G0().b(j10, leVar.q0, new ag.e0(15, leVar, q0Var));
        }
    }
}
