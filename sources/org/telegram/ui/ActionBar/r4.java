package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class r4 extends Drawable {
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

    public r4() {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.h = true;
        this.i = new DecelerateInterpolator();
        new RectF();
        this.o = hs.e4;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setStrokeWidth(org.telegram.messenger.g0.p * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.m = 1.0f;
    }

    public final void a(boolean z10, float f10) {
        this.d = 0L;
        float f11 = this.f;
        if (f11 == 1.0f) {
            this.c = true;
        } else if (f11 == 0.0f) {
            this.c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f11 < f10) {
                this.g = (int) (f11 * 200.0f);
            } else {
                this.g = (int) ((1.0f - f11) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.e = f10;
        } else {
            this.f = f10;
            this.e = f10;
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
        float f10 = this.f;
        float f11 = this.e;
        if (f10 != f11) {
            if (j10 != 0) {
                int i3 = (int) (this.g + j11);
                this.g = i3;
                if (i3 >= 200) {
                    this.f = f11;
                } else {
                    DecelerateInterpolator decelerateInterpolator = this.i;
                    if (f10 < f11) {
                        this.f = decelerateInterpolator.getInterpolation(i3 / 200.0f) * this.e;
                    } else {
                        this.f = 1.0f - decelerateInterpolator.getInterpolation(i3 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f12 = this.m;
        if (f12 < 1.0f) {
            float f13 = (j11 / 200.0f) + f12;
            this.m = f13;
            if (f13 > 1.0f) {
                this.m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((org.telegram.messenger.g0.L(24.0f) / 2) - org.telegram.messenger.g0.L(9.0f)) - (org.telegram.messenger.g0.L(1.0f) * this.f), org.telegram.messenger.g0.L(24.0f) / 2);
        int i10 = this.j;
        if (i10 == 0) {
            i10 = k6.x0(null, k6.v8, false);
        }
        int i11 = this.k;
        if (i11 == 0) {
            i11 = k6.x0(null, k6.s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.a;
        if (z10) {
            canvas.rotate(this.f * (this.c ? -180 : hs.K2), org.telegram.messenger.g0.L(9.0f), 0.0f);
            paint.setColor(i10);
            paint.setAlpha(this.o);
            canvas.drawLine(this.l ? com.google.android.recaptcha.internal.a.y(1.0f, this.f, paint.getStrokeWidth() / 2.0f, org.telegram.messenger.g0.L(0.5f) * this.f) : 0.0f, 0.0f, ((org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(3.0f) * this.f)) - 0.0f) - (this.l ? (1.0f - this.f) * (paint.getStrokeWidth() / 2.0f) : 0.0f), 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f) * org.telegram.messenger.g0.L(0.5f));
            L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f) * org.telegram.messenger.g0.L(2.5f));
            abs2 = (Math.abs(this.f) * org.telegram.messenger.g0.L(2.0f)) + org.telegram.messenger.g0.L(5.0f);
            abs3 = Math.abs(this.f) * org.telegram.messenger.g0.L(7.5f);
            if (this.l) {
                abs3 = com.google.android.recaptcha.internal.a.y(1.0f, this.f, paint.getStrokeWidth() / 2.0f, abs3);
                float L2 = (org.telegram.messenger.g0.L(0.5f) * this.f) + abs;
                L -= ((1.0f - this.f) * (paint.getStrokeWidth() / 2.0f)) + (org.telegram.messenger.g0.L(0.5f) * this.f);
                abs2 -= org.telegram.messenger.g0.L(0.25f) * this.f;
                abs = (org.telegram.messenger.g0.L(0.25f) * this.f) + L2;
            }
        } else {
            canvas.rotate(this.f * (this.c ? -225 : hs.R1), org.telegram.messenger.g0.L(9.0f), 0.0f);
            if (this.n) {
                paint.setColor(i10);
                paint.setAlpha(this.o);
                canvas.drawLine((org.telegram.messenger.g0.L(1.0f) * this.f) + ((1.0f - Math.abs(this.f)) * org.telegram.messenger.g0.N(2.0f)), 0.0f, ((org.telegram.messenger.g0.L(17.0f) * this.f) + ((1.0f - this.f) * org.telegram.messenger.g0.N(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * org.telegram.messenger.g0.N(5.0f)) - (Math.abs(this.f) * org.telegram.messenger.g0.N(0.5f));
                L = (Math.abs(this.f) * org.telegram.messenger.g0.N(9.0f)) + ((1.0f - Math.abs(this.f)) * org.telegram.messenger.g0.N(16.0f));
                abs2 = (Math.abs(this.f) * org.telegram.messenger.g0.N(3.0f)) + org.telegram.messenger.g0.N(5.0f);
                abs3 = (Math.abs(this.f) * org.telegram.messenger.g0.N(7.0f)) + org.telegram.messenger.g0.N(2.0f);
            } else {
                int x02 = k6.x0(null, k6.y8, false);
                org.telegram.messenger.g0.S0(this.f, 1.0f, i11, k6.x0(null, k6.w8, false));
                paint.setColor(org.telegram.messenger.g0.S0(this.f, 1.0f, i10, x02));
                paint.setAlpha(this.o);
                canvas.drawLine(this.f * org.telegram.messenger.g0.L(1.0f), 0.0f, (org.telegram.messenger.g0.L(18.0f) - (org.telegram.messenger.g0.L(1.0f) * this.f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * org.telegram.messenger.g0.L(5.0f)) - (Math.abs(this.f) * org.telegram.messenger.g0.L(0.5f));
                L = org.telegram.messenger.g0.L(18.0f) - (Math.abs(this.f) * org.telegram.messenger.g0.L(9.0f));
                abs2 = (Math.abs(this.f) * org.telegram.messenger.g0.L(3.0f)) + org.telegram.messenger.g0.L(5.0f);
                abs3 = Math.abs(this.f) * org.telegram.messenger.g0.L(9.0f);
            }
        }
        float f14 = L;
        float f15 = abs3;
        float f16 = abs2;
        float f17 = abs;
        if (this.n) {
            canvas.drawLine(f15, -f16, f14, -f17, paint);
            canvas.drawLine(f15, f16, f14, f17, paint);
        } else {
            canvas.drawLine(f15, -f16, f14 - 0.0f, -f17, paint);
            canvas.drawLine(f15, f16, f14, f17, paint);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        if (this.o != i3) {
            this.o = i3;
            this.a.setAlpha(i3);
            this.b.setAlpha(i3);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
