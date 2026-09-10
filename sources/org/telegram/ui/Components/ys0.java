package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ys0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ iv0 a;

    public ys0(iv0 iv0Var) {
        this.a = iv0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        iv0 iv0Var = this.a;
        if (iv0Var.n0 == null) {
            return;
        }
        iv0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - iv0Var.n0.getRight());
    }
}
