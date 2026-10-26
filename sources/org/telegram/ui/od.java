package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements org.telegram.ui.Components.hw0, org.telegram.ui.ActionBar.b2, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ ke a;

    public /* synthetic */ od(ke keVar) {
        this.a = keVar;
    }

    @Override // org.telegram.ui.Components.hw0
    public int c() {
        return this.a.R0;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.a.m0.presentFragment(new dg1(6, null));
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
        ke keVar = this.a;
        pd pdVar = keVar.s1;
        int i10 = keVar.o0;
        long j10 = keVar.p0;
        int i11 = ((org.telegram.ui.Components.t61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                keVar.m0.presentFragment(new hi.d4(j10));
            }
        } else {
            if (keVar.r0 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                keVar.j1 = !keVar.j1;
                AndroidUtilities.cancelRunOnUIThread(pdVar);
                AndroidUtilities.runOnUIThread(pdVar, 1000L);
                keVar.X0.g3.O(true);
                return;
            }
            if (keVar.q0 == null) {
                return;
            }
            tg.j0 j0Var = new tg.j0(30, keVar.o0, keVar.getContext(), keVar.m0, keVar.n0);
            j0Var.L1(j10);
            j0Var.J1(keVar.q0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, keVar.q0, new li.s2(9, keVar, j0Var));
        }
    }
}
