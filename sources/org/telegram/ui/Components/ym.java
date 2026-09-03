package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ym extends li {
    public final /* synthetic */ Runnable M2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable) {
        super(context, p2Var, false, false, true, f6Var);
        this.M2 = runnable;
    }

    @Override // org.telegram.ui.Components.li, org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.M2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
