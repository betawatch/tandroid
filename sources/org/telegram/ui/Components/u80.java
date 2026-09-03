package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u80 extends ri0 {
    public final /* synthetic */ x80 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u80(x80 x80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = x80Var;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.n.B = null;
    }
}
