package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k8 extends org.telegram.ui.ActionBar.f3 {
    public final /* synthetic */ w8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(w8 w8Var, Activity activity) {
        super(activity, true);
        this.b = w8Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        w8 w8Var = this.b;
        w8Var.F.w1(w8Var.U);
        w8Var.f = true;
        w8Var.fragmentView.invalidate();
        w8Var.e.animate().setListener(new org.telegram.ui.xp(this, 6)).alpha(0.0f).setDuration(200L).start();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        w8 w8Var = this.b;
        AndroidUtilities.requestAdjustResize(w8Var.getParentActivity(), w8Var.getClassGuid());
        w8Var.O = null;
    }
}
