package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class a90 extends ti0 {
    public final /* synthetic */ d90 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a90(d90 d90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.n = d90Var;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        this.n.E = null;
    }
}
