package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class dg0 extends TextureView {
    public final /* synthetic */ jg0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg0(jg0 jg0Var, Context context) {
        super(context);
        this.a = jg0Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        h00 h00Var = this.a.l0;
        if (h00Var != null) {
            int width = getWidth();
            int height = getHeight();
            ra raVar = h00Var.I;
            if (raVar == null) {
                return;
            }
            Matrix matrix2 = raVar.v;
            matrix.invert(matrix2);
            float f7 = width;
            float f10 = height;
            matrix2.preScale(f7, f10);
            matrix2.postScale(1.0f / f7, 1.0f / f10);
            raVar.c(matrix2);
            h00Var.d(false, false, false);
        }
    }
}
