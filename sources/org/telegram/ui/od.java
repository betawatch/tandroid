package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements org.telegram.ui.Components.wv0, org.telegram.ui.ActionBar.a2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ me a;

    public /* synthetic */ od(me meVar) {
        this.a = meVar;
    }

    @Override // org.telegram.ui.Components.wv0
    public int b() {
        return this.a.U1;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.p1.presentFragment(new bh1(6, null));
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
        pd pdVar = meVar.v2;
        int i10 = meVar.r1;
        long j3 = meVar.s1;
        int i11 = ((org.telegram.ui.Components.g61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                meVar.p1.presentFragment(new ei.f4(j3));
            }
        } else {
            if (meVar.u1 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                meVar.m2 = !meVar.m2;
                AndroidUtilities.cancelRunOnUIThread(pdVar);
                AndroidUtilities.runOnUIThread(pdVar, 1000L);
                meVar.a2.f3.N(true);
                return;
            }
            if (meVar.t1 == null) {
                return;
            }
            rg.k0 k0Var = new rg.k0(30, meVar.r1, meVar.getContext(), meVar.p1, meVar.q1);
            k0Var.H1(j3);
            k0Var.F1(meVar.t1, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j3, meVar.t1, new qc(1, meVar, k0Var));
        }
    }
}
