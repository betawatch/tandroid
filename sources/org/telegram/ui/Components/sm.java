package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sm extends ki {
    public final /* synthetic */ Runnable L2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var, Runnable runnable) {
        super(context, o2Var, false, false, true, b6Var);
        this.L2 = runnable;
    }

    @Override // org.telegram.ui.Components.ki, org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.L2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
