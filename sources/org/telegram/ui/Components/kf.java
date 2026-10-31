package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kf extends h41 {
    public final /* synthetic */ lf m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(lf lfVar, Context context, org.telegram.ui.ActionBar.k2 k2Var, w41 w41Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, k2Var, w41Var, p6Var);
        this.m1 = lfVar;
    }

    @Override // org.telegram.ui.Components.h41, org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.m1.a;
        if (chatActivityEnterView.a3 == this) {
            chatActivityEnterView.a3 = null;
        }
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null) {
            sfVar.B(false);
        }
    }
}
