package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fg extends c61 {
    public final /* synthetic */ gg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(gg ggVar, Context context, org.telegram.ui.ActionBar.r2 r2Var, q61 q61Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, r2Var, q61Var, u6Var);
        this.f = ggVar;
    }

    @Override // org.telegram.ui.Components.c61, org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.f.a;
        if (chatActivityEnterView.a3 == this) {
            chatActivityEnterView.a3 = null;
        }
        og ogVar = chatActivityEnterView.Z2;
        if (ogVar != null) {
            ogVar.w(false);
        }
    }
}
