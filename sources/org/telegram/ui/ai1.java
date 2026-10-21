package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class ai1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ci1 a;

    public ai1(ci1 ci1Var) {
        this.a = ci1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ci1 ci1Var = this.a;
        MessageObject messageObject = ci1Var.n;
        if (i10 == -1) {
            ci1Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                ci1.V(ci1Var.d, messageObject, ci1Var.getParentActivity(), ci1Var.r, ci1Var.e);
            }
        } else if (messageObject != null) {
            messageObject.messageOwner.with_my_score = false;
            ci1Var.showDialog(org.telegram.ui.Components.fr0.P0(ci1Var.getParentActivity(), messageObject, null, false, ci1Var.h));
        }
    }
}
