package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class t8 extends org.telegram.ui.ActionBar.f3 {
    public final /* synthetic */ f9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(f9 f9Var, Activity activity) {
        super(activity, true);
        this.b = f9Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        f9 f9Var = this.b;
        f9Var.J.v1(f9Var.Y);
        f9Var.f = true;
        f9Var.fragmentView.invalidate();
        f9Var.e.animate().setListener(new j6(this, 3)).alpha(0.0f).setDuration(200L).start();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        f9 f9Var = this.b;
        AndroidUtilities.requestAdjustResize(f9Var.getParentActivity(), f9Var.getClassGuid());
        f9Var.S = null;
    }
}
