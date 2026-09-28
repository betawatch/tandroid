package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ct0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ lv0 a;

    public ct0(lv0 lv0Var) {
        this.a = lv0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        lv0 lv0Var = this.a;
        if (lv0Var.n0 == null) {
            return;
        }
        lv0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - lv0Var.n0.getRight());
    }
}
