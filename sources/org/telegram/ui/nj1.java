package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
