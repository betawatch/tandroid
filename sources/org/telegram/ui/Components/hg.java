package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class hg extends t51 {
    public final /* synthetic */ ig h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(ig igVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, h61 h61Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, m2Var, h61Var, c6Var);
        this.h = igVar;
    }

    @Override // org.telegram.ui.Components.t51, org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        ChatActivityEnterView chatActivityEnterView = this.h.a;
        if (chatActivityEnterView.a3 == this) {
            chatActivityEnterView.a3 = null;
        }
        pg pgVar = chatActivityEnterView.Z2;
        if (pgVar != null) {
            pgVar.C(false);
        }
    }
}
