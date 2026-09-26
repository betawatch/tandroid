package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class d90 extends ui0 {
    public final /* synthetic */ g90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d90(g90 g90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = g90Var;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
