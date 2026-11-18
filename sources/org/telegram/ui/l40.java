package org.telegram.ui;

import android.app.Activity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l40 extends ug.l0 {
    public final /* synthetic */ m40 T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l40(m40 m40Var, m40 m40Var2, Activity activity, int i7, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, i10, activity, m40Var2, i6Var);
        this.T2 = m40Var;
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        super.dismiss();
        this.T2.C0 = false;
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void v() {
        this.T2.C0 = false;
    }
}
