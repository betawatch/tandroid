package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class dj1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ fj1 a;

    public dj1(fj1 fj1Var) {
        this.a = fj1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        fj1 fj1Var = this.a;
        MessageObject messageObject = fj1Var.n;
        if (i10 == -1) {
            fj1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                fj1.T(fj1Var.d, messageObject, fj1Var.getParentActivity(), fj1Var.r, fj1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            fj1Var.showDialog(org.telegram.ui.Components.br0.K0(fj1Var.getParentActivity(), messageObject, null, false, fj1Var.h));
        }
    }
}
