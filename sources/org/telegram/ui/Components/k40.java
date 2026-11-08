package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                if (!n40Var.I0 && (s0Var = n40Var.Q) != null && s0Var.a == 3) {
                    n40Var.I0 = true;
                    try {
                        n40Var.G0 = SystemClock.elapsedRealtimeNanos();
                        n40Var.F();
                    } finally {
                        n40Var.I0 = false;
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
                sy syVar = ((sd0) this.b).l0;
                if (syVar != null) {
                    int width = getWidth();
                    int height = getHeight();
                    da daVar = syVar.I;
                    if (daVar != null) {
                        Matrix matrix2 = daVar.v;
                        matrix.invert(matrix2);
                        float f10 = width;
                        float f11 = height;
                        matrix2.preScale(f10, f11);
                        matrix2.postScale(1.0f / f10, 1.0f / f11);
                        daVar.c(matrix2);
                        syVar.c(false, false, false);
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
