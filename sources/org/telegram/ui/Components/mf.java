package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mf extends z21 {
    public final /* synthetic */ nf n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(nf nfVar, Context context, org.telegram.ui.ActionBar.d2 d2Var, n31 n31Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, d2Var, n31Var, e6Var);
        this.n1 = nfVar;
    }

    @Override // org.telegram.ui.Components.z21, org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.n1.a;
        if (chatActivityEnterView.b3 == this) {
            chatActivityEnterView.b3 = null;
        }
        uf ufVar = chatActivityEnterView.a3;
        if (ufVar != null) {
            ufVar.A(false);
        }
    }
}
