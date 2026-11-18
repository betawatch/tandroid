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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class o10 extends mh.b {
    public final OvershootInterpolator d;
    public int e;
    public final /* synthetic */ f40 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o10(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = f40Var;
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
        e40 e40Var;
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
        int i7;
        int i10;
        float f15;
        RadialProgressView radialProgressView3;
        org.telegram.ui.Components.w9 w9Var;
        org.telegram.ui.Components.w9 w9Var2;
        RectF rectF;
        float f16;
        int L;
        float f17;
        float f18;
        RadialProgressView radialProgressView4;
        org.telegram.ui.Components.w9 w9Var3;
        org.telegram.ui.Components.w9 w9Var4;
        org.telegram.ui.Components.w9 w9Var5;
        float f19;
        Paint paint3;
        float f20;
        float f21;
        int i11;
        int i12;
        boolean z12;
        boolean z13;
        e40 e40Var2;
        e40 e40Var3;
        int i13;
        int i14;
        int i15;
        int i16;
        f40 f40Var = this.f;
        Paint paint4 = f40Var.I3;
        org.telegram.ui.Components.voip.q2 q2Var = f40Var.t1;
        org.telegram.ui.Components.voip.q2 q2Var2 = f40Var.v1;
        Matrix matrix3 = f40Var.N2;
        org.telegram.ui.Components.w9 w9Var6 = f40Var.I2;
        org.telegram.ui.Components.w9 w9Var7 = f40Var.H2;
        RectF rectF2 = f40Var.q2;
        Paint paint5 = f40Var.O2;
        RadialProgressView radialProgressView5 = f40Var.Z1;
        r20 r20Var = f40Var.O1;
        int[] iArr = f40Var.W3;
        org.telegram.ui.Components.voip.q2 q2Var3 = f40Var.w1;
        Paint paint6 = f40Var.H3;
        if (f40Var.k4 && f40Var.f4) {
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getMeasuredHeight()) / 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - f40Var.N3;
        f40Var.N3 = elapsedRealtime;
        if (j3 > 20) {
            j3 = 17;
        }
        long j10 = j3;
        e40 e40Var4 = f40Var.M3;
        if (e40Var4 != null) {
            e40Var4.b(0, measuredWidth, getMeasuredHeight(), j10, f40Var.J2);
        }
        w9Var7.a = org.telegram.messenger.g0.L(62.0f) * 0.46296296f;
        RectF rectF3 = rectF2;
        w9Var7.b = com.google.android.gms.internal.vision.e2.B(org.telegram.messenger.g0.L(20.0f), 0.6f, org.telegram.messenger.g0.L(62.0f), 0.48076922f);
        w9Var6.a = org.telegram.messenger.g0.L(65.0f) * 0.46296296f;
        w9Var6.b = com.google.android.gms.internal.vision.e2.B(org.telegram.messenger.g0.L(20.0f), 0.6f, org.telegram.messenger.g0.L(65.0f), 0.48076922f);
        float f22 = f40Var.K2;
        float f23 = f40Var.J2;
        if (f22 != f23) {
            float f24 = f40Var.L2;
            f10 = 0.0f;
            float f25 = (j10 * f24) + f23;
            f40Var.J2 = f25;
            if (f24 > 0.0f) {
                if (f25 > f22) {
                    f40Var.J2 = f22;
                }
            } else if (f25 < f22) {
                f40Var.J2 = f22;
            }
        } else {
            f10 = 0.0f;
        }
        e40 e40Var5 = f40Var.L3;
        if (e40Var5 != null && e40Var5.i == 3) {
            radialProgressView5.I = true;
            if (Math.abs(radialProgressView5.n) < 360.0f) {
                z10 = false;
                f12 = 1.0f;
                if (z10) {
                }
                float interpolation = (this.d.getInterpolation(f40Var.O3) * 0.6f) + 0.4f;
                w9Var6.e(f40Var.J2, 1.0f);
                w9Var7.e(f40Var.J2, 1.0f);
                if (f40Var.L3 != null) {
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
                if (f40Var.Z3.r == null) {
                }
            }
        } else if (e40Var5 != null && (e40Var = f40Var.M3) != null && e40Var.i == 3) {
            radialProgressView5.I = true;
            f11 = 1.0f;
            radialProgressView5.J = 1.0f;
            f12 = f11;
            z10 = true;
            if (z10) {
                float f26 = f40Var.K3;
                if (f26 != f12) {
                    e40 e40Var6 = f40Var.L3;
                    if (e40Var6 == null || e40Var6.i != 3) {
                        f40Var.K3 = (j10 / 180.0f) + f26;
                    } else {
                        f40Var.K3 = (j10 / 100.0f) + f26;
                    }
                    if (f40Var.K3 >= 1.0f) {
                        f40Var.K3 = 1.0f;
                        f40Var.L3 = null;
                        e40 e40Var7 = f40Var.M3;
                        if (e40Var7 != null && e40Var7.i == 3) {
                            radialProgressView5.I = false;
                        }
                    }
                    f40Var.V3 = true;
                }
                if (!f40Var.V3 || (e40Var3 = f40Var.M3) == null) {
                    paint = paint4;
                    matrix = matrix3;
                    radialProgressView = radialProgressView5;
                    i11 = 3;
                    z11 = z10;
                } else {
                    f40Var.V3 = false;
                    e40 e40Var8 = f40Var.L3;
                    if (e40Var8 != null) {
                        f40.L0(f40Var, e40Var8.i, iArr);
                        int i17 = iArr[0];
                        i11 = 3;
                        int i18 = iArr[1];
                        z11 = z10;
                        int i19 = iArr[2];
                        radialProgressView = radialProgressView5;
                        int i20 = iArr[3];
                        matrix = matrix3;
                        f40.L0(f40Var, f40Var.M3.i, iArr);
                        paint = paint4;
                        i13 = i0.a.f(f40Var.K3, i17, iArr[0]);
                        i14 = i0.a.f(f40Var.K3, i18, iArr[1]);
                        i15 = i0.a.f(f40Var.K3, i19, iArr[2]);
                        i16 = i0.a.f(f40Var.K3, i20, iArr[3]);
                    } else {
                        paint = paint4;
                        matrix = matrix3;
                        radialProgressView = radialProgressView5;
                        z11 = z10;
                        i11 = 3;
                        f40.L0(f40Var, e40Var3.i, iArr);
                        i13 = iArr[0];
                        i14 = iArr[1];
                        i15 = iArr[2];
                        i16 = iArr[3];
                    }
                    if (this.e != i13) {
                        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(45.454548f), new int[]{i0.a.o(i13, 60), i0.a.o(i13, 0)}, (float[]) null, Shader.TileMode.CLAMP);
                        f40Var.M2 = radialGradient;
                        paint5.setShader(radialGradient);
                        this.e = i13;
                    }
                    q2Var2.a(i15, i14);
                    q2Var.a(i15, i14);
                    f40Var.s1.a(i15, i14);
                    f40Var.q1.a(i15, i14);
                    org.telegram.ui.Components.voip.q2 q2Var4 = f40Var.u1;
                    int i21 = org.telegram.ui.ActionBar.n6.uh;
                    q2Var4.a(org.telegram.ui.ActionBar.n6.x0(null, i21, false), org.telegram.ui.ActionBar.n6.x0(null, i21, false));
                    f40Var.r1.a(i14, i16);
                }
                e40 e40Var9 = f40Var.M3;
                if (e40Var9 != null) {
                    int i22 = e40Var9.i;
                    z12 = i22 == 1 || i22 == 0 || f40.t1(i22);
                    i12 = i11;
                    if (f40Var.M3.i != i12) {
                        z13 = true;
                        if (f40Var.L3 == null && (e40Var2 = f40Var.M3) != null && e40Var2.i == i12) {
                            float f27 = f40Var.O3 - (j10 / 180.0f);
                            f40Var.O3 = f27;
                            if (f27 < f10) {
                                f40Var.O3 = f10;
                            }
                        } else {
                            if (z12) {
                                float f28 = f40Var.O3;
                                if (f28 != 1.0f) {
                                    float f29 = (j10 / 350.0f) + f28;
                                    f40Var.O3 = f29;
                                    if (f29 > 1.0f) {
                                        f40Var.O3 = 1.0f;
                                    }
                                }
                            }
                            if (!z12) {
                                float f30 = f40Var.O3;
                                if (f30 != 0.0f) {
                                    float f31 = f30 - (j10 / 350.0f);
                                    f40Var.O3 = f31;
                                    if (f31 < 0.0f) {
                                        f40Var.O3 = 0.0f;
                                    }
                                }
                            }
                        }
                        if (z13) {
                            float f32 = f40Var.P3;
                            if (f32 != 1.0f) {
                                float f33 = (j10 / 350.0f) + f32;
                                f40Var.P3 = f33;
                                if (f33 > 1.0f) {
                                    f40Var.P3 = 1.0f;
                                }
                            }
                        }
                        if (!z13) {
                            float f34 = f40Var.P3;
                            if (f34 != 0.0f) {
                                float f35 = f34 - (j10 / 350.0f);
                                f40Var.P3 = f35;
                                if (f35 < 0.0f) {
                                    f40Var.P3 = 0.0f;
                                }
                            }
                        }
                    }
                } else {
                    i12 = i11;
                    z12 = false;
                }
                z13 = false;
                if (f40Var.L3 == null) {
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
            float interpolation2 = (this.d.getInterpolation(f40Var.O3) * 0.6f) + 0.4f;
            w9Var6.e(f40Var.J2, 1.0f);
            w9Var7.e(f40Var.J2, 1.0f);
            if (f40Var.L3 != null || f40Var.M3 == null || f40Var.v1()) {
                canvas2 = canvas;
                paint2 = paint6;
                radialProgressView2 = radialProgressView;
                matrix2 = matrix;
                f13 = 25.909092f;
                f14 = 25.0f;
            } else {
                e40 e40Var10 = f40Var.M3;
                f13 = 25.909092f;
                int i23 = e40Var10.i;
                f14 = 25.0f;
                if (i23 == 3 || f40Var.L3.i == 3) {
                    if (i23 == 3) {
                        f21 = f40Var.K3;
                        paint3 = paint6;
                        paint3.setShader(f40Var.L3.g);
                        f20 = 1.0f;
                    } else {
                        paint3 = paint6;
                        f20 = 1.0f;
                        float f36 = 1.0f - f40Var.K3;
                        paint3.setShader(e40Var10.g);
                        f21 = f36;
                    }
                    int S0 = org.telegram.messenger.g0.S0(f40Var.T3, f20, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.bh, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Bh, false));
                    Paint paint7 = paint;
                    paint7.setColor(S0);
                    float measuredWidth2 = (int) ((q2Var3.getMeasuredWidth() / 2.0f) + q2Var3.getX());
                    float y10 = (int) (q2Var3.getY() + org.telegram.messenger.g0.L(25.0f));
                    Matrix matrix4 = matrix;
                    matrix4.setTranslate(measuredWidth2, y10);
                    f40Var.M2.setLocalMatrix(matrix4);
                    paint3.setAlpha(76);
                    canvas.save();
                    canvas.scale(q2Var3.getScaleX() * 1.0f, q2Var3.getScaleY() * 1.0f, measuredWidth2, y10);
                    canvas.save();
                    float x10 = com.google.android.gms.internal.vision.e2.x(0.807f, f40Var.J2, 0.5f, 0.878f) * f40Var.P3;
                    canvas.scale(x10, x10, measuredWidth2, y10);
                    canvas.save();
                    canvas.scale(1.2f, 1.2f, measuredWidth2, y10);
                    canvas.drawCircle(measuredWidth2, y10, org.telegram.messenger.g0.L(160.0f), paint5);
                    canvas.restore();
                    canvas.restore();
                    if (f40Var.V2 != null) {
                        canvas.save();
                        float B = com.google.android.gms.internal.vision.e2.B(0.807f, f40Var.J2, 0.878f, interpolation2);
                        canvas.scale(B, B, measuredWidth2, y10);
                        w9Var6.a(measuredWidth2, y10, canvas, paint3);
                        canvas.restore();
                        canvas.save();
                        float B2 = com.google.android.gms.internal.vision.e2.B(0.704f, f40Var.J2, 0.926f, interpolation2);
                        canvas.scale(B2, B2, measuredWidth2, y10);
                        w9Var7.a(measuredWidth2, y10, canvas, paint3);
                        canvas.restore();
                    }
                    paint3.setAlpha(org.telegram.messenger.ks.e4);
                    if (z11) {
                        canvas.drawCircle(measuredWidth2, y10, org.telegram.messenger.g0.L(25.909092f), paint3);
                        paint3.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fh, false));
                        if (f21 != 0.0f) {
                            paint3.setAlpha((int) (f21 * 255.0f));
                            paint3.setShader(null);
                            canvas.drawCircle(measuredWidth2, y10, org.telegram.messenger.g0.L(25.909092f), paint3);
                        }
                    }
                    canvas.drawCircle(measuredWidth2, y10, org.telegram.messenger.g0.L(25.0f) * f21, paint7);
                    if (!z11) {
                        radialProgressView.a(canvas, measuredWidth2, y10);
                    }
                    canvas.restore();
                    super.dispatchDraw(canvas);
                    if (f40Var.Z3.r == null) {
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
                if (i10 == 0 && f40Var.L3 != null) {
                    if (!f40Var.v1()) {
                        paint2.setShader(f40Var.L3.g);
                    }
                    f16 = 1.0f - f40Var.K3;
                    if (f40Var.L3.i == 3) {
                        L = org.telegram.messenger.g0.L(2.0f);
                        L2 -= L * f16;
                    }
                    if (paint2.getShader() == null) {
                    }
                    f17 = f16;
                    f18 = L2;
                    if (f40Var.v1()) {
                    }
                    float measuredWidth3 = (int) ((q2Var3.getMeasuredWidth() / 2.0f) + q2Var3.getX());
                    float y11 = (int) (q2Var3.getY() + org.telegram.messenger.g0.L(f14));
                    matrix2.setTranslate(measuredWidth3, y11);
                    f40Var.M2.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (f40Var.Q2 * 76.0f * f17));
                    canvas2.save();
                    canvas2.scale(q2Var3.getScaleX() * 1.0f, q2Var3.getScaleX() * 1.0f, measuredWidth3, y11);
                    canvas2.save();
                    float x11 = com.google.android.gms.internal.vision.e2.x(f40Var.J2, 0.807f, 0.5f, 0.878f);
                    float f37 = f40Var.P3;
                    canvas2.scale(f37 * x11, f37 * x11, measuredWidth3, y11);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (!f40Var.v1()) {
                    }
                    if (f40.E5) {
                    }
                    float measuredWidth4 = (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(21.0f);
                    float L3 = org.telegram.messenger.g0.L(24.0f);
                    float f38 = (f18 - measuredWidth4) + measuredWidth4;
                    float f39 = f40Var.Q2;
                    float f40 = f38 * f39;
                    float f41 = ((f18 - L3) + L3) * f39;
                    float f42 = measuredWidth3 + f40;
                    f15 = interpolation2;
                    w9Var = w9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth3 - f40, y11 - f41, f42, y11 + f41);
                    float L4 = (f18 - org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(4.0f);
                    paint2.setAlpha((int) (f40Var.Q2 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, L4, L4, paint2);
                    if (i10 != 1) {
                    }
                    canvas2.restore();
                    if (r20Var != null) {
                        paint2.setAlpha((int) (r20Var.getAlpha() * 255.0f));
                        float x12 = r20Var.getX() - getX();
                        float y12 = r20Var.getY() - getY();
                        rectF.set(x12, y12, r20Var.getMeasuredWidth() + x12, r20Var.getMeasuredHeight() + y12);
                        canvas2.save();
                        canvas2.scale(r20Var.getScaleX(), r20Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f19), org.telegram.messenger.g0.L(f19), paint2);
                        canvas2.restore();
                    }
                } else if (i10 != 1) {
                    f15 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    w9Var = w9Var6;
                    w9Var2 = w9Var7;
                    rectF = rectF3;
                } else if (f40Var.M3 != null) {
                    if (!f40Var.v1()) {
                        paint2.setShader(f40Var.M3.g);
                    }
                    f16 = f40Var.K3;
                    if (f40Var.M3.i == 3) {
                        L = org.telegram.messenger.g0.L(2.0f);
                        L2 -= L * f16;
                    }
                    if (paint2.getShader() == null || f40Var.v1()) {
                        f17 = f16;
                        f18 = L2;
                    } else {
                        f17 = f16;
                        f18 = L2;
                        paint2.setColor(org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.bh, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Bh, false)));
                    }
                    if (f40Var.v1()) {
                        radialProgressView4 = radialProgressView2;
                        w9Var3 = w9Var6;
                        w9Var4 = w9Var7;
                    } else {
                        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ch, false);
                        int i24 = org.telegram.ui.ActionBar.n6.Bh;
                        radialProgressView4 = radialProgressView2;
                        int S02 = org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, x02, org.telegram.ui.ActionBar.n6.x0(null, i24, false));
                        paint2.setColor(S02);
                        paint2.setShader(null);
                        int i25 = org.telegram.ui.ActionBar.n6.bh;
                        w9Var4 = w9Var7;
                        w9Var3 = w9Var6;
                        q2Var.a(org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, i25, false), org.telegram.ui.ActionBar.n6.x0(null, i24, false)), S02);
                        q2Var2.a(org.telegram.messenger.g0.S0(f40Var.T3, 1.0f, org.telegram.ui.ActionBar.n6.x0(null, i25, false), org.telegram.ui.ActionBar.n6.x0(null, i24, false)), S02);
                    }
                    float measuredWidth32 = (int) ((q2Var3.getMeasuredWidth() / 2.0f) + q2Var3.getX());
                    float y112 = (int) (q2Var3.getY() + org.telegram.messenger.g0.L(f14));
                    matrix2.setTranslate(measuredWidth32, y112);
                    f40Var.M2.setLocalMatrix(matrix2);
                    paint2.setAlpha((int) (f40Var.Q2 * 76.0f * f17));
                    canvas2.save();
                    canvas2.scale(q2Var3.getScaleX() * 1.0f, q2Var3.getScaleX() * 1.0f, measuredWidth32, y112);
                    canvas2.save();
                    float x112 = com.google.android.gms.internal.vision.e2.x(f40Var.J2, 0.807f, 0.5f, 0.878f);
                    float f372 = f40Var.P3;
                    canvas2.scale(f372 * x112, f372 * x112, measuredWidth32, y112);
                    if (i10 != 1 && !f40Var.v1() && org.telegram.messenger.pc.e(512)) {
                        canvas2.save();
                        canvas2.scale(1.2f, 1.2f, measuredWidth32, y112);
                        int alpha = paint5.getAlpha();
                        paint5.setAlpha((int) ((1.0f - f40Var.y5.e) * f40Var.Q2 * alpha));
                        canvas2.drawCircle(measuredWidth32, y112, org.telegram.messenger.g0.L(160.0f), paint5);
                        paint5.setAlpha(alpha);
                        canvas2.restore();
                    }
                    canvas2.restore();
                    if (!f40Var.v1()) {
                        w9Var2 = w9Var4;
                        w9Var5 = w9Var3;
                    } else if (f40Var.Q2 > 0.0f) {
                        canvas2.save();
                        float x13 = com.google.android.gms.internal.vision.e2.x(f40Var.J2, 0.807f, interpolation2, 0.878f);
                        canvas2.scale(x13, x13, measuredWidth32, y112);
                        w9Var5 = w9Var3;
                        w9Var5.a(measuredWidth32, y112, canvas2, paint2);
                        canvas2.restore();
                        canvas2.save();
                        float x14 = com.google.android.gms.internal.vision.e2.x(f40Var.J2, 0.704f, interpolation2, 0.926f);
                        canvas2.scale(x14, x14, measuredWidth32, y112);
                        w9Var2 = w9Var4;
                        w9Var2.a(measuredWidth32, y112, canvas2, paint2);
                        canvas2.restore();
                    } else {
                        w9Var2 = w9Var4;
                        w9Var5 = w9Var3;
                    }
                    if (f40.E5) {
                        if (i10 == 0) {
                            paint2.setAlpha(org.telegram.messenger.ks.e4);
                        } else {
                            paint2.setAlpha((int) (f17 * 255.0f));
                        }
                    } else if (i10 == 0) {
                        paint2.setAlpha((int) (f40Var.R2 * 255.0f));
                    } else {
                        paint2.setAlpha((int) (f40Var.R2 * f17 * 255.0f));
                    }
                    float measuredWidth42 = (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(21.0f);
                    float L32 = org.telegram.messenger.g0.L(24.0f);
                    float f382 = (f18 - measuredWidth42) + measuredWidth42;
                    float f392 = f40Var.Q2;
                    float f402 = f382 * f392;
                    float f412 = ((f18 - L32) + L32) * f392;
                    float f422 = measuredWidth32 + f402;
                    f15 = interpolation2;
                    w9Var = w9Var5;
                    rectF = rectF3;
                    rectF.set(measuredWidth32 - f402, y112 - f412, f422, y112 + f412);
                    float L42 = (f18 - org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(4.0f);
                    paint2.setAlpha((int) (f40Var.Q2 * paint2.getAlpha()));
                    canvas2.drawRoundRect(rectF, L42, L42, paint2);
                    if (i10 != 1) {
                        f19 = 4.0f;
                        if (f40Var.M3.i == 3) {
                            if (f40Var.v1()) {
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
                    if (r20Var != null && r20Var.getVisibility() == 0) {
                        paint2.setAlpha((int) (r20Var.getAlpha() * 255.0f));
                        float x122 = r20Var.getX() - getX();
                        float y122 = r20Var.getY() - getY();
                        rectF.set(x122, y122, r20Var.getMeasuredWidth() + x122, r20Var.getMeasuredHeight() + y122);
                        canvas2.save();
                        canvas2.scale(r20Var.getScaleX(), r20Var.getScaleY(), rectF.centerX(), rectF.centerY());
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(f19), org.telegram.messenger.g0.L(f19), paint2);
                        canvas2.restore();
                    }
                } else {
                    f15 = interpolation2;
                    radialProgressView3 = radialProgressView2;
                    w9Var = w9Var6;
                    w9Var2 = w9Var7;
                    rectF = rectF3;
                }
                i10++;
                rectF3 = rectF;
                w9Var7 = w9Var2;
                radialProgressView2 = radialProgressView3;
                interpolation2 = f15;
                w9Var6 = w9Var;
            }
            super.dispatchDraw(canvas);
            if (f40Var.Z3.r == null) {
            }
        }
        f11 = 1.0f;
        f12 = f11;
        z10 = true;
        if (z10) {
        }
        float interpolation22 = (this.d.getInterpolation(f40Var.O3) * 0.6f) + 0.4f;
        w9Var6.e(f40Var.J2, 1.0f);
        w9Var7.e(f40Var.J2, 1.0f);
        if (f40Var.L3 != null) {
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
        if (f40Var.Z3.r == null) {
        }
    }
}
