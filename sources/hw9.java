// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hw9 extends zb3 {
    @Override // zb3, cma
    public final boolean r(f89 f89Var, l09 l09Var, int i, int i2, int i3, int i4) {
        nw9 nw9Var;
        mw9 mw9Var;
        View view = f89Var.a;
        if ((view instanceof nw9) && (mw9Var = (nw9Var = (nw9) view).a) != null) {
            mw9Var.h = mw9Var.M;
            mw9Var.f = mw9Var.N;
            mw9Var.g = mw9Var.O;
            nw9Var.b.e(true, 0.0f);
            nw9Var.invalidate();
        }
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) view.getTranslationY());
        R(f89Var);
        int i5 = i4 - translationY;
        if (i3 - translationX != 0) {
            view.setTranslationX(-r11);
        } else if (i5 == 0) {
            v(f89Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationY(-i5);
        }
        this.r.add(new yb3(f89Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override // cma
    public final boolean t(f89 f89Var) {
        return true;
    }
}
