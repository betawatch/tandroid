package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ii1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ki1 a;

    public ii1(ki1 ki1Var) {
        this.a = ki1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ki1 ki1Var = this.a;
        MessageObject messageObject = ki1Var.n;
        if (i10 == -1) {
            ki1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                ki1.V(ki1Var.d, messageObject, ki1Var.getParentActivity(), ki1Var.r, ki1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            ki1Var.showDialog(org.telegram.ui.Components.ir0.S0(ki1Var.getParentActivity(), messageObject, null, false, ki1Var.h));
        }
    }
}
