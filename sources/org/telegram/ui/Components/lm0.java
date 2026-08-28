package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lm0 extends f2.n {
    @Override // f2.n, f2.t1
    public final boolean r(f2.q1 q1Var, d5.p pVar, int i9, int i10, int i11, int i12) {
        rm0 rm0Var;
        qm0 qm0Var;
        View view = q1Var.a;
        if ((view instanceof rm0) && (qm0Var = (rm0Var = (rm0) view).a) != null) {
            qm0Var.i = qm0Var.N;
            qm0Var.g = qm0Var.O;
            qm0Var.h = qm0Var.P;
            rm0Var.b.d(0.0f, true);
            rm0Var.invalidate();
        }
        int translationX = i9 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) view.getTranslationY());
        R(q1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(q1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.r.add(new f2.m(q1Var, translationX, translationY, i11, i12));
        return true;
    }

    @Override // f2.t1
    public final boolean t(f2.q1 q1Var) {
        return true;
    }
}
