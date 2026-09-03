package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o31 extends v31 {
    public final /* synthetic */ Runnable Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o31(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.Q = runnable;
    }

    @Override // org.telegram.ui.Components.v31, org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.Q;
        if (runnable != null) {
            runnable.run();
        }
    }
}
