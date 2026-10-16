package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
