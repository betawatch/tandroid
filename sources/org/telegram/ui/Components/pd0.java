package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pd0 extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ vd0 E1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd0(vd0 vd0Var, Activity activity) {
        super(activity, null);
        this.E1 = vd0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.E1.b.invalidate();
    }
}
