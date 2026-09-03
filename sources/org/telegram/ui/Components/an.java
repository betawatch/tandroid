package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class an extends mi {
    public final /* synthetic */ Runnable M2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable) {
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
