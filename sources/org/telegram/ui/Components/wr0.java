package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wr0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ zt0 a;

    public wr0(zt0 zt0Var) {
        this.a = zt0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        zt0 zt0Var = this.a;
        if (zt0Var.p0 == null) {
            return;
        }
        zt0Var.p0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - zt0Var.p0.getRight());
    }
}
