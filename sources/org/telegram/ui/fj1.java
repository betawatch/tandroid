package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class fj1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ hj1 a;

    public fj1(hj1 hj1Var) {
        this.a = hj1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        hj1 hj1Var = this.a;
        MessageObject messageObject = hj1Var.n;
        if (i10 == -1) {
            hj1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                hj1.V(hj1Var.d, messageObject, hj1Var.getParentActivity(), hj1Var.r, hj1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            hj1Var.showDialog(org.telegram.ui.Components.hq0.N0(hj1Var.getParentActivity(), messageObject, null, false, hj1Var.h));
        }
    }
}
