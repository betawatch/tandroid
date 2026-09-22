package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class eg extends q41 {
    public final /* synthetic */ fg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(fg fgVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, e51 e51Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, n2Var, e51Var, e6Var);
        this.h = fgVar;
    }

    @Override // org.telegram.ui.Components.q41, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.Z2 == this) {
            chatActivityEnterView.Z2 = null;
        }
        mg mgVar = chatActivityEnterView.Y2;
        if (mgVar != null) {
            mgVar.B(false);
        }
    }
}
