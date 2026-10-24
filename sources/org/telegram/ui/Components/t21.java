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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class t21 extends ImageView {
    public static final org.telegram.ui.Cells.c1 w = new org.telegram.ui.Cells.c1(Float.class, "radius", 3);
    public final Paint a;
    public final Matrix b;
    public RadialGradient c;
    public boolean d;
    public float e;
    public float f;
    public float h;
    public bk0 n;
    public ColorFilter r;
    public final int[] s;
    public final int[] v;

    public t21(Context context) {
        super(context);
        this.a = new Paint(1);
        this.b = new Matrix();
        this.s = new int[2];
        this.v = new int[2];
    }

    public static void a(Bitmap bitmap, org.telegram.ui.ActionBar.b4 b4Var, bk0 bk0Var) {
        Drawable drawable = bk0Var.getDrawable();
        if (drawable != null && bk0Var.isAttachedToWindow() && bitmap.isMutable()) {
            int[] iArr = new int[2];
            RectF rectF = new RectF(drawable.getBounds());
            bk0Var.getImageMatrix().mapRect(rectF);
            bk0Var.getLocationInWindow(iArr);
            rectF.offset(bk0Var.getPaddingLeft() + iArr[0], bk0Var.getPaddingTop() + iArr[1]);
            if (b4Var != null) {
                b4Var.getLocationInWindow(iArr);
                rectF.offset(-iArr[0], -iArr[1]);
            }
            int max = Math.max(1, ((int) Math.floor(rectF.left)) - 1);
            int min = Math.min(bitmap.getWidth(), ((int) Math.ceil(rectF.right)) + 1);
            int max2 = Math.max(0, ((int) Math.floor(rectF.top)) - 1);
            int min2 = Math.min(bitmap.getHeight(), ((int) Math.ceil(rectF.bottom)) + 1);
            if (max >= min || max2 >= min2) {
                return;
            }
            int i10 = min - max;
            int[] iArr2 = new int[i10];
            for (int i11 = max2; i11 < min2; i11++) {
                Arrays.fill(iArr2, bitmap.getPixel(max - 1, i11));
                bitmap.setPixels(iArr2, 0, i10, max, i11, i10, 1);
            }
        }
    }

    public final void b(float f7, float f10, boolean z10) {
        this.e = f7;
        this.f = f10;
        this.d = z10;
        RadialGradient radialGradient = this.c;
        Paint paint = this.a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.c = radialGradient2;
            paint.setShader(radialGradient2);
        }
        paint.setXfermode(new PorterDuffXfermode(z10 ? PorterDuff.Mode.DST_OUT : PorterDuff.Mode.DST_IN));
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
            bk0 bk0Var = this.n;
            Drawable drawable = bk0Var != null ? bk0Var.getDrawable() : 0;
            if (drawable != 0 && this.n.isAttachedToWindow()) {
                this.n.getLocationInWindow(this.s);
                getLocationInWindow(this.v);
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
            float f7 = this.h;
            if (f7 >= 1.0f) {
                float f10 = f7 / 100.0f;
                Matrix matrix = this.b;
                matrix.setScale(f10, f10);
                matrix.postTranslate(this.e, this.f);
                this.c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f7) {
        this.h = f7;
        invalidate();
    }
}
