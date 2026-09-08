package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
