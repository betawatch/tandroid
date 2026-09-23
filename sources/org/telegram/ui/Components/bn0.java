package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bn0 extends s4.j {
    @Override // s4.j, s4.f1
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        hn0 hn0Var;
        gn0 gn0Var;
        View view = c1Var.a;
        if ((view instanceof hn0) && (gn0Var = (hn0Var = (hn0) view).a) != null) {
            gn0Var.i = gn0Var.N;
            gn0Var.g = gn0Var.O;
            gn0Var.h = gn0Var.P;
            hn0Var.b.d(0.0f, true);
            hn0Var.invalidate();
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
