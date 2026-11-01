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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class k20 extends ch.b {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ a50 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k20(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = a50Var;
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
        z40 z40Var;
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
        org.telegram.ui.Components.m9 m9Var;
        org.telegram.ui.Components.m9 m9Var2;
        RectF rectF;
        float f15;
        int L;
        float f16;
        float f17;
        RadialProgressView radialProgressView4;
        org.telegram.ui.Components.m9 m9Var3;
        org.telegram.ui.Components.m9 m9Var4;
        org.telegram.ui.Components.m9 m9Var5;
        float f18;
        Paint paint3;
        float f19;
        float f20;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        z40 z40Var2;
        z40 z40Var3;
        int i14;
        int i15;
        int i16;
        int i17;
        a50 a50Var = this.f;
        Paint paint4 = a50Var.A3;
        org.telegram.ui.Components.voip.c2 c2Var = a50Var.p1;
        org.telegram.ui.Components.voip.c2 c2Var2 = a50Var.r1;
        Matrix matrix3 = a50Var.J2;
        org.telegram.ui.Components.m9 m9Var6 = a50Var.E2;
        org.telegram.ui.Components.m9 m9Var7 = a50Var.D2;
        RectF rectF2 = a50Var.m2;
        Paint paint5 = a50Var.K2;
        RadialProgressView radialProgressView5 = a50Var.V1;
        m30 m30Var = a50Var.K1;
        int[] iArr = a50Var.O3;
        org.telegram.ui.Components.voip.c2 c2Var3 = a50Var.s1;
        Paint paint6 = a50Var.z3;
        if (a50Var.c4 && a50Var.X3) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - a50Var.F3;
        a50Var.F3 = elapsedRealtime;
        if (j10 > 20) {
            j10 = 17;
        }
        long j11 = j10;
        z40 z40Var4 = a50Var.E3;
        if (z40Var4 != null) {
            z40Var4.b(0, measuredWidth, getMeasuredHeight(), j11, a50Var.F2);
        }
        m9Var7.a = org.telegram.messenger.i0.L(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        m9Var7.b = c3.i0.C(org.telegram.messenger.i0.L(20.0f), 0.6f, org.telegram.messenger.i0.L(62.0f), 0.48076922f);
        m9Var6.a = org.telegram.messenger.i0.L(65.0f) * 0.46296296f;
        m9Var6.b = c3.i0.C(org.telegram.messenger.i0.L(20.0f), 0.6f, org.telegram.messenger.i0.L(65.0f), 0.48076922f);
        float f21 = a50Var.G2;
        float f22 = a50Var.F2;
        if (f21 != f22) {
            float f23 = a50Var.H2;
            f7 = 0.0f;
            float f24 = (j11 * f23) + f22;
            a50Var.F2 = f24;
            if (f23 > 0.0f) {
                if (f24 > f21) {
                    a50Var.F2 = f21;
                }
            } else if (f24 < f21) {
                a50Var.F2 = f21;
            }
        } else {
            f7 = 0.0f;
        }
        z40 z40Var5 = a50Var.D3;
        if (z40Var5 != null && z40Var5.i == 3) {
            radialProgressView5.H = true;
            if (Math.abs(radialProgressView5.n) < 360.0f) {
                z10 = false;
                f11 = 1.0f;
                if (z10) {
                }
                float interpolation = (this.d.getInterpolation(a50Var.G3) * 0.6f) + 0.4f;
                m9Var6.e(a50Var.F2, 1.0f);
                m9Var7.e(a50Var.F2, 1.0f);
                if (a50Var.D3 != null) {
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
                if (a50Var.R3.r == null) {
                }
            }
        } else if (z40Var5 != null && (z40Var = a50Var.E3) != null && z40Var.i == 3) {
            radialProgressView5.H = true;
            f10 = 1.0f;
            radialProgressView5.I = 1.0f;
            f11 = f10;
            z10 = true;
            if (z10) {
                float f25 = a50Var.C3;
                if (f25 != f11) {
                    z40 z40Var6 = a50Var.D3;
                    if (z40Var6 == null || z40Var6.i != 3) {
                        a50Var.C3 = (j11 / 180.0f) + f25;
                    } else {
                        a50Var.C3 = (j11 / 100.0f) + f25;
                    }
                    if (a50Var.C3 >= 1.0f) {
                        a50Var.C3 = 1.0f;
                        a50Var.D3 = null;
                        z40 z40Var7 = a50Var.E3;
                        if (z40Var7 != null && z40Var7.i == 3) {
                            radialProgressView5.H = false;
                        }
                    }
                    a50Var.N3 = true;
                }
                if (!a50Var.N3 || (z40Var3 = a50Var.E3) == null) {
                    paint = paint4;
                    matrix = matrix3;
                    radialProgressView = radialProgressView5;
                    i12 = 3;
                    z11 = z10;
                } else {
                    a50Var.N3 = false;
                    z40 z40Var8 = a50Var.D3;
                    if (z40Var8 != null) {
                        a50.K0(a50Var, z40Var8.i, iArr);
                        int i18 = iArr[0];
                        i12 = 3;
                        int i19 = iArr[1];
                        z11 = z10;
                        int i20 = iArr[2];
                        radialProgressView = radialProgressView5;
                        int i21 = iArr[3];
                        matrix = matrix3;
                        a50.K0(a50Var, a50Var.E3.i, iArr);
                        paint = paint4;
                        i14 = i0.b.f(a50Var.C3, i18, iArr[0]);
                        i15 = i0.b.f(a50Var.C3, i19, iArr[1]);
                        i16 = i0.b.f(a50Var.C3, i20, iArr[2]);
                        i17 = i0.b.f(a50Var.C3, i21, iArr[3]);
                    } else {
                        paint = paint4;
                        matrix = matrix3;
                        radialProgressView = radialProgressView5;
                        z11 = z10;
                        i12 = 3;
                        a50.K0(a50Var, z40Var3.i, iArr);
                        i14 = iArr[0];
                        i15 = iArr[1];
                        i16 = iArr[2];
                        i17 = iArr[3];
                    }
                    if (this.e != i14) {
                        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(45.454548f), new int[]{i0.b.o(i14, 60), i0.b.o(i14, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                        a50Var.I2 = radialGradient;
                        paint5.setShader(radialGradient);
                        this.e = i14;
                    }
                    c2Var2.a(i16, i15);
                    c2Var.a(i16, i15);
                    a50Var.o1.a(i16, i15);
                    a50Var.m1.a(i16, i15);
                    org.telegram.ui.Components.voip.c2 c2Var4 = a50Var.q1;
                    int i22 = org.telegram.ui.ActionBar.t6.rh;
                    c2Var4.a(org.telegram.ui.ActionBar.t6.x0(null, i22, false), org.telegram.ui.ActionBar.t6.x0(null, i22, false));
                    a50Var.n1.a(i15, i17);
                }
                z40 z40Var9 = a50Var.E3;
                if (z40Var9 != null) {
                    int i23 = z40Var9.i;
                    z12 = i23 == 1 || i23 == 0 || a50.r1(i23);
                    i13 = i12;
                    if (a50Var.E3.i != i13) {
                        z13 = true;
                        if (a50Var.D3 == null && (z40Var2 = a50Var.E3) != null && z40Var2.i == i13) {
                            float f26 = a50Var.G3 - (j11 / 180.0f);
                            a50Var.G3 = f26;
                            if (f26 < f7) {
                                a50Var.G3 = f7;
                            }
                        } else {
                            if (z12) {
                                float f27 = a50Var.G3;
                                if (f27 != 1.0f) {
                                    float f28 = (j11 / 350.0f) + f27;
                                    a50Var.G3 = f28;
                                    if (f28 > 1.0f) {
                                        a50Var.G3 = 1.0f;
                                    }
                                }
                            }
                            if (!z12) {
                                float f29 = a50Var.G3;
                                if (f29 != 0.0f) {
                                    float f30 = f29 - (j11 / 350.0f);
                                    a50Var.G3 = f30;
                                    if (f30 < 0.0f) {
                                        a50Var.G3 = 0.0f;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            float f31 = a50Var.H3;
                            if (f31 != 1.0f) {
                                float f32 = (j11 / 350.0f) + f31;
                                a50Var.H3 = f32;
                                if (f32 > 1.0f) {
                                    a50Var.H3 = 1.0f;
                                }
                            }
                        }
                        if (!z13) {
                            float f33 = a50Var.H3;
                            if (f33 != 0.0f) {
                                float f34 = f33 - (j11 / 350.0f);
                                a50Var.H3 = f34;
                                if (f34 < 0.0f) {
                                    a50Var.H3 = 0.0f;
                                }
                            }
                        }
                    }
                } else {
                    i13 = i12;
                    z12 = false;
                }
                z13 = false;
                if (a50Var.D3 == null) {
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
            float interpolation2 = (this.d.getInterpolation(a50Var.G3) * 0.6f) + 0.4f;
            m9Var6.e(a50Var.F2, 1.0f);
            m9Var7.e(a50Var.F2, 1.0f);
            if (a50Var.D3 != null || a50Var.E3 == null || a50Var.t1()) {
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f12 = 25.909092f;
                f13 = 25.0f;
            } else {
                z40 z40Var10 = a50Var.E3;
                f12 = 25.909092f;
                int i24 = z40Var10.i;
                f13 = 25.0f;
                if (i24 == 3 || a50Var.D3.i == 3) {
                    if (i24 == 3) {
                        f20 = a50Var.C3;
                        paint3 = paint6;
                        paint3.setShader(a50Var.D3.g);
                        f19 = 1.0f;
                    } else {
                        paint3 = paint6;
                        f19 = 1.0f;
                        float f35 = 1.0f - a50Var.C3;
                        paint3.setShader(z40Var10.g);
                        f20 = f35;
                    }
                    int S0 = org.telegram.messenger.i0.S0(a50Var.L3, f19, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yg, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.yh, false));
                    Paint paint7 = paint;
                    paint7.setColor(S0);
                    float measuredWidth2 = (int) ((c2Var3.getMeasuredWidth() / 2.0f) + c2Var3.getX());
                    float y3 = (int) (c2Var3.getY() + org.telegram.messenger.i0.L(25.0f));
                    Matrix matrix4 = matrix;
                    matrix4.setTranslate(measuredWidth2, y3);
                    a50Var.I2.setLocalMatrix(matrix4);
                    paint3.setAlpha(76);
                    canvas.save();
                    canvas.scale(c2Var3.getScaleX() * 1.0f, c2Var3.getScaleY() * 1.0f, measuredWidth2, y3);
                    canvas.save();
                    float u10 = c3.i0.u(0.807f, a50Var.F2, 0.5f, 0.878f) * a50Var.H3;
                    canvas.scale(u10, u10, measuredWidth2, y3);
                    canvas.save();
                    canvas.scale(1.2f, 1.2f, measuredWidth2, y3);
                    canvas.drawCircle(measuredWidth2, y3, org.telegram.messenger.i0.L(160.0f), paint5);
                    canvas.restore();
                    canvas.restore();
                    if (a50Var.R2 != null) {
                        canvas.save();
                        float C = c3.i0.C(0.807f, a50Var.F2, 0.878f, interpolation2);
                        canvas.scale(C, C, measuredWidth2, y3);
                        m9Var6.a(measuredWidth2, y3, canvas, paint3);
                        canvas.restore();
                        canvas.save();
                        float C2 = c3.i0.C(0.704f, a50Var.F2, 0.926f, interpolation2);
                        canvas.scale(C2, C2, measuredWidth2, y3);
                        m9Var7.a(measuredWidth2, y3, canvas, paint3);
                        canvas.restore();
                    }
                    paint3.setAlpha(org.telegram.messenger.at.e4);
                    if (z11) {
                        canvas.drawCircle(measuredWidth2, y3, org.telegram.messenger.i0.L(25.909092f), paint3);
                        paint3.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ch, false));
                        if (f20 != 0.0f) {
                            paint3.setAlpha((int) (f20 * 255.0f));
                            paint3.setShader(null);
                            canvas.drawCircle(measuredWidth2, y3, org.telegram.messenger.i0.L(25.909092f), paint3);
                        }
                    }
                    canvas.drawCircle(measuredWidth2, y3, org.telegram.messenger.i0.L(25.0f) * f20, paint7);
                    if (!z11) {
                        radialProgressView.a(canvas, measuredWidth2, y3);
                    }
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    if (a50Var.R3.r == null) {
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
                float L2 = org.telegram.messenger.i0.L(f12);
                if (i11 == 0 && a50Var.D3 != null) {
                    if (!a50Var.t1()) {
                        paint2.setShader(a50Var.D3.g);
                    }
                    f15 = 1.0f - a50Var.C3;
                    if (a50Var.D3.i == 3) {
                        L = org.telegram.messenger.i0.L(2.0f);
                        L2 -= L * f15;
                    }
                    if (paint2.getShader() == null) {
                    }
                    f16 = f15;
                    f17 = L2;
                    if (a50Var.t1()) {
                    }
                    float measuredWidth3 = (int) ((c2Var3.getMeasuredWidth() / 2.0f) + c2Var3.getX());
                    float y10 = (int) (c2Var3.getY() + org.telegram.messenger.i0.L(f13));
                    matrix2.setTranslate(measuredWidth3, y10);
                    a50Var.I2.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (a50Var.M2 * 76.0f * f16));
                    canvas2.save();
                    canvas2.scale(c2Var3.getScaleX() * 1.0f, c2Var3.getScaleX() * 1.0f, measuredWidth3, y10);
                    canvas2.save();
                    float u11 = c3.i0.u(a50Var.F2, 0.807f, 0.5f, 0.878f);
                    float f36 = a50Var.H3;
                    canvas2.scale(f36 * u11, f36 * u11, measuredWidth3, y10);
                    if (i11 != 1) {
                    }
                    canvas2.restore();
                    if (!a50Var.t1()) {
                    }
                    if (a50.w5) {
                    }
                    float measuredWidth4 = (getMeasuredWidth() / 2.0f) - org.telegram.messenger.i0.L(21.0f);
                    float L3 = org.telegram.messenger.i0.L(24.0f);
                    float f37 = (f17 - measuredWidth4) + measuredWidth4;
                    float f38 = a50Var.M2;
                    float f39 = f37 * f38;
                    float f40 = ((f17 - L3) + L3) * f38;
                    float f41 = measuredWidth3 + f39;
                    f14 = interpolation2;
                    m9Var = m9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth3 - f39, y10 - f40, f41, y10 + f40);
                    float L4 = (f17 - org.telegram.messenger.i0.L(4.0f)) + org.telegram.messenger.i0.L(4.0f);
                    paint2.setAlpha((int) (a50Var.M2 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, L4, L4, paint2);
                    if (i11 != 1) {
                    }
                    canvas2.restore();
                    if (m30Var != null) {
                        paint2.setAlpha((int) (m30Var.getAlpha() * 255.0f));
                        float x10 = m30Var.getX() - getX();
                        float y11 = m30Var.getY() - getY();
                        rectF.set(x10, y11, m30Var.getMeasuredWidth() + x10, m30Var.getMeasuredHeight() + y11);
                        canvas2.save();
                        canvas2.scale(m30Var.getScaleX(), m30Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(f18), org.telegram.messenger.i0.L(f18), paint2);
                        canvas2.restore();
                    }
                } else if (i11 != 1) {
                    f14 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    m9Var = m9Var6;
                    m9Var2 = m9Var7;
                    rectF = rectF3;
                } else if (a50Var.E3 != null) {
                    if (!a50Var.t1()) {
                        paint2.setShader(a50Var.E3.g);
                    }
                    f15 = a50Var.C3;
                    if (a50Var.E3.i == 3) {
                        L = org.telegram.messenger.i0.L(2.0f);
                        L2 -= L * f15;
                    }
                    if (paint2.getShader() == null || a50Var.t1()) {
                        f16 = f15;
                        f17 = L2;
                    } else {
                        f16 = f15;
                        f17 = L2;
                        paint2.setColor(org.telegram.messenger.i0.S0(a50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yg, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.yh, false)));
                    }
                    if (a50Var.t1()) {
                        radialProgressView4 = radialProgressView2;
                        m9Var3 = m9Var6;
                        m9Var4 = m9Var7;
                    } else {
                        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zh, false);
                        int i25 = org.telegram.ui.ActionBar.t6.yh;
                        radialProgressView4 = radialProgressView2;
                        int S02 = org.telegram.messenger.i0.S0(a50Var.L3, 1.0f, x02, org.telegram.ui.ActionBar.t6.x0(null, i25, false));
                        paint2.setColor(S02);
                        paint2.setShader(null);
                        int i26 = org.telegram.ui.ActionBar.t6.Yg;
                        m9Var4 = m9Var7;
                        m9Var3 = m9Var6;
                        c2Var.a(org.telegram.messenger.i0.S0(a50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, i26, false), org.telegram.ui.ActionBar.t6.x0(null, i25, false)), S02);
                        c2Var2.a(org.telegram.messenger.i0.S0(a50Var.L3, 1.0f, org.telegram.ui.ActionBar.t6.x0(null, i26, false), org.telegram.ui.ActionBar.t6.x0(null, i25, false)), S02);
                    }
                    float measuredWidth32 = (int) ((c2Var3.getMeasuredWidth() / 2.0f) + c2Var3.getX());
                    float y102 = (int) (c2Var3.getY() + org.telegram.messenger.i0.L(f13));
                    matrix2.setTranslate(measuredWidth32, y102);
                    a50Var.I2.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (a50Var.M2 * 76.0f * f16));
                    canvas2.save();
                    canvas2.scale(c2Var3.getScaleX() * 1.0f, c2Var3.getScaleX() * 1.0f, measuredWidth32, y102);
                    canvas2.save();
                    float u112 = c3.i0.u(a50Var.F2, 0.807f, 0.5f, 0.878f);
                    float f362 = a50Var.H3;
                    canvas2.scale(f362 * u112, f362 * u112, measuredWidth32, y102);
                    if (i11 != 1 && !a50Var.t1() && org.telegram.messenger.tc.e(512)) {
                        canvas2.save();
                        canvas2.scale(1.2f, 1.2f, measuredWidth32, y102);
                        int alpha = paint5.getAlpha();
                        paint5.setAlpha((int) ((1.0f - a50Var.q5.e) * a50Var.M2 * alpha));
                        canvas2.drawCircle(measuredWidth32, y102, org.telegram.messenger.i0.L(160.0f), paint5);
                        paint5.setAlpha(alpha);
                        canvas2.restore();
                    }
                    canvas2.restore();
                    if (!a50Var.t1()) {
                        m9Var2 = m9Var4;
                        m9Var5 = m9Var3;
                    } else if (a50Var.M2 > 0.0f) {
                        canvas2.save();
                        float u12 = c3.i0.u(a50Var.F2, 0.807f, interpolation2, 0.878f);
                        canvas2.scale(u12, u12, measuredWidth32, y102);
                        m9Var5 = m9Var3;
                        m9Var5.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                        canvas2.save();
                        float u13 = c3.i0.u(a50Var.F2, 0.704f, interpolation2, 0.926f);
                        canvas2.scale(u13, u13, measuredWidth32, y102);
                        m9Var2 = m9Var4;
                        m9Var2.a(measuredWidth32, y102, canvas2, paint2);
                        canvas2.restore();
                    } else {
                        m9Var2 = m9Var4;
                        m9Var5 = m9Var3;
                    }
                    if (a50.w5) {
                        if (i11 == 0) {
                            paint2.setAlpha(org.telegram.messenger.at.e4);
                        } else {
                            paint2.setAlpha((int) (f16 * 255.0f));
                        }
                    } else if (i11 == 0) {
                        paint2.setAlpha((int) (a50Var.N2 * 255.0f));
                    } else {
                        paint2.setAlpha((int) (a50Var.N2 * f16 * 255.0f));
                    }
                    float measuredWidth42 = (getMeasuredWidth() / 2.0f) - org.telegram.messenger.i0.L(21.0f);
                    float L32 = org.telegram.messenger.i0.L(24.0f);
                    float f372 = (f17 - measuredWidth42) + measuredWidth42;
                    float f382 = a50Var.M2;
                    float f392 = f372 * f382;
                    float f402 = ((f17 - L32) + L32) * f382;
                    float f412 = measuredWidth32 + f392;
                    f14 = interpolation2;
                    m9Var = m9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth32 - f392, y102 - f402, f412, y102 + f402);
                    float L42 = (f17 - org.telegram.messenger.i0.L(4.0f)) + org.telegram.messenger.i0.L(4.0f);
                    paint2.setAlpha((int) (a50Var.M2 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, L42, L42, paint2);
                    if (i11 != 1) {
                        f18 = 4.0f;
                        if (a50Var.E3.i == 3) {
                            if (a50Var.t1()) {
                                radialProgressView3 = radialProgressView4;
                                radialProgressView3.setSize((int) ((L42 * 2.0f) - org.telegram.messenger.i0.L(4.0f)));
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
                    if (m30Var != null && m30Var.getVisibility() == 0) {
                        paint2.setAlpha((int) (m30Var.getAlpha() * 255.0f));
                        float x102 = m30Var.getX() - getX();
                        float y112 = m30Var.getY() - getY();
                        rectF.set(x102, y112, m30Var.getMeasuredWidth() + x102, m30Var.getMeasuredHeight() + y112);
                        canvas2.save();
                        canvas2.scale(m30Var.getScaleX(), m30Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(f18), org.telegram.messenger.i0.L(f18), paint2);
                        canvas2.restore();
                    }
                } else {
                    f14 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    m9Var = m9Var6;
                    m9Var2 = m9Var7;
                    rectF = rectF3;
                }
                i11++;
                rectF3 = rectF;
                m9Var7 = m9Var2;
                radialProgressView2 = radialProgressView3;
                interpolation2 = f14;
                m9Var6 = m9Var;
            }
            super.dispatchDraw(canvas);
            if (a50Var.R3.r == null) {
            }
        }
        f10 = 1.0f;
        f11 = f10;
        z10 = true;
        if (z10) {
        }
        float interpolation22 = (this.d.getInterpolation(a50Var.G3) * 0.6f) + 0.4f;
        m9Var6.e(a50Var.F2, 1.0f);
        m9Var7.e(a50Var.F2, 1.0f);
        if (a50Var.D3 != null) {
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
        if (a50Var.R3.r == null) {
        }
    }
}
