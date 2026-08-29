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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ja extends Drawable {
    public float a = 1.0f;
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Path d = new Path();
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Drawable g;
    public final /* synthetic */ float h;
    public final /* synthetic */ ka i;

    public ja(ka kaVar, float f9, float f10, Drawable drawable, float f11) {
        this.i = kaVar;
        this.e = f9;
        this.f = f10;
        this.g = drawable;
        this.h = f11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap b10;
        ka kaVar = this.i;
        ga gaVar = kaVar.a;
        Matrix matrix = kaVar.p;
        Paint paint = null;
        if (gaVar != null && (b10 = gaVar.b()) != null) {
            if (kaVar.o == null || kaVar.n != b10) {
                kaVar.n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                kaVar.o = bitmapShader;
                kaVar.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.e, (-0.0f) - this.f);
            if (gaVar.b != null) {
                matrix.preScale(r3.getWidth() / b10.getWidth(), gaVar.b.getHeight() / b10.getHeight());
            }
            kaVar.o.setLocalMatrix(matrix);
            kaVar.h.setAlpha((int) (this.a * 255.0f));
            paint = kaVar.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.g;
        Paint paint3 = this.b;
        float f9 = this.h;
        if (paint2 == null && (gaVar == null || !gaVar.c())) {
            if (drawable != null) {
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                return;
            }
            paint3.setColor(-14145495);
            if (f9 <= 0.0f) {
                canvas.drawRect(bounds, paint3);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(bounds);
            canvas.drawRoundRect(rectF, f9, f9, paint3);
            return;
        }
        Path path = this.d;
        if (drawable != null) {
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            drawable.setBounds(bounds);
            drawable.draw(canvas);
            Rect rect = this.c;
            if (gaVar == null || !gaVar.c()) {
                canvas.drawRect(bounds, paint2);
            } else {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f9, f9, Path.Direction.CW);
                canvas.clipPath(path);
                kaVar.b(canvas, false);
                canvas.restore();
            }
            canvas.restore();
            getPadding(rect);
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
            paint3.setColor(1711276032);
            canvas.drawRoundRect(rectF3, f9, f9, paint3);
            return;
        }
        if (f9 > 0.0f) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(bounds);
            if (gaVar == null || !gaVar.c()) {
                canvas.drawRoundRect(rectF4, f9, f9, paint2);
            } else {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f9, f9, Path.Direction.CW);
                canvas.clipPath(path);
                kaVar.b(canvas, false);
                canvas.restore();
            }
        } else if (gaVar == null || !gaVar.c()) {
            canvas.drawRect(bounds, paint2);
        } else {
            canvas.save();
            canvas.clipRect(bounds);
            kaVar.b(canvas, false);
            canvas.restore();
        }
        paint3.setColor(1711276032);
        if (f9 <= 0.0f) {
            canvas.drawRect(bounds, paint3);
            return;
        }
        RectF rectF5 = AndroidUtilities.rectTmp;
        rectF5.set(bounds);
        canvas.drawRoundRect(rectF5, f9, f9, paint3);
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
