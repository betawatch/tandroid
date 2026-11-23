package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class u21 extends b31 {
    public final /* synthetic */ Runnable U1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u21(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.U1 = runnable;
    }

    @Override // org.telegram.ui.Components.b31, org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.U1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
