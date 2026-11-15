package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class no0 extends org.telegram.ui.Components.bw0 {
    public final /* synthetic */ oo0 s2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(oo0 oo0Var, Activity activity, org.telegram.messenger.gj gjVar, TLObject tLObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, gjVar, tLObject, e6Var);
        this.s2 = oo0Var;
    }

    @Override // org.telegram.ui.Components.bw0, org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.s2.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
