package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o80 extends gi0 {
    public final /* synthetic */ r80 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o80(r80 r80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = r80Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.n.A = null;
    }
}
