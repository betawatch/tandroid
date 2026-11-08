package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
