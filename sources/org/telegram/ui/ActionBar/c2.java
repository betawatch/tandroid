package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c2 extends Drawable {
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

    public c2(boolean z10) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.i = -1;
        this.j = -9079435;
        this.k = 300.0f;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint2.setColor(-65536);
        this.g = z10;
    }

    public final void a(int i10) {
        this.i = i10;
        invalidateSelf();
    }

    public final void b(int i10) {
        this.j = i10;
        invalidateSelf();
    }

    public final void c(boolean z10, float f7) {
        this.c = 0L;
        float f10 = this.e;
        if (f10 == 1.0f) {
            this.b = true;
        } else if (f10 == 0.0f) {
            this.b = false;
        }
        this.c = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f = (int) (f10 * this.k);
            } else {
                this.f = (int) ((1.0f - f10) * this.k);
            }
            this.c = System.currentTimeMillis();
            this.d = f7;
        } else {
            this.e = f7;
            this.d = f7;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.e != this.d) {
            if (this.c != 0) {
                int currentTimeMillis = this.f + ((int) (System.currentTimeMillis() - this.c));
                this.f = currentTimeMillis;
                float f7 = currentTimeMillis;
                float f10 = this.k;
                if (f7 >= f10) {
                    this.e = this.d;
                } else {
                    float f11 = this.e;
                    float f12 = this.d;
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f11 < f12) {
                        this.e = decelerateInterpolator.getInterpolation(f7 / f10) * this.d;
                    } else {
                        this.e = 1.0f - decelerateInterpolator.getInterpolation(f7 / f10);
                    }
                }
            }
            this.c = System.currentTimeMillis();
            invalidateSelf();
        }
        int f13 = i0.b.f(this.e, this.i, this.j);
        Paint paint = this.a;
        paint.setColor(f13);
        canvas.save();
        canvas.translate(org.telegram.messenger.i0.L(24.0f) / 2.0f, org.telegram.messenger.i0.L(24.0f) / 2.0f);
        int i10 = this.l;
        if (i10 != 0) {
            canvas.rotate(i10);
        }
        float f14 = this.e;
        canvas.translate(-org.telegram.messenger.i0.L(0.66f), 0.0f);
        if (this.g) {
            canvas.rotate((this.e * (this.b ? -180 : zs.K2)) + 135.0f);
            f14 = 1.0f;
        } else {
            canvas.rotate(this.e * (this.b ? -225 : zs.R1));
        }
        float f15 = 1.0f - f14;
        canvas.drawLine(org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-6.75f, -8.0f, f14)), 0.0f, org.telegram.messenger.i0.L(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f15), 0.0f, paint);
        float L = org.telegram.messenger.i0.L(-0.25f);
        float L2 = org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(7.0f, 8.0f, f14)) - ((paint.getStrokeWidth() / 4.0f) * f15);
        float L3 = org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-7.25f, 0.0f, f14));
        canvas.drawLine(L3, -L, 0.0f, -L2, paint);
        canvas.drawLine(L3, L, 0.0f, L2, paint);
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
        this.a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}
