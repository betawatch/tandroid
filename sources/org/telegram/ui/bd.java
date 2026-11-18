package org.telegram.ui;

import java.io.Serializable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd implements org.telegram.ui.Components.mt0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.v10 {
    public final /* synthetic */ xd a;

    public /* synthetic */ bd(xd xdVar) {
        this.a = xdVar;
    }

    @Override // org.telegram.ui.Components.mt0
    public int b() {
        return this.a.S0;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.a.n0.presentFragment(new bb1(6, null));
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        xd xdVar = this.a;
        cd cdVar = xdVar.t1;
        int i7 = xdVar.p0;
        long j3 = xdVar.q0;
        int i10 = ((org.telegram.ui.Components.l41) obj).d;
        if (i10 != 1) {
            if (i10 == 4) {
                xdVar.n0.presentFragment(new ki.i3(j3));
            }
        } else {
            if (xdVar.s0 >= org.telegram.messenger.mp.u1(i7).C4) {
                xdVar.k1 = !xdVar.k1;
                org.telegram.messenger.g0.r(cdVar);
                org.telegram.messenger.g0.h3(cdVar, 1000L);
                xdVar.Y0.g3.O(true);
                return;
            }
            if (xdVar.r0 == null) {
                return;
            }
            ug.l0 l0Var = new ug.l0(30, xdVar.p0, xdVar.getContext(), xdVar.n0, xdVar.o0);
            l0Var.C1(j3);
            l0Var.A1(xdVar.r0, true);
            org.telegram.messenger.mp.u1(i7).I0().b(j3, xdVar.r0, new li.d(12, xdVar, l0Var));
        }
    }
}
