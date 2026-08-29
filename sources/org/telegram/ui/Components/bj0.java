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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        float f9 = this.s;
        if (drawable != null) {
            if (this.r) {
                drawable.setAlpha((int) (this.j * 255.0f * f9));
            } else {
                drawable.setAlpha((int) (f9 * 255.0f));
            }
            this.n.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.n.draw(canvas);
        }
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            if (this.n != null) {
                drawable2.setAlpha((int) org.telegram.messenger.x3.y(1.0f, this.j, 255.0f, f9));
            } else {
                drawable2.setAlpha((int) (f9 * 255.0f));
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
                paint3.setAlpha((int) (this.j * 255.0f * f9));
            } else {
                paint3.setAlpha((int) (f9 * 255.0f));
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

    public final void b(float f9, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (!this.u) {
            canvas.drawArc(rectF, f9, f10, false, paint);
            return;
        }
        float height = rectF.height() * 0.32f;
        if (Math.abs(f10) == 360.0f) {
            canvas.drawRoundRect(rectF, height, height, paint);
            return;
        }
        float f11 = ((((int) f9) / 90) * 90) + 90;
        float f12 = (-199.0f) + f11;
        float f13 = ((f9 + f10) - f12) / 360.0f;
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
        pathMeasure.getSegment(((f9 - f12) / 360.0f) * length, length * f13, path2, true);
        path2.rLineTo(0.0f, 0.0f);
        canvas.drawPath(path2, paint);
        if (f13 > 1.0f) {
            b(f9 + 90.0f, f10 - 90.0f, canvas, paint, rectF);
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

    public final void e(float f9, boolean z10) {
        if (f9 != 1.0f && this.j != 0.0f && this.n != null) {
            this.j = 0.0f;
            this.n = null;
        }
        if (z10) {
            if (this.f > f9) {
                this.f = f9;
            }
            this.d = this.f;
        } else {
            this.f = f9;
            this.d = f9;
        }
        this.c = f9;
        this.e = 0L;
        c();
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.g.set(i10, i11, i12, i13);
    }

    public final void g(boolean z10) {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.a;
        this.a = currentTimeMillis;
        if (!z10) {
            if (this.n != null) {
                float f9 = this.j - (j10 / 200.0f);
                this.j = f9;
                if (f9 <= 0.0f) {
                    this.j = 0.0f;
                    this.n = null;
                }
                c();
                return;
            }
            return;
        }
        if (this.f != 1.0f) {
            this.b = ((360 * j10) / this.v) + this.b;
            float f10 = this.c;
            float f11 = this.d;
            float f12 = f10 - f11;
            if (f12 > 0.0f) {
                long j11 = this.e + j10;
                this.e = j11;
                if (j11 >= 300) {
                    this.f = f10;
                    this.d = f10;
                    this.e = 0L;
                } else {
                    this.f = (A.getInterpolation(j11 / 300.0f) * f12) + f11;
                }
            }
            c();
        }
        if (this.f < 1.0f || this.n == null) {
            return;
        }
        float f13 = this.j - (j10 / 200.0f);
        this.j = f13;
        if (f13 <= 0.0f) {
            this.j = 0.0f;
            this.n = null;
        }
        c();
    }
}
