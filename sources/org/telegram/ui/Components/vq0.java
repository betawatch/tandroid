package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class vq0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ xs0 a;

    public vq0(xs0 xs0Var) {
        this.a = xs0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        xs0 xs0Var = this.a;
        if (xs0Var.p0 == null) {
            return;
        }
        xs0Var.p0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - xs0Var.p0.getRight());
    }
}
