package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ci1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ei1 a;

    public ci1(ei1 ei1Var) {
        this.a = ei1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ei1 ei1Var = this.a;
        MessageObject messageObject = ei1Var.n;
        if (i10 == -1) {
            ei1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                ei1.V(ei1Var.d, messageObject, ei1Var.getParentActivity(), ei1Var.r, ei1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            ei1Var.showDialog(org.telegram.ui.Components.dr0.O0(ei1Var.getParentActivity(), messageObject, null, false, ei1Var.h));
        }
    }
}
