package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h10 extends nh.b {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ x30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h10(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = x30Var;
        this.d = new OvershootInterpolator(1.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x073a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x042d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        w30 w30Var;
        float f11;
        float f12;
        boolean z10;
        Paint paint;
        Matrix matrix;
        RadialProgressView radialProgressView;
        boolean z11;
        Canvas canvas2;
        Paint paint2;
        RadialProgressView radialProgressView2;
        Matrix matrix2;
        float f13;
        float f14;
        int i3;
        int i10;
        float f15;
        RadialProgressView radialProgressView3;
        org.telegram.ui.Components.q9 q9Var;
        org.telegram.ui.Components.q9 q9Var2;
        RectF rectF;
        float f16;
        int L;
        float f17;
        float f18;
        RadialProgressView radialProgressView4;
        org.telegram.ui.Components.q9 q9Var3;
        org.telegram.ui.Components.q9 q9Var4;
        org.telegram.ui.Components.q9 q9Var5;
        float f19;
        Paint paint3;
        float f20;
        float f21;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        w30 w30Var2;
        w30 w30Var3;
        int i13;
        int i14;
        int i15;
        int i16;
        x30 x30Var = this.f;
        Paint paint4 = x30Var.B3;
        org.telegram.ui.Components.voip.c2 c2Var = x30Var.q1;
        org.telegram.ui.Components.voip.c2 c2Var2 = x30Var.s1;
        Matrix matrix3 = x30Var.K2;
        org.telegram.ui.Components.q9 q9Var6 = x30Var.F2;
        org.telegram.ui.Components.q9 q9Var7 = x30Var.E2;
        RectF rectF2 = x30Var.n2;
        Paint paint5 = x30Var.L2;
        RadialProgressView radialProgressView5 = x30Var.W1;
        j20 j20Var = x30Var.L1;
        int[] iArr = x30Var.P3;
        org.telegram.ui.Components.voip.c2 c2Var3 = x30Var.t1;
        Paint paint6 = x30Var.A3;
        if (x30Var.d4 && x30Var.Y3) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - x30Var.G3;
        x30Var.G3 = elapsedRealtime;
        if (j10 > 20) {
            j10 = 17;
        }
        long j11 = j10;
        w30 w30Var4 = x30Var.F3;
        if (w30Var4 != null) {
            w30Var4.b(0, measuredWidth, getMeasuredHeight(), j11, x30Var.G2);
        }
        q9Var7.a = org.telegram.messenger.g0.L(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        q9Var7.b = com.google.android.recaptcha.internal.a.A(org.telegram.messenger.g0.L(20.0f), 0.6f, org.telegram.messenger.g0.L(62.0f), 0.48076922f);
        q9Var6.a = org.telegram.messenger.g0.L(65.0f) * 0.46296296f;
        q9Var6.b = com.google.android.recaptcha.internal.a.A(org.telegram.messenger.g0.L(20.0f), 0.6f, org.telegram.messenger.g0.L(65.0f), 0.48076922f);
        float f22 = x30Var.H2;
        float f23 = x30Var.G2;
        if (f22 != f23) {
            float f24 = x30Var.I2;
            f10 = 0.0f;
            float f25 = (j11 * f24) + f23;
            x30Var.G2 = f25;
            if (f24 > 0.0f) {
                if (f25 > f22) {
                    x30Var.G2 = f22;
                }
            } else if (f25 < f22) {
                x30Var.G2 = f22;
            }
        } else {
            f10 = 0.0f;
        }
        w30 w30Var5 = x30Var.E3;
        if (w30Var5 != null && w30Var5.i == 3) {
            radialProgressView5.I = true;
            if (Math.abs(radialProgressView5.n) < 360.0f) {
                z10 = false;
                f12 = 1.0f;
                if (z10) {
                }
                float interpolation = (this.d.getInterpolation(x30Var.H3) * 0.6f) + 0.4f;
                q9Var6.e(x30Var.G2, 1.0f);
                q9Var7.e(x30Var.G2, 1.0f);
                if (x30Var.E3 != null) {
                }
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f13 = 25.909092f;
                f14 = 25.0f;
                i10 = 0;
                for (i3 = 2; i10 < i3; i3 = 2) {
                }
                super.dispatchDraw(canvas);
                if (x30Var.S3.r == null) {
                }
            }
        } else if (w30Var5 != null && (w30Var = x30Var.F3) != null && w30Var.i == 3) {
            radialProgressView5.I = true;
            f11 = 1.0f;
            radialProgressView5.J = 1.0f;
            f12 = f11;
            z10 = true;
            if (z10) {
                float f26 = x30Var.D3;
                if (f26 != f12) {
                    w30 w30Var6 = x30Var.E3;
                    if (w30Var6 == null || w30Var6.i != 3) {
                        x30Var.D3 = (j11 / 180.0f) + f26;
                    } else {
                        x30Var.D3 = (j11 / 100.0f) + f26;
                    }
                    if (x30Var.D3 >= 1.0f) {
                        x30Var.D3 = 1.0f;
                        x30Var.E3 = null;
                        w30 w30Var7 = x30Var.F3;
                        if (w30Var7 != null && w30Var7.i == 3) {
                            radialProgressView5.I = false;
                        }
                    }
                    x30Var.O3 = true;
                }
                if (!x30Var.O3 || (w30Var3 = x30Var.F3) == null) {
                    paint = paint4;
                    matrix = matrix3;
                    radialProgressView = radialProgressView5;
                    i11 = 3;
                    z11 = z10;
                } else {
                    x30Var.O3 = false;
                    w30 w30Var8 = x30Var.E3;
                    if (w30Var8 != null) {
                        x30.K0(x30Var, w30Var8.i, iArr);
                        int i17 = iArr[0];
                        i11 = 3;
                        int i18 = iArr[1];
                        z11 = z10;
                        int i19 = iArr[2];
                        radialProgressView = radialProgressView5;
                        int i20 = iArr[3];
                        matrix = matrix3;
                        x30.K0(x30Var, x30Var.F3.i, iArr);
                        paint = paint4;
                        i13 = i0.a.f(x30Var.D3, i17, iArr[0]);
                        i14 = i0.a.f(x30Var.D3, i18, iArr[1]);
                        i15 = i0.a.f(x30Var.D3, i19, iArr[2]);
                        i16 = i0.a.f(x30Var.D3, i20, iArr[3]);
                    } else {
                        paint = paint4;
                        matrix = matrix3;
                        radialProgressView = radialProgressView5;
                        z11 = z10;
                        i11 = 3;
                        x30.K0(x30Var, w30Var3.i, iArr);
                        i13 = iArr[0];
                        i14 = iArr[1];
                        i15 = iArr[2];
                        i16 = iArr[3];
                    }
                    if (this.e != i13) {
                        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(45.454548f), new int[]{i0.a.o(i13, 60), i0.a.o(i13, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                        x30Var.J2 = radialGradient;
                        paint5.setShader(radialGradient);
                        this.e = i13;
                    }
                    c2Var2.a(i15, i14);
                    c2Var.a(i15, i14);
                    x30Var.p1.a(i15, i14);
                    x30Var.n1.a(i15, i14);
                    org.telegram.ui.Components.voip.c2 c2Var4 = x30Var.r1;
                    int i21 = org.telegram.ui.ActionBar.k6.rh;
                    c2Var4.a(org.telegram.ui.ActionBar.k6.x0(null, i21, false), org.telegram.ui.ActionBar.k6.x0(null, i21, false));
                    x30Var.o1.a(i14, i16);
                }
                w30 w30Var9 = x30Var.F3;
                if (w30Var9 != null) {
                    int i22 = w30Var9.i;
                    z12 = i22 == 1 || i22 == 0 || x30.r1(i22);
                    i12 = i11;
                    if (x30Var.F3.i != i12) {
                        z13 = true;
                        if (x30Var.E3 == null && (w30Var2 = x30Var.F3) != null && w30Var2.i == i12) {
                            float f27 = x30Var.H3 - (j11 / 180.0f);
                            x30Var.H3 = f27;
                            if (f27 < f10) {
                                x30Var.H3 = f10;
                            }
                        } else {
                            if (z12) {
                                float f28 = x30Var.H3;
                                if (f28 != 1.0f) {
                                    float f29 = (j11 / 350.0f) + f28;
                                    x30Var.H3 = f29;
                                    if (f29 > 1.0f) {
                                        x30Var.H3 = 1.0f;
                                    }
                                }
                            }
                            if (!z12) {
                                float f30 = x30Var.H3;
                                if (f30 != 0.0f) {
                                    float f31 = f30 - (j11 / 350.0f);
                                    x30Var.H3 = f31;
                                    if (f31 < 0.0f) {
                                        x30Var.H3 = 0.0f;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            float f32 = x30Var.I3;
                            if (f32 != 1.0f) {
                                float f33 = (j11 / 350.0f) + f32;
                                x30Var.I3 = f33;
                                if (f33 > 1.0f) {
                                    x30Var.I3 = 1.0f;
                                }
                            }
                        }
                        if (!z13) {
                            float f34 = x30Var.I3;
                            if (f34 != 0.0f) {
                                float f35 = f34 - (j11 / 350.0f);
                                x30Var.I3 = f35;
                                if (f35 < 0.0f) {
                                    x30Var.I3 = 0.0f;
                                }
                            }
                        }
                    }
                } else {
                    i12 = i11;
                    z12 = false;
                }
                z13 = false;
                if (x30Var.E3 == null) {
                }
                if (z12) {
                }
                if (!z12) {
                }
                if (z13) {
                }
                if (!z13) {
                }
            } else {
                paint = paint4;
                matrix = matrix3;
                radialProgressView = radialProgressView5;
                z11 = z10;
            }
            float interpolation2 = (this.d.getInterpolation(x30Var.H3) * 0.6f) + 0.4f;
            q9Var6.e(x30Var.G2, 1.0f);
            q9Var7.e(x30Var.G2, 1.0f);
            if (x30Var.E3 != null || x30Var.F3 == null || x30Var.t1()) {
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f13 = 25.909092f;
                f14 = 25.0f;
            } else {
                w30 w30Var10 = x30Var.F3;
                f13 = 25.909092f;
                int i23 = w30Var10.i;
                f14 = 25.0f;
                if (i23 == 3 || x30Var.E3.i == 3) {
                    if (i23 == 3) {
                        f21 = x30Var.D3;
                        paint3 = paint6;
                        paint3.setShader(x30Var.E3.g);
                        f20 = 1.0f;
                    } else {
                        paint3 = paint6;
                        f20 = 1.0f;
                        float f36 = 1.0f - x30Var.D3;
                        paint3.setShader(w30Var10.g);
                        f21 = f36;
                    }
                    int S0 = org.telegram.messenger.g0.S0(x30Var.M3, f20, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.yh, false));
                    Paint paint7 = paint;
                    paint7.setColor(S0);
                    float measuredWidth2 = (int) ((c2Var3.getMeasuredWidth() / 2.0f) + c2Var3.getX());
                    float y9 = (int) (c2Var3.getY() + org.telegram.messenger.g0.L(25.0f));
                    Matrix matrix4 = matrix;
                    matrix4.setTranslate(measuredWidth2, y9);
                    x30Var.J2.setLocalMatrix(matrix4);
                    paint3.setAlpha(76);
                    canvas.save();
                    canvas.scale(c2Var3.getScaleX() * 1.0f, c2Var3.getScaleY() * 1.0f, measuredWidth2, y9);
                    canvas.save();
                    float v = com.google.android.recaptcha.internal.a.v(0.807f, x30Var.G2, 0.5f, 0.878f) * x30Var.I3;
                    canvas.scale(v, v, measuredWidth2, y9);
                    canvas.save();
                    canvas.scale(1.2f, 1.2f, measuredWidth2, y9);
                    canvas.drawCircle(measuredWidth2, y9, org.telegram.messenger.g0.L(160.0f), paint5);
                    canvas.restore();
                    canvas.restore();
                    if (x30Var.S2 != null) {
                        canvas.save();
                        float A = com.google.android.recaptcha.internal.a.A(0.807f, x30Var.G2, 0.878f, interpolation2);
                        canvas.scale(A, A, measuredWidth2, y9);
                        q9Var6.a(measuredWidth2, y9, canvas, paint3);
                        canvas.restore();
                        canvas.save();
                        float A2 = com.google.android.recaptcha.internal.a.A(0.704f, x30Var.G2, 0.926f, interpolation2);
                        canvas.scale(A2, A2, measuredWidth2, y9);
                        q9Var7.a(measuredWidth2, y9, canvas, paint3);
                        canvas.restore();
                    }
                    paint3.setAlpha(org.telegram.messenger.hs.e4);
                    if (z11) {
                        canvas.drawCircle(measuredWidth2, y9, org.telegram.messenger.g0.L(25.909092f), paint3);
                        paint3.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ch, false));
                        if (f21 != 0.0f) {
                            paint3.setAlpha((int) (f21 * 255.0f));
                            paint3.setShader(null);
                            canvas.drawCircle(measuredWidth2, y9, org.telegram.messenger.g0.L(25.909092f), paint3);
                        }
                    }
                    canvas.drawCircle(measuredWidth2, y9, org.telegram.messenger.g0.L(25.0f) * f21, paint7);
                    if (!z11) {
                        radialProgressView.a(canvas, measuredWidth2, y9);
                    }
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    if (x30Var.S3.r == null) {
                        return;
                    }
                    invalidate();
                    return;
                }
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
            }
            i10 = 0;
            while (i10 < i3) {
                float L2 = org.telegram.messenger.g0.L(f13);
                if (i10 == 0 && x30Var.E3 != null) {
                    if (!x30Var.t1()) {
                        paint2.setShader(x30Var.E3.g);
                    }
                    f16 = 1.0f - x30Var.D3;
                    if (x30Var.E3.i == 3) {
                        L = org.telegram.messenger.g0.L(2.0f);
                        L2 -= L * f16;
                    }
                    if (paint2.getShader() == null) {
                    }
                    f17 = f16;
                    f18 = L2;
                    if (x30Var.t1()) {
                    }
                    float measuredWidth3 = (int) ((c2Var3.getMeasuredWidth() / 2.0f) + c2Var3.getX());
                    float y10 = (int) (c2Var3.getY() + org.telegram.messenger.g0.L(f14));
                    matrix2.setTranslate(measuredWidth3, y10);
                    x30Var.J2.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (x30Var.N2 * 76.0f * f17));
                    canvas2.save();
                    canvas2.scale(c2Var3.getScaleX() * 1.0f, c2Var3.getScaleX() * 1.0f, measuredWidth3, y10);
                    canvas2.save();
                    float v10 = com.google.android.recaptcha.internal.a.v(x30Var.G2, 0.807f, 0.5f, 0.878f);
                    float f37 = x30Var.I3;
                    canvas2.scale(f37 * v10, f37 * v10, measuredWidth3, y10);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (!x30Var.t1()) {
                    }
                    if (x30.x5) {
                    }
                    float measuredWidth4 = (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(21.0f);
                    float L3 = org.telegram.messenger.g0.L(24.0f);
                    float f38 = (f18 - measuredWidth4) + measuredWidth4;
                    float f39 = x30Var.N2;
                    float f40 = f38 * f39;
                    float f41 = ((f18 - L3) + L3) * f39;
                    float f42 = measuredWidth3 + f40;
                    f15 = interpolation2;
                    q9Var = q9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth3 - f40, y10 - f41, f42, y10 + f41);
                    float L4 = (f18 - org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(4.0f);
                    paint2.setAlpha((int) (x30Var.N2 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, L4, L4, paint2);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (j20Var != null) {
                        paint2.setAlpha((int) (j20Var.getAlpha() * 255.0f));
                        float x10 = j20Var.getX() - getX();
                        float y11 = j20Var.getY() - getY();
                        rectF.set(x10, y11, j20Var.getMeasuredWidth() + x10, j20Var.getMeasuredHeight() + y11);
                        canvas2.save();
                        canvas2.scale(j20Var.getScaleX(), j20Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f19), org.telegram.messenger.g0.L(f19), paint2);
                        canvas2.restore();
                    }
                } else if (i10 != 1) {
                    f15 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    q9Var = q9Var6;
                    q9Var2 = q9Var7;
                    rectF = rectF3;
                } else if (x30Var.F3 != null) {
                    if (!x30Var.t1()) {
                        paint2.setShader(x30Var.F3.g);
                    }
                    f16 = x30Var.D3;
                    if (x30Var.F3.i == 3) {
                        L = org.telegram.messenger.g0.L(2.0f);
                        L2 -= L * f16;
                    }
                    if (paint2.getShader() == null || x30Var.t1()) {
                        f17 = f16;
                        f18 = L2;
                    } else {
                        f17 = f16;
                        f18 = L2;
                        paint2.setColor(org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.yh, false)));
                    }
                    if (x30Var.t1()) {
                        radialProgressView4 = radialProgressView2;
                        q9Var3 = q9Var6;
                        q9Var4 = q9Var7;
                    } else {
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zh, false);
                        int i24 = org.telegram.ui.ActionBar.k6.yh;
                        radialProgressView4 = radialProgressView2;
                        int S02 = org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, x02, org.telegram.ui.ActionBar.k6.x0(null, i24, false));
                        paint2.setColor(S02);
                        paint2.setShader(null);
                        int i25 = org.telegram.ui.ActionBar.k6.Yg;
                        q9Var4 = q9Var7;
                        q9Var3 = q9Var6;
                        c2Var.a(org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, i25, false), org.telegram.ui.ActionBar.k6.x0(null, i24, false)), S02);
                        c2Var2.a(org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, i25, false), org.telegram.ui.ActionBar.k6.x0(null, i24, false)), S02);
                    }
                    float measuredWidth32 = (int) ((c2Var3.getMeasuredWidth() / 2.0f) + c2Var3.getX());
                    float y102 = (int) (c2Var3.getY() + org.telegram.messenger.g0.L(f14));
                    matrix2.setTranslate(measuredWidth32, y102);
                    x30Var.J2.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (x30Var.N2 * 76.0f * f17));
                    canvas2.save();
                    canvas2.scale(c2Var3.getScaleX() * 1.0f, c2Var3.getScaleX() * 1.0f, measuredWidth32, y102);
                    canvas2.save();
                    float v102 = com.google.android.recaptcha.internal.a.v(x30Var.G2, 0.807f, 0.5f, 0.878f);
                    float f372 = x30Var.I3;
                    canvas2.scale(f372 * v102, f372 * v102, measuredWidth32, y102);
                    if (i10 != 1 && !x30Var.t1() && org.telegram.messenger.lc.e(512)) {
                        canvas2.save();
                        canvas2.scale(1.2f, 1.2f, measuredWidth32, y102);
                        int alpha = paint5.getAlpha();
                        paint5.setAlpha((int) ((1.0f - x30Var.r5.e) * x30Var.N2 * alpha));
                        canvas2.drawCircle(measuredWidth32, y102, org.telegram.messenger.g0.L(160.0f), paint5);
                        paint5.setAlpha(alpha);
                        canvas2.restore();
                    }
                    canvas2.restore();
                    if (!x30Var.t1()) {
                        q9Var2 = q9Var4;
                        q9Var5 = q9Var3;
                    } else if (x30Var.N2 > 0.0f) {
                        canvas2.save();
                        float v11 = com.google.android.recaptcha.internal.a.v(x30Var.G2, 0.807f, interpolation2, 0.878f);
                        canvas2.scale(v11, v11, measuredWidth32, y102);
                        q9Var5 = q9Var3;
                        q9Var5.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                        canvas2.save();
                        float v12 = com.google.android.recaptcha.internal.a.v(x30Var.G2, 0.704f, interpolation2, 0.926f);
                        canvas2.scale(v12, v12, measuredWidth32, y102);
                        q9Var2 = q9Var4;
                        q9Var2.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                    } else {
                        q9Var2 = q9Var4;
                        q9Var5 = q9Var3;
                    }
                    if (x30.x5) {
                        if (i10 == 0) {
                            paint2.setAlpha(org.telegram.messenger.hs.e4);
                        } else {
                            paint2.setAlpha((int) (f17 * 255.0f));
                        }
                    } else if (i10 == 0) {
                        paint2.setAlpha((int) (x30Var.O2 * 255.0f));
                    } else {
                        paint2.setAlpha((int) (x30Var.O2 * f17 * 255.0f));
                    }
                    float measuredWidth42 = (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(21.0f);
                    float L32 = org.telegram.messenger.g0.L(24.0f);
                    float f382 = (f18 - measuredWidth42) + measuredWidth42;
                    float f392 = x30Var.N2;
                    float f402 = f382 * f392;
                    float f412 = ((f18 - L32) + L32) * f392;
                    float f422 = measuredWidth32 + f402;
                    f15 = interpolation2;
                    q9Var = q9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth32 - f402, y102 - f412, f422, y102 + f412);
                    float L42 = (f18 - org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(4.0f);
                    paint2.setAlpha((int) (x30Var.N2 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, L42, L42, paint2);
                    if (i10 != 1) {
                        f19 = 4.0f;
                        if (x30Var.F3.i == 3) {
                            if (x30Var.t1()) {
                                radialProgressView3 = radialProgressView4;
                                radialProgressView3.setSize((int) ((L42 * 2.0f) - org.telegram.messenger.g0.L(4.0f)));
                            } else {
                                radialProgressView3 = radialProgressView4;
                            }
                            radialProgressView3.a(canvas2, measuredWidth32, y102);
                        } else {
                            radialProgressView3 = radialProgressView4;
                        }
                    } else {
                        f19 = 4.0f;
                        radialProgressView3 = radialProgressView4;
                    }
                    canvas2.restore();
                    if (j20Var != null && j20Var.getVisibility() == 0) {
                        paint2.setAlpha((int) (j20Var.getAlpha() * 255.0f));
                        float x102 = j20Var.getX() - getX();
                        float y112 = j20Var.getY() - getY();
                        rectF.set(x102, y112, j20Var.getMeasuredWidth() + x102, j20Var.getMeasuredHeight() + y112);
                        canvas2.save();
                        canvas2.scale(j20Var.getScaleX(), j20Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f19), org.telegram.messenger.g0.L(f19), paint2);
                        canvas2.restore();
                    }
                } else {
                    f15 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    q9Var = q9Var6;
                    q9Var2 = q9Var7;
                    rectF = rectF3;
                }
                i10++;
                rectF3 = rectF;
                q9Var7 = q9Var2;
                radialProgressView2 = radialProgressView3;
                interpolation2 = f15;
                q9Var6 = q9Var;
            }
            super.dispatchDraw(canvas);
            if (x30Var.S3.r == null) {
            }
        }
        f11 = 1.0f;
        f12 = f11;
        z10 = true;
        if (z10) {
        }
        float interpolation22 = (this.d.getInterpolation(x30Var.H3) * 0.6f) + 0.4f;
        q9Var6.e(x30Var.G2, 1.0f);
        q9Var7.e(x30Var.G2, 1.0f);
        if (x30Var.E3 != null) {
        }
        canvas2 = canvas;
        paint2 = paint6;
        radialProgressView2 = radialProgressView;
        matrix2 = matrix;
        f13 = 25.909092f;
        f14 = 25.0f;
        i10 = 0;
        while (i10 < i3) {
        }
        super.dispatchDraw(canvas);
        if (x30Var.S3.r == null) {
        }
    }
}
