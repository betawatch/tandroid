package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v9 extends Drawable {
    public float a = 1.0f;
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Path d = new Path();
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Drawable g;
    public final /* synthetic */ float h;
    public final /* synthetic */ w9 i;

    public v9(w9 w9Var, float f7, float f10, Drawable drawable, float f11) {
        this.i = w9Var;
        this.e = f7;
        this.f = f10;
        this.g = drawable;
        this.h = f11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap b10;
        w9 w9Var = this.i;
        s9 s9Var = w9Var.a;
        Matrix matrix = w9Var.p;
        Paint paint = null;
        if (s9Var != null && (b10 = s9Var.b()) != null) {
            if (w9Var.o == null || w9Var.n != b10) {
                w9Var.n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                w9Var.o = bitmapShader;
                w9Var.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.e, (-0.0f) - this.f);
            if (s9Var.b != null) {
                matrix.preScale(r3.getWidth() / b10.getWidth(), s9Var.b.getHeight() / b10.getHeight());
            }
            w9Var.o.setLocalMatrix(matrix);
            w9Var.h.setAlpha((int) (this.a * 255.0f));
            paint = w9Var.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.g;
        Paint paint3 = this.b;
        float f7 = this.h;
        if (paint2 == null && (s9Var == null || !s9Var.c())) {
            if (drawable != null) {
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                return;
            }
            paint3.setColor(-14145495);
            if (f7 <= 0.0f) {
                canvas.drawRect(bounds, paint3);
                return;
            }
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(bounds);
            canvas.drawRoundRect(rectF, f7, f7, paint3);
            return;
        }
        Path path = this.d;
        if (drawable != null) {
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, org.telegram.messenger.zs.e4, 31);
            drawable.setBounds(bounds);
            drawable.draw(canvas);
            Rect rect = this.c;
            if (s9Var == null || !s9Var.c()) {
                canvas.drawRect(bounds, paint2);
            } else {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                w9Var.b(canvas, false);
                canvas.restore();
            }
            canvas.restore();
            getPadding(rect);
            RectF rectF3 = org.telegram.messenger.i0.P;
            rectF3.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
            paint3.setColor(1711276032);
            canvas.drawRoundRect(rectF3, f7, f7, paint3);
            return;
        }
        if (f7 > 0.0f) {
            RectF rectF4 = org.telegram.messenger.i0.P;
            rectF4.set(bounds);
            if (s9Var == null || !s9Var.c()) {
                canvas.drawRoundRect(rectF4, f7, f7, paint2);
            } else {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                w9Var.b(canvas, false);
                canvas.restore();
            }
        } else if (s9Var == null || !s9Var.c()) {
            canvas.drawRect(bounds, paint2);
        } else {
            canvas.save();
            canvas.clipRect(bounds);
            w9Var.b(canvas, false);
            canvas.restore();
        }
        paint3.setColor(1711276032);
        if (f7 <= 0.0f) {
            canvas.drawRect(bounds, paint3);
            return;
        }
        RectF rectF5 = org.telegram.messenger.i0.P;
        rectF5.set(bounds);
        canvas.drawRoundRect(rectF5, f7, f7, paint3);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.a = i10 / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
