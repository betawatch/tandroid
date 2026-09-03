package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m60 extends fg.v0 {
    public final /* synthetic */ n60 T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m60(n60 n60Var, n60 n60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, i11, activity, n60Var2, g6Var);
        this.T0 = n60Var;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.T0.y0 = false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onOpenAnimationEnd() {
        this.T0.y0 = false;
    }
}
