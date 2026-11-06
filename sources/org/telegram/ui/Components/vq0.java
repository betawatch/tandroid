package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
