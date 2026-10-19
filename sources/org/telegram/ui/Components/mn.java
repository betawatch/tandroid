package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class mn extends ti {
    public final /* synthetic */ Runnable S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable) {
        super(context, n2Var, false, false, true, d6Var);
        this.S2 = runnable;
    }

    @Override // org.telegram.ui.Components.ti, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.S2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
