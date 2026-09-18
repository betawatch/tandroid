package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s80 extends ki0 {
    public final /* synthetic */ v80 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s80(v80 v80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = v80Var;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
