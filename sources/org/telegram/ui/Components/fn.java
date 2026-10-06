package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class fn extends xi {
    public final /* synthetic */ Runnable I2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable) {
        super(context, n2Var, false, false, true, d6Var);
        this.I2 = runnable;
    }

    @Override // org.telegram.ui.Components.xi, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.I2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
