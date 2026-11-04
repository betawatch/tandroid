package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ap extends nu0 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public boolean d;
    public float e;
    public int f;
    public final Paint g;
    public final Object h;

    public ap() {
        this.a = 0;
        this.c = 0L;
        this.b = false;
        this.d = true;
        Paint paint = new Paint(1);
        this.g = paint;
        this.h = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.2f));
    }

    @Override // org.telegram.ui.Components.nu0
    public final void b(int i3) {
        switch (this.a) {
            case 0:
                if (this.f != i3) {
                    ((Paint) this.h).setColor(i3);
                    this.g.setColor(i3);
                }
                this.f = i3;
                break;
            default:
                Paint paint = this.g;
                if (paint != null) {
                    paint.setColor(i3);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.nu0
    public final void c(boolean z10) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b = z10;
                break;
        }
    }

    @Override // org.telegram.ui.Components.nu0
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
        switch (this.a) {
            case 0:
                float min = Math.min(this.e, 1.0f);
                float interpolation = xq.i.getInterpolation(min < 0.3f ? min / 0.3f : 1.0f);
                xq xqVar = xq.g;
                float interpolation2 = xqVar.getInterpolation(min < 0.3f ? 0.0f : (min - 0.3f) / 0.7f);
                if (this.d) {
                    L = com.google.android.recaptcha.internal.a.y(1.0f, interpolation, org.telegram.messenger.g0.L(7.0f) - org.telegram.messenger.g0.L(2.1f), org.telegram.messenger.g0.L(2.1f) * interpolation);
                    N = (1.0f - xqVar.getInterpolation(this.e / 2.0f)) * org.telegram.messenger.g0.N(1.5f);
                } else {
                    L = ((org.telegram.messenger.g0.L(7.0f) - org.telegram.messenger.g0.L(2.1f)) * interpolation) + ((1.0f - interpolation) * org.telegram.messenger.g0.L(2.1f));
                    N = org.telegram.messenger.g0.N(1.5f) * xq.h.getInterpolation(this.e / 2.0f);
                }
                float f10 = 11.0f;
                float L2 = org.telegram.messenger.g0.L(11.0f) / 2.0f;
                float N2 = org.telegram.messenger.g0.N(2.0f);
                float N3 = (org.telegram.messenger.g0.N(0.5f) * interpolation) - (org.telegram.messenger.g0.N(0.5f) * interpolation2);
                Paint paint = this.g;
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.k6.d2;
                }
                Paint paint2 = (Paint) this.h;
                if (paint2 == null) {
                    paint2 = org.telegram.ui.ActionBar.k6.c2;
                }
                if (paint.getStrokeWidth() != org.telegram.messenger.g0.L(0.8f)) {
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(0.8f));
                }
                int i3 = 0;
                while (i3 < 2) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.N(0.2f) + (paint.getStrokeWidth() / 2.0f) + N + (org.telegram.messenger.g0.L(9.0f) * i3) + getBounds().left, org.telegram.messenger.g0.N(2.0f) + (paint.getStrokeWidth() / 2.0f) + getBounds().top);
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, N3, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(r16) - N3);
                    canvas.drawOval(rectF, paint);
                    canvas.drawCircle(L, L2, N2, paint2);
                    canvas.restore();
                    i3++;
                    f10 = f10;
                }
                if (this.b) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - this.c;
                    this.c = currentTimeMillis;
                    if (j10 > 50) {
                        j10 = 50;
                    }
                    float f11 = (j10 / 500.0f) + this.e;
                    this.e = f11;
                    if (f11 >= 2.0f) {
                        this.e = 0.0f;
                        this.d = !this.d;
                    }
                    a();
                    break;
                }
                break;
            default:
                RectF rectF2 = (RectF) this.h;
                Paint paint3 = this.g;
                if (paint3 == null) {
                    paint3 = org.telegram.ui.ActionBar.k6.d2;
                }
                Paint paint4 = paint3;
                if (paint4.getStrokeWidth() != org.telegram.messenger.g0.L(2.0f)) {
                    paint4.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                }
                canvas.save();
                canvas.translate(0.0f, org.telegram.messenger.g0.L(this.b ? 1.0f : 2.0f) + (org.telegram.messenger.g0.L(14.0f) / 2));
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        paint4.setAlpha((int) (this.f * this.e));
                    } else if (i10 == 3) {
                        paint4.setAlpha((int) ((1.0f - this.e) * this.f));
                    } else {
                        paint4.setAlpha(this.f);
                    }
                    float L3 = (org.telegram.messenger.g0.L(4.0f) * this.e) + (org.telegram.messenger.g0.L(4.0f) * i10);
                    float f12 = -L3;
                    rectF2.set(f12, f12, L3, L3);
                    canvas.drawArc(rectF2, -15.0f, 30.0f, false, paint4);
                }
                canvas.restore();
                if (this.d) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j11 = currentTimeMillis2 - this.c;
                    this.c = currentTimeMillis2;
                    if (j11 > 50) {
                        j11 = 50;
                    }
                    this.e = (j11 / 800.0f) + this.e;
                    while (true) {
                        float f13 = this.e;
                        if (f13 <= 1.0f) {
                            a();
                            break;
                        } else {
                            this.e = f13 - 1.0f;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.nu0
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
                return org.telegram.messenger.g0.L(18.0f);
            default:
                return org.telegram.messenger.g0.L(14.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return org.telegram.messenger.g0.L(20.0f);
            default:
                return org.telegram.messenger.g0.L(18.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.f = i3;
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i3 = this.a;
    }

    public ap(boolean z10) {
        this.a = 1;
        this.b = false;
        this.c = 0L;
        this.d = false;
        this.h = new RectF();
        this.f = org.telegram.messenger.hs.e4;
        if (z10) {
            Paint paint = new Paint(1);
            this.g = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    private final void f(int i3) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(boolean z10) {
    }
}
