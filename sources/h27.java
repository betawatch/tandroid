// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class h27 extends Drawable {
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

    public h27() {
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.h = true;
        this.i = new DecelerateInterpolator();
        this.o = jn7.d4;
        paint.setStrokeWidth(hl.L(2.0f));
        paint2.setStrokeWidth(hl.p * 1.66f);
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
        canvas.translate(((hl.L(24.0f) / 2) - hl.L(9.0f)) - (hl.L(1.0f) * this.f), hl.L(24.0f) / 2);
        int i2 = this.j;
        if (i2 == 0) {
            i2 = aob.w0(null, aob.v8, false);
        }
        int i3 = this.k;
        if (i3 == 0) {
            i3 = aob.w0(null, aob.s8, false);
        }
        boolean z = this.h;
        float f6 = this.f;
        boolean z2 = this.c;
        Paint paint = this.a;
        if (z) {
            canvas.rotate(f6 * (z2 ? -180 : jn7.J2), hl.L(9.0f), 0.0f);
            paint.setColor(i2);
            paint.setAlpha(this.o);
            canvas.drawLine(this.l ? qd4.A(1.0f, this.f, paint.getStrokeWidth() / 2.0f, hl.L(0.5f) * this.f) : 0.0f, 0.0f, ((hl.L(18.0f) - (hl.L(3.0f) * this.f)) - 0.0f) - (this.l ? (1.0f - this.f) * (paint.getStrokeWidth() / 2.0f) : 0.0f), 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f)) * hl.L(5.0f)) - (Math.abs(this.f) * hl.L(0.5f));
            L = hl.L(18.0f) - (Math.abs(this.f) * hl.L(2.5f));
            abs2 = (Math.abs(this.f) * hl.L(2.0f)) + hl.L(5.0f);
            abs3 = Math.abs(this.f) * hl.L(7.5f);
            if (this.l) {
                abs3 = qd4.A(1.0f, this.f, paint.getStrokeWidth() / 2.0f, abs3);
                float L2 = (hl.L(0.5f) * this.f) + abs;
                L -= ((1.0f - this.f) * (paint.getStrokeWidth() / 2.0f)) + (hl.L(0.5f) * this.f);
                abs2 -= hl.L(0.25f) * this.f;
                abs = (hl.L(0.25f) * this.f) + L2;
            }
        } else {
            canvas.rotate(f6 * (z2 ? -225 : 135), hl.L(9.0f), 0.0f);
            if (this.n) {
                paint.setColor(i2);
                paint.setAlpha(this.o);
                canvas.drawLine((hl.L(1.0f) * this.f) + ((1.0f - Math.abs(this.f)) * hl.N(2.0f)), 0.0f, ((hl.L(17.0f) * this.f) + ((1.0f - this.f) * hl.N(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * hl.N(5.0f)) - (Math.abs(this.f) * hl.N(0.5f));
                L = (Math.abs(this.f) * hl.N(9.0f)) + ((1.0f - Math.abs(this.f)) * hl.N(16.0f));
                abs2 = (Math.abs(this.f) * hl.N(3.0f)) + hl.N(5.0f);
                abs3 = (Math.abs(this.f) * hl.N(7.0f)) + hl.N(2.0f);
            } else {
                int w0 = aob.w0(null, aob.y8, false);
                hl.R0(this.f, 1.0f, i3, aob.w0(null, aob.w8, false));
                paint.setColor(hl.R0(this.f, 1.0f, i2, w0));
                paint.setAlpha(this.o);
                canvas.drawLine(this.f * hl.L(1.0f), 0.0f, (hl.L(18.0f) - (hl.L(1.0f) * this.f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f)) * hl.L(5.0f)) - (Math.abs(this.f) * hl.L(0.5f));
                L = hl.L(18.0f) - (Math.abs(this.f) * hl.L(9.0f));
                abs2 = (Math.abs(this.f) * hl.L(3.0f)) + hl.L(5.0f);
                abs3 = Math.abs(this.f) * hl.L(9.0f);
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
        return hl.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return hl.L(24.0f);
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
