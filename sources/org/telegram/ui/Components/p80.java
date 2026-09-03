package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p80 extends View {
    public static DecelerateInterpolator v;
    public static Paint w;
    public long a;
    public float b;
    public float c;
    public long d;
    public float e;
    public float f;
    public int h;
    public int n;
    public final RectF r;
    public org.telegram.ui.Components.voip.h s;

    public p80(Context context) {
        super(context);
        this.f = 1.0f;
        this.r = new RectF();
        if (v == null) {
            v = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            w = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            w.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    public final void a(float f10, boolean z4) {
        if (z4) {
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
        int i10 = this.h;
        RectF rectF = this.r;
        if (i10 != 0 && this.e != 1.0f) {
            w.setColor(i10);
            w.setAlpha((int) (this.f * 255.0f));
            getWidth();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, w);
        }
        w.setColor(this.n);
        w.setAlpha((int) (this.f * 255.0f));
        rectF.set(0.0f, 0.0f, getWidth() * this.e, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, w);
        if (this.f > 0.0f) {
            if (this.s == null) {
                org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(160, 0);
                this.s = hVar;
                hVar.k = false;
                hVar.n = 0.8f;
                hVar.m = 1.2f;
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
                        this.e = (v.getInterpolation(j11 / 300.0f) * f13) + f12;
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

    public void setBackColor(int i10) {
        this.h = i10;
    }

    public void setProgressColor(int i10) {
        this.n = i10;
    }
}
