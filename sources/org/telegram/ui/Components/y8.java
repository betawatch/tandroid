package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
