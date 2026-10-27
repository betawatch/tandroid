package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zf0 extends TextureView {
    public final /* synthetic */ fg0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf0(fg0 fg0Var, Context context) {
        super(context);
        this.a = fg0Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        e00 e00Var = this.a.l0;
        if (e00Var != null) {
            int width = getWidth();
            int height = getHeight();
            ra raVar = e00Var.I;
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
            e00Var.d(false, false, false);
        }
    }
}
