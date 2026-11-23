package org.telegram.ui;

import java.io.Serializable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd implements org.telegram.ui.Components.ot0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.u10 {
    public final /* synthetic */ xd a;

    public /* synthetic */ bd(xd xdVar) {
        this.a = xdVar;
    }

    @Override // org.telegram.ui.Components.ot0
    public int b() {
        return this.a.S0;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a.n0.presentFragment(new za1(6, null));
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        xd xdVar = this.a;
        cd cdVar = xdVar.t1;
        int i7 = xdVar.p0;
        long j3 = xdVar.q0;
        int i10 = ((org.telegram.ui.Components.n41) obj).d;
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
            ug.k0 k0Var = new ug.k0(30, xdVar.p0, xdVar.getContext(), xdVar.n0, xdVar.o0);
            k0Var.C1(j3);
            k0Var.A1(xdVar.r0, true);
            org.telegram.messenger.mp.u1(i7).I0().b(j3, xdVar.r0, new ki.n2(13, xdVar, k0Var));
        }
    }
}
