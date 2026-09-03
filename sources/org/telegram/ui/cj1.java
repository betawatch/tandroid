package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class cj1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ej1 a;

    public cj1(ej1 ej1Var) {
        this.a = ej1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ej1 ej1Var = this.a;
        MessageObject messageObject = ej1Var.n;
        if (i10 == -1) {
            ej1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                ej1.V(ej1Var.d, messageObject, ej1Var.getParentActivity(), ej1Var.r, ej1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            ej1Var.showDialog(org.telegram.ui.Components.lq0.N0(ej1Var.getParentActivity(), messageObject, null, false, ej1Var.h));
        }
    }
}
