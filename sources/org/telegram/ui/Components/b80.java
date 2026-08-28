package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b80 extends wh0 {
    public final /* synthetic */ e80 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(e80 e80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = e80Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.n.A = null;
    }
}
