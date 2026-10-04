package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class g90 extends wi0 {
    public final /* synthetic */ j90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(j90 j90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = j90Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
