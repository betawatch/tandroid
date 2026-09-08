package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
