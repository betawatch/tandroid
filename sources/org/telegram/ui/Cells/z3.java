package org.telegram.ui.Cells;

import android.content.Context;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class z3 extends org.telegram.ui.ActionBar.j5 {
    public float M0;
    public final /* synthetic */ int N0;
    public final /* synthetic */ d4 O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(d4 d4Var, Context context, int i10) {
        super(context);
        this.O0 = d4Var;
        this.N0 = i10;
    }

    @Override // android.view.View
    public final float getAlpha() {
        return this.M0;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        this.M0 = f7;
        d4 d4Var = this.O0;
        if (this.N0 != 4) {
            super.setAlpha((1.0f - d4Var.d[4].getFullAlpha()) * f7);
            return;
        }
        float fullAlpha = d4Var.d[4].getFullAlpha();
        if (d4Var.c()) {
            float f10 = d4Var.e0;
            if (f10 > 0.0f) {
                super.setAlpha(1.0f - f10);
                return;
            }
        }
        if (fullAlpha > 0.0f) {
            super.setAlpha(Math.max(f7, fullAlpha));
        } else {
            super.setAlpha(f7);
        }
    }

    @Override // org.telegram.ui.ActionBar.j5
    public final void setFullAlpha(float f7) {
        super.setFullAlpha(f7);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.j5[] j5VarArr = this.O0.d;
            if (i10 >= j5VarArr.length) {
                return;
            }
            org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[i10];
            j5Var.setAlpha(j5Var.getAlpha());
            i10++;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (this.N0 == 4 && getFullAlpha() > 0.0f) {
            f7 = 0.0f;
        }
        super.setTranslationY(f7);
    }
}
