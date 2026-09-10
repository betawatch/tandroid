package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class w80 extends View {
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

    public w80(Context context) {
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

    public final void a(float f7, boolean z10) {
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
        long j3 = currentTimeMillis - this.a;
        this.a = currentTimeMillis;
        float f7 = this.e;
        if (f7 != 1.0f) {
            float f10 = this.b;
            if (f7 != f10) {
                float f11 = this.c;
                float f12 = f10 - f11;
                if (f12 > 0.0f) {
                    long j10 = this.d + j3;
                    this.d = j10;
                    if (j10 >= 300) {
                        this.e = f10;
                        this.c = f10;
                        this.d = 0L;
                    } else {
                        this.e = (v.getInterpolation(j10 / 300.0f) * f12) + f11;
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
            float f15 = f14 - (j3 / 200.0f);
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
