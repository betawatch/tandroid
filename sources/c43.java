// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class c43 extends Drawable {
    public final Drawable a;
    public final RectF b = new RectF();
    public final Paint c;
    public final Paint d;
    public int e;
    public final int f;
    public float g;
    public boolean h;
    public float i;
    public float j;
    public float k;

    public c43(Context context, int i, int i2) {
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.a = context.getDrawable(i);
        this.f = i2;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(hl.N(1.7f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(style);
        paint2.setStrokeWidth(hl.N(2.5f));
    }

    public final void a(boolean z, boolean z2) {
        if (this.h != z) {
            this.h = z;
            if (z2) {
                this.g = z ? 0.0f : 1.0f;
            } else {
                this.g = z ? 1.0f : 0.0f;
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int w0;
        int i;
        boolean z = this.h;
        if (z) {
            float f = this.g;
            if (f != 1.0f) {
                this.g = f + 0.10666667f;
                invalidateSelf();
                if (this.g > 1.0f) {
                    this.g = 1.0f;
                }
                int i2 = this.f;
                w0 = i2 >= 0 ? -1 : aob.w0(null, i2, false);
                i = this.e;
                Drawable drawable = this.a;
                Paint paint = this.c;
                if (i != w0) {
                    this.e = w0;
                    paint.setColor(w0);
                    drawable.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
                }
                if (this.g != 0.0f) {
                    drawable.draw(canvas);
                    return;
                }
                Rect bounds = drawable.getBounds();
                RectF rectF = this.b;
                rectF.set(bounds);
                canvas.saveLayerAlpha(rectF, jn7.d4, 31);
                drawable.draw(canvas);
                float N = hl.N(4.5f) + rectF.left + this.i + this.j;
                float N2 = ((hl.N(4.5f) + rectF.top) - hl.L(1.0f)) + this.j;
                float L = ((rectF.right - hl.L(3.0f)) + this.i) - this.k;
                float L2 = ((rectF.bottom - hl.L(1.0f)) - hl.L(3.0f)) - this.k;
                boolean z2 = this.h;
                float f2 = this.g;
                if (z2) {
                    L = qd4.A(L, N, f2, N);
                    L2 = qd4.A(L2, N2, f2, N2);
                } else {
                    N = qd4.A(1.0f, f2, L - N, N);
                    N2 = qd4.A(1.0f, f2, L2 - N2, N2);
                }
                float f3 = L2;
                float f4 = N2;
                float f5 = L;
                float strokeWidth = f4 - paint.getStrokeWidth();
                float strokeWidth2 = f3 - paint.getStrokeWidth();
                Paint paint2 = this.d;
                float f6 = N;
                canvas.drawLine(f6, strokeWidth, f5, strokeWidth2, paint2);
                float strokeWidth3 = ((paint2.getStrokeWidth() - paint.getStrokeWidth()) / 2.0f) + 1.0f;
                canvas.drawLine(f6, f4 - strokeWidth3, f5, f3 - strokeWidth3, paint2);
                canvas.drawLine(f6, f4, f5, f3, paint);
                canvas.restore();
                return;
            }
        }
        if (!z) {
            float f7 = this.g;
            if (f7 != 0.0f) {
                this.g = f7 - 0.10666667f;
                invalidateSelf();
                if (this.g < 0.0f) {
                    this.g = 0.0f;
                }
            }
        }
        int i22 = this.f;
        if (i22 >= 0) {
        }
        i = this.e;
        Drawable drawable2 = this.a;
        Paint paint3 = this.c;
        if (i != w0) {
        }
        if (this.g != 0.0f) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
