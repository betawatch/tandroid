package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class qb0 extends Drawable {
    public pb0 a;
    public final Paint b;
    public int c;
    public int d;
    public final long e;
    public int f;

    public qb0() {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = 255;
        this.d = 255;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.e = System.currentTimeMillis();
    }

    public final void a(int i9) {
        if (i9 != this.f) {
            int alpha = Color.alpha(i9);
            this.d = alpha;
            this.b.setColor(i0.a.k(i9, (int) ((alpha / 255.0f) * this.c)));
        }
        this.f = i9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int min = Math.min(bounds.width(), bounds.height());
        float centerX = bounds.centerX();
        float centerY = bounds.centerY();
        float dp = (min >> 1) - AndroidUtilities.dp(0.5f);
        Paint paint = this.b;
        canvas.drawCircle(centerX, centerY, dp, paint);
        long currentTimeMillis = System.currentTimeMillis();
        canvas.save();
        long j10 = this.e;
        canvas.rotate((((currentTimeMillis - j10) % 1500.0f) * 360.0f) / 1500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), bounds.centerX(), bounds.centerY() - AndroidUtilities.dp(3.0f), paint);
        canvas.restore();
        canvas.save();
        canvas.rotate((((currentTimeMillis - j10) % 4500.0f) * 360.0f) / 4500.0f, bounds.centerX(), bounds.centerY());
        canvas.drawLine(bounds.centerX(), bounds.centerY(), AndroidUtilities.dp(2.3f) + bounds.centerX(), bounds.centerY(), paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.a == null) {
            this.a = new pb0();
        }
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        if (this.c != i9) {
            this.c = i9;
            this.b.setAlpha((int) ((this.d / 255.0f) * i9));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
