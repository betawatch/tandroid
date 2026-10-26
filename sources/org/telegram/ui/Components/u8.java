package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u8 extends org.telegram.ui.ActionBar.k3 {
    public final /* synthetic */ g9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(g9 g9Var, Activity activity) {
        super(activity, true);
        this.b = g9Var;
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        g9 g9Var = this.b;
        g9Var.J.C1(g9Var.Y);
        g9Var.f = true;
        g9Var.fragmentView.invalidate();
        g9Var.e.animate().setListener(new org.telegram.ui.qp(this, 6)).alpha(0.0f).setDuration(200L).start();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        g9 g9Var = this.b;
        AndroidUtilities.requestAdjustResize(g9Var.getParentActivity(), g9Var.getClassGuid());
        g9Var.S = null;
    }
}
