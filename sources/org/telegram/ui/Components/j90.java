package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class j90 extends Drawable {
    public final Bitmap a;
    public long c;
    public LinearGradient d;
    public float f;
    public float g;
    public final x9 h;
    public int i;
    public int j;
    public final Paint b = new Paint(2);
    public final Matrix e = new Matrix();

    public j90(x9 x9Var, String str, int i10, int i11) {
        this.a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i10, i11);
        this.h = x9Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        int i11 = org.telegram.ui.ActionBar.j6.i5;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        int i12 = this.i;
        Paint paint = this.b;
        Matrix matrix = this.e;
        if (i12 != w02 || this.j != w03) {
            this.i = w02;
            this.j = w03;
            int averageColor = AndroidUtilities.getAverageColor(w03, w02);
            paint.setColor(w03);
            float dp = AndroidUtilities.dp(500.0f);
            this.g = dp;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{w03, averageColor, w03}, new float[]{0.0f, 0.18f, 0.36f}, Shader.TileMode.REPEAT);
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
        this.f = a4.a.A(abs, this.g, 1800.0f, this.f);
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
