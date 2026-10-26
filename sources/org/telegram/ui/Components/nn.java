package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class nn extends ti {
    public final /* synthetic */ Runnable O2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, Runnable runnable) {
        super(context, r2Var, false, false, true, u6Var);
        this.O2 = runnable;
    }

    @Override // org.telegram.ui.Components.ti, org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.O2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
