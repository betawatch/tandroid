package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cs0 extends org.telegram.ui.Components.xx0 {
    public final /* synthetic */ ds0 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs0(ds0 ds0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, messageObject, tLObject, f6Var);
        this.s0 = ds0Var;
    }

    @Override // org.telegram.ui.Components.xx0, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.s0.b;
        if (photoViewer.R3 == this) {
            photoViewer.R3 = null;
        }
    }
}
