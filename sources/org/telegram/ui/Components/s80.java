package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class s80 extends ji0 {
    public final /* synthetic */ v80 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s80(v80 v80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = v80Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
