package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class c5 extends Drawable {
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

    public c5() {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.h = true;
        this.i = new DecelerateInterpolator();
        new RectF();
        this.o = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.m = 1.0f;
    }

    public final void a(float f10, boolean z10) {
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
        float dp;
        float abs2;
        float abs3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.d;
        long j11 = elapsedRealtime - j10;
        float f10 = this.f;
        float f11 = this.e;
        if (f10 != f11) {
            if (j10 != 0) {
                int i9 = (int) (this.g + j11);
                this.g = i9;
                if (i9 >= 200) {
                    this.f = f11;
                } else {
                    DecelerateInterpolator decelerateInterpolator = this.i;
                    if (f10 < f11) {
                        this.f = decelerateInterpolator.getInterpolation(i9 / 200.0f) * this.e;
                    } else {
                        this.f = 1.0f - decelerateInterpolator.getInterpolation(i9 / 200.0f);
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
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.f), AndroidUtilities.dp(24.0f) / 2);
        int i10 = this.j;
        if (i10 == 0) {
            i10 = f6.w0(null, f6.v8, false);
        }
        int i11 = this.k;
        if (i11 == 0) {
            i11 = f6.w0(null, f6.s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.a;
        if (z10) {
            canvas.rotate(this.f * (this.c ? -180 : 180), AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(i10);
            paint.setAlpha(this.o);
            canvas.drawLine(this.l ? e2.c.z(1.0f, this.f, paint.getStrokeWidth() / 2.0f, AndroidUtilities.dp(0.5f) * this.f) : 0.0f, 0.0f, ((AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.f)) - 0.0f) - (this.l ? (1.0f - this.f) * (paint.getStrokeWidth() / 2.0f) : 0.0f), 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f) * AndroidUtilities.dp(0.5f));
            dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f) * AndroidUtilities.dp(2.5f));
            abs2 = (Math.abs(this.f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            abs3 = Math.abs(this.f) * AndroidUtilities.dp(7.5f);
            if (this.l) {
                abs3 = e2.c.z(1.0f, this.f, paint.getStrokeWidth() / 2.0f, abs3);
                float dp2 = (AndroidUtilities.dp(0.5f) * this.f) + abs;
                dp -= ((1.0f - this.f) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.f);
                abs2 -= AndroidUtilities.dp(0.25f) * this.f;
                abs = (AndroidUtilities.dp(0.25f) * this.f) + dp2;
            }
        } else {
            canvas.rotate(this.f * (this.c ? -225 : 135), AndroidUtilities.dp(9.0f), 0.0f);
            if (this.n) {
                paint.setColor(i10);
                paint.setAlpha(this.o);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.f) + ((1.0f - Math.abs(this.f)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.f) + ((1.0f - this.f) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.f) * AndroidUtilities.dpf2(0.5f));
                dp = (Math.abs(this.f) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.f)) * AndroidUtilities.dpf2(16.0f));
                abs2 = (Math.abs(this.f) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                abs3 = (Math.abs(this.f) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int w02 = f6.w0(null, f6.y8, false);
                AndroidUtilities.getOffsetColor(i11, f6.w0(null, f6.w8, false), this.f, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(i10, w02, this.f, 1.0f));
                paint.setAlpha(this.o);
                canvas.drawLine(this.f * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f) * AndroidUtilities.dp(0.5f));
                dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f) * AndroidUtilities.dp(9.0f));
                abs2 = (Math.abs(this.f) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                abs3 = Math.abs(this.f) * AndroidUtilities.dp(9.0f);
            }
        }
        float f14 = dp;
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
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        if (this.o != i9) {
            this.o = i9;
            this.a.setAlpha(i9);
            this.b.setAlpha(i9);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
