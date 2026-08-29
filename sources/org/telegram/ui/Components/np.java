package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class np extends Drawable {
    public static final u1.a h = new u1.a();
    public float a;
    public final float b;
    public long c;
    public final float[] d;
    public final Paint e;
    public float f;
    public final RectF g;

    public np(int i10) {
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
        b(i10);
    }

    public static void a(float[] fArr, float f9) {
        float f10 = (1520.0f * f9) / 5400.0f;
        fArr[0] = Math.max(0.0f, f10 - 20.0f);
        fArr[1] = f10;
        for (int i10 = 0; i10 < 4; i10++) {
            u1.a aVar = h;
            fArr[1] = (aVar.getInterpolation((f9 - (i10 * 1350)) / 667.0f) * 250.0f) + fArr[1];
            fArr[0] = (aVar.getInterpolation((f9 - (r4 + 667)) / 667.0f) * 250.0f) + fArr[0];
        }
    }

    public final void b(int i10) {
        this.e.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.c < 0) {
            this.c = SystemClock.elapsedRealtime();
        }
        float elapsedRealtime = (SystemClock.elapsedRealtime() - this.c) % 5400;
        float[] fArr = this.d;
        a(fArr, elapsedRealtime);
        float f9 = this.f;
        float f10 = fArr[0];
        canvas.drawArc(this.g, f9 + f10, fArr[1] - f10, false, this.e);
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
    public final void setAlpha(int i10) {
        this.e.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        float f9 = i10;
        float f10 = i12 - i10;
        float f11 = this.b;
        float f12 = this.a;
        float f13 = i11;
        float f14 = i13 - i11;
        this.g.set(com.google.android.recaptcha.internal.a.A(f10 - (f11 / 2.0f), f12, 2.0f, f9), (((f14 - (f11 / 2.0f)) - f12) / 2.0f) + f13, ((((f11 / 2.0f) + f10) + f12) / 2.0f) + f9, ((((f11 / 2.0f) + f14) + f12) / 2.0f) + f13);
        super.setBounds(i10, i11, i12, i13);
        this.e.setStrokeWidth(f11);
    }

    public np(float f9, float f10, int i10) {
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
        this.a = f9;
        this.b = f10;
        b(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
