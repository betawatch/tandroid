package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class bt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ kv0 a;

    public bt0(kv0 kv0Var) {
        this.a = kv0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        kv0 kv0Var = this.a;
        if (kv0Var.n0 == null) {
            return;
        }
        kv0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - kv0Var.n0.getRight());
    }
}
