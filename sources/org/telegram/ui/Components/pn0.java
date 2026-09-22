package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class pn0 extends s4.j {
    @Override // s4.j, s4.f1
    public final boolean r(s4.c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13) {
        vn0 vn0Var;
        un0 un0Var;
        View view = c1Var.a;
        if ((view instanceof vn0) && (un0Var = (vn0Var = (vn0) view).a) != null) {
            un0Var.i = un0Var.N;
            un0Var.g = un0Var.O;
            un0Var.h = un0Var.P;
            vn0Var.b.d(0.0f, true);
            vn0Var.invalidate();
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
