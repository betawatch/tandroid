package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class vq0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ ys0 a;

    public vq0(ys0 ys0Var) {
        this.a = ys0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        ys0 ys0Var = this.a;
        if (ys0Var.p0 == null) {
            return;
        }
        ys0Var.p0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - ys0Var.p0.getRight());
    }
}
