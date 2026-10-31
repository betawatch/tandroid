package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hl0 extends qv0 {
    public float d;
    public final Paint f;
    public boolean a = false;
    public long b = 0;
    public boolean c = false;
    public int e = 1;

    public hl0(boolean z10) {
        if (z10) {
            this.f = new Paint(1);
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public final void b(int i10) {
        Paint paint = this.f;
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
        Paint paint = this.f;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.t6.c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        canvas.drawCircle(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(this.a ? 8.0f : 9.0f), org.telegram.messenger.i0.L(4.0f), paint);
        if (this.c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.b;
            this.b = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            float f7 = this.d;
            int i10 = this.e;
            float f10 = ((i10 * j10) / 400.0f) + f7;
            this.d = f10;
            if (i10 > 0 && f10 >= 1.0f) {
                this.e = -1;
                this.d = 1.0f;
            } else if (i10 < 0 && f10 <= 0.0f) {
                this.e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public final void e() {
        this.c = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(10.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(12.0f);
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
