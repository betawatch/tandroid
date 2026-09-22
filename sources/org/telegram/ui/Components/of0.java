package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class of0 extends TextureView {
    public final /* synthetic */ uf0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of0(uf0 uf0Var, Context context) {
        super(context);
        this.a = uf0Var;
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
            oa oaVar = vzVar.I;
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
            vzVar.e(false, false, false);
        }
    }
}
