package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gs0 extends org.telegram.ui.Components.dz0 {
    public final /* synthetic */ hs0 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(hs0 hs0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, messageObject, tLObject, u6Var);
        this.x0 = hs0Var;
    }

    @Override // org.telegram.ui.Components.dz0, org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.x0.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
