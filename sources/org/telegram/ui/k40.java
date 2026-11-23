package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k40 extends ug.k0 {
    public final /* synthetic */ l40 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(l40 l40Var, l40 l40Var2, Activity activity, int i7, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, i10, activity, l40Var2, i6Var);
        this.T2 = l40Var;
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
