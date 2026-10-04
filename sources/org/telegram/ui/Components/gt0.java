package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class gt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ pv0 a;

    public gt0(pv0 pv0Var) {
        this.a = pv0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        pv0 pv0Var = this.a;
        if (pv0Var.n0 == null) {
            return;
        }
        pv0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - pv0Var.n0.getRight());
    }
}
