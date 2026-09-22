package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class d90 extends wi0 {
    public final /* synthetic */ g90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d90(g90 g90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = g90Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
