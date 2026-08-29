package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public final void a(float f9, boolean z10) {
        this.d = 0L;
        float f10 = this.f;
        if (f10 == 1.0f) {
            this.c = true;
        } else if (f10 == 0.0f) {
            this.c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f10 < f9) {
                this.g = (int) (f10 * 200.0f);
            } else {
                this.g = (int) ((1.0f - f10) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.e = f9;
        } else {
            this.f = f9;
            this.e = f9;
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
        float f9 = this.f;
        float f10 = this.e;
        if (f9 != f10) {
            if (j10 != 0) {
                int i10 = (int) (this.g + j11);
                this.g = i10;
                if (i10 >= 200) {
                    this.f = f10;
                } else {
                    DecelerateInterpolator decelerateInterpolator = this.i;
                    if (f9 < f10) {
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
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.f), AndroidUtilities.dp(24.0f) / 2);
        int i11 = this.j;
        if (i11 == 0) {
            i11 = g6.w0(null, g6.v8, false);
        }
        int i12 = this.k;
        if (i12 == 0) {
            i12 = g6.w0(null, g6.s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.a;
        if (z10) {
            canvas.rotate(this.f * (this.c ? -180 : 180), AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(i11);
            paint.setAlpha(this.o);
            canvas.drawLine(this.l ? com.google.android.recaptcha.internal.a.z(1.0f, this.f, paint.getStrokeWidth() / 2.0f, AndroidUtilities.dp(0.5f) * this.f) : 0.0f, 0.0f, ((AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.f)) - 0.0f) - (this.l ? (1.0f - this.f) * (paint.getStrokeWidth() / 2.0f) : 0.0f), 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f) * AndroidUtilities.dp(0.5f));
            dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f) * AndroidUtilities.dp(2.5f));
            abs2 = (Math.abs(this.f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            abs3 = Math.abs(this.f) * AndroidUtilities.dp(7.5f);
            if (this.l) {
                abs3 = com.google.android.recaptcha.internal.a.z(1.0f, this.f, paint.getStrokeWidth() / 2.0f, abs3);
                float dp2 = (AndroidUtilities.dp(0.5f) * this.f) + abs;
                dp -= ((1.0f - this.f) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.f);
                abs2 -= AndroidUtilities.dp(0.25f) * this.f;
                abs = (AndroidUtilities.dp(0.25f) * this.f) + dp2;
            }
        } else {
            canvas.rotate(this.f * (this.c ? -225 : 135), AndroidUtilities.dp(9.0f), 0.0f);
            if (this.n) {
                paint.setColor(i11);
                paint.setAlpha(this.o);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.f) + ((1.0f - Math.abs(this.f)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.f) + ((1.0f - this.f) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.f) * AndroidUtilities.dpf2(0.5f));
                dp = (Math.abs(this.f) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.f)) * AndroidUtilities.dpf2(16.0f));
                abs2 = (Math.abs(this.f) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                abs3 = (Math.abs(this.f) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int w02 = g6.w0(null, g6.y8, false);
                AndroidUtilities.getOffsetColor(i12, g6.w0(null, g6.w8, false), this.f, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(i11, w02, this.f, 1.0f));
                paint.setAlpha(this.o);
                canvas.drawLine(this.f * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f) * AndroidUtilities.dp(0.5f));
                dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f) * AndroidUtilities.dp(9.0f));
                abs2 = (Math.abs(this.f) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                abs3 = Math.abs(this.f) * AndroidUtilities.dp(9.0f);
            }
        }
        float f13 = dp;
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
