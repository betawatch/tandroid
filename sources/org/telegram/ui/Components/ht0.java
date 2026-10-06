package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
