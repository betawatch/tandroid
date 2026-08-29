package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gs0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ qu0 a;

    public gs0(qu0 qu0Var) {
        this.a = qu0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        qu0 qu0Var = this.a;
        if (qu0Var.j0 == null) {
            return;
        }
        qu0Var.j0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - qu0Var.j0.getRight());
    }
}
