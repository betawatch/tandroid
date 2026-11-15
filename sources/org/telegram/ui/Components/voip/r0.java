package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r0 extends Drawable {
    public static final float[][] h = {new float[]{7.0f, 9.5f, 10.25f}, new float[]{12.0f, 17.0f, 10.25f}, new float[]{7.0f, 13.0f, 13.75f}, new float[]{15.5f, 17.0f, 13.75f}};
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public float d;
    public boolean e;
    public ValueAnimator f;
    public int g;

    public r0(boolean z10) {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.c = new RectF();
        this.g = ns.e4;
        this.e = z10;
        this.d = z10 ? 1.0f : 0.0f;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2 A[SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        Rect bounds = getBounds();
        float min = Math.min(bounds.width(), bounds.height()) / 24.0f;
        float L = org.telegram.messenger.g0.L(1.33f);
        Paint paint = this.a;
        paint.setStrokeWidth(L);
        paint.setAlpha(this.g);
        Paint paint2 = this.b;
        paint2.setStrokeWidth(1.5f * L);
        Canvas canvas3 = canvas;
        int saveLayerAlpha = canvas3.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, ns.e4);
        float f11 = 12.0f * min;
        canvas3.translate(bounds.centerX() - f11, bounds.centerY() - f11);
        float f12 = this.e ? this.d : 1.0f - this.d;
        float sin = 1.0f - ((((float) Math.sin(f12 * 3.141592653589793d)) * 0.1f) * ((f12 >= 1.0f || f12 <= 0.0f) ? 0.0f : 1.0f));
        canvas3.save();
        canvas3.scale(sin, sin, f11, f11);
        float f13 = 3.5f * min;
        RectF rectF = this.c;
        rectF.set(f13, 5.5f * min, 20.5f * min, 18.5f * min);
        canvas3.drawRoundRect(rectF, f13, f13, paint);
        int i7 = 0;
        while (i7 < 4) {
            float[] fArr = h[i7];
            if (this.e) {
                float f14 = this.d;
                if (f14 < 1.0f) {
                    f10 = Math.max(0.0f, Math.min(1.0f, (f14 - (i7 * 0.12f)) / 0.5f));
                    if (f10 <= 0.0f) {
                        float f15 = fArr[0];
                        float z10 = com.google.android.gms.internal.vision.e2.z(fArr[1], f15, f10, f15);
                        float f16 = fArr[2];
                        canvas3.drawLine(f15 * min, f16 * min, z10 * min, f16 * min, paint);
                    }
                    i7++;
                    canvas3 = canvas;
                }
            }
            f10 = 1.0f;
            if (f10 <= 0.0f) {
            }
            i7++;
            canvas3 = canvas;
        }
        canvas.restore();
        float f17 = 1.0f - this.d;
        if (f17 > 0.0f) {
            float f18 = min * 3.75f;
            float x10 = com.google.android.gms.internal.vision.e2.x(min, 16.5f, f17, f18);
            float f19 = L * 0.8f;
            canvas2 = canvas;
            canvas2.drawLine(f18 + f19, f18 - f19, x10 + f19, x10 - f19, paint2);
            canvas2.drawLine(f18, f18, x10, x10, paint);
        } else {
            canvas2 = canvas;
        }
        canvas2.restoreToCount(saveLayerAlpha);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.g = i7;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
