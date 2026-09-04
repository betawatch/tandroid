package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class y8 extends e9 {
    public final /* synthetic */ x8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(f9 f9Var, Activity activity, x8 x8Var) {
        super(f9Var, activity);
        this.G = x8Var;
    }

    @Override // org.telegram.ui.Components.e9, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
