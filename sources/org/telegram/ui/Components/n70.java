package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class n70 extends lg0 {
    public final /* synthetic */ q70 t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n70(q70 q70Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.t1 = q70Var;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        this.t1.E = null;
    }
}
