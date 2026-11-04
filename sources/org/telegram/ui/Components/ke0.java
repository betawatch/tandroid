package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ke0 extends nu0 {
    public boolean a = false;
    public final Paint b = new Paint(1);
    public final int c = org.telegram.messenger.h10.t0;
    public long d = 0;
    public boolean e = false;
    public final RectF f = new RectF();
    public float g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.e6 i;

    public ke0(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.h = z10;
        this.i = e6Var;
    }

    @Override // org.telegram.ui.Components.nu0
    public final void c(boolean z10) {
        this.a = z10;
    }

    @Override // org.telegram.ui.Components.nu0
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
        int i3 = L2;
        boolean z10 = this.h;
        int w02 = org.telegram.ui.ActionBar.k6.w0(z10 ? org.telegram.ui.ActionBar.k6.p9 : org.telegram.ui.ActionBar.k6.pa, this.i);
        Paint paint = this.b;
        paint.setColor(w02);
        RectF rectF = this.f;
        rectF.set(0.0f, i3, L, i3 + L);
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
                paint.setAlpha(Math.min(org.telegram.messenger.hs.e4, (int) ((f13 * 255.0f) / f12)));
            } else if (i10 != 0) {
                paint.setAlpha(org.telegram.messenger.hs.e4);
            } else if (f13 > f12) {
                paint.setAlpha((int) ((1.0f - ((f13 - f12) / f12)) * 255.0f));
            } else {
                paint.setAlpha(org.telegram.messenger.hs.e4);
            }
            canvas.drawCircle(f14, (L / 2) + i3, org.telegram.messenger.g0.L(1.2f), paint);
            i10++;
            f11 = f12;
        }
        paint.setAlpha(org.telegram.messenger.hs.e4);
        canvas.drawArc(rectF, x10, 360 - (x10 * 2), true, paint);
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, z10 ? org.telegram.ui.ActionBar.k6.d6 : org.telegram.ui.ActionBar.k6.s8, false));
        canvas.drawCircle(org.telegram.messenger.g0.L(4.0f), ((L / 2) + i3) - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f), paint);
        f();
    }

    @Override // org.telegram.ui.Components.nu0
    public final void e() {
        this.g = 0.0f;
        this.e = false;
    }

    public final void f() {
        if (this.e) {
            if (org.telegram.messenger.hs.f(this.c).g()) {
                org.telegram.messenger.g0.i3(new jb0(this, 10), 100L);
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
            float f10 = (j10 / 300.0f) + this.g;
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

    @Override // org.telegram.ui.Components.nu0
    public final void b(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
