package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
