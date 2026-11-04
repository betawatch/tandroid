package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k8 extends q8 {
    public final /* synthetic */ j8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(r8 r8Var, Activity activity, j8 j8Var) {
        super(r8Var, activity);
        this.H = j8Var;
    }

    @Override // org.telegram.ui.Components.q8, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
