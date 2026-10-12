package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
