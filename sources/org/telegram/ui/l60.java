package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l60 extends eg.v0 {
    public final /* synthetic */ m60 T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l60(m60 m60Var, m60 m60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, i11, activity, m60Var2, f6Var);
        this.T0 = m60Var;
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
