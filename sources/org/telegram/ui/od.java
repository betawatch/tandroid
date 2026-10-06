package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements org.telegram.ui.Components.xv0, org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ me a;

    public /* synthetic */ od(me meVar) {
        this.a = meVar;
    }

    @Override // org.telegram.ui.Components.xv0
    public int b() {
        return this.a.R0;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.m0.presentFragment(new zg1(6, null));
    }

    @Override // org.telegram.messenger.Utilities.Callback5Return
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        this.a.getClass();
        return Boolean.FALSE;
    }

    @Override // org.telegram.messenger.Utilities.Callback5
    public void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        me meVar = this.a;
        pd pdVar = meVar.s1;
        int i10 = meVar.o0;
        long j3 = meVar.p0;
        int i11 = ((org.telegram.ui.Components.h61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                meVar.m0.presentFragment(new ei.f4(j3));
            }
        } else {
            if (meVar.r0 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                meVar.j1 = !meVar.j1;
                AndroidUtilities.cancelRunOnUIThread(pdVar);
                AndroidUtilities.runOnUIThread(pdVar, 1000L);
                meVar.X0.f3.N(true);
                return;
            }
            if (meVar.q0 == null) {
                return;
            }
            rg.k0 k0Var = new rg.k0(30, meVar.o0, meVar.getContext(), meVar.m0, meVar.n0);
            k0Var.H1(j3);
            k0Var.F1(meVar.q0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, meVar.q0, new qc(1, meVar, k0Var));
        }
    }
}
