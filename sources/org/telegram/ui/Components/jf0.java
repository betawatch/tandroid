package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jf0 extends TextureView {
    public final /* synthetic */ pf0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf0(pf0 pf0Var, Context context) {
        super(context);
        this.a = pf0Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        xz xzVar = this.a.i0;
        if (xzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = xzVar.F;
            if (haVar == null) {
                return;
            }
            Matrix matrix2 = haVar.v;
            matrix.invert(matrix2);
            float f10 = width;
            float f11 = height;
            matrix2.preScale(f10, f11);
            matrix2.postScale(1.0f / f10, 1.0f / f11);
            haVar.c(matrix2);
            xzVar.e(false, false, false);
        }
    }
}
