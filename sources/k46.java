// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k46 extends View {
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
    public ef1 s;

    public k46(Context context) {
        super(context);
        this.f = 1.0f;
        this.r = new RectF();
        if (w == null) {
            w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            x.setStrokeWidth(gm.L(2.0f));
        }
    }

    public final void a(boolean z, float f) {
        if (z) {
            this.c = this.e;
        } else {
            this.e = f;
            this.c = f;
        }
        if (f != 1.0f) {
            this.f = 1.0f;
        }
        this.b = f;
        this.d = 0L;
        this.a = System.currentTimeMillis();
        invalidate();
    }

    public float getCurrentProgress() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.h;
        RectF rectF = this.r;
        if (i != 0 && this.e != 1.0f) {
            x.setColor(i);
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
            ef1 ef1Var = this.s;
            if (ef1Var == null) {
                ef1Var = new ef1(nm7.p2, 0);
                this.s = ef1Var;
                ef1Var.k = false;
                ef1Var.n = 0.8f;
                ef1Var.m = 1.2f;
            }
            ef1Var.f = getMeasuredWidth();
            this.s.a(getHeight() / 2.0f, canvas, rectF, null);
            invalidate();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.a;
        this.a = currentTimeMillis;
        float f = this.e;
        if (f != 1.0f) {
            float f2 = this.b;
            if (f != f2) {
                float f3 = this.c;
                float f4 = f2 - f3;
                if (f4 > 0.0f) {
                    long j2 = this.d + j;
                    this.d = j2;
                    if (j2 >= 300) {
                        this.e = f2;
                        this.c = f2;
                        this.d = 0L;
                    } else {
                        this.e = (w.getInterpolation(j2 / 300.0f) * f4) + f3;
                    }
                }
                invalidate();
            }
        }
        float f5 = this.e;
        if (f5 < 1.0f || f5 != 1.0f) {
            return;
        }
        float f6 = this.f;
        if (f6 != 0.0f) {
            float f7 = f6 - (j / 200.0f);
            this.f = f7;
            if (f7 <= 0.0f) {
                this.f = 0.0f;
            }
            invalidate();
        }
    }

    public void setBackColor(int i) {
        this.h = i;
    }

    public void setProgressColor(int i) {
        this.n = i;
    }
}
