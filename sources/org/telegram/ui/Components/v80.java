package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
