package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class pd0 extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ vd0 F1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd0(vd0 vd0Var, Activity activity) {
        super(activity, null);
        this.F1 = vd0Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.F1.b.invalidate();
    }
}
