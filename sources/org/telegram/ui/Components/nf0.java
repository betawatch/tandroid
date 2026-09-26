package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class nf0 extends TextureView {
    public final /* synthetic */ tf0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf0(tf0 tf0Var, Context context) {
        super(context);
        this.a = tf0Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        wz wzVar = this.a.l0;
        if (wzVar != null) {
            int width = getWidth();
            int height = getHeight();
            pa paVar = wzVar.I;
            if (paVar == null) {
                return;
            }
            Matrix matrix2 = paVar.v;
            matrix.invert(matrix2);
            float f7 = width;
            float f10 = height;
            matrix2.preScale(f7, f10);
            matrix2.postScale(1.0f / f7, 1.0f / f10);
            paVar.c(matrix2);
            wzVar.e(false, false, false);
        }
    }
}
