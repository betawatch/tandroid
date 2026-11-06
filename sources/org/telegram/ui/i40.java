package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class i40 extends ug.i0 {
    public final /* synthetic */ j40 P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i40(j40 j40Var, j40 j40Var2, Activity activity, int i7, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, i10, activity, j40Var2, f6Var);
        this.P2 = j40Var;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        this.P2.B0 = false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void v() {
        this.P2.B0 = false;
    }
}
