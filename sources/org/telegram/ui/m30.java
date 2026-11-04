package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m30 extends View {
    public int[] a;
    public int b;
    public final Paint c;
    public float d;
    public final /* synthetic */ x30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m30(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = x30Var;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.e.r4 || r0.S3.c >= 0.1d) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.c);
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.a;
        Paint paint = this.c;
        boolean z10 = true;
        x30 x30Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(org.telegram.messenger.hs.e4);
            }
            this.a = iArr;
            if (x30Var.Z2 != null) {
                float f10 = x30Var.a3;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (x30Var.a3 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, x30Var.M2.getMeasuredHeight(), this.a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.b != x30Var.N3) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, x30Var.N3);
            this.b = x30Var.N3;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        x30Var.B1();
    }

    public void setShadowOffset(int i3) {
        float f10 = i3;
        if (this.d != f10) {
            this.c.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, this.e.N3);
            this.d = f10;
            invalidate();
        }
    }
}
