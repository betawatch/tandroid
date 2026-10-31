package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h50 extends kg.q0 {
    public final /* synthetic */ i50 P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(i50 i50Var, i50 i50Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, i11, activity, i50Var2, p6Var);
        this.P2 = i50Var;
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        this.P2.B0 = false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void w() {
        this.P2.B0 = false;
    }
}
