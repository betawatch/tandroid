package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mf0 extends TextureView {
    public final /* synthetic */ sf0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf0(sf0 sf0Var, Context context) {
        super(context);
        this.a = sf0Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        c00 c00Var = this.a.l0;
        if (c00Var != null) {
            int width = getWidth();
            int height = getHeight();
            oa oaVar = c00Var.I;
            if (oaVar == null) {
                return;
            }
            Matrix matrix2 = oaVar.v;
            matrix.invert(matrix2);
            float f7 = width;
            float f10 = height;
            matrix2.preScale(f7, f10);
            matrix2.postScale(1.0f / f7, 1.0f / f10);
            oaVar.c(matrix2);
            c00Var.e(false, false, false);
        }
    }
}
