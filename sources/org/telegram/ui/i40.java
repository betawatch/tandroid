package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i40 extends ug.j0 {
    public final /* synthetic */ j40 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i40(j40 j40Var, j40 j40Var2, Activity activity, int i7, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, i10, activity, j40Var2, e6Var);
        this.T2 = j40Var;
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        this.T2.C0 = false;
    }

    @Override // org.telegram.ui.ActionBar.u2
    public final void v() {
        this.T2.C0 = false;
    }
}
