package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class do0 extends s4.k {
    @Override // s4.k, s4.e1
    public final boolean r(s4.b1 b1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13) {
        jo0 jo0Var;
        io0 io0Var;
        View view = b1Var.a;
        if ((view instanceof jo0) && (io0Var = (jo0Var = (jo0) view).a) != null) {
            io0Var.i = io0Var.N;
            io0Var.g = io0Var.O;
            io0Var.h = io0Var.P;
            jo0Var.b.d(0.0f, true);
            jo0Var.invalidate();
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
