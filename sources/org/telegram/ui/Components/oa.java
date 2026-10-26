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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class oa extends Drawable {
    public float a = 1.0f;
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Path d = new Path();
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Drawable g;
    public final /* synthetic */ float h;
    public final /* synthetic */ pa i;

    public oa(pa paVar, float f7, float f10, Drawable drawable, float f11) {
        this.i = paVar;
        this.e = f7;
        this.f = f10;
        this.g = drawable;
        this.h = f11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap b10;
        pa paVar = this.i;
        la laVar = paVar.a;
        Matrix matrix = paVar.p;
        Paint paint = null;
        if (laVar != null && (b10 = laVar.b()) != null) {
            if (paVar.o == null || paVar.n != b10) {
                paVar.n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                paVar.o = bitmapShader;
                paVar.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.e, (-0.0f) - this.f);
            if (laVar.b != null) {
                matrix.preScale(r3.getWidth() / b10.getWidth(), laVar.b.getHeight() / b10.getHeight());
            }
            paVar.o.setLocalMatrix(matrix);
            paVar.h.setAlpha((int) (this.a * 255.0f));
            paint = paVar.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.g;
        Paint paint3 = this.b;
        float f7 = this.h;
        if (paint2 == null && (laVar == null || !laVar.c())) {
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
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(bounds);
            canvas.drawRoundRect(rectF, f7, f7, paint3);
            return;
        }
        Path path = this.d;
        if (drawable != null) {
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            drawable.setBounds(bounds);
            drawable.draw(canvas);
            Rect rect = this.c;
            if (laVar == null || !laVar.c()) {
                canvas.drawRect(bounds, paint2);
            } else {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                paVar.b(canvas, false);
                canvas.restore();
            }
            canvas.restore();
            getPadding(rect);
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
            paint3.setColor(1711276032);
            canvas.drawRoundRect(rectF3, f7, f7, paint3);
            return;
        }
        if (f7 > 0.0f) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(bounds);
            if (laVar == null || !laVar.c()) {
                canvas.drawRoundRect(rectF4, f7, f7, paint2);
            } else {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                paVar.b(canvas, false);
                canvas.restore();
            }
        } else if (laVar == null || !laVar.c()) {
            canvas.drawRect(bounds, paint2);
        } else {
            canvas.save();
            canvas.clipRect(bounds);
            paVar.b(canvas, false);
            canvas.restore();
        }
        paint3.setColor(1711276032);
        if (f7 <= 0.0f) {
            canvas.drawRect(bounds, paint3);
            return;
        }
        RectF rectF5 = AndroidUtilities.rectTmp;
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
