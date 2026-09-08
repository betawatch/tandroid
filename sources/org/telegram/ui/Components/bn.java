package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class bn extends vi {
    public final /* synthetic */ Runnable P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable) {
        super(context, n2Var, false, false, true, f6Var);
        this.P2 = runnable;
    }

    @Override // org.telegram.ui.Components.vi, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.P2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
