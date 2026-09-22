package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class cn extends vi {
    public final /* synthetic */ Runnable P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        super(context, n2Var, false, false, true, e6Var);
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
