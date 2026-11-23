package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class gr0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ jt0 a;

    public gr0(jt0 jt0Var) {
        this.a = jt0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        jt0 jt0Var = this.a;
        if (jt0Var.q0 == null) {
            return;
        }
        jt0Var.q0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - jt0Var.q0.getRight());
    }
}
