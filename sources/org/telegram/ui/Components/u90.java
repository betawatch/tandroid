package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u90 extends oj0 {
    public final /* synthetic */ x90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(x90 x90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = x90Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
