package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sn extends yi {
    public final /* synthetic */ Runnable S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        super(context, n2Var, false, false, true, e6Var);
        this.S2 = runnable;
    }

    @Override // org.telegram.ui.Components.yi, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.S2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
