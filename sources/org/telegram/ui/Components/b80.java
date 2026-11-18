package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b80 extends yg0 {
    public final /* synthetic */ e80 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(e80 e80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.u1 = e80Var;
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        super.dismiss();
        this.u1.F = null;
    }
}
