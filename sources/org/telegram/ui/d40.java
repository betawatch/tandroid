package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d40 extends vg.i0 {
    public final /* synthetic */ e40 Q2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d40(e40 e40Var, e40 e40Var2, Activity activity, int i3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, i10, activity, e40Var2, e6Var);
        this.Q2 = e40Var;
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        this.Q2.C0 = false;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void v() {
        this.Q2.C0 = false;
    }
}
