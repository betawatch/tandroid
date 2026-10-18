package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class n90 extends fj0 {
    public final /* synthetic */ q90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(q90 q90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = q90Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
