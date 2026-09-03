package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class be implements org.telegram.ui.ActionBar.c2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ me a;

    public /* synthetic */ be(me meVar) {
        this.a = meVar;
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a.t0.presentFragment(new wg1(6, null));
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
        rd rdVar = meVar.s1;
        int i10 = meVar.v0;
        long j10 = meVar.w0;
        int i11 = ((org.telegram.ui.Components.i51) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                meVar.t0.presentFragment(new rh.d3(j10));
            }
        } else {
            if (meVar.y0 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                meVar.j1 = !meVar.j1;
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                AndroidUtilities.runOnUIThread(rdVar, 1000L);
                meVar.X0.V2.N(true);
                return;
            }
            if (meVar.x0 == null) {
                return;
            }
            eg.v0 v0Var = new eg.v0(30, meVar.v0, meVar.getContext(), meVar.t0, meVar.u0);
            v0Var.H1(j10);
            v0Var.F1(meVar.x0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, meVar.x0, new nh.z1(3, meVar, v0Var));
        }
    }
}
