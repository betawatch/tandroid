package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
