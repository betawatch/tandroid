package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wf extends p41 {
    public final /* synthetic */ xf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(xf xfVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, d51 d51Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, p2Var, d51Var, g6Var);
        this.h = xfVar;
    }

    @Override // org.telegram.ui.Components.p41, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.W2 == this) {
            chatActivityEnterView.W2 = null;
        }
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.A(false);
        }
    }
}
