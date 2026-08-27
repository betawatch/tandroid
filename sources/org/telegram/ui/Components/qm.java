package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qm extends gi {
    public final /* synthetic */ Runnable L2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable) {
        super(context, n2Var, false, false, true, c6Var);
        this.L2 = runnable;
    }

    @Override // org.telegram.ui.Components.gi, org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.L2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
