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
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.t80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public jb0 q;
    public int r;
    public t80 s;
    public Path t;
    public Paint u;
    public boolean v;
    public dc w;
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
    public final void a(Canvas canvas, float f7) {
        float f10;
        float f11;
        int L;
        int extraTextX;
        int i10;
        int i11;
        int i12;
        int i13;
        int L2;
        int i14;
        float f12;
        int i15;
        int i16;
        boolean z10;
        float f13;
        int i17;
        int i18;
        boolean z11;
        float f14;
        float f15;
        RectF rectF;
        boolean z12;
        boolean z13;
        float f16;
        float f17;
        int i19;
        float f18;
        float f19;
        int i20;
        float f20;
        int i21;
        float f21;
        ImageReceiver imageReceiver;
        float f22;
        float f23;
        int i22;
        int i23;
        float f24;
        int i24;
        float f25;
        float f26;
        int i25;
        int i26;
        ImageReceiver imageReceiver2;
        ag.c2 c2Var;
        int i27;
        RectF rectF2;
        int i28;
        float f27;
        x1 x1Var;
        float f28;
        ag.c2 c2Var2;
        float f29;
        int i29;
        float f30;
        float f31;
        float f32;
        float f33;
        float f34;
        RectF rectF3;
        float f35;
        Drawable drawable;
        float f36;
        int L3;
        int i30;
        int i31;
        org.telegram.ui.k4 k4Var;
        jj jjVar;
        dl0 dl0Var;
        float f37;
        ImageReceiver imageReceiver3;
        float f38;
        float f39;
        int i32;
        float f40;
        float f41;
        float b10;
        boolean z14;
        float f42;
        int i33;
        int i34;
        org.telegram.ui.k4 k4Var2;
        float f43;
        float f44;
        float f45;
        int i35;
        int i36;
        int i37;
        Canvas canvas2 = canvas;
        q1 q1Var = this.a;
        RadialProgress2 radialProgress2 = q1Var.P0;
        ImageReceiver imageReceiver4 = q1Var.U0;
        RectF rectF4 = q1Var.K2;
        RectF rectF5 = q1Var.a4;
        x1 x1Var2 = q1Var.gb;
        ag.c2 c2Var3 = q1Var.T0;
        if (q1Var.O5.r4() || q1Var.O5.G4() || q1Var.P1 || q1Var.R1 || q1Var.S1) {
            int saveCount = canvas2.getSaveCount();
            float f46 = 0.0f;
            float backgroundDrawableRight = ((q1Var.getBackgroundDrawableRight() + (x1Var2 != null ? x1Var2.i0 : 0.0f)) - org.telegram.messenger.i0.L(10 + ((!q1Var.O5.P3() || q1Var.A6 || q1Var.J) ? 0 : 6))) - q1Var.getExtraTextX();
            if (q1Var.R1) {
                f10 = 10.0f;
                i11 = org.telegram.messenger.i0.L(14.0f) + q1Var.Sa;
                i14 = q1Var.o0 - org.telegram.messenger.i0.L(10.0f);
            } else {
                f10 = 10.0f;
                if (q1Var.S1) {
                    i11 = org.telegram.messenger.i0.L(14.0f) + q1Var.Sa;
                    i13 = q1Var.o0;
                    L2 = org.telegram.messenger.i0.L(1.0f);
                } else {
                    if (!q1Var.O5.r4()) {
                        if (q1Var.O5.P3()) {
                            i10 = q1Var.getExtraTextX() + org.telegram.messenger.i0.L(12.0f) + q1Var.L6;
                            f11 = 1.0f;
                            if (q1Var.O5.D == 19) {
                                i10 -= Math.max(0, (org.telegram.messenger.i0.L(14.0f) + (Math.max(q1Var.V7, q1Var.X7) + i10)) - org.telegram.messenger.i0.q.x);
                            }
                        } else {
                            f11 = 1.0f;
                            if (q1Var.A6) {
                                L = org.telegram.messenger.i0.L(12.0f) + q1Var.L6;
                                extraTextX = q1Var.getExtraTextX();
                            } else {
                                L = org.telegram.messenger.i0.L(q1Var.J ? 12.0f : 18.0f) + q1Var.L6;
                                extraTextX = q1Var.getExtraTextX();
                            }
                            i10 = extraTextX + L;
                        }
                        int L4 = ((int) (i10 + x1Var2.h0)) - org.telegram.messenger.i0.L(1.33f);
                        i11 = q1Var.p0;
                        if (x1Var2.s2) {
                            i11 = org.telegram.messenger.i0.W1(x1Var2.L1, x1Var2.r2, i11);
                        }
                        i12 = L4;
                        f12 = i12;
                        i15 = (int) (backgroundDrawableRight - f12);
                        int i38 = q1Var.U1;
                        if (x1Var2 == null && x1Var2.J1) {
                            i16 = i12;
                            i38 = org.telegram.messenger.i0.W1(x1Var2.L1, x1Var2.I1, i38);
                        } else {
                            i16 = i12;
                        }
                        int i39 = i38;
                        if (q1Var.m8 == null) {
                            q1Var.m8 = new dl0(q1Var);
                        }
                        org.telegram.ui.ActionBar.t6.Y2.setColor(q1Var.m8.a(q1Var.O5, q1Var.ha, q1Var.ia, q1Var.Ob, 3));
                        dl0 dl0Var2 = q1Var.m8;
                        int i40 = q1Var.w2;
                        dl0Var2.o((i40 != 23 || i40 == 24 || i40 == 28) ? 0.5f : f11);
                        boolean z15 = (q1Var.O5.r4() || q1Var.v1) ? false : true;
                        boolean z16 = !(!z15 || !q1Var.s2 || (i37 = q1Var.w2) == 26 || i37 == 9 || i37 == 2 || i37 == 13 || i37 == 11 || i37 == 25 || i37 == 1 || i37 == 29 || i37 == 18 || i37 == 22) || (q1Var.w2 == 6 && this.j != 0);
                        boolean z17 = z15 && (!q1Var.s2 || (i36 = q1Var.w2) == 9 || i36 == 2 || i36 == 11 || i36 == 25 || i36 == 13 || i36 == 1 || i36 == 29 || i36 == 18 || i36 == 22 || i36 == 32 || q1Var.v1 || i36 == 26);
                        l1 l1Var = q1Var.Qa;
                        z10 = l1Var == null && l1Var.k1(q1Var, 2);
                        if (!q1Var.S1 || q1Var.O5.v3() || q1Var.O5.G4()) {
                            f13 = f7;
                            i17 = i15;
                            i18 = i11;
                            z11 = z10;
                            f14 = f12;
                            f15 = f10;
                            rectF = rectF4;
                            z12 = true;
                            z13 = false;
                        } else {
                            if (this.w == null) {
                                f43 = 2.0f;
                                this.w = new dc(q1Var, 2.0f, 2.0f);
                            } else {
                                f43 = 2.0f;
                            }
                            canvas2.save();
                            float f47 = f43;
                            float a2 = this.w.a(0.01f);
                            canvas2.scale(a2, a2, (i15 / f47) + f12, ((i39 + (q1Var.s2 ? org.telegram.messenger.i0.L(42.0f) : 0)) / f47) + i11);
                            RectF rectF6 = org.telegram.messenger.i0.P;
                            rectF6.set(f12, i11 - org.telegram.messenger.i0.L(6.0f), i16 + i15, i11 + i39 + (q1Var.s2 ? org.telegram.messenger.i0.L(42.0f) : 0));
                            q1Var.m8.q(z10);
                            float floor = (float) Math.floor(tz.Y0 / (q1Var.O5.r4() ? f47 : 3.0f));
                            dl0 dl0Var3 = q1Var.m8;
                            if (z16) {
                                float f48 = f11 - (x1Var2.t1 ? q1Var.v1 ? x1Var2.L1 : f11 - x1Var2.L1 : q1Var.v1 ? f11 : 0.0f);
                                float v = c2Var3.v() + org.telegram.messenger.i0.L(18.0f);
                                StaticLayout staticLayout = q1Var.e2;
                                if (staticLayout != null) {
                                    f44 = floor;
                                    i35 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                                } else {
                                    f44 = floor;
                                    i35 = 0;
                                }
                                f45 = (v + i35) * f48;
                            } else {
                                f44 = floor;
                                f45 = 0.0f;
                            }
                            dl0Var3.k(f45);
                            i18 = i11;
                            z11 = z10;
                            f14 = f12;
                            f15 = f10;
                            i17 = i15;
                            float f49 = f44;
                            rectF = rectF4;
                            dl0Var3.c(f49, f44, f44, f7, canvas, rectF6);
                            int h = q1Var.m8.h();
                            y yVar = this.x;
                            if (yVar == null) {
                                q1Var.Pa = h;
                                y a02 = org.telegram.ui.ActionBar.t6.a0(h, 0, 0);
                                this.x = a02;
                                a02.setCallback(q1Var);
                                org.telegram.ui.ActionBar.t6.F1(this.x, 3.0f, 6.0f, 6.0f, 3.0f);
                                this.x.setCallback(q1Var);
                            } else if (q1Var.Pa != h) {
                                q1Var.Pa = h;
                                org.telegram.ui.ActionBar.t6.H1(yVar, h, true);
                                this.x.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                                this.x.draw(canvas);
                                q1Var.m8.f(canvas, rectF6, f7);
                                z12 = true;
                                q1Var.m8.g(f49, f49, f49, f7, canvas, rectF6);
                                f13 = f7;
                                canvas2 = canvas;
                                z13 = true;
                            }
                            this.x.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                            this.x.draw(canvas);
                            q1Var.m8.f(canvas, rectF6, f7);
                            z12 = true;
                            q1Var.m8.g(f49, f49, f49, f7, canvas, rectF6);
                            f13 = f7;
                            canvas2 = canvas;
                            z13 = true;
                        }
                        if (q1Var.M1 || !z15) {
                            f16 = 1.0f;
                            f17 = 2.0f;
                            i19 = i18;
                        } else {
                            int L5 = i17 - org.telegram.messenger.i0.L(17.0f);
                            if (q1Var.v1) {
                                c2Var3.C0(((i16 + i17) - c2Var3.w()) - org.telegram.messenger.i0.L(6.0f));
                                c2Var3.D0(0);
                            } else {
                                c2Var3.C0(i16 + (q1Var.S1 ? -org.telegram.messenger.i0.L(6.3f) : org.telegram.messenger.i0.L(f15)));
                                c2Var3.D0(i18);
                            }
                            if (x1Var2 == null || !x1Var2.t1) {
                                f17 = 2.0f;
                                if (!q1Var.v1 && (i34 = q1Var.K1) != 7 && i34 != z12) {
                                    c2Var3.B0(L5);
                                }
                            } else {
                                if (!q1Var.v1 && q1Var.K1 != z12) {
                                    c2Var3.B0((int) org.telegram.messenger.i0.T1(x1Var2.p1, L5, x1Var2.L1));
                                }
                                f17 = 2.0f;
                                c2Var3.C0(org.telegram.messenger.i0.T1(x1Var2.r1, c2Var3.r(), x1Var2.L1) - (c2Var3.w() / 2.0f));
                                c2Var3.D0(org.telegram.messenger.i0.T1(x1Var2.s1, c2Var3.s(), x1Var2.L1) - (c2Var3.v() / 2.0f));
                            }
                            if (!q1Var.v1 && q1Var.w1) {
                                int L6 = org.telegram.messenger.i0.L(48.0f);
                                float f50 = L6;
                                q1Var.I3 = (int) c3.i0.B(c2Var3.w(), f50, f17, c2Var3.x());
                                int v10 = (int) (((c2Var3.v() - f50) / f17) + c2Var3.z());
                                q1Var.J3 = v10;
                                int i41 = q1Var.I3;
                                radialProgress2.r(i41, v10, i41 + L6, L6 + v10);
                            }
                            if (q1Var.wb && MediaController.B().I(q1Var.O5) && (k4Var2 = MediaController.B().L0) != null && k4Var2.d && canvas2.isHardwareAccelerated()) {
                                q1Var.ib = z12;
                                q1Var.D9 = z12;
                            } else {
                                l1 l1Var2 = q1Var.Qa;
                                if (l1Var2 == null || l1Var2.H1() == null || !q1Var.Qa.H1().f(q1Var)) {
                                    f16 = 1.0f;
                                    if (f13 != 1.0f) {
                                        c2Var3.setAlpha(f13);
                                        if (q1Var.x()) {
                                            q1Var.ib = c2Var3.g(canvas2);
                                        } else {
                                            q1Var.ib = z12;
                                        }
                                        if (q1Var.O5.t2()) {
                                            imageReceiver4.setAlpha(f13);
                                            q1Var.L0(canvas2);
                                            imageReceiver4.setAlpha(1.0f);
                                        }
                                        c2Var3.setAlpha(1.0f);
                                    } else {
                                        if (q1Var.x()) {
                                            q1Var.ib = c2Var3.g(canvas2);
                                        } else {
                                            q1Var.ib = z12;
                                        }
                                        if (q1Var.O5.t2()) {
                                            q1Var.L0(canvas2);
                                        }
                                    }
                                    i19 = (int) (c2Var3.v() + org.telegram.messenger.i0.L(6.0f) + i18);
                                }
                            }
                            f16 = 1.0f;
                            i19 = (int) (c2Var3.v() + org.telegram.messenger.i0.L(6.0f) + i18);
                        }
                        if (q1Var.e2 == null) {
                            if (q1Var.f2 != null) {
                                i19 += org.telegram.messenger.i0.L(f16);
                            }
                            int L7 = i19 - org.telegram.messenger.i0.L(f16);
                            f19 = f17;
                            int alpha = org.telegram.ui.ActionBar.t6.Y2.getAlpha();
                            if (f13 != f16) {
                                z14 = z12;
                                f18 = f16;
                                org.telegram.ui.ActionBar.t6.Y2.setAlpha((int) (alpha * f13));
                            } else {
                                f18 = f16;
                                z14 = z12;
                            }
                            canvas2.save();
                            if (Math.abs(q1Var.b2) > f18) {
                                f42 = ((i17 - org.telegram.messenger.i0.L(q1Var.S1 ? 0.0f : 20.0f)) - q1Var.d2) - q1Var.b2;
                            } else {
                                f42 = 0.0f;
                            }
                            f20 = f14;
                            float L8 = f42 + (q1Var.S1 ? 0 : org.telegram.messenger.i0.L(f15)) + f20;
                            canvas2.translate(L8, i19 - org.telegram.messenger.i0.L(f18));
                            nh.i.f(canvas2, q1Var.e2);
                            canvas2.restore();
                            if (q1Var.f2 != null) {
                                float L9 = L8 + q1Var.c2 + org.telegram.messenger.i0.L(12.0f);
                                q1Var.i2 = L9;
                                q1Var.j2 = i19;
                                i33 = i19;
                                i21 = L7;
                                rectF5.set(L9 - org.telegram.messenger.i0.L(6.0f), q1Var.j2 - org.telegram.messenger.i0.L(f19), q1Var.i2 + q1Var.g2 + org.telegram.messenger.i0.L(6.0f), q1Var.j2 + q1Var.h2 + org.telegram.messenger.i0.L(f19));
                                if (q1Var.l2 == null) {
                                    q1Var.l2 = new dc(q1Var);
                                }
                                float a10 = q1Var.l2.a(0.1f);
                                boolean z18 = a10 != f18 ? z14 ? 1 : 0 : false;
                                if (z18) {
                                    canvas2.save();
                                    canvas2.scale(a10, a10, rectF5.centerX(), rectF5.centerY());
                                }
                                org.telegram.ui.ActionBar.t6.M2.setColor(org.telegram.ui.ActionBar.t6.Y2.getColor());
                                int alpha2 = org.telegram.ui.ActionBar.t6.M2.getAlpha();
                                org.telegram.ui.ActionBar.t6.M2.setAlpha((int) (alpha * 0.11f));
                                boolean z19 = z18;
                                canvas2.drawRoundRect(rectF5, rectF5.height(), rectF5.height(), org.telegram.ui.ActionBar.t6.M2);
                                org.telegram.ui.ActionBar.t6.M2.setAlpha(alpha2);
                                org.telegram.ui.ActionBar.t6.c3.setColor(org.telegram.ui.ActionBar.t6.Y2.getColor());
                                org.telegram.ui.ActionBar.t6.c3.setAlpha(org.telegram.ui.ActionBar.t6.Y2.getAlpha());
                                canvas2.save();
                                canvas2.translate(q1Var.i2, q1Var.j2);
                                q1Var.f2.draw(canvas2);
                                canvas2.restore();
                                if (z19) {
                                    canvas2.restore();
                                }
                            } else {
                                i33 = i19;
                                i21 = L7;
                            }
                            i19 = q1Var.e2.getLineBottom(r2.getLineCount() - 1) + i33;
                            org.telegram.ui.ActionBar.t6.Y2.setAlpha(alpha);
                            i20 = z14;
                        } else {
                            f18 = f16;
                            f19 = f17;
                            i20 = z12;
                            f20 = f14;
                            i21 = 0;
                        }
                        if ((!q1Var.R1 || q1Var.S1) && q1Var.O5.U5(x1Var2) != 0) {
                            int C = org.telegram.messenger.m5.C(4.0f, q1Var.O5.U5(x1Var2), i18);
                            i19 = org.telegram.messenger.m5.C(4.0f, q1Var.O5.U5(x1Var2), i19);
                            i18 = C;
                        }
                        if (q1Var.M1 || !z16) {
                            f21 = 4.0f;
                            imageReceiver = imageReceiver4;
                            f22 = f20;
                            f23 = f15;
                            i22 = i16;
                            i23 = i17;
                            f24 = 6.0f;
                        } else {
                            if (!q1Var.v1) {
                                f21 = 4.0f;
                                float f51 = (x1Var2 == null || !x1Var2.t1) ? 1.0f : x1Var2.L1;
                                if (i19 != i18) {
                                    i19 = (int) ((org.telegram.messenger.i0.L(f19) * f51) + i19);
                                }
                                int L10 = i17 - org.telegram.messenger.i0.L(17.0f);
                                if (q1Var.v1 || q1Var.w2 != 17) {
                                    imageReceiver3 = imageReceiver4;
                                    f22 = f20;
                                    f23 = f15;
                                    i22 = i16;
                                    f38 = f51;
                                    i24 = i18;
                                    f39 = 0.0f;
                                } else {
                                    Rect rect = org.telegram.messenger.i0.Q;
                                    int L11 = org.telegram.messenger.i0.L(f15) + i16;
                                    float f52 = f15;
                                    i24 = i18;
                                    f22 = f20;
                                    int i42 = i16;
                                    f38 = f51;
                                    f23 = f52;
                                    rect.set(L11, i19, org.telegram.messenger.m5.C(f52, i42, L10), ((int) c2Var3.v()) + i19);
                                    RectF rectF7 = org.telegram.messenger.i0.P;
                                    rectF7.set(rect);
                                    if (this.b == null) {
                                        TLRPC.PhotoSize photoSize = q1Var.c4;
                                        if (photoSize == null || photoSize.gradientTopColor == 0 || photoSize.gradientBottomColor == 0) {
                                            imageReceiver3 = imageReceiver4;
                                            i22 = i42;
                                            if (c2Var3.n() != null) {
                                                int[] b11 = w7.l8.b(c2Var3.n(), org.telegram.ui.ActionBar.t6.j1());
                                                this.b = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b11);
                                                TLRPC.PhotoSize photoSize2 = q1Var.c4;
                                                if (photoSize2 != null) {
                                                    photoSize2.gradientTopColor = b11[0];
                                                    photoSize2.gradientBottomColor = b11[i20];
                                                }
                                            }
                                        } else {
                                            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                                            i22 = i42;
                                            TLRPC.PhotoSize photoSize3 = q1Var.c4;
                                            imageReceiver3 = imageReceiver4;
                                            this.b = new GradientDrawable(orientation, new int[]{photoSize3.gradientTopColor, photoSize3.gradientBottomColor});
                                        }
                                    } else {
                                        imageReceiver3 = imageReceiver4;
                                        i22 = i42;
                                    }
                                    if (this.b != null) {
                                        canvas2.save();
                                        Path path = q1Var.G9;
                                        if (path != null) {
                                            path.rewind();
                                        } else {
                                            q1Var.G9 = new Path();
                                        }
                                        q1Var.G9.addRoundRect(rectF7, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), Path.Direction.CW);
                                        canvas2.clipPath(q1Var.G9);
                                        this.b.setBounds(rect);
                                        this.b.draw(canvas2);
                                        canvas2.restore();
                                    }
                                    f39 = (((q1Var.B2 - c2Var3.w()) - org.telegram.messenger.i0.L(f23)) - (x1Var2 == null ? 0.0f : q1Var.O5.P3() ? x1Var2.h0 : -x1Var2.i0)) / f19;
                                }
                                if (q1Var.y2 != 0) {
                                    float L12 = org.telegram.messenger.i0.L(f23) + i22;
                                    c2Var3.C0(((this.r - c2Var3.w()) / f19) + f39 + L12);
                                    c2Var3.D0(i19);
                                    rectF5.set(L12, c2Var3.z(), r5 + this.r, c2Var3.A());
                                    org.telegram.ui.ActionBar.t6.M2.setColor(i0.b.o(q1Var.y2, (int) (f13 * 255.0f)));
                                    canvas2.drawRoundRect(rectF5, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.M2);
                                } else {
                                    c2Var3.C0(f39 + f22 + org.telegram.messenger.i0.L(f23));
                                    c2Var3.D0(i19);
                                }
                                if (q1Var.w2 != 17) {
                                    if (x1Var2 != null && x1Var2.t1) {
                                        if (!q1Var.v1 && q1Var.K1 != i20) {
                                            c2Var3.B0((int) org.telegram.messenger.i0.T1(x1Var2.p1, L10, x1Var2.L1));
                                        }
                                        c2Var3.C0(org.telegram.messenger.i0.T1(x1Var2.r1, c2Var3.r(), x1Var2.L1) - (c2Var3.w() / f19));
                                        c2Var3.D0(org.telegram.messenger.i0.T1(x1Var2.s1, c2Var3.s(), x1Var2.L1) - (c2Var3.v() / f19));
                                    } else if (!q1Var.v1 && q1Var.K1 != 1) {
                                        c2Var3.B0(L10);
                                    }
                                }
                                if (this.j != 0) {
                                    rectF5.set(c2Var3.x(), c2Var3.z(), c2Var3.y(), c2Var3.A());
                                    if (this.l == 0) {
                                        org.telegram.ui.ActionBar.t6.M2.setShader(null);
                                        org.telegram.ui.ActionBar.t6.M2.setColor(this.j);
                                        if (f13 != 1.0f) {
                                            org.telegram.ui.ActionBar.t6.M2.setAlpha((int) (f13 * 255.0f));
                                        }
                                    } else if (this.m == 0) {
                                        if (this.p == null) {
                                            Rect e = org.telegram.ui.Components.f9.e(org.telegram.ui.Components.f9.d(org.telegram.messenger.i0.s1(this.o, false)), (int) rectF5.width(), (int) rectF5.height());
                                            this.p = new LinearGradient(e.left, e.top, e.right, e.bottom, new int[]{this.j, this.l}, (float[]) null, Shader.TileMode.CLAMP);
                                        }
                                        org.telegram.ui.ActionBar.t6.M2.setShader(this.p);
                                        if (f13 != 1.0f) {
                                            org.telegram.ui.ActionBar.t6.M2.setAlpha((int) (f13 * 255.0f));
                                        }
                                    } else if (this.q == null) {
                                        jb0 jb0Var = new jb0(true, this.j, this.l, this.m, this.n);
                                        this.q = jb0Var;
                                        if (this.k < 0.0f) {
                                            c2Var3.m0(jb0Var.d());
                                        }
                                        if (!c2Var3.K()) {
                                            this.q.v(org.telegram.messenger.i0.L(4.0f));
                                        }
                                    }
                                    jb0 jb0Var2 = this.q;
                                    if (jb0Var2 != null) {
                                        jb0Var2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                                        this.q.draw(canvas2);
                                        i32 = i19;
                                        f40 = f38;
                                        i23 = i17;
                                    } else if (q1Var.y2 != 0) {
                                        i32 = i19;
                                        f40 = f38;
                                        i23 = i17;
                                        canvas2.drawRect(c2Var3.x(), c2Var3.z(), c2Var3.y(), c2Var3.A(), org.telegram.ui.ActionBar.t6.M2);
                                    } else {
                                        i32 = i19;
                                        f40 = f38;
                                        i23 = i17;
                                        canvas2.drawRoundRect(rectF5, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.M2);
                                    }
                                    org.telegram.ui.ActionBar.t6.M2.setShader(null);
                                    org.telegram.ui.ActionBar.t6.M2.setAlpha(zs.e4);
                                } else {
                                    i32 = i19;
                                    f40 = f38;
                                    i23 = i17;
                                }
                                if (q1Var.M1 && q1Var.s2 && q1Var.w2 != 9) {
                                    if (q1Var.w1) {
                                        int L13 = org.telegram.messenger.i0.L(48.0f);
                                        float f53 = L13;
                                        f25 = 2.0f;
                                        q1Var.I3 = (int) c3.i0.B(c2Var3.w(), f53, 2.0f, c2Var3.x());
                                        int v11 = (int) (((c2Var3.v() - f53) / 2.0f) + c2Var3.z());
                                        q1Var.J3 = v11;
                                        int i43 = q1Var.I3;
                                        radialProgress2.r(i43, v11, i43 + L13, L13 + v11);
                                    } else {
                                        f25 = 2.0f;
                                    }
                                    l1 l1Var3 = q1Var.Qa;
                                    if (l1Var3 == null || l1Var3.H1() == null || !q1Var.Qa.H1().f(q1Var)) {
                                        f41 = 1.0f;
                                        if (f13 != 1.0f) {
                                            c2Var3.setAlpha(f13);
                                            if (q1Var.x()) {
                                                q1Var.ib = c2Var3.g(canvas2);
                                            } else {
                                                q1Var.ib = true;
                                            }
                                            imageReceiver = imageReceiver3;
                                            if (q1Var.O5.t2()) {
                                                imageReceiver.setAlpha(f13);
                                                q1Var.L0(canvas2);
                                                imageReceiver.setAlpha(1.0f);
                                            }
                                            c2Var3.setAlpha(1.0f);
                                        } else {
                                            imageReceiver = imageReceiver3;
                                            if (q1Var.x()) {
                                                q1Var.ib = c2Var3.g(canvas2);
                                            } else {
                                                q1Var.ib = true;
                                            }
                                            if (q1Var.O5.t2()) {
                                                q1Var.L0(canvas2);
                                            }
                                        }
                                    } else {
                                        imageReceiver = imageReceiver3;
                                        f41 = 1.0f;
                                    }
                                } else {
                                    imageReceiver = imageReceiver3;
                                    f41 = 1.0f;
                                    f25 = 2.0f;
                                }
                                if (x1Var2 == null || !x1Var2.h) {
                                    f18 = f41;
                                    f24 = 6.0f;
                                    b10 = z20.b(c2Var3.v(), org.telegram.messenger.i0.L(6.0f), f40, i32);
                                } else {
                                    f18 = f41;
                                    f24 = 6.0f;
                                    b10 = z20.b(x1Var2.q0, org.telegram.messenger.i0.L(6.0f), f40, i32);
                                }
                                i19 = (int) b10;
                                if (q1Var.O5.P3()) {
                                    TextPaint textPaint = org.telegram.ui.ActionBar.t6.Y2;
                                    int i44 = org.telegram.ui.ActionBar.t6.Tc;
                                    int i45 = (int) (f13 * 255.0f);
                                    textPaint.setColor(i0.b.o(q1Var.V1(i44), i45));
                                    org.telegram.ui.ActionBar.t6.Z2.setColor(i0.b.o(q1Var.V1(i44), i45));
                                } else {
                                    TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.Y2;
                                    int i46 = org.telegram.ui.ActionBar.t6.Sc;
                                    int i47 = (int) (f13 * 255.0f);
                                    textPaint2.setColor(i0.b.o(q1Var.V1(i46), i47));
                                    org.telegram.ui.ActionBar.t6.Z2.setColor(i0.b.o(q1Var.V1(i46), i47));
                                }
                                if (q1Var.m2 != null) {
                                    i25 = i24;
                                    if (i19 != i25) {
                                        i19 += org.telegram.messenger.i0.L(f21);
                                        org.telegram.messenger.i0.L(f18);
                                    }
                                    if (i21 == 0) {
                                        i21 = i19 - org.telegram.messenger.i0.L(f18);
                                    }
                                    canvas2.save();
                                    float L14 = org.telegram.messenger.i0.L(f23) + i22 + (Math.abs(this.g) > 1 ? ((i23 - org.telegram.messenger.i0.L(20.0f)) - this.f) - this.g : 0);
                                    float L15 = i19 - org.telegram.messenger.i0.L(3.0f);
                                    if (x1Var2.s2) {
                                        f26 = f25;
                                        f37 = 0.0f;
                                    } else {
                                        f26 = f25;
                                        f37 = (-x1Var2.k0) + x1Var2.j0;
                                    }
                                    canvas2.translate(L14, L15 + f37);
                                    TextPaint paint = q1Var.m2.getPaint();
                                    int alpha3 = paint.getAlpha();
                                    paint.setAlpha((int) (alpha3 * f13));
                                    nh.i.f(canvas2, q1Var.m2);
                                    paint.setAlpha(alpha3);
                                    canvas2.restore();
                                    i19 += q1Var.m2.getLineBottom(r4.getLineCount() - 1);
                                } else {
                                    f26 = f25;
                                    i25 = i24;
                                }
                                if (this.i != null) {
                                    if (i19 != i25) {
                                        i19 += org.telegram.messenger.i0.L(f26);
                                    }
                                    if (i21 == 0) {
                                        i21 = i19 - org.telegram.messenger.i0.L(f18);
                                    }
                                    canvas2.save();
                                    canvas2.translate(org.telegram.messenger.i0.L(f23) + i22 + (Math.abs(this.e) > 1 ? ((i23 - org.telegram.messenger.i0.L(20.0f)) - this.d) - this.e : 0), (i19 - org.telegram.messenger.i0.L(3.0f)) + (!x1Var2.s2 ? (-x1Var2.k0) + x1Var2.j0 : 0.0f));
                                    TextPaint paint2 = this.i.getPaint();
                                    int alpha4 = paint2.getAlpha();
                                    paint2.setAlpha((int) (alpha4 * f13));
                                    nh.i.f(canvas2, this.i);
                                    paint2.setAlpha(alpha4);
                                    canvas2.restore();
                                    i19 += this.i.getLineBottom(r4.getLineCount() - 1);
                                }
                                if (q1Var.n2 != null) {
                                    if (i19 != i25) {
                                        i19 += org.telegram.messenger.i0.L(f26);
                                    }
                                    int i48 = i19;
                                    if (i21 == 0) {
                                        i21 = i48 - org.telegram.messenger.i0.L(f18);
                                    }
                                    q1Var.W1 = i48 - org.telegram.messenger.i0.L(3.0f);
                                    canvas2.save();
                                    canvas2.translate(org.telegram.messenger.i0.L(f23) + i22 + (Math.abs(q1Var.a2) > 1 ? ((i23 - org.telegram.messenger.i0.L(20.0f)) - q1Var.Z1) - q1Var.a2 : 0), q1Var.W1 + (!x1Var2.s2 ? (-x1Var2.k0) + x1Var2.j0 : 0.0f));
                                    if (q1Var.x0 == -10 && q1Var.s4.h(canvas2)) {
                                        q1Var.invalidate();
                                    }
                                    q1Var.k1(canvas2, -2);
                                    l1 l1Var4 = q1Var.Qa;
                                    if (l1Var4 != null && l1Var4.g2() != null && q1Var.getDelegate().g2().z(q1Var.O5)) {
                                        q1Var.Qa.g2().Y(q1Var.O5.P3(), q1Var.n2, canvas2);
                                    }
                                    TextPaint paint3 = q1Var.n2.getPaint();
                                    if (z13 && (jjVar = q1Var.O5) != null && !jjVar.P3() && (dl0Var = q1Var.m8) != null) {
                                        paint3.linkColor = dl0Var.i();
                                    }
                                    int alpha5 = paint3.getAlpha();
                                    paint3.setAlpha((int) (alpha5 * f13));
                                    nh.i.f(canvas2, q1Var.n2);
                                    paint3.setAlpha(alpha5);
                                    int i49 = i25;
                                    StaticLayout staticLayout2 = q1Var.n2;
                                    imageReceiver2 = imageReceiver;
                                    c2Var = c2Var3;
                                    i27 = i23;
                                    i26 = i49;
                                    i28 = saveCount;
                                    f27 = f18;
                                    rectF2 = rectF5;
                                    x1Var = x1Var2;
                                    org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas2, staticLayout2, q1Var.Aa, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, q1Var.G1(1, staticLayout2.getPaint().getColor()));
                                    canvas2.restore();
                                    paint3.linkColor = q1Var.V1(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.Vc : org.telegram.ui.ActionBar.t6.Uc);
                                    i19 = q1Var.n2.getLineBottom(r2.getLineCount() - 1) + i48;
                                } else {
                                    i26 = i25;
                                    imageReceiver2 = imageReceiver;
                                    c2Var = c2Var3;
                                    i27 = i23;
                                    rectF2 = rectF5;
                                    i28 = saveCount;
                                    f27 = f18;
                                    x1Var = x1Var2;
                                }
                                int i50 = i21;
                                if (q1Var.M1 || !z17) {
                                    f28 = f7;
                                    c2Var2 = c2Var;
                                    f29 = f26;
                                } else {
                                    if (i19 != i26) {
                                        i19 += org.telegram.messenger.i0.L(f26);
                                    }
                                    int L16 = i27 - org.telegram.messenger.i0.L(17.0f);
                                    if (q1Var.v1) {
                                        c2Var2 = c2Var;
                                        c2Var2.C0(((i22 + i27) - c2Var.w()) - org.telegram.messenger.i0.L(f24));
                                        c2Var2.D0(i50);
                                    } else {
                                        c2Var2 = c2Var;
                                        c2Var2.C0(i22 + (q1Var.S1 ? -org.telegram.messenger.i0.L(6.3f) : org.telegram.messenger.i0.L(f23)));
                                        c2Var2.D0(i19);
                                    }
                                    if (x1Var != null && x1Var.t1) {
                                        if (!q1Var.v1 && q1Var.K1 != 1) {
                                            c2Var2.B0((int) org.telegram.messenger.i0.T1(x1Var.p1, L16, x1Var.L1));
                                        }
                                        c2Var2.C0(org.telegram.messenger.i0.T1(x1Var.r1, c2Var2.r(), x1Var.L1) - (c2Var2.w() / f26));
                                        c2Var2.D0(org.telegram.messenger.i0.T1(x1Var.s1, c2Var2.s(), x1Var.L1) - (c2Var2.v() / f26));
                                    } else if (!q1Var.v1 && (i31 = q1Var.K1) != 7 && i31 != 1) {
                                        c2Var2.B0(L16);
                                    }
                                    if (q1Var.v1 || !q1Var.w1) {
                                        f29 = f26;
                                    } else {
                                        int L17 = org.telegram.messenger.i0.L(48.0f);
                                        float f54 = L17;
                                        f29 = f26;
                                        q1Var.I3 = (int) c3.i0.B(c2Var2.w(), f54, f29, c2Var2.x());
                                        int v12 = (int) (((c2Var2.v() - f54) / f29) + c2Var2.z());
                                        q1Var.J3 = v12;
                                        int i51 = q1Var.I3;
                                        radialProgress2.r(i51, v12, i51 + L17, L17 + v12);
                                    }
                                    if (q1Var.wb && MediaController.B().I(q1Var.O5) && (k4Var = MediaController.B().L0) != null && k4Var.d && canvas2.isHardwareAccelerated()) {
                                        q1Var.ib = true;
                                        q1Var.D9 = true;
                                    } else {
                                        l1 l1Var5 = q1Var.Qa;
                                        if (l1Var5 == null || l1Var5.H1() == null || !q1Var.Qa.H1().f(q1Var)) {
                                            if (f7 != f27) {
                                                f28 = f7;
                                                c2Var2.setAlpha(f28);
                                                if (q1Var.x()) {
                                                    q1Var.ib = c2Var2.g(canvas2);
                                                } else {
                                                    q1Var.ib = true;
                                                }
                                                if (q1Var.O5.t2()) {
                                                    ImageReceiver imageReceiver5 = imageReceiver2;
                                                    imageReceiver5.setAlpha(f28);
                                                    q1Var.L0(canvas2);
                                                    imageReceiver5.setAlpha(f27);
                                                }
                                                c2Var2.setAlpha(f27);
                                            } else {
                                                f28 = f7;
                                                if (q1Var.x()) {
                                                    q1Var.ib = c2Var2.g(canvas2);
                                                } else {
                                                    q1Var.ib = true;
                                                }
                                                if (q1Var.O5.t2()) {
                                                    q1Var.L0(canvas2);
                                                }
                                            }
                                        }
                                    }
                                    f28 = f7;
                                }
                                i29 = q1Var.K1;
                                if (i29 != 4 || i29 == 2) {
                                    q1Var.K3 = (int) (c2Var2.x() + org.telegram.messenger.i0.L(8.0f));
                                    int z20 = (int) (c2Var2.z() + org.telegram.messenger.i0.L(8.0f));
                                    q1Var.L3 = z20;
                                    RadialProgress2 radialProgress22 = q1Var.Q0;
                                    int i52 = q1Var.K3;
                                    radialProgress22.r(i52, z20, org.telegram.messenger.i0.L(24.0f) + i52, org.telegram.messenger.i0.L(24.0f) + q1Var.L3);
                                }
                                Paint X1 = q1Var.X1("paintChatTimeBackground");
                                if (this.h == null && c2Var2.H()) {
                                    int w9 = (int) (((c2Var2.w() + c2Var2.x()) - org.telegram.messenger.i0.L(8.0f)) - this.c);
                                    f30 = 8.0f;
                                    int v13 = (int) ((c2Var2.v() + c2Var2.z()) - org.telegram.messenger.i0.L(19.0f));
                                    f32 = 19.0f;
                                    f35 = 14.5f;
                                    f33 = f27;
                                    f34 = 1.5f;
                                    f31 = f29;
                                    rectF3 = rectF2;
                                    rectF3.set(w9 - org.telegram.messenger.i0.L(f21), v13 - org.telegram.messenger.i0.L(1.5f), org.telegram.messenger.i0.L(f21) + this.c + w9, org.telegram.messenger.i0.L(14.5f) + v13);
                                    int alpha6 = X1.getAlpha();
                                    X1.setAlpha((int) (alpha6 * q1Var.j4));
                                    org.telegram.ui.ActionBar.t6.J2.setAlpha((int) (q1Var.j4 * 255.0f));
                                    canvas2.drawRoundRect(rectF3, org.telegram.messenger.i0.L(f21), org.telegram.messenger.i0.L(f21), X1);
                                    X1.setAlpha(alpha6);
                                    canvas2.save();
                                    canvas2.translate(w9, v13);
                                    this.h.draw(canvas2);
                                    canvas2.restore();
                                    org.telegram.ui.ActionBar.t6.J2.setAlpha(zs.e4);
                                } else {
                                    f30 = 8.0f;
                                    f31 = f29;
                                    f32 = 19.0f;
                                    f33 = f27;
                                    f34 = 1.5f;
                                    rectF3 = rectF2;
                                    f35 = 14.5f;
                                }
                                if (q1Var.o2 != null && ((!q1Var.M1 || c2Var2.H()) && q1Var.y2 == 0)) {
                                    if (q1Var.R1 && !q1Var.S1 && q1Var.K1 != 8) {
                                        i30 = (int) (((c2Var2.w() + c2Var2.x()) - org.telegram.messenger.i0.L(f30)) - q1Var.X1);
                                        i19 = (int) ((c2Var2.v() + c2Var2.z()) - org.telegram.messenger.i0.L(f32));
                                        rectF3.set(i30 - org.telegram.messenger.i0.L(f21), i19 - org.telegram.messenger.i0.L(f34), org.telegram.messenger.i0.L(f21) + q1Var.X1 + i30, org.telegram.messenger.i0.L(f35) + i19);
                                        canvas2.drawRoundRect(rectF3, org.telegram.messenger.i0.L(f21), org.telegram.messenger.i0.L(f21), q1Var.X1("paintChatTimeBackground"));
                                    } else if (q1Var.M1) {
                                        i30 = i22;
                                    } else {
                                        i30 = (int) (c2Var2.x() + org.telegram.messenger.i0.L(8.5f));
                                        i19 = (int) (c2Var2.z() + org.telegram.messenger.i0.L(f24));
                                        rectF3.set(i30 - org.telegram.messenger.i0.L(f21), i19 - org.telegram.messenger.i0.L(f34), org.telegram.messenger.i0.L(f21) + q1Var.X1 + i30, org.telegram.messenger.i0.L(q1Var.K1 == 8 ? f35 : 16.5f) + i19);
                                        canvas2.drawRoundRect(rectF3, org.telegram.messenger.i0.L(f21), org.telegram.messenger.i0.L(f21), X1);
                                    }
                                    canvas2.save();
                                    canvas2.translate(i30, i19);
                                    if (q1Var.S1) {
                                        if (q1Var.M1) {
                                            org.telegram.ui.ActionBar.t6.L2.setColor(q1Var.V1(org.telegram.ui.ActionBar.t6.xd));
                                        } else if (q1Var.O5.P3()) {
                                            org.telegram.ui.ActionBar.t6.L2.setColor(q1Var.V1(org.telegram.ui.ActionBar.t6.Tc));
                                        } else {
                                            org.telegram.ui.ActionBar.t6.L2.setColor(q1Var.V1(org.telegram.ui.ActionBar.t6.Sc));
                                        }
                                    }
                                    q1Var.o2.draw(canvas2);
                                    canvas2.restore();
                                }
                                q1Var.x1(canvas2, q1Var.m8.i());
                                int i53 = i22;
                                q1Var.O.b(canvas2, q1Var.Sa, i53, q1Var.Ob);
                                q1Var.P.b(canvas2, q1Var.Sa, i53, q1Var.Ob);
                                if (q1Var.s2) {
                                    if (q1Var.O5.P3()) {
                                        int V1 = q1Var.V1(org.telegram.ui.ActionBar.t6.Lb);
                                        if (q1Var.k8 == null) {
                                            if (q1Var.w2 == 27) {
                                                q1Var.k8 = q1Var.getContext().getResources().getDrawable(R.drawable.mini_call_join).mutate();
                                            } else {
                                                q1Var.k8 = q1Var.W1("drawableMsgOutInstant");
                                            }
                                            Drawable drawable2 = q1Var.k8;
                                            q1Var.j8 = V1;
                                            drawable2.setColorFilter(new PorterDuffColorFilter(V1, PorterDuff.Mode.SRC_IN));
                                        }
                                        if (q1Var.j8 != V1) {
                                            Drawable drawable3 = q1Var.k8;
                                            q1Var.j8 = V1;
                                            drawable3.setColorFilter(new PorterDuffColorFilter(V1, PorterDuff.Mode.SRC_IN));
                                        }
                                        drawable = q1Var.k8;
                                        org.telegram.ui.ActionBar.t6.M2.setColor(V1);
                                        org.telegram.ui.ActionBar.t6.Y1.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, V1));
                                        t80 t80Var = this.s;
                                        if (t80Var != null) {
                                            t80Var.g(org.telegram.ui.ActionBar.t6.r1(0.1f, V1), org.telegram.ui.ActionBar.t6.r1(0.3f, V1), org.telegram.ui.ActionBar.t6.r1(0.3f, V1), org.telegram.ui.ActionBar.t6.r1(1.2f, V1));
                                        }
                                    } else {
                                        int V12 = q1Var.V1(org.telegram.ui.ActionBar.t6.yd);
                                        if (q1Var.m8 != null && !q1Var.O5.G4()) {
                                            V12 = q1Var.m8.i();
                                        }
                                        if (q1Var.k8 == null) {
                                            int i54 = q1Var.w2;
                                            if (i54 == 16) {
                                                q1Var.k8 = q1Var.getContext().getResources().getDrawable(R.drawable.mini_external_link).mutate();
                                            } else if (i54 == 27) {
                                                q1Var.k8 = q1Var.getContext().getResources().getDrawable(R.drawable.mini_call_join).mutate();
                                            } else {
                                                q1Var.k8 = q1Var.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                                            }
                                            Drawable drawable4 = q1Var.k8;
                                            q1Var.j8 = V12;
                                            drawable4.setColorFilter(new PorterDuffColorFilter(V12, PorterDuff.Mode.SRC_IN));
                                        }
                                        if (q1Var.j8 != V12) {
                                            Drawable drawable5 = q1Var.k8;
                                            q1Var.j8 = V12;
                                            drawable5.setColorFilter(new PorterDuffColorFilter(V12, PorterDuff.Mode.SRC_IN));
                                        }
                                        drawable = q1Var.k8;
                                        org.telegram.ui.ActionBar.t6.M2.setColor(V12);
                                        org.telegram.ui.ActionBar.t6.Y1.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, V12));
                                        t80 t80Var2 = this.s;
                                        if (t80Var2 != null) {
                                            t80Var2.g(org.telegram.ui.ActionBar.t6.r1(0.1f, V12), org.telegram.ui.ActionBar.t6.r1(0.3f, V12), org.telegram.ui.ActionBar.t6.r1(0.3f, V12), org.telegram.ui.ActionBar.t6.r1(1.2f, V12));
                                        }
                                    }
                                    Drawable drawable6 = drawable;
                                    if (z13) {
                                        int L18 = org.telegram.messenger.i0.L(14.0f) + i26 + i39;
                                        int alpha7 = org.telegram.ui.ActionBar.t6.M2.getAlpha();
                                        org.telegram.ui.ActionBar.t6.M2.setAlpha((int) (alpha7 * 0.18f));
                                        canvas2.drawRect(org.telegram.messenger.i0.L(f23) + i53, org.telegram.messenger.i0.L(f31) + r0, (i53 + i27) - org.telegram.messenger.i0.L(7.0f), Math.max(1, org.telegram.messenger.i0.L(0.66f)) + org.telegram.messenger.i0.L(f31) + r0, org.telegram.ui.ActionBar.t6.M2);
                                        org.telegram.ui.ActionBar.t6.M2.setAlpha(alpha7);
                                        int i55 = q1Var.w2;
                                        if (i55 == 27) {
                                            f46 = 20.0f;
                                        } else if (i55 == 0) {
                                            f46 = 15.0f;
                                        }
                                        float L19 = org.telegram.messenger.i0.L(f46) + q1Var.q2;
                                        float B = c3.i0.B(i27, L19, f31, f22);
                                        int i56 = q1Var.w2;
                                        if (i56 == 0) {
                                            float L20 = org.telegram.messenger.i0.L(f33) + L18;
                                            int L21 = org.telegram.messenger.i0.L(9.0f);
                                            int L22 = org.telegram.messenger.i0.L(13.0f);
                                            if (drawable6 != null) {
                                                int i57 = (int) B;
                                                int i58 = (int) L20;
                                                drawable6.setBounds(i57, i58, L21 + i57, L22 + i58);
                                            }
                                            drawable6.setAlpha((int) (f28 * 255.0f));
                                            drawable6.draw(canvas2);
                                            L3 = org.telegram.messenger.i0.L(15.0f);
                                        } else if (i56 == 27) {
                                            int i59 = (int) B;
                                            int i60 = L18;
                                            drawable6.setBounds(i59, i60, drawable6.getIntrinsicWidth() + i59, drawable6.getIntrinsicHeight() + i60);
                                            drawable6.setAlpha((int) (f28 * 255.0f));
                                            drawable6.draw(canvas2);
                                            L3 = org.telegram.messenger.i0.L(20.0f);
                                        } else {
                                            if (i56 == 16) {
                                                B -= org.telegram.messenger.i0.L(11.0f);
                                                float L23 = L19 + B + org.telegram.messenger.i0.L(f21);
                                                float L24 = L18 - org.telegram.messenger.i0.L(2.0f);
                                                int L25 = org.telegram.messenger.i0.L(18.0f);
                                                int L26 = org.telegram.messenger.i0.L(18.0f);
                                                if (drawable6 != null) {
                                                    int i61 = (int) L23;
                                                    int i62 = (int) L24;
                                                    drawable6.setBounds(i61, i62, L25 + i61, L26 + i62);
                                                }
                                                drawable6.setAlpha((int) (f28 * 255.0f));
                                                drawable6.draw(canvas2);
                                            }
                                            if (q1Var.p2 != null) {
                                                canvas2.save();
                                                canvas2.translate(B - q1Var.r2, L18);
                                                nh.i.f(canvas2, q1Var.p2);
                                                canvas2.restore();
                                            }
                                        }
                                        B += L3;
                                        if (q1Var.p2 != null) {
                                        }
                                    } else {
                                        float f55 = f22;
                                        int L27 = org.telegram.messenger.i0.L(q1Var.O5.G4() ? -5.0f : f23) + i26 + i39;
                                        t80 t80Var3 = this.s;
                                        if (t80Var3 != null && !z11 && !t80Var3.c() && !this.s.d()) {
                                            this.s.a();
                                        }
                                        t80 t80Var4 = this.s;
                                        if (t80Var4 == null && z11) {
                                            t80 t80Var5 = new t80();
                                            this.s = t80Var5;
                                            t80Var5.x.setStrokeWidth(org.telegram.messenger.i0.L(1.25f));
                                            this.s.D = true;
                                        } else if (t80Var4 != null && z11 && (t80Var4.c() || this.s.d())) {
                                            t80 t80Var6 = this.s;
                                            t80Var6.b = -1L;
                                            t80Var6.c = -1L;
                                        }
                                        RectF rectF8 = rectF;
                                        rectF8.set(f55, L27, i53 + q1Var.B2, org.telegram.messenger.i0.L(36.0f) + L27);
                                        float a11 = q1Var.F2.a(0.02f);
                                        boolean z21 = a11 != f33;
                                        if (z21) {
                                            canvas2.save();
                                            canvas2.scale(a11, a11, rectF8.centerX(), rectF8.centerY());
                                        }
                                        q1Var.J2[0] = 0;
                                        q1Var.z0(0);
                                        q1Var.H2[0].setBounds(i53, L27, q1Var.B2 + i53, org.telegram.messenger.i0.L(36.0f) + L27);
                                        q1Var.H2[0].draw(canvas2);
                                        t80 t80Var7 = this.s;
                                        if (t80Var7 == null || t80Var7.c()) {
                                            f36 = f24;
                                        } else {
                                            this.s.e(rectF8);
                                            f36 = f24;
                                            this.s.k(f36);
                                            this.s.draw(canvas2);
                                            q1Var.invalidate();
                                        }
                                        canvas2.drawRoundRect(rectF8, org.telegram.messenger.i0.L(f36), org.telegram.messenger.i0.L(f36), org.telegram.ui.ActionBar.t6.Y1);
                                        int i63 = q1Var.w2;
                                        if (i63 == 0) {
                                            int L28 = ((q1Var.A2 + q1Var.z2) + i53) - org.telegram.messenger.i0.L(15.0f);
                                            int L29 = org.telegram.messenger.i0.L(11.5f) + L27;
                                            int L30 = org.telegram.messenger.i0.L(9.0f);
                                            int L31 = org.telegram.messenger.i0.L(13.0f);
                                            if (drawable6 != null) {
                                                drawable6.setBounds(L28, L29, L30 + L28, L31 + L29);
                                            }
                                            drawable6.setAlpha((int) (f28 * 255.0f));
                                            drawable6.draw(canvas2);
                                        } else if (i63 == 16) {
                                            if (this.u == null) {
                                                Paint paint4 = new Paint(1);
                                                this.u = paint4;
                                                paint4.setStyle(Paint.Style.STROKE);
                                                this.u.setStrokeCap(Paint.Cap.ROUND);
                                                this.u.setStrokeJoin(Paint.Join.ROUND);
                                            }
                                            this.u.setColor(org.telegram.ui.ActionBar.t6.M2.getColor());
                                            this.u.setStrokeWidth(org.telegram.messenger.i0.N(1.333f));
                                            Path path2 = this.t;
                                            if (path2 == null) {
                                                this.t = new Path();
                                            } else {
                                                path2.rewind();
                                            }
                                            this.t.moveTo(rectF8.right - org.telegram.messenger.i0.L(11.0f), rectF8.top + org.telegram.messenger.i0.L(f36));
                                            this.t.lineTo(rectF8.right - org.telegram.messenger.i0.L(f36), rectF8.top + org.telegram.messenger.i0.L(f36));
                                            this.t.lineTo(rectF8.right - org.telegram.messenger.i0.L(f36), rectF8.top + org.telegram.messenger.i0.L(11.0f));
                                            this.t.moveTo(rectF8.right - org.telegram.messenger.i0.N(11.66f), rectF8.top + org.telegram.messenger.i0.L(11.66f));
                                            this.t.lineTo(rectF8.right - org.telegram.messenger.i0.L(f36), rectF8.top + org.telegram.messenger.i0.L(f36));
                                            canvas2.drawPath(this.t, this.u);
                                        }
                                        if (q1Var.p2 != null) {
                                            canvas2.save();
                                            canvas2.translate(i53 + q1Var.z2, org.telegram.messenger.i0.L(10.5f) + L27);
                                            nh.i.f(canvas2, q1Var.p2);
                                            canvas2.restore();
                                        }
                                        if (z21) {
                                            canvas2.restore();
                                        }
                                    }
                                }
                                canvas2.restoreToCount(i28);
                            }
                            if (x1Var2 == null || !x1Var2.t1) {
                                f21 = 4.0f;
                            } else {
                                f21 = 4.0f;
                                i19 = (int) c3.i0.z(f18, x1Var2.L1, (i19 != i18 ? org.telegram.messenger.i0.L(f19) : 0) + x1Var2.q1 + org.telegram.messenger.i0.L(6.0f), i19);
                            }
                            imageReceiver = imageReceiver4;
                            f22 = f20;
                            f23 = f15;
                            i22 = i16;
                            i23 = i17;
                            f24 = 6.0f;
                            f18 = 1.0f;
                        }
                        i24 = i18;
                        f25 = f19;
                        if (q1Var.O5.P3()) {
                        }
                        if (q1Var.m2 != null) {
                        }
                        if (this.i != null) {
                        }
                        if (q1Var.n2 != null) {
                        }
                        int i502 = i21;
                        if (q1Var.M1) {
                        }
                        f28 = f7;
                        c2Var2 = c2Var;
                        f29 = f26;
                        i29 = q1Var.K1;
                        if (i29 != 4) {
                        }
                        q1Var.K3 = (int) (c2Var2.x() + org.telegram.messenger.i0.L(8.0f));
                        int z202 = (int) (c2Var2.z() + org.telegram.messenger.i0.L(8.0f));
                        q1Var.L3 = z202;
                        RadialProgress2 radialProgress222 = q1Var.Q0;
                        int i522 = q1Var.K3;
                        radialProgress222.r(i522, z202, org.telegram.messenger.i0.L(24.0f) + i522, org.telegram.messenger.i0.L(24.0f) + q1Var.L3);
                        Paint X12 = q1Var.X1("paintChatTimeBackground");
                        if (this.h == null) {
                        }
                        f30 = 8.0f;
                        f31 = f29;
                        f32 = 19.0f;
                        f33 = f27;
                        f34 = 1.5f;
                        rectF3 = rectF2;
                        f35 = 14.5f;
                        if (q1Var.o2 != null) {
                            if (q1Var.R1) {
                            }
                            if (q1Var.M1) {
                            }
                            canvas2.save();
                            canvas2.translate(i30, i19);
                            if (q1Var.S1) {
                            }
                            q1Var.o2.draw(canvas2);
                            canvas2.restore();
                        }
                        q1Var.x1(canvas2, q1Var.m8.i());
                        int i532 = i22;
                        q1Var.O.b(canvas2, q1Var.Sa, i532, q1Var.Ob);
                        q1Var.P.b(canvas2, q1Var.Sa, i532, q1Var.Ob);
                        if (q1Var.s2) {
                        }
                        canvas2.restoreToCount(i28);
                    }
                    i11 = q1Var.p0 - org.telegram.messenger.i0.L(2.0f);
                    i13 = q1Var.o0;
                    L2 = org.telegram.messenger.i0.L(1.0f);
                }
                i14 = L2 + i13;
            }
            i12 = i14;
            f11 = 1.0f;
            f12 = i12;
            i15 = (int) (backgroundDrawableRight - f12);
            int i382 = q1Var.U1;
            if (x1Var2 == null) {
            }
            i16 = i12;
            int i392 = i382;
            if (q1Var.m8 == null) {
            }
            org.telegram.ui.ActionBar.t6.Y2.setColor(q1Var.m8.a(q1Var.O5, q1Var.ha, q1Var.ia, q1Var.Ob, 3));
            dl0 dl0Var22 = q1Var.m8;
            int i402 = q1Var.w2;
            dl0Var22.o((i402 != 23 || i402 == 24 || i402 == 28) ? 0.5f : f11);
            if (q1Var.O5.r4()) {
            }
            if (!z15) {
            }
            if (z15) {
            }
            l1 l1Var6 = q1Var.Qa;
            if (l1Var6 == null) {
            }
            if (q1Var.S1) {
            }
            f13 = f7;
            i17 = i15;
            i18 = i11;
            z11 = z10;
            f14 = f12;
            f15 = f10;
            rectF = rectF4;
            z12 = true;
            z13 = false;
            if (q1Var.M1) {
            }
            f16 = 1.0f;
            f17 = 2.0f;
            i19 = i18;
            if (q1Var.e2 == null) {
            }
            if (!q1Var.R1) {
            }
            int C2 = org.telegram.messenger.m5.C(4.0f, q1Var.O5.U5(x1Var2), i18);
            i19 = org.telegram.messenger.m5.C(4.0f, q1Var.O5.U5(x1Var2), i19);
            i18 = C2;
            if (q1Var.M1) {
            }
            f21 = 4.0f;
            imageReceiver = imageReceiver4;
            f22 = f20;
            f23 = f15;
            i22 = i16;
            i23 = i17;
            f24 = 6.0f;
            i24 = i18;
            f25 = f19;
            if (q1Var.O5.P3()) {
            }
            if (q1Var.m2 != null) {
            }
            if (this.i != null) {
            }
            if (q1Var.n2 != null) {
            }
            int i5022 = i21;
            if (q1Var.M1) {
            }
            f28 = f7;
            c2Var2 = c2Var;
            f29 = f26;
            i29 = q1Var.K1;
            if (i29 != 4) {
            }
            q1Var.K3 = (int) (c2Var2.x() + org.telegram.messenger.i0.L(8.0f));
            int z2022 = (int) (c2Var2.z() + org.telegram.messenger.i0.L(8.0f));
            q1Var.L3 = z2022;
            RadialProgress2 radialProgress2222 = q1Var.Q0;
            int i5222 = q1Var.K3;
            radialProgress2222.r(i5222, z2022, org.telegram.messenger.i0.L(24.0f) + i5222, org.telegram.messenger.i0.L(24.0f) + q1Var.L3);
            Paint X122 = q1Var.X1("paintChatTimeBackground");
            if (this.h == null) {
            }
            f30 = 8.0f;
            f31 = f29;
            f32 = 19.0f;
            f33 = f27;
            f34 = 1.5f;
            rectF3 = rectF2;
            f35 = 14.5f;
            if (q1Var.o2 != null) {
            }
            q1Var.x1(canvas2, q1Var.m8.i());
            int i5322 = i22;
            q1Var.O.b(canvas2, q1Var.Sa, i5322, q1Var.Ob);
            q1Var.P.b(canvas2, q1Var.Sa, i5322, q1Var.Ob);
            if (q1Var.s2) {
            }
            canvas2.restoreToCount(i28);
        }
    }
}
