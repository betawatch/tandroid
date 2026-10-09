package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ig extends x51 {
    public final /* synthetic */ jg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(jg jgVar, Context context, org.telegram.ui.ActionBar.n2 n2Var, l61 l61Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, n2Var, l61Var, e6Var);
        this.h = jgVar;
    }

    @Override // org.telegram.ui.Components.x51, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.a3 == this) {
            chatActivityEnterView.a3 = null;
        }
        qg qgVar = chatActivityEnterView.Z2;
        if (qgVar != null) {
            qgVar.C(false);
        }
    }
}
