package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pc0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ vc0 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc0(vc0 vc0Var, Activity activity) {
        super(activity, null);
        this.G1 = vc0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.G1.b.invalidate();
    }
}
