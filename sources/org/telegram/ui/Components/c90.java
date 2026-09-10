package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c90 extends ti0 {
    public final /* synthetic */ f90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c90(f90 f90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = f90Var;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
