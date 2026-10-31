package org.telegram.ui.Cells;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e4 extends org.telegram.ui.ActionBar.u5 {
    public float M0;
    public final /* synthetic */ int N0;
    public final /* synthetic */ h4 O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(h4 h4Var, Context context, int i10) {
        super(context);
        this.O0 = h4Var;
        this.N0 = i10;
    }

    @Override // android.view.View
    public final float getAlpha() {
        return this.M0;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        this.M0 = f7;
        h4 h4Var = this.O0;
        if (this.N0 != 4) {
            super.setAlpha((1.0f - h4Var.d[4].getFullAlpha()) * f7);
            return;
        }
        float fullAlpha = h4Var.d[4].getFullAlpha();
        if (h4Var.c()) {
            float f10 = h4Var.e0;
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

    @Override // org.telegram.ui.ActionBar.u5
    public final void setFullAlpha(float f7) {
        super.setFullAlpha(f7);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.u5[] u5VarArr = this.O0.d;
            if (i10 >= u5VarArr.length) {
                return;
            }
            org.telegram.ui.ActionBar.u5 u5Var = u5VarArr[i10];
            u5Var.setAlpha(u5Var.getAlpha());
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
