package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class go0 extends s4.j {
    @Override // s4.j, s4.g1
    public final boolean r(s4.d1 d1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        mo0 mo0Var;
        lo0 lo0Var;
        View view = d1Var.a;
        if ((view instanceof mo0) && (lo0Var = (mo0Var = (mo0) view).a) != null) {
            lo0Var.i = lo0Var.N;
            lo0Var.g = lo0Var.O;
            lo0Var.h = lo0Var.P;
            mo0Var.b.d(0.0f, true);
            mo0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(d1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(d1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.r.add(new s4.i(d1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // s4.g1
    public final boolean t(s4.d1 d1Var) {
        return true;
    }
}
