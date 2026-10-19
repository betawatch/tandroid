package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class kt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ tv0 a;

    public kt0(tv0 tv0Var) {
        this.a = tv0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        tv0 tv0Var = this.a;
        if (tv0Var.n0 == null) {
            return;
        }
        tv0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - tv0Var.n0.getRight());
    }
}
