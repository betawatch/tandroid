package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class s8 extends org.telegram.ui.ActionBar.f3 {
    public final /* synthetic */ e9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(e9 e9Var, Activity activity) {
        super(activity, true);
        this.b = e9Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        e9 e9Var = this.b;
        e9Var.J.x1(e9Var.Y);
        e9Var.f = true;
        e9Var.fragmentView.invalidate();
        e9Var.e.animate().setListener(new org.telegram.ui.pq(this, 5)).alpha(0.0f).setDuration(200L).start();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        e9 e9Var = this.b;
        AndroidUtilities.requestAdjustResize(e9Var.getParentActivity(), e9Var.getClassGuid());
        e9Var.S = null;
    }
}
