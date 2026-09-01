package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class v80 extends si0 {
    public final /* synthetic */ y80 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v80(y80 y80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = y80Var;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.n.B = null;
    }
}
