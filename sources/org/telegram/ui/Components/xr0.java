package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class xr0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ au0 a;

    public xr0(au0 au0Var) {
        this.a = au0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        au0 au0Var = this.a;
        if (au0Var.p0 == null) {
            return;
        }
        au0Var.p0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - au0Var.p0.getRight());
    }
}
