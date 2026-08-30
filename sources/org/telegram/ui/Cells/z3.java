package org.telegram.ui.Cells;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z3 extends org.telegram.ui.ActionBar.k5 {
    public float J0;
    public final /* synthetic */ int K0;
    public final /* synthetic */ e4 L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(e4 e4Var, Context context, int i10) {
        super(context);
        this.L0 = e4Var;
        this.K0 = i10;
    }

    @Override // android.view.View
    public final float getAlpha() {
        return this.J0;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        this.J0 = f10;
        e4 e4Var = this.L0;
        if (this.K0 != 4) {
            super.setAlpha((1.0f - e4Var.d[4].getFullAlpha()) * f10);
            return;
        }
        float fullAlpha = e4Var.d[4].getFullAlpha();
        if (e4Var.c()) {
            float f11 = e4Var.b0;
            if (f11 > 0.0f) {
                super.setAlpha(1.0f - f11);
                return;
            }
        }
        if (fullAlpha > 0.0f) {
            super.setAlpha(Math.max(f10, fullAlpha));
        } else {
            super.setAlpha(f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void setFullAlpha(float f10) {
        super.setFullAlpha(f10);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.L0.d;
            if (i10 >= k5VarArr.length) {
                return;
            }
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[i10];
            k5Var.setAlpha(k5Var.getAlpha());
            i10++;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (this.K0 == 4 && getFullAlpha() > 0.0f) {
            f10 = 0.0f;
        }
        super.setTranslationY(f10);
    }
}
