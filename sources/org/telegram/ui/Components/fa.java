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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fa extends Drawable {
    public float a = 1.0f;
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Path d = new Path();
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Drawable g;
    public final /* synthetic */ float h;
    public final /* synthetic */ ga i;

    public fa(ga gaVar, float f10, float f11, Drawable drawable, float f12) {
        this.i = gaVar;
        this.e = f10;
        this.f = f11;
        this.g = drawable;
        this.h = f12;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap b10;
        ga gaVar = this.i;
        ca caVar = gaVar.a;
        Matrix matrix = gaVar.p;
        Paint paint = null;
        if (caVar != null && (b10 = caVar.b()) != null) {
            if (gaVar.o == null || gaVar.n != b10) {
                gaVar.n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                gaVar.o = bitmapShader;
                gaVar.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.e, (-0.0f) - this.f);
            if (caVar.b != null) {
                matrix.preScale(r3.getWidth() / b10.getWidth(), caVar.b.getHeight() / b10.getHeight());
            }
            gaVar.o.setLocalMatrix(matrix);
            gaVar.h.setAlpha((int) (this.a * 255.0f));
            paint = gaVar.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.g;
        Paint paint3 = this.b;
        float f10 = this.h;
        if (paint2 == null && (caVar == null || !caVar.c())) {
            if (drawable != null) {
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                return;
            }
            paint3.setColor(-14145495);
            if (f10 <= 0.0f) {
                canvas.drawRect(bounds, paint3);
                return;
            }
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(bounds);
            canvas.drawRoundRect(rectF, f10, f10, paint3);
            return;
        }
        Path path = this.d;
        if (drawable != null) {
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, org.telegram.messenger.ks.e4, 31);
            drawable.setBounds(bounds);
            drawable.draw(canvas);
            Rect rect = this.c;
            if (caVar == null || !caVar.c()) {
                canvas.drawRect(bounds, paint2);
            } else {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                gaVar.b(canvas, false);
                canvas.restore();
            }
            canvas.restore();
            getPadding(rect);
            RectF rectF3 = org.telegram.messenger.g0.P;
            rectF3.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
            paint3.setColor(1711276032);
            canvas.drawRoundRect(rectF3, f10, f10, paint3);
            return;
        }
        if (f10 > 0.0f) {
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(bounds);
            if (caVar == null || !caVar.c()) {
                canvas.drawRoundRect(rectF4, f10, f10, paint2);
            } else {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                gaVar.b(canvas, false);
                canvas.restore();
            }
        } else if (caVar == null || !caVar.c()) {
            canvas.drawRect(bounds, paint2);
        } else {
            canvas.save();
            canvas.clipRect(bounds);
            gaVar.b(canvas, false);
            canvas.restore();
        }
        paint3.setColor(1711276032);
        if (f10 <= 0.0f) {
            canvas.drawRect(bounds, paint3);
            return;
        }
        RectF rectF5 = org.telegram.messenger.g0.P;
        rectF5.set(bounds);
        canvas.drawRoundRect(rectF5, f10, f10, paint3);
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
    public final void setAlpha(int i7) {
        this.a = i7 / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
