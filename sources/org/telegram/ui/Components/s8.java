package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class s8 extends org.telegram.ui.ActionBar.e3 {
    public final /* synthetic */ e9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(e9 e9Var, Activity activity) {
        super(activity, true);
        this.b = e9Var;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        e9 e9Var = this.b;
        e9Var.J.w1(e9Var.Y);
        e9Var.f = true;
        e9Var.fragmentView.invalidate();
        e9Var.e.animate().setListener(new r8(this, 0)).alpha(0.0f).setDuration(200L).start();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        e9 e9Var = this.b;
        AndroidUtilities.requestAdjustResize(e9Var.getParentActivity(), e9Var.getClassGuid());
        e9Var.S = null;
    }
}
