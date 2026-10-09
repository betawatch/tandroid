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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l30 extends kh.b {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ g60 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = g60Var;
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
        float f7;
        f60 f60Var;
        float f10;
        float f11;
        boolean z10;
        Paint paint;
        Matrix matrix;
        RadialProgressView radialProgressView;
        boolean z11;
        Canvas canvas2;
        Paint paint2;
        RadialProgressView radialProgressView2;
        Matrix matrix2;
        float f12;
        float f13;
        int i10;
        int i11;
        float f14;
        RadialProgressView radialProgressView3;
        org.telegram.ui.Components.da daVar;
        org.telegram.ui.Components.da daVar2;
        RectF rectF;
        float f15;
        int dp;
        float f16;
        float f17;
        RadialProgressView radialProgressView4;
        org.telegram.ui.Components.da daVar3;
        org.telegram.ui.Components.da daVar4;
        org.telegram.ui.Components.da daVar5;
        float f18;
        Paint paint3;
        float f19;
        float f20;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        f60 f60Var2;
        f60 f60Var3;
        int i14;
        int i15;
        int i16;
        int i17;
        g60 g60Var = this.f;
        Paint paint4 = g60Var.J1;
        org.telegram.ui.Components.voip.v2 v2Var = g60Var.r;
        org.telegram.ui.Components.voip.v2 v2Var2 = g60Var.v;
        Matrix matrix3 = g60Var.S0;
        org.telegram.ui.Components.da daVar6 = g60Var.N0;
        org.telegram.ui.Components.da daVar7 = g60Var.M0;
        RectF rectF2 = g60Var.v0;
        Paint paint5 = g60Var.T0;
        RadialProgressView radialProgressView5 = g60Var.e0;
        n40 n40Var = g60Var.T;
        int[] iArr = g60Var.X1;
        org.telegram.ui.Components.voip.v2 v2Var3 = g60Var.w;
        Paint paint6 = g60Var.I1;
        if (g60Var.l2 && g60Var.g2) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - g60Var.O1;
        g60Var.O1 = elapsedRealtime;
        if (j3 > 20) {
            j3 = 17;
        }
        long j10 = j3;
        f60 f60Var4 = g60Var.N1;
        if (f60Var4 != null) {
            f60Var4.b(0, measuredWidth, getMeasuredHeight(), j10, g60Var.O0);
        }
        daVar7.a = AndroidUtilities.dp(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        daVar7.b = com.google.android.gms.internal.vision.e2.A(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(62.0f), 0.48076922f);
        daVar6.a = AndroidUtilities.dp(65.0f) * 0.46296296f;
        daVar6.b = com.google.android.gms.internal.vision.e2.A(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(65.0f), 0.48076922f);
        float f21 = g60Var.P0;
        float f22 = g60Var.O0;
        if (f21 != f22) {
            float f23 = g60Var.Q0;
            f7 = 0.0f;
            float f24 = (j10 * f23) + f22;
            g60Var.O0 = f24;
            if (f23 > 0.0f) {
                if (f24 > f21) {
                    g60Var.O0 = f21;
                }
            } else if (f24 < f21) {
                g60Var.O0 = f21;
            }
        } else {
            f7 = 0.0f;
        }
        f60 f60Var5 = g60Var.M1;
        if (f60Var5 != null && f60Var5.i == 3) {
            radialProgressView5.H = true;
            if (Math.abs(radialProgressView5.n) < 360.0f) {
                z10 = false;
                f11 = 1.0f;
                if (z10) {
                }
                float interpolation = (this.d.getInterpolation(g60Var.P1) * 0.6f) + 0.4f;
                daVar6.e(g60Var.O0, 1.0f);
                daVar7.e(g60Var.O0, 1.0f);
                if (g60Var.M1 != null) {
                }
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f12 = 25.909092f;
                f13 = 25.0f;
                i11 = 0;
                for (i10 = 2; i11 < i10; i10 = 2) {
                }
                super.dispatchDraw(canvas);
                if (g60Var.a2.r == null) {
                }
            }
        } else if (f60Var5 != null && (f60Var = g60Var.N1) != null && f60Var.i == 3) {
            radialProgressView5.H = true;
            f10 = 1.0f;
            radialProgressView5.I = 1.0f;
            f11 = f10;
            z10 = true;
            if (z10) {
                float f25 = g60Var.L1;
                if (f25 != f11) {
                    f60 f60Var6 = g60Var.M1;
                    if (f60Var6 == null || f60Var6.i != 3) {
                        g60Var.L1 = (j10 / 180.0f) + f25;
                    } else {
                        g60Var.L1 = (j10 / 100.0f) + f25;
                    }
                    if (g60Var.L1 >= 1.0f) {
                        g60Var.L1 = 1.0f;
                        g60Var.M1 = null;
                        f60 f60Var7 = g60Var.N1;
                        if (f60Var7 != null && f60Var7.i == 3) {
                            radialProgressView5.H = false;
                        }
                    }
                    g60Var.W1 = true;
                }
                if (!g60Var.W1 || (f60Var3 = g60Var.N1) == null) {
                    paint = paint4;
                    matrix = matrix3;
                    radialProgressView = radialProgressView5;
                    i12 = 3;
                    z11 = z10;
                } else {
                    g60Var.W1 = false;
                    f60 f60Var8 = g60Var.M1;
                    if (f60Var8 != null) {
                        g60.T(g60Var, f60Var8.i, iArr);
                        int i18 = iArr[0];
                        i12 = 3;
                        int i19 = iArr[1];
                        z11 = z10;
                        int i20 = iArr[2];
                        radialProgressView = radialProgressView5;
                        int i21 = iArr[3];
                        matrix = matrix3;
                        g60.T(g60Var, g60Var.N1.i, iArr);
                        paint = paint4;
                        i14 = i0.a.d(g60Var.L1, i18, iArr[0]);
                        i15 = i0.a.d(g60Var.L1, i19, iArr[1]);
                        i16 = i0.a.d(g60Var.L1, i20, iArr[2]);
                        i17 = i0.a.d(g60Var.L1, i21, iArr[3]);
                    } else {
                        paint = paint4;
                        matrix = matrix3;
                        radialProgressView = radialProgressView5;
                        z11 = z10;
                        i12 = 3;
                        g60.T(g60Var, f60Var3.i, iArr);
                        i14 = iArr[0];
                        i15 = iArr[1];
                        i16 = iArr[2];
                        i17 = iArr[3];
                    }
                    if (this.e != i14) {
                        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(45.454548f), new int[]{i0.a.k(i14, 60), i0.a.k(i14, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                        g60Var.R0 = radialGradient;
                        paint5.setShader(radialGradient);
                        this.e = i14;
                    }
                    v2Var2.a(i16, i15);
                    v2Var.a(i16, i15);
                    g60Var.n.a(i16, i15);
                    g60Var.f.a(i16, i15);
                    org.telegram.ui.Components.voip.v2 v2Var4 = g60Var.s;
                    int i22 = org.telegram.ui.ActionBar.i6.Dg;
                    v2Var4.a(org.telegram.ui.ActionBar.i6.x0(null, i22, false), org.telegram.ui.ActionBar.i6.x0(null, i22, false));
                    g60Var.h.a(i15, i17);
                }
                f60 f60Var9 = g60Var.N1;
                if (f60Var9 != null) {
                    int i23 = f60Var9.i;
                    z12 = i23 == 1 || i23 == 0 || g60.q1(i23);
                    i13 = i12;
                    if (g60Var.N1.i != i13) {
                        z13 = true;
                        if (g60Var.M1 == null && (f60Var2 = g60Var.N1) != null && f60Var2.i == i13) {
                            float f26 = g60Var.P1 - (j10 / 180.0f);
                            g60Var.P1 = f26;
                            if (f26 < f7) {
                                g60Var.P1 = f7;
                            }
                        } else {
                            if (z12) {
                                float f27 = g60Var.P1;
                                if (f27 != 1.0f) {
                                    float f28 = (j10 / 350.0f) + f27;
                                    g60Var.P1 = f28;
                                    if (f28 > 1.0f) {
                                        g60Var.P1 = 1.0f;
                                    }
                                }
                            }
                            if (!z12) {
                                float f29 = g60Var.P1;
                                if (f29 != 0.0f) {
                                    float f30 = f29 - (j10 / 350.0f);
                                    g60Var.P1 = f30;
                                    if (f30 < 0.0f) {
                                        g60Var.P1 = 0.0f;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            float f31 = g60Var.Q1;
                            if (f31 != 1.0f) {
                                float f32 = (j10 / 350.0f) + f31;
                                g60Var.Q1 = f32;
                                if (f32 > 1.0f) {
                                    g60Var.Q1 = 1.0f;
                                }
                            }
                        }
                        if (!z13) {
                            float f33 = g60Var.Q1;
                            if (f33 != 0.0f) {
                                float f34 = f33 - (j10 / 350.0f);
                                g60Var.Q1 = f34;
                                if (f34 < 0.0f) {
                                    g60Var.Q1 = 0.0f;
                                }
                            }
                        }
                    }
                } else {
                    i13 = i12;
                    z12 = false;
                }
                z13 = false;
                if (g60Var.M1 == null) {
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
            float interpolation2 = (this.d.getInterpolation(g60Var.P1) * 0.6f) + 0.4f;
            daVar6.e(g60Var.O0, 1.0f);
            daVar7.e(g60Var.O0, 1.0f);
            if (g60Var.M1 != null || g60Var.N1 == null || g60Var.s1()) {
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f12 = 25.909092f;
                f13 = 25.0f;
            } else {
                f60 f60Var10 = g60Var.N1;
                f12 = 25.909092f;
                int i24 = f60Var10.i;
                f13 = 25.0f;
                if (i24 == 3 || g60Var.M1.i == 3) {
                    if (i24 == 3) {
                        f20 = g60Var.L1;
                        paint3 = paint6;
                        paint3.setShader(g60Var.M1.g);
                        f19 = 1.0f;
                    } else {
                        paint3 = paint6;
                        f19 = 1.0f;
                        float f35 = 1.0f - g60Var.L1;
                        paint3.setShader(f60Var10.g);
                        f20 = f35;
                    }
                    int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.kg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Kg, false), g60Var.U1, f19);
                    Paint paint7 = paint;
                    paint7.setColor(offsetColor);
                    float measuredWidth2 = (int) ((v2Var3.getMeasuredWidth() / 2.0f) + v2Var3.getX());
                    float y3 = (int) (v2Var3.getY() + AndroidUtilities.dp(25.0f));
                    Matrix matrix4 = matrix;
                    matrix4.setTranslate(measuredWidth2, y3);
                    g60Var.R0.setLocalMatrix(matrix4);
                    paint3.setAlpha(76);
                    canvas.save();
                    canvas.scale(v2Var3.getScaleX() * 1.0f, v2Var3.getScaleY() * 1.0f, measuredWidth2, y3);
                    canvas.save();
                    float w10 = com.google.android.gms.internal.vision.e2.w(0.807f, g60Var.O0, 0.5f, 0.878f) * g60Var.Q1;
                    canvas.scale(w10, w10, measuredWidth2, y3);
                    canvas.save();
                    canvas.scale(1.2f, 1.2f, measuredWidth2, y3);
                    canvas.drawCircle(measuredWidth2, y3, AndroidUtilities.dp(160.0f), paint5);
                    canvas.restore();
                    canvas.restore();
                    if (g60Var.a1 != null) {
                        canvas.save();
                        float A = com.google.android.gms.internal.vision.e2.A(0.807f, g60Var.O0, 0.878f, interpolation2);
                        canvas.scale(A, A, measuredWidth2, y3);
                        daVar6.a(measuredWidth2, y3, canvas, paint3);
                        canvas.restore();
                        canvas.save();
                        float A2 = com.google.android.gms.internal.vision.e2.A(0.704f, g60Var.O0, 0.926f, interpolation2);
                        canvas.scale(A2, A2, measuredWidth2, y3);
                        daVar7.a(measuredWidth2, y3, canvas, paint3);
                        canvas.restore();
                    }
                    paint3.setAlpha(255);
                    if (z11) {
                        canvas.drawCircle(measuredWidth2, y3, AndroidUtilities.dp(25.909092f), paint3);
                        paint3.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Og, false));
                        if (f20 != 0.0f) {
                            paint3.setAlpha((int) (f20 * 255.0f));
                            paint3.setShader(null);
                            canvas.drawCircle(measuredWidth2, y3, AndroidUtilities.dp(25.909092f), paint3);
                        }
                    }
                    canvas.drawCircle(measuredWidth2, y3, AndroidUtilities.dp(25.0f) * f20, paint7);
                    if (!z11) {
                        radialProgressView.a(canvas, measuredWidth2, y3);
                    }
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    if (g60Var.a2.r == null) {
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
            i11 = 0;
            while (i11 < i10) {
                float dp2 = AndroidUtilities.dp(f12);
                if (i11 == 0 && g60Var.M1 != null) {
                    if (!g60Var.s1()) {
                        paint2.setShader(g60Var.M1.g);
                    }
                    f15 = 1.0f - g60Var.L1;
                    if (g60Var.M1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f15;
                    }
                    if (paint2.getShader() == null) {
                    }
                    f16 = f15;
                    f17 = dp2;
                    if (g60Var.s1()) {
                    }
                    float measuredWidth3 = (int) ((v2Var3.getMeasuredWidth() / 2.0f) + v2Var3.getX());
                    float y10 = (int) (v2Var3.getY() + AndroidUtilities.dp(f13));
                    matrix2.setTranslate(measuredWidth3, y10);
                    g60Var.R0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (g60Var.V0 * 76.0f * f16));
                    canvas2.save();
                    canvas2.scale(v2Var3.getScaleX() * 1.0f, v2Var3.getScaleX() * 1.0f, measuredWidth3, y10);
                    canvas2.save();
                    float w11 = com.google.android.gms.internal.vision.e2.w(g60Var.O0, 0.807f, 0.5f, 0.878f);
                    float f36 = g60Var.Q1;
                    canvas2.scale(f36 * w11, f36 * w11, measuredWidth3, y10);
                    if (i11 != 1) {
                    }
                    canvas2.restore();
                    if (!g60Var.s1()) {
                    }
                    if (g60.F3) {
                    }
                    float measuredWidth4 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp3 = AndroidUtilities.dp(24.0f);
                    float f37 = (f17 - measuredWidth4) + measuredWidth4;
                    float f38 = g60Var.V0;
                    float f39 = f37 * f38;
                    float f40 = ((f17 - dp3) + dp3) * f38;
                    float f41 = measuredWidth3 + f39;
                    f14 = interpolation2;
                    daVar = daVar5;
                    rectF = rectF3;
                    rectF.set(measuredWidth3 - f39, y10 - f40, f41, y10 + f40);
                    float dp4 = (f17 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (g60Var.V0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp4, dp4, paint2);
                    if (i11 != 1) {
                    }
                    canvas2.restore();
                    if (n40Var != null) {
                        paint2.setAlpha((int) (n40Var.getAlpha() * 255.0f));
                        float x10 = n40Var.getX() - getX();
                        float y11 = n40Var.getY() - getY();
                        rectF.set(x10, y11, n40Var.getMeasuredWidth() + x10, n40Var.getMeasuredHeight() + y11);
                        canvas2.save();
                        canvas2.scale(n40Var.getScaleX(), n40Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), paint2);
                        canvas2.restore();
                    }
                } else if (i11 != 1) {
                    f14 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    daVar = daVar6;
                    daVar2 = daVar7;
                    rectF = rectF3;
                } else if (g60Var.N1 != null) {
                    if (!g60Var.s1()) {
                        paint2.setShader(g60Var.N1.g);
                    }
                    f15 = g60Var.L1;
                    if (g60Var.N1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f15;
                    }
                    if (paint2.getShader() == null || g60Var.s1()) {
                        f16 = f15;
                        f17 = dp2;
                    } else {
                        f16 = f15;
                        f17 = dp2;
                        paint2.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.kg, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Kg, false), g60Var.U1, 1.0f));
                    }
                    if (g60Var.s1()) {
                        radialProgressView4 = radialProgressView2;
                        daVar3 = daVar6;
                        daVar4 = daVar7;
                    } else {
                        int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Lg, false);
                        int i25 = org.telegram.ui.ActionBar.i6.Kg;
                        radialProgressView4 = radialProgressView2;
                        int offsetColor2 = AndroidUtilities.getOffsetColor(x02, org.telegram.ui.ActionBar.i6.x0(null, i25, false), g60Var.U1, 1.0f);
                        paint2.setColor(offsetColor2);
                        paint2.setShader(null);
                        int i26 = org.telegram.ui.ActionBar.i6.kg;
                        daVar4 = daVar7;
                        daVar3 = daVar6;
                        v2Var.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, i26, false), org.telegram.ui.ActionBar.i6.x0(null, i25, false), g60Var.U1, 1.0f), offsetColor2);
                        v2Var2.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.i6.x0(null, i26, false), org.telegram.ui.ActionBar.i6.x0(null, i25, false), g60Var.U1, 1.0f), offsetColor2);
                    }
                    float measuredWidth32 = (int) ((v2Var3.getMeasuredWidth() / 2.0f) + v2Var3.getX());
                    float y102 = (int) (v2Var3.getY() + AndroidUtilities.dp(f13));
                    matrix2.setTranslate(measuredWidth32, y102);
                    g60Var.R0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (g60Var.V0 * 76.0f * f16));
                    canvas2.save();
                    canvas2.scale(v2Var3.getScaleX() * 1.0f, v2Var3.getScaleX() * 1.0f, measuredWidth32, y102);
                    canvas2.save();
                    float w112 = com.google.android.gms.internal.vision.e2.w(g60Var.O0, 0.807f, 0.5f, 0.878f);
                    float f362 = g60Var.Q1;
                    canvas2.scale(f362 * w112, f362 * w112, measuredWidth32, y102);
                    if (i11 != 1 && !g60Var.s1() && LiteMode.isEnabled(512)) {
                        canvas2.save();
                        canvas2.scale(1.2f, 1.2f, measuredWidth32, y102);
                        int alpha = paint5.getAlpha();
                        paint5.setAlpha((int) ((1.0f - g60Var.z3.e) * g60Var.V0 * alpha));
                        canvas2.drawCircle(measuredWidth32, y102, AndroidUtilities.dp(160.0f), paint5);
                        paint5.setAlpha(alpha);
                        canvas2.restore();
                    }
                    canvas2.restore();
                    if (!g60Var.s1()) {
                        daVar2 = daVar4;
                        daVar5 = daVar3;
                    } else if (g60Var.V0 > 0.0f) {
                        canvas2.save();
                        float w12 = com.google.android.gms.internal.vision.e2.w(g60Var.O0, 0.807f, interpolation2, 0.878f);
                        canvas2.scale(w12, w12, measuredWidth32, y102);
                        daVar5 = daVar3;
                        daVar5.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                        canvas2.save();
                        float w13 = com.google.android.gms.internal.vision.e2.w(g60Var.O0, 0.704f, interpolation2, 0.926f);
                        canvas2.scale(w13, w13, measuredWidth32, y102);
                        daVar2 = daVar4;
                        daVar2.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                    } else {
                        daVar2 = daVar4;
                        daVar5 = daVar3;
                    }
                    if (g60.F3) {
                        if (i11 == 0) {
                            paint2.setAlpha(255);
                        } else {
                            paint2.setAlpha((int) (f16 * 255.0f));
                        }
                    } else if (i11 == 0) {
                        paint2.setAlpha((int) (g60Var.W0 * 255.0f));
                    } else {
                        paint2.setAlpha((int) (g60Var.W0 * f16 * 255.0f));
                    }
                    float measuredWidth42 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp32 = AndroidUtilities.dp(24.0f);
                    float f372 = (f17 - measuredWidth42) + measuredWidth42;
                    float f382 = g60Var.V0;
                    float f392 = f372 * f382;
                    float f402 = ((f17 - dp32) + dp32) * f382;
                    float f412 = measuredWidth32 + f392;
                    f14 = interpolation2;
                    daVar = daVar5;
                    rectF = rectF3;
                    rectF.set(measuredWidth32 - f392, y102 - f402, f412, y102 + f402);
                    float dp42 = (f17 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (g60Var.V0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp42, dp42, paint2);
                    if (i11 != 1) {
                        f18 = 4.0f;
                        if (g60Var.N1.i == 3) {
                            if (g60Var.s1()) {
                                radialProgressView3 = radialProgressView4;
                                radialProgressView3.setSize((int) ((dp42 * 2.0f) - AndroidUtilities.dp(4.0f)));
                            } else {
                                radialProgressView3 = radialProgressView4;
                            }
                            radialProgressView3.a(canvas2, measuredWidth32, y102);
                        } else {
                            radialProgressView3 = radialProgressView4;
                        }
                    } else {
                        f18 = 4.0f;
                        radialProgressView3 = radialProgressView4;
                    }
                    canvas2.restore();
                    if (n40Var != null && n40Var.getVisibility() == 0) {
                        paint2.setAlpha((int) (n40Var.getAlpha() * 255.0f));
                        float x102 = n40Var.getX() - getX();
                        float y112 = n40Var.getY() - getY();
                        rectF.set(x102, y112, n40Var.getMeasuredWidth() + x102, n40Var.getMeasuredHeight() + y112);
                        canvas2.save();
                        canvas2.scale(n40Var.getScaleX(), n40Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f18), AndroidUtilities.dp(f18), paint2);
                        canvas2.restore();
                    }
                } else {
                    f14 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    daVar = daVar6;
                    daVar2 = daVar7;
                    rectF = rectF3;
                }
                i11++;
                rectF3 = rectF;
                daVar7 = daVar2;
                radialProgressView2 = radialProgressView3;
                interpolation2 = f14;
                daVar6 = daVar;
            }
            super.dispatchDraw(canvas);
            if (g60Var.a2.r == null) {
            }
        }
        f10 = 1.0f;
        f11 = f10;
        z10 = true;
        if (z10) {
        }
        float interpolation22 = (this.d.getInterpolation(g60Var.P1) * 0.6f) + 0.4f;
        daVar6.e(g60Var.O0, 1.0f);
        daVar7.e(g60Var.O0, 1.0f);
        if (g60Var.M1 != null) {
        }
        canvas2 = canvas;
        paint2 = paint6;
        radialProgressView2 = radialProgressView;
        matrix2 = matrix;
        f12 = 25.909092f;
        f13 = 25.0f;
        i11 = 0;
        while (i11 < i10) {
        }
        super.dispatchDraw(canvas);
        if (g60Var.a2.r == null) {
        }
    }
}
