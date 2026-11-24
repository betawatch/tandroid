// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a;
import org.telegram.ui.Components.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mm3 extends View {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public boolean E;
    public int E0;
    public final lm F;
    public long F0;
    public final lm G;
    public long G0;
    public final lm H;
    public long H0;
    public final lm I;
    public long I0;
    public final lm J;
    public Drawable J0;
    public final lm K;
    public final int[] K0;
    public int L;
    public boolean L0;
    public float M;
    public final lm M0;
    public float N;
    public final lm N0;
    public float O;
    public final lm O0;
    public final float[] P;
    public final Paint P0;
    public int Q;
    public final RectF Q0;
    public boolean R;
    public long R0;
    public float S;
    public final Matrix S0;
    public float T;
    public final SparseArray T0;
    public final Paint U;
    public final Paint U0;
    public final Path V;
    public km3 V0;
    public oy8 W;
    public il0 W0;
    public final Path X0;
    public Paint Y0;
    public float Z0;
    public final jm3 a;
    public int a0;
    public float a1;
    public ew1 b;
    public final Paint b0;
    public long b1;
    public a c;
    public final Paint c0;
    public long c1;
    public final Paint d;
    public final Paint d0;
    public lm3 d1;
    public final Paint e;
    public final Paint e0;
    public int e1;
    public final Paint f;
    public final Paint f0;
    public int f1;
    public final lm g0;
    public int g1;
    public final Paint h;
    public final lm h0;
    public int h1;
    public float i0;
    public int i1;
    public float j0;
    public boolean j1;
    public float k0;
    public final o1 k1;
    public boolean l0;
    public boolean l1;
    public final RectF m0;
    public float m1;
    public final Drawable n;
    public final RectF n0;
    public float n1;
    public final int[] o0;
    public boolean p0;
    public int q0;
    public final RectF r;
    public int r0;
    public final RectF s;
    public LinearGradient s0;
    public RadialGradient t0;
    public LinearGradient u0;
    public final Paint v0;
    public final RectF w;
    public final Paint w0;
    public final float[] x;
    public final Matrix x0;
    public boolean y;
    public boolean y0;
    public final float[] z0;

    public mm3(Context context, jm3 jm3Var) {
        super(context);
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Paint(1);
        this.f = new Paint(1);
        Paint paint2 = new Paint(1);
        this.h = paint2;
        this.r = new RectF();
        this.s = new RectF();
        this.w = new RectF();
        this.x = new float[2];
        s33 s33Var = s33.g;
        this.F = new lm(this, 0L, 220L, s33Var);
        s33 s33Var2 = s33.h;
        this.G = new lm(this, 0L, 320L, s33Var2);
        s33 s33Var3 = s33.j;
        this.H = new lm(this, 0L, 200L, s33Var3);
        this.I = new lm(this, 0L, 300L, s33Var2);
        this.J = new lm(this, 0L, 200L, s33Var3);
        this.K = new lm(this, 0L, 160L, s33Var2);
        this.L = 0;
        this.P = new float[3];
        this.Q = -1;
        this.U = new Paint(1);
        this.V = new Path();
        this.b0 = new Paint(1);
        this.c0 = new Paint(1);
        this.d0 = new Paint(1);
        this.e0 = new Paint(1);
        this.f0 = new Paint(1);
        this.g0 = new lm(this, 0L, 320L, new s33(0.25d, 0.1d, 0.25d, 1.0d));
        this.h0 = new lm(this, 0L, 150L, s33Var);
        this.m0 = new RectF();
        this.n0 = new RectF();
        this.o0 = new int[2];
        this.v0 = new Paint(1);
        this.w0 = new Paint(1);
        this.x0 = new Matrix();
        this.z0 = new float[5];
        this.K0 = new int[2];
        this.M0 = new lm(this, 0L, 220L, s33Var);
        this.N0 = new lm(this, 0L, 420L, s33Var3);
        this.O0 = new lm(this, 0L, 260L, s33Var);
        this.P0 = new Paint(1);
        this.Q0 = new RectF();
        this.S0 = new Matrix();
        this.T0 = new SparseArray();
        this.U0 = new Paint(1);
        this.X0 = new Path();
        this.e1 = -15820126;
        this.f1 = -14910766;
        this.g1 = -14910766;
        this.h1 = -7696492;
        this.i1 = -1726275033;
        this.k1 = new o1(this, (byte) 22);
        this.a = jm3Var;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gl.N(2.0f));
        paint2.setColor(-1);
        Drawable d = b00.d(context, R.drawable.send_plane_24);
        this.n = d;
        d.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final boolean a(View view, float[] fArr) {
        if (view != null && view.getWidth() != 0) {
            float width = view.getWidth() / 2.0f;
            float height = view.getHeight() / 2.0f;
            ViewParent parent = getParent();
            while (view != null) {
                if (view == parent) {
                    fArr[0] = width - getLeft();
                    fArr[1] = height - getTop();
                    return true;
                }
                width += view.getTranslationX() + view.getLeft();
                height += view.getTranslationY() + view.getTop();
                Object parent2 = view.getParent();
                view = parent2 instanceof View ? (View) parent2 : null;
            }
        }
        return false;
    }

    public final int b(int i) {
        if (this.p0) {
            return g(i);
        }
        float max = Math.max(0.0f, Math.min(1.0f, this.a1)) * pm3.c(11);
        int i2 = this.i1;
        return max <= 0.004f ? i2 : bm2.f(max, i2, bm2.f(0.5f, i, this.g1) | (-16777216));
    }

    public final void c(Canvas canvas, float f, float f2, float f3, float f4, int i, float f5) {
        if (f5 <= 0.01f) {
            return;
        }
        int i2 = (i & 16316664) | (-16777216);
        SparseArray sparseArray = this.T0;
        SweepGradient sweepGradient = (SweepGradient) sparseArray.get(i2);
        if (sweepGradient == null) {
            int i3 = 16777215 & i2;
            SweepGradient sweepGradient2 = new SweepGradient(0.0f, 0.0f, new int[]{i3, i2, i3, i3}, new float[]{0.0f, 0.19444445f, 0.3888889f, 1.0f});
            if (sparseArray.size() > 256) {
                sparseArray.clear();
            }
            sparseArray.put(i2, sweepGradient2);
            sweepGradient = sweepGradient2;
        }
        float f6 = f4 - 70.0f;
        Matrix matrix = this.S0;
        matrix.setRotate(f6);
        matrix.postTranslate(f, f2);
        sweepGradient.setLocalMatrix(matrix);
        Paint paint = this.U0;
        paint.setShader(sweepGradient);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStrokeWidth(Math.max(1.0f, gl.N(1.1f)));
        paint.setColor(-1);
        paint.setAlpha((int) (Math.min(1.0f, f5) * 255.0f));
        RectF rectF = this.w;
        rectF.set(f - f3, f2 - f3, f + f3, f2 + f3);
        canvas.drawArc(rectF, f6, 140.0f, false, paint);
        paint.setShader(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z;
        float f4;
        float f5;
        float f6;
        int[] iArr;
        float f7;
        boolean z2;
        float f8;
        float f9;
        int[] iArr2;
        float max;
        int i;
        int i2;
        float f10;
        Canvas canvas2 = canvas;
        float d = this.l0 ? this.g0.d(true) : this.i0;
        float d2 = this.h0.d(!this.l0);
        boolean z3 = this.l0;
        RectF rectF = this.m0;
        if ((!z3 && d2 >= 1.0f) || d <= 0.005f || this.m1 == 0.0f) {
            rectF.setEmpty();
            return;
        }
        float L = ((this.n1 - gl.L(19.0f)) - gl.L(9.0f)) - gl.L(18.0f);
        lm3 lm3Var = this.d1;
        int[] iArr3 = this.o0;
        if (lm3Var != null) {
            jm3 jm3Var = (jm3) ((lj9) lm3Var).b;
            RectF rectF2 = this.n0;
            if (jm3Var.n(rectF2)) {
                getLocationInWindow(iArr3);
                L = ((rectF2.top - iArr3[1]) - gl.L(9.0f)) - gl.L(18.0f);
            }
        }
        float f11 = this.m1;
        if (this.A0) {
            f2 = this.B0;
            f = this.C0;
        } else {
            f = this.n1;
            f2 = f11;
        }
        float R1 = gl.R1(f2, f11, d);
        float R12 = gl.R1(f, L, d);
        boolean z4 = this.l0;
        if (z4) {
            this.j0 = R1;
            this.k0 = R12;
        } else {
            float f12 = this.j0;
            if (f12 != 0.0f) {
                R12 = this.k0;
                f3 = f12;
                float f13 = R12;
                float R13 = !z4 ? 1.0f : gl.R1(1.0f, 0.6f, d2);
                float R14 = gl.R1(!this.A0 ? Math.min(this.D0, gl.N(26.0f)) : gl.N(19.0f), gl.N(18.0f), Math.min(1.0f, d)) * (this.Q != 1 ? 1.0f - (this.K.c * 0.08f) : 1.0f) * R13;
                float min = Math.min(1.0f, 1.5f * d) * (!this.l0 ? 1.0f : 1.0f - d2);
                rectF.set(f3 - gl.L(22.0f), f13 - gl.L(22.0f), gl.L(22.0f) + f3, gl.L(22.0f) + f13);
                z = this.p0;
                Paint paint = this.d0;
                if (z) {
                    float N = gl.N(8.0f);
                    float N2 = gl.N(2.0f);
                    float f14 = 41.0f * min;
                    f4 = 1.0f;
                    if (this.l0) {
                        f10 = 1.0f;
                    } else {
                        float f15 = 1.0f - d2;
                        f10 = f15 * f15;
                    }
                    paint.setShadowLayer(N, 0.0f, N2, bm2.o(-16777216, (int) (f14 * f10)));
                } else {
                    f4 = 1.0f;
                    paint.setShadowLayer(gl.N(1.0f), 0.0f, gl.N(0.33333334f), bm2.o(-16777216, (int) ((this.p0 ? kk7.m1 : 51) * min)));
                }
                paint.setColor(16777216);
                Path path = this.X0;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addCircle(f3, f13, R14, direction);
                canvas2.save();
                if (Build.VERSION.SDK_INT < 26) {
                    canvas2.clipOutPath(path);
                } else {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                canvas2.drawCircle(f3, f13, R14, paint);
                canvas2.restore();
                if (this.W0 == null) {
                    int L2 = gl.L(6.0f);
                    float f16 = L2 + 2;
                    float f17 = f3 - R14;
                    float f18 = f17 - f16;
                    float f19 = f13 - R14;
                    float f20 = f19 - f16;
                    float f21 = f3 + R14;
                    float f22 = f21 + f16;
                    f5 = d;
                    float f23 = f13 + R14;
                    float f24 = f23 + f16;
                    f6 = d2;
                    iArr = iArr3;
                    f7 = 0.6f;
                    int saveLayerAlpha = canvas2.saveLayerAlpha(f18, f20, f22, f24, (int) (((this.l0 || this.p0) ? min : min * min) * 255.0f));
                    this.W0.setBounds(((int) f17) - L2, ((int) f19) - L2, ((int) f21) + L2, ((int) f23) + L2);
                    this.W0.setAlpha(kk7.d4);
                    this.W0.draw(canvas2);
                    if (this.Y0 == null) {
                        Paint paint2 = new Paint(1);
                        this.Y0 = paint2;
                        paint2.setColor(-16777216);
                        this.Y0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    path.rewind();
                    R14 = R14;
                    path.addCircle(f3, f13, R14, direction);
                    path.setFillType(Path.FillType.INVERSE_WINDING);
                    canvas2.save();
                    canvas2.clipRect(f18, f20, f22, f24);
                    canvas2.drawPath(path, this.Y0);
                    canvas2.restore();
                    path.setFillType(Path.FillType.WINDING);
                    canvas2.restoreToCount(saveLayerAlpha);
                } else {
                    f5 = d;
                    f6 = d2;
                    iArr = iArr3;
                    f7 = 0.6f;
                }
                z2 = this.p0;
                Paint paint3 = this.b0;
                if (!z2) {
                    int color = paint3.getColor();
                    paint3.setColor(-989855745);
                    paint3.setAlpha((int) (196.0f * min));
                    canvas2.drawCircle(f3, f13, R14, paint3);
                    paint3.setColor(color);
                    Paint paint4 = this.c0;
                    int color2 = paint4.getColor();
                    float strokeWidth = paint4.getStrokeWidth();
                    paint4.setColor(385875968);
                    paint4.setAlpha((int) (23.0f * min));
                    paint4.setStrokeWidth(Math.max(f4, gl.N(0.5f)));
                    canvas2.drawCircle(f3, f13, R14, paint4);
                    paint4.setStrokeWidth(strokeWidth);
                    paint4.setColor(color2);
                }
                if (this.p0) {
                    f8 = f13;
                    f9 = f3;
                    iArr2 = iArr;
                } else {
                    int alpha = paint3.getAlpha();
                    paint3.setAlpha((int) (alpha * min));
                    canvas2.drawCircle(f3, f13, R14, paint3);
                    paint3.setAlpha(alpha);
                    float f25 = R14;
                    float f26 = f3;
                    yw4.a(canvas2, f3 - R14, f13 - R14, f3 + R14, f13 + R14, f25, this.p0, this.a1 * min, this.Z0);
                    float max2 = Math.max(0.0f, Math.min(1.0f, this.a1));
                    if (max2 <= 0.01f || this.V0 == null) {
                        iArr2 = iArr;
                        i = -1;
                        i2 = -1;
                    } else {
                        iArr2 = iArr;
                        getLocationInWindow(iArr2);
                        int a = ((bm3) this.V0).a(f26 + iArr2[0], (iArr2[1] + f13) - f25);
                        int a2 = ((bm3) this.V0).a(f26 + iArr2[0], iArr2[1] + f13 + f25);
                        i = a != 0 ? bm2.f(yjb.z(this.Z0, 0.2f, 0.8f, max2), -1, g(a)) : -1;
                        i2 = a2 != 0 ? bm2.f(yjb.z(this.Z0, 0.2f, 0.8f, max2), -1, g(a2)) : -1;
                    }
                    f9 = f26;
                    f8 = f13;
                    c(canvas, f9, f8, f25 - gl.N(f7), -90.0f, i, min * (this.p0 ? 0.85f : 0.95f));
                    canvas2 = canvas;
                    c(canvas2, f9, f8, f25 - gl.N(f7), 90.0f, i2, min * (this.p0 ? 0.35f : 0.45f));
                }
                max = Math.max(0.0f, Math.min(1.0f, (f5 - 0.15f) / f7)) * min * (this.l0 ? 1.0f : oo1.x(f6, 0.4f, 1.0f, 0.0f));
                if (max <= 0.0f) {
                    km3 km3Var = this.V0;
                    Paint paint5 = this.e0;
                    if (km3Var != null) {
                        getLocationInWindow(iArr2);
                        int a3 = ((bm3) this.V0).a(f9 + iArr2[0], f8 + iArr2[1]);
                        if (a3 != 0) {
                            paint5.setColor(b(a3));
                        }
                    }
                    int alpha2 = paint5.getAlpha();
                    paint5.setAlpha((int) (alpha2 * max));
                    float N3 = gl.N(5.5f);
                    if (this.l0) {
                        R13 = gl.R1(0.5f, 1.0f, max);
                    }
                    float f27 = N3 * R13;
                    RectF rectF3 = this.w;
                    rectF3.set(f9 - f27, f8 - f27, f9 + f27, f8 + f27);
                    canvas2.drawRoundRect(rectF3, gl.N(2.4f), gl.N(2.4f), paint5);
                    paint5.setAlpha(alpha2);
                    return;
                }
                return;
            }
        }
        f3 = R1;
        float f132 = R12;
        if (!z4) {
        }
        float R142 = gl.R1(!this.A0 ? Math.min(this.D0, gl.N(26.0f)) : gl.N(19.0f), gl.N(18.0f), Math.min(1.0f, d)) * (this.Q != 1 ? 1.0f - (this.K.c * 0.08f) : 1.0f) * R13;
        float min2 = Math.min(1.0f, 1.5f * d) * (!this.l0 ? 1.0f : 1.0f - d2);
        rectF.set(f3 - gl.L(22.0f), f132 - gl.L(22.0f), gl.L(22.0f) + f3, gl.L(22.0f) + f132);
        z = this.p0;
        Paint paint6 = this.d0;
        if (z) {
        }
        paint6.setColor(16777216);
        Path path2 = this.X0;
        path2.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path2.addCircle(f3, f132, R142, direction2);
        canvas2.save();
        if (Build.VERSION.SDK_INT < 26) {
        }
        canvas2.drawCircle(f3, f132, R142, paint6);
        canvas2.restore();
        if (this.W0 == null) {
        }
        z2 = this.p0;
        Paint paint32 = this.b0;
        if (!z2) {
        }
        if (this.p0) {
        }
        max = Math.max(0.0f, Math.min(1.0f, (f5 - 0.15f) / f7)) * min2 * (this.l0 ? 1.0f : oo1.x(f6, 0.4f, 1.0f, 0.0f));
        if (max <= 0.0f) {
        }
    }

    public final void e() {
        this.y = false;
        this.E = false;
        this.F.e(true, 0.0f);
        this.G.e(true, 0.0f);
        setVisibility(8);
    }

    public final int f(float f, float f2) {
        if (this.l0) {
            RectF rectF = this.m0;
            if (!rectF.isEmpty() && this.g0.c > 0.7f && rectF.contains(f, f2)) {
                return 1;
            }
        }
        if (this.F.c >= 0.6f && this.y) {
            RectF rectF2 = this.r;
            if (!rectF2.isEmpty() && this.E && rectF2.contains(f, f2)) {
                return 0;
            }
            if (this.s.contains(f, f2)) {
                return 2;
            }
        }
        return -1;
    }

    public final int g(int i) {
        if (this.p0) {
            return bm2.f(0.4f, i, -1);
        }
        return bm2.f(pm3.c(11), this.h1, bm2.f(0.5f, i, this.g1));
    }

    public int getRightMode() {
        return this.L;
    }

    public final void h() {
        if (this.j1 || !isAttachedToWindow()) {
            return;
        }
        this.j1 = true;
        postOnAnimation(this.k1);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            h();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.k1);
        this.j1 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x077e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0834 A[LOOP:1: B:176:0x0831->B:178:0x0834, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x053d  */
    /* JADX WARN: Type inference failed for: r2v46, types: [android.view.ViewGroup, java.lang.Object, org.telegram.ui.Components.a] */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105, types: [int] */
    /* JADX WARN: Type inference failed for: r3v134 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62, types: [int] */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r71v0, types: [android.graphics.Canvas] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        float f3;
        float R1;
        float f4;
        float f5;
        float f6;
        oy8 oy8Var;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        long j;
        lm lmVar;
        float f7;
        float f8;
        float f9;
        float interpolation;
        float f10;
        float f11;
        float cos;
        float f12;
        float f13;
        float f14;
        float f15;
        float min;
        float d;
        float A;
        long j2;
        float f16;
        lm lmVar2;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        int i3;
        float d2;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        View view;
        boolean z4;
        float f29;
        Drawable drawable;
        ?? r3;
        float d3;
        int i4;
        int i5;
        float f30;
        float f31;
        View view2;
        float min2;
        float f32;
        float d4 = this.F.d(this.y);
        if (d4 <= 0.0f && !this.y) {
            setVisibility(8);
            return;
        }
        float f33 = this.M;
        this.M = tb4.A(this.N, f33, 0.2f, f33);
        long uptimeMillis = SystemClock.uptimeMillis();
        float d5 = this.K.d(this.Q >= 0);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        long j3 = this.I0;
        if (j3 == 0) {
            this.I0 = uptimeMillis2;
            j3 = uptimeMillis2;
        }
        long min3 = Math.min(20L, uptimeMillis2 - j3) + this.H0;
        this.H0 = min3;
        this.I0 = uptimeMillis2;
        if (this.F0 == 0) {
            this.F0 = min3 + 1;
        }
        long j4 = this.G0;
        if (j4 == 0) {
            j4 = min3 + 1;
            this.G0 = j4;
        }
        boolean z5 = this.E;
        lm lmVar3 = this.G;
        if (!z5 || this.L0) {
            z = true;
        } else {
            float w = ls6.w(min3 - j4, 170.0f, 1.0f, 0.0f);
            z = true;
            lmVar3.e(true, w < 0.5f ? yjb.C(w, 4.0f, w, w) : 1.0f - (((float) Math.pow((w * (-2.0f)) + 2.0f, 3.0d)) / 2.0f));
        }
        boolean z6 = this.L0;
        lm lmVar4 = this.M0;
        float d6 = z6 ? (1.0f - lmVar4.d(z)) * lmVar3.c : lmVar3.d(this.E);
        boolean z7 = this.R;
        float f34 = d6 * ((z7 && this.E) ? 1.0f : d4);
        RectF rectF = this.r;
        int[] iArr = this.o0;
        float[] fArr = this.x;
        if ((f34 > 0.0f || (z7 && this.E)) && a(this.b, fArr)) {
            float f35 = fArr[0];
            float f36 = fArr[1];
            f = 255.0f;
            f2 = 0.0f;
            rectF.set(f35 - gl.L(22.0f), f36 - gl.L(22.0f), gl.L(22.0f) + f35, gl.L(22.0f) + f36);
            boolean z8 = this.L0;
            float f37 = z8 ? lmVar4.c : 0.0f;
            if (z8) {
                f35 = fArr[0];
                f36 = fArr[1];
                f4 = f37 * 30.0f;
                f3 = 1.0f;
                R1 = gl.R1(1.0f, 0.6f, f37);
            } else {
                f3 = 1.0f;
                if (this.R && this.E) {
                    f35 = gl.R1(this.S, f35, f34);
                    f36 = gl.R1(this.T, f36, f34);
                    float f38 = f34 / 0.55f;
                    float min4 = 1.0f - Math.min(1.0f, f38);
                    if (min4 > 0.0f) {
                        Paint paint = this.U;
                        paint.setAlpha((int) (min4 * 255.0f));
                        canvas.drawCircle(f35, f36, gl.R1(1.0f, 0.35f, Math.min(1.0f, f38)) * gl.N(5.0f), paint);
                    }
                    f4 = (-90.0f) * (1.0f - f34);
                    R1 = gl.R1(0.35f, 1.0f, f34);
                } else {
                    R1 = gl.R1(0.5f, 1.0f, s33.k.getInterpolation(f34));
                    f4 = 0.0f;
                }
            }
            float f39 = R1 * (this.Q == 0 ? f3 - (0.12f * d5) : 1.0f);
            Paint paint2 = this.d;
            int color = paint2.getColor();
            if (this.V0 != null) {
                getLocationInWindow(iArr);
                f5 = d5;
                f6 = f34;
                int a = ((bm3) this.V0).a(iArr[0] + f35, iArr[1] + f36);
                if (a != 0) {
                    paint2.setColor(b(a));
                }
            } else {
                f5 = d5;
                f6 = f34;
            }
            paint2.setAlpha((int) (paint2.getAlpha() * (this.L0 ? 1.0f - f37 : Math.min(1.0f, f6 * 1.6f))));
            float N = gl.N(6.2f) * f39;
            canvas.save();
            if (this.W == null) {
                try {
                    oy8 oy8Var2 = new oy8(R.raw.chat_audio_record_delete_outline, gl.L(28.0f), gl.L(28.0f), false, null);
                    this.W = oy8Var2;
                    oy8Var2.E(true);
                    this.W.M(this);
                    this.W.I(0, false, false);
                    this.a0 = 0;
                } catch (Throwable unused) {
                    oy8Var = null;
                }
            }
            oy8Var = this.W;
            if (oy8Var != null) {
                canvas.rotate(f4 * 0.25f, f35, f36);
                canvas.scale(f39, f39, f35, f36);
                if (this.a0 != paint2.getColor()) {
                    this.a0 = paint2.getColor();
                    oy8Var.setColorFilter(new PorterDuffColorFilter(this.a0 | (-16777216), PorterDuff.Mode.SRC_IN));
                }
                int L = gl.L(14.0f);
                int i6 = (int) f35;
                int i7 = (int) f36;
                oy8Var.setBounds(i6 - L, i7 - L, i6 + L, i7 + L);
                oy8Var.setAlpha(paint2.getAlpha());
                oy8Var.draw(canvas);
            } else {
                canvas.rotate(f4, f35, f36);
                Path path = this.V;
                path.rewind();
                float f40 = f35 - N;
                float f41 = f36 - N;
                path.moveTo(f40, f41);
                float f42 = f35 + N;
                float f43 = f36 + N;
                path.lineTo(f42, f43);
                path.moveTo(f40, f43);
                path.lineTo(f42, f41);
                canvas.drawPath(path, paint2);
            }
            canvas.restore();
            paint2.setColor(color);
        } else {
            f5 = d5;
            f2 = 0.0f;
            f = 255.0f;
            rectF.setEmpty();
        }
        d(canvas);
        if (a(this.c, fArr)) {
            float width = (((this.c.getWidth() / 2.0f) + fArr[0]) - gl.N(3.0f)) - gl.N(19.0f);
            float height = (((this.c.getHeight() / 2.0f) + fArr[1]) - gl.N(3.0f)) - gl.N(19.0f);
            float N2 = gl.N(19.0f);
            lm3 lm3Var = this.d1;
            float[] fArr2 = this.z0;
            if (lm3Var != null) {
                ChatActivityEnterView chatActivityEnterView = ((jm3) ((lj9) lm3Var).b).f.a;
                chatActivityEnterView.I1 = SystemClock.uptimeMillis() + 1500;
                if (chatActivityEnterView.E0(fArr2)) {
                    z2 = true;
                    if (z2) {
                        z3 = false;
                        i = 0;
                        i2 = 0;
                    } else {
                        getLocationInWindow(iArr);
                        z3 = false;
                        float f44 = fArr2[0];
                        int i8 = iArr[0];
                        float f45 = fArr2[1];
                        int i9 = iArr[1];
                        float f46 = fArr2[2];
                        i = ((int) fArr2[3]) - i8;
                        i2 = ((int) fArr2[4]) - i9;
                        width = f44 - i8;
                        height = f45 - i9;
                        N2 = f46;
                    }
                    float d7 = this.H.d(this.L != 0 ? true : z3);
                    float d8 = this.I.d(this.L != 1 ? true : z3);
                    j = this.b1;
                    lm lmVar5 = this.J;
                    int i10 = i;
                    lmVar = this.O0;
                    int i11 = i2;
                    lm lmVar6 = this.N0;
                    if (j != 0) {
                        f7 = N2;
                        f8 = width;
                        interpolation = -1.0f;
                        f9 = f2;
                    } else {
                        f7 = N2;
                        float f47 = f2;
                        float w2 = ls6.w(uptimeMillis - j, this.c1, 1.0f, f47);
                        if (w2 >= 1.0f) {
                            f8 = width;
                            this.b1 = 0L;
                            this.L = 2;
                            this.l1 = true;
                            lmVar6.e(true, 1.0f);
                            f9 = 0.0f;
                            lmVar.e(true, 0.0f);
                            lmVar5.e(true, 1.0f);
                            interpolation = 1.0f;
                        } else {
                            f8 = width;
                            f9 = f47;
                            interpolation = s33.j.getInterpolation(w2);
                        }
                    }
                    float d9 = interpolation < f9 ? interpolation : lmVar5.d(this.L == 2 ? true : z3);
                    float interpolation2 = s33.k.getInterpolation(Math.min(1.0f, d4));
                    if (!this.A0 || this.L0) {
                        f10 = 1.0f;
                        f11 = 1.0f;
                    } else {
                        f10 = 1.0f;
                        f11 = gl.R1(0.7f, 1.0f, interpolation2);
                    }
                    float f48 = f11 * (this.Q != 2 ? f10 - (0.08f * f5) : f10);
                    float f49 = f7 * f48;
                    boolean z9 = z2;
                    cos = !this.A0 ? (float) (0.5d - (Math.cos(ls6.w(this.H0 - this.F0, 340.0f, 1.0f, 0.0f) * 3.141592653589793d) * 0.5d)) : 1.0f;
                    this.m1 = f8;
                    this.n1 = height;
                    if (cos >= 1.0f) {
                        float R12 = gl.R1(this.B0, f8, cos);
                        height = gl.R1(this.C0, height, cos);
                        f49 = gl.R1(this.D0, f49, cos);
                        f12 = R12;
                    } else {
                        f12 = f8;
                    }
                    float f50 = f49;
                    f13 = height;
                    f14 = interpolation;
                    f15 = d9;
                    this.s.set(f12 - gl.L(24.0f), f13 - gl.L(24.0f), gl.L(24.0f) + f12, gl.L(24.0f) + f13);
                    min = (!this.A0 || this.L0) ? !this.y ? 1.0f : d4 : Math.min(1.0f, d4 * 1.6f);
                    d = !this.L0 ? lmVar4.d(true) : 0.0f;
                    float f51 = this.O;
                    A = tb4.A(0.0f, f51, 0.25f, f51);
                    this.O = A;
                    if (A <= 0.01f) {
                        f16 = d7;
                        float N3 = (gl.N(0.3f) * ((float) Math.sin(uptimeMillis / 240.0d))) + (gl.N(1.8f) * this.O) + gl.N(0.8f) + f50;
                        j2 = uptimeMillis;
                        int z10 = (int) yjb.z(this.O, 0.3f, 0.22f, min * f);
                        Paint paint3 = this.f;
                        paint3.setAlpha(z10);
                        canvas.drawCircle(f12, f13, N3, paint3);
                    } else {
                        j2 = uptimeMillis;
                        f16 = d7;
                    }
                    if (this.L0 || min >= 1.0f) {
                        lmVar2 = lmVar;
                        f17 = min;
                        f18 = 2.0f;
                        f19 = f12;
                        f20 = f13;
                        f21 = f17;
                        i3 = -1;
                    } else {
                        int i12 = (int) (min * f);
                        lmVar2 = lmVar;
                        f17 = min;
                        f19 = f12;
                        f20 = f13;
                        f18 = 2.0f;
                        i3 = canvas.saveLayerAlpha((f12 - f50) - gl.L(2.0f), (f13 - f50) - gl.L(2.0f), f12 + f50 + gl.L(2.0f), f13 + f50 + gl.L(2.0f), i12);
                        f21 = 1.0f;
                    }
                    Paint paint4 = this.e;
                    int alpha = paint4.getAlpha();
                    int color2 = paint4.getColor();
                    if (cos < 1.0f) {
                        paint4.setColor(bm2.f(cos, this.E0, color2));
                    }
                    paint4.setAlpha((int) (alpha * f21));
                    canvas.drawCircle(f19, f20, f50, paint4);
                    paint4.setColor(color2);
                    paint4.setAlpha(alpha);
                    float f52 = f21 * cos;
                    if (interpolation < f9) {
                        d2 = 1.0f - f14;
                    } else if (this.L0) {
                        d2 = 1.0f - d;
                    } else {
                        d2 = 1.0f - lmVar6.d((this.L == 2 && this.l1) ? true : z3);
                    }
                    f22 = f52 * d2;
                    if (f22 > 0.01f || this.q0 == 0) {
                        f23 = f21;
                        f24 = d;
                        f25 = f18;
                        f26 = 0.62f;
                    } else {
                        boolean z11 = this.p0;
                        Paint paint5 = this.f0;
                        if (z11) {
                            f26 = 0.62f;
                            LinearGradient linearGradient = this.s0;
                            f25 = f18;
                            Paint paint6 = this.v0;
                            f27 = 0.4f;
                            Paint paint7 = this.w0;
                            if (linearGradient == null || this.y0 != z11) {
                                this.y0 = z11;
                                f23 = f21;
                                LinearGradient linearGradient2 = new LinearGradient(-1.0f, 0.0f, 1.0f, 0.0f, new int[]{this.r0, z11 ? om3.e(-13649665) : -15363400, this.q0}, (float[]) null, Shader.TileMode.MIRROR);
                                this.s0 = linearGradient2;
                                paint5.setShader(linearGradient2);
                                f32 = f22;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{788529151, 536870911, 234881023, 16777215}, new float[]{0.0f, 0.35f, 0.7f, 1.0f}, tileMode);
                                this.t0 = radialGradient;
                                paint6.setShader(radialGradient);
                                LinearGradient linearGradient3 = new LinearGradient(0.0f, -1.0f, 0.0f, 1.0f, new int[]{1090519039, 184549375, 352321535}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
                                this.u0 = linearGradient3;
                                paint7.setShader(linearGradient3);
                                paint7.setStyle(Paint.Style.STROKE);
                            } else {
                                f23 = f21;
                                f32 = f22;
                            }
                            float f53 = (j2 % 5000) / 5000.0f;
                            Matrix matrix = this.x0;
                            matrix.setTranslate(f53 * 4.0f, 0.0f);
                            float f54 = 2.6f * f50;
                            matrix.postScale(f54, f54);
                            matrix.postRotate(35.0f);
                            matrix.postTranslate(f19, f20);
                            this.s0.setLocalMatrix(matrix);
                            int i13 = (int) (f32 * f);
                            paint5.setAlpha(i13);
                            canvas.drawCircle(f19, f20, f50, paint5);
                            f24 = d;
                            float sin = 0.06f * f50 * ((float) Math.sin(f53 * 3.141592653589793d * 2.0d));
                            float f55 = f50 * 0.62f;
                            matrix.setScale(1.35f * f50, f55);
                            matrix.postTranslate(f19 + sin, f20 - f55);
                            this.t0.setLocalMatrix(matrix);
                            paint6.setAlpha(i13);
                            canvas.drawCircle(f19, f20, f50, paint6);
                            matrix.setScale(f50, f50);
                            matrix.postTranslate(f19, f20);
                            this.u0.setLocalMatrix(matrix);
                            paint7.setStrokeWidth(Math.max(1.0f, gl.N(0.8f)));
                            paint7.setAlpha(i13);
                            canvas.drawCircle(f19, f20, f50 - gl.N(0.4f), paint7);
                            if (cos < 1.0f && this.J0 != null) {
                                float f56 = cos / 0.5f;
                                min2 = 1.0f - Math.min(1.0f, f56);
                                if (min2 <= 0.0f) {
                                    int intrinsicWidth = this.J0.getIntrinsicWidth();
                                    int intrinsicHeight = this.J0.getIntrinsicHeight();
                                    float R13 = gl.R1(1.0f, 0.6f, Math.min(1.0f, f56));
                                    canvas.save();
                                    canvas.scale(R13, R13, f19, f20);
                                    int i14 = (int) (f19 - (intrinsicWidth / f25));
                                    int i15 = (int) (f20 - (intrinsicHeight / f25));
                                    this.J0.setBounds(i14, i15, intrinsicWidth + i14, intrinsicHeight + i15);
                                    this.J0.setAlpha((int) (min2 * f));
                                    this.J0.draw(canvas);
                                    canvas.restore();
                                } else {
                                    f28 = 1.0f;
                                    float f57 = cos < f28 ? 1.0f : oo1.f(cos, f27, 0.6f, 0.0f);
                                    if (this.L0) {
                                        view = null;
                                    } else {
                                        ?? r2 = this.c;
                                        if (ug8.A(r2)) {
                                            for (?? r32 = z3; r32 < r2.getChildCount(); r32++) {
                                                View childAt = r2.getChildAt(r32);
                                                if ((childAt instanceof qy1) && childAt.getWidth() > 0) {
                                                    view2 = childAt;
                                                    break;
                                                }
                                            }
                                        }
                                        view2 = null;
                                        view = view2;
                                    }
                                    z4 = this.L0;
                                    if (z4 || view == null || f24 <= 0.0f) {
                                        f29 = f24;
                                        if (z4 && (drawable = this.J0) != null && f29 > 0.0f) {
                                            int intrinsicWidth2 = drawable.getIntrinsicWidth();
                                            int intrinsicHeight2 = this.J0.getIntrinsicHeight();
                                            float R14 = gl.R1(0.6f, 1.0f, f29);
                                            canvas.save();
                                            canvas.scale(R14, R14, f19, f20);
                                            int i16 = (int) (f19 - (intrinsicWidth2 / 2.0f));
                                            int i17 = (int) (f20 - (intrinsicHeight2 / 2.0f));
                                            this.J0.setBounds(i16, i17, intrinsicWidth2 + i16, intrinsicHeight2 + i17);
                                            this.J0.setAlpha((int) (f29 * f * f23));
                                            this.J0.draw(canvas);
                                            canvas.restore();
                                        }
                                    } else {
                                        view.getLocationInWindow(this.K0);
                                        getLocationInWindow(iArr);
                                        f29 = f24;
                                        float R15 = gl.R1(0.6f, 1.0f, f29);
                                        int saveLayerAlpha = canvas.saveLayerAlpha(f19 - f50, f20 - f50, f19 + f50, f20 + f50, (int) (f29 * f * f23));
                                        canvas.scale(R15, R15, f19, f20);
                                        de9.n(view.getHeight(), f25, f20, f19 - (view.getWidth() / f25), canvas);
                                        view.draw(canvas);
                                        canvas.restoreToCount(saveLayerAlpha);
                                    }
                                    if (i3 >= 0) {
                                        canvas.restoreToCount(i3);
                                    }
                                    if (f16 <= 0.0f || d8 > 0.0f) {
                                        float max = d8 / Math.max(0.001f, f16 + d8);
                                        r3 = z3;
                                        while (r3 < 3) {
                                            double d10 = j2;
                                            double d11 = (double) r3;
                                            int i18 = r3;
                                            float sin2 = (((float) Math.sin((d10 / 260.0d) + d11)) * 0.05f) + oo1.g((float) Math.sin((1.9d * d11) + (d10 / ((r3 * 37) + 150.0d))), 0.18f, f26, this.M, 0.28f);
                                            float[] fArr3 = this.P;
                                            fArr3[i18] = tb4.A(Math.max(0.2f, Math.min(1.0f, sin2)), fArr3[i18], 0.3f, fArr3[i18]);
                                            float max2 = (((float) Math.max(0.0d, Math.sin((d10 / 200.0d) - (0.9d * d11)))) * 0.45f) + 0.55f;
                                            float N4 = gl.N(3.2f) * f48;
                                            float R16 = gl.R1((gl.N(10.0f) * fArr3[i18]) + gl.N(6.5f), gl.N(4.2f), max) * f48;
                                            float R17 = (gl.R1(gl.N(6.0f), gl.N(6.5f), max) * (i18 - 1) * f48) + f19;
                                            float f58 = N4 / 2.0f;
                                            float f59 = R16 / 2.0f;
                                            RectF rectF2 = this.w;
                                            rectF2.set(R17 - f58, f20 - f59, R17 + f58, f59 + f20);
                                            float f60 = f16;
                                            int R18 = (int) (gl.R1(1.0f, max2, max) * Math.max(f60, d8) * (1.0f - f29) * f17 * f * f57);
                                            Paint paint8 = this.h;
                                            paint8.setAlpha(R18);
                                            canvas.drawRoundRect(rectF2, f58, f58, paint8);
                                            f16 = f60;
                                            r3 = i18 + 1;
                                            f26 = 0.62f;
                                        }
                                    }
                                    d3 = interpolation < f9 ? 1.0f - f14 : lmVar2.d(this.L == 3 ? true : z3);
                                    if (d3 > 0.01f) {
                                        Paint.Style style = Paint.Style.STROKE;
                                        Paint paint9 = this.P0;
                                        paint9.setStyle(style);
                                        paint9.setStrokeCap(Paint.Cap.ROUND);
                                        paint9.setStrokeWidth(gl.N(2.0f));
                                        paint9.setColor(-1);
                                        paint9.setAlpha((int) (d3 * f * f17));
                                        float R19 = gl.R1(0.7f, 1.0f, d3) * gl.N(8.5f);
                                        this.Q0.set(f19 - R19, f20 - R19, f19 + R19, R19 + f20);
                                        long j5 = j2 - this.R0;
                                        float f61 = ((j5 % 1400) / 1400.0f) * 2.0f;
                                        float min5 = Math.min(1.0f, f61);
                                        float B = yjb.B(min5, 2.0f, 3.0f, min5 * min5);
                                        float max3 = Math.max(0.0f, f61 - 1.0f);
                                        float f62 = ((j5 / 1400) % 18) * 220.0f;
                                        float B2 = (yjb.B(max3, 2.0f, 3.0f, max3 * max3) * 220.0f) + f62;
                                        canvas.drawArc(this.Q0, (((((j5 % 6000) / 6000.0f) * 360.0f) * 5.0f) + B2) % 360.0f, (((B * 220.0f) + f62) + 30.0f) - B2, false, paint9);
                                    }
                                    if (f15 > 0.0f) {
                                        Drawable drawable2 = this.n;
                                        int intrinsicWidth3 = drawable2.getIntrinsicWidth();
                                        int intrinsicHeight3 = drawable2.getIntrinsicHeight();
                                        if (z9) {
                                            i5 = i10;
                                            i4 = i11;
                                        } else {
                                            i4 = (int) (f20 - (intrinsicHeight3 / 2.0f));
                                            i5 = (int) (f19 - (intrinsicWidth3 / 2.0f));
                                        }
                                        drawable2.setBounds(i5, i4, i5 + intrinsicWidth3, i4 + intrinsicHeight3);
                                        if (this.L0) {
                                            f30 = 1.0f;
                                            f31 = 1.0f - f29;
                                        } else {
                                            f30 = 1.0f;
                                            f31 = 1.0f;
                                        }
                                        float R110 = gl.R1(0.6f, f30, f15 * f31) * f48;
                                        canvas.save();
                                        if (R110 != f30) {
                                            canvas.scale(R110, R110, (intrinsicWidth3 / 2.0f) + i5, (intrinsicHeight3 / 2.0f) + i4);
                                        }
                                        drawable2.setAlpha((int) yjb.C(f15, f, f31, f17));
                                        drawable2.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                            }
                            f28 = 1.0f;
                            if (cos < f28) {
                            }
                            if (this.L0) {
                            }
                            z4 = this.L0;
                            if (z4) {
                            }
                            f29 = f24;
                            if (z4) {
                                int intrinsicWidth22 = drawable.getIntrinsicWidth();
                                int intrinsicHeight22 = this.J0.getIntrinsicHeight();
                                float R142 = gl.R1(0.6f, 1.0f, f29);
                                canvas.save();
                                canvas.scale(R142, R142, f19, f20);
                                int i162 = (int) (f19 - (intrinsicWidth22 / 2.0f));
                                int i172 = (int) (f20 - (intrinsicHeight22 / 2.0f));
                                this.J0.setBounds(i162, i172, intrinsicWidth22 + i162, intrinsicHeight22 + i172);
                                this.J0.setAlpha((int) (f29 * f * f23));
                                this.J0.draw(canvas);
                                canvas.restore();
                            }
                            if (i3 >= 0) {
                            }
                            if (f16 <= 0.0f) {
                            }
                            float max4 = d8 / Math.max(0.001f, f16 + d8);
                            r3 = z3;
                            while (r3 < 3) {
                            }
                            if (interpolation < f9) {
                            }
                            if (d3 > 0.01f) {
                            }
                            if (f15 > 0.0f) {
                            }
                        } else {
                            f26 = 0.62f;
                            paint5.setShader(null);
                            int i19 = this.e1;
                            if (i19 == 0) {
                                i19 = -12939546;
                            }
                            paint5.setColor(i19);
                            paint5.setAlpha((int) (f22 * f));
                            canvas.drawCircle(f19, f20, f50, paint5);
                            this.s0 = null;
                            f23 = f21;
                            f24 = d;
                            f25 = f18;
                        }
                    }
                    f27 = 0.4f;
                    if (cos < 1.0f) {
                        float f562 = cos / 0.5f;
                        min2 = 1.0f - Math.min(1.0f, f562);
                        if (min2 <= 0.0f) {
                        }
                    }
                    f28 = 1.0f;
                    if (cos < f28) {
                    }
                    if (this.L0) {
                    }
                    z4 = this.L0;
                    if (z4) {
                    }
                    f29 = f24;
                    if (z4) {
                    }
                    if (i3 >= 0) {
                    }
                    if (f16 <= 0.0f) {
                    }
                    float max42 = d8 / Math.max(0.001f, f16 + d8);
                    r3 = z3;
                    while (r3 < 3) {
                    }
                    if (interpolation < f9) {
                    }
                    if (d3 > 0.01f) {
                    }
                    if (f15 > 0.0f) {
                    }
                }
            }
            z2 = false;
            if (z2) {
            }
            float d72 = this.H.d(this.L != 0 ? true : z3);
            float d82 = this.I.d(this.L != 1 ? true : z3);
            j = this.b1;
            lm lmVar52 = this.J;
            int i102 = i;
            lmVar = this.O0;
            int i112 = i2;
            lm lmVar62 = this.N0;
            if (j != 0) {
            }
            if (interpolation < f9) {
            }
            float interpolation22 = s33.k.getInterpolation(Math.min(1.0f, d4));
            if (this.A0) {
            }
            f10 = 1.0f;
            f11 = 1.0f;
            float f482 = f11 * (this.Q != 2 ? f10 - (0.08f * f5) : f10);
            float f492 = f7 * f482;
            boolean z92 = z2;
            if (!this.A0) {
            }
            this.m1 = f8;
            this.n1 = height;
            if (cos >= 1.0f) {
            }
            float f502 = f492;
            f13 = height;
            f14 = interpolation;
            f15 = d9;
            this.s.set(f12 - gl.L(24.0f), f13 - gl.L(24.0f), gl.L(24.0f) + f12, gl.L(24.0f) + f13);
            if (this.A0) {
            }
            if (!this.L0) {
            }
            float f512 = this.O;
            A = tb4.A(0.0f, f512, 0.25f, f512);
            this.O = A;
            if (A <= 0.01f) {
            }
            if (this.L0) {
            }
            lmVar2 = lmVar;
            f17 = min;
            f18 = 2.0f;
            f19 = f12;
            f20 = f13;
            f21 = f17;
            i3 = -1;
            Paint paint42 = this.e;
            int alpha2 = paint42.getAlpha();
            int color22 = paint42.getColor();
            if (cos < 1.0f) {
            }
            paint42.setAlpha((int) (alpha2 * f21));
            canvas.drawCircle(f19, f20, f502, paint42);
            paint42.setColor(color22);
            paint42.setAlpha(alpha2);
            float f522 = f21 * cos;
            if (interpolation < f9) {
            }
            f22 = f522 * d2;
            if (f22 > 0.01f) {
            }
            f23 = f21;
            f24 = d;
            f25 = f18;
            f26 = 0.62f;
            f27 = 0.4f;
            if (cos < 1.0f) {
            }
            f28 = 1.0f;
            if (cos < f28) {
            }
            if (this.L0) {
            }
            z4 = this.L0;
            if (z4) {
            }
            f29 = f24;
            if (z4) {
            }
            if (i3 >= 0) {
            }
            if (f16 <= 0.0f) {
            }
            float max422 = d82 / Math.max(0.001f, f16 + d82);
            r3 = z3;
            while (r3 < 3) {
            }
            if (interpolation < f9) {
            }
            if (d3 > 0.01f) {
            }
            if (f15 > 0.0f) {
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.y) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Q = f(motionEvent.getX(), motionEvent.getY());
            invalidate();
            if (this.Q < 0) {
                return false;
            }
        } else if (actionMasked == 1) {
            int f = f(motionEvent.getX(), motionEvent.getY());
            int i = this.Q;
            this.Q = -1;
            invalidate();
            if (i >= 0 && i == f) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                jm3 jm3Var = this.a;
                if (i == 0) {
                    jm3Var.t();
                } else if (i == 1) {
                    jm3Var.u();
                } else {
                    d dVar = jm3Var.f;
                    byte b = jm3Var.r;
                    if (b == 1) {
                        Editable text = dVar.a.F0.getText();
                        if (jm3Var.s.getRightMode() == 2 || (text != null && ((jm3Var.x() > 0 || jm3Var.N > 0) && text.toString().trim().length() > 0))) {
                            jm3Var.B();
                        }
                    } else if (b == 3) {
                        dVar.a.u1();
                    }
                }
            }
        } else {
            if (actionMasked == 3) {
                this.Q = -1;
                invalidate();
            }
            if (this.Q < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0 && getVisibility() == 0) {
            h();
        }
    }

    public void setBorderColorSource(km3 km3Var) {
        this.V0 = km3Var;
    }

    public void setBubbleProvider(lm3 lm3Var) {
        this.d1 = lm3Var;
    }

    public void setCancelShown(boolean z) {
        this.E = z;
        if (!z) {
            this.R = false;
        }
        invalidate();
    }

    public void setDayIconBase(int i) {
        this.h1 = (-16777216) | i;
        this.i1 = i;
    }

    public void setHandOff(boolean z) {
        this.l1 = z;
        invalidate();
    }

    public void setLevel(float f) {
        this.N = f;
    }

    public void setRightMode(int i) {
        if (this.L == i) {
            return;
        }
        this.L = i;
        invalidate();
    }

    public void setSendIconColor(int i) {
        this.n.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    public void setShown(boolean z) {
        if (this.y == z && this.E == z) {
            return;
        }
        this.y = z;
        this.E = z;
        if (z) {
            setVisibility(0);
            h();
            this.G.e(true, 0.0f);
            this.L0 = false;
            this.l1 = false;
            this.M0.e(true, 0.0f);
            this.G0 = 0L;
            this.F.e(true, this.A0 ? 1.0f : 0.0f);
            this.L = 0;
            this.H.e(true, 1.0f);
            this.I.e(true, 0.0f);
            this.J.e(true, 0.0f);
        }
        invalidate();
    }

    public void setStopGlass(il0 il0Var) {
        this.W0 = il0Var;
        if (il0Var != null) {
            il0Var.r(0.0f);
            il0Var.X = 0.0f;
        }
    }

    public void setStopIsland(boolean z) {
        if (this.l0 == z) {
            return;
        }
        this.l0 = z;
        lm lmVar = this.g0;
        if (z) {
            lmVar.e(true, 0.0f);
            this.h0.e(true, 0.0f);
        } else {
            float f = lmVar.c;
            this.i0 = f;
            lmVar.e(true, f);
        }
        invalidate();
    }
}
