package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class io0 extends s4.l {
    @Override // s4.l, s4.g1
    public final boolean r(s4.e1 e1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        oo0 oo0Var;
        no0 no0Var;
        View view = e1Var.a;
        if ((view instanceof oo0) && (no0Var = (oo0Var = (oo0) view).a) != null) {
            no0Var.i = no0Var.N;
            no0Var.g = no0Var.O;
            no0Var.h = no0Var.P;
            oo0Var.b.d(0.0f, true);
            oo0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(e1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(e1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.r.add(new s4.k(e1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // s4.g1
    public final boolean t(s4.e1 e1Var) {
        return true;
    }
}
