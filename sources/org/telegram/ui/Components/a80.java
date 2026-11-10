package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class a80 extends Drawable {
    public Rect A;
    public final float[] B;
    public final RectF C;
    public boolean D;
    public int E;
    public Paint F;
    public LinearGradient G;
    public Matrix H;
    public int I;
    public Paint J;
    public LinearGradient K;
    public Matrix L;
    public final org.telegram.ui.ActionBar.h6 a;
    public long b;
    public long c;
    public LinearGradient d;
    public LinearGradient e;
    public final Matrix f;
    public final Matrix g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public Integer o;
    public Integer p;
    public Integer q;
    public Integer r;
    public int s;
    public float t;
    public float u;
    public long v;
    public final Paint w;
    public final Paint x;
    public Path y;
    public final Path z;

    public a80(org.telegram.ui.ActionBar.h6 h6Var) {
        this();
        this.a = h6Var;
    }

    public final void a() {
        if (c() || d()) {
            return;
        }
        this.c = SystemClock.elapsedRealtime();
    }

    public void b(Canvas canvas, Path path) {
        canvas.drawPath(path, this.w);
        if (this.n) {
            canvas.drawPath(path, this.x);
        }
    }

    public final boolean c() {
        return this.c > 0 && ((float) (SystemClock.elapsedRealtime() - this.c)) >= 320.0f;
    }

    public final boolean d() {
        return this.c > 0 && ((float) (SystemClock.elapsedRealtime() - this.c)) < 320.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        long j3;
        float f10;
        float f11;
        boolean z9;
        Path path;
        boolean z10;
        if (c()) {
            return;
        }
        Rect bounds = getBounds();
        Paint paint = this.w;
        if (paint.getAlpha() <= 0) {
            return;
        }
        int width = bounds.width();
        if (width <= 0) {
            width = org.telegram.messenger.g0.L(200.0f);
        }
        int min = (int) (Math.min(org.telegram.messenger.g0.L(400.0f), width) * this.t);
        Integer num = this.o;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.m6.w0(this.l, h6Var);
        Integer num2 = this.p;
        int intValue2 = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.m6.w0(this.m, h6Var);
        Integer num3 = this.q;
        int intValue3 = num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.m6.w0(this.l, h6Var);
        Integer num4 = this.r;
        int intValue4 = num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.m6.w0(this.m, h6Var);
        LinearGradient linearGradient = this.d;
        Matrix matrix = this.g;
        Matrix matrix2 = this.f;
        Paint paint2 = this.x;
        if (linearGradient == null || min != this.s || intValue != this.h || intValue2 != this.i || intValue3 != this.j || intValue4 != this.k) {
            this.s = min;
            this.h = intValue;
            this.i = intValue2;
            float f12 = this.s;
            int i7 = this.h;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{i7, this.i, i7}, new float[]{0.0f, 0.67f, 1.0f}, tileMode);
            this.d = linearGradient2;
            linearGradient2.setLocalMatrix(matrix2);
            paint.setShader(this.d);
            this.j = intValue3;
            this.k = intValue4;
            float f13 = this.s;
            int i10 = this.j;
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, f13, 0.0f, new int[]{i10, i10, this.k, i10}, new float[]{0.0f, 0.4f, 0.67f, 1.0f}, tileMode);
            this.e = linearGradient3;
            linearGradient3.setLocalMatrix(matrix);
            paint2.setShader(this.e);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b < 0) {
            this.b = elapsedRealtime;
        }
        long j10 = this.v;
        if (j10 > 0) {
            j3 = 0;
            f11 = Math.min(1.0f, (elapsedRealtime - this.b) / j10) * this.s;
            f10 = 200.0f;
        } else {
            j3 = 0;
            f10 = 200.0f;
            float pow = ((float) Math.pow((((elapsedRealtime - this.b) / 2000.0f) * this.u) / 4.0f, 0.8500000238418579d)) * 4.0f * org.telegram.messenger.g0.p;
            float f14 = this.s;
            f11 = (pow * f14) % f14;
        }
        float f15 = (elapsedRealtime - this.b) / 550.0f;
        float f16 = f10;
        float interpolation = this.c > j3 ? 1.0f - wq.g.getInterpolation(Math.min(1.0f, (elapsedRealtime - r8) / 320.0f)) : 0.0f;
        boolean d = d();
        boolean z11 = false;
        RectF rectF = this.C;
        if (d) {
            int max = Math.max(org.telegram.messenger.g0.L(f16), bounds.width() / 3);
            if (interpolation < 1.0f) {
                if (this.J == null) {
                    this.J = new Paint(1);
                    this.I = max;
                    this.K = new LinearGradient(0.0f, 0.0f, max, 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Matrix matrix3 = new Matrix();
                    this.L = matrix3;
                    this.K.setLocalMatrix(matrix3);
                    this.J.setShader(this.K);
                    this.J.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                } else if (this.I != max) {
                    this.I = max;
                    LinearGradient linearGradient4 = new LinearGradient(0.0f, 0.0f, max, 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.K = linearGradient4;
                    linearGradient4.setLocalMatrix(this.L);
                    this.J.setShader(this.K);
                }
                rectF.set(bounds);
                rectF.inset(-paint2.getStrokeWidth(), -paint2.getStrokeWidth());
                canvas.saveLayerAlpha(rectF, org.telegram.messenger.qs.e4, 31);
                z9 = true;
                if (this.D) {
                    int max2 = Math.max(org.telegram.messenger.g0.L(f16), bounds.width() / 3);
                    if (f15 < 1.0f) {
                        if (this.F == null) {
                            z10 = true;
                            this.F = new Paint(1);
                            this.E = max2;
                            this.G = new LinearGradient(0.0f, 0.0f, max2, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            Matrix matrix4 = new Matrix();
                            this.H = matrix4;
                            this.G.setLocalMatrix(matrix4);
                            this.F.setShader(this.G);
                            this.F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        } else {
                            z10 = true;
                            if (this.E != max2) {
                                this.E = max2;
                                LinearGradient linearGradient5 = new LinearGradient(0.0f, 0.0f, max2, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                                this.G = linearGradient5;
                                linearGradient5.setLocalMatrix(this.H);
                                this.F.setShader(this.G);
                            }
                        }
                        rectF.set(bounds);
                        rectF.inset(-paint2.getStrokeWidth(), -paint2.getStrokeWidth());
                        canvas.saveLayerAlpha(rectF, org.telegram.messenger.qs.e4, 31);
                        z11 = z10;
                    }
                }
                matrix2.setTranslate(f11, 0.0f);
                this.d.setLocalMatrix(matrix2);
                matrix.setTranslate(f11, 0.0f);
                this.e.setLocalMatrix(matrix);
                path = this.y;
                if (path == null) {
                    Rect rect = this.A;
                    Path path2 = this.z;
                    if (rect == null || !rect.equals(bounds)) {
                        path2.rewind();
                        this.A = bounds;
                        rectF.set(bounds);
                        path2.addRoundRect(rectF, this.B, Path.Direction.CW);
                    }
                    path = path2;
                }
                b(canvas, path);
                if (z11) {
                    canvas.save();
                    int width2 = bounds.width() + this.E;
                    this.H.setTranslate(bounds.left + ((f15 * (width2 + r2)) - this.E), 0.0f);
                    this.G.setLocalMatrix(this.H);
                    int strokeWidth = (int) paint2.getStrokeWidth();
                    canvas.drawRect(bounds.left - strokeWidth, bounds.top - strokeWidth, bounds.right + strokeWidth, bounds.bottom + strokeWidth, this.F);
                    canvas.restore();
                    canvas.restore();
                }
                if (z9) {
                    canvas.save();
                    int width3 = bounds.width() + this.I;
                    this.L.setTranslate(bounds.right - ((interpolation * (width3 + r1)) - this.I), 0.0f);
                    this.K.setLocalMatrix(this.L);
                    int strokeWidth2 = (int) paint2.getStrokeWidth();
                    canvas.drawRect(bounds.left - strokeWidth2, bounds.top - strokeWidth2, bounds.right + strokeWidth2, bounds.bottom + strokeWidth2, this.J);
                    canvas.restore();
                    canvas.restore();
                }
                if (c()) {
                    invalidateSelf();
                    return;
                }
                return;
            }
        }
        z9 = false;
        if (this.D) {
        }
        matrix2.setTranslate(f11, 0.0f);
        this.d.setLocalMatrix(matrix2);
        matrix.setTranslate(f11, 0.0f);
        this.e.setLocalMatrix(matrix);
        path = this.y;
        if (path == null) {
        }
        b(canvas, path);
        if (z11) {
        }
        if (z9) {
        }
        if (c()) {
        }
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i7, int i10) {
        this.o = Integer.valueOf(i7);
        this.p = Integer.valueOf(i10);
        this.n = false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        this.o = Integer.valueOf(i7);
        this.p = Integer.valueOf(i10);
        this.n = true;
        this.q = Integer.valueOf(i11);
        this.r = Integer.valueOf(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.t = 2.0f;
    }

    public final void i(float f10) {
        if (this.y != null) {
            this.w.setPathEffect(new CornerPathEffect(f10));
            this.x.setPathEffect(new CornerPathEffect(f10));
            return;
        }
        float[] fArr = this.B;
        boolean z9 = (fArr[0] == f10 && fArr[2] == f10 && fArr[4] == f10 && fArr[6] == f10) ? false : true;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[7] = f10;
        fArr[6] = f10;
        if (this.A == null || !z9) {
            return;
        }
        Path path = this.z;
        path.rewind();
        Rect rect = this.A;
        RectF rectF = this.C;
        rectF.set(rect);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    public final void j(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return;
        }
        boolean z9 = false;
        for (int i7 = 0; i7 < 8; i7++) {
            float[] fArr2 = this.B;
            float f10 = fArr2[i7];
            float f11 = fArr[i7];
            if (f10 != f11) {
                fArr2[i7] = f11;
                z9 = true;
            }
        }
        if (this.A == null || !z9) {
            return;
        }
        Path path = this.z;
        path.rewind();
        Rect rect = this.A;
        RectF rectF = this.C;
        rectF.set(rect);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    public final void k(float f10) {
        i(org.telegram.messenger.g0.L(f10));
    }

    public final void l() {
        Path path = this.y;
        if (path != null) {
            RectF rectF = org.telegram.messenger.g0.P;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.w.setAlpha(i7);
        this.x.setAlpha(i7);
        if (i7 > 0) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.w.setColorFilter(colorFilter);
    }

    public a80() {
        this.b = -1L;
        this.c = -1L;
        this.f = new Matrix();
        this.g = new Matrix();
        this.l = org.telegram.ui.ActionBar.m6.h5;
        this.m = org.telegram.ui.ActionBar.m6.i5;
        this.t = 1.0f;
        this.u = 1.0f;
        this.w = new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        this.z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.p > 2.0f ? 2.0f : 1.0f);
    }
}
