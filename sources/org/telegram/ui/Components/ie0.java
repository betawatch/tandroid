package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ie0 extends ou0 {
    public boolean a = false;
    public final Paint b = new Paint(1);
    public final int c = org.telegram.messenger.p10.s0;
    public long d = 0;
    public boolean e = false;
    public final RectF f = new RectF();
    public float g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.f6 i;

    public ie0(org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        this.h = z9;
        this.i = f6Var;
    }

    @Override // org.telegram.ui.Components.ou0
    public final void c(boolean z9) {
        this.a = z9;
    }

    @Override // org.telegram.ui.Components.ou0
    public final void d() {
        this.d = System.currentTimeMillis();
        this.e = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(10.0f);
        int L2 = ((org.telegram.messenger.g0.L(18.0f) - L) / 2) + getBounds().top;
        if (!this.a) {
            L2 += org.telegram.messenger.g0.L(1.0f);
        }
        int i7 = L2;
        boolean z9 = this.h;
        int w02 = org.telegram.ui.ActionBar.k6.w0(z9 ? org.telegram.ui.ActionBar.k6.p9 : org.telegram.ui.ActionBar.k6.pa, this.i);
        Paint paint = this.b;
        paint.setColor(w02);
        RectF rectF = this.f;
        rectF.set(0.0f, i7, L, i7 + L);
        float f10 = this.g;
        float f11 = 0.5f;
        int x10 = (int) (f10 < 0.5f ? org.telegram.messenger.camera.q.x(f10, 0.5f, 1.0f, 35.0f) : ((f10 - 0.5f) * 35.0f) / 0.5f);
        int i10 = 0;
        while (i10 < 3) {
            float L3 = org.telegram.messenger.g0.L(9.2f) + (org.telegram.messenger.g0.L(5.0f) * i10);
            float L4 = org.telegram.messenger.g0.L(5.0f);
            float f12 = f11;
            float f13 = this.g;
            float f14 = L3 - (L4 * f13);
            if (i10 == 2) {
                paint.setAlpha(Math.min(org.telegram.messenger.qs.e4, (int) ((f13 * 255.0f) / f12)));
            } else if (i10 != 0) {
                paint.setAlpha(org.telegram.messenger.qs.e4);
            } else if (f13 > f12) {
                paint.setAlpha((int) ((1.0f - ((f13 - f12) / f12)) * 255.0f));
            } else {
                paint.setAlpha(org.telegram.messenger.qs.e4);
            }
            canvas.drawCircle(f14, (L / 2) + i7, org.telegram.messenger.g0.L(1.2f), paint);
            i10++;
            f11 = f12;
        }
        paint.setAlpha(org.telegram.messenger.qs.e4);
        canvas.drawArc(rectF, x10, 360 - (x10 * 2), true, paint);
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, z9 ? org.telegram.ui.ActionBar.k6.d6 : org.telegram.ui.ActionBar.k6.s8, false));
        canvas.drawCircle(org.telegram.messenger.g0.L(4.0f), ((L / 2) + i7) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f), paint);
        f();
    }

    @Override // org.telegram.ui.Components.ou0
    public final void e() {
        this.g = 0.0f;
        this.e = false;
    }

    public final void f() {
        if (this.e) {
            if (org.telegram.messenger.qs.f(this.c).g()) {
                org.telegram.messenger.g0.i3(new ob0(this, 8), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            if (this.g >= 1.0f) {
                this.g = 0.0f;
            }
            float f10 = (j3 / 300.0f) + this.g;
            this.g = f10;
            if (f10 > 1.0f) {
                this.g = 1.0f;
            }
            a();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(20.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // org.telegram.ui.Components.ou0
    public final void b(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
