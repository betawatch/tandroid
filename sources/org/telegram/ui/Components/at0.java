package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class at0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ jv0 a;

    public at0(jv0 jv0Var) {
        this.a = jv0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        jv0 jv0Var = this.a;
        if (jv0Var.n0 == null) {
            return;
        }
        jv0Var.n0.setTranslationX(((View) r2.getParent()).getMeasuredWidth() - jv0Var.n0.getRight());
    }
}
