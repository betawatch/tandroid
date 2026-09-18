package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class df0 extends TextureView {
    public final /* synthetic */ jf0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df0(jf0 jf0Var, Context context) {
        super(context);
        this.a = jf0Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.a.l0;
        if (vzVar != null) {
            int width = getWidth();
            int height = getHeight();
            na naVar = vzVar.I;
            if (naVar == null) {
                return;
            }
            Matrix matrix2 = naVar.v;
            matrix.invert(matrix2);
            float f7 = width;
            float f10 = height;
            matrix2.preScale(f7, f10);
            matrix2.postScale(1.0f / f7, 1.0f / f10);
            naVar.c(matrix2);
            vzVar.e(false, false, false);
        }
    }
}
