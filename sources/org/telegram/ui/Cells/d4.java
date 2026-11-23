package org.telegram.ui.Cells;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d4 extends org.telegram.ui.ActionBar.n5 {
    public float N0;
    public final /* synthetic */ int O0;
    public final /* synthetic */ g4 P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(g4 g4Var, Context context, int i7) {
        super(context);
        this.P0 = g4Var;
        this.O0 = i7;
    }

    @Override // android.view.View
    public final float getAlpha() {
        return this.N0;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        this.N0 = f10;
        g4 g4Var = this.P0;
        if (this.O0 != 4) {
            super.setAlpha((1.0f - g4Var.d[4].getFullAlpha()) * f10);
            return;
        }
        float fullAlpha = g4Var.d[4].getFullAlpha();
        if (g4Var.c()) {
            float f11 = g4Var.f0;
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

    @Override // org.telegram.ui.ActionBar.n5
    public final void setFullAlpha(float f10) {
        super.setFullAlpha(f10);
        int i7 = 0;
        while (true) {
            org.telegram.ui.ActionBar.n5[] n5VarArr = this.P0.d;
            if (i7 >= n5VarArr.length) {
                return;
            }
            org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[i7];
            n5Var.setAlpha(n5Var.getAlpha());
            i7++;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (this.O0 == 4 && getFullAlpha() > 0.0f) {
            f10 = 0.0f;
        }
        super.setTranslationY(f10);
    }
}
