package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o70 extends mg0 {
    public final /* synthetic */ r70 q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(r70 r70Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.q1 = r70Var;
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        this.q1.E = null;
    }
}
