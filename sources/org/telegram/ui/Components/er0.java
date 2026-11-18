package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
