package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v80 extends Drawable {
    public final Bitmap a;
    public final Paint b = new Paint(2);
    public long c;
    public LinearGradient d;
    public final Matrix e;
    public float f;
    public float g;
    public final g9 h;
    public int i;
    public int j;

    public v80(g9 g9Var, String str, int i10, int i11) {
        Bitmap bitmap;
        try {
            Path b10 = org.telegram.messenger.d00.b(str);
            bitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            float f7 = 512;
            canvas.scale(i10 / f7, i11 / f7);
            Paint paint = new Paint();
            paint.setColor(-1);
            canvas.drawPath(b10, paint);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            bitmap = null;
        }
        this.a = bitmap;
        this.h = g9Var;
        this.e = new Matrix();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.h5;
        int i11 = org.telegram.ui.ActionBar.t6.i5;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        int i12 = this.i;
        Paint paint = this.b;
        Matrix matrix = this.e;
        if (i12 != x02 || this.j != x03) {
            this.i = x02;
            this.j = x03;
            int w02 = org.telegram.messenger.i0.w0(x03, x02);
            paint.setColor(x03);
            float L = org.telegram.messenger.i0.L(500.0f);
            this.g = L;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{x03, w02, x03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
            this.d = linearGradient;
            linearGradient.setLocalMatrix(matrix);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new ComposeShader(this.d, new BitmapShader(bitmap, tileMode, tileMode), PorterDuff.Mode.MULTIPLY));
        }
        Rect bounds = getBounds();
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long abs = Math.abs(this.c - elapsedRealtime);
        if (abs > 17) {
            abs = 16;
        }
        this.c = elapsedRealtime;
        this.f = a1.g.A(abs, this.g, 1800.0f, this.f);
        while (true) {
            float f7 = this.f;
            float f10 = this.g * 2.0f;
            if (f7 < f10) {
                matrix.setTranslate(f7, 0.0f);
                this.d.setLocalMatrix(matrix);
                this.h.invalidate();
                return;
            }
            this.f = f7 - f10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
