package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pe0 extends TextureView {
    public final /* synthetic */ ve0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe0(ve0 ve0Var, Context context) {
        super(context);
        this.a = ve0Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        jz jzVar = this.a.h0;
        if (jzVar != null) {
            int width = getWidth();
            int height = getHeight();
            fa faVar = jzVar.E;
            if (faVar == null) {
                return;
            }
            Matrix matrix2 = faVar.v;
            matrix.invert(matrix2);
            float f10 = width;
            float f11 = height;
            matrix2.preScale(f10, f11);
            matrix2.postScale(1.0f / f10, 1.0f / f11);
            faVar.c(matrix2);
            jzVar.e(false, false, false);
        }
    }
}
