// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class hh2 extends d2b {
    public final /* synthetic */ byte a;
    public boolean b;
    public long c;
    public boolean d;
    public float e;
    public int f;
    public final Paint g;
    public final Object h;

    public hh2(boolean z) {
        this.a = (byte) 1;
        this.b = false;
        this.c = 0L;
        this.d = false;
        this.h = new RectF();
        this.f = jn7.d4;
        if (z) {
            Paint paint = new Paint(1);
            this.g = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(hl.L(2.0f));
        }
    }

    @Override // d2b
    public final void b(int i) {
        byte b = this.a;
        Paint paint = this.g;
        switch (b) {
            case 0:
                if (this.f != i) {
                    ((Paint) this.h).setColor(i);
                    paint.setColor(i);
                }
                this.f = i;
                break;
            default:
                if (paint != null) {
                    paint.setColor(i);
                    break;
                }
                break;
        }
    }

    @Override // d2b
    public final void c(boolean z) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b = z;
                break;
        }
    }

    @Override // d2b
    public final void d() {
        switch (this.a) {
            case 0:
                this.c = System.currentTimeMillis();
                this.b = true;
                invalidateSelf();
                break;
            default:
                this.c = System.currentTimeMillis();
                this.d = true;
                invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float L;
        float N;
        byte b = this.a;
        Paint paint = this.g;
        Object obj = this.h;
        switch (b) {
            case 0:
                float min = Math.min(this.e, 1.0f);
                float interpolation = k43.i.getInterpolation(min < 0.3f ? min / 0.3f : 1.0f);
                k43 k43Var = k43.g;
                float interpolation2 = k43Var.getInterpolation(min < 0.3f ? 0.0f : (min - 0.3f) / 0.7f);
                if (this.d) {
                    L = qd4.A(1.0f, interpolation, hl.L(7.0f) - hl.L(2.1f), hl.L(2.1f) * interpolation);
                    N = (1.0f - k43Var.getInterpolation(this.e / 2.0f)) * hl.N(1.5f);
                } else {
                    L = ((hl.L(7.0f) - hl.L(2.1f)) * interpolation) + ((1.0f - interpolation) * hl.L(2.1f));
                    N = hl.N(1.5f) * k43.h.getInterpolation(this.e / 2.0f);
                }
                float L2 = hl.L(11.0f) / 2.0f;
                float N2 = hl.N(2.0f);
                float N3 = (hl.N(0.5f) * interpolation) - (hl.N(0.5f) * interpolation2);
                if (paint == null) {
                    paint = aob.d2;
                }
                Paint paint2 = (Paint) obj;
                if (paint2 == null) {
                    paint2 = aob.c2;
                }
                if (paint.getStrokeWidth() != hl.L(0.8f)) {
                    paint.setStrokeWidth(hl.L(0.8f));
                }
                int i = 0;
                for (int i2 = 2; i < i2; i2 = 2) {
                    canvas.save();
                    canvas.translate(hl.N(0.2f) + (paint.getStrokeWidth() / 2.0f) + N + (hl.L(9.0f) * i) + getBounds().left, hl.N(2.0f) + (paint.getStrokeWidth() / 2.0f) + getBounds().top);
                    RectF rectF = hl.P;
                    rectF.set(0.0f, N3, hl.L(7.0f), hl.L(11.0f) - N3);
                    canvas.drawOval(rectF, paint);
                    canvas.drawCircle(L, L2, N2, paint2);
                    canvas.restore();
                    i++;
                }
                if (this.b) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = currentTimeMillis - this.c;
                    this.c = currentTimeMillis;
                    float f = ((j > 50 ? 50L : j) / 500.0f) + this.e;
                    this.e = f;
                    if (f >= 2.0f) {
                        this.e = 0.0f;
                        this.d = !this.d;
                    }
                    a();
                    break;
                }
                break;
            default:
                RectF rectF2 = (RectF) obj;
                if (paint == null) {
                    paint = aob.d2;
                }
                if (paint.getStrokeWidth() != hl.L(2.0f)) {
                    paint.setStrokeWidth(hl.L(2.0f));
                }
                canvas.save();
                canvas.translate(0.0f, hl.L(this.b ? 1.0f : 2.0f) + (hl.L(14.0f) / 2));
                for (int i3 = 0; i3 < 4; i3++) {
                    int i4 = this.f;
                    if (i3 == 0) {
                        paint.setAlpha((int) (i4 * this.e));
                    } else if (i3 == 3) {
                        paint.setAlpha((int) ((1.0f - this.e) * i4));
                    } else {
                        paint.setAlpha(i4);
                    }
                    float L3 = (hl.L(4.0f) * this.e) + (hl.L(4.0f) * i3);
                    float f2 = -L3;
                    rectF2.set(f2, f2, L3, L3);
                    canvas.drawArc(rectF2, -15.0f, 30.0f, false, paint);
                }
                canvas.restore();
                if (this.d) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j2 = currentTimeMillis2 - this.c;
                    this.c = currentTimeMillis2;
                    this.e = ((j2 <= 50 ? j2 : 50L) / 800.0f) + this.e;
                    while (true) {
                        float f3 = this.e;
                        if (f3 <= 1.0f) {
                            a();
                            break;
                        } else {
                            this.e = f3 - 1.0f;
                        }
                    }
                }
                break;
        }
    }

    @Override // d2b
    public final void e() {
        switch (this.a) {
            case 0:
                this.b = false;
                break;
            default:
                this.d = false;
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 0:
                return hl.L(18.0f);
            default:
                return hl.L(14.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return hl.L(20.0f);
            default:
                return hl.L(18.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        byte b = this.a;
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.f = i;
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }

    private final void f(int i) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(boolean z) {
    }

    public hh2() {
        this.a = (byte) 0;
        this.c = 0L;
        this.b = false;
        this.d = true;
        Paint paint = new Paint(1);
        this.g = paint;
        this.h = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.N(1.2f));
    }
}
