package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n70 extends lg0 {
    public final /* synthetic */ q70 q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n70(q70 q70Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.q1 = q70Var;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        this.q1.E = null;
    }
}
