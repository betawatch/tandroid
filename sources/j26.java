// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class j26 extends View {
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
    public wd1 s;

    public j26(Context context) {
        super(context);
        this.f = 1.0f;
        this.r = new RectF();
        if (w == null) {
            w = new DecelerateInterpolator();
            Paint paint = new Paint(1);
            x = paint;
            paint.setStrokeCap(Paint.Cap.ROUND);
            x.setStrokeWidth(gl.L(2.0f));
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
            wd1 wd1Var = this.s;
            if (wd1Var == null) {
                wd1Var = new wd1(kk7.p2, 0);
                this.s = wd1Var;
                wd1Var.k = false;
                wd1Var.n = 0.8f;
                wd1Var.m = 1.2f;
            }
            wd1Var.f = getMeasuredWidth();
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
