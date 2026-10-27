package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m50 extends View {
    public int[] a;
    public int b;
    public final Paint c;
    public float d;
    public final /* synthetic */ x50 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = x50Var;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.e.z2 || r0.a2.c >= 0.1d) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.c);
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.a;
        Paint paint = this.c;
        boolean z10 = true;
        x50 x50Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.a = iArr;
            if (x50Var.h1 != null) {
                float f7 = x50Var.i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (x50Var.i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, x50Var.U0.getMeasuredHeight(), this.a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.b != x50Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, x50Var.V1);
            this.b = x50Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        x50Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
