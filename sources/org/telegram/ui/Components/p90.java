package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class p90 extends jj0 {
    public final /* synthetic */ s90 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(s90 s90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.s = s90Var;
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        this.s.E = null;
    }
}
