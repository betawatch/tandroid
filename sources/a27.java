// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public class a27 extends Drawable {
    public final Paint a;
    public final Paint b;
    public boolean c;
    public long d;
    public float e;
    public float f;
    public int g;
    public boolean h;
    public final DecelerateInterpolator i;
    public int j;
    public int k;
    public boolean l;
    public float m;
    public boolean n;
    public int o;

    public a27() {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.h = true;
        this.i = new DecelerateInterpolator();
        this.o = nm7.d4;
        paint.setStrokeWidth(gm.L(2.0f));
        paint2.setStrokeWidth(gm.p * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.m = 1.0f;
    }

    public final void a(boolean z, float f) {
        this.d = 0L;
        float f2 = this.f;
        if (f2 == 1.0f) {
            this.c = true;
        } else if (f2 == 0.0f) {
            this.c = false;
        }
        this.d = 0L;
        if (z) {
            if (f2 < f) {
                this.g = (int) (f2 * 200.0f);
            } else {
                this.g = (int) ((1.0f - f2) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.e = f;
        } else {
            this.f = f;
            this.e = f;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float abs;
        float L;
        float abs2;
        float abs3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.d;
        long j2 = elapsedRealtime - j;
        float f = this.f;
        float f2 = this.e;
        if (f != f2) {
            if (j != 0) {
                int i = (int) (this.g + j2);
                this.g = i;
                if (i >= 200) {
                    this.f = f2;
                } else {
                    DecelerateInterpolator decelerateInterpolator = this.i;
                    float f3 = i / 200.0f;
                    if (f < f2) {
                        this.f = decelerateInterpolator.getInterpolation(f3) * this.e;
                    } else {
                        this.f = 1.0f - decelerateInterpolator.getInterpolation(f3);
                    }
                }
            }
            invalidateSelf();
        }
        float f4 = this.m;
        if (f4 < 1.0f) {
            float f5 = (j2 / 200.0f) + f4;
            this.m = f5;
            if (f5 > 1.0f) {
                this.m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((gm.L(24.0f) / 2) - gm.L(9.0f)) - (gm.L(1.0f) * this.f), gm.L(24.0f) / 2);
        int i2 = this.j;
        if (i2 == 0) {
            i2 = cmb.w0(null, cmb.u8, false);
        }
        int i3 = this.k;
        if (i3 == 0) {
            i3 = cmb.w0(null, cmb.r8, false);
        }
        boolean z = this.h;
        float f6 = this.f;
        boolean z2 = this.c;
        Paint paint = this.a;
        if (z) {
            canvas.rotate(f6 * (z2 ? -180 : nm7.J2), gm.L(9.0f), 0.0f);
            paint.setColor(i2);
            paint.setAlpha(this.o);
            canvas.drawLine(this.l ? td4.A(1.0f, this.f, paint.getStrokeWidth() / 2.0f, gm.L(0.5f) * this.f) : 0.0f, 0.0f, ((gm.L(18.0f) - (gm.L(3.0f) * this.f)) - 0.0f) - (this.l ? (1.0f - this.f) * (paint.getStrokeWidth() / 2.0f) : 0.0f), 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f)) * gm.L(5.0f)) - (Math.abs(this.f) * gm.L(0.5f));
            L = gm.L(18.0f) - (Math.abs(this.f) * gm.L(2.5f));
            abs2 = (Math.abs(this.f) * gm.L(2.0f)) + gm.L(5.0f);
            abs3 = Math.abs(this.f) * gm.L(7.5f);
            if (this.l) {
                abs3 = td4.A(1.0f, this.f, paint.getStrokeWidth() / 2.0f, abs3);
                float L2 = (gm.L(0.5f) * this.f) + abs;
                L -= ((1.0f - this.f) * (paint.getStrokeWidth() / 2.0f)) + (gm.L(0.5f) * this.f);
                abs2 -= gm.L(0.25f) * this.f;
                abs = (gm.L(0.25f) * this.f) + L2;
            }
        } else {
            canvas.rotate(f6 * (z2 ? -225 : 135), gm.L(9.0f), 0.0f);
            if (this.n) {
                paint.setColor(i2);
                paint.setAlpha(this.o);
                canvas.drawLine((gm.L(1.0f) * this.f) + ((1.0f - Math.abs(this.f)) * gm.N(2.0f)), 0.0f, ((gm.L(17.0f) * this.f) + ((1.0f - this.f) * gm.N(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * gm.N(5.0f)) - (Math.abs(this.f) * gm.N(0.5f));
                L = (Math.abs(this.f) * gm.N(9.0f)) + ((1.0f - Math.abs(this.f)) * gm.N(16.0f));
                abs2 = (Math.abs(this.f) * gm.N(3.0f)) + gm.N(5.0f);
                abs3 = (Math.abs(this.f) * gm.N(7.0f)) + gm.N(2.0f);
            } else {
                int w0 = cmb.w0(null, cmb.x8, false);
                gm.R0(this.f, 1.0f, i3, cmb.w0(null, cmb.v8, false));
                paint.setColor(gm.R0(this.f, 1.0f, i2, w0));
                paint.setAlpha(this.o);
                canvas.drawLine(this.f * gm.L(1.0f), 0.0f, (gm.L(18.0f) - (gm.L(1.0f) * this.f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * gm.L(5.0f)) - (Math.abs(this.f) * gm.L(0.5f));
                L = gm.L(18.0f) - (Math.abs(this.f) * gm.L(9.0f));
                abs2 = (Math.abs(this.f) * gm.L(3.0f)) + gm.L(5.0f);
                abs3 = Math.abs(this.f) * gm.L(9.0f);
            }
        }
        float f7 = abs3;
        float f8 = abs2;
        float f9 = abs;
        float f10 = L;
        if (this.n) {
            canvas.drawLine(f7, -f8, f10, -f9, paint);
            canvas.drawLine(f7, f8, f10, f9, paint);
        } else {
            canvas.drawLine(f7, -f8, f10 - 0.0f, -f9, paint);
            canvas.drawLine(f7, f8, f10, f9, paint);
        }
        canvas.restore();
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
        if (this.o != i) {
            this.o = i;
            this.a.setAlpha(i);
            this.b.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
