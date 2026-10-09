package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pj1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ rj1 a;

    public pj1(rj1 rj1Var) {
        this.a = rj1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        rj1 rj1Var = this.a;
        MessageObject messageObject = rj1Var.n;
        if (i10 == -1) {
            rj1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                rj1.V(rj1Var.d, messageObject, rj1Var.getParentActivity(), rj1Var.r, rj1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            rj1Var.showDialog(org.telegram.ui.Components.mr0.O0(rj1Var.getParentActivity(), messageObject, null, false, rj1Var.h));
        }
    }
}
