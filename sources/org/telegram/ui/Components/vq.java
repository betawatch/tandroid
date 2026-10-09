package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class vq extends Drawable {
    public final Paint a;
    public long b;
    public final RectF c;
    public float d;
    public boolean e;
    public int f;
    public int g;

    public vq() {
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
        float f7;
        float f10;
        float f11;
        float f12;
        float x10;
        Paint paint;
        float f13;
        long currentTimeMillis = System.currentTimeMillis();
        int a2 = a();
        Paint paint2 = this.a;
        if (a2 != 0) {
            this.g = Color.alpha(a2);
            paint2.setColor(i0.a.k(a2, 255));
        }
        long j3 = this.b;
        if (j3 != 0) {
            long j10 = currentTimeMillis - j3;
            boolean z10 = this.e;
            if (z10 || this.d != 0.0f) {
                float f14 = ((j10 * 360) / 500.0f) + this.d;
                this.d = f14;
                if (z10 || f14 < 720.0f) {
                    this.d = f14 - (((int) (f14 / 720.0f)) * 720);
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
        canvas2.translate(AndroidUtilities.dp(24.0f) / 2, AndroidUtilities.dp(24.0f) / 2);
        canvas2.rotate(-45.0f);
        float f15 = this.d;
        if (f15 < 0.0f || f15 >= 90.0f) {
            if (f15 >= 90.0f && f15 < 180.0f) {
                f12 = org.telegram.messenger.q.x(f15, 90.0f, 90.0f, 1.0f);
                f10 = 0.0f;
                f7 = 0.0f;
                f11 = 1.0f;
            } else if (f15 < 180.0f || f15 >= 270.0f) {
                if (f15 >= 270.0f && f15 < 360.0f) {
                    x10 = (f15 - 270.0f) / 90.0f;
                } else if (f15 >= 360.0f && f15 < 450.0f) {
                    x10 = org.telegram.messenger.q.x(f15, 360.0f, 90.0f, 1.0f);
                } else if (f15 >= 450.0f && f15 < 540.0f) {
                    f10 = (f15 - 450.0f) / 90.0f;
                    f12 = 0.0f;
                    f11 = 0.0f;
                    f7 = 0.0f;
                } else if (f15 >= 540.0f && f15 < 630.0f) {
                    f12 = (f15 - 540.0f) / 90.0f;
                    f11 = 0.0f;
                    f7 = 0.0f;
                    f10 = 1.0f;
                } else if (f15 < 630.0f || f15 >= 720.0f) {
                    f7 = 0.0f;
                    f10 = 1.0f;
                    f12 = f10;
                } else {
                    f11 = (f15 - 630.0f) / 90.0f;
                    f7 = 0.0f;
                    f10 = 1.0f;
                    f12 = 1.0f;
                }
                f7 = x10;
                f10 = 0.0f;
                f12 = f10;
            } else {
                f11 = org.telegram.messenger.q.x(f15, 180.0f, 90.0f, 1.0f);
                f10 = 0.0f;
                f12 = 0.0f;
                f7 = 0.0f;
            }
            if (f10 == 0.0f) {
                paint = paint2;
                canvas2.drawLine(0.0f, 0.0f, 0.0f, this.f * f10, paint);
            } else {
                paint = paint2;
            }
            if (f12 != 0.0f) {
                canvas.drawLine((-this.f) * f12, 0.0f, 0.0f, 0.0f, paint);
            }
            if (f11 != 0.0f) {
                canvas.drawLine(0.0f, (-this.f) * f11, 0.0f, 0.0f, paint);
            }
            if (f7 != 1.0f) {
                float f16 = this.f;
                canvas.drawLine(f16 * f7, 0.0f, f16, 0.0f, paint);
            }
            canvas.restore();
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY();
            int i10 = this.f;
            float f17 = centerX - i10;
            float f18 = centerY - i10;
            float f19 = centerX + i10;
            float f20 = centerY + i10;
            RectF rectF = this.c;
            rectF.set(f17, f18, f19, f20);
            f13 = this.d;
            float f21 = (f13 >= 360.0f ? f13 - 360.0f : 0.0f) - 45.0f;
            if (f13 >= 360.0f) {
                f13 = 720.0f - f13;
            }
            canvas.drawArc(rectF, f21, f13, false, paint);
            this.b = currentTimeMillis;
        }
        f10 = 1.0f - (f15 / 90.0f);
        f7 = 0.0f;
        f12 = 1.0f;
        f11 = f12;
        if (f10 == 0.0f) {
        }
        if (f12 != 0.0f) {
        }
        if (f11 != 0.0f) {
        }
        if (f7 != 1.0f) {
        }
        canvas.restore();
        int centerX2 = getBounds().centerX();
        int centerY2 = getBounds().centerY();
        int i102 = this.f;
        float f172 = centerX2 - i102;
        float f182 = centerY2 - i102;
        float f192 = centerX2 + i102;
        float f202 = centerY2 + i102;
        RectF rectF2 = this.c;
        rectF2.set(f172, f182, f192, f202);
        f13 = this.d;
        float f212 = (f13 >= 360.0f ? f13 - 360.0f : 0.0f) - 45.0f;
        if (f13 >= 360.0f) {
        }
        canvas.drawArc(rectF2, f212, f13, false, paint);
        this.b = currentTimeMillis;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public vq(float f7) {
        Paint paint = new Paint(1);
        this.a = paint;
        new DecelerateInterpolator();
        this.c = new RectF();
        this.g = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(f7));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f = AndroidUtilities.dp(8.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
