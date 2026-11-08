package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Arrays;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class xz0 extends ImageView {
    public static final org.telegram.ui.Cells.g1 x = new org.telegram.ui.Cells.g1(Float.class, "radius", 3);
    public final Paint a;
    public final Matrix b;
    public RadialGradient c;
    public boolean d;
    public float e;
    public float f;
    public float h;
    public ch0 n;
    public ColorFilter r;
    public final int[] s;
    public final int[] w;

    public xz0(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Matrix();
        this.s = new int[2];
        this.w = new int[2];
    }

    public static void a(Bitmap bitmap, org.telegram.ui.ActionBar.n3 n3Var, ch0 ch0Var) {
        Drawable drawable = ch0Var.getDrawable();
        if (drawable != null && ch0Var.isAttachedToWindow() && bitmap.isMutable()) {
            int[] iArr = new int[2];
            RectF rectF = new RectF(drawable.getBounds());
            ch0Var.getImageMatrix().mapRect(rectF);
            ch0Var.getLocationInWindow(iArr);
            rectF.offset(ch0Var.getPaddingLeft() + iArr[0], ch0Var.getPaddingTop() + iArr[1]);
            if (n3Var != null) {
                n3Var.getLocationInWindow(iArr);
                rectF.offset(-iArr[0], -iArr[1]);
            }
            int max = Math.max(1, ((int) Math.floor(rectF.left)) - 1);
            int min = Math.min(bitmap.getWidth(), ((int) Math.ceil(rectF.right)) + 1);
            int max2 = Math.max(0, ((int) Math.floor(rectF.top)) - 1);
            int min2 = Math.min(bitmap.getHeight(), ((int) Math.ceil(rectF.bottom)) + 1);
            if (max >= min || max2 >= min2) {
                return;
            }
            int i7 = min - max;
            int[] iArr2 = new int[i7];
            for (int i10 = max2; i10 < min2; i10++) {
                Arrays.fill(iArr2, bitmap.getPixel(max - 1, i10));
                bitmap.setPixels(iArr2, 0, i7, max, i10, i7, 1);
            }
        }
    }

    public final void b(float f10, float f11, boolean z9) {
        this.e = f10;
        this.f = f11;
        this.d = z9;
        RadialGradient radialGradient = this.c;
        Paint paint = this.a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.c = radialGradient2;
            paint.setShader(radialGradient2);
        }
        paint.setXfermode(new PorterDuffXfermode(z9 ? PorterDuff.Mode.DST_OUT : PorterDuff.Mode.DST_IN));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.c == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.h >= 1.0f || this.d) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            ch0 ch0Var = this.n;
            Drawable drawable = ch0Var != null ? ch0Var.getDrawable() : 0;
            if (drawable != 0 && this.n.isAttachedToWindow()) {
                this.n.getLocationInWindow(this.s);
                getLocationInWindow(this.w);
                ColorFilter colorFilter = drawable.getColorFilter();
                canvas.save();
                canvas.translate(this.n.getPaddingLeft() + (r4[0] - r3[0]), this.n.getPaddingTop() + (r4[1] - r3[1]));
                canvas.concat(this.n.getImageMatrix());
                drawable.setColorFilter(this.r);
                drawable.draw(canvas);
                drawable.setColorFilter(colorFilter);
                canvas.restore();
                if ((drawable instanceof Animatable) && ((Animatable) drawable).isRunning()) {
                    invalidate();
                }
            }
            float f10 = this.h;
            if (f10 >= 1.0f) {
                float f11 = f10 / 100.0f;
                Matrix matrix = this.b;
                matrix.setScale(f11, f11);
                matrix.postTranslate(this.e, this.f);
                this.c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f10) {
        this.h = f10;
        invalidate();
    }
}
