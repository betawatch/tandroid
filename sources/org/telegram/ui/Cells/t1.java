package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.zj0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t1 {
    public final q1 a;
    public GradientDrawable b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public StaticLayout h;
    public StaticLayout i;
    public int j;
    public float k;
    public int l;
    public int m;
    public int n;
    public int o = 45;
    public LinearGradient p;
    public qa0 q;
    public int r;
    public a80 s;
    public Path t;
    public Paint u;
    public boolean v;
    public hc w;
    public y x;

    public t1(q1 q1Var) {
        this.a = q1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0bac  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0c25  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0d57 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0ec7  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0f09  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0fb8  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x108c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x102f  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x107e  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x10e4  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x1318  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0d44  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0660  */
    /* JADX WARN: Type inference failed for: r43v0 */
    /* JADX WARN: Type inference failed for: r43v1 */
    /* JADX WARN: Type inference failed for: r43v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, float f10) {
        float f11;
        float f12;
        int L;
        int extraTextX;
        int i7;
        int i10;
        int i11;
        int i12;
        int L2;
        int i13;
        float f13;
        int i14;
        int i15;
        boolean z9;
        float f14;
        int i16;
        int i17;
        boolean z10;
        float f15;
        float f16;
        RectF rectF;
        boolean z11;
        boolean z12;
        float f17;
        float f18;
        int i18;
        float f19;
        float f20;
        int i19;
        float f21;
        int i20;
        float f22;
        ImageReceiver imageReceiver;
        float f23;
        float f24;
        int i21;
        int i22;
        float f25;
        int i23;
        float f26;
        float f27;
        int i24;
        int i25;
        ImageReceiver imageReceiver2;
        di.z2 z2Var;
        int i26;
        RectF rectF2;
        int i27;
        float f28;
        x1 x1Var;
        float f29;
        di.z2 z2Var2;
        float f30;
        int i28;
        float f31;
        float f32;
        float f33;
        float f34;
        float f35;
        RectF rectF3;
        float f36;
        Drawable drawable;
        float f37;
        int L3;
        int i29;
        int i30;
        org.telegram.ui.j4 j4Var;
        ij ijVar;
        zj0 zj0Var;
        float f38;
        ImageReceiver imageReceiver3;
        float f39;
        float f40;
        int i31;
        float f41;
        float f42;
        float b10;
        boolean z13;
        float f43;
        int i32;
        int i33;
        org.telegram.ui.j4 j4Var2;
        float f44;
        float f45;
        float f46;
        int i34;
        int i35;
        int i36;
        Canvas canvas2 = canvas;
        q1 q1Var = this.a;
        RadialProgress2 radialProgress2 = q1Var.P0;
        ImageReceiver imageReceiver4 = q1Var.U0;
        RectF rectF4 = q1Var.L2;
        RectF rectF5 = q1Var.b4;
        x1 x1Var2 = q1Var.hb;
        di.z2 z2Var3 = q1Var.T0;
        if (q1Var.P5.r4() || q1Var.P5.G4() || q1Var.Q1 || q1Var.S1 || q1Var.T1) {
            int saveCount = canvas2.getSaveCount();
            float f47 = 0.0f;
            float backgroundDrawableRight = ((q1Var.getBackgroundDrawableRight() + (x1Var2 != null ? x1Var2.i0 : 0.0f)) - org.telegram.messenger.g0.L(10 + ((!q1Var.P5.P3() || q1Var.B6 || q1Var.J) ? 0 : 6))) - q1Var.getExtraTextX();
            if (q1Var.S1) {
                f11 = 10.0f;
                i10 = org.telegram.messenger.g0.L(14.0f) + q1Var.Ta;
                i13 = q1Var.o0 - org.telegram.messenger.g0.L(10.0f);
            } else {
                f11 = 10.0f;
                if (q1Var.T1) {
                    i10 = org.telegram.messenger.g0.L(14.0f) + q1Var.Ta;
                    i12 = q1Var.o0;
                    L2 = org.telegram.messenger.g0.L(1.0f);
                } else {
                    if (!q1Var.P5.r4()) {
                        if (q1Var.P5.P3()) {
                            i7 = q1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + q1Var.M6;
                            f12 = 1.0f;
                            if (q1Var.P5.D == 19) {
                                i7 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(q1Var.W7, q1Var.Y7) + i7)) - org.telegram.messenger.g0.q.x);
                            }
                        } else {
                            f12 = 1.0f;
                            if (q1Var.B6) {
                                L = org.telegram.messenger.g0.L(12.0f) + q1Var.M6;
                                extraTextX = q1Var.getExtraTextX();
                            } else {
                                L = org.telegram.messenger.g0.L(q1Var.J ? 12.0f : 18.0f) + q1Var.M6;
                                extraTextX = q1Var.getExtraTextX();
                            }
                            i7 = extraTextX + L;
                        }
                        int L4 = ((int) (i7 + x1Var2.h0)) - org.telegram.messenger.g0.L(1.33f);
                        i10 = q1Var.p0;
                        if (x1Var2.s2) {
                            i10 = org.telegram.messenger.g0.W1(x1Var2.L1, x1Var2.r2, i10);
                        }
                        i11 = L4;
                        f13 = i11;
                        i14 = (int) (backgroundDrawableRight - f13);
                        int i37 = q1Var.V1;
                        if (x1Var2 == null && x1Var2.J1) {
                            i15 = i11;
                            i37 = org.telegram.messenger.g0.W1(x1Var2.L1, x1Var2.I1, i37);
                        } else {
                            i15 = i11;
                        }
                        int i38 = i37;
                        if (q1Var.n8 == null) {
                            q1Var.n8 = new zj0(q1Var);
                        }
                        org.telegram.ui.ActionBar.m6.Y2.setColor(q1Var.n8.a(q1Var.P5, q1Var.ia, q1Var.ja, q1Var.Pb, 3));
                        zj0 zj0Var2 = q1Var.n8;
                        int i39 = q1Var.x2;
                        zj0Var2.o((i39 != 23 || i39 == 24 || i39 == 28) ? 0.5f : f12);
                        boolean z14 = (q1Var.P5.r4() || q1Var.w1) ? false : true;
                        boolean z15 = !(!z14 || !q1Var.t2 || (i36 = q1Var.x2) == 26 || i36 == 9 || i36 == 2 || i36 == 13 || i36 == 11 || i36 == 25 || i36 == 1 || i36 == 29 || i36 == 18 || i36 == 22) || (q1Var.x2 == 6 && this.j != 0);
                        boolean z16 = z14 && (!q1Var.t2 || (i35 = q1Var.x2) == 9 || i35 == 2 || i35 == 11 || i35 == 25 || i35 == 13 || i35 == 1 || i35 == 29 || i35 == 18 || i35 == 22 || i35 == 32 || q1Var.w1 || i35 == 26);
                        l1 l1Var = q1Var.Ra;
                        z9 = l1Var == null && l1Var.p1(q1Var, 2);
                        if (!q1Var.T1 || q1Var.P5.v3() || q1Var.P5.G4()) {
                            f14 = f10;
                            i16 = i14;
                            i17 = i10;
                            z10 = z9;
                            f15 = f13;
                            f16 = f11;
                            rectF = rectF4;
                            z11 = true;
                            z12 = false;
                        } else {
                            if (this.w == null) {
                                f44 = 2.0f;
                                this.w = new hc(q1Var, 2.0f, 2.0f);
                            } else {
                                f44 = 2.0f;
                            }
                            canvas2.save();
                            float f48 = f44;
                            float a10 = this.w.a(0.01f);
                            canvas2.scale(a10, a10, (i14 / f48) + f13, ((i38 + (q1Var.t2 ? org.telegram.messenger.g0.L(42.0f) : 0)) / f48) + i10);
                            RectF rectF6 = org.telegram.messenger.g0.P;
                            rectF6.set(f13, i10 - org.telegram.messenger.g0.L(6.0f), i15 + i14, i10 + i38 + (q1Var.t2 ? org.telegram.messenger.g0.L(42.0f) : 0));
                            q1Var.n8.q(z9);
                            float floor = (float) Math.floor(iz.Y0 / (q1Var.P5.r4() ? f48 : 3.0f));
                            zj0 zj0Var3 = q1Var.n8;
                            if (z15) {
                                float f49 = f12 - (x1Var2.t1 ? q1Var.w1 ? x1Var2.L1 : f12 - x1Var2.L1 : q1Var.w1 ? f12 : 0.0f);
                                float v = z2Var3.v() + org.telegram.messenger.g0.L(18.0f);
                                StaticLayout staticLayout = q1Var.f2;
                                if (staticLayout != null) {
                                    f45 = floor;
                                    i34 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                                } else {
                                    f45 = floor;
                                    i34 = 0;
                                }
                                f46 = (v + i34) * f49;
                            } else {
                                f45 = floor;
                                f46 = 0.0f;
                            }
                            zj0Var3.k(f46);
                            i17 = i10;
                            z10 = z9;
                            f15 = f13;
                            f16 = f11;
                            i16 = i14;
                            float f50 = f45;
                            rectF = rectF4;
                            zj0Var3.c(f50, f45, f45, f10, canvas, rectF6);
                            int h = q1Var.n8.h();
                            y yVar = this.x;
                            if (yVar == null) {
                                q1Var.Qa = h;
                                y a02 = org.telegram.ui.ActionBar.m6.a0(h, 0, 0);
                                this.x = a02;
                                a02.setCallback(q1Var);
                                org.telegram.ui.ActionBar.m6.F1(this.x, 3.0f, 6.0f, 6.0f, 3.0f);
                                this.x.setCallback(q1Var);
                            } else if (q1Var.Qa != h) {
                                q1Var.Qa = h;
                                org.telegram.ui.ActionBar.m6.H1(yVar, h, true);
                                this.x.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                                this.x.draw(canvas);
                                q1Var.n8.f(canvas, rectF6, f10);
                                z11 = true;
                                q1Var.n8.g(f50, f50, f50, f10, canvas, rectF6);
                                f14 = f10;
                                canvas2 = canvas;
                                z12 = true;
                            }
                            this.x.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                            this.x.draw(canvas);
                            q1Var.n8.f(canvas, rectF6, f10);
                            z11 = true;
                            q1Var.n8.g(f50, f50, f50, f10, canvas, rectF6);
                            f14 = f10;
                            canvas2 = canvas;
                            z12 = true;
                        }
                        if (q1Var.N1 || !z14) {
                            f17 = 1.0f;
                            f18 = 2.0f;
                            i18 = i17;
                        } else {
                            int L5 = i16 - org.telegram.messenger.g0.L(17.0f);
                            if (q1Var.w1) {
                                z2Var3.C0(((i15 + i16) - z2Var3.w()) - org.telegram.messenger.g0.L(6.0f));
                                z2Var3.D0(0);
                            } else {
                                z2Var3.C0(i15 + (q1Var.T1 ? -org.telegram.messenger.g0.L(6.3f) : org.telegram.messenger.g0.L(f16)));
                                z2Var3.D0(i17);
                            }
                            if (x1Var2 == null || !x1Var2.t1) {
                                f18 = 2.0f;
                                if (!q1Var.w1 && (i33 = q1Var.L1) != 7 && i33 != z11) {
                                    z2Var3.B0(L5);
                                }
                            } else {
                                if (!q1Var.w1 && q1Var.L1 != z11) {
                                    z2Var3.B0((int) org.telegram.messenger.g0.T1(x1Var2.p1, L5, x1Var2.L1));
                                }
                                f18 = 2.0f;
                                z2Var3.C0(org.telegram.messenger.g0.T1(x1Var2.r1, z2Var3.r(), x1Var2.L1) - (z2Var3.w() / 2.0f));
                                z2Var3.D0(org.telegram.messenger.g0.T1(x1Var2.s1, z2Var3.s(), x1Var2.L1) - (z2Var3.v() / 2.0f));
                            }
                            if (!q1Var.w1 && q1Var.x1) {
                                int L6 = org.telegram.messenger.g0.L(48.0f);
                                float f51 = L6;
                                q1Var.J3 = (int) com.google.android.recaptcha.internal.a.A(z2Var3.w(), f51, f18, z2Var3.x());
                                int v10 = (int) (((z2Var3.v() - f51) / f18) + z2Var3.z());
                                q1Var.K3 = v10;
                                int i40 = q1Var.J3;
                                radialProgress2.r(i40, v10, i40 + L6, L6 + v10);
                            }
                            if (q1Var.xb && MediaController.B().I(q1Var.P5) && (j4Var2 = MediaController.B().L0) != null && j4Var2.d && canvas2.isHardwareAccelerated()) {
                                q1Var.jb = z11;
                                q1Var.E9 = z11;
                            } else {
                                l1 l1Var2 = q1Var.Ra;
                                if (l1Var2 == null || l1Var2.N1() == null || !q1Var.Ra.N1().f(q1Var)) {
                                    f17 = 1.0f;
                                    if (f14 != 1.0f) {
                                        z2Var3.setAlpha(f14);
                                        if (q1Var.v()) {
                                            q1Var.jb = z2Var3.g(canvas2);
                                        } else {
                                            q1Var.jb = z11;
                                        }
                                        if (q1Var.P5.t2()) {
                                            imageReceiver4.setAlpha(f14);
                                            q1Var.N0(canvas2);
                                            imageReceiver4.setAlpha(1.0f);
                                        }
                                        z2Var3.setAlpha(1.0f);
                                    } else {
                                        if (q1Var.v()) {
                                            q1Var.jb = z2Var3.g(canvas2);
                                        } else {
                                            q1Var.jb = z11;
                                        }
                                        if (q1Var.P5.t2()) {
                                            q1Var.N0(canvas2);
                                        }
                                    }
                                    i18 = (int) (z2Var3.v() + org.telegram.messenger.g0.L(6.0f) + i17);
                                }
                            }
                            f17 = 1.0f;
                            i18 = (int) (z2Var3.v() + org.telegram.messenger.g0.L(6.0f) + i17);
                        }
                        if (q1Var.f2 == null) {
                            if (q1Var.g2 != null) {
                                i18 += org.telegram.messenger.g0.L(f17);
                            }
                            int L7 = i18 - org.telegram.messenger.g0.L(f17);
                            f20 = f18;
                            int alpha = org.telegram.ui.ActionBar.m6.Y2.getAlpha();
                            if (f14 != f17) {
                                z13 = z11;
                                f19 = f17;
                                org.telegram.ui.ActionBar.m6.Y2.setAlpha((int) (alpha * f14));
                            } else {
                                f19 = f17;
                                z13 = z11;
                            }
                            canvas2.save();
                            if (Math.abs(q1Var.c2) > f19) {
                                f43 = ((i16 - org.telegram.messenger.g0.L(q1Var.T1 ? 0.0f : 20.0f)) - q1Var.e2) - q1Var.c2;
                            } else {
                                f43 = 0.0f;
                            }
                            f21 = f15;
                            float L8 = f43 + (q1Var.T1 ? 0 : org.telegram.messenger.g0.L(f16)) + f21;
                            canvas2.translate(L8, i18 - org.telegram.messenger.g0.L(f19));
                            xh.f.f(canvas2, q1Var.f2);
                            canvas2.restore();
                            if (q1Var.g2 != null) {
                                float L9 = L8 + q1Var.d2 + org.telegram.messenger.g0.L(12.0f);
                                q1Var.j2 = L9;
                                q1Var.k2 = i18;
                                i32 = i18;
                                i20 = L7;
                                rectF5.set(L9 - org.telegram.messenger.g0.L(6.0f), q1Var.k2 - org.telegram.messenger.g0.L(f20), q1Var.j2 + q1Var.h2 + org.telegram.messenger.g0.L(6.0f), q1Var.k2 + q1Var.i2 + org.telegram.messenger.g0.L(f20));
                                if (q1Var.m2 == null) {
                                    q1Var.m2 = new hc(q1Var);
                                }
                                float a11 = q1Var.m2.a(0.1f);
                                boolean z17 = a11 != f19 ? z13 ? 1 : 0 : false;
                                if (z17) {
                                    canvas2.save();
                                    canvas2.scale(a11, a11, rectF5.centerX(), rectF5.centerY());
                                }
                                org.telegram.ui.ActionBar.m6.M2.setColor(org.telegram.ui.ActionBar.m6.Y2.getColor());
                                int alpha2 = org.telegram.ui.ActionBar.m6.M2.getAlpha();
                                org.telegram.ui.ActionBar.m6.M2.setAlpha((int) (alpha * 0.11f));
                                boolean z18 = z17;
                                canvas2.drawRoundRect(rectF5, rectF5.height(), rectF5.height(), org.telegram.ui.ActionBar.m6.M2);
                                org.telegram.ui.ActionBar.m6.M2.setAlpha(alpha2);
                                org.telegram.ui.ActionBar.m6.c3.setColor(org.telegram.ui.ActionBar.m6.Y2.getColor());
                                org.telegram.ui.ActionBar.m6.c3.setAlpha(org.telegram.ui.ActionBar.m6.Y2.getAlpha());
                                canvas2.save();
                                canvas2.translate(q1Var.j2, q1Var.k2);
                                q1Var.g2.draw(canvas2);
                                canvas2.restore();
                                if (z18) {
                                    canvas2.restore();
                                }
                            } else {
                                i32 = i18;
                                i20 = L7;
                            }
                            i18 = q1Var.f2.getLineBottom(r2.getLineCount() - 1) + i32;
                            org.telegram.ui.ActionBar.m6.Y2.setAlpha(alpha);
                            i19 = z13;
                        } else {
                            f19 = f17;
                            f20 = f18;
                            i19 = z11;
                            f21 = f15;
                            i20 = 0;
                        }
                        if ((!q1Var.S1 || q1Var.T1) && q1Var.P5.W5(x1Var2) != 0) {
                            int C = org.telegram.messenger.k5.C(4.0f, q1Var.P5.W5(x1Var2), i17);
                            i18 = org.telegram.messenger.k5.C(4.0f, q1Var.P5.W5(x1Var2), i18);
                            i17 = C;
                        }
                        if (q1Var.N1 || !z15) {
                            f22 = 4.0f;
                            imageReceiver = imageReceiver4;
                            f23 = f21;
                            f24 = f16;
                            i21 = i15;
                            i22 = i16;
                            f25 = 6.0f;
                        } else {
                            if (!q1Var.w1) {
                                f22 = 4.0f;
                                float f52 = (x1Var2 == null || !x1Var2.t1) ? 1.0f : x1Var2.L1;
                                if (i18 != i17) {
                                    i18 = (int) ((org.telegram.messenger.g0.L(f20) * f52) + i18);
                                }
                                int L10 = i16 - org.telegram.messenger.g0.L(17.0f);
                                if (q1Var.w1 || q1Var.x2 != 17) {
                                    imageReceiver3 = imageReceiver4;
                                    f23 = f21;
                                    f24 = f16;
                                    i21 = i15;
                                    f39 = f52;
                                    i23 = i17;
                                    f40 = 0.0f;
                                } else {
                                    Rect rect = org.telegram.messenger.g0.Q;
                                    int L11 = org.telegram.messenger.g0.L(f16) + i15;
                                    float f53 = f16;
                                    i23 = i17;
                                    f23 = f21;
                                    int i41 = i15;
                                    f39 = f52;
                                    f24 = f53;
                                    rect.set(L11, i18, org.telegram.messenger.k5.C(f53, i41, L10), ((int) z2Var3.v()) + i18);
                                    RectF rectF7 = org.telegram.messenger.g0.P;
                                    rectF7.set(rect);
                                    if (this.b == null) {
                                        TLRPC.PhotoSize photoSize = q1Var.d4;
                                        if (photoSize == null || photoSize.gradientTopColor == 0 || photoSize.gradientBottomColor == 0) {
                                            imageReceiver3 = imageReceiver4;
                                            i21 = i41;
                                            if (z2Var3.n() != null) {
                                                int[] b11 = a8.ba.b(z2Var3.n(), org.telegram.ui.ActionBar.m6.j1());
                                                this.b = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b11);
                                                TLRPC.PhotoSize photoSize2 = q1Var.d4;
                                                if (photoSize2 != null) {
                                                    photoSize2.gradientTopColor = b11[0];
                                                    photoSize2.gradientBottomColor = b11[i19];
                                                }
                                            }
                                        } else {
                                            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                                            i21 = i41;
                                            TLRPC.PhotoSize photoSize3 = q1Var.d4;
                                            imageReceiver3 = imageReceiver4;
                                            this.b = new GradientDrawable(orientation, new int[]{photoSize3.gradientTopColor, photoSize3.gradientBottomColor});
                                        }
                                    } else {
                                        imageReceiver3 = imageReceiver4;
                                        i21 = i41;
                                    }
                                    if (this.b != null) {
                                        canvas2.save();
                                        Path path = q1Var.H9;
                                        if (path != null) {
                                            path.rewind();
                                        } else {
                                            q1Var.H9 = new Path();
                                        }
                                        q1Var.H9.addRoundRect(rectF7, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), Path.Direction.CW);
                                        canvas2.clipPath(q1Var.H9);
                                        this.b.setBounds(rect);
                                        this.b.draw(canvas2);
                                        canvas2.restore();
                                    }
                                    f40 = (((q1Var.C2 - z2Var3.w()) - org.telegram.messenger.g0.L(f24)) - (x1Var2 == null ? 0.0f : q1Var.P5.P3() ? x1Var2.h0 : -x1Var2.i0)) / f20;
                                }
                                if (q1Var.z2 != 0) {
                                    float L12 = org.telegram.messenger.g0.L(f24) + i21;
                                    z2Var3.C0(((this.r - z2Var3.w()) / f20) + f40 + L12);
                                    z2Var3.D0(i18);
                                    rectF5.set(L12, z2Var3.z(), r5 + this.r, z2Var3.A());
                                    org.telegram.ui.ActionBar.m6.M2.setColor(i0.a.o(q1Var.z2, (int) (f14 * 255.0f)));
                                    canvas2.drawRoundRect(rectF5, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.M2);
                                } else {
                                    z2Var3.C0(f40 + f23 + org.telegram.messenger.g0.L(f24));
                                    z2Var3.D0(i18);
                                }
                                if (q1Var.x2 != 17) {
                                    if (x1Var2 != null && x1Var2.t1) {
                                        if (!q1Var.w1 && q1Var.L1 != i19) {
                                            z2Var3.B0((int) org.telegram.messenger.g0.T1(x1Var2.p1, L10, x1Var2.L1));
                                        }
                                        z2Var3.C0(org.telegram.messenger.g0.T1(x1Var2.r1, z2Var3.r(), x1Var2.L1) - (z2Var3.w() / f20));
                                        z2Var3.D0(org.telegram.messenger.g0.T1(x1Var2.s1, z2Var3.s(), x1Var2.L1) - (z2Var3.v() / f20));
                                    } else if (!q1Var.w1 && q1Var.L1 != 1) {
                                        z2Var3.B0(L10);
                                    }
                                }
                                if (this.j != 0) {
                                    rectF5.set(z2Var3.x(), z2Var3.z(), z2Var3.y(), z2Var3.A());
                                    if (this.l == 0) {
                                        org.telegram.ui.ActionBar.m6.M2.setShader(null);
                                        org.telegram.ui.ActionBar.m6.M2.setColor(this.j);
                                        if (f14 != 1.0f) {
                                            org.telegram.ui.ActionBar.m6.M2.setAlpha((int) (f14 * 255.0f));
                                        }
                                    } else if (this.m == 0) {
                                        if (this.p == null) {
                                            Rect e10 = org.telegram.ui.Components.j9.e(org.telegram.ui.Components.j9.d(org.telegram.messenger.g0.s1(this.o, false)), (int) rectF5.width(), (int) rectF5.height());
                                            this.p = new LinearGradient(e10.left, e10.top, e10.right, e10.bottom, new int[]{this.j, this.l}, (float[]) null, Shader.TileMode.CLAMP);
                                        }
                                        org.telegram.ui.ActionBar.m6.M2.setShader(this.p);
                                        if (f14 != 1.0f) {
                                            org.telegram.ui.ActionBar.m6.M2.setAlpha((int) (f14 * 255.0f));
                                        }
                                    } else if (this.q == null) {
                                        qa0 qa0Var = new qa0(true, this.j, this.l, this.m, this.n);
                                        this.q = qa0Var;
                                        if (this.k < 0.0f) {
                                            z2Var3.m0(qa0Var.d());
                                        }
                                        if (!z2Var3.K()) {
                                            this.q.v(org.telegram.messenger.g0.L(4.0f));
                                        }
                                    }
                                    qa0 qa0Var2 = this.q;
                                    if (qa0Var2 != null) {
                                        qa0Var2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                                        this.q.draw(canvas2);
                                        i31 = i18;
                                        f41 = f39;
                                        i22 = i16;
                                    } else if (q1Var.z2 != 0) {
                                        i31 = i18;
                                        f41 = f39;
                                        i22 = i16;
                                        canvas2.drawRect(z2Var3.x(), z2Var3.z(), z2Var3.y(), z2Var3.A(), org.telegram.ui.ActionBar.m6.M2);
                                    } else {
                                        i31 = i18;
                                        f41 = f39;
                                        i22 = i16;
                                        canvas2.drawRoundRect(rectF5, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.M2);
                                    }
                                    org.telegram.ui.ActionBar.m6.M2.setShader(null);
                                    org.telegram.ui.ActionBar.m6.M2.setAlpha(qs.e4);
                                } else {
                                    i31 = i18;
                                    f41 = f39;
                                    i22 = i16;
                                }
                                if (q1Var.N1 && q1Var.t2 && q1Var.x2 != 9) {
                                    if (q1Var.x1) {
                                        int L13 = org.telegram.messenger.g0.L(48.0f);
                                        float f54 = L13;
                                        f26 = 2.0f;
                                        q1Var.J3 = (int) com.google.android.recaptcha.internal.a.A(z2Var3.w(), f54, 2.0f, z2Var3.x());
                                        int v11 = (int) (((z2Var3.v() - f54) / 2.0f) + z2Var3.z());
                                        q1Var.K3 = v11;
                                        int i42 = q1Var.J3;
                                        radialProgress2.r(i42, v11, i42 + L13, L13 + v11);
                                    } else {
                                        f26 = 2.0f;
                                    }
                                    l1 l1Var3 = q1Var.Ra;
                                    if (l1Var3 == null || l1Var3.N1() == null || !q1Var.Ra.N1().f(q1Var)) {
                                        f42 = 1.0f;
                                        if (f14 != 1.0f) {
                                            z2Var3.setAlpha(f14);
                                            if (q1Var.v()) {
                                                q1Var.jb = z2Var3.g(canvas2);
                                            } else {
                                                q1Var.jb = true;
                                            }
                                            imageReceiver = imageReceiver3;
                                            if (q1Var.P5.t2()) {
                                                imageReceiver.setAlpha(f14);
                                                q1Var.N0(canvas2);
                                                imageReceiver.setAlpha(1.0f);
                                            }
                                            z2Var3.setAlpha(1.0f);
                                        } else {
                                            imageReceiver = imageReceiver3;
                                            if (q1Var.v()) {
                                                q1Var.jb = z2Var3.g(canvas2);
                                            } else {
                                                q1Var.jb = true;
                                            }
                                            if (q1Var.P5.t2()) {
                                                q1Var.N0(canvas2);
                                            }
                                        }
                                    } else {
                                        imageReceiver = imageReceiver3;
                                        f42 = 1.0f;
                                    }
                                } else {
                                    imageReceiver = imageReceiver3;
                                    f42 = 1.0f;
                                    f26 = 2.0f;
                                }
                                if (x1Var2 == null || !x1Var2.h) {
                                    f19 = f42;
                                    f25 = 6.0f;
                                    b10 = org.telegram.messenger.camera.q.b(z2Var3.v(), org.telegram.messenger.g0.L(6.0f), f41, i31);
                                } else {
                                    f19 = f42;
                                    f25 = 6.0f;
                                    b10 = org.telegram.messenger.camera.q.b(x1Var2.q0, org.telegram.messenger.g0.L(6.0f), f41, i31);
                                }
                                i18 = (int) b10;
                                if (q1Var.P5.P3()) {
                                    TextPaint textPaint = org.telegram.ui.ActionBar.m6.Y2;
                                    int i43 = org.telegram.ui.ActionBar.m6.Tc;
                                    int i44 = (int) (f14 * 255.0f);
                                    textPaint.setColor(i0.a.o(q1Var.X1(i43), i44));
                                    org.telegram.ui.ActionBar.m6.Z2.setColor(i0.a.o(q1Var.X1(i43), i44));
                                } else {
                                    TextPaint textPaint2 = org.telegram.ui.ActionBar.m6.Y2;
                                    int i45 = org.telegram.ui.ActionBar.m6.Sc;
                                    int i46 = (int) (f14 * 255.0f);
                                    textPaint2.setColor(i0.a.o(q1Var.X1(i45), i46));
                                    org.telegram.ui.ActionBar.m6.Z2.setColor(i0.a.o(q1Var.X1(i45), i46));
                                }
                                if (q1Var.n2 != null) {
                                    i24 = i23;
                                    if (i18 != i24) {
                                        i18 += org.telegram.messenger.g0.L(f22);
                                        org.telegram.messenger.g0.L(f19);
                                    }
                                    if (i20 == 0) {
                                        i20 = i18 - org.telegram.messenger.g0.L(f19);
                                    }
                                    canvas2.save();
                                    float L14 = org.telegram.messenger.g0.L(f24) + i21 + (Math.abs(this.g) > 1 ? ((i22 - org.telegram.messenger.g0.L(20.0f)) - this.f) - this.g : 0);
                                    float L15 = i18 - org.telegram.messenger.g0.L(3.0f);
                                    if (x1Var2.s2) {
                                        f27 = f26;
                                        f38 = 0.0f;
                                    } else {
                                        f27 = f26;
                                        f38 = (-x1Var2.k0) + x1Var2.j0;
                                    }
                                    canvas2.translate(L14, L15 + f38);
                                    TextPaint paint = q1Var.n2.getPaint();
                                    int alpha3 = paint.getAlpha();
                                    paint.setAlpha((int) (alpha3 * f14));
                                    xh.f.f(canvas2, q1Var.n2);
                                    paint.setAlpha(alpha3);
                                    canvas2.restore();
                                    i18 += q1Var.n2.getLineBottom(r4.getLineCount() - 1);
                                } else {
                                    f27 = f26;
                                    i24 = i23;
                                }
                                if (this.i != null) {
                                    if (i18 != i24) {
                                        i18 += org.telegram.messenger.g0.L(f27);
                                    }
                                    if (i20 == 0) {
                                        i20 = i18 - org.telegram.messenger.g0.L(f19);
                                    }
                                    canvas2.save();
                                    canvas2.translate(org.telegram.messenger.g0.L(f24) + i21 + (Math.abs(this.e) > 1 ? ((i22 - org.telegram.messenger.g0.L(20.0f)) - this.d) - this.e : 0), (i18 - org.telegram.messenger.g0.L(3.0f)) + (!x1Var2.s2 ? (-x1Var2.k0) + x1Var2.j0 : 0.0f));
                                    TextPaint paint2 = this.i.getPaint();
                                    int alpha4 = paint2.getAlpha();
                                    paint2.setAlpha((int) (alpha4 * f14));
                                    xh.f.f(canvas2, this.i);
                                    paint2.setAlpha(alpha4);
                                    canvas2.restore();
                                    i18 += this.i.getLineBottom(r4.getLineCount() - 1);
                                }
                                if (q1Var.o2 != null) {
                                    if (i18 != i24) {
                                        i18 += org.telegram.messenger.g0.L(f27);
                                    }
                                    int i47 = i18;
                                    if (i20 == 0) {
                                        i20 = i47 - org.telegram.messenger.g0.L(f19);
                                    }
                                    q1Var.X1 = i47 - org.telegram.messenger.g0.L(3.0f);
                                    canvas2.save();
                                    canvas2.translate(org.telegram.messenger.g0.L(f24) + i21 + (Math.abs(q1Var.b2) > 1 ? ((i22 - org.telegram.messenger.g0.L(20.0f)) - q1Var.a2) - q1Var.b2 : 0), q1Var.X1 + (!x1Var2.s2 ? (-x1Var2.k0) + x1Var2.j0 : 0.0f));
                                    if (q1Var.x0 == -10 && q1Var.t4.h(canvas2)) {
                                        q1Var.invalidate();
                                    }
                                    q1Var.m1(canvas2, -2);
                                    l1 l1Var4 = q1Var.Ra;
                                    if (l1Var4 != null && l1Var4.k2() != null && q1Var.getDelegate().k2().z(q1Var.P5)) {
                                        q1Var.Ra.k2().Y(q1Var.P5.P3(), q1Var.o2, canvas2);
                                    }
                                    TextPaint paint3 = q1Var.o2.getPaint();
                                    if (z12 && (ijVar = q1Var.P5) != null && !ijVar.P3() && (zj0Var = q1Var.n8) != null) {
                                        paint3.linkColor = zj0Var.i();
                                    }
                                    int alpha5 = paint3.getAlpha();
                                    paint3.setAlpha((int) (alpha5 * f14));
                                    xh.f.f(canvas2, q1Var.o2);
                                    paint3.setAlpha(alpha5);
                                    int i48 = i24;
                                    StaticLayout staticLayout2 = q1Var.o2;
                                    imageReceiver2 = imageReceiver;
                                    z2Var = z2Var3;
                                    i26 = i22;
                                    i25 = i48;
                                    i27 = saveCount;
                                    f28 = f19;
                                    rectF2 = rectF5;
                                    x1Var = x1Var2;
                                    org.telegram.ui.Components.q5.drawAnimatedEmojis(canvas2, staticLayout2, q1Var.Ba, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, q1Var.I1(1, staticLayout2.getPaint().getColor()));
                                    canvas2.restore();
                                    paint3.linkColor = q1Var.X1(q1Var.P5.P3() ? org.telegram.ui.ActionBar.m6.Vc : org.telegram.ui.ActionBar.m6.Uc);
                                    i18 = q1Var.o2.getLineBottom(r2.getLineCount() - 1) + i47;
                                } else {
                                    i25 = i24;
                                    imageReceiver2 = imageReceiver;
                                    z2Var = z2Var3;
                                    i26 = i22;
                                    rectF2 = rectF5;
                                    i27 = saveCount;
                                    f28 = f19;
                                    x1Var = x1Var2;
                                }
                                int i49 = i20;
                                if (q1Var.N1 || !z16) {
                                    f29 = f10;
                                    z2Var2 = z2Var;
                                    f30 = f27;
                                } else {
                                    if (i18 != i25) {
                                        i18 += org.telegram.messenger.g0.L(f27);
                                    }
                                    int L16 = i26 - org.telegram.messenger.g0.L(17.0f);
                                    if (q1Var.w1) {
                                        z2Var2 = z2Var;
                                        z2Var2.C0(((i21 + i26) - z2Var.w()) - org.telegram.messenger.g0.L(f25));
                                        z2Var2.D0(i49);
                                    } else {
                                        z2Var2 = z2Var;
                                        z2Var2.C0(i21 + (q1Var.T1 ? -org.telegram.messenger.g0.L(6.3f) : org.telegram.messenger.g0.L(f24)));
                                        z2Var2.D0(i18);
                                    }
                                    if (x1Var != null && x1Var.t1) {
                                        if (!q1Var.w1 && q1Var.L1 != 1) {
                                            z2Var2.B0((int) org.telegram.messenger.g0.T1(x1Var.p1, L16, x1Var.L1));
                                        }
                                        z2Var2.C0(org.telegram.messenger.g0.T1(x1Var.r1, z2Var2.r(), x1Var.L1) - (z2Var2.w() / f27));
                                        z2Var2.D0(org.telegram.messenger.g0.T1(x1Var.s1, z2Var2.s(), x1Var.L1) - (z2Var2.v() / f27));
                                    } else if (!q1Var.w1 && (i30 = q1Var.L1) != 7 && i30 != 1) {
                                        z2Var2.B0(L16);
                                    }
                                    if (q1Var.w1 || !q1Var.x1) {
                                        f30 = f27;
                                    } else {
                                        int L17 = org.telegram.messenger.g0.L(48.0f);
                                        float f55 = L17;
                                        f30 = f27;
                                        q1Var.J3 = (int) com.google.android.recaptcha.internal.a.A(z2Var2.w(), f55, f30, z2Var2.x());
                                        int v12 = (int) (((z2Var2.v() - f55) / f30) + z2Var2.z());
                                        q1Var.K3 = v12;
                                        int i50 = q1Var.J3;
                                        radialProgress2.r(i50, v12, i50 + L17, L17 + v12);
                                    }
                                    if (q1Var.xb && MediaController.B().I(q1Var.P5) && (j4Var = MediaController.B().L0) != null && j4Var.d && canvas2.isHardwareAccelerated()) {
                                        q1Var.jb = true;
                                        q1Var.E9 = true;
                                    } else {
                                        l1 l1Var5 = q1Var.Ra;
                                        if (l1Var5 == null || l1Var5.N1() == null || !q1Var.Ra.N1().f(q1Var)) {
                                            if (f10 != f28) {
                                                f29 = f10;
                                                z2Var2.setAlpha(f29);
                                                if (q1Var.v()) {
                                                    q1Var.jb = z2Var2.g(canvas2);
                                                } else {
                                                    q1Var.jb = true;
                                                }
                                                if (q1Var.P5.t2()) {
                                                    ImageReceiver imageReceiver5 = imageReceiver2;
                                                    imageReceiver5.setAlpha(f29);
                                                    q1Var.N0(canvas2);
                                                    imageReceiver5.setAlpha(f28);
                                                }
                                                z2Var2.setAlpha(f28);
                                            } else {
                                                f29 = f10;
                                                if (q1Var.v()) {
                                                    q1Var.jb = z2Var2.g(canvas2);
                                                } else {
                                                    q1Var.jb = true;
                                                }
                                                if (q1Var.P5.t2()) {
                                                    q1Var.N0(canvas2);
                                                }
                                            }
                                        }
                                    }
                                    f29 = f10;
                                }
                                i28 = q1Var.L1;
                                if (i28 != 4 || i28 == 2) {
                                    q1Var.L3 = (int) (z2Var2.x() + org.telegram.messenger.g0.L(8.0f));
                                    int z19 = (int) (z2Var2.z() + org.telegram.messenger.g0.L(8.0f));
                                    q1Var.M3 = z19;
                                    RadialProgress2 radialProgress22 = q1Var.Q0;
                                    int i51 = q1Var.L3;
                                    radialProgress22.r(i51, z19, org.telegram.messenger.g0.L(24.0f) + i51, org.telegram.messenger.g0.L(24.0f) + q1Var.M3);
                                }
                                Paint Z1 = q1Var.Z1("paintChatTimeBackground");
                                if (this.h == null && z2Var2.H()) {
                                    int w10 = (int) (((z2Var2.w() + z2Var2.x()) - org.telegram.messenger.g0.L(8.0f)) - this.c);
                                    f31 = 8.0f;
                                    int v13 = (int) ((z2Var2.v() + z2Var2.z()) - org.telegram.messenger.g0.L(19.0f));
                                    f33 = 19.0f;
                                    f36 = 14.5f;
                                    f34 = f28;
                                    f35 = 1.5f;
                                    f32 = f30;
                                    rectF3 = rectF2;
                                    rectF3.set(w10 - org.telegram.messenger.g0.L(f22), v13 - org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(f22) + this.c + w10, org.telegram.messenger.g0.L(14.5f) + v13);
                                    int alpha6 = Z1.getAlpha();
                                    Z1.setAlpha((int) (alpha6 * q1Var.k4));
                                    org.telegram.ui.ActionBar.m6.J2.setAlpha((int) (q1Var.k4 * 255.0f));
                                    canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(f22), org.telegram.messenger.g0.L(f22), Z1);
                                    Z1.setAlpha(alpha6);
                                    canvas2.save();
                                    canvas2.translate(w10, v13);
                                    this.h.draw(canvas2);
                                    canvas2.restore();
                                    org.telegram.ui.ActionBar.m6.J2.setAlpha(qs.e4);
                                } else {
                                    f31 = 8.0f;
                                    f32 = f30;
                                    f33 = 19.0f;
                                    f34 = f28;
                                    f35 = 1.5f;
                                    rectF3 = rectF2;
                                    f36 = 14.5f;
                                }
                                if (q1Var.p2 != null && ((!q1Var.N1 || z2Var2.H()) && q1Var.z2 == 0)) {
                                    if (q1Var.S1 && !q1Var.T1 && q1Var.L1 != 8) {
                                        i29 = (int) (((z2Var2.w() + z2Var2.x()) - org.telegram.messenger.g0.L(f31)) - q1Var.Y1);
                                        i18 = (int) ((z2Var2.v() + z2Var2.z()) - org.telegram.messenger.g0.L(f33));
                                        rectF3.set(i29 - org.telegram.messenger.g0.L(f22), i18 - org.telegram.messenger.g0.L(f35), org.telegram.messenger.g0.L(f22) + q1Var.Y1 + i29, org.telegram.messenger.g0.L(f36) + i18);
                                        canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(f22), org.telegram.messenger.g0.L(f22), q1Var.Z1("paintChatTimeBackground"));
                                    } else if (q1Var.N1) {
                                        i29 = i21;
                                    } else {
                                        i29 = (int) (z2Var2.x() + org.telegram.messenger.g0.L(8.5f));
                                        i18 = (int) (z2Var2.z() + org.telegram.messenger.g0.L(f25));
                                        rectF3.set(i29 - org.telegram.messenger.g0.L(f22), i18 - org.telegram.messenger.g0.L(f35), org.telegram.messenger.g0.L(f22) + q1Var.Y1 + i29, org.telegram.messenger.g0.L(q1Var.L1 == 8 ? f36 : 16.5f) + i18);
                                        canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(f22), org.telegram.messenger.g0.L(f22), Z1);
                                    }
                                    canvas2.save();
                                    canvas2.translate(i29, i18);
                                    if (q1Var.T1) {
                                        if (q1Var.N1) {
                                            org.telegram.ui.ActionBar.m6.L2.setColor(q1Var.X1(org.telegram.ui.ActionBar.m6.xd));
                                        } else if (q1Var.P5.P3()) {
                                            org.telegram.ui.ActionBar.m6.L2.setColor(q1Var.X1(org.telegram.ui.ActionBar.m6.Tc));
                                        } else {
                                            org.telegram.ui.ActionBar.m6.L2.setColor(q1Var.X1(org.telegram.ui.ActionBar.m6.Sc));
                                        }
                                    }
                                    q1Var.p2.draw(canvas2);
                                    canvas2.restore();
                                }
                                q1Var.z1(canvas2, q1Var.n8.i());
                                int i52 = i21;
                                q1Var.O.b(canvas2, q1Var.Ta, i52, q1Var.Pb);
                                q1Var.P.b(canvas2, q1Var.Ta, i52, q1Var.Pb);
                                if (q1Var.t2) {
                                    if (q1Var.P5.P3()) {
                                        int X1 = q1Var.X1(org.telegram.ui.ActionBar.m6.Lb);
                                        if (q1Var.l8 == null) {
                                            if (q1Var.x2 == 27) {
                                                q1Var.l8 = q1Var.getContext().getResources().getDrawable(R.drawable.mini_call_join).mutate();
                                            } else {
                                                q1Var.l8 = q1Var.Y1("drawableMsgOutInstant");
                                            }
                                            Drawable drawable2 = q1Var.l8;
                                            q1Var.k8 = X1;
                                            drawable2.setColorFilter(new PorterDuffColorFilter(X1, PorterDuff.Mode.SRC_IN));
                                        }
                                        if (q1Var.k8 != X1) {
                                            Drawable drawable3 = q1Var.l8;
                                            q1Var.k8 = X1;
                                            drawable3.setColorFilter(new PorterDuffColorFilter(X1, PorterDuff.Mode.SRC_IN));
                                        }
                                        drawable = q1Var.l8;
                                        org.telegram.ui.ActionBar.m6.M2.setColor(X1);
                                        org.telegram.ui.ActionBar.m6.Y1.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, X1));
                                        a80 a80Var = this.s;
                                        if (a80Var != null) {
                                            a80Var.g(org.telegram.ui.ActionBar.m6.r1(0.1f, X1), org.telegram.ui.ActionBar.m6.r1(0.3f, X1), org.telegram.ui.ActionBar.m6.r1(0.3f, X1), org.telegram.ui.ActionBar.m6.r1(1.2f, X1));
                                        }
                                    } else {
                                        int X12 = q1Var.X1(org.telegram.ui.ActionBar.m6.yd);
                                        if (q1Var.n8 != null && !q1Var.P5.G4()) {
                                            X12 = q1Var.n8.i();
                                        }
                                        if (q1Var.l8 == null) {
                                            int i53 = q1Var.x2;
                                            if (i53 == 16) {
                                                q1Var.l8 = q1Var.getContext().getResources().getDrawable(R.drawable.mini_external_link).mutate();
                                            } else if (i53 == 27) {
                                                q1Var.l8 = q1Var.getContext().getResources().getDrawable(R.drawable.mini_call_join).mutate();
                                            } else {
                                                q1Var.l8 = q1Var.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                                            }
                                            Drawable drawable4 = q1Var.l8;
                                            q1Var.k8 = X12;
                                            drawable4.setColorFilter(new PorterDuffColorFilter(X12, PorterDuff.Mode.SRC_IN));
                                        }
                                        if (q1Var.k8 != X12) {
                                            Drawable drawable5 = q1Var.l8;
                                            q1Var.k8 = X12;
                                            drawable5.setColorFilter(new PorterDuffColorFilter(X12, PorterDuff.Mode.SRC_IN));
                                        }
                                        drawable = q1Var.l8;
                                        org.telegram.ui.ActionBar.m6.M2.setColor(X12);
                                        org.telegram.ui.ActionBar.m6.Y1.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, X12));
                                        a80 a80Var2 = this.s;
                                        if (a80Var2 != null) {
                                            a80Var2.g(org.telegram.ui.ActionBar.m6.r1(0.1f, X12), org.telegram.ui.ActionBar.m6.r1(0.3f, X12), org.telegram.ui.ActionBar.m6.r1(0.3f, X12), org.telegram.ui.ActionBar.m6.r1(1.2f, X12));
                                        }
                                    }
                                    Drawable drawable6 = drawable;
                                    if (z12) {
                                        int L18 = org.telegram.messenger.g0.L(14.0f) + i25 + i38;
                                        int alpha7 = org.telegram.ui.ActionBar.m6.M2.getAlpha();
                                        org.telegram.ui.ActionBar.m6.M2.setAlpha((int) (alpha7 * 0.18f));
                                        canvas2.drawRect(org.telegram.messenger.g0.L(f24) + i52, org.telegram.messenger.g0.L(f32) + r0, (i52 + i26) - org.telegram.messenger.g0.L(7.0f), Math.max(1, org.telegram.messenger.g0.L(0.66f)) + org.telegram.messenger.g0.L(f32) + r0, org.telegram.ui.ActionBar.m6.M2);
                                        org.telegram.ui.ActionBar.m6.M2.setAlpha(alpha7);
                                        int i54 = q1Var.x2;
                                        if (i54 == 27) {
                                            f47 = 20.0f;
                                        } else if (i54 == 0) {
                                            f47 = 15.0f;
                                        }
                                        float L19 = org.telegram.messenger.g0.L(f47) + q1Var.r2;
                                        float A = com.google.android.recaptcha.internal.a.A(i26, L19, f32, f23);
                                        int i55 = q1Var.x2;
                                        if (i55 == 0) {
                                            float L20 = org.telegram.messenger.g0.L(f34) + L18;
                                            int L21 = org.telegram.messenger.g0.L(9.0f);
                                            int L22 = org.telegram.messenger.g0.L(13.0f);
                                            if (drawable6 != null) {
                                                int i56 = (int) A;
                                                int i57 = (int) L20;
                                                drawable6.setBounds(i56, i57, L21 + i56, L22 + i57);
                                            }
                                            drawable6.setAlpha((int) (f29 * 255.0f));
                                            drawable6.draw(canvas2);
                                            L3 = org.telegram.messenger.g0.L(15.0f);
                                        } else if (i55 == 27) {
                                            int i58 = (int) A;
                                            int i59 = L18;
                                            drawable6.setBounds(i58, i59, drawable6.getIntrinsicWidth() + i58, drawable6.getIntrinsicHeight() + i59);
                                            drawable6.setAlpha((int) (f29 * 255.0f));
                                            drawable6.draw(canvas2);
                                            L3 = org.telegram.messenger.g0.L(20.0f);
                                        } else {
                                            if (i55 == 16) {
                                                A -= org.telegram.messenger.g0.L(11.0f);
                                                float L23 = L19 + A + org.telegram.messenger.g0.L(f22);
                                                float L24 = L18 - org.telegram.messenger.g0.L(2.0f);
                                                int L25 = org.telegram.messenger.g0.L(18.0f);
                                                int L26 = org.telegram.messenger.g0.L(18.0f);
                                                if (drawable6 != null) {
                                                    int i60 = (int) L23;
                                                    int i61 = (int) L24;
                                                    drawable6.setBounds(i60, i61, L25 + i60, L26 + i61);
                                                }
                                                drawable6.setAlpha((int) (f29 * 255.0f));
                                                drawable6.draw(canvas2);
                                            }
                                            if (q1Var.q2 != null) {
                                                canvas2.save();
                                                canvas2.translate(A - q1Var.s2, L18);
                                                xh.f.f(canvas2, q1Var.q2);
                                                canvas2.restore();
                                            }
                                        }
                                        A += L3;
                                        if (q1Var.q2 != null) {
                                        }
                                    } else {
                                        float f56 = f23;
                                        int L27 = org.telegram.messenger.g0.L(q1Var.P5.G4() ? -5.0f : f24) + i25 + i38;
                                        a80 a80Var3 = this.s;
                                        if (a80Var3 != null && !z10 && !a80Var3.c() && !this.s.d()) {
                                            this.s.a();
                                        }
                                        a80 a80Var4 = this.s;
                                        if (a80Var4 == null && z10) {
                                            a80 a80Var5 = new a80();
                                            this.s = a80Var5;
                                            a80Var5.x.setStrokeWidth(org.telegram.messenger.g0.L(1.25f));
                                            this.s.D = true;
                                        } else if (a80Var4 != null && z10 && (a80Var4.c() || this.s.d())) {
                                            a80 a80Var6 = this.s;
                                            a80Var6.b = -1L;
                                            a80Var6.c = -1L;
                                        }
                                        RectF rectF8 = rectF;
                                        rectF8.set(f56, L27, i52 + q1Var.C2, org.telegram.messenger.g0.L(36.0f) + L27);
                                        float a12 = q1Var.G2.a(0.02f);
                                        boolean z20 = a12 != f34;
                                        if (z20) {
                                            canvas2.save();
                                            canvas2.scale(a12, a12, rectF8.centerX(), rectF8.centerY());
                                        }
                                        q1Var.K2[0] = 0;
                                        q1Var.B0(0);
                                        q1Var.I2[0].setBounds(i52, L27, q1Var.C2 + i52, org.telegram.messenger.g0.L(36.0f) + L27);
                                        q1Var.I2[0].draw(canvas2);
                                        a80 a80Var7 = this.s;
                                        if (a80Var7 == null || a80Var7.c()) {
                                            f37 = f25;
                                        } else {
                                            this.s.e(rectF8);
                                            f37 = f25;
                                            this.s.k(f37);
                                            this.s.draw(canvas2);
                                            q1Var.invalidate();
                                        }
                                        canvas2.drawRoundRect(rectF8, org.telegram.messenger.g0.L(f37), org.telegram.messenger.g0.L(f37), org.telegram.ui.ActionBar.m6.Y1);
                                        int i62 = q1Var.x2;
                                        if (i62 == 0) {
                                            int L28 = ((q1Var.B2 + q1Var.A2) + i52) - org.telegram.messenger.g0.L(15.0f);
                                            int L29 = org.telegram.messenger.g0.L(11.5f) + L27;
                                            int L30 = org.telegram.messenger.g0.L(9.0f);
                                            int L31 = org.telegram.messenger.g0.L(13.0f);
                                            if (drawable6 != null) {
                                                drawable6.setBounds(L28, L29, L30 + L28, L31 + L29);
                                            }
                                            drawable6.setAlpha((int) (f29 * 255.0f));
                                            drawable6.draw(canvas2);
                                        } else if (i62 == 16) {
                                            if (this.u == null) {
                                                Paint paint4 = new Paint(1);
                                                this.u = paint4;
                                                paint4.setStyle(Paint.Style.STROKE);
                                                this.u.setStrokeCap(Paint.Cap.ROUND);
                                                this.u.setStrokeJoin(Paint.Join.ROUND);
                                            }
                                            this.u.setColor(org.telegram.ui.ActionBar.m6.M2.getColor());
                                            this.u.setStrokeWidth(org.telegram.messenger.g0.N(1.333f));
                                            Path path2 = this.t;
                                            if (path2 == null) {
                                                this.t = new Path();
                                            } else {
                                                path2.rewind();
                                            }
                                            this.t.moveTo(rectF8.right - org.telegram.messenger.g0.L(11.0f), rectF8.top + org.telegram.messenger.g0.L(f37));
                                            this.t.lineTo(rectF8.right - org.telegram.messenger.g0.L(f37), rectF8.top + org.telegram.messenger.g0.L(f37));
                                            this.t.lineTo(rectF8.right - org.telegram.messenger.g0.L(f37), rectF8.top + org.telegram.messenger.g0.L(11.0f));
                                            this.t.moveTo(rectF8.right - org.telegram.messenger.g0.N(11.66f), rectF8.top + org.telegram.messenger.g0.L(11.66f));
                                            this.t.lineTo(rectF8.right - org.telegram.messenger.g0.L(f37), rectF8.top + org.telegram.messenger.g0.L(f37));
                                            canvas2.drawPath(this.t, this.u);
                                        }
                                        if (q1Var.q2 != null) {
                                            canvas2.save();
                                            canvas2.translate(i52 + q1Var.A2, org.telegram.messenger.g0.L(10.5f) + L27);
                                            xh.f.f(canvas2, q1Var.q2);
                                            canvas2.restore();
                                        }
                                        if (z20) {
                                            canvas2.restore();
                                        }
                                    }
                                }
                                canvas2.restoreToCount(i27);
                            }
                            if (x1Var2 == null || !x1Var2.t1) {
                                f22 = 4.0f;
                            } else {
                                f22 = 4.0f;
                                i18 = (int) com.google.android.recaptcha.internal.a.z(f19, x1Var2.L1, (i18 != i17 ? org.telegram.messenger.g0.L(f20) : 0) + x1Var2.q1 + org.telegram.messenger.g0.L(6.0f), i18);
                            }
                            imageReceiver = imageReceiver4;
                            f23 = f21;
                            f24 = f16;
                            i21 = i15;
                            i22 = i16;
                            f25 = 6.0f;
                            f19 = 1.0f;
                        }
                        i23 = i17;
                        f26 = f20;
                        if (q1Var.P5.P3()) {
                        }
                        if (q1Var.n2 != null) {
                        }
                        if (this.i != null) {
                        }
                        if (q1Var.o2 != null) {
                        }
                        int i492 = i20;
                        if (q1Var.N1) {
                        }
                        f29 = f10;
                        z2Var2 = z2Var;
                        f30 = f27;
                        i28 = q1Var.L1;
                        if (i28 != 4) {
                        }
                        q1Var.L3 = (int) (z2Var2.x() + org.telegram.messenger.g0.L(8.0f));
                        int z192 = (int) (z2Var2.z() + org.telegram.messenger.g0.L(8.0f));
                        q1Var.M3 = z192;
                        RadialProgress2 radialProgress222 = q1Var.Q0;
                        int i512 = q1Var.L3;
                        radialProgress222.r(i512, z192, org.telegram.messenger.g0.L(24.0f) + i512, org.telegram.messenger.g0.L(24.0f) + q1Var.M3);
                        Paint Z12 = q1Var.Z1("paintChatTimeBackground");
                        if (this.h == null) {
                        }
                        f31 = 8.0f;
                        f32 = f30;
                        f33 = 19.0f;
                        f34 = f28;
                        f35 = 1.5f;
                        rectF3 = rectF2;
                        f36 = 14.5f;
                        if (q1Var.p2 != null) {
                            if (q1Var.S1) {
                            }
                            if (q1Var.N1) {
                            }
                            canvas2.save();
                            canvas2.translate(i29, i18);
                            if (q1Var.T1) {
                            }
                            q1Var.p2.draw(canvas2);
                            canvas2.restore();
                        }
                        q1Var.z1(canvas2, q1Var.n8.i());
                        int i522 = i21;
                        q1Var.O.b(canvas2, q1Var.Ta, i522, q1Var.Pb);
                        q1Var.P.b(canvas2, q1Var.Ta, i522, q1Var.Pb);
                        if (q1Var.t2) {
                        }
                        canvas2.restoreToCount(i27);
                    }
                    i10 = q1Var.p0 - org.telegram.messenger.g0.L(2.0f);
                    i12 = q1Var.o0;
                    L2 = org.telegram.messenger.g0.L(1.0f);
                }
                i13 = L2 + i12;
            }
            i11 = i13;
            f12 = 1.0f;
            f13 = i11;
            i14 = (int) (backgroundDrawableRight - f13);
            int i372 = q1Var.V1;
            if (x1Var2 == null) {
            }
            i15 = i11;
            int i382 = i372;
            if (q1Var.n8 == null) {
            }
            org.telegram.ui.ActionBar.m6.Y2.setColor(q1Var.n8.a(q1Var.P5, q1Var.ia, q1Var.ja, q1Var.Pb, 3));
            zj0 zj0Var22 = q1Var.n8;
            int i392 = q1Var.x2;
            zj0Var22.o((i392 != 23 || i392 == 24 || i392 == 28) ? 0.5f : f12);
            if (q1Var.P5.r4()) {
            }
            if (!z14) {
            }
            if (z14) {
            }
            l1 l1Var6 = q1Var.Ra;
            if (l1Var6 == null) {
            }
            if (q1Var.T1) {
            }
            f14 = f10;
            i16 = i14;
            i17 = i10;
            z10 = z9;
            f15 = f13;
            f16 = f11;
            rectF = rectF4;
            z11 = true;
            z12 = false;
            if (q1Var.N1) {
            }
            f17 = 1.0f;
            f18 = 2.0f;
            i18 = i17;
            if (q1Var.f2 == null) {
            }
            if (!q1Var.S1) {
            }
            int C2 = org.telegram.messenger.k5.C(4.0f, q1Var.P5.W5(x1Var2), i17);
            i18 = org.telegram.messenger.k5.C(4.0f, q1Var.P5.W5(x1Var2), i18);
            i17 = C2;
            if (q1Var.N1) {
            }
            f22 = 4.0f;
            imageReceiver = imageReceiver4;
            f23 = f21;
            f24 = f16;
            i21 = i15;
            i22 = i16;
            f25 = 6.0f;
            i23 = i17;
            f26 = f20;
            if (q1Var.P5.P3()) {
            }
            if (q1Var.n2 != null) {
            }
            if (this.i != null) {
            }
            if (q1Var.o2 != null) {
            }
            int i4922 = i20;
            if (q1Var.N1) {
            }
            f29 = f10;
            z2Var2 = z2Var;
            f30 = f27;
            i28 = q1Var.L1;
            if (i28 != 4) {
            }
            q1Var.L3 = (int) (z2Var2.x() + org.telegram.messenger.g0.L(8.0f));
            int z1922 = (int) (z2Var2.z() + org.telegram.messenger.g0.L(8.0f));
            q1Var.M3 = z1922;
            RadialProgress2 radialProgress2222 = q1Var.Q0;
            int i5122 = q1Var.L3;
            radialProgress2222.r(i5122, z1922, org.telegram.messenger.g0.L(24.0f) + i5122, org.telegram.messenger.g0.L(24.0f) + q1Var.M3);
            Paint Z122 = q1Var.Z1("paintChatTimeBackground");
            if (this.h == null) {
            }
            f31 = 8.0f;
            f32 = f30;
            f33 = 19.0f;
            f34 = f28;
            f35 = 1.5f;
            rectF3 = rectF2;
            f36 = 14.5f;
            if (q1Var.p2 != null) {
            }
            q1Var.z1(canvas2, q1Var.n8.i());
            int i5222 = i21;
            q1Var.O.b(canvas2, q1Var.Ta, i5222, q1Var.Pb);
            q1Var.P.b(canvas2, q1Var.Ta, i5222, q1Var.Pb);
            if (q1Var.t2) {
            }
            canvas2.restoreToCount(i27);
        }
    }
}
