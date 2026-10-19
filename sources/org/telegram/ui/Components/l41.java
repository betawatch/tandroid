package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class l41 extends s41 {
    public final /* synthetic */ Runnable T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l41(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.T = runnable;
    }

    @Override // org.telegram.ui.Components.s41, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.T;
        if (runnable != null) {
            runnable.run();
        }
    }
}
