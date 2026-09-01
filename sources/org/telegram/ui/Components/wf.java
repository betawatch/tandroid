package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class wf extends r41 {
    public final /* synthetic */ xf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(xf xfVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, f51 f51Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, p2Var, f51Var, g6Var);
        this.h = xfVar;
    }

    @Override // org.telegram.ui.Components.r41, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
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
