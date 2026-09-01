package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.SystemClock;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j30 extends yg.b {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ d60 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = d60Var;
        this.d = new OvershootInterpolator(1.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0737 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x042f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        c60 c60Var;
        boolean z4;
        Paint paint;
        Matrix matrix;
        RadialProgressView radialProgressView;
        boolean z10;
        Canvas canvas2;
        Paint paint2;
        RadialProgressView radialProgressView2;
        Matrix matrix2;
        float f12;
        float f13;
        int i10;
        float f14;
        RadialProgressView radialProgressView3;
        org.telegram.ui.Components.u9 u9Var;
        org.telegram.ui.Components.u9 u9Var2;
        RectF rectF;
        float f15;
        int dp;
        float f16;
        float f17;
        RadialProgressView radialProgressView4;
        org.telegram.ui.Components.u9 u9Var3;
        org.telegram.ui.Components.u9 u9Var4;
        org.telegram.ui.Components.u9 u9Var5;
        float f18;
        Paint paint3;
        float f19;
        float f20;
        int i11;
        boolean z11;
        boolean z12;
        c60 c60Var2;
        c60 c60Var3;
        int i12;
        int i13;
        int i14;
        int i15;
        d60 d60Var = this.f;
        Paint paint4 = d60Var.G1;
        org.telegram.ui.Components.voip.w2 w2Var = d60Var.r;
        org.telegram.ui.Components.voip.w2 w2Var2 = d60Var.v;
        Matrix matrix3 = d60Var.P0;
        org.telegram.ui.Components.u9 u9Var6 = d60Var.K0;
        org.telegram.ui.Components.u9 u9Var7 = d60Var.J0;
        RectF rectF2 = d60Var.s0;
        Paint paint5 = d60Var.Q0;
        RadialProgressView radialProgressView5 = d60Var.b0;
        l40 l40Var = d60Var.Q;
        int[] iArr = d60Var.U1;
        org.telegram.ui.Components.voip.w2 w2Var3 = d60Var.w;
        Paint paint6 = d60Var.F1;
        if (d60Var.i2 && d60Var.d2) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - d60Var.L1;
        d60Var.L1 = elapsedRealtime;
        if (j10 > 20) {
            j10 = 17;
        }
        long j11 = j10;
        c60 c60Var4 = d60Var.K1;
        if (c60Var4 != null) {
            c60Var4.b(0, measuredWidth, getMeasuredHeight(), j11, d60Var.L0);
        }
        u9Var7.a = AndroidUtilities.dp(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        u9Var7.b = e2.c.y(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(62.0f), 0.48076922f);
        u9Var6.a = AndroidUtilities.dp(65.0f) * 0.46296296f;
        u9Var6.b = e2.c.y(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(65.0f), 0.48076922f);
        float f21 = d60Var.M0;
        float f22 = d60Var.L0;
        if (f21 != f22) {
            f10 = 0.6f;
            float f23 = d60Var.N0;
            f11 = 0.0f;
            float f24 = (j11 * f23) + f22;
            d60Var.L0 = f24;
            if (f23 > 0.0f) {
                if (f24 > f21) {
                    d60Var.L0 = f21;
                }
            } else if (f24 < f21) {
                d60Var.L0 = f21;
            }
        } else {
            f10 = 0.6f;
            f11 = 0.0f;
        }
        c60 c60Var5 = d60Var.J1;
        if (c60Var5 != null && c60Var5.i == 3) {
            radialProgressView5.E = true;
            if (Math.abs(radialProgressView5.n) < 360.0f) {
                z4 = false;
                if (z4) {
                }
                float interpolation = (this.d.getInterpolation(d60Var.M1) * f10) + 0.4f;
                u9Var6.e(d60Var.L0, 1.0f);
                u9Var7.e(d60Var.L0, 1.0f);
                if (d60Var.J1 != null) {
                }
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f12 = 25.909092f;
                f13 = 25.0f;
                i10 = 0;
                while (i10 < 2) {
                }
                super.dispatchDraw(canvas);
                if (d60Var.X1.r == null) {
                }
            }
        } else if (c60Var5 != null && (c60Var = d60Var.K1) != null && c60Var.i == 3) {
            radialProgressView5.E = true;
            radialProgressView5.F = 1.0f;
            z4 = true;
            if (z4) {
                float f25 = d60Var.I1;
                if (f25 != 1.0f) {
                    c60 c60Var6 = d60Var.J1;
                    if (c60Var6 == null || c60Var6.i != 3) {
                        d60Var.I1 = (j11 / 180.0f) + f25;
                    } else {
                        d60Var.I1 = (j11 / 100.0f) + f25;
                    }
                    if (d60Var.I1 >= 1.0f) {
                        d60Var.I1 = 1.0f;
                        d60Var.J1 = null;
                        c60 c60Var7 = d60Var.K1;
                        if (c60Var7 != null && c60Var7.i == 3) {
                            radialProgressView5.E = false;
                        }
                    }
                    d60Var.T1 = true;
                }
                if (!d60Var.T1 || (c60Var3 = d60Var.K1) == null) {
                    paint = paint4;
                    matrix = matrix3;
                    radialProgressView = radialProgressView5;
                    z10 = z4;
                } else {
                    d60Var.T1 = false;
                    c60 c60Var8 = d60Var.J1;
                    if (c60Var8 != null) {
                        d60.S(d60Var, c60Var8.i, iArr);
                        int i16 = iArr[0];
                        int i17 = iArr[1];
                        z10 = z4;
                        int i18 = iArr[2];
                        radialProgressView = radialProgressView5;
                        int i19 = iArr[3];
                        matrix = matrix3;
                        d60.S(d60Var, d60Var.K1.i, iArr);
                        paint = paint4;
                        i12 = i0.a.d(d60Var.I1, i16, iArr[0]);
                        i13 = i0.a.d(d60Var.I1, i17, iArr[1]);
                        i14 = i0.a.d(d60Var.I1, i18, iArr[2]);
                        i15 = i0.a.d(d60Var.I1, i19, iArr[3]);
                    } else {
                        paint = paint4;
                        matrix = matrix3;
                        radialProgressView = radialProgressView5;
                        z10 = z4;
                        d60.S(d60Var, c60Var3.i, iArr);
                        i12 = iArr[0];
                        i13 = iArr[1];
                        i14 = iArr[2];
                        i15 = iArr[3];
                    }
                    if (this.e != i12) {
                        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(45.454548f), new int[]{i0.a.k(i12, 60), i0.a.k(i12, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                        d60Var.O0 = radialGradient;
                        paint5.setShader(radialGradient);
                        this.e = i12;
                    }
                    w2Var2.a(i14, i13);
                    w2Var.a(i14, i13);
                    d60Var.n.a(i14, i13);
                    d60Var.f.a(i14, i13);
                    org.telegram.ui.Components.voip.w2 w2Var4 = d60Var.s;
                    int i20 = org.telegram.ui.ActionBar.k6.Dg;
                    w2Var4.a(org.telegram.ui.ActionBar.k6.w0(null, i20, false), org.telegram.ui.ActionBar.k6.w0(null, i20, false));
                    d60Var.h.a(i13, i15);
                }
                c60 c60Var9 = d60Var.K1;
                if (c60Var9 != null) {
                    int i21 = c60Var9.i;
                    z11 = i21 == 1 || i21 == 0 || d60.p1(i21);
                    i11 = 3;
                    if (d60Var.K1.i != 3) {
                        z12 = true;
                        if (d60Var.J1 == null && (c60Var2 = d60Var.K1) != null && c60Var2.i == i11) {
                            float f26 = d60Var.M1 - (j11 / 180.0f);
                            d60Var.M1 = f26;
                            if (f26 < f11) {
                                d60Var.M1 = 0.0f;
                            }
                        } else {
                            if (z11) {
                                float f27 = d60Var.M1;
                                if (f27 != 1.0f) {
                                    float f28 = (j11 / 350.0f) + f27;
                                    d60Var.M1 = f28;
                                    if (f28 > 1.0f) {
                                        d60Var.M1 = 1.0f;
                                    }
                                }
                            }
                            if (!z11) {
                                float f29 = d60Var.M1;
                                if (f29 != 0.0f) {
                                    float f30 = f29 - (j11 / 350.0f);
                                    d60Var.M1 = f30;
                                    if (f30 < 0.0f) {
                                        d60Var.M1 = 0.0f;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            float f31 = d60Var.N1;
                            if (f31 != 1.0f) {
                                float f32 = (j11 / 350.0f) + f31;
                                d60Var.N1 = f32;
                                if (f32 > 1.0f) {
                                    d60Var.N1 = 1.0f;
                                }
                            }
                        }
                        if (!z12) {
                            float f33 = d60Var.N1;
                            if (f33 != 0.0f) {
                                float f34 = f33 - (j11 / 350.0f);
                                d60Var.N1 = f34;
                                if (f34 < 0.0f) {
                                    d60Var.N1 = 0.0f;
                                }
                            }
                        }
                    }
                } else {
                    i11 = 3;
                    z11 = false;
                }
                z12 = false;
                if (d60Var.J1 == null) {
                }
                if (z11) {
                }
                if (!z11) {
                }
                if (z12) {
                }
                if (!z12) {
                }
            } else {
                paint = paint4;
                matrix = matrix3;
                radialProgressView = radialProgressView5;
                z10 = z4;
            }
            float interpolation2 = (this.d.getInterpolation(d60Var.M1) * f10) + 0.4f;
            u9Var6.e(d60Var.L0, 1.0f);
            u9Var7.e(d60Var.L0, 1.0f);
            if (d60Var.J1 != null || d60Var.K1 == null || d60Var.r1()) {
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f12 = 25.909092f;
                f13 = 25.0f;
            } else {
                c60 c60Var10 = d60Var.K1;
                f12 = 25.909092f;
                int i22 = c60Var10.i;
                f13 = 25.0f;
                if (i22 == 3 || d60Var.J1.i == 3) {
                    if (i22 == 3) {
                        f20 = d60Var.I1;
                        paint3 = paint6;
                        paint3.setShader(d60Var.J1.g);
                        f19 = 1.0f;
                    } else {
                        paint3 = paint6;
                        f19 = 1.0f;
                        float f35 = 1.0f - d60Var.I1;
                        paint3.setShader(c60Var10.g);
                        f20 = f35;
                    }
                    int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.kg, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Kg, false), d60Var.R1, f19);
                    Paint paint7 = paint;
                    paint7.setColor(offsetColor);
                    float measuredWidth2 = (int) ((w2Var3.getMeasuredWidth() / 2.0f) + w2Var3.getX());
                    float y10 = (int) (w2Var3.getY() + AndroidUtilities.dp(25.0f));
                    Matrix matrix4 = matrix;
                    matrix4.setTranslate(measuredWidth2, y10);
                    d60Var.O0.setLocalMatrix(matrix4);
                    paint3.setAlpha(76);
                    canvas.save();
                    canvas.scale(w2Var3.getScaleX() * 1.0f, w2Var3.getScaleY() * 1.0f, measuredWidth2, y10);
                    canvas.save();
                    float u10 = e2.c.u(0.807f, d60Var.L0, 0.5f, 0.878f) * d60Var.N1;
                    canvas.scale(u10, u10, measuredWidth2, y10);
                    canvas.save();
                    canvas.scale(1.2f, 1.2f, measuredWidth2, y10);
                    canvas.drawCircle(measuredWidth2, y10, AndroidUtilities.dp(160.0f), paint5);
                    canvas.restore();
                    canvas.restore();
                    if (d60Var.X0 != null) {
                        canvas.save();
                        float y11 = e2.c.y(0.807f, d60Var.L0, 0.878f, interpolation2);
                        canvas.scale(y11, y11, measuredWidth2, y10);
                        u9Var6.a(measuredWidth2, y10, canvas, paint3);
                        canvas.restore();
                        canvas.save();
                        float y12 = e2.c.y(0.704f, d60Var.L0, 0.926f, interpolation2);
                        canvas.scale(y12, y12, measuredWidth2, y10);
                        u9Var7.a(measuredWidth2, y10, canvas, paint3);
                        canvas.restore();
                    }
                    paint3.setAlpha(255);
                    if (z10) {
                        canvas.drawCircle(measuredWidth2, y10, AndroidUtilities.dp(25.909092f), paint3);
                        paint3.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Og, false));
                        if (f20 != 0.0f) {
                            paint3.setAlpha((int) (f20 * 255.0f));
                            paint3.setShader(null);
                            canvas.drawCircle(measuredWidth2, y10, AndroidUtilities.dp(25.909092f), paint3);
                        }
                    }
                    canvas.drawCircle(measuredWidth2, y10, AndroidUtilities.dp(25.0f) * f20, paint7);
                    if (!z10) {
                        radialProgressView.a(canvas, measuredWidth2, y10);
                    }
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    if (d60Var.X1.r == null) {
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
            while (i10 < 2) {
                float dp2 = AndroidUtilities.dp(f12);
                if (i10 == 0 && d60Var.J1 != null) {
                    if (!d60Var.r1()) {
                        paint2.setShader(d60Var.J1.g);
                    }
                    f15 = 1.0f - d60Var.I1;
                    if (d60Var.J1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f15;
                    }
                    if (paint2.getShader() == null) {
                    }
                    f16 = f15;
                    f17 = dp2;
                    if (d60Var.r1()) {
                    }
                    float measuredWidth3 = (int) ((w2Var3.getMeasuredWidth() / 2.0f) + w2Var3.getX());
                    float y13 = (int) (w2Var3.getY() + AndroidUtilities.dp(f13));
                    matrix2.setTranslate(measuredWidth3, y13);
                    d60Var.O0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (d60Var.S0 * 76.0f * f16));
                    canvas2.save();
                    canvas2.scale(w2Var3.getScaleX() * 1.0f, w2Var3.getScaleX() * 1.0f, measuredWidth3, y13);
                    canvas2.save();
                    float u11 = e2.c.u(d60Var.L0, 0.807f, 0.5f, 0.878f);
                    float f36 = d60Var.N1;
                    canvas2.scale(f36 * u11, f36 * u11, measuredWidth3, y13);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (!d60Var.r1()) {
                    }
                    if (d60.C3) {
                    }
                    float measuredWidth4 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp3 = AndroidUtilities.dp(24.0f);
                    float f37 = (f17 - measuredWidth4) + measuredWidth4;
                    float f38 = d60Var.S0;
                    float f39 = f37 * f38;
                    float f40 = ((f17 - dp3) + dp3) * f38;
                    float f41 = measuredWidth3 + f39;
                    f14 = interpolation2;
                    u9Var = u9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth3 - f39, y13 - f40, f41, y13 + f40);
                    float dp4 = (f17 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (d60Var.S0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp4, dp4, paint2);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (l40Var != null) {
                        paint2.setAlpha((int) (l40Var.getAlpha() * 255.0f));
                        float x10 = l40Var.getX() - getX();
                        float y14 = l40Var.getY() - getY();
                        rectF.set(x10, y14, l40Var.getMeasuredWidth() + x10, l40Var.getMeasuredHeight() + y14);
                        canvas2.save();
                        canvas2.scale(l40Var.getScaleX(), l40Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), paint2);
                        canvas2.restore();
                    }
                } else if (i10 != 1 || d60Var.K1 == null) {
                    f14 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    u9Var = u9Var6;
                    u9Var2 = u9Var7;
                    rectF = rectF3;
                } else {
                    if (!d60Var.r1()) {
                        paint2.setShader(d60Var.K1.g);
                    }
                    f15 = d60Var.I1;
                    if (d60Var.K1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f15;
                    }
                    if (paint2.getShader() == null || d60Var.r1()) {
                        f16 = f15;
                        f17 = dp2;
                    } else {
                        f16 = f15;
                        f17 = dp2;
                        paint2.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.kg, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Kg, false), d60Var.R1, 1.0f));
                    }
                    if (d60Var.r1()) {
                        radialProgressView4 = radialProgressView2;
                        u9Var3 = u9Var6;
                        u9Var4 = u9Var7;
                    } else {
                        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Lg, false);
                        int i23 = org.telegram.ui.ActionBar.k6.Kg;
                        radialProgressView4 = radialProgressView2;
                        int offsetColor2 = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.k6.w0(null, i23, false), d60Var.R1, 1.0f);
                        paint2.setColor(offsetColor2);
                        paint2.setShader(null);
                        int i24 = org.telegram.ui.ActionBar.k6.kg;
                        u9Var4 = u9Var7;
                        u9Var3 = u9Var6;
                        w2Var.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(null, i24, false), org.telegram.ui.ActionBar.k6.w0(null, i23, false), d60Var.R1, 1.0f), offsetColor2);
                        w2Var2.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.w0(null, i24, false), org.telegram.ui.ActionBar.k6.w0(null, i23, false), d60Var.R1, 1.0f), offsetColor2);
                    }
                    float measuredWidth32 = (int) ((w2Var3.getMeasuredWidth() / 2.0f) + w2Var3.getX());
                    float y132 = (int) (w2Var3.getY() + AndroidUtilities.dp(f13));
                    matrix2.setTranslate(measuredWidth32, y132);
                    d60Var.O0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (d60Var.S0 * 76.0f * f16));
                    canvas2.save();
                    canvas2.scale(w2Var3.getScaleX() * 1.0f, w2Var3.getScaleX() * 1.0f, measuredWidth32, y132);
                    canvas2.save();
                    float u112 = e2.c.u(d60Var.L0, 0.807f, 0.5f, 0.878f);
                    float f362 = d60Var.N1;
                    canvas2.scale(f362 * u112, f362 * u112, measuredWidth32, y132);
                    if (i10 != 1 && !d60Var.r1() && LiteMode.isEnabled(512)) {
                        canvas2.save();
                        canvas2.scale(1.2f, 1.2f, measuredWidth32, y132);
                        int alpha = paint5.getAlpha();
                        paint5.setAlpha((int) ((1.0f - d60Var.w3.e) * d60Var.S0 * alpha));
                        canvas2.drawCircle(measuredWidth32, y132, AndroidUtilities.dp(160.0f), paint5);
                        paint5.setAlpha(alpha);
                        canvas2.restore();
                    }
                    canvas2.restore();
                    if (!d60Var.r1()) {
                        u9Var2 = u9Var4;
                        u9Var5 = u9Var3;
                    } else if (d60Var.S0 > 0.0f) {
                        canvas2.save();
                        float u12 = e2.c.u(d60Var.L0, 0.807f, interpolation2, 0.878f);
                        canvas2.scale(u12, u12, measuredWidth32, y132);
                        u9Var5 = u9Var3;
                        u9Var5.a(measuredWidth32, y132, canvas2, paint2);
                        canvas2.restore();
                        canvas2.save();
                        float u13 = e2.c.u(d60Var.L0, 0.704f, interpolation2, 0.926f);
                        canvas2.scale(u13, u13, measuredWidth32, y132);
                        u9Var2 = u9Var4;
                        u9Var2.a(measuredWidth32, y132, canvas2, paint2);
                        canvas2.restore();
                    } else {
                        u9Var2 = u9Var4;
                        u9Var5 = u9Var3;
                    }
                    if (d60.C3) {
                        if (i10 == 0) {
                            paint2.setAlpha(255);
                        } else {
                            paint2.setAlpha((int) (f16 * 255.0f));
                        }
                    } else if (i10 == 0) {
                        paint2.setAlpha((int) (d60Var.T0 * 255.0f));
                    } else {
                        paint2.setAlpha((int) (d60Var.T0 * f16 * 255.0f));
                    }
                    float measuredWidth42 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp32 = AndroidUtilities.dp(24.0f);
                    float f372 = (f17 - measuredWidth42) + measuredWidth42;
                    float f382 = d60Var.S0;
                    float f392 = f372 * f382;
                    float f402 = ((f17 - dp32) + dp32) * f382;
                    float f412 = measuredWidth32 + f392;
                    f14 = interpolation2;
                    u9Var = u9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth32 - f392, y132 - f402, f412, y132 + f402);
                    float dp42 = (f17 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (d60Var.S0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp42, dp42, paint2);
                    if (i10 != 1) {
                        f18 = 4.0f;
                        if (d60Var.K1.i == 3) {
                            if (d60Var.r1()) {
                                radialProgressView3 = radialProgressView4;
                                radialProgressView3.setSize((int) ((dp42 * 2.0f) - AndroidUtilities.dp(4.0f)));
                            } else {
                                radialProgressView3 = radialProgressView4;
                            }
                            radialProgressView3.a(canvas2, measuredWidth32, y132);
                        } else {
                            radialProgressView3 = radialProgressView4;
                        }
                    } else {
                        radialProgressView3 = radialProgressView4;
                        f18 = 4.0f;
                    }
                    canvas2.restore();
                    if (l40Var != null && l40Var.getVisibility() == 0) {
                        paint2.setAlpha((int) (l40Var.getAlpha() * 255.0f));
                        float x102 = l40Var.getX() - getX();
                        float y142 = l40Var.getY() - getY();
                        rectF.set(x102, y142, l40Var.getMeasuredWidth() + x102, l40Var.getMeasuredHeight() + y142);
                        canvas2.save();
                        canvas2.scale(l40Var.getScaleX(), l40Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), paint2);
                        canvas2.restore();
                    }
                }
                i10++;
                rectF3 = rectF;
                u9Var7 = u9Var2;
                radialProgressView2 = radialProgressView3;
                interpolation2 = f14;
                u9Var6 = u9Var;
            }
            super.dispatchDraw(canvas);
            if (d60Var.X1.r == null) {
            }
        }
        z4 = true;
        if (z4) {
        }
        float interpolation22 = (this.d.getInterpolation(d60Var.M1) * f10) + 0.4f;
        u9Var6.e(d60Var.L0, 1.0f);
        u9Var7.e(d60Var.L0, 1.0f);
        if (d60Var.J1 != null) {
        }
        canvas2 = canvas;
        paint2 = paint6;
        radialProgressView2 = radialProgressView;
        matrix2 = matrix;
        f12 = 25.909092f;
        f13 = 25.0f;
        i10 = 0;
        while (i10 < 2) {
        }
        super.dispatchDraw(canvas);
        if (d60Var.X1.r == null) {
        }
    }
}
