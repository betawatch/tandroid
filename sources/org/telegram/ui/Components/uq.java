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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class uq extends Drawable {
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

    public uq(Context context, int i7, int i10) {
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.a = context.getDrawable(i7);
        this.f = i10;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.7f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.N(2.5f));
    }

    public final void a(boolean z9, boolean z10) {
        if (this.h != z9) {
            this.h = z9;
            if (z10) {
                this.g = z9 ? 0.0f : 1.0f;
            } else {
                this.g = z9 ? 1.0f : 0.0f;
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
        int i7;
        boolean z9 = this.h;
        if (z9) {
            float f10 = this.g;
            if (f10 != 1.0f) {
                this.g = f10 + 0.10666667f;
                invalidateSelf();
                if (this.g > 1.0f) {
                    this.g = 1.0f;
                }
                int i10 = this.f;
                x02 = i10 >= 0 ? -1 : org.telegram.ui.ActionBar.l6.x0(null, i10, false);
                i7 = this.e;
                Drawable drawable = this.a;
                Paint paint = this.c;
                if (i7 != x02) {
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
                canvas.saveLayerAlpha(rectF, org.telegram.messenger.qs.e4, 31);
                drawable.draw(canvas);
                float N = org.telegram.messenger.g0.N(4.5f) + rectF.left + this.i + this.j;
                float N2 = ((org.telegram.messenger.g0.N(4.5f) + rectF.top) - org.telegram.messenger.g0.L(1.0f)) + this.j;
                float L = ((rectF.right - org.telegram.messenger.g0.L(3.0f)) + this.i) - this.k;
                float L2 = ((rectF.bottom - org.telegram.messenger.g0.L(1.0f)) - org.telegram.messenger.g0.L(3.0f)) - this.k;
                if (this.h) {
                    float f11 = this.g;
                    L = ((L - N) * f11) + N;
                    L2 = com.google.android.recaptcha.internal.a.z(L2, N2, f11, N2);
                } else {
                    float f12 = this.g;
                    N = com.google.android.recaptcha.internal.a.z(1.0f, f12, L - N, N);
                    N2 = com.google.android.recaptcha.internal.a.z(1.0f, f12, L2 - N2, N2);
                }
                float f13 = L2;
                float f14 = N2;
                float f15 = L;
                float f16 = N;
                float strokeWidth = f14 - paint.getStrokeWidth();
                float strokeWidth2 = f13 - paint.getStrokeWidth();
                Paint paint2 = this.d;
                canvas.drawLine(f16, strokeWidth, f15, strokeWidth2, paint2);
                float strokeWidth3 = ((paint2.getStrokeWidth() - paint.getStrokeWidth()) / 2.0f) + 1.0f;
                canvas.drawLine(f16, f14 - strokeWidth3, f15, f13 - strokeWidth3, paint2);
                canvas.drawLine(f16, f14, f15, f13, paint);
                canvas.restore();
                return;
            }
        }
        if (!z9) {
            float f17 = this.g;
            if (f17 != 0.0f) {
                this.g = f17 - 0.10666667f;
                invalidateSelf();
                if (this.g < 0.0f) {
                    this.g = 0.0f;
                }
            }
        }
        int i102 = this.f;
        if (i102 >= 0) {
        }
        i7 = this.e;
        Drawable drawable2 = this.a;
        Paint paint3 = this.c;
        if (i7 != x02) {
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
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.a.setBounds(i7, i10, i11, i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
