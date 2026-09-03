package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mr extends Drawable {
    public final Drawable a;
    public final RectF b = new RectF();
    public final Paint c;
    public final Paint d;
    public int e;
    public final int f;
    public float g;
    public boolean h;
    public float i;
    public float j;
    public float k;

    public mr(Context context, int i10, int i11) {
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.a = context.getDrawable(i10);
        this.f = i11;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.5f));
    }

    public final void a(boolean z4, boolean z10) {
        if (this.h != z4) {
            this.h = z4;
            if (z10) {
                this.g = z4 ? 0.0f : 1.0f;
            } else {
                this.g = z4 ? 1.0f : 0.0f;
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int w02;
        int i10;
        boolean z4 = this.h;
        if (z4) {
            float f10 = this.g;
            if (f10 != 1.0f) {
                this.g = f10 + 0.10666667f;
                invalidateSelf();
                if (this.g > 1.0f) {
                    this.g = 1.0f;
                }
                int i11 = this.f;
                w02 = i11 >= 0 ? -1 : org.telegram.ui.ActionBar.k6.w0(null, i11, false);
                i10 = this.e;
                Drawable drawable = this.a;
                Paint paint = this.c;
                if (i10 != w02) {
                    this.e = w02;
                    paint.setColor(w02);
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
                }
                if (this.g != 0.0f) {
                    drawable.draw(canvas);
                    return;
                }
                Rect bounds = drawable.getBounds();
                RectF rectF = this.b;
                rectF.set(bounds);
                canvas.saveLayerAlpha(rectF, 255, 31);
                drawable.draw(canvas);
                float dpf2 = AndroidUtilities.dpf2(4.5f) + rectF.left + this.i + this.j;
                float dpf22 = ((AndroidUtilities.dpf2(4.5f) + rectF.top) - AndroidUtilities.dp(1.0f)) + this.j;
                float dp = ((rectF.right - AndroidUtilities.dp(3.0f)) + this.i) - this.k;
                float dp2 = ((rectF.bottom - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(3.0f)) - this.k;
                if (this.h) {
                    float f11 = this.g;
                    dp = ((dp - dpf2) * f11) + dpf2;
                    dp2 = e2.c.w(dp2, dpf22, f11, dpf22);
                } else {
                    float f12 = this.g;
                    dpf2 = e2.c.w(1.0f, f12, dp - dpf2, dpf2);
                    dpf22 = e2.c.w(1.0f, f12, dp2 - dpf22, dpf22);
                }
                float f13 = dp2;
                float f14 = dpf22;
                float f15 = dp;
                float f16 = dpf2;
                float strokeWidth = f14 - paint.getStrokeWidth();
                float strokeWidth2 = f13 - paint.getStrokeWidth();
                Paint paint2 = this.d;
                canvas.drawLine(f16, strokeWidth, f15, strokeWidth2, paint2);
                float strokeWidth3 = ((paint2.getStrokeWidth() - paint.getStrokeWidth()) / 2.0f) + 1.0f;
                canvas.drawLine(f16, f14 - strokeWidth3, f15, f13 - strokeWidth3, paint2);
                canvas.drawLine(f16, f14, f15, f13, paint);
                canvas.restore();
                return;
            }
        }
        if (!z4) {
            float f17 = this.g;
            if (f17 != 0.0f) {
                this.g = f17 - 0.10666667f;
                invalidateSelf();
                if (this.g < 0.0f) {
                    this.g = 0.0f;
                }
            }
        }
        int i112 = this.f;
        if (i112 >= 0) {
        }
        i10 = this.e;
        Drawable drawable2 = this.a;
        Paint paint3 = this.c;
        if (i10 != w02) {
        }
        if (this.g != 0.0f) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.a.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
