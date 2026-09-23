package org.telegram.ui.Cells;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class a4 extends org.telegram.ui.ActionBar.i5 {
    public float M0;
    public final /* synthetic */ int N0;
    public final /* synthetic */ e4 O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(e4 e4Var, Context context, int i10) {
        super(context);
        this.O0 = e4Var;
        this.N0 = i10;
    }

    @Override // android.view.View
    public final float getAlpha() {
        return this.M0;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        this.M0 = f7;
        e4 e4Var = this.O0;
        if (this.N0 != 4) {
            super.setAlpha((1.0f - e4Var.d[4].getFullAlpha()) * f7);
            return;
        }
        float fullAlpha = e4Var.d[4].getFullAlpha();
        if (e4Var.c()) {
            float f10 = e4Var.e0;
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

    @Override // org.telegram.ui.ActionBar.i5
    public final void setFullAlpha(float f7) {
        super.setFullAlpha(f7);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.i5[] i5VarArr = this.O0.d;
            if (i10 >= i5VarArr.length) {
                return;
            }
            org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[i10];
            i5Var.setAlpha(i5Var.getAlpha());
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
