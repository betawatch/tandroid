package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class p31 extends w31 {
    public final /* synthetic */ Runnable Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p31(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.Q = runnable;
    }

    @Override // org.telegram.ui.Components.w31, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.Q;
        if (runnable != null) {
            runnable.run();
        }
    }
}
