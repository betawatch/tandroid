package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class eg extends t31 {
    public final /* synthetic */ fg q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(fg fgVar, Context context, org.telegram.ui.ActionBar.h2 h2Var, h41 h41Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, h2Var, h41Var, i6Var);
        this.q1 = fgVar;
    }

    @Override // org.telegram.ui.Components.t31, org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.q1.a;
        if (chatActivityEnterView.O3 == this) {
            chatActivityEnterView.O3 = null;
        }
        kg kgVar = chatActivityEnterView.N3;
        if (kgVar != null) {
            kgVar.A(false);
        }
    }
}
