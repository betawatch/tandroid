package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a80 extends zg0 {
    public final /* synthetic */ d80 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(d80 d80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.u1 = d80Var;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        this.u1.F = null;
    }
}
