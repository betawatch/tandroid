package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h8 extends n8 {
    public final /* synthetic */ g8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(o8 o8Var, Activity activity, g8 g8Var) {
        super(o8Var, activity);
        this.G = g8Var;
    }

    @Override // org.telegram.ui.Components.n8, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
