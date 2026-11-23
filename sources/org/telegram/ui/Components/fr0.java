package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fr0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ it0 a;

    public fr0(it0 it0Var) {
        this.a = it0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        it0 it0Var = this.a;
        if (it0Var.q0 == null) {
            return;
        }
        it0Var.q0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - it0Var.q0.getRight());
    }
}
