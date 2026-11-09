package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k40 extends ug.i0 {
    public final /* synthetic */ l40 P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(l40 l40Var, l40 l40Var2, Activity activity, int i7, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, i10, activity, l40Var2, g6Var);
        this.P2 = l40Var;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        this.P2.B0 = false;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void v() {
        this.P2.B0 = false;
    }
}
