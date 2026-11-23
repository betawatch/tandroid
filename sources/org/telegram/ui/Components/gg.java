package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gg extends v31 {
    public final /* synthetic */ hg q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(hg hgVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, j41 j41Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, g2Var, j41Var, i6Var);
        this.q1 = hgVar;
    }

    @Override // org.telegram.ui.Components.v31, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.q1.a;
        if (chatActivityEnterView.Q3 == this) {
            chatActivityEnterView.Q3 = null;
        }
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar != null) {
            mgVar.w(false);
        }
    }
}
