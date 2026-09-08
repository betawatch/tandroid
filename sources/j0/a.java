package j0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a extends Drawable {
    public final Bitmap a;
    public final int b;
    public final BitmapShader e;
    public float g;
    public final int k;
    public final int l;
    public final int c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f = new Matrix();
    public final Rect h = new Rect();
    public final RectF i = new RectF();
    public boolean j = true;

    public a(Resources resources, Bitmap bitmap) {
        this.b = 160;
        if (resources != null) {
            this.b = resources.getDisplayMetrics().densityDpi;
        }
        this.a = bitmap;
        if (bitmap == null) {
            this.l = -1;
            this.k = -1;
            this.e = null;
        } else {
            int i10 = this.b;
            this.k = bitmap.getScaledWidth(i10);
            this.l = bitmap.getScaledHeight(i10);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.e = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    public final void a() {
        if (this.j) {
            Gravity.apply(this.c, this.k, this.l, getBounds(), this.h, 0);
            Rect rect = this.h;
            RectF rectF = this.i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.e;
            if (bitmapShader != null) {
                float f7 = rectF.left;
                float f10 = rectF.top;
                Matrix matrix = this.f;
                matrix.setTranslate(f7, f10);
                float width = rectF.width();
                Bitmap bitmap = this.a;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.d.setShader(bitmapShader);
            }
            this.j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        a();
        Paint paint = this.d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, paint);
            return;
        }
        RectF rectF = this.i;
        float f7 = this.g;
        canvas.drawRoundRect(rectF, f7, f7, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.c != 119 || (bitmap = this.a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || this.g > 0.05f) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        a();
        outline.setRoundRect(this.h, this.g);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Paint paint = this.d;
        if (i10 != paint.getAlpha()) {
            paint.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.d.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.d.setFilterBitmap(z10);
        invalidateSelf();
    }
}
