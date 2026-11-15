package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vf extends j31 {
    public final /* synthetic */ wf q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(wf wfVar, Context context, org.telegram.ui.ActionBar.e2 e2Var, x31 x31Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e2Var, x31Var, e6Var);
        this.q1 = wfVar;
    }

    @Override // org.telegram.ui.Components.j31, org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.q1.a;
        if (chatActivityEnterView.I3 == this) {
            chatActivityEnterView.I3 = null;
        }
        cg cgVar = chatActivityEnterView.H3;
        if (cgVar != null) {
            cgVar.C(false);
        }
    }
}
