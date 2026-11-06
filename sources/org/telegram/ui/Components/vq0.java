package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
