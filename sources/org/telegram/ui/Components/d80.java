package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class d80 extends ah0 {
    public final /* synthetic */ g80 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(g80 g80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.u1 = g80Var;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        this.u1.F = null;
    }
}
