package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class fg extends n51 {
    public final /* synthetic */ gg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, b61 b61Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, b61Var, d6Var);
        this.h = ggVar;
    }

    @Override // org.telegram.ui.Components.n51, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.a3 == this) {
            chatActivityEnterView.a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.C(false);
        }
    }
}
