package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class jl0 extends v4.k {
    @Override // v4.k, v4.f1
    public final boolean r(v4.d1 d1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        pl0 pl0Var;
        ol0 ol0Var;
        View view = d1Var.a;
        if ((view instanceof pl0) && (ol0Var = (pl0Var = (pl0) view).a) != null) {
            ol0Var.h = ol0Var.M;
            ol0Var.f = ol0Var.N;
            ol0Var.g = ol0Var.O;
            pl0Var.b.e(true, 0.0f);
            pl0Var.invalidate();
        }
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) view.getTranslationY());
        R(d1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(d1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.r.add(new v4.j(d1Var, translationX, translationY, i11, i12));
        return true;
    }

    @Override // v4.f1
    public final boolean t(v4.d1 d1Var) {
        return true;
    }
}
