package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class f90 extends wi0 {
    public final /* synthetic */ i90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f90(i90 i90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = i90Var;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
