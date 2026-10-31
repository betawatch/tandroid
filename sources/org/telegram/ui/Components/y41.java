package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y41 extends qv0 {
    public final int a = org.telegram.messenger.d20.s0;
    public boolean b = false;
    public final float[] c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] e = {0.0f, 0.0f, 0.0f};
    public long f = 0;
    public boolean g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean i;
    public final Paint j;

    public y41(boolean z10) {
        if (z10) {
            this.j = new Paint(1);
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public final void b(int i10) {
        Paint paint = this.j;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public final void c(boolean z10) {
        this.b = z10;
    }

    @Override // org.telegram.ui.Components.qv0
    public final void d() {
        this.f = System.currentTimeMillis();
        this.g = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int L;
        int i10;
        int i11 = getBounds().left;
        if (this.b) {
            L = org.telegram.messenger.i0.L(8.5f);
            i10 = getBounds().top;
        } else {
            L = org.telegram.messenger.i0.L(9.3f);
            i10 = getBounds().top;
        }
        int i12 = L + i10;
        Paint paint = this.j;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.t6.c2;
            paint.setAlpha(org.telegram.messenger.zs.e4);
        }
        float L2 = org.telegram.messenger.i0.L(3.0f) + i11;
        float f7 = i12;
        float[] fArr = this.c;
        canvas.drawCircle(L2, f7, fArr[0] * org.telegram.messenger.i0.p, paint);
        canvas.drawCircle(org.telegram.messenger.i0.L(9.0f) + i11, f7, fArr[1] * org.telegram.messenger.i0.p, paint);
        canvas.drawCircle(org.telegram.messenger.i0.L(15.0f) + i11, f7, fArr[2] * org.telegram.messenger.i0.p, paint);
        f();
    }

    @Override // org.telegram.ui.Components.qv0
    public final void e() {
        for (int i10 = 0; i10 < 3; i10++) {
            this.e[i10] = 0.0f;
            this.c[i10] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.g = false;
    }

    public final void f() {
        if (this.g) {
            if (org.telegram.messenger.zs.f(this.a).g() && !this.i) {
                org.telegram.messenger.i0.h3(new uo0(this, 29), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f;
            this.f = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                float[] fArr = this.e;
                float f7 = fArr[i10] + j10;
                fArr[i10] = f7;
                float[] fArr2 = this.d;
                float f10 = f7 - fArr2[i10];
                float[] fArr3 = this.c;
                if (f10 > 0.0f) {
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f10 <= 320.0f) {
                        fArr3[i10] = decelerateInterpolator.getInterpolation(f10 / 320.0f) + 1.33f;
                    } else if (f10 <= 640.0f) {
                        fArr3[i10] = (1.0f - decelerateInterpolator.getInterpolation((f10 - 320.0f) / 320.0f)) + 1.33f;
                    } else if (f10 >= 800.0f) {
                        fArr[i10] = 0.0f;
                        fArr2[i10] = 0.0f;
                        fArr3[i10] = 1.33f;
                    } else {
                        fArr3[i10] = 1.33f;
                    }
                } else {
                    fArr3[i10] = 1.33f;
                }
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
        return org.telegram.messenger.i0.L(18.0f);
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
    public final void setAlpha(int i10) {
    }
}
