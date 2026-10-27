package org.telegram.ui.Cells;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e4 extends org.telegram.ui.ActionBar.b6 {
    public float M0;
    public final /* synthetic */ int N0;
    public final /* synthetic */ i4 O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(i4 i4Var, Context context, int i10) {
        super(context);
        this.O0 = i4Var;
        this.N0 = i10;
    }

    @Override // android.view.View
    public final float getAlpha() {
        return this.M0;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        this.M0 = f7;
        i4 i4Var = this.O0;
        if (this.N0 != 4) {
            super.setAlpha((1.0f - i4Var.d[4].getFullAlpha()) * f7);
            return;
        }
        float fullAlpha = i4Var.d[4].getFullAlpha();
        if (i4Var.c()) {
            float f10 = i4Var.e0;
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void setFullAlpha(float f7) {
        super.setFullAlpha(f7);
        int i10 = 0;
        while (true) {
            org.telegram.ui.ActionBar.b6[] b6VarArr = this.O0.d;
            if (i10 >= b6VarArr.length) {
                return;
            }
            org.telegram.ui.ActionBar.b6 b6Var = b6VarArr[i10];
            b6Var.setAlpha(b6Var.getAlpha());
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
