package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pr0 extends org.telegram.ui.Components.ex0 {
    public final /* synthetic */ qr0 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr0(qr0 qr0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, messageObject, tLObject, c6Var);
        this.r0 = qr0Var;
    }

    @Override // org.telegram.ui.Components.ex0, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.r0.b;
        if (photoViewer.Q3 == this) {
            photoViewer.Q3 = null;
        }
    }
}
