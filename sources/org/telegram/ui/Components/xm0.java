package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xm0 extends f2.l {
    @Override // f2.l, f2.q1
    public final boolean r(f2.n1 n1Var, a5.e eVar, int i10, int i11, int i12, int i13) {
        dn0 dn0Var;
        cn0 cn0Var;
        View view = n1Var.a;
        if ((view instanceof dn0) && (cn0Var = (dn0Var = (dn0) view).a) != null) {
            cn0Var.i = cn0Var.N;
            cn0Var.g = cn0Var.O;
            cn0Var.h = cn0Var.P;
            dn0Var.b.d(0.0f, true);
            dn0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(n1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(n1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.r.add(new f2.k(n1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // f2.q1
    public final boolean t(f2.n1 n1Var) {
        return true;
    }
}
