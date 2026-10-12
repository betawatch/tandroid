package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class v8 extends org.telegram.ui.ActionBar.e3 {
    public final /* synthetic */ h9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(h9 h9Var, Activity activity) {
        super(activity, true);
        this.b = h9Var;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        h9 h9Var = this.b;
        h9Var.J.x1(h9Var.Y);
        h9Var.f = true;
        h9Var.fragmentView.invalidate();
        h9Var.e.animate().setListener(new l6(this, 3)).alpha(0.0f).setDuration(200L).start();
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        h9 h9Var = this.b;
        AndroidUtilities.requestAdjustResize(h9Var.getParentActivity(), h9Var.getClassGuid());
        h9Var.S = null;
    }
}
