package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class n90 extends fj0 {
    public final /* synthetic */ q90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n90(q90 q90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = q90Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
