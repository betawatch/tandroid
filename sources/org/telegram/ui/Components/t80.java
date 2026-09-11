package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class t80 extends ji0 {
    public final /* synthetic */ w80 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(w80 w80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = w80Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
