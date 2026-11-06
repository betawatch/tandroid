package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class of extends y21 {
    public final /* synthetic */ pf m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(pf pfVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, n31 n31Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f2Var, n31Var, f6Var);
        this.m1 = pfVar;
    }

    @Override // org.telegram.ui.Components.y21, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
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
