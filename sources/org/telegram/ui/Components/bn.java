package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class bn extends mi {
    public final /* synthetic */ Runnable M2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable) {
        super(context, p2Var, false, false, true, g6Var);
        this.M2 = runnable;
    }

    @Override // org.telegram.ui.Components.mi, org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.M2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
