package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class x11 extends e21 {
    public final /* synthetic */ Runnable Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x11(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.Q1 = runnable;
    }

    @Override // org.telegram.ui.Components.e21, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.Q1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
