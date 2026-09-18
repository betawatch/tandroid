package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class lj1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ nj1 a;

    public lj1(nj1 nj1Var) {
        this.a = nj1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        nj1 nj1Var = this.a;
        MessageObject messageObject = nj1Var.n;
        if (i10 == -1) {
            nj1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                nj1.V(nj1Var.d, messageObject, nj1Var.getParentActivity(), nj1Var.r, nj1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            nj1Var.showDialog(org.telegram.ui.Components.vq0.N0(nj1Var.getParentActivity(), messageObject, null, false, nj1Var.h));
        }
    }
}
