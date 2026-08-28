package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class jp extends Drawable {
    public static final u1.a h = new u1.a();
    public float a;
    public final float b;
    public long c;
    public final float[] d;
    public final Paint e;
    public float f;
    public final RectF g;

    public jp(int i9) {
        this.a = AndroidUtilities.dp(18.0f);
        this.b = AndroidUtilities.dp(2.25f);
        this.c = -1L;
        this.d = new float[2];
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.g = new RectF();
        b(i9);
    }

    public static void a(float[] fArr, float f10) {
        float f11 = (1520.0f * f10) / 5400.0f;
        fArr[0] = Math.max(0.0f, f11 - 20.0f);
        fArr[1] = f11;
        for (int i9 = 0; i9 < 4; i9++) {
            u1.a aVar = h;
            fArr[1] = (aVar.getInterpolation((f10 - (i9 * 1350)) / 667.0f) * 250.0f) + fArr[1];
            fArr[0] = (aVar.getInterpolation((f10 - (r4 + 667)) / 667.0f) * 250.0f) + fArr[0];
        }
    }

    public final void b(int i9) {
        this.e.setColor(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.c < 0) {
            this.c = SystemClock.elapsedRealtime();
        }
        float elapsedRealtime = (SystemClock.elapsedRealtime() - this.c) % 5400;
        float[] fArr = this.d;
        a(fArr, elapsedRealtime);
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
    public final void setAlpha(int i9) {
        this.e.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i9, int i10, int i11, int i12) {
        float f10 = i9;
        float f11 = i11 - i9;
        float f12 = this.b;
        float f13 = this.a;
        float f14 = i10;
        float f15 = i12 - i10;
        this.g.set(e2.c.A(f11 - (f12 / 2.0f), f13, 2.0f, f10), (((f15 - (f12 / 2.0f)) - f13) / 2.0f) + f14, ((((f12 / 2.0f) + f11) + f13) / 2.0f) + f10, ((((f12 / 2.0f) + f15) + f13) / 2.0f) + f14);
        super.setBounds(i9, i10, i11, i12);
        this.e.setStrokeWidth(f12);
    }

    public jp(float f10, float f11, int i9) {
        this.a = AndroidUtilities.dp(18.0f);
        this.b = AndroidUtilities.dp(2.25f);
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
        b(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
