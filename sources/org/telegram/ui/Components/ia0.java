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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class ia0 extends Drawable {
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
    public final org.telegram.ui.ActionBar.e6 a;
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

    public ia0(org.telegram.ui.ActionBar.e6 e6Var) {
        this();
        this.a = e6Var;
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
        float f7;
        float f10;
        boolean z10;
        Path path;
        boolean z11;
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
            width = AndroidUtilities.dp(200.0f);
        }
        int min = (int) (Math.min(AndroidUtilities.dp(400.0f), width) * this.t);
        Integer num = this.o;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        int intValue = num != null ? num.intValue() : org.telegram.ui.ActionBar.i6.w0(this.l, e6Var);
        Integer num2 = this.p;
        int intValue2 = num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.i6.w0(this.m, e6Var);
        Integer num3 = this.q;
        int intValue3 = num3 != null ? num3.intValue() : org.telegram.ui.ActionBar.i6.w0(this.l, e6Var);
        Integer num4 = this.r;
        int intValue4 = num4 != null ? num4.intValue() : org.telegram.ui.ActionBar.i6.w0(this.m, e6Var);
        LinearGradient linearGradient = this.d;
        Matrix matrix = this.g;
        Matrix matrix2 = this.f;
        Paint paint2 = this.x;
        if (linearGradient == null || min != this.s || intValue != this.h || intValue2 != this.i || intValue3 != this.j || intValue4 != this.k) {
            this.s = min;
            this.h = intValue;
            this.i = intValue2;
            float f11 = this.s;
            int i10 = this.h;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, f11, 0.0f, new int[]{i10, this.i, i10}, new float[]{0.0f, 0.67f, 1.0f}, tileMode);
            this.d = linearGradient2;
            linearGradient2.setLocalMatrix(matrix2);
            paint.setShader(this.d);
            this.j = intValue3;
            this.k = intValue4;
            float f12 = this.s;
            int i11 = this.j;
            LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{i11, i11, this.k, i11}, new float[]{0.0f, 0.4f, 0.67f, 1.0f}, tileMode);
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
            f10 = Math.min(1.0f, (elapsedRealtime - this.b) / j10) * this.s;
            f7 = 200.0f;
        } else {
            j3 = 0;
            f7 = 200.0f;
            float pow = ((float) Math.pow((((elapsedRealtime - this.b) / 2000.0f) * this.u) / 4.0f, 0.8500000238418579d)) * 4.0f * AndroidUtilities.density;
            float f13 = this.s;
            f10 = (pow * f13) % f13;
        }
        float f14 = (elapsedRealtime - this.b) / 550.0f;
        float f15 = f7;
        float interpolation = this.c > j3 ? 1.0f - hs.g.getInterpolation(Math.min(1.0f, (elapsedRealtime - r8) / 320.0f)) : 0.0f;
        boolean d = d();
        boolean z12 = false;
        RectF rectF = this.C;
        if (d) {
            int max = Math.max(AndroidUtilities.dp(f15), bounds.width() / 3);
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
                canvas.saveLayerAlpha(rectF, 255, 31);
                z10 = true;
                if (this.D) {
                    int max2 = Math.max(AndroidUtilities.dp(f15), bounds.width() / 3);
                    if (f14 < 1.0f) {
                        if (this.F == null) {
                            z11 = true;
                            this.F = new Paint(1);
                            this.E = max2;
                            this.G = new LinearGradient(0.0f, 0.0f, max2, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            Matrix matrix4 = new Matrix();
                            this.H = matrix4;
                            this.G.setLocalMatrix(matrix4);
                            this.F.setShader(this.G);
                            this.F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                        } else {
                            z11 = true;
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
                        canvas.saveLayerAlpha(rectF, 255, 31);
                        z12 = z11;
                    }
                }
                matrix2.setTranslate(f10, 0.0f);
                this.d.setLocalMatrix(matrix2);
                matrix.setTranslate(f10, 0.0f);
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
                if (z12) {
                    canvas.save();
                    int width2 = bounds.width() + this.E;
                    this.H.setTranslate(bounds.left + ((f14 * (width2 + r2)) - this.E), 0.0f);
                    this.G.setLocalMatrix(this.H);
                    int strokeWidth = (int) paint2.getStrokeWidth();
                    canvas.drawRect(bounds.left - strokeWidth, bounds.top - strokeWidth, bounds.right + strokeWidth, bounds.bottom + strokeWidth, this.F);
                    canvas.restore();
                    canvas.restore();
                }
                if (z10) {
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
        z10 = false;
        if (this.D) {
        }
        matrix2.setTranslate(f10, 0.0f);
        this.d.setLocalMatrix(matrix2);
        matrix.setTranslate(f10, 0.0f);
        this.e.setLocalMatrix(matrix);
        path = this.y;
        if (path == null) {
        }
        b(canvas, path);
        if (z12) {
        }
        if (z10) {
        }
        if (c()) {
        }
    }

    public final void e(RectF rectF) {
        super.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.A = null;
    }

    public final void f(int i10, int i11) {
        this.o = Integer.valueOf(i10);
        this.p = Integer.valueOf(i11);
        this.n = false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.o = Integer.valueOf(i10);
        this.p = Integer.valueOf(i11);
        this.n = true;
        this.q = Integer.valueOf(i12);
        this.r = Integer.valueOf(i13);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final void h() {
        this.t = 2.0f;
    }

    public final void i(float f7) {
        if (this.y != null) {
            this.w.setPathEffect(new CornerPathEffect(f7));
            this.x.setPathEffect(new CornerPathEffect(f7));
            return;
        }
        float[] fArr = this.B;
        boolean z10 = (fArr[0] == f7 && fArr[2] == f7 && fArr[4] == f7 && fArr[6] == f7) ? false : true;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[5] = f7;
        fArr[4] = f7;
        fArr[7] = f7;
        fArr[6] = f7;
        if (this.A == null || !z10) {
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
        boolean z10 = false;
        for (int i10 = 0; i10 < 8; i10++) {
            float[] fArr2 = this.B;
            float f7 = fArr2[i10];
            float f10 = fArr[i10];
            if (f7 != f10) {
                fArr2[i10] = f10;
                z10 = true;
            }
        }
        if (this.A == null || !z10) {
            return;
        }
        Path path = this.z;
        path.rewind();
        Rect rect = this.A;
        RectF rectF = this.C;
        rectF.set(rect);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
    }

    public final void k(float f7) {
        i(AndroidUtilities.dp(f7));
    }

    public final void l() {
        Path path = this.y;
        if (path != null) {
            RectF rectF = AndroidUtilities.rectTmp;
            path.computeBounds(rectF, false);
            e(rectF);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.w.setAlpha(i10);
        this.x.setAlpha(i10);
        if (i10 > 0) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.w.setColorFilter(colorFilter);
    }

    public ia0() {
        this.b = -1L;
        this.c = -1L;
        this.f = new Matrix();
        this.g = new Matrix();
        this.l = org.telegram.ui.ActionBar.i6.h5;
        this.m = org.telegram.ui.ActionBar.i6.i5;
        this.t = 1.0f;
        this.u = 1.0f;
        this.w = new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        this.z = new Path();
        this.B = new float[8];
        this.C = new RectF();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.density > 2.0f ? 2.0f : 1.0f);
    }
}
