package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bj1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ dj1 a;

    public bj1(dj1 dj1Var) {
        this.a = dj1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        dj1 dj1Var = this.a;
        MessageObject messageObject = dj1Var.n;
        if (i10 == -1) {
            dj1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                dj1.V(dj1Var.d, messageObject, dj1Var.getParentActivity(), dj1Var.r, dj1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            dj1Var.showDialog(org.telegram.ui.Components.lq0.N0(dj1Var.getParentActivity(), messageObject, null, false, dj1Var.h));
        }
    }
}
