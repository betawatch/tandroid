package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class dk0 extends ou0 {
    public float d;
    public final Paint f;
    public boolean a = false;
    public long b = 0;
    public boolean c = false;
    public int e = 1;

    public dk0(boolean z9) {
        if (z9) {
            this.f = new Paint(1);
        }
    }

    @Override // org.telegram.ui.Components.ou0
    public final void b(int i7) {
        Paint paint = this.f;
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
        Paint paint = this.f;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.c2;
        }
        paint.setAlpha(((int) (this.d * 200.0f)) + 55);
        canvas.drawCircle(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(this.a ? 8.0f : 9.0f), org.telegram.messenger.g0.L(4.0f), paint);
        if (this.c) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.b;
            this.b = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            float f10 = this.d;
            int i7 = this.e;
            float f11 = ((i7 * j3) / 400.0f) + f10;
            this.d = f11;
            if (i7 > 0 && f11 >= 1.0f) {
                this.e = -1;
                this.d = 1.0f;
            } else if (i7 < 0 && f11 <= 0.0f) {
                this.e = 1;
                this.d = 0.0f;
            }
            a();
        }
    }

    @Override // org.telegram.ui.Components.ou0
    public final void e() {
        this.c = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(10.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(12.0f);
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
