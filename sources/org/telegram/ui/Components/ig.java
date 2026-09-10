package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ig extends d51 {
    public final /* synthetic */ jg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(jg jgVar, Context context, org.telegram.ui.ActionBar.p2 p2Var, r51 r51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, p2Var, r51Var, f6Var);
        this.h = jgVar;
    }

    @Override // org.telegram.ui.Components.d51, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.Z2 == this) {
            chatActivityEnterView.Z2 = null;
        }
        qg qgVar = chatActivityEnterView.Y2;
        if (qgVar != null) {
            qgVar.B(false);
        }
    }
}
