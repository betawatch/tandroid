// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ei2 extends Drawable implements Animatable {
    public static final LinearInterpolator h = new LinearInterpolator();
    public static final x84 n = new x84();
    public static final int[] r = {-16777216};
    public final ci2 a;
    public float b;
    public final Resources c;
    public final ValueAnimator d;
    public float e;
    public boolean f;

    public ei2(Context context) {
        context.getClass();
        this.c = context.getResources();
        ci2 ci2Var = new ci2();
        this.a = ci2Var;
        ci2Var.i = r;
        ci2Var.a(0);
        ci2Var.h = 2.5f;
        ci2Var.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ai2(this, ci2Var, (byte) 0));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(h);
        ofFloat.addListener(new bi2(this, ci2Var));
        this.d = ofFloat;
    }

    public static void b(float f, ci2 ci2Var) {
        if (f <= 0.75f) {
            ci2Var.u = ci2Var.i[ci2Var.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = ci2Var.i;
        int i = ci2Var.j;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        ci2Var.u = ((((i2 >> 24) & jn7.d4) + ((int) ((((i3 >> 24) & jn7.d4) - r1) * f2))) << 24) | ((((i2 >> 16) & jn7.d4) + ((int) ((((i3 >> 16) & jn7.d4) - r3) * f2))) << 16) | ((((i2 >> 8) & jn7.d4) + ((int) ((((i3 >> 8) & jn7.d4) - r4) * f2))) << 8) | ((i2 & jn7.d4) + ((int) (f2 * ((i3 & jn7.d4) - r2))));
    }

    public final void a(float f, ci2 ci2Var, boolean z) {
        float f2;
        if (this.f) {
            b(f, ci2Var);
            float floor = (float) (Math.floor(ci2Var.m / 0.8f) + 1.0d);
            float f3 = ci2Var.k;
            float f4 = ci2Var.l;
            ci2Var.e = (((f4 - 0.01f) - f3) * f) + f3;
            ci2Var.f = f4;
            float f5 = ci2Var.m;
            ci2Var.g = qd4.A(floor, f5, f, f5);
            return;
        }
        if (f != 1.0f || z) {
            float f6 = ci2Var.m;
            float f7 = ci2Var.k;
            x84 x84Var = n;
            if (f < 0.5f) {
                f2 = (x84Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f7;
            } else {
                float f8 = f7 + 0.79f;
                f7 = f8 - (((1.0f - x84Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f8;
            }
            float f9 = (0.20999998f * f) + f6;
            float f10 = (f + this.e) * 216.0f;
            ci2Var.e = f7;
            ci2Var.f = f2;
            ci2Var.g = f9;
            this.b = f10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        ci2 ci2Var = this.a;
        Paint paint = ci2Var.b;
        RectF rectF = ci2Var.a;
        float f = ci2Var.q;
        float f2 = (ci2Var.h / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((ci2Var.r * ci2Var.p) / 2.0f, ci2Var.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = ci2Var.e;
        float f4 = ci2Var.g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((ci2Var.f + f4) * 360.0f) - f5;
        paint.setColor(ci2Var.u);
        paint.setAlpha(ci2Var.t);
        float f7 = ci2Var.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, ci2Var.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        Paint paint2 = ci2Var.c;
        if (ci2Var.n) {
            Path path = ci2Var.o;
            if (path == null) {
                Path path2 = new Path();
                ci2Var.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (ci2Var.r * ci2Var.p) / 2.0f;
            ci2Var.o.moveTo(0.0f, 0.0f);
            ci2Var.o.lineTo(ci2Var.r * ci2Var.p, 0.0f);
            Path path3 = ci2Var.o;
            float f10 = ci2Var.r;
            float f11 = ci2Var.p;
            path3.lineTo((f10 * f11) / 2.0f, ci2Var.s * f11);
            ci2Var.o.offset((rectF.centerX() + min) - f9, (ci2Var.h / 2.0f) + rectF.centerY());
            ci2Var.o.close();
            paint2.setColor(ci2Var.u);
            paint2.setAlpha(ci2Var.t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(ci2Var.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.d;
        valueAnimator.cancel();
        ci2 ci2Var = this.a;
        float f = ci2Var.e;
        ci2Var.k = f;
        float f2 = ci2Var.f;
        ci2Var.l = f2;
        ci2Var.m = ci2Var.g;
        if (f2 != f) {
            this.f = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        ci2Var.a(0);
        ci2Var.k = 0.0f;
        ci2Var.l = 0.0f;
        ci2Var.m = 0.0f;
        ci2Var.e = 0.0f;
        ci2Var.f = 0.0f;
        ci2Var.g = 0.0f;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d.cancel();
        this.b = 0.0f;
        ci2 ci2Var = this.a;
        if (ci2Var.n) {
            ci2Var.n = false;
        }
        ci2Var.a(0);
        ci2Var.k = 0.0f;
        ci2Var.l = 0.0f;
        ci2Var.m = 0.0f;
        ci2Var.e = 0.0f;
        ci2Var.f = 0.0f;
        ci2Var.g = 0.0f;
        invalidateSelf();
    }
}
