package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ap extends pu0 {
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

    @Override // org.telegram.ui.Components.pu0
    public final void b(int i7) {
        switch (this.a) {
            case 0:
                if (this.f != i7) {
                    ((Paint) this.h).setColor(i7);
                    this.g.setColor(i7);
                }
                this.f = i7;
                break;
            default:
                Paint paint = this.g;
                if (paint != null) {
                    paint.setColor(i7);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.pu0
    public final void c(boolean z9) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b = z9;
                break;
        }
    }

    @Override // org.telegram.ui.Components.pu0
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
                float interpolation = wq.i.getInterpolation(min < 0.3f ? min / 0.3f : 1.0f);
                wq wqVar = wq.g;
                float interpolation2 = wqVar.getInterpolation(min < 0.3f ? 0.0f : (min - 0.3f) / 0.7f);
                if (this.d) {
                    L = com.google.android.recaptcha.internal.a.z(1.0f, interpolation, org.telegram.messenger.g0.L(7.0f) - org.telegram.messenger.g0.L(2.1f), org.telegram.messenger.g0.L(2.1f) * interpolation);
                    N = (1.0f - wqVar.getInterpolation(this.e / 2.0f)) * org.telegram.messenger.g0.N(1.5f);
                } else {
                    L = ((org.telegram.messenger.g0.L(7.0f) - org.telegram.messenger.g0.L(2.1f)) * interpolation) + ((1.0f - interpolation) * org.telegram.messenger.g0.L(2.1f));
                    N = org.telegram.messenger.g0.N(1.5f) * wq.h.getInterpolation(this.e / 2.0f);
                }
                float f10 = 11.0f;
                float L2 = org.telegram.messenger.g0.L(11.0f) / 2.0f;
                float N2 = org.telegram.messenger.g0.N(2.0f);
                float N3 = (org.telegram.messenger.g0.N(0.5f) * interpolation) - (org.telegram.messenger.g0.N(0.5f) * interpolation2);
                Paint paint = this.g;
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.m6.d2;
                }
                Paint paint2 = (Paint) this.h;
                if (paint2 == null) {
                    paint2 = org.telegram.ui.ActionBar.m6.c2;
                }
                if (paint.getStrokeWidth() != org.telegram.messenger.g0.L(0.8f)) {
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(0.8f));
                }
                int i7 = 0;
                while (i7 < 2) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.N(0.2f) + (paint.getStrokeWidth() / 2.0f) + N + (org.telegram.messenger.g0.L(9.0f) * i7) + getBounds().left, org.telegram.messenger.g0.N(2.0f) + (paint.getStrokeWidth() / 2.0f) + getBounds().top);
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, N3, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(r16) - N3);
                    canvas.drawOval(rectF, paint);
                    canvas.drawCircle(L, L2, N2, paint2);
                    canvas.restore();
                    i7++;
                    f10 = f10;
                }
                if (this.b) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = currentTimeMillis - this.c;
                    this.c = currentTimeMillis;
                    if (j3 > 50) {
                        j3 = 50;
                    }
                    float f11 = (j3 / 500.0f) + this.e;
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
                    paint3 = org.telegram.ui.ActionBar.m6.d2;
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
                    long j10 = currentTimeMillis2 - this.c;
                    this.c = currentTimeMillis2;
                    if (j10 > 50) {
                        j10 = 50;
                    }
                    this.e = (j10 / 800.0f) + this.e;
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

    @Override // org.telegram.ui.Components.pu0
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
    public final void setAlpha(int i7) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.f = i7;
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.a;
    }

    public ap(boolean z9) {
        this.a = 1;
        this.b = false;
        this.c = 0L;
        this.d = false;
        this.h = new RectF();
        this.f = org.telegram.messenger.qs.e4;
        if (z9) {
            Paint paint = new Paint(1);
            this.g = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    private final void f(int i7) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(boolean z9) {
    }
}
