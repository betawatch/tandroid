package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        g9Var.e.animate().setListener(new org.telegram.ui.sp(this, 6)).alpha(0.0f).setDuration(200L).start();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        g9 g9Var = this.b;
        AndroidUtilities.requestAdjustResize(g9Var.getParentActivity(), g9Var.getClassGuid());
        g9Var.S = null;
    }
}
