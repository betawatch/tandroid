package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
