package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class t80 extends ji0 {
    public final /* synthetic */ w80 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(w80 w80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = w80Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
