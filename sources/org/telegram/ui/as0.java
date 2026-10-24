package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class as0 extends org.telegram.ui.Components.ty0 {
    public final /* synthetic */ bs0 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as0(bs0 bs0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, messageObject, tLObject, g6Var);
        this.x0 = bs0Var;
    }

    @Override // org.telegram.ui.Components.ty0, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.x0.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
