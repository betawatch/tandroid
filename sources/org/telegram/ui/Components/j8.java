package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j8 extends org.telegram.ui.ActionBar.e3 {
    public final /* synthetic */ v8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(v8 v8Var, Activity activity) {
        super(activity, true);
        this.b = v8Var;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        v8 v8Var = this.b;
        v8Var.F.w1(v8Var.U);
        v8Var.f = true;
        v8Var.fragmentView.invalidate();
        v8Var.e.animate().setListener(new org.telegram.ui.am(this, 8)).alpha(0.0f).setDuration(200L).start();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        v8 v8Var = this.b;
        AndroidUtilities.requestAdjustResize(v8Var.getParentActivity(), v8Var.getClassGuid());
        v8Var.O = null;
    }
}
