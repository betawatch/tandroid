package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ke0 extends TextureView {
    public final /* synthetic */ qe0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke0(qe0 qe0Var, Context context) {
        super(context);
        this.a = qe0Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        View.MeasureSpec.getSize(i9);
        super.onMeasure(i9, i10);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        hz hzVar = this.a.h0;
        if (hzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = hzVar.E;
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
            hzVar.e(false, false, false);
        }
    }
}
