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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class n30 extends lh.b {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ j60 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n30(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = j60Var;
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
        i60 i60Var;
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
        org.telegram.ui.Components.ca caVar;
        org.telegram.ui.Components.ca caVar2;
        RectF rectF;
        float f14;
        int dp;
        float f15;
        float f16;
        RadialProgressView radialProgressView4;
        org.telegram.ui.Components.ca caVar3;
        org.telegram.ui.Components.ca caVar4;
        org.telegram.ui.Components.ca caVar5;
        float f17;
        Paint paint3;
        float f18;
        float f19;
        int i11;
        boolean z12;
        boolean z13;
        i60 i60Var2;
        i60 i60Var3;
        int i12;
        int i13;
        int i14;
        int i15;
        j60 j60Var = this.f;
        Paint paint4 = j60Var.J1;
        org.telegram.ui.Components.voip.t2 t2Var = j60Var.r;
        org.telegram.ui.Components.voip.t2 t2Var2 = j60Var.v;
        Matrix matrix3 = j60Var.S0;
        org.telegram.ui.Components.ca caVar6 = j60Var.N0;
        org.telegram.ui.Components.ca caVar7 = j60Var.M0;
        RectF rectF2 = j60Var.v0;
        Paint paint5 = j60Var.T0;
        RadialProgressView radialProgressView5 = j60Var.e0;
        p40 p40Var = j60Var.T;
        int[] iArr = j60Var.X1;
        org.telegram.ui.Components.voip.t2 t2Var3 = j60Var.w;
        Paint paint6 = j60Var.I1;
        if (j60Var.l2 && j60Var.g2) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - j60Var.O1;
        j60Var.O1 = elapsedRealtime;
        if (j3 > 20) {
            j3 = 17;
        }
        long j10 = j3;
        i60 i60Var4 = j60Var.N1;
        if (i60Var4 != null) {
            i60Var4.b(0, measuredWidth, getMeasuredHeight(), j10, j60Var.O0);
        }
        caVar7.a = AndroidUtilities.dp(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        caVar7.b = com.google.android.gms.internal.vision.e2.B(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(62.0f), 0.48076922f);
        caVar6.a = AndroidUtilities.dp(65.0f) * 0.46296296f;
        caVar6.b = com.google.android.gms.internal.vision.e2.B(AndroidUtilities.dp(20.0f), 0.6f, AndroidUtilities.dp(65.0f), 0.48076922f);
        float f20 = j60Var.P0;
        float f21 = j60Var.O0;
        if (f20 != f21) {
            f7 = 0.6f;
            float f22 = j60Var.Q0;
            f10 = 0.0f;
            float f23 = (j10 * f22) + f21;
            j60Var.O0 = f23;
            if (f22 > 0.0f) {
                if (f23 > f20) {
                    j60Var.O0 = f20;
                }
            } else if (f23 < f20) {
                j60Var.O0 = f20;
            }
        } else {
            f7 = 0.6f;
            f10 = 0.0f;
        }
        i60 i60Var5 = j60Var.M1;
        if (i60Var5 != null && i60Var5.i == 3) {
            radialProgressView5.H = true;
            if (Math.abs(radialProgressView5.n) < 360.0f) {
                z10 = false;
                if (z10) {
                }
                float interpolation = (this.d.getInterpolation(j60Var.P1) * f7) + 0.4f;
                caVar6.e(j60Var.O0, 1.0f);
                caVar7.e(j60Var.O0, 1.0f);
                if (j60Var.M1 != null) {
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
                if (j60Var.a2.r == null) {
                }
            }
        } else if (i60Var5 != null && (i60Var = j60Var.N1) != null && i60Var.i == 3) {
            radialProgressView5.H = true;
            radialProgressView5.I = 1.0f;
            z10 = true;
            if (z10) {
                float f24 = j60Var.L1;
                if (f24 != 1.0f) {
                    i60 i60Var6 = j60Var.M1;
                    if (i60Var6 == null || i60Var6.i != 3) {
                        j60Var.L1 = (j10 / 180.0f) + f24;
                    } else {
                        j60Var.L1 = (j10 / 100.0f) + f24;
                    }
                    if (j60Var.L1 >= 1.0f) {
                        j60Var.L1 = 1.0f;
                        j60Var.M1 = null;
                        i60 i60Var7 = j60Var.N1;
                        if (i60Var7 != null && i60Var7.i == 3) {
                            radialProgressView5.H = false;
                        }
                    }
                    j60Var.W1 = true;
                }
                if (!j60Var.W1 || (i60Var3 = j60Var.N1) == null) {
                    paint = paint4;
                    matrix = matrix3;
                    radialProgressView = radialProgressView5;
                    z11 = z10;
                } else {
                    j60Var.W1 = false;
                    i60 i60Var8 = j60Var.M1;
                    if (i60Var8 != null) {
                        j60.S(j60Var, i60Var8.i, iArr);
                        int i16 = iArr[0];
                        int i17 = iArr[1];
                        z11 = z10;
                        int i18 = iArr[2];
                        radialProgressView = radialProgressView5;
                        int i19 = iArr[3];
                        matrix = matrix3;
                        j60.S(j60Var, j60Var.N1.i, iArr);
                        paint = paint4;
                        i12 = i0.a.d(j60Var.L1, i16, iArr[0]);
                        i13 = i0.a.d(j60Var.L1, i17, iArr[1]);
                        i14 = i0.a.d(j60Var.L1, i18, iArr[2]);
                        i15 = i0.a.d(j60Var.L1, i19, iArr[3]);
                    } else {
                        paint = paint4;
                        matrix = matrix3;
                        radialProgressView = radialProgressView5;
                        z11 = z10;
                        j60.S(j60Var, i60Var3.i, iArr);
                        i12 = iArr[0];
                        i13 = iArr[1];
                        i14 = iArr[2];
                        i15 = iArr[3];
                    }
                    if (this.e != i12) {
                        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(45.454548f), new int[]{i0.a.k(i12, 60), i0.a.k(i12, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                        j60Var.R0 = radialGradient;
                        paint5.setShader(radialGradient);
                        this.e = i12;
                    }
                    t2Var2.a(i14, i13);
                    t2Var.a(i14, i13);
                    j60Var.n.a(i14, i13);
                    j60Var.f.a(i14, i13);
                    org.telegram.ui.Components.voip.t2 t2Var4 = j60Var.s;
                    int i20 = org.telegram.ui.ActionBar.j6.Dg;
                    t2Var4.a(org.telegram.ui.ActionBar.j6.w0(null, i20, false), org.telegram.ui.ActionBar.j6.w0(null, i20, false));
                    j60Var.h.a(i13, i15);
                }
                i60 i60Var9 = j60Var.N1;
                if (i60Var9 != null) {
                    int i21 = i60Var9.i;
                    z12 = i21 == 1 || i21 == 0 || j60.p1(i21);
                    i11 = 3;
                    if (j60Var.N1.i != 3) {
                        z13 = true;
                        if (j60Var.M1 == null && (i60Var2 = j60Var.N1) != null && i60Var2.i == i11) {
                            float f25 = j60Var.P1 - (j10 / 180.0f);
                            j60Var.P1 = f25;
                            if (f25 < f10) {
                                j60Var.P1 = 0.0f;
                            }
                        } else {
                            if (z12) {
                                float f26 = j60Var.P1;
                                if (f26 != 1.0f) {
                                    float f27 = (j10 / 350.0f) + f26;
                                    j60Var.P1 = f27;
                                    if (f27 > 1.0f) {
                                        j60Var.P1 = 1.0f;
                                    }
                                }
                            }
                            if (!z12) {
                                float f28 = j60Var.P1;
                                if (f28 != 0.0f) {
                                    float f29 = f28 - (j10 / 350.0f);
                                    j60Var.P1 = f29;
                                    if (f29 < 0.0f) {
                                        j60Var.P1 = 0.0f;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            float f30 = j60Var.Q1;
                            if (f30 != 1.0f) {
                                float f31 = (j10 / 350.0f) + f30;
                                j60Var.Q1 = f31;
                                if (f31 > 1.0f) {
                                    j60Var.Q1 = 1.0f;
                                }
                            }
                        }
                        if (!z13) {
                            float f32 = j60Var.Q1;
                            if (f32 != 0.0f) {
                                float f33 = f32 - (j10 / 350.0f);
                                j60Var.Q1 = f33;
                                if (f33 < 0.0f) {
                                    j60Var.Q1 = 0.0f;
                                }
                            }
                        }
                    }
                } else {
                    i11 = 3;
                    z12 = false;
                }
                z13 = false;
                if (j60Var.M1 == null) {
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
            float interpolation2 = (this.d.getInterpolation(j60Var.P1) * f7) + 0.4f;
            caVar6.e(j60Var.O0, 1.0f);
            caVar7.e(j60Var.O0, 1.0f);
            if (j60Var.M1 != null || j60Var.N1 == null || j60Var.r1()) {
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f11 = 25.909092f;
                f12 = 25.0f;
            } else {
                i60 i60Var10 = j60Var.N1;
                f11 = 25.909092f;
                int i22 = i60Var10.i;
                f12 = 25.0f;
                if (i22 == 3 || j60Var.M1.i == 3) {
                    if (i22 == 3) {
                        f19 = j60Var.L1;
                        paint3 = paint6;
                        paint3.setShader(j60Var.M1.g);
                        f18 = 1.0f;
                    } else {
                        paint3 = paint6;
                        f18 = 1.0f;
                        float f34 = 1.0f - j60Var.L1;
                        paint3.setShader(i60Var10.g);
                        f19 = f34;
                    }
                    int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Kg, false), j60Var.U1, f18);
                    Paint paint7 = paint;
                    paint7.setColor(offsetColor);
                    float measuredWidth2 = (int) ((t2Var3.getMeasuredWidth() / 2.0f) + t2Var3.getX());
                    float y3 = (int) (t2Var3.getY() + AndroidUtilities.dp(25.0f));
                    Matrix matrix4 = matrix;
                    matrix4.setTranslate(measuredWidth2, y3);
                    j60Var.R0.setLocalMatrix(matrix4);
                    paint3.setAlpha(76);
                    canvas.save();
                    canvas.scale(t2Var3.getScaleX() * 1.0f, t2Var3.getScaleY() * 1.0f, measuredWidth2, y3);
                    canvas.save();
                    float x10 = com.google.android.gms.internal.vision.e2.x(0.807f, j60Var.O0, 0.5f, 0.878f) * j60Var.Q1;
                    canvas.scale(x10, x10, measuredWidth2, y3);
                    canvas.save();
                    canvas.scale(1.2f, 1.2f, measuredWidth2, y3);
                    canvas.drawCircle(measuredWidth2, y3, AndroidUtilities.dp(160.0f), paint5);
                    canvas.restore();
                    canvas.restore();
                    if (j60Var.a1 != null) {
                        canvas.save();
                        float B = com.google.android.gms.internal.vision.e2.B(0.807f, j60Var.O0, 0.878f, interpolation2);
                        canvas.scale(B, B, measuredWidth2, y3);
                        caVar6.a(measuredWidth2, y3, canvas, paint3);
                        canvas.restore();
                        canvas.save();
                        float B2 = com.google.android.gms.internal.vision.e2.B(0.704f, j60Var.O0, 0.926f, interpolation2);
                        canvas.scale(B2, B2, measuredWidth2, y3);
                        caVar7.a(measuredWidth2, y3, canvas, paint3);
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
                    if (j60Var.a2.r == null) {
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
                if (i10 == 0 && j60Var.M1 != null) {
                    if (!j60Var.r1()) {
                        paint2.setShader(j60Var.M1.g);
                    }
                    f14 = 1.0f - j60Var.L1;
                    if (j60Var.M1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f14;
                    }
                    if (paint2.getShader() == null) {
                    }
                    f15 = f14;
                    f16 = dp2;
                    if (j60Var.r1()) {
                    }
                    float measuredWidth3 = (int) ((t2Var3.getMeasuredWidth() / 2.0f) + t2Var3.getX());
                    float y10 = (int) (t2Var3.getY() + AndroidUtilities.dp(f12));
                    matrix2.setTranslate(measuredWidth3, y10);
                    j60Var.R0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (j60Var.V0 * 76.0f * f15));
                    canvas2.save();
                    canvas2.scale(t2Var3.getScaleX() * 1.0f, t2Var3.getScaleX() * 1.0f, measuredWidth3, y10);
                    canvas2.save();
                    float x11 = com.google.android.gms.internal.vision.e2.x(j60Var.O0, 0.807f, 0.5f, 0.878f);
                    float f35 = j60Var.Q1;
                    canvas2.scale(f35 * x11, f35 * x11, measuredWidth3, y10);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (!j60Var.r1()) {
                    }
                    if (j60.F3) {
                    }
                    float measuredWidth4 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp3 = AndroidUtilities.dp(24.0f);
                    float f36 = (f16 - measuredWidth4) + measuredWidth4;
                    float f37 = j60Var.V0;
                    float f38 = f36 * f37;
                    float f39 = ((f16 - dp3) + dp3) * f37;
                    float f40 = measuredWidth3 + f38;
                    f13 = interpolation2;
                    caVar = caVar5;
                    rectF = rectF3;
                    rectF.set(measuredWidth3 - f38, y10 - f39, f40, y10 + f39);
                    float dp4 = (f16 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (j60Var.V0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp4, dp4, paint2);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (p40Var != null) {
                        paint2.setAlpha((int) (p40Var.getAlpha() * 255.0f));
                        float x12 = p40Var.getX() - getX();
                        float y11 = p40Var.getY() - getY();
                        rectF.set(x12, y11, p40Var.getMeasuredWidth() + x12, p40Var.getMeasuredHeight() + y11);
                        canvas2.save();
                        canvas2.scale(p40Var.getScaleX(), p40Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), paint2);
                        canvas2.restore();
                    }
                } else if (i10 != 1 || j60Var.N1 == null) {
                    f13 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    caVar = caVar6;
                    caVar2 = caVar7;
                    rectF = rectF3;
                } else {
                    if (!j60Var.r1()) {
                        paint2.setShader(j60Var.N1.g);
                    }
                    f14 = j60Var.L1;
                    if (j60Var.N1.i == 3) {
                        dp = AndroidUtilities.dp(2.0f);
                        dp2 -= dp * f14;
                    }
                    if (paint2.getShader() == null || j60Var.r1()) {
                        f15 = f14;
                        f16 = dp2;
                    } else {
                        f15 = f14;
                        f16 = dp2;
                        paint2.setColor(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kg, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Kg, false), j60Var.U1, 1.0f));
                    }
                    if (j60Var.r1()) {
                        radialProgressView4 = radialProgressView2;
                        caVar3 = caVar6;
                        caVar4 = caVar7;
                    } else {
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Lg, false);
                        int i23 = org.telegram.ui.ActionBar.j6.Kg;
                        radialProgressView4 = radialProgressView2;
                        int offsetColor2 = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.j6.w0(null, i23, false), j60Var.U1, 1.0f);
                        paint2.setColor(offsetColor2);
                        paint2.setShader(null);
                        int i24 = org.telegram.ui.ActionBar.j6.kg;
                        caVar4 = caVar7;
                        caVar3 = caVar6;
                        t2Var.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false), org.telegram.ui.ActionBar.j6.w0(null, i23, false), j60Var.U1, 1.0f), offsetColor2);
                        t2Var2.a(AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.j6.w0(null, i24, false), org.telegram.ui.ActionBar.j6.w0(null, i23, false), j60Var.U1, 1.0f), offsetColor2);
                    }
                    float measuredWidth32 = (int) ((t2Var3.getMeasuredWidth() / 2.0f) + t2Var3.getX());
                    float y102 = (int) (t2Var3.getY() + AndroidUtilities.dp(f12));
                    matrix2.setTranslate(measuredWidth32, y102);
                    j60Var.R0.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (j60Var.V0 * 76.0f * f15));
                    canvas2.save();
                    canvas2.scale(t2Var3.getScaleX() * 1.0f, t2Var3.getScaleX() * 1.0f, measuredWidth32, y102);
                    canvas2.save();
                    float x112 = com.google.android.gms.internal.vision.e2.x(j60Var.O0, 0.807f, 0.5f, 0.878f);
                    float f352 = j60Var.Q1;
                    canvas2.scale(f352 * x112, f352 * x112, measuredWidth32, y102);
                    if (i10 != 1 && !j60Var.r1() && LiteMode.isEnabled(512)) {
                        canvas2.save();
                        canvas2.scale(1.2f, 1.2f, measuredWidth32, y102);
                        int alpha = paint5.getAlpha();
                        paint5.setAlpha((int) ((1.0f - j60Var.z3.e) * j60Var.V0 * alpha));
                        canvas2.drawCircle(measuredWidth32, y102, AndroidUtilities.dp(160.0f), paint5);
                        paint5.setAlpha(alpha);
                        canvas2.restore();
                    }
                    canvas2.restore();
                    if (!j60Var.r1()) {
                        caVar2 = caVar4;
                        caVar5 = caVar3;
                    } else if (j60Var.V0 > 0.0f) {
                        canvas2.save();
                        float x13 = com.google.android.gms.internal.vision.e2.x(j60Var.O0, 0.807f, interpolation2, 0.878f);
                        canvas2.scale(x13, x13, measuredWidth32, y102);
                        caVar5 = caVar3;
                        caVar5.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                        canvas2.save();
                        float x14 = com.google.android.gms.internal.vision.e2.x(j60Var.O0, 0.704f, interpolation2, 0.926f);
                        canvas2.scale(x14, x14, measuredWidth32, y102);
                        caVar2 = caVar4;
                        caVar2.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                    } else {
                        caVar2 = caVar4;
                        caVar5 = caVar3;
                    }
                    if (j60.F3) {
                        if (i10 == 0) {
                            paint2.setAlpha(255);
                        } else {
                            paint2.setAlpha((int) (f15 * 255.0f));
                        }
                    } else if (i10 == 0) {
                        paint2.setAlpha((int) (j60Var.W0 * 255.0f));
                    } else {
                        paint2.setAlpha((int) (j60Var.W0 * f15 * 255.0f));
                    }
                    float measuredWidth42 = (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(21.0f);
                    float dp32 = AndroidUtilities.dp(24.0f);
                    float f362 = (f16 - measuredWidth42) + measuredWidth42;
                    float f372 = j60Var.V0;
                    float f382 = f362 * f372;
                    float f392 = ((f16 - dp32) + dp32) * f372;
                    float f402 = measuredWidth32 + f382;
                    f13 = interpolation2;
                    caVar = caVar5;
                    rectF = rectF3;
                    rectF.set(measuredWidth32 - f382, y102 - f392, f402, y102 + f392);
                    float dp42 = (f16 - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(4.0f);
                    paint2.setAlpha((int) (j60Var.V0 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, dp42, dp42, paint2);
                    if (i10 != 1) {
                        f17 = 4.0f;
                        if (j60Var.N1.i == 3) {
                            if (j60Var.r1()) {
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
                    if (p40Var != null && p40Var.getVisibility() == 0) {
                        paint2.setAlpha((int) (p40Var.getAlpha() * 255.0f));
                        float x122 = p40Var.getX() - getX();
                        float y112 = p40Var.getY() - getY();
                        rectF.set(x122, y112, p40Var.getMeasuredWidth() + x122, p40Var.getMeasuredHeight() + y112);
                        canvas2.save();
                        canvas2.scale(p40Var.getScaleX(), p40Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), paint2);
                        canvas2.restore();
                    }
                }
                i10++;
                rectF3 = rectF;
                caVar7 = caVar2;
                radialProgressView2 = radialProgressView3;
                interpolation2 = f13;
                caVar6 = caVar;
            }
            super.dispatchDraw(canvas);
            if (j60Var.a2.r == null) {
            }
        }
        z10 = true;
        if (z10) {
        }
        float interpolation22 = (this.d.getInterpolation(j60Var.P1) * f7) + 0.4f;
        caVar6.e(j60Var.O0, 1.0f);
        caVar7.e(j60Var.O0, 1.0f);
        if (j60Var.M1 != null) {
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
        if (j60Var.a2.r == null) {
        }
    }
}
