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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p30 extends kh.b {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ k60 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p30(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = k60Var;
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
        float f7;
        float f10;
        j60 j60Var;
        boolean z10;
        Paint paint;
        Matrix matrix;
        RadialProgressView radialProgressView;
        boolean z11;
        Canvas canvas2;
        Paint paint2;
        RadialProgressView radialProgressView2;
        Matrix matrix2;
        float f11;
        float f12;
        int i10;
        float f13;
        RadialProgressView radialProgressView3;
        org.telegram.ui.Components.z9 z9Var;
        org.telegram.ui.Components.z9 z9Var2;
        RectF rectF;
        float f14;
        int dp;
        float f15;
        float f16;
        RadialProgressView radialProgressView4;
        org.telegram.ui.Components.z9 z9Var3;
        org.telegram.ui.Components.z9 z9Var4;
        org.telegram.ui.Components.z9 z9Var5;
        float f17;
        Paint paint3;
        float f18;
        float f19;
        int i11;
        boolean z12;
        boolean z13;
        j60 j60Var2;
        j60 j60Var3;
        int i12;
        int i13;
        int i14;
        int i15;
        k60 k60Var = this.f;
        Paint paint4 = k60Var.J1;
        org.telegram.ui.Components.voip.v2 v2Var = k60Var.r;
        org.telegram.ui.Components.voip.v2 v2Var2 = k60Var.v;
        Matrix matrix3 = k60Var.S0;
        org.telegram.ui.Components.z9 z9Var6 = k60Var.N0;
        org.telegram.ui.Components.z9 z9Var7 = k60Var.M0;
        RectF rectF2 = k60Var.v0;
        Paint paint5 = k60Var.T0;
        RadialProgressView radialProgressView5 = k60Var.e0;
        r40 r40Var = k60Var.T;
        int[] iArr = k60Var.X1;
        org.telegram.ui.Components.voip.v2 v2Var3 = k60Var.w;
        Paint paint6 = k60Var.I1;
        if (k60Var.l2 && k60Var.g2) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - k60Var.O1;
        k60Var.O1 = elapsedRealtime;
        if (j3 > 20) {
            j3 = 17;
        }
        long j10 = j3;
        j60 j60Var4 = k60Var.N1;
        if (j60Var4 != null) {
            j60Var4.b(0, measuredWidth, getMeasuredHeight(), j10, k60Var.O0);
        }
        z9Var7.a = AndroidUtilities.dp(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        z9Var7.b = com.google.android.gms.internal.vision.e2.B(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(62.0f), 0.48076922f);
        z9Var6.a = AndroidUtilities.dp(65.0f) * 0.46296296f;
        z9Var6.b = com.google.android.gms.internal.vision.e2.B(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(65.0f), 0.48076922f);
        float f20 = k60Var.P0;
        float f21 = k60Var.O0;
        if (f20 != f21) {
            f7 = 0.6f;
            float f22 = k60Var.Q0;
            f10 = 0.0f;
            float f23 = (j10 * f22) + f21;
            k60Var.O0 = f23;
            if (f22 > 0.0f) {
                if (f23 > f20) {
                    k60Var.O0 = f20;
                }
            } else if (f23 < f20) {
                k60Var.O0 = f20;
            }
        } else {
            f7 = 0.6f;
            f10 = 0.0f;
        }
        j60 j60Var5 = k60Var.M1;
        if (j60Var5 != null && j60Var5.i == 3) {
            radialProgressView5.H = true;
            if (Math.abs(radialProgressView5.n) < 360.0f) {
                z10 = false;
                if (z10) {
                }
                float interpolation = (this.d.getInterpolation(k60Var.P1) * f7) + 0.4f;
                z9Var6.e(k60Var.O0, 1.0f);
                z9Var7.e(k60Var.O0, 1.0f);
                if (k60Var.M1 != null) {
                }
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f11 = 25.909092f;
                f12 = 25.0f;
                i10 = 0;
                while (i10 < 2) {
                }
                super.dispatchDraw(canvas);
                if (k60Var.a2.r == null) {
                }
            }
        } else if (j60Var5 != null && (j60Var = k60Var.N1) != null && j60Var.i == 3) {
            radialProgressView5.H = true;
            radialProgressView5.I = 1.0f;
            z10 = true;
            if (z10) {
                float f24 = k60Var.L1;
                if (f24 != 1.0f) {
                    j60 j60Var6 = k60Var.M1;
                    if (j60Var6 == null || j60Var6.i != 3) {
                        k60Var.L1 = (j10 / 180.0f) + f24;
                    } else {
                        k60Var.L1 = (j10 / 100.0f) + f24;
                    }
                    if (k60Var.L1 >= 1.0f) {
                        k60Var.L1 = 1.0f;
                        k60Var.M1 = null;
                        j60 j60Var7 = k60Var.N1;
                        if (j60Var7 != null && j60Var7.i == 3) {
                            radialProgressView5.H = false;
                        }
                    }
                    k60Var.W1 = true;
                }
                if (!k60Var.W1 || (j60Var3 = k60Var.N1) == null) {
                    paint = paint4;
                    matrix = matrix3;
                    radialProgressView = radialProgressView5;
                    z11 = z10;
                } else {
                    k60Var.W1 = false;
                    j60 j60Var8 = k60Var.M1;
                    if (j60Var8 != null) {
                        k60.S(k60Var, j60Var8.i, iArr);
                        int i16 = iArr[0];
                        int i17 = iArr[1];
                        z11 = z10;
                        int i18 = iArr[2];
                        radialProgressView = radialProgressView5;
                        int i19 = iArr[3];
                        matrix = matrix3;
                        k60.S(k60Var, k60Var.N1.i, iArr);
                        paint = paint4;
                        i12 = i0.a.d(k60Var.L1, i16, iArr[0]);
                        i13 = i0.a.d(k60Var.L1, i17, iArr[1]);
                        i14 = i0.a.d(k60Var.L1, i18, iArr[2]);
                        i15 = i0.a.d(k60Var.L1, i19, iArr[3]);
                    } else {
                        paint = paint4;
                        matrix = matrix3;
                        radialProgressView = radialProgressView5;
                        z11 = z10;
                        k60.S(k60Var, j60Var3.i, iArr);
                        i12 = iArr[0];
                        i13 = iArr[1];
                        i14 = iArr[2];
                        i15 = iArr[3];
                    }
                    if (this.e != i12) {
                        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(45.454548f), new int[]{i0.a.k(i12, 60), i0.a.k(i12, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                        k60Var.R0 = radialGradient;
                        paint5.setShader(radialGradient);
                        this.e = i12;
                    }
                    v2Var2.a(i14, i13);
                    v2Var.a(i14, i13);
                    k60Var.n.a(i14, i13);
                    k60Var.f.a(i14, i13);
                    org.telegram.ui.Components.voip.v2 v2Var4 = k60Var.s;
                    int i20 = org.telegram.ui.ActionBar.j6.Dg;
                    v2Var4.a(org.telegram.ui.ActionBar.j6.w0(null, i20, false), org.telegram.ui.ActionBar.j6.w0(null, i20, false));
                    k60Var.h.a(i13, i15);
                }
                j60 j60Var9 = k60Var.N1;
                if (j60Var9 != null) {
                    int i21 = j60Var9.i;
                    z12 = i21 == 1 || i21 == 0 || k60.p1(i21);
                    i11 = 3;
                    if (k60Var.N1.i != 3) {
                        z13 = true;
                        if (k60Var.M1 == null && (j60Var2 = k60Var.N1) != null && j60Var2.i == i11) {
                            float f25 = k60Var.P1 - (j10 / 180.0f);
                            k60Var.P1 = f25;
                            if (f25 < f10) {
                                k60Var.P1 = 0.0f;
                            }
                        } else {
                            if (z12) {
                                float f26 = k60Var.P1;
                                if (f26 != 1.0f) {
                                    float f27 = (j10 / 350.0f) + f26;
                                    k60Var.P1 = f27;
                                    if (f27 > 1.0f) {
                                        k60Var.P1 = 1.0f;
                                    }
                                }
                            }
                            if (!z12) {
                                float f28 = k60Var.P1;
                                if (f28 != 0.0f) {
                                    float f29 = f28 - (j10 / 350.0f);
                                    k60Var.P1 = f29;
                                    if (f29 < 0.0f) {
                                        k60Var.P1 = 0.0f;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            float f30 = k60Var.Q1;
                            if (f30 != 1.0f) {
                                float f31 = (j10 / 350.0f) + f30;
                                k60Var.Q1 = f31;
                                if (f31 > 1.0f) {
                                    k60Var.Q1 = 1.0f;
                                }
                            }
                        }
                        if (!z13) {
                            float f32 = k60Var.Q1;
                            if (f32 != 0.0f) {
                                float f33 = f32 - (j10 / 350.0f);
                                k60Var.Q1 = f33;
                                if (f33 < 0.0f) {
                                    k60Var.Q1 = 0.0f;
                                }
                            }
                        }
                    }
                } else {
                    i11 = 3;
                    z12 = false;
                }
                z13 = false;
                if (k60Var.M1 == null) {
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
            float interpolation2 = (this.d.getInterpolation(k60Var.P1) * f7) + 0.4f;
            z9Var6.e(k60Var.O0, 1.0f);
            z9Var7.e(k60Var.O0, 1.0f);
            if (k60Var.M1 != null || k60Var.N1 == null || k60Var.r1()) {
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f11 = 25.909092f;
                f12 = 25.0f;
            } else {
                j60 j60Var10 = k60Var.N1;
                f11 = 25.909092f;
                int i22 = j60Var10.i;
                f12 = 25.0f;
                if (i22 == 3 || k60Var.M1.i == 3) {
                    if (i22 == 3) {
                        f19 = k60Var.L1;
                        paint3 = paint6;
                        paint3.setShader(k60Var.M1.g);
                        f18 = 1.0f;
                    } else {
                        paint3 = paint6;
                        f18 = 1.0f;
                        float f34 = 1.0f - k60Var.L1;
                        paint3.setShader(j60Var10.g);
                        f19 = f34;
                    }
                    int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Kg, false), k60Var.U1, f18);
                    Paint paint7 = paint;
                    paint7.setColor(offsetColor);
                    float measuredWidth2 = (int) ((v2Var3.getMeasuredWidth() / 2.0f) + v2Var3.getX());
                    float y3 = (int) (v2Var3.getY() + AndroidUtilities.dp(25.0f));
                    Matrix matrix4 = matrix;
                    matrix4.setTranslate(measuredWidth2, y3);
                    k60Var.R0.setLocalMatrix(matrix4);
                    paint3.setAlpha(76);
                    canvas.save();
                    canvas.scale(v2Var3.getScaleX() * 1.0f, v2Var3.getScaleY() * 1.0f, measuredWidth2, y3);
                    canvas.save();
                    float x10 = com.google.android.gms.internal.vision.e2.x(0.807f, k60Var.O0, 0.5f, 0.878f) * k60Var.Q1;
                    canvas.scale(x10, x10, measuredWidth2, y3);
                    canvas.save();
                    canvas.scale(1.2f, 1.2f, measuredWidth2, y3);
                    canvas.drawCircle(measuredWidth2, y3, AndroidUtilities.dp(160.0f), paint5);
                    canvas.restore();
                    canvas.restore();
                    if (k60Var.a1 != null) {
                        canvas.save();
                        float B = com.google.android.gms.internal.vision.e2.B(0.807f, k60Var.O0, 0.878f, interpolation2);
                        canvas.scale(B, B, measuredWidth2, y3);
                        z9Var6.a(measuredWidth2, y3, canvas, paint3);
                        canvas.restore();
                        canvas.save();
                        float B2 = com.google.android.gms.internal.vision.e2.B(0.704f, k60Var.O0, 0.926f, interpolation2);
                        canvas.scale(B2, B2, measuredWidth2, y3);
                        z9Var7.a(measuredWidth2, y3, canvas, paint3);
                        canvas.restore();
                    }
                    paint3.setAlpha(255);
                    if (z11) {
                        canvas.drawCircle(measuredWidth2, y3, AndroidUtilities.dp(25.909092f), paint3);
                        paint3.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Og, false));
                        if (f19 != 0.0f) {
                            paint3.setAlpha((int) (f19 * 255.0f));
                            paint3.setShader(null);
                            canvas.drawCircle(measuredWidth2, y3, AndroidUtilities.dp(25.909092f), paint3);
                        }
                    }
                    canvas.drawCircle(measuredWidth2, y3, AndroidUtilities.dp(25.0f) * f19, paint7);
                    if (!z11) {
                        radialProgressView.a(canvas, measuredWidth2, y3);
                    }
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    if (k60Var.a2.r == null) {
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
                float dp2 = AndroidUtilities.dp(f11);
                if (i10 == 0 && k60Var.M1 != null) {
                    if (!k60Var.r1()) {
                        paint2.setShader(k60Var.M1.g);
                    }
                    f14 = 1.0f - k60Var.L1;
                    if (k60Var.M1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f14;
                    }
                    if (paint2.getShader() == null) {
                    }
                    f15 = f14;
                    f16 = dp2;
                    if (k60Var.r1()) {
                    }
                    float measuredWidth3 = (int) ((v2Var3.getMeasuredWidth() / 2.0f) + v2Var3.getX());
                    float y10 = (int) (v2Var3.getY() + AndroidUtilities.dp(f12));
                    matrix2.setTranslate(measuredWidth3, y10);
                    k60Var.R0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (k60Var.V0 * 76.0f * f15));
                    canvas2.save();
                    canvas2.scale(v2Var3.getScaleX() * 1.0f, v2Var3.getScaleX() * 1.0f, measuredWidth3, y10);
                    canvas2.save();
                    float x11 = com.google.android.gms.internal.vision.e2.x(k60Var.O0, 0.807f, 0.5f, 0.878f);
                    float f35 = k60Var.Q1;
                    canvas2.scale(f35 * x11, f35 * x11, measuredWidth3, y10);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (!k60Var.r1()) {
                    }
                    if (k60.F3) {
                    }
                    float measuredWidth4 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp3 = AndroidUtilities.dp(24.0f);
                    float f36 = (f16 - measuredWidth4) + measuredWidth4;
                    float f37 = k60Var.V0;
                    float f38 = f36 * f37;
                    float f39 = ((f16 - dp3) + dp3) * f37;
                    float f40 = measuredWidth3 + f38;
                    f13 = interpolation2;
                    z9Var = z9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth3 - f38, y10 - f39, f40, y10 + f39);
                    float dp4 = (f16 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (k60Var.V0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp4, dp4, paint2);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (r40Var != null) {
                        paint2.setAlpha((int) (r40Var.getAlpha() * 255.0f));
                        float x12 = r40Var.getX() - getX();
                        float y11 = r40Var.getY() - getY();
                        rectF.set(x12, y11, r40Var.getMeasuredWidth() + x12, r40Var.getMeasuredHeight() + y11);
                        canvas2.save();
                        canvas2.scale(r40Var.getScaleX(), r40Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), paint2);
                        canvas2.restore();
                    }
                } else if (i10 != 1 || k60Var.N1 == null) {
                    f13 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    z9Var = z9Var6;
                    z9Var2 = z9Var7;
                    rectF = rectF3;
                } else {
                    if (!k60Var.r1()) {
                        paint2.setShader(k60Var.N1.g);
                    }
                    f14 = k60Var.L1;
                    if (k60Var.N1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f14;
                    }
                    if (paint2.getShader() == null || k60Var.r1()) {
                        f15 = f14;
                        f16 = dp2;
                    } else {
                        f15 = f14;
                        f16 = dp2;
                        paint2.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Kg, false), k60Var.U1, 1.0f));
                    }
                    if (k60Var.r1()) {
                        radialProgressView4 = radialProgressView2;
                        z9Var3 = z9Var6;
                        z9Var4 = z9Var7;
                    } else {
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lg, false);
                        int i23 = org.telegram.ui.ActionBar.j6.Kg;
                        radialProgressView4 = radialProgressView2;
                        int offsetColor2 = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.j6.w0(null, i23, false), k60Var.U1, 1.0f);
                        paint2.setColor(offsetColor2);
                        paint2.setShader(null);
                        int i24 = org.telegram.ui.ActionBar.j6.kg;
                        z9Var4 = z9Var7;
                        z9Var3 = z9Var6;
                        v2Var.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false), org.telegram.ui.ActionBar.j6.w0(null, i23, false), k60Var.U1, 1.0f), offsetColor2);
                        v2Var2.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false), org.telegram.ui.ActionBar.j6.w0(null, i23, false), k60Var.U1, 1.0f), offsetColor2);
                    }
                    float measuredWidth32 = (int) ((v2Var3.getMeasuredWidth() / 2.0f) + v2Var3.getX());
                    float y102 = (int) (v2Var3.getY() + AndroidUtilities.dp(f12));
                    matrix2.setTranslate(measuredWidth32, y102);
                    k60Var.R0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (k60Var.V0 * 76.0f * f15));
                    canvas2.save();
                    canvas2.scale(v2Var3.getScaleX() * 1.0f, v2Var3.getScaleX() * 1.0f, measuredWidth32, y102);
                    canvas2.save();
                    float x112 = com.google.android.gms.internal.vision.e2.x(k60Var.O0, 0.807f, 0.5f, 0.878f);
                    float f352 = k60Var.Q1;
                    canvas2.scale(f352 * x112, f352 * x112, measuredWidth32, y102);
                    if (i10 != 1 && !k60Var.r1() && LiteMode.isEnabled(512)) {
                        canvas2.save();
                        canvas2.scale(1.2f, 1.2f, measuredWidth32, y102);
                        int alpha = paint5.getAlpha();
                        paint5.setAlpha((int) ((1.0f - k60Var.z3.e) * k60Var.V0 * alpha));
                        canvas2.drawCircle(measuredWidth32, y102, AndroidUtilities.dp(160.0f), paint5);
                        paint5.setAlpha(alpha);
                        canvas2.restore();
                    }
                    canvas2.restore();
                    if (!k60Var.r1()) {
                        z9Var2 = z9Var4;
                        z9Var5 = z9Var3;
                    } else if (k60Var.V0 > 0.0f) {
                        canvas2.save();
                        float x13 = com.google.android.gms.internal.vision.e2.x(k60Var.O0, 0.807f, interpolation2, 0.878f);
                        canvas2.scale(x13, x13, measuredWidth32, y102);
                        z9Var5 = z9Var3;
                        z9Var5.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                        canvas2.save();
                        float x14 = com.google.android.gms.internal.vision.e2.x(k60Var.O0, 0.704f, interpolation2, 0.926f);
                        canvas2.scale(x14, x14, measuredWidth32, y102);
                        z9Var2 = z9Var4;
                        z9Var2.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                    } else {
                        z9Var2 = z9Var4;
                        z9Var5 = z9Var3;
                    }
                    if (k60.F3) {
                        if (i10 == 0) {
                            paint2.setAlpha(255);
                        } else {
                            paint2.setAlpha((int) (f15 * 255.0f));
                        }
                    } else if (i10 == 0) {
                        paint2.setAlpha((int) (k60Var.W0 * 255.0f));
                    } else {
                        paint2.setAlpha((int) (k60Var.W0 * f15 * 255.0f));
                    }
                    float measuredWidth42 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp32 = AndroidUtilities.dp(24.0f);
                    float f362 = (f16 - measuredWidth42) + measuredWidth42;
                    float f372 = k60Var.V0;
                    float f382 = f362 * f372;
                    float f392 = ((f16 - dp32) + dp32) * f372;
                    float f402 = measuredWidth32 + f382;
                    f13 = interpolation2;
                    z9Var = z9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth32 - f382, y102 - f392, f402, y102 + f392);
                    float dp42 = (f16 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (k60Var.V0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp42, dp42, paint2);
                    if (i10 != 1) {
                        f17 = 4.0f;
                        if (k60Var.N1.i == 3) {
                            if (k60Var.r1()) {
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
                        radialProgressView3 = radialProgressView4;
                        f17 = 4.0f;
                    }
                    canvas2.restore();
                    if (r40Var != null && r40Var.getVisibility() == 0) {
                        paint2.setAlpha((int) (r40Var.getAlpha() * 255.0f));
                        float x122 = r40Var.getX() - getX();
                        float y112 = r40Var.getY() - getY();
                        rectF.set(x122, y112, r40Var.getMeasuredWidth() + x122, r40Var.getMeasuredHeight() + y112);
                        canvas2.save();
                        canvas2.scale(r40Var.getScaleX(), r40Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), paint2);
                        canvas2.restore();
                    }
                }
                i10++;
                rectF3 = rectF;
                z9Var7 = z9Var2;
                radialProgressView2 = radialProgressView3;
                interpolation2 = f13;
                z9Var6 = z9Var;
            }
            super.dispatchDraw(canvas);
            if (k60Var.a2.r == null) {
            }
        }
        z10 = true;
        if (z10) {
        }
        float interpolation22 = (this.d.getInterpolation(k60Var.P1) * f7) + 0.4f;
        z9Var6.e(k60Var.O0, 1.0f);
        z9Var7.e(k60Var.O0, 1.0f);
        if (k60Var.M1 != null) {
        }
        canvas2 = canvas;
        paint2 = paint6;
        radialProgressView2 = radialProgressView;
        matrix2 = matrix;
        f11 = 25.909092f;
        f12 = 25.0f;
        i10 = 0;
        while (i10 < 2) {
        }
        super.dispatchDraw(canvas);
        if (k60Var.a2.r == null) {
        }
    }
}
