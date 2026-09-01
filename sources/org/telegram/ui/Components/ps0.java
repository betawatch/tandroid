package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ps0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ zu0 a;

    public ps0(zu0 zu0Var) {
        this.a = zu0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        zu0 zu0Var = this.a;
        if (zu0Var.k0 == null) {
            return;
        }
        zu0Var.k0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - zu0Var.k0.getRight());
    }
}
