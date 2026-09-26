package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class m60 extends rg.j0 {
    public final /* synthetic */ n60 W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m60(n60 n60Var, n60 n60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, i11, activity, n60Var2, d6Var);
        this.W0 = n60Var;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        this.W0.B0 = false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onOpenAnimationEnd() {
        this.W0.B0 = false;
    }
}
