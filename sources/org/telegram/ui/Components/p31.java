package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p31 extends nu0 {
    public final int a = org.telegram.messenger.h10.t0;
    public boolean b = false;
    public final float[] c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] e = {0.0f, 0.0f, 0.0f};
    public long f = 0;
    public boolean g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean i;
    public final Paint j;

    public p31(boolean z10) {
        if (z10) {
            this.j = new Paint(1);
        }
    }

    @Override // org.telegram.ui.Components.nu0
    public final void b(int i3) {
        Paint paint = this.j;
        if (paint != null) {
            paint.setColor(i3);
        }
    }

    @Override // org.telegram.ui.Components.nu0
    public final void c(boolean z10) {
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.nu0
    public final void d() {
        this.f = System.currentTimeMillis();
        this.g = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int L;
        int i3;
        int i10 = getBounds().left;
        if (this.b) {
            L = org.telegram.messenger.g0.L(8.5f);
            i3 = getBounds().top;
        } else {
            L = org.telegram.messenger.g0.L(9.3f);
            i3 = getBounds().top;
        }
        int i11 = L + i3;
        Paint paint = this.j;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.c2;
            paint.setAlpha(org.telegram.messenger.hs.e4);
        }
        float L2 = org.telegram.messenger.g0.L(3.0f) + i10;
        float f10 = i11;
        float[] fArr = this.c;
        canvas.drawCircle(L2, f10, fArr[0] * org.telegram.messenger.g0.p, paint);
        canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + i10, f10, fArr[1] * org.telegram.messenger.g0.p, paint);
        canvas.drawCircle(org.telegram.messenger.g0.L(15.0f) + i10, f10, fArr[2] * org.telegram.messenger.g0.p, paint);
        f();
    }

    @Override // org.telegram.ui.Components.nu0
    public final void e() {
        for (int i3 = 0; i3 < 3; i3++) {
            this.e[i3] = 0.0f;
            this.c[i3] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.g = false;
    }

    public final void f() {
        if (this.g) {
            if (org.telegram.messenger.hs.f(this.a).g() && !this.i) {
                org.telegram.messenger.g0.i3(new sp0(this, 26), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f;
            this.f = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            for (int i3 = 0; i3 < 3; i3++) {
                float[] fArr = this.e;
                float f10 = fArr[i3] + j10;
                fArr[i3] = f10;
                float[] fArr2 = this.d;
                float f11 = f10 - fArr2[i3];
                float[] fArr3 = this.c;
                if (f11 > 0.0f) {
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f11 <= 320.0f) {
                        fArr3[i3] = decelerateInterpolator.getInterpolation(f11 / 320.0f) + 1.33f;
                    } else if (f11 <= 640.0f) {
                        fArr3[i3] = (1.0f - decelerateInterpolator.getInterpolation((f11 - 320.0f) / 320.0f)) + 1.33f;
                    } else if (f11 >= 800.0f) {
                        fArr[i3] = 0.0f;
                        fArr2[i3] = 0.0f;
                        fArr3[i3] = 1.33f;
                    } else {
                        fArr3[i3] = 1.33f;
                    }
                } else {
                    fArr3[i3] = 1.33f;
                }
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
        return org.telegram.messenger.g0.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
    }
}
