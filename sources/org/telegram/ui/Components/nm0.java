package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class nm0 extends f2.l {
    @Override // f2.l, f2.r1
    public final boolean r(f2.o1 o1Var, d5.p pVar, int i10, int i11, int i12, int i13) {
        tm0 tm0Var;
        sm0 sm0Var;
        View view = o1Var.a;
        if ((view instanceof tm0) && (sm0Var = (tm0Var = (tm0) view).a) != null) {
            sm0Var.i = sm0Var.N;
            sm0Var.g = sm0Var.O;
            sm0Var.h = sm0Var.P;
            tm0Var.b.d(0.0f, true);
            tm0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(o1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(o1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.r.add(new f2.k(o1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // f2.r1
    public final boolean t(f2.o1 o1Var) {
        return true;
    }
}
