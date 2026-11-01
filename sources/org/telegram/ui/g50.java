package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g50 extends kg.q0 {
    public final /* synthetic */ h50 P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g50(h50 h50Var, h50 h50Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, i11, activity, h50Var2, p6Var);
        this.P2 = h50Var;
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
