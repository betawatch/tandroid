package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ht0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ qv0 a;

    public ht0(qv0 qv0Var) {
        this.a = qv0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        qv0 qv0Var = this.a;
        if (qv0Var.n0 == null) {
            return;
        }
        qv0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - qv0Var.n0.getRight());
    }
}
