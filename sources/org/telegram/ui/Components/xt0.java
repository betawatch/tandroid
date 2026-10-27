package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ bw0 a;

    public xt0(bw0 bw0Var) {
        this.a = bw0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        bw0 bw0Var = this.a;
        if (bw0Var.p0 == null) {
            return;
        }
        bw0Var.p0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - bw0Var.p0.getRight());
    }
}
