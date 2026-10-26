package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class es0 extends org.telegram.ui.Components.cz0 {
    public final /* synthetic */ fs0 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es0(fs0 fs0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity, messageObject, tLObject, u6Var);
        this.x0 = fs0Var;
    }

    @Override // org.telegram.ui.Components.cz0, org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.x0.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
