package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class of extends f31 {
    public final /* synthetic */ pf m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(pf pfVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, u31 u31Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, f2Var, u31Var, g6Var);
        this.m1 = pfVar;
    }

    @Override // org.telegram.ui.Components.f31, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.m1.a;
        if (chatActivityEnterView.a3 == this) {
            chatActivityEnterView.a3 = null;
        }
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.B(false);
        }
    }
}
