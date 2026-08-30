package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u80 extends qi0 {
    public final /* synthetic */ x80 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u80(x80 x80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = x80Var;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.n.B = null;
    }
}
