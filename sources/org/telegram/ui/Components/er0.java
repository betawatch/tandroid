package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class er0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ gt0 a;

    public er0(gt0 gt0Var) {
        this.a = gt0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        gt0 gt0Var = this.a;
        if (gt0Var.q0 == null) {
            return;
        }
        gt0Var.q0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - gt0Var.q0.getRight());
    }
}
