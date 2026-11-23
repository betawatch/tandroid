package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class hg extends w31 {
    public final /* synthetic */ ig q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(ig igVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, k41 k41Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, g2Var, k41Var, h6Var);
        this.q1 = igVar;
    }

    @Override // org.telegram.ui.Components.w31, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.q1.a;
        if (chatActivityEnterView.Q3 == this) {
            chatActivityEnterView.Q3 = null;
        }
        ng ngVar = chatActivityEnterView.P3;
        if (ngVar != null) {
            ngVar.A(false);
        }
    }
}
