package org.telegram.ui;

import java.io.Serializable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd implements org.telegram.ui.Components.ct0, org.telegram.ui.ActionBar.p1, org.telegram.messenger.s10 {
    public final /* synthetic */ xd a;

    public /* synthetic */ bd(xd xdVar) {
        this.a = xdVar;
    }

    @Override // org.telegram.ui.Components.ct0
    public int c() {
        return this.a.S0;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.a.n0.presentFragment(new ra1(6, null));
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        xd xdVar = this.a;
        cd cdVar = xdVar.t1;
        int i3 = xdVar.p0;
        long j10 = xdVar.q0;
        int i10 = ((org.telegram.ui.Components.r31) obj).d;
        if (i10 != 1) {
            if (i10 == 4) {
                xdVar.n0.presentFragment(new ii.q3(j10));
            }
        } else {
            if (xdVar.s0 >= org.telegram.messenger.hp.s1(i3).z4) {
                xdVar.k1 = !xdVar.k1;
                org.telegram.messenger.g0.r(cdVar);
                org.telegram.messenger.g0.i3(cdVar, 1000L);
                xdVar.Y0.g3.O(true);
                return;
            }
            if (xdVar.r0 == null) {
                return;
            }
            vg.i0 i0Var = new vg.i0(30, xdVar.p0, xdVar.getContext(), xdVar.n0, xdVar.o0);
            i0Var.B1(j10);
            i0Var.z1(xdVar.r0, true);
            org.telegram.messenger.hp.s1(i3).G0().b(j10, xdVar.r0, new mi.f(12, xdVar, i0Var));
        }
    }
}
