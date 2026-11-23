package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xl0 extends v4.l {
    @Override // v4.l, v4.h1
    public final boolean r(v4.f1 f1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        dm0 dm0Var;
        cm0 cm0Var;
        View view = f1Var.a;
        if ((view instanceof dm0) && (cm0Var = (dm0Var = (dm0) view).a) != null) {
            cm0Var.h = cm0Var.M;
            cm0Var.f = cm0Var.N;
            cm0Var.g = cm0Var.O;
            dm0Var.b.e(true, 0.0f);
            dm0Var.invalidate();
        }
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) view.getTranslationY());
        R(f1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(f1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.r.add(new v4.k(f1Var, translationX, translationY, i11, i12));
        return true;
    }

    @Override // v4.h1
    public final boolean t(v4.f1 f1Var) {
        return true;
    }
}
