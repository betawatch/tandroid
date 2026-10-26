package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d60 extends tg.j0 {
    public final /* synthetic */ e60 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(e60 e60Var, e60 e60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, i11, activity, e60Var2, u6Var);
        this.X0 = e60Var;
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        this.X0.B0 = false;
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onOpenAnimationEnd() {
        this.X0.B0 = false;
    }
}
