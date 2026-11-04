package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sa0 extends Drawable {
    public ra0 a;
    public final Paint b;
    public int c;
    public int d;
    public final long e;
    public int f;

    public sa0() {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = org.telegram.messenger.hs.e4;
        this.d = org.telegram.messenger.hs.e4;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.e = System.currentTimeMillis();
    }

    public final void a(int i3) {
        if (i3 != this.f) {
            int alpha = Color.alpha(i3);
            this.d = alpha;
            this.b.setColor(i0.a.o(i3, (int) ((alpha / 255.0f) * this.c)));
        }
        this.f = i3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float L = (min >> 1) - org.telegram.messenger.g0.L(0.5f);
        Paint paint = this.b;
        canvas.drawCircle(centerX, centerY, L, paint);
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        long j10 = this.e;
        canvas.rotate((((currentTimeMillis - j10) % 1500.0f) * 360.0f) / 1500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), bounds.centerX(), bounds.centerY() - org.telegram.messenger.g0.L(3.0f), paint);
        canvas.restore();
        canvas.save();
        canvas.rotate((((currentTimeMillis - j10) % 4500.0f) * 360.0f) / 4500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), org.telegram.messenger.g0.L(2.3f) + bounds.centerX(), bounds.centerY(), paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a == null) {
            this.a = new ra0();
        }
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(12.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        if (this.c != i3) {
            this.c = i3;
            this.b.setAlpha((int) ((this.d / 255.0f) * i3));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
