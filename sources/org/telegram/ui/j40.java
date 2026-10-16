package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class j40 extends View {
    public final /* synthetic */ n60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j40(n60 n60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = n60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.T0();
        }
    }
}
