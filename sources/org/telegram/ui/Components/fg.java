package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class fg extends g51 {
    public final /* synthetic */ gg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, u51 u51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, n2Var, u51Var, f6Var);
        this.h = ggVar;
    }

    @Override // org.telegram.ui.Components.g51, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.a3 == this) {
            chatActivityEnterView.a3 = null;
        }
        ng ngVar = chatActivityEnterView.Z2;
        if (ngVar != null) {
            ngVar.B(false);
        }
    }
}
