package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dr extends Drawable {
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

    public dr(Context context, int i10, int i11) {
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.a = context.getDrawable(i10);
        this.f = i11;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.7f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.i0.N(2.5f));
    }

    public final void a(boolean z10, boolean z11) {
        if (this.h != z10) {
            this.h = z10;
            if (z11) {
                this.g = z10 ? 0.0f : 1.0f;
            } else {
                this.g = z10 ? 1.0f : 0.0f;
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
        int x02;
        int i10;
        boolean z10 = this.h;
        if (z10) {
            float f7 = this.g;
            if (f7 != 1.0f) {
                this.g = f7 + 0.10666667f;
                invalidateSelf();
                if (this.g > 1.0f) {
                    this.g = 1.0f;
                }
                int i11 = this.f;
                x02 = i11 >= 0 ? -1 : org.telegram.ui.ActionBar.t6.x0(null, i11, false);
                i10 = this.e;
                Drawable drawable = this.a;
                Paint paint = this.c;
                if (i10 != x02) {
                    this.e = x02;
                    paint.setColor(x02);
                    drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
                }
                if (this.g != 0.0f) {
                    drawable.draw(canvas);
                    return;
                }
                Rect bounds = drawable.getBounds();
                RectF rectF = this.b;
                rectF.set(bounds);
                canvas.saveLayerAlpha(rectF, org.telegram.messenger.zs.e4, 31);
                drawable.draw(canvas);
                float N = org.telegram.messenger.i0.N(4.5f) + rectF.left + this.i + this.j;
                float N2 = ((org.telegram.messenger.i0.N(4.5f) + rectF.top) - org.telegram.messenger.i0.L(1.0f)) + this.j;
                float L = ((rectF.right - org.telegram.messenger.i0.L(3.0f)) + this.i) - this.k;
                float L2 = ((rectF.bottom - org.telegram.messenger.i0.L(1.0f)) - org.telegram.messenger.i0.L(3.0f)) - this.k;
                if (this.h) {
                    float f10 = this.g;
                    L = ((L - N) * f10) + N;
                    L2 = c3.i0.z(L2, N2, f10, N2);
                } else {
                    float f11 = this.g;
                    N = c3.i0.z(1.0f, f11, L - N, N);
                    N2 = c3.i0.z(1.0f, f11, L2 - N2, N2);
                }
                float f12 = L2;
                float f13 = N2;
                float f14 = L;
                float f15 = N;
                float strokeWidth = f13 - paint.getStrokeWidth();
                float strokeWidth2 = f12 - paint.getStrokeWidth();
                Paint paint2 = this.d;
                canvas.drawLine(f15, strokeWidth, f14, strokeWidth2, paint2);
                float strokeWidth3 = ((paint2.getStrokeWidth() - paint.getStrokeWidth()) / 2.0f) + 1.0f;
                canvas.drawLine(f15, f13 - strokeWidth3, f14, f12 - strokeWidth3, paint2);
                canvas.drawLine(f15, f13, f14, f12, paint);
                canvas.restore();
                return;
            }
        }
        if (!z10) {
            float f16 = this.g;
            if (f16 != 0.0f) {
                this.g = f16 - 0.10666667f;
                invalidateSelf();
                if (this.g < 0.0f) {
                    this.g = 0.0f;
                }
            }
        }
        int i112 = this.f;
        if (i112 >= 0) {
        }
        i10 = this.e;
        Drawable drawable2 = this.a;
        Paint paint3 = this.c;
        if (i10 != x02) {
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
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.a.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
