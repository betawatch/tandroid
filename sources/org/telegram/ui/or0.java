package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class or0 extends org.telegram.ui.Components.cx0 {
    public final /* synthetic */ pr0 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or0(pr0 pr0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, messageObject, tLObject, b6Var);
        this.r0 = pr0Var;
    }

    @Override // org.telegram.ui.Components.cx0, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.r0.b;
        if (photoViewer.Q3 == this) {
            photoViewer.Q3 = null;
        }
    }
}
