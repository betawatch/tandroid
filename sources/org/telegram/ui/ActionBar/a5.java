package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class a5 extends Drawable {
    public final Paint a;
    public final Paint b;
    public boolean c;
    public long d;
    public float e;
    public float f;
    public int g;
    public boolean h;
    public final DecelerateInterpolator i;
    public int j;
    public int k;
    public boolean l;
    public float m;
    public boolean n;
    public int o;

    public a5() {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.h = true;
        this.i = new DecelerateInterpolator();
        new RectF();
        this.o = zs.e4;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint2.setStrokeWidth(org.telegram.messenger.i0.p * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.m = 1.0f;
    }

    public final void a(boolean z10, float f7) {
        this.d = 0L;
        float f10 = this.f;
        if (f10 == 1.0f) {
            this.c = true;
        } else if (f10 == 0.0f) {
            this.c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f10 < f7) {
                this.g = (int) (f10 * 200.0f);
            } else {
                this.g = (int) ((1.0f - f10) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.e = f7;
        } else {
            this.f = f7;
            this.e = f7;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float abs;
        float L;
        float abs2;
        float abs3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.d;
        long j11 = elapsedRealtime - j10;
        float f7 = this.f;
        float f10 = this.e;
        if (f7 != f10) {
            if (j10 != 0) {
                int i10 = (int) (this.g + j11);
                this.g = i10;
                if (i10 >= 200) {
                    this.f = f10;
                } else {
                    DecelerateInterpolator decelerateInterpolator = this.i;
                    if (f7 < f10) {
                        this.f = decelerateInterpolator.getInterpolation(i10 / 200.0f) * this.e;
                    } else {
                        this.f = 1.0f - decelerateInterpolator.getInterpolation(i10 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f11 = this.m;
        if (f11 < 1.0f) {
            float f12 = (j11 / 200.0f) + f11;
            this.m = f12;
            if (f12 > 1.0f) {
                this.m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((org.telegram.messenger.i0.L(24.0f) / 2) - org.telegram.messenger.i0.L(9.0f)) - (org.telegram.messenger.i0.L(1.0f) * this.f), org.telegram.messenger.i0.L(24.0f) / 2);
        int i11 = this.j;
        if (i11 == 0) {
            i11 = t6.x0(null, t6.v8, false);
        }
        int i12 = this.k;
        if (i12 == 0) {
            i12 = t6.x0(null, t6.s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.a;
        if (z10) {
            canvas.rotate(this.f * (this.c ? -180 : zs.K2), org.telegram.messenger.i0.L(9.0f), 0.0f);
            paint.setColor(i11);
            paint.setAlpha(this.o);
            canvas.drawLine(this.l ? c3.i0.z(1.0f, this.f, paint.getStrokeWidth() / 2.0f, org.telegram.messenger.i0.L(0.5f) * this.f) : 0.0f, 0.0f, ((org.telegram.messenger.i0.L(18.0f) - (org.telegram.messenger.i0.L(3.0f) * this.f)) - 0.0f) - (this.l ? (1.0f - this.f) * (paint.getStrokeWidth() / 2.0f) : 0.0f), 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f)) * org.telegram.messenger.i0.L(5.0f)) - (Math.abs(this.f) * org.telegram.messenger.i0.L(0.5f));
            L = org.telegram.messenger.i0.L(18.0f) - (Math.abs(this.f) * org.telegram.messenger.i0.L(2.5f));
            abs2 = (Math.abs(this.f) * org.telegram.messenger.i0.L(2.0f)) + org.telegram.messenger.i0.L(5.0f);
            abs3 = Math.abs(this.f) * org.telegram.messenger.i0.L(7.5f);
            if (this.l) {
                abs3 = c3.i0.z(1.0f, this.f, paint.getStrokeWidth() / 2.0f, abs3);
                float L2 = (org.telegram.messenger.i0.L(0.5f) * this.f) + abs;
                L -= ((1.0f - this.f) * (paint.getStrokeWidth() / 2.0f)) + (org.telegram.messenger.i0.L(0.5f) * this.f);
                abs2 -= org.telegram.messenger.i0.L(0.25f) * this.f;
                abs = (org.telegram.messenger.i0.L(0.25f) * this.f) + L2;
            }
        } else {
            canvas.rotate(this.f * (this.c ? -225 : zs.R1), org.telegram.messenger.i0.L(9.0f), 0.0f);
            if (this.n) {
                paint.setColor(i11);
                paint.setAlpha(this.o);
                canvas.drawLine((org.telegram.messenger.i0.L(1.0f) * this.f) + ((1.0f - Math.abs(this.f)) * org.telegram.messenger.i0.N(2.0f)), 0.0f, ((org.telegram.messenger.i0.L(17.0f) * this.f) + ((1.0f - this.f) * org.telegram.messenger.i0.N(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * org.telegram.messenger.i0.N(5.0f)) - (Math.abs(this.f) * org.telegram.messenger.i0.N(0.5f));
                L = (Math.abs(this.f) * org.telegram.messenger.i0.N(9.0f)) + ((1.0f - Math.abs(this.f)) * org.telegram.messenger.i0.N(16.0f));
                abs2 = (Math.abs(this.f) * org.telegram.messenger.i0.N(3.0f)) + org.telegram.messenger.i0.N(5.0f);
                abs3 = (Math.abs(this.f) * org.telegram.messenger.i0.N(7.0f)) + org.telegram.messenger.i0.N(2.0f);
            } else {
                int x02 = t6.x0(null, t6.y8, false);
                org.telegram.messenger.i0.S0(this.f, 1.0f, i12, t6.x0(null, t6.w8, false));
                paint.setColor(org.telegram.messenger.i0.S0(this.f, 1.0f, i11, x02));
                paint.setAlpha(this.o);
                canvas.drawLine(this.f * org.telegram.messenger.i0.L(1.0f), 0.0f, (org.telegram.messenger.i0.L(18.0f) - (org.telegram.messenger.i0.L(1.0f) * this.f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * org.telegram.messenger.i0.L(5.0f)) - (Math.abs(this.f) * org.telegram.messenger.i0.L(0.5f));
                L = org.telegram.messenger.i0.L(18.0f) - (Math.abs(this.f) * org.telegram.messenger.i0.L(9.0f));
                abs2 = (Math.abs(this.f) * org.telegram.messenger.i0.L(3.0f)) + org.telegram.messenger.i0.L(5.0f);
                abs3 = Math.abs(this.f) * org.telegram.messenger.i0.L(9.0f);
            }
        }
        float f13 = L;
        float f14 = abs3;
        float f15 = abs2;
        float f16 = abs;
        if (this.n) {
            canvas.drawLine(f14, -f15, f13, -f16, paint);
            canvas.drawLine(f14, f15, f13, f16, paint);
        } else {
            canvas.drawLine(f14, -f15, f13 - 0.0f, -f16, paint);
            canvas.drawLine(f14, f15, f13, f16, paint);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.o != i10) {
            this.o = i10;
            this.a.setAlpha(i10);
            this.b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
