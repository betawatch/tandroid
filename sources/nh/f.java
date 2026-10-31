package nh;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import li.w0;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.x9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends TextureView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View
    public void invalidate() {
        w0 w0Var;
        switch (this.a) {
            case 1:
                d50 d50Var = (d50) this.b;
                if (!d50Var.H0 && (w0Var = d50Var.Q) != null && w0Var.a == 3) {
                    d50Var.H0 = true;
                    try {
                        d50Var.F0 = SystemClock.elapsedRealtimeNanos();
                        d50Var.D();
                    } finally {
                        d50Var.H0 = false;
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
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                setMeasuredDimension(hVar.g, hVar.h);
                break;
            case 1:
            default:
                super.onMeasure(i10, i11);
                break;
            case 2:
                View.MeasureSpec.getSize(i10);
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        switch (this.a) {
            case 2:
                super.setTransform(matrix);
                gz gzVar = ((oe0) this.b).l0;
                if (gzVar != null) {
                    int width = getWidth();
                    int height = getHeight();
                    x9 x9Var = gzVar.I;
                    if (x9Var != null) {
                        Matrix matrix2 = x9Var.v;
                        matrix.invert(matrix2);
                        float f7 = width;
                        float f10 = height;
                        matrix2.preScale(f7, f10);
                        matrix2.postScale(1.0f / f7, 1.0f / f10);
                        x9Var.c(matrix2);
                        gzVar.c(false, false, false);
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
