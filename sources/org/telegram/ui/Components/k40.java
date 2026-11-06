package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k40 extends TextureView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k40(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View
    public void invalidate() {
        wi.s0 s0Var;
        switch (this.a) {
            case 0:
                n40 n40Var = (n40) this.b;
                if (!n40Var.H0 && (s0Var = n40Var.Q) != null && s0Var.a == 3) {
                    n40Var.H0 = true;
                    try {
                        n40Var.F0 = SystemClock.elapsedRealtimeNanos();
                        n40Var.D();
                    } finally {
                        n40Var.H0 = false;
                    }
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                View.MeasureSpec.getSize(i7);
                super.onMeasure(i7, i10);
                break;
            case 2:
                xh.e eVar = (xh.e) this.b;
                setMeasuredDimension(eVar.g, eVar.h);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        switch (this.a) {
            case 1:
                super.setTransform(matrix);
                ry ryVar = ((sd0) this.b).l0;
                if (ryVar != null) {
                    int width = getWidth();
                    int height = getHeight();
                    da daVar = ryVar.I;
                    if (daVar != null) {
                        Matrix matrix2 = daVar.v;
                        matrix.invert(matrix2);
                        float f10 = width;
                        float f11 = height;
                        matrix2.preScale(f10, f11);
                        matrix2.postScale(1.0f / f10, 1.0f / f11);
                        daVar.c(matrix2);
                        ryVar.c(false, false, false);
                        break;
                    }
                }
                break;
            default:
                super.setTransform(matrix);
                break;
        }
    }
}
