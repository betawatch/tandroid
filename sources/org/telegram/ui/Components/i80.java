package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i80 extends View {
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

    public i80(Context context) {
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

    public final void a(float f9, boolean z10) {
        if (z10) {
            this.c = this.e;
        } else {
            this.e = f9;
            this.c = f9;
        }
        if (f9 != 1.0f) {
            this.f = 1.0f;
        }
        this.b = f9;
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
        float f9 = this.e;
        if (f9 != 1.0f) {
            float f10 = this.b;
            if (f9 != f10) {
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
                        this.e = (v.getInterpolation(j11 / 300.0f) * f12) + f11;
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
