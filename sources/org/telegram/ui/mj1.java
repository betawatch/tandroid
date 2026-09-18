package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class mj1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ oj1 a;

    public mj1(oj1 oj1Var) {
        this.a = oj1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        oj1 oj1Var = this.a;
        MessageObject messageObject = oj1Var.n;
        if (i10 == -1) {
            oj1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                oj1.V(oj1Var.d, messageObject, oj1Var.getParentActivity(), oj1Var.r, oj1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            oj1Var.showDialog(org.telegram.ui.Components.iq0.N0(oj1Var.getParentActivity(), messageObject, null, false, oj1Var.h));
        }
    }
}
