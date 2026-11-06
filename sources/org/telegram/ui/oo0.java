package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class oo0 extends org.telegram.ui.Components.yv0 {
    public final /* synthetic */ po0 o2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0(po0 po0Var, Activity activity, org.telegram.messenger.ij ijVar, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, ijVar, tLObject, f6Var);
        this.o2 = po0Var;
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
