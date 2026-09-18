package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class cn extends vi {
    public final /* synthetic */ Runnable P2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable) {
        super(context, o2Var, false, false, true, f6Var);
        this.P2 = runnable;
    }

    @Override // org.telegram.ui.Components.vi, org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.P2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
