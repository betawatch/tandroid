package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
