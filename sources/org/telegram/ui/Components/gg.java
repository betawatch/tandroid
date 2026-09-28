package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class gg extends f51 {
    public final /* synthetic */ hg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(hg hgVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, t51 t51Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, t51Var, d6Var);
        this.h = hgVar;
    }

    @Override // org.telegram.ui.Components.f51, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.a3 == this) {
            chatActivityEnterView.a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.B(false);
        }
    }
}
