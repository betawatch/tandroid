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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n10 extends mh.b {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ e40 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n10(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = e40Var;
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
        d40 d40Var;
        float f11;
        float f12;
        boolean z9;
        Paint paint;
        Matrix matrix;
        RadialProgressView radialProgressView;
        boolean z10;
        Canvas canvas2;
        Paint paint2;
        RadialProgressView radialProgressView2;
        Matrix matrix2;
        float f13;
        float f14;
        int i7;
        int i10;
        float f15;
        RadialProgressView radialProgressView3;
        org.telegram.ui.Components.r9 r9Var;
        org.telegram.ui.Components.r9 r9Var2;
        RectF rectF;
        float f16;
        int L;
        float f17;
        float f18;
        RadialProgressView radialProgressView4;
        org.telegram.ui.Components.r9 r9Var3;
        org.telegram.ui.Components.r9 r9Var4;
        org.telegram.ui.Components.r9 r9Var5;
        float f19;
        Paint paint3;
        float f20;
        float f21;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        d40 d40Var2;
        d40 d40Var3;
        int i13;
        int i14;
        int i15;
        int i16;
        e40 e40Var = this.f;
        Paint paint4 = e40Var.A3;
        org.telegram.ui.Components.voip.n2 n2Var = e40Var.p1;
        org.telegram.ui.Components.voip.n2 n2Var2 = e40Var.r1;
        Matrix matrix3 = e40Var.J2;
        org.telegram.ui.Components.r9 r9Var6 = e40Var.E2;
        org.telegram.ui.Components.r9 r9Var7 = e40Var.D2;
        RectF rectF2 = e40Var.m2;
        Paint paint5 = e40Var.K2;
        RadialProgressView radialProgressView5 = e40Var.V1;
        q20 q20Var = e40Var.K1;
        int[] iArr = e40Var.O3;
        org.telegram.ui.Components.voip.n2 n2Var3 = e40Var.s1;
        Paint paint6 = e40Var.z3;
        if (e40Var.c4 && e40Var.X3) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - e40Var.F3;
        e40Var.F3 = elapsedRealtime;
        if (j3 > 20) {
            j3 = 17;
        }
        long j10 = j3;
        d40 d40Var4 = e40Var.E3;
        if (d40Var4 != null) {
            d40Var4.b(0, measuredWidth, getMeasuredHeight(), j10, e40Var.F2);
        }
        r9Var7.a = org.telegram.messenger.g0.L(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        r9Var7.b = com.google.android.recaptcha.internal.a.B(org.telegram.messenger.g0.L(20.0f), 0.6f, org.telegram.messenger.g0.L(62.0f), 0.48076922f);
        r9Var6.a = org.telegram.messenger.g0.L(65.0f) * 0.46296296f;
        r9Var6.b = com.google.android.recaptcha.internal.a.B(org.telegram.messenger.g0.L(20.0f), 0.6f, org.telegram.messenger.g0.L(65.0f), 0.48076922f);
        float f22 = e40Var.G2;
        float f23 = e40Var.F2;
        if (f22 != f23) {
            float f24 = e40Var.H2;
            f10 = 0.0f;
            float f25 = (j10 * f24) + f23;
            e40Var.F2 = f25;
            if (f24 > 0.0f) {
                if (f25 > f22) {
                    e40Var.F2 = f22;
                }
            } else if (f25 < f22) {
                e40Var.F2 = f22;
            }
        } else {
            f10 = 0.0f;
        }
        d40 d40Var5 = e40Var.D3;
        if (d40Var5 != null && d40Var5.i == 3) {
            radialProgressView5.H = true;
            if (Math.abs(radialProgressView5.n) < 360.0f) {
                z9 = false;
                f12 = 1.0f;
                if (z9) {
                }
                float interpolation = (this.d.getInterpolation(e40Var.G3) * 0.6f) + 0.4f;
                r9Var6.e(e40Var.F2, 1.0f);
                r9Var7.e(e40Var.F2, 1.0f);
                if (e40Var.D3 != null) {
                }
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f13 = 25.909092f;
                f14 = 25.0f;
                i10 = 0;
                for (i7 = 2; i10 < i7; i7 = 2) {
                }
                super.dispatchDraw(canvas);
                if (e40Var.R3.r == null) {
                }
            }
        } else if (d40Var5 != null && (d40Var = e40Var.E3) != null && d40Var.i == 3) {
            radialProgressView5.H = true;
            f11 = 1.0f;
            radialProgressView5.I = 1.0f;
            f12 = f11;
            z9 = true;
            if (z9) {
                float f26 = e40Var.C3;
                if (f26 != f12) {
                    d40 d40Var6 = e40Var.D3;
                    if (d40Var6 == null || d40Var6.i != 3) {
                        e40Var.C3 = (j10 / 180.0f) + f26;
                    } else {
                        e40Var.C3 = (j10 / 100.0f) + f26;
                    }
                    if (e40Var.C3 >= 1.0f) {
                        e40Var.C3 = 1.0f;
                        e40Var.D3 = null;
                        d40 d40Var7 = e40Var.E3;
                        if (d40Var7 != null && d40Var7.i == 3) {
                            radialProgressView5.H = false;
                        }
                    }
                    e40Var.N3 = true;
                }
                if (!e40Var.N3 || (d40Var3 = e40Var.E3) == null) {
                    paint = paint4;
                    matrix = matrix3;
                    radialProgressView = radialProgressView5;
                    i11 = 3;
                    z10 = z9;
                } else {
                    e40Var.N3 = false;
                    d40 d40Var8 = e40Var.D3;
                    if (d40Var8 != null) {
                        e40.K0(e40Var, d40Var8.i, iArr);
                        int i17 = iArr[0];
                        i11 = 3;
                        int i18 = iArr[1];
                        z10 = z9;
                        int i19 = iArr[2];
                        radialProgressView = radialProgressView5;
                        int i20 = iArr[3];
                        matrix = matrix3;
                        e40.K0(e40Var, e40Var.E3.i, iArr);
                        paint = paint4;
                        i13 = i0.a.f(e40Var.C3, i17, iArr[0]);
                        i14 = i0.a.f(e40Var.C3, i18, iArr[1]);
                        i15 = i0.a.f(e40Var.C3, i19, iArr[2]);
                        i16 = i0.a.f(e40Var.C3, i20, iArr[3]);
                    } else {
                        paint = paint4;
                        matrix = matrix3;
                        radialProgressView = radialProgressView5;
                        z10 = z9;
                        i11 = 3;
                        e40.K0(e40Var, d40Var3.i, iArr);
                        i13 = iArr[0];
                        i14 = iArr[1];
                        i15 = iArr[2];
                        i16 = iArr[3];
                    }
                    if (this.e != i13) {
                        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(45.454548f), new int[]{i0.a.o(i13, 60), i0.a.o(i13, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                        e40Var.I2 = radialGradient;
                        paint5.setShader(radialGradient);
                        this.e = i13;
                    }
                    n2Var2.a(i15, i14);
                    n2Var.a(i15, i14);
                    e40Var.o1.a(i15, i14);
                    e40Var.m1.a(i15, i14);
                    org.telegram.ui.Components.voip.n2 n2Var4 = e40Var.q1;
                    int i21 = org.telegram.ui.ActionBar.l6.rh;
                    n2Var4.a(org.telegram.ui.ActionBar.l6.x0(null, i21, false), org.telegram.ui.ActionBar.l6.x0(null, i21, false));
                    e40Var.n1.a(i14, i16);
                }
                d40 d40Var9 = e40Var.E3;
                if (d40Var9 != null) {
                    int i22 = d40Var9.i;
                    z11 = i22 == 1 || i22 == 0 || e40.s1(i22);
                    i12 = i11;
                    if (e40Var.E3.i != i12) {
                        z12 = true;
                        if (e40Var.D3 == null && (d40Var2 = e40Var.E3) != null && d40Var2.i == i12) {
                            float f27 = e40Var.G3 - (j10 / 180.0f);
                            e40Var.G3 = f27;
                            if (f27 < f10) {
                                e40Var.G3 = f10;
                            }
                        } else {
                            if (z11) {
                                float f28 = e40Var.G3;
                                if (f28 != 1.0f) {
                                    float f29 = (j10 / 350.0f) + f28;
                                    e40Var.G3 = f29;
                                    if (f29 > 1.0f) {
                                        e40Var.G3 = 1.0f;
                                    }
                                }
                            }
                            if (!z11) {
                                float f30 = e40Var.G3;
                                if (f30 != 0.0f) {
                                    float f31 = f30 - (j10 / 350.0f);
                                    e40Var.G3 = f31;
                                    if (f31 < 0.0f) {
                                        e40Var.G3 = 0.0f;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            float f32 = e40Var.H3;
                            if (f32 != 1.0f) {
                                float f33 = (j10 / 350.0f) + f32;
                                e40Var.H3 = f33;
                                if (f33 > 1.0f) {
                                    e40Var.H3 = 1.0f;
                                }
                            }
                        }
                        if (!z12) {
                            float f34 = e40Var.H3;
                            if (f34 != 0.0f) {
                                float f35 = f34 - (j10 / 350.0f);
                                e40Var.H3 = f35;
                                if (f35 < 0.0f) {
                                    e40Var.H3 = 0.0f;
                                }
                            }
                        }
                    }
                } else {
                    i12 = i11;
                    z11 = false;
                }
                z12 = false;
                if (e40Var.D3 == null) {
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
                z10 = z9;
            }
            float interpolation2 = (this.d.getInterpolation(e40Var.G3) * 0.6f) + 0.4f;
            r9Var6.e(e40Var.F2, 1.0f);
            r9Var7.e(e40Var.F2, 1.0f);
            if (e40Var.D3 != null || e40Var.E3 == null || e40Var.u1()) {
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f13 = 25.909092f;
                f14 = 25.0f;
            } else {
                d40 d40Var10 = e40Var.E3;
                f13 = 25.909092f;
                int i23 = d40Var10.i;
                f14 = 25.0f;
                if (i23 == 3 || e40Var.D3.i == 3) {
                    if (i23 == 3) {
                        f21 = e40Var.C3;
                        paint3 = paint6;
                        paint3.setShader(e40Var.D3.g);
                        f20 = 1.0f;
                    } else {
                        paint3 = paint6;
                        f20 = 1.0f;
                        float f36 = 1.0f - e40Var.C3;
                        paint3.setShader(d40Var10.g);
                        f21 = f36;
                    }
                    int S0 = org.telegram.messenger.g0.S0(e40Var.L3, f20, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Yg, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.yh, false));
                    Paint paint7 = paint;
                    paint7.setColor(S0);
                    float measuredWidth2 = (int) ((n2Var3.getMeasuredWidth() / 2.0f) + n2Var3.getX());
                    float y10 = (int) (n2Var3.getY() + org.telegram.messenger.g0.L(25.0f));
                    Matrix matrix4 = matrix;
                    matrix4.setTranslate(measuredWidth2, y10);
                    e40Var.I2.setLocalMatrix(matrix4);
                    paint3.setAlpha(76);
                    canvas.save();
                    canvas.scale(n2Var3.getScaleX() * 1.0f, n2Var3.getScaleY() * 1.0f, measuredWidth2, y10);
                    canvas.save();
                    float x10 = com.google.android.recaptcha.internal.a.x(0.807f, e40Var.F2, 0.5f, 0.878f) * e40Var.H3;
                    canvas.scale(x10, x10, measuredWidth2, y10);
                    canvas.save();
                    canvas.scale(1.2f, 1.2f, measuredWidth2, y10);
                    canvas.drawCircle(measuredWidth2, y10, org.telegram.messenger.g0.L(160.0f), paint5);
                    canvas.restore();
                    canvas.restore();
                    if (e40Var.R2 != null) {
                        canvas.save();
                        float B = com.google.android.recaptcha.internal.a.B(0.807f, e40Var.F2, 0.878f, interpolation2);
                        canvas.scale(B, B, measuredWidth2, y10);
                        r9Var6.a(measuredWidth2, y10, canvas, paint3);
                        canvas.restore();
                        canvas.save();
                        float B2 = com.google.android.recaptcha.internal.a.B(0.704f, e40Var.F2, 0.926f, interpolation2);
                        canvas.scale(B2, B2, measuredWidth2, y10);
                        r9Var7.a(measuredWidth2, y10, canvas, paint3);
                        canvas.restore();
                    }
                    paint3.setAlpha(org.telegram.messenger.qs.e4);
                    if (z10) {
                        canvas.drawCircle(measuredWidth2, y10, org.telegram.messenger.g0.L(25.909092f), paint3);
                        paint3.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ch, false));
                        if (f21 != 0.0f) {
                            paint3.setAlpha((int) (f21 * 255.0f));
                            paint3.setShader(null);
                            canvas.drawCircle(measuredWidth2, y10, org.telegram.messenger.g0.L(25.909092f), paint3);
                        }
                    }
                    canvas.drawCircle(measuredWidth2, y10, org.telegram.messenger.g0.L(25.0f) * f21, paint7);
                    if (!z10) {
                        radialProgressView.a(canvas, measuredWidth2, y10);
                    }
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    if (e40Var.R3.r == null) {
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
            while (i10 < i7) {
                float L2 = org.telegram.messenger.g0.L(f13);
                if (i10 == 0 && e40Var.D3 != null) {
                    if (!e40Var.u1()) {
                        paint2.setShader(e40Var.D3.g);
                    }
                    f16 = 1.0f - e40Var.C3;
                    if (e40Var.D3.i == 3) {
                        L = org.telegram.messenger.g0.L(2.0f);
                        L2 -= L * f16;
                    }
                    if (paint2.getShader() == null) {
                    }
                    f17 = f16;
                    f18 = L2;
                    if (e40Var.u1()) {
                    }
                    float measuredWidth3 = (int) ((n2Var3.getMeasuredWidth() / 2.0f) + n2Var3.getX());
                    float y11 = (int) (n2Var3.getY() + org.telegram.messenger.g0.L(f14));
                    matrix2.setTranslate(measuredWidth3, y11);
                    e40Var.I2.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (e40Var.M2 * 76.0f * f17));
                    canvas2.save();
                    canvas2.scale(n2Var3.getScaleX() * 1.0f, n2Var3.getScaleX() * 1.0f, measuredWidth3, y11);
                    canvas2.save();
                    float x11 = com.google.android.recaptcha.internal.a.x(e40Var.F2, 0.807f, 0.5f, 0.878f);
                    float f37 = e40Var.H3;
                    canvas2.scale(f37 * x11, f37 * x11, measuredWidth3, y11);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (!e40Var.u1()) {
                    }
                    if (e40.w5) {
                    }
                    float measuredWidth4 = (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(21.0f);
                    float L3 = org.telegram.messenger.g0.L(24.0f);
                    float f38 = (f18 - measuredWidth4) + measuredWidth4;
                    float f39 = e40Var.M2;
                    float f40 = f38 * f39;
                    float f41 = ((f18 - L3) + L3) * f39;
                    float f42 = measuredWidth3 + f40;
                    f15 = interpolation2;
                    r9Var = r9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth3 - f40, y11 - f41, f42, y11 + f41);
                    float L4 = (f18 - org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(4.0f);
                    paint2.setAlpha((int) (e40Var.M2 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, L4, L4, paint2);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (q20Var != null) {
                        paint2.setAlpha((int) (q20Var.getAlpha() * 255.0f));
                        float x12 = q20Var.getX() - getX();
                        float y12 = q20Var.getY() - getY();
                        rectF.set(x12, y12, q20Var.getMeasuredWidth() + x12, q20Var.getMeasuredHeight() + y12);
                        canvas2.save();
                        canvas2.scale(q20Var.getScaleX(), q20Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f19), org.telegram.messenger.g0.L(f19), paint2);
                        canvas2.restore();
                    }
                } else if (i10 != 1) {
                    f15 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    r9Var = r9Var6;
                    r9Var2 = r9Var7;
                    rectF = rectF3;
                } else if (e40Var.E3 != null) {
                    if (!e40Var.u1()) {
                        paint2.setShader(e40Var.E3.g);
                    }
                    f16 = e40Var.C3;
                    if (e40Var.E3.i == 3) {
                        L = org.telegram.messenger.g0.L(2.0f);
                        L2 -= L * f16;
                    }
                    if (paint2.getShader() == null || e40Var.u1()) {
                        f17 = f16;
                        f18 = L2;
                    } else {
                        f17 = f16;
                        f18 = L2;
                        paint2.setColor(org.telegram.messenger.g0.S0(e40Var.L3, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Yg, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.yh, false)));
                    }
                    if (e40Var.u1()) {
                        radialProgressView4 = radialProgressView2;
                        r9Var3 = r9Var6;
                        r9Var4 = r9Var7;
                    } else {
                        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.zh, false);
                        int i24 = org.telegram.ui.ActionBar.l6.yh;
                        radialProgressView4 = radialProgressView2;
                        int S02 = org.telegram.messenger.g0.S0(e40Var.L3, 1.0f, x02, org.telegram.ui.ActionBar.l6.x0(null, i24, false));
                        paint2.setColor(S02);
                        paint2.setShader(null);
                        int i25 = org.telegram.ui.ActionBar.l6.Yg;
                        r9Var4 = r9Var7;
                        r9Var3 = r9Var6;
                        n2Var.a(org.telegram.messenger.g0.S0(e40Var.L3, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, i25, false), org.telegram.ui.ActionBar.l6.x0(null, i24, false)), S02);
                        n2Var2.a(org.telegram.messenger.g0.S0(e40Var.L3, 1.0f, org.telegram.ui.ActionBar.l6.x0(null, i25, false), org.telegram.ui.ActionBar.l6.x0(null, i24, false)), S02);
                    }
                    float measuredWidth32 = (int) ((n2Var3.getMeasuredWidth() / 2.0f) + n2Var3.getX());
                    float y112 = (int) (n2Var3.getY() + org.telegram.messenger.g0.L(f14));
                    matrix2.setTranslate(measuredWidth32, y112);
                    e40Var.I2.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (e40Var.M2 * 76.0f * f17));
                    canvas2.save();
                    canvas2.scale(n2Var3.getScaleX() * 1.0f, n2Var3.getScaleX() * 1.0f, measuredWidth32, y112);
                    canvas2.save();
                    float x112 = com.google.android.recaptcha.internal.a.x(e40Var.F2, 0.807f, 0.5f, 0.878f);
                    float f372 = e40Var.H3;
                    canvas2.scale(f372 * x112, f372 * x112, measuredWidth32, y112);
                    if (i10 != 1 && !e40Var.u1() && org.telegram.messenger.sc.e(512)) {
                        canvas2.save();
                        canvas2.scale(1.2f, 1.2f, measuredWidth32, y112);
                        int alpha = paint5.getAlpha();
                        paint5.setAlpha((int) ((1.0f - e40Var.q5.e) * e40Var.M2 * alpha));
                        canvas2.drawCircle(measuredWidth32, y112, org.telegram.messenger.g0.L(160.0f), paint5);
                        paint5.setAlpha(alpha);
                        canvas2.restore();
                    }
                    canvas2.restore();
                    if (!e40Var.u1()) {
                        r9Var2 = r9Var4;
                        r9Var5 = r9Var3;
                    } else if (e40Var.M2 > 0.0f) {
                        canvas2.save();
                        float x13 = com.google.android.recaptcha.internal.a.x(e40Var.F2, 0.807f, interpolation2, 0.878f);
                        canvas2.scale(x13, x13, measuredWidth32, y112);
                        r9Var5 = r9Var3;
                        r9Var5.a(measuredWidth32, y112, canvas2, paint2);
                        canvas2.restore();
                        canvas2.save();
                        float x14 = com.google.android.recaptcha.internal.a.x(e40Var.F2, 0.704f, interpolation2, 0.926f);
                        canvas2.scale(x14, x14, measuredWidth32, y112);
                        r9Var2 = r9Var4;
                        r9Var2.a(measuredWidth32, y112, canvas2, paint2);
                        canvas2.restore();
                    } else {
                        r9Var2 = r9Var4;
                        r9Var5 = r9Var3;
                    }
                    if (e40.w5) {
                        if (i10 == 0) {
                            paint2.setAlpha(org.telegram.messenger.qs.e4);
                        } else {
                            paint2.setAlpha((int) (f17 * 255.0f));
                        }
                    } else if (i10 == 0) {
                        paint2.setAlpha((int) (e40Var.N2 * 255.0f));
                    } else {
                        paint2.setAlpha((int) (e40Var.N2 * f17 * 255.0f));
                    }
                    float measuredWidth42 = (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(21.0f);
                    float L32 = org.telegram.messenger.g0.L(24.0f);
                    float f382 = (f18 - measuredWidth42) + measuredWidth42;
                    float f392 = e40Var.M2;
                    float f402 = f382 * f392;
                    float f412 = ((f18 - L32) + L32) * f392;
                    float f422 = measuredWidth32 + f402;
                    f15 = interpolation2;
                    r9Var = r9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth32 - f402, y112 - f412, f422, y112 + f412);
                    float L42 = (f18 - org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(4.0f);
                    paint2.setAlpha((int) (e40Var.M2 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, L42, L42, paint2);
                    if (i10 != 1) {
                        f19 = 4.0f;
                        if (e40Var.E3.i == 3) {
                            if (e40Var.u1()) {
                                radialProgressView3 = radialProgressView4;
                                radialProgressView3.setSize((int) ((L42 * 2.0f) - org.telegram.messenger.g0.L(4.0f)));
                            } else {
                                radialProgressView3 = radialProgressView4;
                            }
                            radialProgressView3.a(canvas2, measuredWidth32, y112);
                        } else {
                            radialProgressView3 = radialProgressView4;
                        }
                    } else {
                        f19 = 4.0f;
                        radialProgressView3 = radialProgressView4;
                    }
                    canvas2.restore();
                    if (q20Var != null && q20Var.getVisibility() == 0) {
                        paint2.setAlpha((int) (q20Var.getAlpha() * 255.0f));
                        float x122 = q20Var.getX() - getX();
                        float y122 = q20Var.getY() - getY();
                        rectF.set(x122, y122, q20Var.getMeasuredWidth() + x122, q20Var.getMeasuredHeight() + y122);
                        canvas2.save();
                        canvas2.scale(q20Var.getScaleX(), q20Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f19), org.telegram.messenger.g0.L(f19), paint2);
                        canvas2.restore();
                    }
                } else {
                    f15 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    r9Var = r9Var6;
                    r9Var2 = r9Var7;
                    rectF = rectF3;
                }
                i10++;
                rectF3 = rectF;
                r9Var7 = r9Var2;
                radialProgressView2 = radialProgressView3;
                interpolation2 = f15;
                r9Var6 = r9Var;
            }
            super.dispatchDraw(canvas);
            if (e40Var.R3.r == null) {
            }
        }
        f11 = 1.0f;
        f12 = f11;
        z9 = true;
        if (z9) {
        }
        float interpolation22 = (this.d.getInterpolation(e40Var.G3) * 0.6f) + 0.4f;
        r9Var6.e(e40Var.F2, 1.0f);
        r9Var7.e(e40Var.F2, 1.0f);
        if (e40Var.D3 != null) {
        }
        canvas2 = canvas;
        paint2 = paint6;
        radialProgressView2 = radialProgressView;
        matrix2 = matrix;
        f13 = 25.909092f;
        f14 = 25.0f;
        i10 = 0;
        while (i10 < i7) {
        }
        super.dispatchDraw(canvas);
        if (e40Var.R3.r == null) {
        }
    }
}
