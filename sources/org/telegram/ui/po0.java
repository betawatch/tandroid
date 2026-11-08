package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class po0 extends org.telegram.ui.Components.yv0 {
    public final /* synthetic */ qo0 o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po0(qo0 qo0Var, Activity activity, org.telegram.messenger.ij ijVar, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, ijVar, tLObject, f6Var);
        this.o2 = qo0Var;
    }

    @Override // org.telegram.ui.Components.yv0, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.o2.b;
        if (photoViewer.T3 == this) {
            photoViewer.T3 = null;
        }
    }
}
