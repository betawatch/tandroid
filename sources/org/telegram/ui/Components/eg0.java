package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class eg0 extends TextureView {
    public final /* synthetic */ kg0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg0(kg0 kg0Var, Context context) {
        super(context);
        this.a = kg0Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View.MeasureSpec.getSize(i10);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.TextureView
    public final void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        l00 l00Var = this.a.l0;
        if (l00Var != null) {
            int width = getWidth();
            int height = getHeight();
            sa saVar = l00Var.I;
            if (saVar == null) {
                return;
            }
            Matrix matrix2 = saVar.v;
            matrix.invert(matrix2);
            float f7 = width;
            float f10 = height;
            matrix2.preScale(f7, f10);
            matrix2.postScale(1.0f / f7, 1.0f / f10);
            saVar.c(matrix2);
            l00Var.e(false, false, false);
        }
    }
}
