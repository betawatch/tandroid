package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class a9 extends g9 {
    public final /* synthetic */ z8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(h9 h9Var, Activity activity, z8 z8Var) {
        super(h9Var, activity);
        this.G = z8Var;
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
