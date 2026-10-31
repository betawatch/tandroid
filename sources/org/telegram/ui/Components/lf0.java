package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lf0 extends qv0 {
    public boolean a = false;
    public final Paint b = new Paint(1);
    public final int c = org.telegram.messenger.d20.s0;
    public long d = 0;
    public boolean e = false;
    public final RectF f = new RectF();
    public float g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.p6 i;

    public lf0(org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        this.h = z10;
        this.i = p6Var;
    }

    @Override // org.telegram.ui.Components.qv0
    public final void c(boolean z10) {
        this.a = z10;
    }

    @Override // org.telegram.ui.Components.qv0
    public final void d() {
        this.d = System.currentTimeMillis();
        this.e = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(10.0f);
        int L2 = ((org.telegram.messenger.i0.L(18.0f) - L) / 2) + getBounds().top;
        if (!this.a) {
            L2 += org.telegram.messenger.i0.L(1.0f);
        }
        int i10 = L2;
        boolean z10 = this.h;
        int w02 = org.telegram.ui.ActionBar.t6.w0(z10 ? org.telegram.ui.ActionBar.t6.p9 : org.telegram.ui.ActionBar.t6.pa, this.i);
        Paint paint = this.b;
        paint.setColor(w02);
        RectF rectF = this.f;
        rectF.set(0.0f, i10, L, i10 + L);
        float f7 = this.g;
        float f10 = 0.5f;
        int x10 = (int) (f7 < 0.5f ? org.telegram.messenger.z20.x(f7, 0.5f, 1.0f, 35.0f) : ((f7 - 0.5f) * 35.0f) / 0.5f);
        int i11 = 0;
        while (i11 < 3) {
            float L3 = org.telegram.messenger.i0.L(9.2f) + (org.telegram.messenger.i0.L(5.0f) * i11);
            float L4 = org.telegram.messenger.i0.L(5.0f);
            float f11 = f10;
            float f12 = this.g;
            float f13 = L3 - (L4 * f12);
            if (i11 == 2) {
                paint.setAlpha(Math.min(org.telegram.messenger.zs.e4, (int) ((f12 * 255.0f) / f11)));
            } else if (i11 != 0) {
                paint.setAlpha(org.telegram.messenger.zs.e4);
            } else if (f12 > f11) {
                paint.setAlpha((int) ((1.0f - ((f12 - f11) / f11)) * 255.0f));
            } else {
                paint.setAlpha(org.telegram.messenger.zs.e4);
            }
            canvas.drawCircle(f13, (L / 2) + i10, org.telegram.messenger.i0.L(1.2f), paint);
            i11++;
            f10 = f11;
        }
        paint.setAlpha(org.telegram.messenger.zs.e4);
        canvas.drawArc(rectF, x10, 360 - (x10 * 2), true, paint);
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, z10 ? org.telegram.ui.ActionBar.t6.d6 : org.telegram.ui.ActionBar.t6.s8, false));
        canvas.drawCircle(org.telegram.messenger.i0.L(4.0f), ((L / 2) + i10) - org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(1.0f), paint);
        f();
    }

    @Override // org.telegram.ui.Components.qv0
    public final void e() {
        this.g = 0.0f;
        this.e = false;
    }

    public final void f() {
        if (this.e) {
            if (org.telegram.messenger.zs.f(this.c).g()) {
                org.telegram.messenger.i0.h3(new eb0(this, 13), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.d;
            this.d = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            if (this.g >= 1.0f) {
                this.g = 0.0f;
            }
            float f7 = (j10 / 300.0f) + this.g;
            this.g = f7;
            if (f7 > 1.0f) {
                this.g = 1.0f;
            }
            a();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(20.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // org.telegram.ui.Components.qv0
    public final void b(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
