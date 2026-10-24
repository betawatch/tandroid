package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class co0 extends s4.k {
    @Override // s4.k, s4.e1
    public final boolean r(s4.b1 b1Var, b2.u0 u0Var, int i10, int i11, int i12, int i13) {
        io0 io0Var;
        ho0 ho0Var;
        View view = b1Var.a;
        if ((view instanceof io0) && (ho0Var = (io0Var = (io0) view).a) != null) {
            ho0Var.i = ho0Var.N;
            ho0Var.g = ho0Var.O;
            ho0Var.h = ho0Var.P;
            io0Var.b.d(0.0f, true);
            io0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(b1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(b1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.r.add(new s4.j(b1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // s4.e1
    public final boolean t(s4.b1 b1Var) {
        return true;
    }
}
