package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ye0 extends TextureView {
    public final /* synthetic */ ef0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye0(ef0 ef0Var, Context context) {
        super(context);
        this.a = ef0Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        qz qzVar = this.a.h0;
        if (qzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ma maVar = qzVar.E;
            if (maVar == null) {
                return;
            }
            Matrix matrix2 = maVar.v;
            matrix.invert(matrix2);
            float f9 = width;
            float f10 = height;
            matrix2.preScale(f9, f10);
            matrix2.postScale(1.0f / f9, 1.0f / f10);
            maVar.c(matrix2);
            qzVar.e(false, false, false);
        }
    }
}
