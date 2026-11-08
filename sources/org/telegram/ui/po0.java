package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
