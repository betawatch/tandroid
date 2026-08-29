package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nr0 extends org.telegram.ui.Components.nx0 {
    public final /* synthetic */ or0 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(or0 or0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, messageObject, tLObject, c6Var);
        this.r0 = or0Var;
    }

    @Override // org.telegram.ui.Components.nx0, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.r0.b;
        if (photoViewer.Q3 == this) {
            photoViewer.Q3 = null;
        }
    }
}
