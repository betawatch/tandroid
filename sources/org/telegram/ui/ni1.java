package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ni1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ pi1 a;

    public ni1(pi1 pi1Var) {
        this.a = pi1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        pi1 pi1Var = this.a;
        MessageObject messageObject = pi1Var.n;
        if (i10 == -1) {
            pi1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                pi1.W(pi1Var.d, messageObject, pi1Var.getParentActivity(), pi1Var.r, pi1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            pi1Var.showDialog(org.telegram.ui.Components.nr0.P0(pi1Var.getParentActivity(), messageObject, null, false, pi1Var.h));
        }
    }
}
