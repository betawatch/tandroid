package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xm extends ni {
    public final /* synthetic */ Runnable L2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable) {
        super(context, o2Var, false, false, true, c6Var);
        this.L2 = runnable;
    }

    @Override // org.telegram.ui.Components.ni, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.L2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
