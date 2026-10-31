package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class eo0 extends qv0 {
    public boolean a = false;
    public long b = 0;
    public boolean c = false;
    public float d;
    public final Paint e;

    public eo0(boolean z10) {
        if (z10) {
            Paint paint = new Paint(1);
            this.e = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public final void b(int i10) {
        Paint paint = this.e;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public final void c(boolean z10) {
        this.a = z10;
    }

    @Override // org.telegram.ui.Components.qv0
    public final void d() {
        this.b = System.currentTimeMillis();
        this.c = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.e;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.t6.d2;
        }
        Paint paint2 = paint;
        int i10 = 0;
        while (i10 < 3) {
            if (i10 == 0) {
                paint2.setAlpha((int) (this.d * 255.0f));
            } else if (i10 == 2) {
                paint2.setAlpha((int) ((1.0f - this.d) * 255.0f));
            } else {
                paint2.setAlpha(org.telegram.messenger.zs.e4);
            }
            float L = (org.telegram.messenger.i0.L(5.0f) * i10) + (org.telegram.messenger.i0.L(5.0f) * this.d);
            float f7 = 8.0f;
            Canvas canvas2 = canvas;
            canvas2.drawLine(L, org.telegram.messenger.i0.L(this.a ? 3.0f : 4.0f), L + org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(this.a ? 7.0f : 8.0f), paint2);
            float L2 = org.telegram.messenger.i0.L(this.a ? 11.0f : 12.0f);
            float L3 = L + org.telegram.messenger.i0.L(4.0f);
            if (this.a) {
                f7 = 7.0f;
            }
            canvas2.drawLine(L, L2, L3, org.telegram.messenger.i0.L(f7), paint2);
            i10++;
            canvas = canvas2;
        }
        if (!this.c) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.b;
        this.b = currentTimeMillis;
        if (j10 > 50) {
            j10 = 50;
        }
        this.d = (j10 / 500.0f) + this.d;
        while (true) {
            float f10 = this.d;
            if (f10 <= 1.0f) {
                a();
                return;
            }
            this.d = f10 - 1.0f;
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public final void e() {
        this.c = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(14.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(18.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
