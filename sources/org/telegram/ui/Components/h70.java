package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class h70 extends View {
    public static DecelerateInterpolator w;
    public static Paint x;
    public long a;
    public float b;
    public float c;
    public long d;
    public float e;
    public float f;
    public int h;
    public int n;
    public final RectF r;
    public org.telegram.ui.Components.voip.n s;

    public h70(Context context) {
        super(context);
        this.f = 1.0f;
        this.r = new RectF();
        if (w == null) {
            w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            x.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        }
    }

    public final void a(boolean z9, float f10) {
        if (z9) {
            this.c = this.e;
        } else {
            this.e = f10;
            this.c = f10;
        }
        if (f10 != 1.0f) {
            this.f = 1.0f;
        }
        this.b = f10;
        this.d = 0L;
        this.a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7 = this.h;
        RectF rectF = this.r;
        if (i7 != 0 && this.e != 1.0f) {
            x.setColor(i7);
            x.setAlpha((int) (this.f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, x);
        }
        x.setColor(this.n);
        x.setAlpha((int) (this.f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, x);
        if (this.f > 0.0f) {
            if (this.s == null) {
                org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n(org.telegram.messenger.qs.q2, 0);
                this.s = nVar;
                nVar.k = false;
                nVar.n = 0.8f;
                nVar.m = 1.2f;
            }
            this.s.f = getMeasuredWidth();
            this.s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.a;
        this.a = currentTimeMillis;
        float f10 = this.e;
        if (f10 != 1.0f) {
            float f11 = this.b;
            if (f10 != f11) {
                float f12 = this.c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.e = f11;
                        this.c = f11;
                        this.d = 0L;
                    } else {
                        this.e = (w.getInterpolation(j10 / 300.0f) * f13) + f12;
                    }
                }
                invalidate();
            }
        }
        float f14 = this.e;
        if (f14 < 1.0f || f14 != 1.0f) {
            return;
        }
        float f15 = this.f;
        if (f15 != 0.0f) {
            float f16 = f15 - (j3 / 200.0f);
            this.f = f16;
            if (f16 <= 0.0f) {
                this.f = 0.0f;
            }
            invalidate();
        }
    }

    public void setBackColor(int i7) {
        this.h = i7;
    }

    public void setProgressColor(int i7) {
        this.n = i7;
    }
}
