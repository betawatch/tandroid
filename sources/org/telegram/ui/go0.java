package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class go0 extends org.telegram.ui.Components.xv0 {
    public final /* synthetic */ ho0 p2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go0(ho0 ho0Var, Activity activity, org.telegram.messenger.zi ziVar, TLObject tLObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, ziVar, tLObject, e6Var);
        this.p2 = ho0Var;
    }

    @Override // org.telegram.ui.Components.xv0, org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.p2.b;
        if (photoViewer.V3 == this) {
            photoViewer.V3 = null;
        }
    }
}
