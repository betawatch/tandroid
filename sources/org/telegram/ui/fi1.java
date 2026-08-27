package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class fi1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ hi1 a;

    public fi1(hi1 hi1Var) {
        this.a = hi1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        hi1 hi1Var = this.a;
        MessageObject messageObject = hi1Var.n;
        if (i10 == -1) {
            hi1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                hi1.V(hi1Var.d, messageObject, hi1Var.getParentActivity(), hi1Var.r, hi1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            hi1Var.showDialog(org.telegram.ui.Components.sp0.N0(hi1Var.getParentActivity(), messageObject, null, false, hi1Var.h));
        }
    }
}
