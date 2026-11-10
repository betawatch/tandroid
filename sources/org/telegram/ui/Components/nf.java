package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nf extends e31 {
    public final /* synthetic */ of p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf(of ofVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, t31 t31Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, f2Var, t31Var, h6Var);
        this.p1 = ofVar;
    }

    @Override // org.telegram.ui.Components.e31, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.p1.a;
        if (chatActivityEnterView.a3 == this) {
            chatActivityEnterView.a3 = null;
        }
        vf vfVar = chatActivityEnterView.Z2;
        if (vfVar != null) {
            vfVar.B(false);
        }
    }
}
