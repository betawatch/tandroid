package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o60 extends rg.j0 {
    public final /* synthetic */ p60 W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(p60 p60Var, p60 p60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, i11, activity, p60Var2, d6Var);
        this.W0 = p60Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.W0.B0 = false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        this.W0.B0 = false;
    }
}
