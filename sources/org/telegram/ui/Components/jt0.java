package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class jt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ sv0 a;

    public jt0(sv0 sv0Var) {
        this.a = sv0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        sv0 sv0Var = this.a;
        if (sv0Var.n0 == null) {
            return;
        }
        sv0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - sv0Var.n0.getRight());
    }
}
