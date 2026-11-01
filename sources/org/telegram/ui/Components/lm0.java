package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class lm0 extends s4.j {
    @Override // s4.j, s4.f1
    public final boolean r(s4.c1 c1Var, ac.g gVar, int i10, int i11, int i12, int i13) {
        rm0 rm0Var;
        qm0 qm0Var;
        View view = c1Var.a;
        if ((view instanceof rm0) && (qm0Var = (rm0Var = (rm0) view).a) != null) {
            qm0Var.h = qm0Var.M;
            qm0Var.f = qm0Var.N;
            qm0Var.g = qm0Var.O;
            rm0Var.b.e(true, 0.0f);
            rm0Var.invalidate();
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
