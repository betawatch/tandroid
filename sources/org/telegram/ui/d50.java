package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d50 extends View {
    public int[] a;
    public int b;
    public final Paint c;
    public float d;
    public final /* synthetic */ o50 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d50(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = o50Var;
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.e.v2 || r0.W1.c >= 0.1d) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.c);
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.a;
        Paint paint = this.c;
        boolean z10 = true;
        o50 o50Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.a = iArr;
            if (o50Var.d1 != null) {
                float f10 = o50Var.e1;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (o50Var.e1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, o50Var.Q0.getMeasuredHeight(), this.a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.b != o50Var.R1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, o50Var.R1);
            this.b = o50Var.R1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        o50Var.z1();
    }

    public void setShadowOffset(int i9) {
        float f10 = i9;
        if (this.d != f10) {
            this.c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.R1);
            this.d = f10;
            invalidate();
        }
    }
}
