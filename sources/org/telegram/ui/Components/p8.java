package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p8 extends org.telegram.ui.ActionBar.f3 {
    public final /* synthetic */ b9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(b9 b9Var, Activity activity) {
        super(activity, true);
        this.b = b9Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        b9 b9Var = this.b;
        b9Var.F.w1(b9Var.U);
        b9Var.f = true;
        b9Var.fragmentView.invalidate();
        b9Var.e.animate().setListener(new org.telegram.ui.bm(this, 8)).alpha(0.0f).setDuration(200L).start();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        b9 b9Var = this.b;
        AndroidUtilities.requestAdjustResize(b9Var.getParentActivity(), b9Var.getClassGuid());
        b9Var.O = null;
    }
}
