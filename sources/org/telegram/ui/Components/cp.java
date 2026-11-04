package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class cp extends Drawable {
    public static final w1.a h = new w1.a();
    public float a;
    public final float b;
    public long c;
    public final float[] d;
    public final Paint e;
    public float f;
    public final RectF g;

    public cp(int i3) {
        this.a = org.telegram.messenger.g0.L(18.0f);
        this.b = org.telegram.messenger.g0.L(2.25f);
        this.c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.g = new RectF();
        b(i3);
    }

    public static void a(float f10, float[] fArr) {
        float f11 = (1520.0f * f10) / 5400.0f;
        fArr[0] = Math.max(0.0f, f11 - 20.0f);
        fArr[1] = f11;
        for (int i3 = 0; i3 < 4; i3++) {
            w1.a aVar = h;
            fArr[1] = (aVar.getInterpolation((f10 - (i3 * 1350)) / 667.0f) * 250.0f) + fArr[1];
            fArr[0] = (aVar.getInterpolation((f10 - (r4 + 667)) / 667.0f) * 250.0f) + fArr[0];
        }
    }

    public final void b(int i3) {
        this.e.setColor(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.c < 0) {
            this.c = SystemClock.elapsedRealtime();
        }
        float elapsedRealtime = (SystemClock.elapsedRealtime() - this.c) % 5400;
        float[] fArr = this.d;
        a(elapsedRealtime, fArr);
        float f10 = this.f;
        float f11 = fArr[0];
        canvas.drawArc(this.g, f10 + f11, fArr[1] - f11, false, this.e);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) (this.a + this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (this.a + this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.e.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i3, int i10, int i11, int i12) {
        float f10 = i3;
        float f11 = i11 - i3;
        float f12 = this.b;
        float f13 = this.a;
        float f14 = i10;
        float f15 = i12 - i10;
        this.g.set(com.google.android.recaptcha.internal.a.z(f11 - (f12 / 2.0f), f13, 2.0f, f10), (((f15 - (f12 / 2.0f)) - f13) / 2.0f) + f14, ((((f12 / 2.0f) + f11) + f13) / 2.0f) + f10, ((((f12 / 2.0f) + f15) + f13) / 2.0f) + f14);
        super.setBounds(i3, i10, i11, i12);
        this.e.setStrokeWidth(f12);
    }

    public cp(float f10, float f11, int i3) {
        this.a = org.telegram.messenger.g0.L(18.0f);
        this.b = org.telegram.messenger.g0.L(2.25f);
        this.c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.g = new RectF();
        this.a = f10;
        this.b = f11;
        b(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
