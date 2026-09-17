package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class nj1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ qj1 a;

    public nj1(qj1 qj1Var) {
        this.a = qj1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        qj1 qj1Var = this.a;
        MessageObject messageObject = qj1Var.n;
        if (i10 == -1) {
            qj1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                qj1.V(qj1Var.d, messageObject, qj1Var.getParentActivity(), qj1Var.r, qj1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            qj1Var.showDialog(org.telegram.ui.Components.hq0.N0(qj1Var.getParentActivity(), messageObject, null, false, qj1Var.h));
        }
    }
}
