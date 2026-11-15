package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class q70 extends og0 {
    public final /* synthetic */ t70 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(t70 t70Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.u1 = t70Var;
    }

    @Override // org.telegram.ui.ActionBar.u2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.a2
    public final void dismiss() {
        super.dismiss();
        this.u1.F = null;
    }
}
