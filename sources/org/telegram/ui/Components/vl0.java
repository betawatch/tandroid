package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class vl0 extends v4.k {
    @Override // v4.k, v4.h1
    public final boolean r(v4.f1 f1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12) {
        bm0 bm0Var;
        am0 am0Var;
        View view = f1Var.a;
        if ((view instanceof bm0) && (am0Var = (bm0Var = (bm0) view).a) != null) {
            am0Var.h = am0Var.M;
            am0Var.f = am0Var.N;
            am0Var.g = am0Var.O;
            bm0Var.b.e(true, 0.0f);
            bm0Var.invalidate();
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
        this.r.add(new v4.j(f1Var, translationX, translationY, i11, i12));
        return true;
    }

    @Override // v4.h1
    public final boolean t(v4.f1 f1Var) {
        return true;
    }
}
