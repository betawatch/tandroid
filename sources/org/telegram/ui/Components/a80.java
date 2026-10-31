package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a80 extends View {
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
    public org.telegram.ui.Components.voip.g s;

    public a80(Context context) {
        super(context);
        this.f = 1.0f;
        this.r = new RectF();
        if (w == null) {
            w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            x.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        }
    }

    public final void a(boolean z10, float f7) {
        if (z10) {
            this.c = this.e;
        } else {
            this.e = f7;
            this.c = f7;
        }
        if (f7 != 1.0f) {
            this.f = 1.0f;
        }
        this.b = f7;
        this.d = 0L;
        this.a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = this.h;
        RectF rectF = this.r;
        if (i10 != 0 && this.e != 1.0f) {
            x.setColor(i10);
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
                org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g(org.telegram.messenger.zs.q2, 0);
                this.s = gVar;
                gVar.k = false;
                gVar.n = 0.8f;
                gVar.m = 1.2f;
            }
            this.s.f = getMeasuredWidth();
            this.s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.a;
        this.a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.b;
            if (f7 != f10) {
                float f11 = this.c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.e = f10;
                        this.c = f10;
                        this.d = 0L;
                    } else {
                        this.e = (w.getInterpolation(j11 / 300.0f) * f12) + f11;
                    }
                }
                invalidate();
            }
        }
        float f13 = this.e;
        if (f13 < 1.0f || f13 != 1.0f) {
            return;
        }
        float f14 = this.f;
        if (f14 != 0.0f) {
            float f15 = f14 - (j10 / 200.0f);
            this.f = f15;
            if (f15 <= 0.0f) {
                this.f = 0.0f;
            }
            invalidate();
        }
    }

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.n = i10;
    }
}
