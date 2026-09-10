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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q90 extends Drawable {
    public final float[] A;
    public final RectF B;
    public boolean C;
    public int D;
    public Paint E;
    public LinearGradient F;
    public Matrix G;
    public int H;
    public Paint I;
    public LinearGradient J;
    public Matrix K;
    public final org.telegram.ui.ActionBar.f6 a;
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
    public final Paint v;
    public final Paint w;
    public Path x;
    public final Path y;
    public Rect z;

    public q90(org.telegram.ui.ActionBar.f6 f6Var) {
        this();
        this.a = f6Var;
    }

    public final void a() {
        if (b() || c()) {
            return;
        }
        this.c = SystemClock.elapsedRealtime();
    }

    public final boolean b() {
        return this.c > 0 && ((float) (SystemClock.elapsedRealtime() - this.c)) >= 320.0f;
    }

    public final boolean c() {
        return this.c > 0 && ((float) (SystemClock.elapsedRealtime() - this.c)) < 320.0f;
    }

    public final void d(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.z = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        boolean z10;
        Path path;
        if (b()) {
            return;
        }
        Rect bounds = getBounds();
        Paint paint = this.v;
        if (paint.getAlpha() <= 0) {
            return;
        }
        int width = bounds.width();
        if (width <= 0) {
            width = AndroidUtilities.dp(200.0f);
        }
        int min = (int) (Math.min(AndroidUtilities.dp(400.0f), width) * this.t);
        Integer num = this.o;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.j6.v0(this.l, f6Var);
        Integer num2 = this.p;
        int intValue2 = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.j6.v0(this.m, f6Var);
        Integer num3 = this.q;
        int intValue3 = num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.j6.v0(this.l, f6Var);
        Integer num4 = this.r;
        int intValue4 = num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.j6.v0(this.m, f6Var);
        LinearGradient linearGradient = this.d;
        Matrix matrix = this.g;
        Matrix matrix2 = this.f;
        Paint paint2 = this.w;
        if (linearGradient == null || min != this.s || intValue != this.h || intValue2 != this.i || intValue3 != this.j || intValue4 != this.k) {
            this.s = min;
            this.h = intValue;
            this.i = intValue2;
            float f7 = this.s;
            int i10 = this.h;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, f7, 0.0f, new int[]{i10, this.i, i10}, new float[]{0.0f, 0.67f, 1.0f}, tileMode);
            this.d = linearGradient2;
            linearGradient2.setLocalMatrix(matrix2);
            paint.setShader(this.d);
            this.j = intValue3;
            this.k = intValue4;
            float f10 = this.s;
            int i11 = this.j;
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, f10, 0.0f, new int[]{i11, i11, this.k, i11}, new float[]{0.0f, 0.4f, 0.67f, 1.0f}, tileMode);
            this.e = linearGradient3;
            linearGradient3.setLocalMatrix(matrix);
            paint2.setShader(this.e);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b < 0) {
            this.b = elapsedRealtime;
        }
        float pow = ((float) Math.pow((((elapsedRealtime - this.b) / 2000.0f) * this.u) / 4.0f, 0.8500000238418579d)) * 4.0f * AndroidUtilities.density;
        float f11 = this.s;
        float f12 = (pow * f11) % f11;
        float f13 = (elapsedRealtime - this.b) / 550.0f;
        float interpolation = this.c > 0 ? 1.0f - wr.g.getInterpolation(Math.min(1.0f, (elapsedRealtime - r8) / 320.0f)) : 0.0f;
        boolean c10 = c();
        boolean z11 = false;
        RectF rectF = this.B;
        if (c10) {
            int max = Math.max(AndroidUtilities.dp(200.0f), bounds.width() / 3);
            if (interpolation < 1.0f) {
                if (this.I == null) {
                    this.I = new Paint(1);
                    this.H = max;
                    this.J = new LinearGradient(0.0f, 0.0f, max, 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    Matrix matrix3 = new Matrix();
                    this.K = matrix3;
                    this.J.setLocalMatrix(matrix3);
                    this.I.setShader(this.J);
                    this.I.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                } else if (this.H != max) {
                    this.H = max;
                    LinearGradient linearGradient4 = new LinearGradient(0.0f, 0.0f, max, 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.J = linearGradient4;
                    linearGradient4.setLocalMatrix(this.K);
                    this.I.setShader(this.J);
                }
                rectF.set(bounds);
                rectF.inset(-paint2.getStrokeWidth(), -paint2.getStrokeWidth());
                canvas.saveLayerAlpha(rectF, 255, 31);
                z10 = true;
                if (this.C) {
                    int max2 = Math.max(AndroidUtilities.dp(200.0f), bounds.width() / 3);
                    if (f13 < 1.0f) {
                        if (this.E == null) {
                            this.E = new Paint(1);
                            this.D = max2;
                            this.F = new LinearGradient(0.0f, 0.0f, max2, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            Matrix matrix4 = new Matrix();
                            this.G = matrix4;
                            this.F.setLocalMatrix(matrix4);
                            this.E.setShader(this.F);
                            this.E.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        } else if (this.D != max2) {
                            this.D = max2;
                            LinearGradient linearGradient5 = new LinearGradient(0.0f, 0.0f, max2, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            this.F = linearGradient5;
                            linearGradient5.setLocalMatrix(this.G);
                            this.E.setShader(this.F);
                        }
                        rectF.set(bounds);
                        rectF.inset(-paint2.getStrokeWidth(), -paint2.getStrokeWidth());
                        canvas.saveLayerAlpha(rectF, 255, 31);
                        z11 = true;
                    }
                }
                matrix2.setTranslate(f12, 0.0f);
                this.d.setLocalMatrix(matrix2);
                matrix.setTranslate(f12, 0.0f);
                this.e.setLocalMatrix(matrix);
                path = this.x;
                if (path == null) {
                    Rect rect = this.z;
                    Path path2 = this.y;
                    if (rect == null || !rect.equals(bounds)) {
                        path2.rewind();
                        this.z = bounds;
                        rectF.set(bounds);
                        path2.addRoundRect(rectF, this.A, Path.Direction.CW);
                    }
                    path = path2;
                }
                canvas.drawPath(path, paint);
                if (this.n) {
                    canvas.drawPath(path, paint2);
                }
                if (z11) {
                    canvas.save();
                    int width2 = bounds.width() + this.D;
                    this.G.setTranslate(bounds.left + ((f13 * (width2 + r2)) - this.D), 0.0f);
                    this.F.setLocalMatrix(this.G);
                    int strokeWidth = (int) paint2.getStrokeWidth();
                    canvas.drawRect(bounds.left - strokeWidth, bounds.top - strokeWidth, bounds.right + strokeWidth, bounds.bottom + strokeWidth, this.E);
                    canvas.restore();
                    canvas.restore();
                }
                if (z10) {
                    canvas.save();
                    int width3 = bounds.width() + this.H;
                    this.K.setTranslate(bounds.right - ((interpolation * (width3 + r1)) - this.H), 0.0f);
                    this.J.setLocalMatrix(this.K);
                    int strokeWidth2 = (int) paint2.getStrokeWidth();
                    canvas.drawRect(bounds.left - strokeWidth2, bounds.top - strokeWidth2, bounds.right + strokeWidth2, bounds.bottom + strokeWidth2, this.I);
                    canvas.restore();
                    canvas.restore();
                }
                if (b()) {
                    invalidateSelf();
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.C) {
        }
        matrix2.setTranslate(f12, 0.0f);
        this.d.setLocalMatrix(matrix2);
        matrix.setTranslate(f12, 0.0f);
        this.e.setLocalMatrix(matrix);
        path = this.x;
        if (path == null) {
        }
        canvas.drawPath(path, paint);
        if (this.n) {
        }
        if (z11) {
        }
        if (z10) {
        }
        if (b()) {
        }
    }

    public final void e(int i10, int i11) {
        this.o = Integer.valueOf(i10);
        this.p = Integer.valueOf(i11);
        this.n = false;
    }

    public final void f(int i10, int i11, int i12, int i13) {
        this.o = Integer.valueOf(i10);
        this.p = Integer.valueOf(i11);
        this.n = true;
        this.q = Integer.valueOf(i12);
        this.r = Integer.valueOf(i13);
    }

    public final void g() {
        this.t = 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h(float f7) {
        if (this.x != null) {
            this.v.setPathEffect(new CornerPathEffect(f7));
            this.w.setPathEffect(new CornerPathEffect(f7));
            return;
        }
        float[] fArr = this.A;
        boolean z10 = (fArr[0] == f7 && fArr[2] == f7 && fArr[4] == f7 && fArr[6] == f7) ? false : true;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[5] = f7;
        fArr[4] = f7;
        fArr[7] = f7;
        fArr[6] = f7;
        if (this.z == null || !z10) {
            return;
        }
        Path path = this.y;
        path.rewind();
        Rect rect = this.z;
        RectF rectF = this.B;
        rectF.set(rect);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    public final void i(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < 8; i10++) {
            float[] fArr2 = this.A;
            float f7 = fArr2[i10];
            float f10 = fArr[i10];
            if (f7 != f10) {
                fArr2[i10] = f10;
                z10 = true;
            }
        }
        if (this.z == null || !z10) {
            return;
        }
        Path path = this.y;
        path.rewind();
        Rect rect = this.z;
        RectF rectF = this.B;
        rectF.set(rect);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    public final void j(float f7) {
        h(AndroidUtilities.dp(f7));
    }

    public final void k() {
        Path path = this.x;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            d(rectF);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.v.setAlpha(i10);
        this.w.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.v.setColorFilter(colorFilter);
    }

    public q90() {
        this.b = -1L;
        this.c = -1L;
        this.f = new Matrix();
        this.g = new Matrix();
        this.l = org.telegram.ui.ActionBar.j6.h5;
        this.m = org.telegram.ui.ActionBar.j6.i5;
        this.t = 1.0f;
        this.u = 1.0f;
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.y = new Path();
        this.A = new float[8];
        this.B = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
