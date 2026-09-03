package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class cs0 extends org.telegram.ui.Components.xx0 {
    public final /* synthetic */ ds0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs0(ds0 ds0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, messageObject, tLObject, g6Var);
        this.s0 = ds0Var;
    }

    @Override // org.telegram.ui.Components.xx0, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.s0.b;
        if (photoViewer.R3 == this) {
            photoViewer.R3 = null;
        }
    }
}
