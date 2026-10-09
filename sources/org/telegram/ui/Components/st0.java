package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class st0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ bw0 a;

    public st0(bw0 bw0Var) {
        this.a = bw0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        bw0 bw0Var = this.a;
        if (bw0Var.n0 == null) {
            return;
        }
        bw0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - bw0Var.n0.getRight());
    }
}
