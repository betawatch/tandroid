package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wf extends q41 {
    public final /* synthetic */ xf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(xf xfVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, e51 e51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, p2Var, e51Var, f6Var);
        this.h = xfVar;
    }

    @Override // org.telegram.ui.Components.q41, org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.W2 == this) {
            chatActivityEnterView.W2 = null;
        }
        eg egVar = chatActivityEnterView.V2;
        if (egVar != null) {
            egVar.B(false);
        }
    }
}
