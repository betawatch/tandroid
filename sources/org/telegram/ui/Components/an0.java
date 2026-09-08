package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class an0 extends s4.j {
    @Override // s4.j, s4.f1
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        gn0 gn0Var;
        fn0 fn0Var;
        View view = c1Var.a;
        if ((view instanceof gn0) && (fn0Var = (gn0Var = (gn0) view).a) != null) {
            fn0Var.i = fn0Var.N;
            fn0Var.g = fn0Var.O;
            fn0Var.h = fn0Var.P;
            gn0Var.b.d(0.0f, true);
            gn0Var.invalidate();
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
