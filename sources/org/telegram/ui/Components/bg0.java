package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class bg0 extends TextureView {
    public final /* synthetic */ hg0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0(hg0 hg0Var, Context context) {
        super(context);
        this.a = hg0Var;
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
            pa paVar = e00Var.I;
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
            e00Var.d(false, false, false);
        }
    }
}
