package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class os0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ xu0 a;

    public os0(xu0 xu0Var) {
        this.a = xu0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        xu0 xu0Var = this.a;
        if (xu0Var.n0 == null) {
            return;
        }
        xu0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - xu0Var.n0.getRight());
    }
}
