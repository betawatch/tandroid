package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d70 extends View {
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

    public d70(Context context) {
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

    public final void a(boolean z10, float f10) {
        if (z10) {
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
        int i3 = this.h;
        RectF rectF = this.r;
        if (i3 != 0 && this.e != 1.0f) {
            x.setColor(i3);
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
                org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g(org.telegram.messenger.hs.q2, 0);
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
        float f10 = this.e;
        if (f10 != 1.0f) {
            float f11 = this.b;
            if (f10 != f11) {
                float f12 = this.c;
                float f13 = f11 - f12;
                if (f13 > 0.0f) {
                    long j11 = this.d + j10;
                    this.d = j11;
                    if (j11 >= 300) {
                        this.e = f11;
                        this.c = f11;
                        this.d = 0L;
                    } else {
                        this.e = (w.getInterpolation(j11 / 300.0f) * f13) + f12;
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
            float f16 = f15 - (j10 / 200.0f);
            this.f = f16;
            if (f16 <= 0.0f) {
                this.f = 0.0f;
            }
            invalidate();
        }
    }

    public void setBackColor(int i3) {
        this.h = i3;
    }

    public void setProgressColor(int i3) {
        this.n = i3;
    }
}
