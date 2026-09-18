package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
