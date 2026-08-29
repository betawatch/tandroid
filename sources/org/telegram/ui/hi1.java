package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hi1 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ji1 a;

    public hi1(ji1 ji1Var) {
        this.a = ji1Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        ji1 ji1Var = this.a;
        MessageObject messageObject = ji1Var.n;
        if (i10 == -1) {
            ji1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                ji1.V(ji1Var.d, messageObject, ji1Var.getParentActivity(), ji1Var.r, ji1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            ji1Var.showDialog(org.telegram.ui.Components.dq0.N0(ji1Var.getParentActivity(), messageObject, null, false, ji1Var.h));
        }
    }
}
