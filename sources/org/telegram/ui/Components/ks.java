package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ks extends View {
    public final Paint a;
    public final Matrix b;
    public LinearGradient c;
    public int d;
    public float e;
    public float f;

    public ks(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Matrix();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.e + this.f, this.a);
    }

    public void setColor(int i10) {
        if (this.d != i10) {
            this.d = i10;
            int alpha = Color.alpha(i10);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.k(i10, (alpha * 232) / 255), i0.a.k(i10, (alpha * 192) / 255), i0.a.k(i10, (alpha * 144) / 255), i0.a.k(i10, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.c = linearGradient;
            this.a.setShader(linearGradient);
            this.c.setLocalMatrix(this.b);
            invalidate();
        }
    }
}
