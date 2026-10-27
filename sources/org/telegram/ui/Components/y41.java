package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y41 extends g51 {
    public final /* synthetic */ Runnable Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y41(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.Z = runnable;
    }

    @Override // org.telegram.ui.Components.g51, org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.Z;
        if (runnable != null) {
            runnable.run();
        }
    }
}
