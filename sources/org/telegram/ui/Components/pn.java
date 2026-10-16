package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class pn extends vi {
    public final /* synthetic */ Runnable S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable) {
        super(context, m2Var, false, false, true, c6Var);
        this.S2 = runnable;
    }

    @Override // org.telegram.ui.Components.vi, org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.S2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
