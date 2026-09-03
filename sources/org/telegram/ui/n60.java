package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n60 extends eg.v0 {
    public final /* synthetic */ o60 T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n60(o60 o60Var, o60 o60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, i11, activity, o60Var2, f6Var);
        this.T0 = o60Var;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.T0.y0 = false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onOpenAnimationEnd() {
        this.T0.y0 = false;
    }
}
