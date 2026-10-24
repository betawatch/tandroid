package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class mn extends ti {
    public final /* synthetic */ Runnable V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable) {
        super(context, o2Var, false, false, true, g6Var);
        this.V2 = runnable;
    }

    @Override // org.telegram.ui.Components.ti, org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.V2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
