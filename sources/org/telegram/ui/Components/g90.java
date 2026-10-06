package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class g90 extends wi0 {
    public final /* synthetic */ j90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(j90 j90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = j90Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
