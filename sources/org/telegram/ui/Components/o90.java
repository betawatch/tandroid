package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class o90 extends jj0 {
    public final /* synthetic */ r90 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o90(r90 r90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.s = r90Var;
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.s.E = null;
    }
}
