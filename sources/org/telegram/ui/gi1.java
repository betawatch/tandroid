package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gi1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ii1 a;

    public gi1(ii1 ii1Var) {
        this.a = ii1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        ii1 ii1Var = this.a;
        MessageObject messageObject = ii1Var.n;
        if (i9 == -1) {
            ii1Var.finishFragment();
            return;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                ii1.U(ii1Var.d, messageObject, ii1Var.getParentActivity(), ii1Var.r, ii1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            ii1Var.showDialog(org.telegram.ui.Components.rp0.N0(ii1Var.getParentActivity(), messageObject, null, false, ii1Var.h));
        }
    }
}
