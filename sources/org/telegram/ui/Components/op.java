package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class op extends Drawable {
    public final Paint a;
    public long b;
    public final RectF c;
    public float d;
    public boolean e;
    public int f;
    public int g;

    public op() {
        this(2.0f);
    }

    public abstract int a();

    /* JADX WARN: Removed duplicated region for block: B:32:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        float y10;
        Paint paint;
        float f14;
        long currentTimeMillis = System.currentTimeMillis();
        int a10 = a();
        Paint paint2 = this.a;
        if (a10 != 0) {
            this.g = Color.alpha(a10);
            paint2.setColor(i0.a.o(a10, org.telegram.messenger.qs.e4));
        }
        long j3 = this.b;
        if (j3 != 0) {
            long j10 = currentTimeMillis - j3;
            boolean z9 = this.e;
            if (z9 || this.d != 0.0f) {
                float f15 = ((j10 * 360) / 500.0f) + this.d;
                this.d = f15;
                if (z9 || f15 < 720.0f) {
                    this.d = f15 - (((int) (f15 / 720.0f)) * 720);
                } else {
                    this.d = 0.0f;
                }
                invalidateSelf();
            }
        }
        if (this.g == 255 || getBounds() == null || getBounds().isEmpty()) {
            canvas2 = canvas;
            canvas2.save();
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, this.g, 31);
        }
        canvas2.translate(org.telegram.messenger.g0.L(24.0f) / 2, org.telegram.messenger.g0.L(24.0f) / 2);
        canvas2.rotate(-45.0f);
        float f16 = this.d;
        if (f16 < 0.0f || f16 >= 90.0f) {
            if (f16 >= 90.0f && f16 < 180.0f) {
                f13 = org.telegram.messenger.k5.y(f16, 90.0f, 90.0f, 1.0f);
                f11 = 0.0f;
                f10 = 0.0f;
                f12 = 1.0f;
            } else if (f16 < 180.0f || f16 >= 270.0f) {
                if (f16 >= 270.0f && f16 < 360.0f) {
                    y10 = (f16 - 270.0f) / 90.0f;
                } else if (f16 >= 360.0f && f16 < 450.0f) {
                    y10 = org.telegram.messenger.k5.y(f16, 360.0f, 90.0f, 1.0f);
                } else if (f16 >= 450.0f && f16 < 540.0f) {
                    f11 = (f16 - 450.0f) / 90.0f;
                    f13 = 0.0f;
                    f12 = 0.0f;
                    f10 = 0.0f;
                } else if (f16 >= 540.0f && f16 < 630.0f) {
                    f13 = (f16 - 540.0f) / 90.0f;
                    f12 = 0.0f;
                    f10 = 0.0f;
                    f11 = 1.0f;
                } else if (f16 < 630.0f || f16 >= 720.0f) {
                    f10 = 0.0f;
                    f11 = 1.0f;
                    f13 = f11;
                } else {
                    f12 = (f16 - 630.0f) / 90.0f;
                    f10 = 0.0f;
                    f11 = 1.0f;
                    f13 = 1.0f;
                }
                f10 = y10;
                f11 = 0.0f;
                f13 = f11;
            } else {
                f12 = org.telegram.messenger.k5.y(f16, 180.0f, 90.0f, 1.0f);
                f11 = 0.0f;
                f13 = 0.0f;
                f10 = 0.0f;
            }
            if (f11 == 0.0f) {
                paint = paint2;
                canvas2.drawLine(0.0f, 0.0f, 0.0f, this.f * f11, paint);
            } else {
                paint = paint2;
            }
            if (f13 != 0.0f) {
                canvas.drawLine((-this.f) * f13, 0.0f, 0.0f, 0.0f, paint);
            }
            if (f12 != 0.0f) {
                canvas.drawLine(0.0f, (-this.f) * f12, 0.0f, 0.0f, paint);
            }
            if (f10 != 1.0f) {
                float f17 = this.f;
                canvas.drawLine(f17 * f10, 0.0f, f17, 0.0f, paint);
            }
            canvas.restore();
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY();
            int i7 = this.f;
            float f18 = centerX - i7;
            float f19 = centerY - i7;
            float f20 = centerX + i7;
            float f21 = centerY + i7;
            RectF rectF = this.c;
            rectF.set(f18, f19, f20, f21);
            f14 = this.d;
            float f22 = (f14 >= 360.0f ? f14 - 360.0f : 0.0f) - 45.0f;
            if (f14 >= 360.0f) {
                f14 = 720.0f - f14;
            }
            canvas.drawArc(rectF, f22, f14, false, paint);
            this.b = currentTimeMillis;
        }
        f11 = 1.0f - (f16 / 90.0f);
        f10 = 0.0f;
        f13 = 1.0f;
        f12 = f13;
        if (f11 == 0.0f) {
        }
        if (f13 != 0.0f) {
        }
        if (f12 != 0.0f) {
        }
        if (f10 != 1.0f) {
        }
        canvas.restore();
        int centerX2 = getBounds().centerX();
        int centerY2 = getBounds().centerY();
        int i72 = this.f;
        float f182 = centerX2 - i72;
        float f192 = centerY2 - i72;
        float f202 = centerX2 + i72;
        float f212 = centerY2 + i72;
        RectF rectF2 = this.c;
        rectF2.set(f182, f192, f202, f212);
        f14 = this.d;
        float f222 = (f14 >= 360.0f ? f14 - 360.0f : 0.0f) - 45.0f;
        if (f14 >= 360.0f) {
        }
        canvas.drawArc(rectF2, f222, f14, false, paint);
        this.b = currentTimeMillis;
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
        return -2;
    }

    public op(float f10) {
        Paint paint = new Paint(1);
        this.a = paint;
        new DecelerateInterpolator();
        this.c = new RectF();
        this.g = org.telegram.messenger.qs.e4;
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(f10));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f = org.telegram.messenger.g0.L(8.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
