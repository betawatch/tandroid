package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class li1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ni1 a;

    public li1(ni1 ni1Var) {
        this.a = ni1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ni1 ni1Var = this.a;
        MessageObject messageObject = ni1Var.n;
        if (i10 == -1) {
            ni1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                ni1.W(ni1Var.d, messageObject, ni1Var.getParentActivity(), ni1Var.r, ni1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            ni1Var.showDialog(org.telegram.ui.Components.mr0.P0(ni1Var.getParentActivity(), messageObject, null, false, ni1Var.h));
        }
    }
}
