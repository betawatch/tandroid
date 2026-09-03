package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gn0 extends f2.l {
    @Override // f2.l, f2.o1
    public final boolean r(f2.l1 l1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        mn0 mn0Var;
        ln0 ln0Var;
        View view = l1Var.a;
        if ((view instanceof mn0) && (ln0Var = (mn0Var = (mn0) view).a) != null) {
            ln0Var.i = ln0Var.N;
            ln0Var.g = ln0Var.O;
            ln0Var.h = ln0Var.P;
            mn0Var.b.d(0.0f, true);
            mn0Var.invalidate();
        }
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) view.getTranslationY());
        R(l1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(l1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.r.add(new f2.k(l1Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // f2.o1
    public final boolean t(f2.l1 l1Var) {
        return true;
    }
}
