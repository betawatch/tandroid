// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class kk2 extends Drawable {
    public final Paint a;
    public long b;
    public final RectF c;
    public float d;
    public boolean e;
    public int f;
    public int g;

    public kk2(float f) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = new RectF();
        this.g = nm7.d4;
        paint.setColor(-1);
        paint.setStrokeWidth(gm.L(f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.STROKE);
        this.f = gm.L(8.0f);
    }

    public int a() {
        return cmb.w0(null, cmb.eg, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        float f4;
        float y;
        Paint paint;
        float f5;
        long currentTimeMillis = System.currentTimeMillis();
        int a = a();
        Paint paint2 = this.a;
        if (a != 0) {
            this.g = Color.alpha(a);
            paint2.setColor(on2.p(a, nm7.d4));
        }
        long j = this.b;
        if (j != 0) {
            long j2 = currentTimeMillis - j;
            boolean z = this.e;
            if (z || this.d != 0.0f) {
                float f6 = ((j2 * 360) / 500.0f) + this.d;
                this.d = f6;
                if (z || f6 < 720.0f) {
                    this.d = f6 - (((int) (f6 / 720.0f)) * 720);
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
        canvas2.translate(gm.L(24.0f) / 2, gm.L(24.0f) / 2);
        canvas2.rotate(-45.0f);
        float f7 = this.d;
        if (f7 < 0.0f || f7 >= 90.0f) {
            if (f7 >= 90.0f && f7 < 180.0f) {
                f4 = td4.y(f7, 90.0f, 90.0f, 1.0f);
                f2 = 0.0f;
                f = 0.0f;
                f3 = 1.0f;
            } else if (f7 < 180.0f || f7 >= 270.0f) {
                if (f7 >= 270.0f && f7 < 360.0f) {
                    y = (f7 - 270.0f) / 90.0f;
                } else if (f7 >= 360.0f && f7 < 450.0f) {
                    y = td4.y(f7, 360.0f, 90.0f, 1.0f);
                } else if (f7 >= 450.0f && f7 < 540.0f) {
                    f2 = (f7 - 450.0f) / 90.0f;
                    f4 = 0.0f;
                    f3 = 0.0f;
                    f = 0.0f;
                } else if (f7 >= 540.0f && f7 < 630.0f) {
                    f4 = (f7 - 540.0f) / 90.0f;
                    f3 = 0.0f;
                    f = 0.0f;
                    f2 = 1.0f;
                } else if (f7 < 630.0f || f7 >= 720.0f) {
                    f = 0.0f;
                    f2 = 1.0f;
                    f4 = f2;
                } else {
                    f3 = (f7 - 630.0f) / 90.0f;
                    f = 0.0f;
                    f2 = 1.0f;
                    f4 = 1.0f;
                }
                f = y;
                f2 = 0.0f;
                f4 = f2;
            } else {
                f3 = td4.y(f7, 180.0f, 90.0f, 1.0f);
                f2 = 0.0f;
                f4 = 0.0f;
                f = 0.0f;
            }
            if (f2 == 0.0f) {
                paint = paint2;
                canvas2.drawLine(0.0f, 0.0f, 0.0f, this.f * f2, paint);
            } else {
                paint = paint2;
            }
            if (f4 != 0.0f) {
                canvas.drawLine((-this.f) * f4, 0.0f, 0.0f, 0.0f, paint);
            }
            if (f3 != 0.0f) {
                canvas.drawLine(0.0f, (-this.f) * f3, 0.0f, 0.0f, paint);
            }
            if (f != 1.0f) {
                float f8 = this.f;
                canvas.drawLine(f8 * f, 0.0f, f8, 0.0f, paint);
            }
            canvas.restore();
            int centerX = getBounds().centerX();
            int centerY = getBounds().centerY();
            int i = this.f;
            float f9 = centerX - i;
            float f10 = centerY - i;
            float f11 = centerX + i;
            float f12 = centerY + i;
            RectF rectF = this.c;
            rectF.set(f9, f10, f11, f12);
            f5 = this.d;
            float f13 = (f5 >= 360.0f ? f5 - 360.0f : 0.0f) - 45.0f;
            if (f5 >= 360.0f) {
                f5 = 720.0f - f5;
            }
            canvas.drawArc(rectF, f13, f5, false, paint);
            this.b = currentTimeMillis;
        }
        f2 = 1.0f - (f7 / 90.0f);
        f = 0.0f;
        f4 = 1.0f;
        f3 = f4;
        if (f2 == 0.0f) {
        }
        if (f4 != 0.0f) {
        }
        if (f3 != 0.0f) {
        }
        if (f != 1.0f) {
        }
        canvas.restore();
        int centerX2 = getBounds().centerX();
        int centerY2 = getBounds().centerY();
        int i2 = this.f;
        float f92 = centerX2 - i2;
        float f102 = centerY2 - i2;
        float f112 = centerX2 + i2;
        float f122 = centerY2 + i2;
        RectF rectF2 = this.c;
        rectF2.set(f92, f102, f112, f122);
        f5 = this.d;
        float f132 = (f5 >= 360.0f ? f5 - 360.0f : 0.0f) - 45.0f;
        if (f5 >= 360.0f) {
        }
        canvas.drawArc(rectF2, f132, f5, false, paint);
        this.b = currentTimeMillis;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return gm.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gm.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public kk2() {
        this(2.0f);
    }
}
