package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class uc0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ad0 F1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc0(ad0 ad0Var, Activity activity) {
        super(activity, null);
        this.F1 = ad0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.F1.b.invalidate();
    }
}
