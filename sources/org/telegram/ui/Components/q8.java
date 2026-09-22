package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class q8 extends org.telegram.ui.ActionBar.f3 {
    public final /* synthetic */ c9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(c9 c9Var, Activity activity) {
        super(activity, true);
        this.b = c9Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        c9 c9Var = this.b;
        c9Var.J.w1(c9Var.Y);
        c9Var.f = true;
        c9Var.fragmentView.invalidate();
        c9Var.e.animate().setListener(new p8(this, 0)).alpha(0.0f).setDuration(200L).start();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        c9 c9Var = this.b;
        AndroidUtilities.requestAdjustResize(c9Var.getParentActivity(), c9Var.getClassGuid());
        c9Var.S = null;
    }
}
