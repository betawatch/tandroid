package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wf extends t31 {
    public final /* synthetic */ xf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(xf xfVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, h41 h41Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, o2Var, h41Var, b6Var);
        this.h = xfVar;
    }

    @Override // org.telegram.ui.Components.t31, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.V2 == this) {
            chatActivityEnterView.V2 = null;
        }
        eg egVar = chatActivityEnterView.U2;
        if (egVar != null) {
            egVar.p(false);
        }
    }
}
