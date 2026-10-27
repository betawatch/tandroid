package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class z8 extends f9 {
    public final /* synthetic */ y8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(g9 g9Var, Activity activity, y8 y8Var) {
        super(g9Var, activity);
        this.G = y8Var;
    }

    @Override // org.telegram.ui.Components.f9, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
