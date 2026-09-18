package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class b90 extends ui0 {
    public final /* synthetic */ e90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b90(e90 e90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = e90Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
