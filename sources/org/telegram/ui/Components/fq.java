package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class fq extends Drawable {
    public final Paint a;
    public long b;
    public final RectF c;
    public float d;
    public boolean e;
    public int f;
    public int g;

    public fq() {
        this(2.0f);
    }

    public abstract int a();

    /* JADX WARN: Removed duplicated region for block: B:34:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float a2;
        float f13;
        Paint paint;
        float f14;
        long currentTimeMillis = System.currentTimeMillis();
        int a10 = a();
        Paint paint2 = this.a;
        if (a10 != 0) {
            this.g = Color.alpha(a10);
            paint2.setColor(i0.a.k(a10, 255));
        }
        long j10 = this.b;
        if (j10 != 0) {
            long j11 = currentTimeMillis - j10;
            boolean z4 = this.e;
            if (z4 || this.d != 0.0f) {
                float f15 = ((j11 * 360) / 500.0f) + this.d;
                this.d = f15;
                if (z4 || f15 < 720.0f) {
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
        canvas2.translate(AndroidUtilities.dp(24.0f) / 2, AndroidUtilities.dp(24.0f) / 2);
        canvas2.rotate(-45.0f);
        float f16 = this.d;
        if (f16 < 0.0f || f16 >= 90.0f) {
            if (f16 >= 90.0f && f16 < 180.0f) {
                f12 = org.telegram.messenger.y3.a(f16, 90.0f, 90.0f, 1.0f);
                f10 = 0.0f;
                f11 = 1.0f;
                f13 = 0.0f;
                if (f10 == 0.0f) {
                }
                if (f12 != 0.0f) {
                }
                if (f11 != 0.0f) {
                }
                if (f13 != 1.0f) {
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
                f14 = this.d;
                float f21 = (f14 >= 360.0f ? f14 - 360.0f : 0.0f) - 45.0f;
                if (f14 >= 360.0f) {
                }
                canvas.drawArc(rectF, f21, f14, false, paint);
                this.b = currentTimeMillis;
            }
            if (f16 < 180.0f || f16 >= 270.0f) {
                if (f16 >= 270.0f && f16 < 360.0f) {
                    a2 = (f16 - 270.0f) / 90.0f;
                } else if (f16 < 360.0f || f16 >= 450.0f) {
                    if (f16 >= 450.0f && f16 < 540.0f) {
                        f10 = (f16 - 450.0f) / 90.0f;
                        f12 = 0.0f;
                    } else if (f16 >= 540.0f && f16 < 630.0f) {
                        f12 = (f16 - 540.0f) / 90.0f;
                        f10 = 1.0f;
                    } else if (f16 < 630.0f || f16 >= 720.0f) {
                        f10 = 1.0f;
                    } else {
                        f11 = (f16 - 630.0f) / 90.0f;
                        f10 = 1.0f;
                        f12 = 1.0f;
                    }
                    f11 = 0.0f;
                } else {
                    a2 = org.telegram.messenger.y3.a(f16, 360.0f, 90.0f, 1.0f);
                }
                f13 = a2;
                f10 = 0.0f;
                f12 = 0.0f;
                f11 = 0.0f;
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
                if (f13 != 1.0f) {
                    float f22 = this.f;
                    canvas.drawLine(f22 * f13, 0.0f, f22, 0.0f, paint);
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
                f14 = this.d;
                float f212 = (f14 >= 360.0f ? f14 - 360.0f : 0.0f) - 45.0f;
                if (f14 >= 360.0f) {
                    f14 = 720.0f - f14;
                }
                canvas.drawArc(rectF2, f212, f14, false, paint);
                this.b = currentTimeMillis;
            }
            f11 = org.telegram.messenger.y3.a(f16, 180.0f, 90.0f, 1.0f);
            f10 = 0.0f;
            f12 = 0.0f;
            f13 = 0.0f;
            if (f10 == 0.0f) {
            }
            if (f12 != 0.0f) {
            }
            if (f11 != 0.0f) {
            }
            if (f13 != 1.0f) {
            }
            canvas.restore();
            int centerX22 = getBounds().centerX();
            int centerY22 = getBounds().centerY();
            int i1022 = this.f;
            float f1722 = centerX22 - i1022;
            float f1822 = centerY22 - i1022;
            float f1922 = centerX22 + i1022;
            float f2022 = centerY22 + i1022;
            RectF rectF22 = this.c;
            rectF22.set(f1722, f1822, f1922, f2022);
            f14 = this.d;
            float f2122 = (f14 >= 360.0f ? f14 - 360.0f : 0.0f) - 45.0f;
            if (f14 >= 360.0f) {
            }
            canvas.drawArc(rectF22, f2122, f14, false, paint);
            this.b = currentTimeMillis;
        }
        f10 = 1.0f - (f16 / 90.0f);
        f12 = 1.0f;
        f11 = 1.0f;
        f13 = 0.0f;
        if (f10 == 0.0f) {
        }
        if (f12 != 0.0f) {
        }
        if (f11 != 0.0f) {
        }
        if (f13 != 1.0f) {
        }
        canvas.restore();
        int centerX222 = getBounds().centerX();
        int centerY222 = getBounds().centerY();
        int i10222 = this.f;
        float f17222 = centerX222 - i10222;
        float f18222 = centerY222 - i10222;
        float f19222 = centerX222 + i10222;
        float f20222 = centerY222 + i10222;
        RectF rectF222 = this.c;
        rectF222.set(f17222, f18222, f19222, f20222);
        f14 = this.d;
        float f21222 = (f14 >= 360.0f ? f14 - 360.0f : 0.0f) - 45.0f;
        if (f14 >= 360.0f) {
        }
        canvas.drawArc(rectF222, f21222, f14, false, paint);
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

    public fq(float f10) {
        Paint paint = new Paint(1);
        this.a = paint;
        new DecelerateInterpolator();
        this.c = new RectF();
        this.g = 255;
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(f10));
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
