package org.telegram.ui;

import java.io.Serializable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd implements org.telegram.ui.Components.et0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.x10 {
    public final /* synthetic */ xd a;

    public /* synthetic */ bd(xd xdVar) {
        this.a = xdVar;
    }

    @Override // org.telegram.ui.Components.et0
    public int b() {
        return this.a.S0;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a.n0.presentFragment(new xa1(6, null));
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        xd xdVar = this.a;
        cd cdVar = xdVar.t1;
        int i7 = xdVar.p0;
        long j3 = xdVar.q0;
        int i10 = ((org.telegram.ui.Components.b41) obj).d;
        if (i10 != 1) {
            if (i10 == 4) {
                xdVar.n0.presentFragment(new ki.n3(j3));
            }
        } else {
            if (xdVar.s0 >= org.telegram.messenger.np.s1(i7).A4) {
                xdVar.k1 = !xdVar.k1;
                org.telegram.messenger.g0.r(cdVar);
                org.telegram.messenger.g0.i3(cdVar, 1000L);
                xdVar.Y0.g3.O(true);
                return;
            }
            if (xdVar.r0 == null) {
                return;
            }
            ug.j0 j0Var = new ug.j0(30, xdVar.p0, xdVar.getContext(), xdVar.n0, xdVar.o0);
            j0Var.B1(j3);
            j0Var.z1(xdVar.r0, true);
            org.telegram.messenger.np.s1(i7).G0().b(j3, xdVar.r0, new li.v(13, xdVar, j0Var));
        }
    }
}
