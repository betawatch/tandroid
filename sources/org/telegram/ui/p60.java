package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p60 extends rg.j0 {
    public final /* synthetic */ q60 W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p60(q60 q60Var, q60 q60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, i11, activity, q60Var2, e6Var);
        this.W0 = q60Var;
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
