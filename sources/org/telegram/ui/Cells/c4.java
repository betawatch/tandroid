package org.telegram.ui.Cells;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class c4 extends org.telegram.ui.ActionBar.k5 {
    public float M0;
    public final /* synthetic */ int N0;
    public final /* synthetic */ f4 O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(f4 f4Var, Context context, int i7) {
        super(context);
        this.O0 = f4Var;
        this.N0 = i7;
    }

    @Override // android.view.View
    public final float getAlpha() {
        return this.M0;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        this.M0 = f10;
        f4 f4Var = this.O0;
        if (this.N0 != 4) {
            super.setAlpha((1.0f - f4Var.d[4].getFullAlpha()) * f10);
            return;
        }
        float fullAlpha = f4Var.d[4].getFullAlpha();
        if (f4Var.c()) {
            float f11 = f4Var.e0;
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
        int i7 = 0;
        while (true) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.O0.d;
            if (i7 >= k5VarArr.length) {
                return;
            }
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[i7];
            k5Var.setAlpha(k5Var.getAlpha());
            i7++;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (this.N0 == 4 && getFullAlpha() > 0.0f) {
            f10 = 0.0f;
        }
        super.setTranslationY(f10);
    }
}
