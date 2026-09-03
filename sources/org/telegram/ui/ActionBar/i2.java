package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i2 extends Drawable {
    public final Paint a;
    public boolean b;
    public long c;
    public float d;
    public float e;
    public int f;
    public final boolean g;
    public final DecelerateInterpolator h;
    public int i;
    public int j;
    public float k;
    public int l;

    public i2(boolean z4) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.i = -1;
        this.j = -9079435;
        this.k = 300.0f;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(-65536);
        this.g = z4;
    }

    public final void a(int i10) {
        this.i = i10;
        invalidateSelf();
    }

    public final void b(int i10) {
        this.j = i10;
        invalidateSelf();
    }

    public final void c(float f10, boolean z4) {
        this.c = 0L;
        float f11 = this.e;
        if (f11 == 1.0f) {
            this.b = true;
        } else if (f11 == 0.0f) {
            this.b = false;
        }
        this.c = 0L;
        if (z4) {
            if (f11 < f10) {
                this.f = (int) (f11 * this.k);
            } else {
                this.f = (int) ((1.0f - f11) * this.k);
            }
            this.c = System.currentTimeMillis();
            this.d = f10;
        } else {
            this.e = f10;
            this.d = f10;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.e != this.d) {
            if (this.c != 0) {
                int currentTimeMillis = this.f + ((int) (System.currentTimeMillis() - this.c));
                this.f = currentTimeMillis;
                float f10 = currentTimeMillis;
                float f11 = this.k;
                if (f10 >= f11) {
                    this.e = this.d;
                } else {
                    float f12 = this.e;
                    float f13 = this.d;
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f12 < f13) {
                        this.e = decelerateInterpolator.getInterpolation(f10 / f11) * this.d;
                    } else {
                        this.e = 1.0f - decelerateInterpolator.getInterpolation(f10 / f11);
                    }
                }
            }
            this.c = System.currentTimeMillis();
            invalidateSelf();
        }
        int d = i0.a.d(this.e, this.i, this.j);
        Paint paint = this.a;
        paint.setColor(d);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(24.0f) / 2.0f, AndroidUtilities.dp(24.0f) / 2.0f);
        int i10 = this.l;
        if (i10 != 0) {
            canvas.rotate(i10);
        }
        float f14 = this.e;
        canvas.translate(-AndroidUtilities.dp(0.66f), 0.0f);
        if (this.g) {
            canvas.rotate((this.e * (this.b ? -180 : 180)) + 135.0f);
            f14 = 1.0f;
        } else {
            canvas.rotate(this.e * (this.b ? -225 : 135));
        }
        float f15 = 1.0f - f14;
        canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.lerp(-6.75f, -8.0f, f14)), 0.0f, AndroidUtilities.dp(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f15), 0.0f, paint);
        float dp = AndroidUtilities.dp(-0.25f);
        float dp2 = AndroidUtilities.dp(AndroidUtilities.lerp(7.0f, 8.0f, f14)) - ((paint.getStrokeWidth() / 4.0f) * f15);
        float dp3 = AndroidUtilities.dp(AndroidUtilities.lerp(-7.25f, 0.0f, f14));
        canvas.drawLine(dp3, -dp, 0.0f, -dp2, paint);
        canvas.drawLine(dp3, dp, 0.0f, dp2, paint);
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
        this.a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
