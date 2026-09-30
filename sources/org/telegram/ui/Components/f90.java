package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
