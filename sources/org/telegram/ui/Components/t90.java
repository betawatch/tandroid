package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class t90 extends kj0 {
    public final /* synthetic */ w90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t90(w90 w90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = w90Var;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
