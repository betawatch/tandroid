package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class km0 extends s4.j {
    @Override // s4.j, s4.f1
    public final boolean r(s4.c1 c1Var, ac.g gVar, int i10, int i11, int i12, int i13) {
        qm0 qm0Var;
        pm0 pm0Var;
        View view = c1Var.a;
        if ((view instanceof qm0) && (pm0Var = (qm0Var = (qm0) view).a) != null) {
            pm0Var.h = pm0Var.M;
            pm0Var.f = pm0Var.N;
            pm0Var.g = pm0Var.O;
            qm0Var.b.e(true, 0.0f);
            qm0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(c1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(c1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.r.add(new s4.i(c1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // s4.f1
    public final boolean t(s4.c1 c1Var) {
        return true;
    }
}
