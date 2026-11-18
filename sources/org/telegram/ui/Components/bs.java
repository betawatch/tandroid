package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class bs extends View {
    public final Paint a;
    public final Matrix b;
    public LinearGradient c;
    public int d;
    public float e;
    public float f;

    public bs(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Matrix();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), this.e + this.f, this.a);
    }

    public void setColor(int i7) {
        if (this.d != i7) {
            this.d = i7;
            int alpha = Color.alpha(i7);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.a.o(i7, (alpha * org.telegram.messenger.ks.I3) / org.telegram.messenger.ks.e4), i0.a.o(i7, (alpha * org.telegram.messenger.ks.W2) / org.telegram.messenger.ks.e4), i0.a.o(i7, (alpha * org.telegram.messenger.ks.a2) / org.telegram.messenger.ks.e4), i0.a.o(i7, 0)}, (float[]) null, Shader.TileMode.CLAMP);
            this.c = linearGradient;
            this.a.setShader(linearGradient);
            this.c.setLocalMatrix(this.b);
            invalidate();
        }
    }
}
