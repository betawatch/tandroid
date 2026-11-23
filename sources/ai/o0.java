package ai;

import a8.sa;
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
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.zg;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class o0 extends View {
    public boolean A0;
    public float B0;
    public float C0;
    public float D0;
    public boolean E;
    public int E0;
    public final c6 F;
    public long F0;
    public final c6 G;
    public long G0;
    public final c6 H;
    public long H0;
    public final c6 I;
    public long I0;
    public final c6 J;
    public Drawable J0;
    public final c6 K;
    public final int[] K0;
    public int L;
    public boolean L0;
    public float M;
    public final c6 M0;
    public float N;
    public final c6 N0;
    public float O;
    public final c6 O0;
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
    public m0 V0;
    public nh0 W;
    public fh.g W0;
    public final Path X0;
    public Paint Y0;
    public float Z0;
    public final l0 a;
    public int a0;
    public float a1;
    public ge b;
    public final Paint b0;
    public long b1;
    public pe c;
    public final Paint c0;
    public long c1;
    public final Paint d;
    public final Paint d0;
    public n0 d1;
    public final Paint e;
    public final Paint e0;
    public int e1;
    public final Paint f;
    public final Paint f0;
    public int f1;
    public final c6 g0;
    public int g1;
    public final Paint h;
    public final c6 h0;
    public int h1;
    public float i0;
    public int i1;
    public float j0;
    public boolean j1;
    public float k0;
    public final sa k1;
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

    public o0(Context context, l0 l0Var) {
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
        kr krVar = kr.g;
        this.F = new c6(this, 0L, 220L, krVar);
        kr krVar2 = kr.h;
        this.G = new c6(this, 0L, 320L, krVar2);
        kr krVar3 = kr.j;
        this.H = new c6(this, 0L, 200L, krVar3);
        this.I = new c6(this, 0L, 300L, krVar2);
        this.J = new c6(this, 0L, 200L, krVar3);
        this.K = new c6(this, 0L, 160L, krVar2);
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
        this.g0 = new c6(this, 0L, 320L, new kr(0.25d, 0.1d, 0.25d, 1.0d));
        this.h0 = new c6(this, 0L, 150L, krVar);
        this.m0 = new RectF();
        this.n0 = new RectF();
        this.o0 = new int[2];
        this.v0 = new Paint(1);
        this.w0 = new Paint(1);
        this.x0 = new Matrix();
        this.z0 = new float[5];
        this.K0 = new int[2];
        this.M0 = new c6(this, 0L, 220L, krVar);
        this.N0 = new c6(this, 0L, 420L, krVar3);
        this.O0 = new c6(this, 0L, 260L, krVar);
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
        this.k1 = new sa(this, 2);
        this.a = l0Var;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
        paint2.setColor(-1);
        Drawable g10 = i5.c.g(context, R.drawable.send_plane_24);
        this.n = g10;
        g10.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public final boolean a(View view, float[] fArr) {
        if (view == null || view.getWidth() == 0) {
            return false;
        }
        float width = view.getWidth() / 2.0f;
        float height = view.getHeight() / 2.0f;
        ViewParent parent = getParent();
        while (view != null && view != parent) {
            width += view.getTranslationX() + view.getLeft();
            height += view.getTranslationY() + view.getTop();
            Object parent2 = view.getParent();
            view = parent2 instanceof View ? (View) parent2 : null;
        }
        if (view == null) {
            return false;
        }
        fArr[0] = width - getLeft();
        fArr[1] = height - getTop();
        return true;
    }

    public final int b(int i7) {
        if (this.p0) {
            return g(i7);
        }
        float max = Math.max(0.0f, Math.min(1.0f, this.a1)) * r0.c(11);
        return max <= 0.004f ? this.i1 : i0.a.f(max, this.i1, i0.a.f(0.5f, i7, this.g1) | (-16777216));
    }

    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, int i7, float f14) {
        if (f14 <= 0.01f) {
            return;
        }
        int i10 = (i7 & 16316664) | (-16777216);
        SparseArray sparseArray = this.T0;
        SweepGradient sweepGradient = (SweepGradient) sparseArray.get(i10);
        if (sweepGradient == null) {
            int i11 = 16777215 & i10;
            SweepGradient sweepGradient2 = new SweepGradient(0.0f, 0.0f, new int[]{i11, i10, i11, i11}, new float[]{0.0f, 0.19444445f, 0.3888889f, 1.0f});
            if (sparseArray.size() > 256) {
                sparseArray.clear();
            }
            sparseArray.put(i10, sweepGradient2);
            sweepGradient = sweepGradient2;
        }
        float f15 = f13 - 70.0f;
        Matrix matrix = this.S0;
        matrix.setRotate(f15);
        matrix.postTranslate(f10, f11);
        sweepGradient.setLocalMatrix(matrix);
        Paint paint = this.U0;
        paint.setShader(sweepGradient);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(1.1f)));
        paint.setColor(-1);
        paint.setAlpha((int) (Math.min(1.0f, f14) * 255.0f));
        RectF rectF = this.w;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f11 + f12);
        canvas.drawArc(rectF, f15, 140.0f, false, paint);
        paint.setShader(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x039d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Canvas canvas) {
        float f10;
        boolean z10;
        float f11;
        float f12;
        float f13;
        int[] iArr;
        float f14;
        boolean z11;
        float f15;
        float f16;
        int[] iArr2;
        float max;
        int i7;
        int i10;
        float f17;
        Canvas canvas2 = canvas;
        float d = this.l0 ? this.g0.d(true) : this.i0;
        float d2 = this.h0.d(!this.l0);
        boolean z12 = this.l0;
        RectF rectF = this.m0;
        if ((!z12 && d2 >= 1.0f) || d <= 0.005f || this.m1 == 0.0f) {
            rectF.setEmpty();
            return;
        }
        float L = ((this.n1 - org.telegram.messenger.g0.L(19.0f)) - org.telegram.messenger.g0.L(9.0f)) - org.telegram.messenger.g0.L(18.0f);
        n0 n0Var = this.d1;
        int[] iArr3 = this.o0;
        if (n0Var != null) {
            l0 l0Var = (l0) ((cb.c) n0Var).b;
            RectF rectF2 = this.n0;
            if (l0Var.k(rectF2)) {
                getLocationInWindow(iArr3);
                L = ((rectF2.top - iArr3[1]) - org.telegram.messenger.g0.L(9.0f)) - org.telegram.messenger.g0.L(18.0f);
            }
        }
        float f18 = this.m1;
        boolean z13 = this.A0;
        float f19 = z13 ? this.B0 : f18;
        float f20 = z13 ? this.C0 : this.n1;
        float T1 = org.telegram.messenger.g0.T1(f19, f18, d);
        float T12 = org.telegram.messenger.g0.T1(f20, L, d);
        boolean z14 = this.l0;
        if (z14) {
            this.j0 = T1;
            this.k0 = T12;
        } else {
            float f21 = this.j0;
            if (f21 != 0.0f) {
                T12 = this.k0;
                f10 = f21;
                float f22 = T12;
                float T13 = !z14 ? 1.0f : org.telegram.messenger.g0.T1(1.0f, 0.6f, d2);
                float T14 = org.telegram.messenger.g0.T1(!this.A0 ? Math.min(this.D0, org.telegram.messenger.g0.N(26.0f)) : org.telegram.messenger.g0.N(19.0f), org.telegram.messenger.g0.N(18.0f), Math.min(1.0f, d)) * (this.Q != 1 ? 1.0f - (this.K.c * 0.08f) : 1.0f) * T13;
                float min = Math.min(1.0f, 1.5f * d) * (!this.l0 ? 1.0f : 1.0f - d2);
                rectF.set(f10 - org.telegram.messenger.g0.L(22.0f), f22 - org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f) + f10, org.telegram.messenger.g0.L(22.0f) + f22);
                z10 = this.p0;
                Paint paint = this.d0;
                if (z10) {
                    float N = org.telegram.messenger.g0.N(8.0f);
                    float N2 = org.telegram.messenger.g0.N(2.0f);
                    float f23 = 41.0f * min;
                    f11 = 1.0f;
                    if (this.l0) {
                        f17 = 1.0f;
                    } else {
                        float f24 = 1.0f - d2;
                        f17 = f24 * f24;
                    }
                    paint.setShadowLayer(N, 0.0f, N2, i0.a.o(-16777216, (int) (f23 * f17)));
                } else {
                    f11 = 1.0f;
                    paint.setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, org.telegram.messenger.g0.N(0.33333334f), i0.a.o(-16777216, (int) ((this.p0 ? ks.n1 : 51) * min)));
                }
                paint.setColor(16777216);
                Path path = this.X0;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addCircle(f10, f22, T14, direction);
                canvas2.save();
                if (Build.VERSION.SDK_INT < 26) {
                    canvas2.clipOutPath(path);
                } else {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                }
                canvas2.drawCircle(f10, f22, T14, paint);
                canvas2.restore();
                if (this.W0 == null) {
                    int L2 = org.telegram.messenger.g0.L(6.0f);
                    float f25 = L2 + 2;
                    float f26 = f10 - T14;
                    float f27 = f26 - f25;
                    float f28 = f22 - T14;
                    float f29 = f28 - f25;
                    float f30 = f10 + T14;
                    float f31 = f30 + f25;
                    f12 = d;
                    float f32 = f22 + T14;
                    float f33 = f32 + f25;
                    f13 = d2;
                    iArr = iArr3;
                    f14 = 0.6f;
                    int saveLayerAlpha = canvas2.saveLayerAlpha(f27, f29, f31, f33, (int) (((this.l0 || this.p0) ? min : min * min) * 255.0f));
                    this.W0.setBounds(((int) f26) - L2, ((int) f28) - L2, ((int) f30) + L2, ((int) f32) + L2);
                    this.W0.setAlpha(ks.e4);
                    this.W0.draw(canvas2);
                    if (this.Y0 == null) {
                        Paint paint2 = new Paint(1);
                        this.Y0 = paint2;
                        paint2.setColor(-16777216);
                        this.Y0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    path.rewind();
                    T14 = T14;
                    path.addCircle(f10, f22, T14, direction);
                    path.setFillType(Path.FillType.INVERSE_WINDING);
                    canvas2.save();
                    canvas2.clipRect(f27, f29, f31, f33);
                    canvas2.drawPath(path, this.Y0);
                    canvas2.restore();
                    path.setFillType(Path.FillType.WINDING);
                    canvas2.restoreToCount(saveLayerAlpha);
                } else {
                    f12 = d;
                    f13 = d2;
                    iArr = iArr3;
                    f14 = 0.6f;
                }
                z11 = this.p0;
                Paint paint3 = this.b0;
                if (!z11) {
                    int color = paint3.getColor();
                    paint3.setColor(-989855745);
                    paint3.setAlpha((int) (196.0f * min));
                    canvas2.drawCircle(f10, f22, T14, paint3);
                    paint3.setColor(color);
                    Paint paint4 = this.c0;
                    int color2 = paint4.getColor();
                    float strokeWidth = paint4.getStrokeWidth();
                    paint4.setColor(385875968);
                    paint4.setAlpha((int) (23.0f * min));
                    paint4.setStrokeWidth(Math.max(f11, org.telegram.messenger.g0.N(0.5f)));
                    canvas2.drawCircle(f10, f22, T14, paint4);
                    paint4.setStrokeWidth(strokeWidth);
                    paint4.setColor(color2);
                }
                if (this.p0) {
                    f15 = f22;
                    f16 = f10;
                    iArr2 = iArr;
                } else {
                    int alpha = paint3.getAlpha();
                    paint3.setAlpha((int) (alpha * min));
                    canvas2.drawCircle(f10, f22, T14, paint3);
                    paint3.setAlpha(alpha);
                    float f34 = T14;
                    float f35 = f10;
                    d2.a(canvas2, f10 - T14, f22 - T14, f10 + T14, f22 + T14, f34, this.p0, this.a1 * min, this.Z0);
                    float max2 = Math.max(0.0f, Math.min(1.0f, this.a1));
                    if (max2 <= 0.01f || this.V0 == null) {
                        iArr2 = iArr;
                        i7 = -1;
                        i10 = -1;
                    } else {
                        iArr2 = iArr;
                        getLocationInWindow(iArr2);
                        int b10 = ((w) this.V0).b(f35 + iArr2[0], (iArr2[1] + f22) - f34);
                        int b11 = ((w) this.V0).b(f35 + iArr2[0], iArr2[1] + f22 + f34);
                        i7 = b10 != 0 ? i0.a.f(com.google.android.gms.internal.vision.e2.B(this.Z0, 0.2f, 0.8f, max2), -1, g(b10)) : -1;
                        i10 = b11 != 0 ? i0.a.f(com.google.android.gms.internal.vision.e2.B(this.Z0, 0.2f, 0.8f, max2), -1, g(b11)) : -1;
                    }
                    f16 = f35;
                    f15 = f22;
                    c(canvas, f16, f15, f34 - org.telegram.messenger.g0.N(f14), -90.0f, i7, min * (this.p0 ? 0.85f : 0.95f));
                    canvas2 = canvas;
                    c(canvas2, f16, f15, f34 - org.telegram.messenger.g0.N(f14), 90.0f, i10, min * (this.p0 ? 0.35f : 0.45f));
                }
                max = Math.max(0.0f, Math.min(1.0f, (f12 - 0.15f) / f14)) * min * (this.l0 ? 1.0f : org.telegram.ui.Cells.c0.B(f13, 0.4f, 1.0f, 0.0f));
                if (max <= 0.0f) {
                    m0 m0Var = this.V0;
                    Paint paint5 = this.e0;
                    if (m0Var != null) {
                        getLocationInWindow(iArr2);
                        int b12 = ((w) this.V0).b(f16 + iArr2[0], f15 + iArr2[1]);
                        if (b12 != 0) {
                            paint5.setColor(b(b12));
                        }
                    }
                    int alpha2 = paint5.getAlpha();
                    paint5.setAlpha((int) (alpha2 * max));
                    float N3 = org.telegram.messenger.g0.N(5.5f);
                    if (this.l0) {
                        T13 = org.telegram.messenger.g0.T1(0.5f, 1.0f, max);
                    }
                    float f36 = N3 * T13;
                    RectF rectF3 = this.w;
                    rectF3.set(f16 - f36, f15 - f36, f16 + f36, f15 + f36);
                    canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.N(2.4f), org.telegram.messenger.g0.N(2.4f), paint5);
                    paint5.setAlpha(alpha2);
                    return;
                }
                return;
            }
        }
        f10 = T1;
        float f222 = T12;
        if (!z14) {
        }
        float T142 = org.telegram.messenger.g0.T1(!this.A0 ? Math.min(this.D0, org.telegram.messenger.g0.N(26.0f)) : org.telegram.messenger.g0.N(19.0f), org.telegram.messenger.g0.N(18.0f), Math.min(1.0f, d)) * (this.Q != 1 ? 1.0f - (this.K.c * 0.08f) : 1.0f) * T13;
        float min2 = Math.min(1.0f, 1.5f * d) * (!this.l0 ? 1.0f : 1.0f - d2);
        rectF.set(f10 - org.telegram.messenger.g0.L(22.0f), f222 - org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f) + f10, org.telegram.messenger.g0.L(22.0f) + f222);
        z10 = this.p0;
        Paint paint6 = this.d0;
        if (z10) {
        }
        paint6.setColor(16777216);
        Path path2 = this.X0;
        path2.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path2.addCircle(f10, f222, T142, direction2);
        canvas2.save();
        if (Build.VERSION.SDK_INT < 26) {
        }
        canvas2.drawCircle(f10, f222, T142, paint6);
        canvas2.restore();
        if (this.W0 == null) {
        }
        z11 = this.p0;
        Paint paint32 = this.b0;
        if (!z11) {
        }
        if (this.p0) {
        }
        max = Math.max(0.0f, Math.min(1.0f, (f12 - 0.15f) / f14)) * min2 * (this.l0 ? 1.0f : org.telegram.ui.Cells.c0.B(f13, 0.4f, 1.0f, 0.0f));
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

    public final int f(float f10, float f11) {
        if (this.l0) {
            RectF rectF = this.m0;
            if (!rectF.isEmpty() && this.g0.c > 0.7f && rectF.contains(f10, f11)) {
                return 1;
            }
        }
        if (this.F.c >= 0.6f && this.y) {
            RectF rectF2 = this.r;
            if (!rectF2.isEmpty() && this.E && rectF2.contains(f10, f11)) {
                return 0;
            }
            if (this.s.contains(f10, f11)) {
                return 2;
            }
        }
        return -1;
    }

    public final int g(int i7) {
        if (this.p0) {
            return i0.a.f(0.4f, i7, -1);
        }
        return i0.a.f(r0.c(11), this.h1, i0.a.f(0.5f, i7, this.g1));
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
    /* JADX WARN: Removed duplicated region for block: B:100:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0794 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0851 A[LOOP:1: B:183:0x084e->B:185:0x0851, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0503  */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27, types: [int] */
    /* JADX WARN: Type inference failed for: r2v66, types: [android.view.ViewGroup, java.lang.Object, org.telegram.ui.Components.pe] */
    /* JADX WARN: Type inference failed for: r2v86 */
    /* JADX WARN: Type inference failed for: r3v135 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v92, types: [int] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float T1;
        float f16;
        float f17;
        float f18;
        nh0 nh0Var;
        boolean z11;
        boolean z12;
        int i7;
        int i10;
        long j3;
        float f19;
        float f20;
        float f21;
        float interpolation;
        float f22;
        float f23;
        float cos;
        float f24;
        float f25;
        float f26;
        float z13;
        long j10;
        float f27;
        boolean z14;
        c6 c6Var;
        float f28;
        boolean z15;
        long j11;
        float f29;
        float f30;
        int i11;
        float f31;
        float d;
        float f32;
        float f33;
        long j12;
        float f34;
        float f35;
        float f36;
        View view;
        boolean z16;
        int i12;
        Drawable drawable;
        ?? r22;
        float d2;
        float f37;
        int i13;
        float f38;
        float f39;
        float min;
        Canvas canvas2 = canvas;
        float d10 = this.F.d(this.y);
        if (d10 <= 0.0f && !this.y) {
            setVisibility(8);
            return;
        }
        float f40 = this.M;
        this.M = com.google.android.gms.internal.vision.e2.z(this.N, f40, 0.2f, f40);
        long uptimeMillis = SystemClock.uptimeMillis();
        float d11 = this.K.d(this.Q >= 0);
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (this.I0 == 0) {
            this.I0 = uptimeMillis2;
        }
        long min2 = Math.min(20L, uptimeMillis2 - this.I0) + this.H0;
        this.H0 = min2;
        this.I0 = uptimeMillis2;
        if (this.F0 == 0) {
            this.F0 = min2 + 1;
        }
        if (this.G0 == 0) {
            this.G0 = 1 + min2;
        }
        boolean z17 = this.E;
        c6 c6Var2 = this.G;
        if (!z17 || this.L0) {
            z10 = true;
            f10 = 0.5f;
            f11 = 2.0f;
        } else {
            f10 = 0.5f;
            f11 = 2.0f;
            float C = a8.p0.C(min2 - this.G0, 170.0f, 1.0f, 0.0f);
            z10 = true;
            c6Var2.e(true, C < 0.5f ? com.google.android.gms.internal.vision.e2.D(C, 4.0f, C, C) : 1.0f - (((float) Math.pow((C * (-2.0f)) + 2.0f, 3.0d)) / 2.0f));
        }
        boolean z18 = this.L0;
        c6 c6Var3 = this.M0;
        float d12 = z18 ? (1.0f - c6Var3.d(z10)) * c6Var2.c : c6Var2.d(this.E);
        boolean z19 = this.R;
        float f41 = d12 * ((z19 && this.E) ? 1.0f : d10);
        RectF rectF = this.r;
        int[] iArr = this.o0;
        float[] fArr = this.x;
        if ((f41 > 0.0f || (z19 && this.E)) && a(this.b, fArr)) {
            float f42 = fArr[0];
            float f43 = fArr[1];
            f12 = 255.0f;
            f13 = 0.25f;
            f14 = 0.0f;
            rectF.set(f42 - org.telegram.messenger.g0.L(22.0f), f43 - org.telegram.messenger.g0.L(22.0f), org.telegram.messenger.g0.L(22.0f) + f42, org.telegram.messenger.g0.L(22.0f) + f43);
            boolean z20 = this.L0;
            float f44 = z20 ? c6Var3.c : 0.0f;
            if (z20) {
                f42 = fArr[0];
                f43 = fArr[1];
                f16 = f44 * 30.0f;
                f15 = 1.0f;
                T1 = org.telegram.messenger.g0.T1(1.0f, 0.6f, f44);
            } else {
                f15 = 1.0f;
                if (this.R && this.E) {
                    f42 = org.telegram.messenger.g0.T1(this.S, f42, f41);
                    f43 = org.telegram.messenger.g0.T1(this.T, f43, f41);
                    float f45 = f41 / 0.55f;
                    float min3 = 1.0f - Math.min(1.0f, f45);
                    if (min3 > 0.0f) {
                        int i14 = (int) (min3 * 255.0f);
                        Paint paint = this.U;
                        paint.setAlpha(i14);
                        canvas2.drawCircle(f42, f43, org.telegram.messenger.g0.T1(1.0f, 0.35f, Math.min(1.0f, f45)) * org.telegram.messenger.g0.N(5.0f), paint);
                    }
                    f16 = (-90.0f) * (1.0f - f41);
                    T1 = org.telegram.messenger.g0.T1(0.35f, 1.0f, f41);
                } else {
                    T1 = org.telegram.messenger.g0.T1(f10, 1.0f, kr.k.getInterpolation(f41));
                    f16 = 0.0f;
                }
            }
            float f46 = T1 * (this.Q == 0 ? f15 - (0.12f * d11) : 1.0f);
            Paint paint2 = this.d;
            int color = paint2.getColor();
            if (this.V0 != null) {
                getLocationInWindow(iArr);
                f17 = d11;
                f18 = f41;
                int b10 = ((w) this.V0).b(iArr[0] + f42, iArr[1] + f43);
                if (b10 != 0) {
                    paint2.setColor(b(b10));
                }
            } else {
                f17 = d11;
                f18 = f41;
            }
            paint2.setAlpha((int) (paint2.getAlpha() * (this.L0 ? 1.0f - f44 : Math.min(1.0f, f18 * 1.6f))));
            float N = org.telegram.messenger.g0.N(6.2f) * f46;
            canvas2.save();
            if (this.W == null) {
                try {
                    nh0 nh0Var2 = new nh0(R.raw.chat_audio_record_delete_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
                    this.W = nh0Var2;
                    nh0Var2.J(true);
                    this.W.R(this);
                    this.W.N(0, false, false);
                    this.a0 = 0;
                } catch (Throwable unused) {
                    nh0Var = null;
                }
            }
            nh0Var = this.W;
            if (nh0Var != null) {
                canvas2.rotate(f16 * 0.25f, f42, f43);
                canvas2.scale(f46, f46, f42, f43);
                if (this.a0 != paint2.getColor()) {
                    this.a0 = paint2.getColor();
                    nh0Var.setColorFilter(new PorterDuffColorFilter(this.a0 | (-16777216), PorterDuff.Mode.SRC_IN));
                }
                int L = org.telegram.messenger.g0.L(14.0f);
                int i15 = (int) f42;
                int i16 = (int) f43;
                nh0Var.setBounds(i15 - L, i16 - L, i15 + L, i16 + L);
                nh0Var.setAlpha(paint2.getAlpha());
                nh0Var.draw(canvas2);
            } else {
                canvas2.rotate(f16, f42, f43);
                Path path = this.V;
                path.rewind();
                float f47 = f42 - N;
                float f48 = f43 - N;
                path.moveTo(f47, f48);
                float f49 = f42 + N;
                float f50 = f43 + N;
                path.lineTo(f49, f50);
                path.moveTo(f47, f50);
                path.lineTo(f49, f48);
                canvas2.drawPath(path, paint2);
            }
            canvas2.restore();
            paint2.setColor(color);
        } else {
            f17 = d11;
            f14 = 0.0f;
            f12 = 255.0f;
            f13 = 0.25f;
            rectF.setEmpty();
        }
        d(canvas);
        if (a(this.c, fArr)) {
            float width = (((this.c.getWidth() / f11) + fArr[0]) - org.telegram.messenger.g0.N(3.0f)) - org.telegram.messenger.g0.N(19.0f);
            float height = (((this.c.getHeight() / f11) + fArr[1]) - org.telegram.messenger.g0.N(3.0f)) - org.telegram.messenger.g0.N(19.0f);
            float N2 = org.telegram.messenger.g0.N(19.0f);
            n0 n0Var = this.d1;
            float[] fArr2 = this.z0;
            if (n0Var != null) {
                ChatActivityEnterView chatActivityEnterView = ((l0) ((cb.c) n0Var).b).f.a;
                chatActivityEnterView.I1 = SystemClock.uptimeMillis() + 1500;
                if (chatActivityEnterView.F0(fArr2)) {
                    z11 = true;
                    if (z11) {
                        z12 = false;
                        i7 = 0;
                        i10 = 0;
                    } else {
                        getLocationInWindow(iArr);
                        z12 = false;
                        float f51 = fArr2[0];
                        int i17 = iArr[0];
                        float f52 = fArr2[1];
                        int i18 = iArr[1];
                        float f53 = fArr2[2];
                        i7 = ((int) fArr2[3]) - i17;
                        i10 = ((int) fArr2[4]) - i18;
                        width = f51 - i17;
                        height = f52 - i18;
                        N2 = f53;
                    }
                    float d13 = this.H.d(this.L != 0 ? true : z12);
                    float d14 = this.I.d(this.L != 1 ? true : z12);
                    j3 = this.b1;
                    c6 c6Var4 = this.J;
                    int i19 = i7;
                    c6 c6Var5 = this.O0;
                    int i20 = i10;
                    c6 c6Var6 = this.N0;
                    if (j3 != 0) {
                        f19 = N2;
                        f20 = width;
                        interpolation = -1.0f;
                        f21 = f14;
                    } else {
                        f19 = N2;
                        float f54 = f14;
                        float C2 = a8.p0.C(uptimeMillis - j3, this.c1, 1.0f, f54);
                        if (C2 >= 1.0f) {
                            f20 = width;
                            this.b1 = 0L;
                            this.L = 2;
                            this.l1 = true;
                            c6Var6.e(true, 1.0f);
                            f21 = 0.0f;
                            c6Var5.e(true, 0.0f);
                            c6Var4.e(true, 1.0f);
                            interpolation = 1.0f;
                        } else {
                            f20 = width;
                            f21 = f54;
                            interpolation = kr.j.getInterpolation(C2);
                        }
                    }
                    float d15 = interpolation < f21 ? interpolation : c6Var4.d(this.L == 2 ? true : z12);
                    float interpolation2 = kr.k.getInterpolation(Math.min(1.0f, d10));
                    if (!this.A0 || this.L0) {
                        f22 = 1.0f;
                        f23 = 1.0f;
                    } else {
                        f22 = 1.0f;
                        f23 = org.telegram.messenger.g0.T1(0.7f, 1.0f, interpolation2);
                    }
                    float f55 = f23 * (this.Q != 2 ? f22 - (0.08f * f17) : f22);
                    float f56 = f19 * f55;
                    boolean z21 = z11;
                    cos = !this.A0 ? (float) (0.5d - (Math.cos(a8.p0.C(this.H0 - this.F0, 340.0f, 1.0f, 0.0f) * 3.141592653589793d) * 0.5d)) : 1.0f;
                    this.m1 = f20;
                    this.n1 = height;
                    if (cos >= 1.0f) {
                        float T12 = org.telegram.messenger.g0.T1(this.B0, f20, cos);
                        height = org.telegram.messenger.g0.T1(this.C0, height, cos);
                        f56 = org.telegram.messenger.g0.T1(this.D0, f56, cos);
                        f24 = T12;
                    } else {
                        f24 = f20;
                    }
                    float f57 = f56;
                    float f58 = height;
                    f25 = interpolation;
                    f26 = d15;
                    this.s.set(f24 - org.telegram.messenger.g0.L(24.0f), f58 - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + f24, org.telegram.messenger.g0.L(24.0f) + f58);
                    float min4 = (!this.A0 || this.L0) ? !this.y ? 1.0f : d10 : Math.min(1.0f, d10 * 1.6f);
                    float d16 = !this.L0 ? c6Var3.d(true) : 0.0f;
                    float f59 = this.O;
                    z13 = com.google.android.gms.internal.vision.e2.z(0.0f, f59, f13, f59);
                    this.O = z13;
                    if (z13 <= 0.01f) {
                        f27 = min4;
                        float N3 = (org.telegram.messenger.g0.N(0.3f) * ((float) Math.sin(uptimeMillis / 240.0d))) + (org.telegram.messenger.g0.N(1.8f) * this.O) + org.telegram.messenger.g0.N(0.8f) + f57;
                        j10 = uptimeMillis;
                        int B = (int) com.google.android.gms.internal.vision.e2.B(this.O, 0.3f, 0.22f, f27 * f12);
                        Paint paint3 = this.f;
                        paint3.setAlpha(B);
                        canvas2.drawCircle(f24, f58, N3, paint3);
                    } else {
                        j10 = uptimeMillis;
                        f27 = min4;
                    }
                    z14 = (this.L0 || f27 >= 1.0f) ? z12 : true;
                    if (z14) {
                        c6Var = c6Var5;
                        f28 = d13;
                        z15 = z14;
                        j11 = j10;
                        f29 = f24;
                        f30 = f58;
                        i11 = -1;
                    } else {
                        c6Var = c6Var5;
                        f28 = d13;
                        z15 = z14;
                        f29 = f24;
                        f30 = f58;
                        j11 = j10;
                        canvas2 = canvas;
                        i11 = canvas2.saveLayerAlpha((f24 - f57) - org.telegram.messenger.g0.L(f11), (f58 - f57) - org.telegram.messenger.g0.L(f11), f24 + f57 + org.telegram.messenger.g0.L(f11), f58 + f57 + org.telegram.messenger.g0.L(f11), (int) (f27 * f12));
                    }
                    f31 = !z15 ? 1.0f : f27;
                    Paint paint4 = this.e;
                    int alpha = paint4.getAlpha();
                    int color2 = paint4.getColor();
                    int i21 = i11;
                    if (cos < 1.0f) {
                        paint4.setColor(i0.a.f(cos, this.E0, color2));
                    }
                    paint4.setAlpha((int) (alpha * f31));
                    canvas2.drawCircle(f29, f30, f57, paint4);
                    paint4.setColor(color2);
                    paint4.setAlpha(alpha);
                    float f60 = f31 * cos;
                    if (interpolation < f21) {
                        d = 1.0f - f25;
                    } else if (this.L0) {
                        d = 1.0f - d16;
                    } else {
                        d = 1.0f - c6Var6.d((this.L == 2 && this.l1) ? true : z12);
                    }
                    f32 = f60 * d;
                    if (f32 > 0.01f || this.q0 == 0) {
                        f33 = f31;
                        j12 = j11;
                        f34 = 0.62f;
                    } else {
                        boolean z22 = this.p0;
                        Paint paint5 = this.f0;
                        if (z22) {
                            f34 = 0.62f;
                            LinearGradient linearGradient = this.s0;
                            f35 = 0.4f;
                            Paint paint6 = this.v0;
                            Paint paint7 = this.w0;
                            if (linearGradient == null || this.y0 != z22) {
                                this.y0 = z22;
                                f33 = f31;
                                LinearGradient linearGradient2 = new LinearGradient(-1.0f, 0.0f, 1.0f, 0.0f, new int[]{this.r0, z22 ? q0.e(-13649665) : -15363400, this.q0}, (float[]) null, Shader.TileMode.MIRROR);
                                this.s0 = linearGradient2;
                                paint5.setShader(linearGradient2);
                                j12 = j11;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, new int[]{788529151, 536870911, 234881023, 16777215}, new float[]{0.0f, 0.35f, 0.7f, 1.0f}, tileMode);
                                this.t0 = radialGradient;
                                paint6.setShader(radialGradient);
                                LinearGradient linearGradient3 = new LinearGradient(0.0f, -1.0f, 0.0f, 1.0f, new int[]{1090519039, 184549375, 352321535}, new float[]{0.0f, 0.6f, 1.0f}, tileMode);
                                this.u0 = linearGradient3;
                                paint7.setShader(linearGradient3);
                                paint7.setStyle(Paint.Style.STROKE);
                            } else {
                                f33 = f31;
                                j12 = j11;
                            }
                            float f61 = (j12 % 5000) / 5000.0f;
                            Matrix matrix = this.x0;
                            matrix.setTranslate(f61 * 4.0f, 0.0f);
                            float f62 = 2.6f * f57;
                            matrix.postScale(f62, f62);
                            matrix.postRotate(35.0f);
                            matrix.postTranslate(f29, f30);
                            this.s0.setLocalMatrix(matrix);
                            int i22 = (int) (f32 * f12);
                            paint5.setAlpha(i22);
                            canvas2.drawCircle(f29, f30, f57, paint5);
                            float sin = 0.06f * f57 * ((float) Math.sin(f61 * 3.141592653589793d * 2.0d));
                            float f63 = f57 * 0.62f;
                            matrix.setScale(1.35f * f57, f63);
                            matrix.postTranslate(f29 + sin, f30 - f63);
                            this.t0.setLocalMatrix(matrix);
                            paint6.setAlpha(i22);
                            canvas2.drawCircle(f29, f30, f57, paint6);
                            matrix.setScale(f57, f57);
                            matrix.postTranslate(f29, f30);
                            this.u0.setLocalMatrix(matrix);
                            paint7.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.8f)));
                            paint7.setAlpha(i22);
                            canvas2.drawCircle(f29, f30, f57 - org.telegram.messenger.g0.N(0.4f), paint7);
                            if (cos < 1.0f && this.J0 != null) {
                                float f64 = cos / 0.5f;
                                min = 1.0f - Math.min(1.0f, f64);
                                if (min <= 0.0f) {
                                    int intrinsicWidth = this.J0.getIntrinsicWidth();
                                    int intrinsicHeight = this.J0.getIntrinsicHeight();
                                    float T13 = org.telegram.messenger.g0.T1(1.0f, 0.6f, Math.min(1.0f, f64));
                                    canvas2.save();
                                    canvas2.scale(T13, T13, f29, f30);
                                    int i23 = (int) (f29 - (intrinsicWidth / f11));
                                    int i24 = (int) (f30 - (intrinsicHeight / f11));
                                    this.J0.setBounds(i23, i24, intrinsicWidth + i23, intrinsicHeight + i24);
                                    this.J0.setAlpha((int) (min * f12));
                                    this.J0.draw(canvas2);
                                    canvas2.restore();
                                } else {
                                    f36 = 1.0f;
                                    float x10 = cos < f36 ? 1.0f : org.telegram.ui.Cells.c0.x(cos, f35, 0.6f, 0.0f);
                                    if (this.L0) {
                                        ?? r23 = this.c;
                                        if (com.google.android.gms.internal.vision.e2.s(r23)) {
                                            for (?? r32 = z12; r32 < r23.getChildCount(); r32++) {
                                                View childAt = r23.getChildAt(r32);
                                                if ((childAt instanceof zg) && childAt.getWidth() > 0) {
                                                    view = childAt;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    view = null;
                                    z16 = this.L0;
                                    if (z16 || view == null || d16 <= 0.0f) {
                                        i12 = i21;
                                        if (z16 && (drawable = this.J0) != null && d16 > 0.0f) {
                                            int intrinsicWidth2 = drawable.getIntrinsicWidth();
                                            int intrinsicHeight2 = this.J0.getIntrinsicHeight();
                                            float T14 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d16);
                                            canvas2.save();
                                            canvas2.scale(T14, T14, f29, f30);
                                            int i25 = (int) (f29 - (intrinsicWidth2 / 2.0f));
                                            int i26 = (int) (f30 - (intrinsicHeight2 / 2.0f));
                                            this.J0.setBounds(i25, i26, intrinsicWidth2 + i25, intrinsicHeight2 + i26);
                                            this.J0.setAlpha((int) (d16 * f12 * f33));
                                            this.J0.draw(canvas2);
                                            canvas2.restore();
                                        }
                                    } else {
                                        view.getLocationInWindow(this.K0);
                                        getLocationInWindow(iArr);
                                        float T15 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d16);
                                        i12 = i21;
                                        int saveLayerAlpha = canvas2.saveLayerAlpha(f29 - f57, f30 - f57, f29 + f57, f30 + f57, (int) (d16 * f12 * f33));
                                        canvas2.scale(T15, T15, f29, f30);
                                        m10.k(view.getHeight(), f11, f30, f29 - (view.getWidth() / f11), canvas2);
                                        view.draw(canvas2);
                                        canvas2.restoreToCount(saveLayerAlpha);
                                    }
                                    if (i12 >= 0) {
                                        canvas2.restoreToCount(i12);
                                    }
                                    if (f28 <= 0.0f || d14 > 0.0f) {
                                        float max = d14 / Math.max(0.001f, f28 + d14);
                                        r22 = z12;
                                        while (r22 < 3) {
                                            double d17 = j12;
                                            double d18 = d17 / ((r22 * 37) + 150.0d);
                                            double d19 = (double) r22;
                                            int i27 = r22;
                                            float sin2 = (((float) Math.sin((d17 / 260.0d) + d19)) * 0.05f) + org.telegram.ui.Cells.c0.g((float) Math.sin((1.9d * d19) + d18), 0.18f, f34, this.M, 0.28f);
                                            float[] fArr3 = this.P;
                                            fArr3[i27] = com.google.android.gms.internal.vision.e2.z(Math.max(0.2f, Math.min(1.0f, sin2)), fArr3[i27], 0.3f, fArr3[i27]);
                                            float max2 = (((float) Math.max(0.0d, Math.sin((d17 / 200.0d) - (d19 * 0.9d)))) * 0.45f) + 0.55f;
                                            float N4 = org.telegram.messenger.g0.N(3.2f) * f55;
                                            float T16 = org.telegram.messenger.g0.T1((org.telegram.messenger.g0.N(10.0f) * fArr3[i27]) + org.telegram.messenger.g0.N(6.5f), org.telegram.messenger.g0.N(4.2f), max) * f55;
                                            float T17 = (org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(6.0f), org.telegram.messenger.g0.N(6.5f), max) * (i27 - 1) * f55) + f29;
                                            float f65 = N4 / 2.0f;
                                            float f66 = T16 / 2.0f;
                                            RectF rectF2 = this.w;
                                            rectF2.set(T17 - f65, f30 - f66, T17 + f65, f66 + f30);
                                            float f67 = f28;
                                            int T18 = (int) (org.telegram.messenger.g0.T1(1.0f, max2, max) * Math.max(f67, d14) * (1.0f - d16) * f27 * f12 * x10);
                                            Paint paint8 = this.h;
                                            paint8.setAlpha(T18);
                                            canvas2.drawRoundRect(rectF2, f65, f65, paint8);
                                            f28 = f67;
                                            f34 = 0.62f;
                                            r22 = i27 + 1;
                                        }
                                    }
                                    long j13 = j12;
                                    d2 = interpolation < f21 ? 1.0f - f25 : c6Var.d(this.L == 3 ? true : z12);
                                    if (d2 > 0.01f) {
                                        Paint.Style style = Paint.Style.STROKE;
                                        Paint paint9 = this.P0;
                                        paint9.setStyle(style);
                                        paint9.setStrokeCap(Paint.Cap.ROUND);
                                        paint9.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
                                        paint9.setColor(-1);
                                        paint9.setAlpha((int) (d2 * f12 * f27));
                                        float T19 = org.telegram.messenger.g0.T1(0.7f, 1.0f, d2) * org.telegram.messenger.g0.N(8.5f);
                                        this.Q0.set(f29 - T19, f30 - T19, f29 + T19, T19 + f30);
                                        long j14 = j13 - this.R0;
                                        float f68 = ((j14 % 1400) / 1400.0f) * 2.0f;
                                        float min5 = Math.min(1.0f, f68);
                                        float C3 = com.google.android.gms.internal.vision.e2.C(min5, 2.0f, 3.0f, min5 * min5);
                                        float max3 = Math.max(0.0f, f68 - 1.0f);
                                        float f69 = ((j14 / 1400) % 18) * 220.0f;
                                        float C4 = (com.google.android.gms.internal.vision.e2.C(max3, 2.0f, 3.0f, max3 * max3) * 220.0f) + f69;
                                        canvas2.drawArc(this.Q0, (((((j14 % 6000) / 6000.0f) * 360.0f) * 5.0f) + C4) % 360.0f, (((C3 * 220.0f) + f69) + 30.0f) - C4, false, paint9);
                                    }
                                    if (f26 > 0.0f) {
                                        Drawable drawable2 = this.n;
                                        int intrinsicWidth3 = drawable2.getIntrinsicWidth();
                                        int intrinsicHeight3 = drawable2.getIntrinsicHeight();
                                        if (z21) {
                                            i13 = i19;
                                            f37 = 2.0f;
                                        } else {
                                            f37 = 2.0f;
                                            i13 = (int) (f29 - (intrinsicWidth3 / 2.0f));
                                        }
                                        int i28 = z21 ? i20 : (int) (f30 - (intrinsicHeight3 / f37));
                                        drawable2.setBounds(i13, i28, i13 + intrinsicWidth3, i28 + intrinsicHeight3);
                                        if (this.L0) {
                                            f38 = 1.0f;
                                            f39 = 1.0f - d16;
                                        } else {
                                            f38 = 1.0f;
                                            f39 = 1.0f;
                                        }
                                        float T110 = org.telegram.messenger.g0.T1(0.6f, f38, f26 * f39) * f55;
                                        canvas2.save();
                                        if (T110 != f38) {
                                            canvas2.scale(T110, T110, (intrinsicWidth3 / 2.0f) + i13, (intrinsicHeight3 / 2.0f) + i28);
                                        }
                                        drawable2.setAlpha((int) com.google.android.gms.internal.vision.e2.D(f26, f12, f39, f27));
                                        drawable2.draw(canvas2);
                                        canvas2.restore();
                                    }
                                }
                            }
                            f36 = 1.0f;
                            if (cos < f36) {
                            }
                            if (this.L0) {
                            }
                            view = null;
                            z16 = this.L0;
                            if (z16) {
                            }
                            i12 = i21;
                            if (z16) {
                                int intrinsicWidth22 = drawable.getIntrinsicWidth();
                                int intrinsicHeight22 = this.J0.getIntrinsicHeight();
                                float T142 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d16);
                                canvas2.save();
                                canvas2.scale(T142, T142, f29, f30);
                                int i252 = (int) (f29 - (intrinsicWidth22 / 2.0f));
                                int i262 = (int) (f30 - (intrinsicHeight22 / 2.0f));
                                this.J0.setBounds(i252, i262, intrinsicWidth22 + i252, intrinsicHeight22 + i262);
                                this.J0.setAlpha((int) (d16 * f12 * f33));
                                this.J0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (i12 >= 0) {
                            }
                            if (f28 <= 0.0f) {
                            }
                            float max4 = d14 / Math.max(0.001f, f28 + d14);
                            r22 = z12;
                            while (r22 < 3) {
                            }
                            long j132 = j12;
                            if (interpolation < f21) {
                            }
                            if (d2 > 0.01f) {
                            }
                            if (f26 > 0.0f) {
                            }
                        } else {
                            f34 = 0.62f;
                            paint5.setShader(null);
                            int i29 = this.e1;
                            if (i29 == 0) {
                                i29 = -12939546;
                            }
                            paint5.setColor(i29);
                            paint5.setAlpha((int) (f32 * f12));
                            canvas2.drawCircle(f29, f30, f57, paint5);
                            this.s0 = null;
                            f33 = f31;
                            j12 = j11;
                        }
                    }
                    f35 = 0.4f;
                    if (cos < 1.0f) {
                        float f642 = cos / 0.5f;
                        min = 1.0f - Math.min(1.0f, f642);
                        if (min <= 0.0f) {
                        }
                    }
                    f36 = 1.0f;
                    if (cos < f36) {
                    }
                    if (this.L0) {
                    }
                    view = null;
                    z16 = this.L0;
                    if (z16) {
                    }
                    i12 = i21;
                    if (z16) {
                    }
                    if (i12 >= 0) {
                    }
                    if (f28 <= 0.0f) {
                    }
                    float max42 = d14 / Math.max(0.001f, f28 + d14);
                    r22 = z12;
                    while (r22 < 3) {
                    }
                    long j1322 = j12;
                    if (interpolation < f21) {
                    }
                    if (d2 > 0.01f) {
                    }
                    if (f26 > 0.0f) {
                    }
                }
            }
            z11 = false;
            if (z11) {
            }
            float d132 = this.H.d(this.L != 0 ? true : z12);
            float d142 = this.I.d(this.L != 1 ? true : z12);
            j3 = this.b1;
            c6 c6Var42 = this.J;
            int i192 = i7;
            c6 c6Var52 = this.O0;
            int i202 = i10;
            c6 c6Var62 = this.N0;
            if (j3 != 0) {
            }
            if (interpolation < f21) {
            }
            float interpolation22 = kr.k.getInterpolation(Math.min(1.0f, d10));
            if (this.A0) {
            }
            f22 = 1.0f;
            f23 = 1.0f;
            float f552 = f23 * (this.Q != 2 ? f22 - (0.08f * f17) : f22);
            float f562 = f19 * f552;
            boolean z212 = z11;
            if (!this.A0) {
            }
            this.m1 = f20;
            this.n1 = height;
            if (cos >= 1.0f) {
            }
            float f572 = f562;
            float f582 = height;
            f25 = interpolation;
            f26 = d15;
            this.s.set(f24 - org.telegram.messenger.g0.L(24.0f), f582 - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + f24, org.telegram.messenger.g0.L(24.0f) + f582);
            if (this.A0) {
            }
            if (!this.L0) {
            }
            float f592 = this.O;
            z13 = com.google.android.gms.internal.vision.e2.z(0.0f, f592, f13, f592);
            this.O = z13;
            if (z13 <= 0.01f) {
            }
            if (this.L0) {
            }
            if (z14) {
            }
            if (!z15) {
            }
            Paint paint42 = this.e;
            int alpha2 = paint42.getAlpha();
            int color22 = paint42.getColor();
            int i212 = i11;
            if (cos < 1.0f) {
            }
            paint42.setAlpha((int) (alpha2 * f31));
            canvas2.drawCircle(f29, f30, f572, paint42);
            paint42.setColor(color22);
            paint42.setAlpha(alpha2);
            float f602 = f31 * cos;
            if (interpolation < f21) {
            }
            f32 = f602 * d;
            if (f32 > 0.01f) {
            }
            f33 = f31;
            j12 = j11;
            f34 = 0.62f;
            f35 = 0.4f;
            if (cos < 1.0f) {
            }
            f36 = 1.0f;
            if (cos < f36) {
            }
            if (this.L0) {
            }
            view = null;
            z16 = this.L0;
            if (z16) {
            }
            i12 = i212;
            if (z16) {
            }
            if (i12 >= 0) {
            }
            if (f28 <= 0.0f) {
            }
            float max422 = d142 / Math.max(0.001f, f28 + d142);
            r22 = z12;
            while (r22 < 3) {
            }
            long j13222 = j12;
            if (interpolation < f21) {
            }
            if (d2 > 0.01f) {
            }
            if (f26 > 0.0f) {
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
            int f10 = f(motionEvent.getX(), motionEvent.getY());
            int i7 = this.Q;
            this.Q = -1;
            invalidate();
            if (i7 >= 0 && i7 == f10) {
                try {
                    performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                l0 l0Var = this.a;
                if (i7 == 0) {
                    l0Var.q();
                } else if (i7 == 1) {
                    l0Var.s();
                } else {
                    rf rfVar = l0Var.f;
                    int i10 = l0Var.r;
                    if (i10 == 1) {
                        Editable text = rfVar.a.F0.getText();
                        if (l0Var.s.getRightMode() == 2 || (text != null && ((l0Var.v() > 0 || l0Var.N > 0) && text.toString().trim().length() > 0))) {
                            l0Var.z();
                        }
                    } else if (i10 == 3) {
                        rfVar.a.w1();
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
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        if (i7 == 0 && getVisibility() == 0) {
            h();
        }
    }

    public void setBorderColorSource(m0 m0Var) {
        this.V0 = m0Var;
    }

    public void setBubbleProvider(n0 n0Var) {
        this.d1 = n0Var;
    }

    public void setCancelShown(boolean z10) {
        this.E = z10;
        if (!z10) {
            this.R = false;
        }
        invalidate();
    }

    public void setDayIconBase(int i7) {
        this.h1 = (-16777216) | i7;
        this.i1 = i7;
    }

    public void setHandOff(boolean z10) {
        this.l1 = z10;
        invalidate();
    }

    public void setLevel(float f10) {
        this.N = f10;
    }

    public void setRightMode(int i7) {
        if (this.L == i7) {
            return;
        }
        this.L = i7;
        invalidate();
    }

    public void setSendIconColor(int i7) {
        this.n.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
    }

    public void setShown(boolean z10) {
        if (this.y == z10 && this.E == z10) {
            return;
        }
        this.y = z10;
        this.E = z10;
        if (z10) {
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

    public void setStopGlass(fh.g gVar) {
        this.W0 = gVar;
        if (gVar != null) {
            gVar.r(0.0f);
            gVar.W = 0.0f;
        }
    }

    public void setStopIsland(boolean z10) {
        if (this.l0 == z10) {
            return;
        }
        this.l0 = z10;
        c6 c6Var = this.g0;
        if (z10) {
            c6Var.e(true, 0.0f);
            this.h0.e(true, 0.0f);
        } else {
            float f10 = c6Var.c;
            this.i0 = f10;
            c6Var.e(true, f10);
        }
        invalidate();
    }
}
