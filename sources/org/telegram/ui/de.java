package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class de implements org.telegram.ui.ActionBar.z1, Utilities.Callback5, Utilities.Callback5Return {
    public final /* synthetic */ qe a;

    public /* synthetic */ de(qe qeVar) {
        this.a = qeVar;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.a.w0.presentFragment(new oh1(6, null));
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
        qe qeVar = this.a;
        ud udVar = qeVar.v1;
        int i10 = qeVar.y0;
        long j10 = qeVar.z0;
        int i11 = ((org.telegram.ui.Components.m61) obj).d;
        if (i11 != 1) {
            if (i11 == 4) {
                qeVar.w0.presentFragment(new fi.f4(j10));
            }
        } else {
            if (qeVar.B0 >= MessagesController.getInstance(i10).channelRestrictSponsoredLevelMin) {
                qeVar.m1 = !qeVar.m1;
                AndroidUtilities.cancelRunOnUIThread(udVar);
                AndroidUtilities.runOnUIThread(udVar, 1000L);
                qeVar.a1.W2.N(true);
                return;
            }
            if (qeVar.A0 == null) {
                return;
            }
            sg.j0 j0Var = new sg.j0(30, qeVar.y0, qeVar.getContext(), qeVar.w0, qeVar.x0);
            j0Var.I1(j10);
            j0Var.G1(qeVar.A0, true);
            MessagesController.getInstance(i10).getBoostsController().userCanBoostChannel(j10, qeVar.A0, new uc(1, qeVar, j0Var));
        }
    }
}
