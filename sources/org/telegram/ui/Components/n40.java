package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Matrix;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class n40 extends TextureView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n40(int i7, Context context, Object obj) {
        super(context);
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View
    public void invalidate() {
        zi.u0 u0Var;
        switch (this.a) {
            case 0:
                q40 q40Var = (q40) this.b;
                if (!q40Var.J0 && (u0Var = q40Var.R) != null && u0Var.a == 3) {
                    q40Var.J0 = true;
                    try {
                        q40Var.H0 = SystemClock.elapsedRealtimeNanos();
                        q40Var.F();
                    } finally {
                        q40Var.J0 = false;
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
                wy wyVar = ((td0) this.b).m0;
                if (wyVar != null) {
                    int width = getWidth();
                    int height = getHeight();
                    z9 z9Var = wyVar.J;
                    if (z9Var != null) {
                        Matrix matrix2 = z9Var.v;
                        matrix.invert(matrix2);
                        float f10 = width;
                        float f11 = height;
                        matrix2.preScale(f10, f11);
                        matrix2.postScale(1.0f / f10, 1.0f / f11);
                        z9Var.c(matrix2);
                        wyVar.c(false, false, false);
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
