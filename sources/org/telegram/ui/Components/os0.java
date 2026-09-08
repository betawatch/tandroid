package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class os0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ xu0 a;

    public os0(xu0 xu0Var) {
        this.a = xu0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        xu0 xu0Var = this.a;
        if (xu0Var.n0 == null) {
            return;
        }
        xu0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - xu0Var.n0.getRight());
    }
}
