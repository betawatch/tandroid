package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b60 extends ag.i1 {
    public final /* synthetic */ c60 S0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(c60 c60Var, c60 c60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, i11, activity, c60Var2, c6Var);
        this.S0 = c60Var;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.S0.x0 = false;
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void onOpenAnimationEnd() {
        this.S0.x0 = false;
    }
}
