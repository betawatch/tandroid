package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v40 extends TextureView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v40(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View
    public void invalidate() {
        zi.t0 t0Var;
        switch (this.a) {
            case 0:
                y40 y40Var = (y40) this.b;
                if (!y40Var.J0 && (t0Var = y40Var.R) != null && t0Var.a == 3) {
                    y40Var.J0 = true;
                    try {
                        y40Var.H0 = SystemClock.elapsedRealtimeNanos();
                        y40Var.F();
                    } finally {
                        y40Var.J0 = false;
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
                cz czVar = ((de0) this.b).m0;
                if (czVar != null) {
                    int width = getWidth();
                    int height = getHeight();
                    ha haVar = czVar.J;
                    if (haVar != null) {
                        Matrix matrix2 = haVar.v;
                        matrix.invert(matrix2);
                        float f10 = width;
                        float f11 = height;
                        matrix2.preScale(f10, f11);
                        matrix2.postScale(1.0f / f10, 1.0f / f11);
                        haVar.c(matrix2);
                        czVar.c(false, false, false);
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
