package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class y1 extends Drawable {
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

    public y1(boolean z9) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.i = -1;
        this.j = -9079435;
        this.k = 300.0f;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setColor(-65536);
        this.g = z9;
    }

    public final void a(int i7) {
        this.i = i7;
        invalidateSelf();
    }

    public final void b(int i7) {
        this.j = i7;
        invalidateSelf();
    }

    public final void c(boolean z9, float f10) {
        this.c = 0L;
        float f11 = this.e;
        if (f11 == 1.0f) {
            this.b = true;
        } else if (f11 == 0.0f) {
            this.b = false;
        }
        this.c = 0L;
        if (z9) {
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
        int f14 = i0.a.f(this.e, this.i, this.j);
        Paint paint = this.a;
        paint.setColor(f14);
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(24.0f) / 2.0f, org.telegram.messenger.g0.L(24.0f) / 2.0f);
        int i7 = this.l;
        if (i7 != 0) {
            canvas.rotate(i7);
        }
        float f15 = this.e;
        canvas.translate(-org.telegram.messenger.g0.L(0.66f), 0.0f);
        if (this.g) {
            canvas.rotate((this.e * (this.b ? -180 : qs.K2)) + 135.0f);
            f15 = 1.0f;
        } else {
            canvas.rotate(this.e * (this.b ? -225 : qs.R1));
        }
        float f16 = 1.0f - f15;
        canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-6.75f, -8.0f, f15)), 0.0f, org.telegram.messenger.g0.L(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f16), 0.0f, paint);
        float L = org.telegram.messenger.g0.L(-0.25f);
        float L2 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(7.0f, 8.0f, f15)) - ((paint.getStrokeWidth() / 4.0f) * f16);
        float L3 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-7.25f, 0.0f, f15));
        canvas.drawLine(L3, -L, 0.0f, -L2, paint);
        canvas.drawLine(L3, L, 0.0f, L2, paint);
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
    public final void setAlpha(int i7) {
        this.a.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
