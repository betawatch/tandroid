package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class r8 extends org.telegram.ui.ActionBar.h3 {
    public final /* synthetic */ d9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(d9 d9Var, Activity activity) {
        super(activity, true);
        this.b = d9Var;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        d9 d9Var = this.b;
        d9Var.J.v1(d9Var.Y);
        d9Var.f = true;
        d9Var.fragmentView.invalidate();
        d9Var.e.animate().setListener(new org.telegram.ui.Cells.v5(this, 20)).alpha(0.0f).setDuration(200L).start();
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        d9 d9Var = this.b;
        AndroidUtilities.requestAdjustResize(d9Var.getParentActivity(), d9Var.getClassGuid());
        d9Var.S = null;
    }
}
