package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
