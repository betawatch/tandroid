package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class dn extends wi {
    public final /* synthetic */ Runnable P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn(Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable) {
        super(context, m2Var, false, false, true, d6Var);
        this.P2 = runnable;
    }

    @Override // org.telegram.ui.Components.wi, org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.P2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
