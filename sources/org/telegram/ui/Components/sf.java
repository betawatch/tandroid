package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sf extends v31 {
    public final /* synthetic */ tf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(tf tfVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, j41 j41Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, n2Var, j41Var, c6Var);
        this.h = tfVar;
    }

    @Override // org.telegram.ui.Components.v31, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.V2 == this) {
            chatActivityEnterView.V2 = null;
        }
        ag agVar = chatActivityEnterView.U2;
        if (agVar != null) {
            agVar.r(false);
        }
    }
}
