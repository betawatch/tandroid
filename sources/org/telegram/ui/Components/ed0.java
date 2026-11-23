package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ed0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ kd0 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed0(kd0 kd0Var, Activity activity) {
        super(activity, null);
        this.G1 = kd0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.G1.b.invalidate();
    }
}
