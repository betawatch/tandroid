package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class l8 extends r8 {
    public final /* synthetic */ k8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(s8 s8Var, Activity activity, k8 k8Var) {
        super(s8Var, activity);
        this.G = k8Var;
    }

    @Override // org.telegram.ui.Components.r8, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
