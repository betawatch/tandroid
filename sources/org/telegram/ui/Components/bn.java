package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
