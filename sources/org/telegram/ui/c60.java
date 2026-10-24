package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class c60 extends sg.j0 {
    public final /* synthetic */ d60 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c60(d60 d60Var, d60 d60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, i11, activity, d60Var2, g6Var);
        this.X0 = d60Var;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.X0.B0 = false;
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onOpenAnimationEnd() {
        this.X0.B0 = false;
    }
}
