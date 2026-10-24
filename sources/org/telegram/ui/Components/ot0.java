package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ot0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ xv0 a;

    public ot0(xv0 xv0Var) {
        this.a = xv0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        xv0 xv0Var = this.a;
        if (xv0Var.n0 == null) {
            return;
        }
        xv0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - xv0Var.n0.getRight());
    }
}
