package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
