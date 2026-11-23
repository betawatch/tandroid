package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class l40 extends ug.k0 {
    public final /* synthetic */ m40 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l40(m40 m40Var, m40 m40Var2, Activity activity, int i7, int i10, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, i10, activity, m40Var2, h6Var);
        this.T2 = m40Var;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        this.T2.C0 = false;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        this.T2.C0 = false;
    }
}
