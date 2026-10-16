package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
