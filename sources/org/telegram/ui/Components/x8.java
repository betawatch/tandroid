package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class x8 extends d9 {
    public final /* synthetic */ w8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(e9 e9Var, Activity activity, w8 w8Var) {
        super(e9Var, activity);
        this.G = w8Var;
    }

    @Override // org.telegram.ui.Components.d9, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
