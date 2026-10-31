package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q40 extends View {
    public int[] a;
    public int b;
    public final Paint c;
    public float d;
    public final /* synthetic */ b50 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = b50Var;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.e.q4 || r0.R3.c >= 0.1d) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.c);
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.a;
        Paint paint = this.c;
        boolean z10 = true;
        b50 b50Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(org.telegram.messenger.zs.e4);
            }
            this.a = iArr;
            if (b50Var.Y2 != null) {
                float f7 = b50Var.Z2;
                if (f7 != 1.0f) {
                    iArr[0] = i0.b.o(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.a;
                    iArr3[1] = i0.b.o(iArr3[1], (int) (b50Var.Z2 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, b50Var.L2.getMeasuredHeight(), this.a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.b != b50Var.M3) {
            paint.setShadowLayer(org.telegram.messenger.i0.L(36.0f), 0.0f, this.d, b50Var.M3);
            this.b = b50Var.M3;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        b50Var.B1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.c.setShadowLayer(org.telegram.messenger.i0.L(36.0f), 0.0f, this.d, this.e.M3);
            this.d = f7;
            invalidate();
        }
    }
}
