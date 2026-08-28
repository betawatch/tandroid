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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r80 extends Drawable {
    public final Bitmap a;
    public long c;
    public LinearGradient d;
    public float f;
    public float g;
    public final o9 h;
    public int i;
    public int j;
    public final Paint b = new Paint(2);
    public final Matrix e = new Matrix();

    public r80(o9 o9Var, String str, int i9, int i10) {
        this.a = SvgHelper.getBitmapByPathOnly(str, 512, 512, i9, i10);
        this.h = o9Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        int i9 = org.telegram.ui.ActionBar.f6.h5;
        int i10 = org.telegram.ui.ActionBar.f6.i5;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        int i11 = this.i;
        Paint paint = this.b;
        Matrix matrix = this.e;
        if (i11 != w02 || this.j != w03) {
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
        this.f = aa.d.d(abs, this.g, 1800.0f, this.f);
        while (true) {
            float f10 = this.f;
            float f11 = this.g * 2.0f;
            if (f10 < f11) {
                matrix.setTranslate(f10, 0.0f);
                this.d.setLocalMatrix(matrix);
                this.h.invalidate();
                return;
            }
            this.f = f10 - f11;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
