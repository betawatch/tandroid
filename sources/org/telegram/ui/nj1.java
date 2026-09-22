package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class nj1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ pj1 a;

    public nj1(pj1 pj1Var) {
        this.a = pj1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        pj1 pj1Var = this.a;
        MessageObject messageObject = pj1Var.n;
        if (i10 == -1) {
            pj1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                pj1.V(pj1Var.d, messageObject, pj1Var.getParentActivity(), pj1Var.r, pj1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            pj1Var.showDialog(org.telegram.ui.Components.hq0.N0(pj1Var.getParentActivity(), messageObject, null, false, pj1Var.h));
        }
    }
}
