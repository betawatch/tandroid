package org.telegram.ui.Cells;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a4 extends org.telegram.ui.ActionBar.h5 {
    public float I0;
    public final /* synthetic */ int J0;
    public final /* synthetic */ e4 K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(e4 e4Var, Context context, int i9) {
        super(context);
        this.K0 = e4Var;
        this.J0 = i9;
    }

    @Override // android.view.View
    public final float getAlpha() {
        return this.I0;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        this.I0 = f10;
        e4 e4Var = this.K0;
        if (this.J0 != 4) {
            super.setAlpha((1.0f - e4Var.d[4].getFullAlpha()) * f10);
            return;
        }
        float fullAlpha = e4Var.d[4].getFullAlpha();
        if (e4Var.c()) {
            float f11 = e4Var.a0;
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

    @Override // org.telegram.ui.ActionBar.h5
    public final void setFullAlpha(float f10) {
        super.setFullAlpha(f10);
        int i9 = 0;
        while (true) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.K0.d;
            if (i9 >= h5VarArr.length) {
                return;
            }
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[i9];
            h5Var.setAlpha(h5Var.getAlpha());
            i9++;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (this.J0 == 4 && getFullAlpha() > 0.0f) {
            f10 = 0.0f;
        }
        super.setTranslationY(f10);
    }
}
