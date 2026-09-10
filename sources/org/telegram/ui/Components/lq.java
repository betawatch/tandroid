package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class lq extends Drawable {
    public final Paint a;
    public long b;
    public final RectF c;
    public float d;
    public boolean e;
    public int f;
    public int g;

    public lq() {
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
        float f7;
        float f10;
        float f11;
        float y3;
        float f12;
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
                f11 = org.telegram.messenger.a2.y(f15, 90.0f, 90.0f, 1.0f);
                f7 = 0.0f;
                f10 = 1.0f;
                f12 = 0.0f;
                if (f7 == 0.0f) {
                }
                if (f11 != 0.0f) {
                }
                if (f10 != 0.0f) {
                }
                if (f12 != 1.0f) {
                }
                canvas.restore();
                int centerX = getBounds().centerX();
                int centerY = getBounds().centerY();
                int i10 = this.f;
                float f16 = centerX - i10;
                float f17 = centerY - i10;
                float f18 = centerX + i10;
                float f19 = centerY + i10;
                RectF rectF = this.c;
                rectF.set(f16, f17, f18, f19);
                f13 = this.d;
                float f20 = (f13 >= 360.0f ? f13 - 360.0f : 0.0f) - 45.0f;
                if (f13 >= 360.0f) {
                }
                canvas.drawArc(rectF, f20, f13, false, paint);
                this.b = currentTimeMillis;
            }
            if (f15 < 180.0f || f15 >= 270.0f) {
                if (f15 >= 270.0f && f15 < 360.0f) {
                    y3 = (f15 - 270.0f) / 90.0f;
                } else if (f15 < 360.0f || f15 >= 450.0f) {
                    if (f15 >= 450.0f && f15 < 540.0f) {
                        f7 = (f15 - 450.0f) / 90.0f;
                        f11 = 0.0f;
                    } else if (f15 >= 540.0f && f15 < 630.0f) {
                        f11 = (f15 - 540.0f) / 90.0f;
                        f7 = 1.0f;
                    } else if (f15 < 630.0f || f15 >= 720.0f) {
                        f7 = 1.0f;
                    } else {
                        f10 = (f15 - 630.0f) / 90.0f;
                        f7 = 1.0f;
                        f11 = 1.0f;
                    }
                    f10 = 0.0f;
                } else {
                    y3 = org.telegram.messenger.a2.y(f15, 360.0f, 90.0f, 1.0f);
                }
                f12 = y3;
                f7 = 0.0f;
                f11 = 0.0f;
                f10 = 0.0f;
                if (f7 == 0.0f) {
                    paint = paint2;
                    canvas2.drawLine(0.0f, 0.0f, 0.0f, this.f * f7, paint);
                } else {
                    paint = paint2;
                }
                if (f11 != 0.0f) {
                    canvas.drawLine((-this.f) * f11, 0.0f, 0.0f, 0.0f, paint);
                }
                if (f10 != 0.0f) {
                    canvas.drawLine(0.0f, (-this.f) * f10, 0.0f, 0.0f, paint);
                }
                if (f12 != 1.0f) {
                    float f21 = this.f;
                    canvas.drawLine(f21 * f12, 0.0f, f21, 0.0f, paint);
                }
                canvas.restore();
                int centerX2 = getBounds().centerX();
                int centerY2 = getBounds().centerY();
                int i102 = this.f;
                float f162 = centerX2 - i102;
                float f172 = centerY2 - i102;
                float f182 = centerX2 + i102;
                float f192 = centerY2 + i102;
                RectF rectF2 = this.c;
                rectF2.set(f162, f172, f182, f192);
                f13 = this.d;
                float f202 = (f13 >= 360.0f ? f13 - 360.0f : 0.0f) - 45.0f;
                if (f13 >= 360.0f) {
                    f13 = 720.0f - f13;
                }
                canvas.drawArc(rectF2, f202, f13, false, paint);
                this.b = currentTimeMillis;
            }
            f10 = org.telegram.messenger.a2.y(f15, 180.0f, 90.0f, 1.0f);
            f7 = 0.0f;
            f11 = 0.0f;
            f12 = 0.0f;
            if (f7 == 0.0f) {
            }
            if (f11 != 0.0f) {
            }
            if (f10 != 0.0f) {
            }
            if (f12 != 1.0f) {
            }
            canvas.restore();
            int centerX22 = getBounds().centerX();
            int centerY22 = getBounds().centerY();
            int i1022 = this.f;
            float f1622 = centerX22 - i1022;
            float f1722 = centerY22 - i1022;
            float f1822 = centerX22 + i1022;
            float f1922 = centerY22 + i1022;
            RectF rectF22 = this.c;
            rectF22.set(f1622, f1722, f1822, f1922);
            f13 = this.d;
            float f2022 = (f13 >= 360.0f ? f13 - 360.0f : 0.0f) - 45.0f;
            if (f13 >= 360.0f) {
            }
            canvas.drawArc(rectF22, f2022, f13, false, paint);
            this.b = currentTimeMillis;
        }
        f7 = 1.0f - (f15 / 90.0f);
        f11 = 1.0f;
        f10 = 1.0f;
        f12 = 0.0f;
        if (f7 == 0.0f) {
        }
        if (f11 != 0.0f) {
        }
        if (f10 != 0.0f) {
        }
        if (f12 != 1.0f) {
        }
        canvas.restore();
        int centerX222 = getBounds().centerX();
        int centerY222 = getBounds().centerY();
        int i10222 = this.f;
        float f16222 = centerX222 - i10222;
        float f17222 = centerY222 - i10222;
        float f18222 = centerX222 + i10222;
        float f19222 = centerY222 + i10222;
        RectF rectF222 = this.c;
        rectF222.set(f16222, f17222, f18222, f19222);
        f13 = this.d;
        float f20222 = (f13 >= 360.0f ? f13 - 360.0f : 0.0f) - 45.0f;
        if (f13 >= 360.0f) {
        }
        canvas.drawArc(rectF222, f20222, f13, false, paint);
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

    public lq(float f7) {
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
