package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class g90 extends wi0 {
    public final /* synthetic */ j90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(j90 j90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = j90Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
