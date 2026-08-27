package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class f80 extends yh0 {
    public final /* synthetic */ i80 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f80(i80 i80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = i80Var;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.n.A = null;
    }
}
