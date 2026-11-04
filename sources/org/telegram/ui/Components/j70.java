package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j70 extends og0 {
    public final /* synthetic */ m70 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(m70 m70Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.r1 = m70Var;
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        super.dismiss();
        this.r1.F = null;
    }
}
