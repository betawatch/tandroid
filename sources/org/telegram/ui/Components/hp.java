package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hp extends tv0 {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public boolean d;
    public float e;
    public int f;
    public final Paint g;
    public final Object h;

    public hp() {
        this.a = 0;
        this.c = 0L;
        this.b = false;
        this.d = true;
        Paint paint = new Paint(1);
        this.g = paint;
        this.h = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.2f));
    }

    @Override // org.telegram.ui.Components.tv0
    public final void b(int i9) {
        switch (this.a) {
            case 0:
                if (this.f != i9) {
                    ((Paint) this.h).setColor(i9);
                    this.g.setColor(i9);
                }
                this.f = i9;
                break;
            default:
                Paint paint = this.g;
                if (paint != null) {
                    paint.setColor(i9);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public final void c(boolean z10) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.b = z10;
                break;
        }
    }

    @Override // org.telegram.ui.Components.tv0
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
        float dp;
        float dpf2;
        switch (this.a) {
            case 0:
                float min = Math.min(this.e, 1.0f);
                float interpolation = gr.i.getInterpolation(min < 0.3f ? min / 0.3f : 1.0f);
                gr grVar = gr.g;
                float interpolation2 = grVar.getInterpolation(min < 0.3f ? 0.0f : (min - 0.3f) / 0.7f);
                if (this.d) {
                    dp = e2.c.z(1.0f, interpolation, AndroidUtilities.dp(7.0f) - AndroidUtilities.dp(2.1f), AndroidUtilities.dp(2.1f) * interpolation);
                    dpf2 = (1.0f - grVar.getInterpolation(this.e / 2.0f)) * AndroidUtilities.dpf2(1.5f);
                } else {
                    dp = ((AndroidUtilities.dp(7.0f) - AndroidUtilities.dp(2.1f)) * interpolation) + ((1.0f - interpolation) * AndroidUtilities.dp(2.1f));
                    dpf2 = AndroidUtilities.dpf2(1.5f) * gr.h.getInterpolation(this.e / 2.0f);
                }
                float dp2 = AndroidUtilities.dp(11.0f) / 2.0f;
                float dpf22 = AndroidUtilities.dpf2(2.0f);
                float dpf23 = (AndroidUtilities.dpf2(0.5f) * interpolation) - (AndroidUtilities.dpf2(0.5f) * interpolation2);
                Paint paint = this.g;
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.f6.d2;
                }
                Paint paint2 = (Paint) this.h;
                if (paint2 == null) {
                    paint2 = org.telegram.ui.ActionBar.f6.c2;
                }
                if (paint.getStrokeWidth() != AndroidUtilities.dp(0.8f)) {
                    paint.setStrokeWidth(AndroidUtilities.dp(0.8f));
                }
                for (int i9 = 0; i9 < 2; i9++) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dpf2(0.2f) + (paint.getStrokeWidth() / 2.0f) + dpf2 + (AndroidUtilities.dp(9.0f) * i9) + getBounds().left, AndroidUtilities.dpf2(2.0f) + (paint.getStrokeWidth() / 2.0f) + getBounds().top);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, dpf23, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(11.0f) - dpf23);
                    canvas.drawOval(rectF, paint);
                    canvas.drawCircle(dp, dp2, dpf22, paint2);
                    canvas.restore();
                }
                if (this.b) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = currentTimeMillis - this.c;
                    this.c = currentTimeMillis;
                    if (j10 > 50) {
                        j10 = 50;
                    }
                    float f10 = (j10 / 500.0f) + this.e;
                    this.e = f10;
                    if (f10 >= 2.0f) {
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
                    paint3 = org.telegram.ui.ActionBar.f6.d2;
                }
                Paint paint4 = paint3;
                if (paint4.getStrokeWidth() != AndroidUtilities.dp(2.0f)) {
                    paint4.setStrokeWidth(AndroidUtilities.dp(2.0f));
                }
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(this.b ? 1.0f : 2.0f) + (AndroidUtilities.dp(14.0f) / 2));
                for (int i10 = 0; i10 < 4; i10++) {
                    if (i10 == 0) {
                        paint4.setAlpha((int) (this.f * this.e));
                    } else if (i10 == 3) {
                        paint4.setAlpha((int) ((1.0f - this.e) * this.f));
                    } else {
                        paint4.setAlpha(this.f);
                    }
                    float dp3 = (AndroidUtilities.dp(4.0f) * this.e) + (AndroidUtilities.dp(4.0f) * i10);
                    float f11 = -dp3;
                    rectF2.set(f11, f11, dp3, dp3);
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
                        float f12 = this.e;
                        if (f12 <= 1.0f) {
                            a();
                            break;
                        } else {
                            this.e = f12 - 1.0f;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.tv0
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
                return AndroidUtilities.dp(18.0f);
            default:
                return AndroidUtilities.dp(14.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 0:
                return AndroidUtilities.dp(20.0f);
            default:
                return AndroidUtilities.dp(18.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.f = i9;
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i9 = this.a;
    }

    public hp(boolean z10) {
        this.a = 1;
        this.b = false;
        this.c = 0L;
        this.d = false;
        this.h = new RectF();
        this.f = 255;
        if (z10) {
            Paint paint = new Paint(1);
            this.g = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    private final void f(int i9) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(boolean z10) {
    }
}
