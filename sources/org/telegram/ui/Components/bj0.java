package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class bj0 {
    public static DecelerateInterpolator A;
    public final View i;
    public boolean k;
    public boolean l;
    public Drawable m;
    public Drawable n;
    public final Paint p;
    public boolean u;
    public long a = 0;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;
    public long e = 0;
    public float f = 0.0f;
    public final RectF g = new RectF();
    public final RectF h = new RectF();
    public float j = 1.0f;
    public int o = -1;
    public int q = AndroidUtilities.dp(4.0f);
    public final boolean r = true;
    public final float s = 1.0f;
    public Paint t = null;
    public float v = 3000.0f;
    public final Path w = new Path();
    public final Matrix x = new Matrix();
    public final PathMeasure y = new PathMeasure();
    public final Path z = new Path();

    public bj0(View view) {
        if (A == null) {
            A = new DecelerateInterpolator();
        }
        Paint paint = new Paint(1);
        this.p = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        new Paint(1);
        this.i = view;
    }

    public final void a(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.n;
        RectF rectF = this.g;
        float f7 = this.s;
        if (drawable != null) {
            if (this.r) {
                drawable.setAlpha((int) (this.j * 255.0f * f7));
            } else {
                drawable.setAlpha((int) (f7 * 255.0f));
            }
            this.n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.n.draw(canvas);
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            if (this.n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.w1.A(1.0f, this.j, 255.0f, f7));
            } else {
                drawable2.setAlpha((int) (f7 * 255.0f));
            }
            this.m.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.m.draw(canvas);
        }
        if (!this.k && !this.l) {
            g(false);
            return;
        }
        Paint paint2 = this.t;
        if (paint2 != null) {
            paint = paint2;
        } else {
            int i10 = this.o;
            Paint paint3 = this.p;
            paint3.setColor(i10);
            if (this.l) {
                paint3.setAlpha((int) (this.j * 255.0f * f7));
            } else {
                paint3.setAlpha((int) (f7 * 255.0f));
            }
            paint = paint3;
        }
        float f10 = rectF.left;
        float f11 = this.q;
        float f12 = rectF.top + f11;
        float f13 = rectF.right - f11;
        float f14 = rectF.bottom - f11;
        RectF rectF2 = this.h;
        rectF2.set(f10 + f11, f12, f13, f14);
        b(this.b - 90.0f, Math.max(4.0f, this.f * 360.0f), canvas, paint, rectF2);
        g(true);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (!this.u) {
            canvas.drawArc(rectF, f7, f10, false, paint);
            return;
        }
        float height = rectF.height() * 0.32f;
        if (Math.abs(f10) == 360.0f) {
            canvas.drawRoundRect(rectF, height, height, paint);
            return;
        }
        float f11 = ((((int) f7) / 90) * 90) + 90;
        float f12 = (-199.0f) + f11;
        float f13 = ((f7 + f10) - f12) / 360.0f;
        Path path = this.w;
        path.rewind();
        path.addRoundRect(rectF, height, height, Path.Direction.CW);
        Matrix matrix = this.x;
        matrix.reset();
        matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
        path.transform(matrix);
        PathMeasure pathMeasure = this.y;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        Path path2 = this.z;
        path2.reset();
        pathMeasure.getSegment(((f7 - f12) / 360.0f) * length, length * f13, path2, true);
        path2.rLineTo(0.0f, 0.0f);
        canvas.drawPath(path2, paint);
        if (f13 > 1.0f) {
            b(f7 + 90.0f, f10 - 90.0f, canvas, paint, rectF);
        }
    }

    public final void c() {
        int dp = AndroidUtilities.dp(2.0f);
        RectF rectF = this.g;
        int i10 = ((int) rectF.left) - dp;
        int i11 = ((int) rectF.top) - dp;
        int i12 = dp * 2;
        this.i.invalidate(i10, i11, ((int) rectF.right) + i12, ((int) rectF.bottom) + i12);
    }

    public final void d(Drawable drawable, boolean z10, boolean z11) {
        Drawable drawable2;
        this.a = System.currentTimeMillis();
        if (!z11 || (drawable2 = this.m) == drawable) {
            this.n = null;
            this.l = false;
        } else {
            this.n = drawable2;
            this.l = this.k;
            this.j = 1.0f;
            e(1.0f, z11);
        }
        this.k = z10;
        this.m = drawable;
        if (z11) {
            c();
        } else {
            this.i.invalidate();
        }
    }

    public final void e(float f7, boolean z10) {
        if (f7 != 1.0f && this.j != 0.0f && this.n != null) {
            this.j = 0.0f;
            this.n = null;
        }
        if (z10) {
            if (this.f > f7) {
                this.f = f7;
            }
            this.d = this.f;
        } else {
            this.f = f7;
            this.d = f7;
        }
        this.c = f7;
        this.e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.a;
        this.a = currentTimeMillis;
        if (!z10) {
            if (this.n != null) {
                float f7 = this.j - (j3 / 200.0f);
                this.j = f7;
                if (f7 <= 0.0f) {
                    this.j = 0.0f;
                    this.n = null;
                }
                c();
                return;
            }
            return;
        }
        if (this.f != 1.0f) {
            this.b = ((360 * j3) / this.v) + this.b;
            float f10 = this.c;
            float f11 = this.d;
            float f12 = f10 - f11;
            if (f12 > 0.0f) {
                long j10 = this.e + j3;
                this.e = j10;
                if (j10 >= 300) {
                    this.f = f10;
                    this.d = f10;
                    this.e = 0L;
                } else {
                    this.f = (A.getInterpolation(j10 / 300.0f) * f12) + f11;
                }
            }
            c();
        }
        if (this.f < 1.0f || this.n == null) {
            return;
        }
        float f13 = this.j - (j3 / 200.0f);
        this.j = f13;
        if (f13 <= 0.0f) {
            this.j = 0.0f;
            this.n = null;
        }
        c();
    }
}
