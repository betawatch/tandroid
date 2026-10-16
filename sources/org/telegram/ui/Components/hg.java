package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hg extends u51 {
    public final /* synthetic */ ig h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(ig igVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, i61 i61Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, m2Var, i61Var, c6Var);
        this.h = igVar;
    }

    @Override // org.telegram.ui.Components.u51, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.a3 == this) {
            chatActivityEnterView.a3 = null;
        }
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.D(false);
        }
    }
}
