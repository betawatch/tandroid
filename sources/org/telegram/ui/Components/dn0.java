package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class dn0 extends ou0 {
    public boolean a = false;
    public long b = 0;
    public boolean c = false;
    public float d;
    public final Paint e;

    public dn0(boolean z9) {
        if (z9) {
            Paint paint = new Paint(1);
            this.e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    @Override // org.telegram.ui.Components.ou0
    public final void b(int i7) {
        Paint paint = this.e;
        if (paint != null) {
            paint.setColor(i7);
        }
    }

    @Override // org.telegram.ui.Components.ou0
    public final void c(boolean z9) {
        this.a = z9;
    }

    @Override // org.telegram.ui.Components.ou0
    public final void d() {
        this.b = System.currentTimeMillis();
        this.c = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.e;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.d2;
        }
        Paint paint2 = paint;
        int i7 = 0;
        while (i7 < 3) {
            if (i7 == 0) {
                paint2.setAlpha((int) (this.d * 255.0f));
            } else if (i7 == 2) {
                paint2.setAlpha((int) ((1.0f - this.d) * 255.0f));
            } else {
                paint2.setAlpha(org.telegram.messenger.qs.e4);
            }
            float L = (org.telegram.messenger.g0.L(5.0f) * i7) + (org.telegram.messenger.g0.L(5.0f) * this.d);
            float f10 = 8.0f;
            Canvas canvas2 = canvas;
            canvas2.drawLine(L, org.telegram.messenger.g0.L(this.a ? 3.0f : 4.0f), L + org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(this.a ? 7.0f : 8.0f), paint2);
            float L2 = org.telegram.messenger.g0.L(this.a ? 11.0f : 12.0f);
            float L3 = L + org.telegram.messenger.g0.L(4.0f);
            if (this.a) {
                f10 = 7.0f;
            }
            canvas2.drawLine(L, L2, L3, org.telegram.messenger.g0.L(f10), paint2);
            i7++;
            canvas = canvas2;
        }
        if (!this.c) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.b;
        this.b = currentTimeMillis;
        if (j3 > 50) {
            j3 = 50;
        }
        this.d = (j3 / 500.0f) + this.d;
        while (true) {
            float f11 = this.d;
            if (f11 <= 1.0f) {
                a();
                return;
            }
            this.d = f11 - 1.0f;
        }
    }

    @Override // org.telegram.ui.Components.ou0
    public final void e() {
        this.c = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(14.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
