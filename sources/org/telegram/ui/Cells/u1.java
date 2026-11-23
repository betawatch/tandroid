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
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.q80;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class u1 {
    public final r1 a;
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
    public cb0 q;
    public int r;
    public q80 s;
    public Path t;
    public Paint u;
    public boolean v;
    public mc w;
    public y x;

    public u1(r1 r1Var) {
        this.a = r1Var;
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
        boolean z10;
        float f14;
        int i16;
        int i17;
        boolean z11;
        float f15;
        float f16;
        RectF rectF;
        boolean z12;
        boolean z13;
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
        fi.s2 s2Var;
        int i26;
        RectF rectF2;
        int i27;
        float f28;
        y1 y1Var;
        float f29;
        fi.s2 s2Var2;
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
        gj gjVar;
        ok0 ok0Var;
        float f38;
        ImageReceiver imageReceiver3;
        float f39;
        float f40;
        int i31;
        float f41;
        float f42;
        float b10;
        boolean z14;
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
        r1 r1Var = this.a;
        RadialProgress2 radialProgress2 = r1Var.Q0;
        ImageReceiver imageReceiver4 = r1Var.V0;
        RectF rectF4 = r1Var.M2;
        RectF rectF5 = r1Var.c4;
        y1 y1Var2 = r1Var.ib;
        fi.s2 s2Var3 = r1Var.U0;
        if (r1Var.Q5.r4() || r1Var.Q5.G4() || r1Var.R1 || r1Var.T1 || r1Var.U1) {
            int saveCount = canvas2.getSaveCount();
            float f47 = 0.0f;
            float backgroundDrawableRight = ((r1Var.getBackgroundDrawableRight() + (y1Var2 != null ? y1Var2.i0 : 0.0f)) - org.telegram.messenger.g0.L(10 + ((!r1Var.Q5.P3() || r1Var.C6 || r1Var.K) ? 0 : 6))) - r1Var.getExtraTextX();
            if (r1Var.T1) {
                f11 = 10.0f;
                i10 = org.telegram.messenger.g0.L(14.0f) + r1Var.Ua;
                i13 = r1Var.p0 - org.telegram.messenger.g0.L(10.0f);
            } else {
                f11 = 10.0f;
                if (r1Var.U1) {
                    i10 = org.telegram.messenger.g0.L(14.0f) + r1Var.Ua;
                    i12 = r1Var.p0;
                    L2 = org.telegram.messenger.g0.L(1.0f);
                } else {
                    if (!r1Var.Q5.r4()) {
                        if (r1Var.Q5.P3()) {
                            i7 = r1Var.getExtraTextX() + org.telegram.messenger.g0.L(12.0f) + r1Var.N6;
                            f12 = 1.0f;
                            if (r1Var.Q5.D == 19) {
                                i7 -= Math.max(0, (org.telegram.messenger.g0.L(14.0f) + (Math.max(r1Var.X7, r1Var.Z7) + i7)) - org.telegram.messenger.g0.q.x);
                            }
                        } else {
                            f12 = 1.0f;
                            if (r1Var.C6) {
                                L = org.telegram.messenger.g0.L(12.0f) + r1Var.N6;
                                extraTextX = r1Var.getExtraTextX();
                            } else {
                                L = org.telegram.messenger.g0.L(r1Var.K ? 12.0f : 18.0f) + r1Var.N6;
                                extraTextX = r1Var.getExtraTextX();
                            }
                            i7 = extraTextX + L;
                        }
                        int L4 = ((int) (i7 + y1Var2.h0)) - org.telegram.messenger.g0.L(1.33f);
                        i10 = r1Var.q0;
                        if (y1Var2.s2) {
                            i10 = org.telegram.messenger.g0.W1(y1Var2.L1, y1Var2.r2, i10);
                        }
                        i11 = L4;
                        f13 = i11;
                        i14 = (int) (backgroundDrawableRight - f13);
                        int i37 = r1Var.W1;
                        if (y1Var2 == null && y1Var2.J1) {
                            i15 = i11;
                            i37 = org.telegram.messenger.g0.W1(y1Var2.L1, y1Var2.I1, i37);
                        } else {
                            i15 = i11;
                        }
                        int i38 = i37;
                        if (r1Var.o8 == null) {
                            r1Var.o8 = new ok0(r1Var);
                        }
                        org.telegram.ui.ActionBar.m6.Y2.setColor(r1Var.o8.a(r1Var.Q5, r1Var.ja, r1Var.ka, r1Var.Qb, 3));
                        ok0 ok0Var2 = r1Var.o8;
                        int i39 = r1Var.y2;
                        ok0Var2.o((i39 != 23 || i39 == 24 || i39 == 28) ? 0.5f : f12);
                        boolean z15 = (r1Var.Q5.r4() || r1Var.x1) ? false : true;
                        boolean z16 = !(!z15 || !r1Var.u2 || (i36 = r1Var.y2) == 26 || i36 == 9 || i36 == 2 || i36 == 13 || i36 == 11 || i36 == 25 || i36 == 1 || i36 == 29 || i36 == 18 || i36 == 22) || (r1Var.y2 == 6 && this.j != 0);
                        boolean z17 = z15 && (!r1Var.u2 || (i35 = r1Var.y2) == 9 || i35 == 2 || i35 == 11 || i35 == 25 || i35 == 13 || i35 == 1 || i35 == 29 || i35 == 18 || i35 == 22 || i35 == 32 || r1Var.x1 || i35 == 26);
                        m1 m1Var = r1Var.Sa;
                        z10 = m1Var == null && m1Var.z1(r1Var, 2);
                        if (!r1Var.U1 || r1Var.Q5.v3() || r1Var.Q5.G4()) {
                            f14 = f10;
                            i16 = i14;
                            i17 = i10;
                            z11 = z10;
                            f15 = f13;
                            f16 = f11;
                            rectF = rectF4;
                            z12 = true;
                            z13 = false;
                        } else {
                            if (this.w == null) {
                                f44 = 2.0f;
                                this.w = new mc(r1Var, 2.0f, 2.0f);
                            } else {
                                f44 = 2.0f;
                            }
                            canvas2.save();
                            float f48 = f44;
                            float a10 = this.w.a(0.01f);
                            canvas2.scale(a10, a10, (i14 / f48) + f13, ((i38 + (r1Var.u2 ? org.telegram.messenger.g0.L(42.0f) : 0)) / f48) + i10);
                            RectF rectF6 = org.telegram.messenger.g0.P;
                            rectF6.set(f13, i10 - org.telegram.messenger.g0.L(6.0f), i15 + i14, i10 + i38 + (r1Var.u2 ? org.telegram.messenger.g0.L(42.0f) : 0));
                            r1Var.o8.q(z10);
                            float floor = (float) Math.floor(cz.Y0 / (r1Var.Q5.r4() ? f48 : 3.0f));
                            ok0 ok0Var3 = r1Var.o8;
                            if (z16) {
                                float f49 = f12 - (y1Var2.t1 ? r1Var.x1 ? y1Var2.L1 : f12 - y1Var2.L1 : r1Var.x1 ? f12 : 0.0f);
                                float v = s2Var3.v() + org.telegram.messenger.g0.L(18.0f);
                                StaticLayout staticLayout = r1Var.g2;
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
                            ok0Var3.k(f46);
                            i17 = i10;
                            z11 = z10;
                            f15 = f13;
                            f16 = f11;
                            i16 = i14;
                            float f50 = f45;
                            rectF = rectF4;
                            ok0Var3.c(f50, f45, f45, f10, canvas, rectF6);
                            int h = r1Var.o8.h();
                            y yVar = this.x;
                            if (yVar == null) {
                                r1Var.Ra = h;
                                y a02 = org.telegram.ui.ActionBar.m6.a0(h, 0, 0);
                                this.x = a02;
                                a02.setCallback(r1Var);
                                org.telegram.ui.ActionBar.m6.F1(this.x, 3.0f, 6.0f, 6.0f, 3.0f);
                                this.x.setCallback(r1Var);
                            } else if (r1Var.Ra != h) {
                                r1Var.Ra = h;
                                org.telegram.ui.ActionBar.m6.H1(yVar, h, true);
                                this.x.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                                this.x.draw(canvas);
                                r1Var.o8.f(canvas, rectF6, f10);
                                z12 = true;
                                r1Var.o8.g(f50, f50, f50, f10, canvas, rectF6);
                                f14 = f10;
                                canvas2 = canvas;
                                z13 = true;
                            }
                            this.x.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                            this.x.draw(canvas);
                            r1Var.o8.f(canvas, rectF6, f10);
                            z12 = true;
                            r1Var.o8.g(f50, f50, f50, f10, canvas, rectF6);
                            f14 = f10;
                            canvas2 = canvas;
                            z13 = true;
                        }
                        if (r1Var.O1 || !z15) {
                            f17 = 1.0f;
                            f18 = 2.0f;
                            i18 = i17;
                        } else {
                            int L5 = i16 - org.telegram.messenger.g0.L(17.0f);
                            if (r1Var.x1) {
                                s2Var3.C0(((i15 + i16) - s2Var3.w()) - org.telegram.messenger.g0.L(6.0f));
                                s2Var3.D0(0);
                            } else {
                                s2Var3.C0(i15 + (r1Var.U1 ? -org.telegram.messenger.g0.L(6.3f) : org.telegram.messenger.g0.L(f16)));
                                s2Var3.D0(i17);
                            }
                            if (y1Var2 == null || !y1Var2.t1) {
                                f18 = 2.0f;
                                if (!r1Var.x1 && (i33 = r1Var.M1) != 7 && i33 != z12) {
                                    s2Var3.B0(L5);
                                }
                            } else {
                                if (!r1Var.x1 && r1Var.M1 != z12) {
                                    s2Var3.B0((int) org.telegram.messenger.g0.T1(y1Var2.p1, L5, y1Var2.L1));
                                }
                                f18 = 2.0f;
                                s2Var3.C0(org.telegram.messenger.g0.T1(y1Var2.r1, s2Var3.r(), y1Var2.L1) - (s2Var3.w() / 2.0f));
                                s2Var3.D0(org.telegram.messenger.g0.T1(y1Var2.s1, s2Var3.s(), y1Var2.L1) - (s2Var3.v() / 2.0f));
                            }
                            if (!r1Var.x1 && r1Var.y1) {
                                int L6 = org.telegram.messenger.g0.L(48.0f);
                                float f51 = L6;
                                r1Var.K3 = (int) com.google.android.gms.internal.vision.e2.A(s2Var3.w(), f51, f18, s2Var3.x());
                                int v10 = (int) (((s2Var3.v() - f51) / f18) + s2Var3.z());
                                r1Var.L3 = v10;
                                int i40 = r1Var.K3;
                                radialProgress2.r(i40, v10, i40 + L6, L6 + v10);
                            }
                            if (r1Var.yb && MediaController.B().I(r1Var.Q5) && (j4Var2 = MediaController.B().M0) != null && j4Var2.d && canvas2.isHardwareAccelerated()) {
                                r1Var.kb = z12;
                                r1Var.F9 = z12;
                            } else {
                                m1 m1Var2 = r1Var.Sa;
                                if (m1Var2 == null || m1Var2.c2() == null || !r1Var.Sa.c2().f(r1Var)) {
                                    f17 = 1.0f;
                                    if (f14 != 1.0f) {
                                        s2Var3.setAlpha(f14);
                                        if (r1Var.v()) {
                                            r1Var.kb = s2Var3.g(canvas2);
                                        } else {
                                            r1Var.kb = z12;
                                        }
                                        if (r1Var.Q5.t2()) {
                                            imageReceiver4.setAlpha(f14);
                                            r1Var.N0(canvas2);
                                            imageReceiver4.setAlpha(1.0f);
                                        }
                                        s2Var3.setAlpha(1.0f);
                                    } else {
                                        if (r1Var.v()) {
                                            r1Var.kb = s2Var3.g(canvas2);
                                        } else {
                                            r1Var.kb = z12;
                                        }
                                        if (r1Var.Q5.t2()) {
                                            r1Var.N0(canvas2);
                                        }
                                    }
                                    i18 = (int) (s2Var3.v() + org.telegram.messenger.g0.L(6.0f) + i17);
                                }
                            }
                            f17 = 1.0f;
                            i18 = (int) (s2Var3.v() + org.telegram.messenger.g0.L(6.0f) + i17);
                        }
                        if (r1Var.g2 == null) {
                            if (r1Var.h2 != null) {
                                i18 += org.telegram.messenger.g0.L(f17);
                            }
                            int L7 = i18 - org.telegram.messenger.g0.L(f17);
                            f20 = f18;
                            int alpha = org.telegram.ui.ActionBar.m6.Y2.getAlpha();
                            if (f14 != f17) {
                                z14 = z12;
                                f19 = f17;
                                org.telegram.ui.ActionBar.m6.Y2.setAlpha((int) (alpha * f14));
                            } else {
                                f19 = f17;
                                z14 = z12;
                            }
                            canvas2.save();
                            if (Math.abs(r1Var.d2) > f19) {
                                f43 = ((i16 - org.telegram.messenger.g0.L(r1Var.U1 ? 0.0f : 20.0f)) - r1Var.f2) - r1Var.d2;
                            } else {
                                f43 = 0.0f;
                            }
                            f21 = f15;
                            float L8 = f43 + (r1Var.U1 ? 0 : org.telegram.messenger.g0.L(f16)) + f21;
                            canvas2.translate(L8, i18 - org.telegram.messenger.g0.L(f19));
                            xh.f.f(canvas2, r1Var.g2);
                            canvas2.restore();
                            if (r1Var.h2 != null) {
                                float L9 = L8 + r1Var.e2 + org.telegram.messenger.g0.L(12.0f);
                                r1Var.k2 = L9;
                                r1Var.l2 = i18;
                                i32 = i18;
                                i20 = L7;
                                rectF5.set(L9 - org.telegram.messenger.g0.L(6.0f), r1Var.l2 - org.telegram.messenger.g0.L(f20), r1Var.k2 + r1Var.i2 + org.telegram.messenger.g0.L(6.0f), r1Var.l2 + r1Var.j2 + org.telegram.messenger.g0.L(f20));
                                if (r1Var.n2 == null) {
                                    r1Var.n2 = new mc(r1Var);
                                }
                                float a11 = r1Var.n2.a(0.1f);
                                boolean z18 = a11 != f19 ? z14 ? 1 : 0 : false;
                                if (z18) {
                                    canvas2.save();
                                    canvas2.scale(a11, a11, rectF5.centerX(), rectF5.centerY());
                                }
                                org.telegram.ui.ActionBar.m6.M2.setColor(org.telegram.ui.ActionBar.m6.Y2.getColor());
                                int alpha2 = org.telegram.ui.ActionBar.m6.M2.getAlpha();
                                org.telegram.ui.ActionBar.m6.M2.setAlpha((int) (alpha * 0.11f));
                                boolean z19 = z18;
                                canvas2.drawRoundRect(rectF5, rectF5.height(), rectF5.height(), org.telegram.ui.ActionBar.m6.M2);
                                org.telegram.ui.ActionBar.m6.M2.setAlpha(alpha2);
                                org.telegram.ui.ActionBar.m6.c3.setColor(org.telegram.ui.ActionBar.m6.Y2.getColor());
                                org.telegram.ui.ActionBar.m6.c3.setAlpha(org.telegram.ui.ActionBar.m6.Y2.getAlpha());
                                canvas2.save();
                                canvas2.translate(r1Var.k2, r1Var.l2);
                                r1Var.h2.draw(canvas2);
                                canvas2.restore();
                                if (z19) {
                                    canvas2.restore();
                                }
                            } else {
                                i32 = i18;
                                i20 = L7;
                            }
                            i18 = r1Var.g2.getLineBottom(r2.getLineCount() - 1) + i32;
                            org.telegram.ui.ActionBar.m6.Y2.setAlpha(alpha);
                            i19 = z14;
                        } else {
                            f19 = f17;
                            f20 = f18;
                            i19 = z12;
                            f21 = f15;
                            i20 = 0;
                        }
                        if ((!r1Var.T1 || r1Var.U1) && r1Var.Q5.W5(y1Var2) != 0) {
                            int C = org.telegram.messenger.f3.C(4.0f, r1Var.Q5.W5(y1Var2), i17);
                            i18 = org.telegram.messenger.f3.C(4.0f, r1Var.Q5.W5(y1Var2), i18);
                            i17 = C;
                        }
                        if (r1Var.O1 || !z16) {
                            f22 = 4.0f;
                            imageReceiver = imageReceiver4;
                            f23 = f21;
                            f24 = f16;
                            i21 = i15;
                            i22 = i16;
                            f25 = 6.0f;
                        } else {
                            if (!r1Var.x1) {
                                f22 = 4.0f;
                                float f52 = (y1Var2 == null || !y1Var2.t1) ? 1.0f : y1Var2.L1;
                                if (i18 != i17) {
                                    i18 = (int) ((org.telegram.messenger.g0.L(f20) * f52) + i18);
                                }
                                int L10 = i16 - org.telegram.messenger.g0.L(17.0f);
                                if (r1Var.x1 || r1Var.y2 != 17) {
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
                                    rect.set(L11, i18, org.telegram.messenger.f3.C(f53, i41, L10), ((int) s2Var3.v()) + i18);
                                    RectF rectF7 = org.telegram.messenger.g0.P;
                                    rectF7.set(rect);
                                    if (this.b == null) {
                                        TLRPC.PhotoSize photoSize = r1Var.e4;
                                        if (photoSize == null || photoSize.gradientTopColor == 0 || photoSize.gradientBottomColor == 0) {
                                            imageReceiver3 = imageReceiver4;
                                            i21 = i41;
                                            if (s2Var3.n() != null) {
                                                int[] b11 = c8.j0.b(s2Var3.n(), org.telegram.ui.ActionBar.m6.j1());
                                                this.b = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b11);
                                                TLRPC.PhotoSize photoSize2 = r1Var.e4;
                                                if (photoSize2 != null) {
                                                    photoSize2.gradientTopColor = b11[0];
                                                    photoSize2.gradientBottomColor = b11[i19];
                                                }
                                            }
                                        } else {
                                            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                                            i21 = i41;
                                            TLRPC.PhotoSize photoSize3 = r1Var.e4;
                                            imageReceiver3 = imageReceiver4;
                                            this.b = new GradientDrawable(orientation, new int[]{photoSize3.gradientTopColor, photoSize3.gradientBottomColor});
                                        }
                                    } else {
                                        imageReceiver3 = imageReceiver4;
                                        i21 = i41;
                                    }
                                    if (this.b != null) {
                                        canvas2.save();
                                        Path path = r1Var.I9;
                                        if (path != null) {
                                            path.rewind();
                                        } else {
                                            r1Var.I9 = new Path();
                                        }
                                        r1Var.I9.addRoundRect(rectF7, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), Path.Direction.CW);
                                        canvas2.clipPath(r1Var.I9);
                                        this.b.setBounds(rect);
                                        this.b.draw(canvas2);
                                        canvas2.restore();
                                    }
                                    f40 = (((r1Var.D2 - s2Var3.w()) - org.telegram.messenger.g0.L(f24)) - (y1Var2 == null ? 0.0f : r1Var.Q5.P3() ? y1Var2.h0 : -y1Var2.i0)) / f20;
                                }
                                if (r1Var.A2 != 0) {
                                    float L12 = org.telegram.messenger.g0.L(f24) + i21;
                                    s2Var3.C0(((this.r - s2Var3.w()) / f20) + f40 + L12);
                                    s2Var3.D0(i18);
                                    rectF5.set(L12, s2Var3.z(), r5 + this.r, s2Var3.A());
                                    org.telegram.ui.ActionBar.m6.M2.setColor(i0.a.o(r1Var.A2, (int) (f14 * 255.0f)));
                                    canvas2.drawRoundRect(rectF5, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.M2);
                                } else {
                                    s2Var3.C0(f40 + f23 + org.telegram.messenger.g0.L(f24));
                                    s2Var3.D0(i18);
                                }
                                if (r1Var.y2 != 17) {
                                    if (y1Var2 != null && y1Var2.t1) {
                                        if (!r1Var.x1 && r1Var.M1 != i19) {
                                            s2Var3.B0((int) org.telegram.messenger.g0.T1(y1Var2.p1, L10, y1Var2.L1));
                                        }
                                        s2Var3.C0(org.telegram.messenger.g0.T1(y1Var2.r1, s2Var3.r(), y1Var2.L1) - (s2Var3.w() / f20));
                                        s2Var3.D0(org.telegram.messenger.g0.T1(y1Var2.s1, s2Var3.s(), y1Var2.L1) - (s2Var3.v() / f20));
                                    } else if (!r1Var.x1 && r1Var.M1 != 1) {
                                        s2Var3.B0(L10);
                                    }
                                }
                                if (this.j != 0) {
                                    rectF5.set(s2Var3.x(), s2Var3.z(), s2Var3.y(), s2Var3.A());
                                    if (this.l == 0) {
                                        org.telegram.ui.ActionBar.m6.M2.setShader(null);
                                        org.telegram.ui.ActionBar.m6.M2.setColor(this.j);
                                        if (f14 != 1.0f) {
                                            org.telegram.ui.ActionBar.m6.M2.setAlpha((int) (f14 * 255.0f));
                                        }
                                    } else if (this.m == 0) {
                                        if (this.p == null) {
                                            Rect e10 = org.telegram.ui.Components.p9.e(org.telegram.ui.Components.p9.d(org.telegram.messenger.g0.s1(this.o, false)), (int) rectF5.width(), (int) rectF5.height());
                                            this.p = new LinearGradient(e10.left, e10.top, e10.right, e10.bottom, new int[]{this.j, this.l}, (float[]) null, Shader.TileMode.CLAMP);
                                        }
                                        org.telegram.ui.ActionBar.m6.M2.setShader(this.p);
                                        if (f14 != 1.0f) {
                                            org.telegram.ui.ActionBar.m6.M2.setAlpha((int) (f14 * 255.0f));
                                        }
                                    } else if (this.q == null) {
                                        cb0 cb0Var = new cb0(true, this.j, this.l, this.m, this.n);
                                        this.q = cb0Var;
                                        if (this.k < 0.0f) {
                                            s2Var3.m0(cb0Var.d());
                                        }
                                        if (!s2Var3.K()) {
                                            this.q.v(org.telegram.messenger.g0.L(4.0f));
                                        }
                                    }
                                    cb0 cb0Var2 = this.q;
                                    if (cb0Var2 != null) {
                                        cb0Var2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                                        this.q.draw(canvas2);
                                        i31 = i18;
                                        f41 = f39;
                                        i22 = i16;
                                    } else if (r1Var.A2 != 0) {
                                        i31 = i18;
                                        f41 = f39;
                                        i22 = i16;
                                        canvas2.drawRect(s2Var3.x(), s2Var3.z(), s2Var3.y(), s2Var3.A(), org.telegram.ui.ActionBar.m6.M2);
                                    } else {
                                        i31 = i18;
                                        f41 = f39;
                                        i22 = i16;
                                        canvas2.drawRoundRect(rectF5, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.M2);
                                    }
                                    org.telegram.ui.ActionBar.m6.M2.setShader(null);
                                    org.telegram.ui.ActionBar.m6.M2.setAlpha(ls.e4);
                                } else {
                                    i31 = i18;
                                    f41 = f39;
                                    i22 = i16;
                                }
                                if (r1Var.O1 && r1Var.u2 && r1Var.y2 != 9) {
                                    if (r1Var.y1) {
                                        int L13 = org.telegram.messenger.g0.L(48.0f);
                                        float f54 = L13;
                                        f26 = 2.0f;
                                        r1Var.K3 = (int) com.google.android.gms.internal.vision.e2.A(s2Var3.w(), f54, 2.0f, s2Var3.x());
                                        int v11 = (int) (((s2Var3.v() - f54) / 2.0f) + s2Var3.z());
                                        r1Var.L3 = v11;
                                        int i42 = r1Var.K3;
                                        radialProgress2.r(i42, v11, i42 + L13, L13 + v11);
                                    } else {
                                        f26 = 2.0f;
                                    }
                                    m1 m1Var3 = r1Var.Sa;
                                    if (m1Var3 == null || m1Var3.c2() == null || !r1Var.Sa.c2().f(r1Var)) {
                                        f42 = 1.0f;
                                        if (f14 != 1.0f) {
                                            s2Var3.setAlpha(f14);
                                            if (r1Var.v()) {
                                                r1Var.kb = s2Var3.g(canvas2);
                                            } else {
                                                r1Var.kb = true;
                                            }
                                            imageReceiver = imageReceiver3;
                                            if (r1Var.Q5.t2()) {
                                                imageReceiver.setAlpha(f14);
                                                r1Var.N0(canvas2);
                                                imageReceiver.setAlpha(1.0f);
                                            }
                                            s2Var3.setAlpha(1.0f);
                                        } else {
                                            imageReceiver = imageReceiver3;
                                            if (r1Var.v()) {
                                                r1Var.kb = s2Var3.g(canvas2);
                                            } else {
                                                r1Var.kb = true;
                                            }
                                            if (r1Var.Q5.t2()) {
                                                r1Var.N0(canvas2);
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
                                if (y1Var2 == null || !y1Var2.h) {
                                    f19 = f42;
                                    f25 = 6.0f;
                                    b10 = o10.b(s2Var3.v(), org.telegram.messenger.g0.L(6.0f), f41, i31);
                                } else {
                                    f19 = f42;
                                    f25 = 6.0f;
                                    b10 = o10.b(y1Var2.q0, org.telegram.messenger.g0.L(6.0f), f41, i31);
                                }
                                i18 = (int) b10;
                                if (r1Var.Q5.P3()) {
                                    TextPaint textPaint = org.telegram.ui.ActionBar.m6.Y2;
                                    int i43 = org.telegram.ui.ActionBar.m6.Wc;
                                    int i44 = (int) (f14 * 255.0f);
                                    textPaint.setColor(i0.a.o(r1Var.Y1(i43), i44));
                                    org.telegram.ui.ActionBar.m6.Z2.setColor(i0.a.o(r1Var.Y1(i43), i44));
                                } else {
                                    TextPaint textPaint2 = org.telegram.ui.ActionBar.m6.Y2;
                                    int i45 = org.telegram.ui.ActionBar.m6.Vc;
                                    int i46 = (int) (f14 * 255.0f);
                                    textPaint2.setColor(i0.a.o(r1Var.Y1(i45), i46));
                                    org.telegram.ui.ActionBar.m6.Z2.setColor(i0.a.o(r1Var.Y1(i45), i46));
                                }
                                if (r1Var.o2 != null) {
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
                                    if (y1Var2.s2) {
                                        f27 = f26;
                                        f38 = 0.0f;
                                    } else {
                                        f27 = f26;
                                        f38 = (-y1Var2.k0) + y1Var2.j0;
                                    }
                                    canvas2.translate(L14, L15 + f38);
                                    TextPaint paint = r1Var.o2.getPaint();
                                    int alpha3 = paint.getAlpha();
                                    paint.setAlpha((int) (alpha3 * f14));
                                    xh.f.f(canvas2, r1Var.o2);
                                    paint.setAlpha(alpha3);
                                    canvas2.restore();
                                    i18 += r1Var.o2.getLineBottom(r4.getLineCount() - 1);
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
                                    canvas2.translate(org.telegram.messenger.g0.L(f24) + i21 + (Math.abs(this.e) > 1 ? ((i22 - org.telegram.messenger.g0.L(20.0f)) - this.d) - this.e : 0), (i18 - org.telegram.messenger.g0.L(3.0f)) + (!y1Var2.s2 ? (-y1Var2.k0) + y1Var2.j0 : 0.0f));
                                    TextPaint paint2 = this.i.getPaint();
                                    int alpha4 = paint2.getAlpha();
                                    paint2.setAlpha((int) (alpha4 * f14));
                                    xh.f.f(canvas2, this.i);
                                    paint2.setAlpha(alpha4);
                                    canvas2.restore();
                                    i18 += this.i.getLineBottom(r4.getLineCount() - 1);
                                }
                                if (r1Var.p2 != null) {
                                    if (i18 != i24) {
                                        i18 += org.telegram.messenger.g0.L(f27);
                                    }
                                    int i47 = i18;
                                    if (i20 == 0) {
                                        i20 = i47 - org.telegram.messenger.g0.L(f19);
                                    }
                                    r1Var.Y1 = i47 - org.telegram.messenger.g0.L(3.0f);
                                    canvas2.save();
                                    canvas2.translate(org.telegram.messenger.g0.L(f24) + i21 + (Math.abs(r1Var.c2) > 1 ? ((i22 - org.telegram.messenger.g0.L(20.0f)) - r1Var.b2) - r1Var.c2 : 0), r1Var.Y1 + (!y1Var2.s2 ? (-y1Var2.k0) + y1Var2.j0 : 0.0f));
                                    if (r1Var.y0 == -10 && r1Var.u4.h(canvas2)) {
                                        r1Var.invalidate();
                                    }
                                    r1Var.m1(canvas2, -2);
                                    m1 m1Var4 = r1Var.Sa;
                                    if (m1Var4 != null && m1Var4.z2() != null && r1Var.getDelegate().z2().z(r1Var.Q5)) {
                                        r1Var.Sa.z2().Y(r1Var.Q5.P3(), r1Var.p2, canvas2);
                                    }
                                    TextPaint paint3 = r1Var.p2.getPaint();
                                    if (z13 && (gjVar = r1Var.Q5) != null && !gjVar.P3() && (ok0Var = r1Var.o8) != null) {
                                        paint3.linkColor = ok0Var.i();
                                    }
                                    int alpha5 = paint3.getAlpha();
                                    paint3.setAlpha((int) (alpha5 * f14));
                                    xh.f.f(canvas2, r1Var.p2);
                                    paint3.setAlpha(alpha5);
                                    int i48 = i24;
                                    StaticLayout staticLayout2 = r1Var.p2;
                                    imageReceiver2 = imageReceiver;
                                    s2Var = s2Var3;
                                    i26 = i22;
                                    i25 = i48;
                                    i27 = saveCount;
                                    f28 = f19;
                                    rectF2 = rectF5;
                                    y1Var = y1Var2;
                                    org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas2, staticLayout2, r1Var.Ca, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, r1Var.J1(1, staticLayout2.getPaint().getColor()));
                                    canvas2.restore();
                                    paint3.linkColor = r1Var.Y1(r1Var.Q5.P3() ? org.telegram.ui.ActionBar.m6.Yc : org.telegram.ui.ActionBar.m6.Xc);
                                    i18 = r1Var.p2.getLineBottom(r2.getLineCount() - 1) + i47;
                                } else {
                                    i25 = i24;
                                    imageReceiver2 = imageReceiver;
                                    s2Var = s2Var3;
                                    i26 = i22;
                                    rectF2 = rectF5;
                                    i27 = saveCount;
                                    f28 = f19;
                                    y1Var = y1Var2;
                                }
                                int i49 = i20;
                                if (r1Var.O1 || !z17) {
                                    f29 = f10;
                                    s2Var2 = s2Var;
                                    f30 = f27;
                                } else {
                                    if (i18 != i25) {
                                        i18 += org.telegram.messenger.g0.L(f27);
                                    }
                                    int L16 = i26 - org.telegram.messenger.g0.L(17.0f);
                                    if (r1Var.x1) {
                                        s2Var2 = s2Var;
                                        s2Var2.C0(((i21 + i26) - s2Var.w()) - org.telegram.messenger.g0.L(f25));
                                        s2Var2.D0(i49);
                                    } else {
                                        s2Var2 = s2Var;
                                        s2Var2.C0(i21 + (r1Var.U1 ? -org.telegram.messenger.g0.L(6.3f) : org.telegram.messenger.g0.L(f24)));
                                        s2Var2.D0(i18);
                                    }
                                    if (y1Var != null && y1Var.t1) {
                                        if (!r1Var.x1 && r1Var.M1 != 1) {
                                            s2Var2.B0((int) org.telegram.messenger.g0.T1(y1Var.p1, L16, y1Var.L1));
                                        }
                                        s2Var2.C0(org.telegram.messenger.g0.T1(y1Var.r1, s2Var2.r(), y1Var.L1) - (s2Var2.w() / f27));
                                        s2Var2.D0(org.telegram.messenger.g0.T1(y1Var.s1, s2Var2.s(), y1Var.L1) - (s2Var2.v() / f27));
                                    } else if (!r1Var.x1 && (i30 = r1Var.M1) != 7 && i30 != 1) {
                                        s2Var2.B0(L16);
                                    }
                                    if (r1Var.x1 || !r1Var.y1) {
                                        f30 = f27;
                                    } else {
                                        int L17 = org.telegram.messenger.g0.L(48.0f);
                                        float f55 = L17;
                                        f30 = f27;
                                        r1Var.K3 = (int) com.google.android.gms.internal.vision.e2.A(s2Var2.w(), f55, f30, s2Var2.x());
                                        int v12 = (int) (((s2Var2.v() - f55) / f30) + s2Var2.z());
                                        r1Var.L3 = v12;
                                        int i50 = r1Var.K3;
                                        radialProgress2.r(i50, v12, i50 + L17, L17 + v12);
                                    }
                                    if (r1Var.yb && MediaController.B().I(r1Var.Q5) && (j4Var = MediaController.B().M0) != null && j4Var.d && canvas2.isHardwareAccelerated()) {
                                        r1Var.kb = true;
                                        r1Var.F9 = true;
                                    } else {
                                        m1 m1Var5 = r1Var.Sa;
                                        if (m1Var5 == null || m1Var5.c2() == null || !r1Var.Sa.c2().f(r1Var)) {
                                            if (f10 != f28) {
                                                f29 = f10;
                                                s2Var2.setAlpha(f29);
                                                if (r1Var.v()) {
                                                    r1Var.kb = s2Var2.g(canvas2);
                                                } else {
                                                    r1Var.kb = true;
                                                }
                                                if (r1Var.Q5.t2()) {
                                                    ImageReceiver imageReceiver5 = imageReceiver2;
                                                    imageReceiver5.setAlpha(f29);
                                                    r1Var.N0(canvas2);
                                                    imageReceiver5.setAlpha(f28);
                                                }
                                                s2Var2.setAlpha(f28);
                                            } else {
                                                f29 = f10;
                                                if (r1Var.v()) {
                                                    r1Var.kb = s2Var2.g(canvas2);
                                                } else {
                                                    r1Var.kb = true;
                                                }
                                                if (r1Var.Q5.t2()) {
                                                    r1Var.N0(canvas2);
                                                }
                                            }
                                        }
                                    }
                                    f29 = f10;
                                }
                                i28 = r1Var.M1;
                                if (i28 != 4 || i28 == 2) {
                                    r1Var.M3 = (int) (s2Var2.x() + org.telegram.messenger.g0.L(8.0f));
                                    int z20 = (int) (s2Var2.z() + org.telegram.messenger.g0.L(8.0f));
                                    r1Var.N3 = z20;
                                    RadialProgress2 radialProgress22 = r1Var.R0;
                                    int i51 = r1Var.M3;
                                    radialProgress22.r(i51, z20, org.telegram.messenger.g0.L(24.0f) + i51, org.telegram.messenger.g0.L(24.0f) + r1Var.N3);
                                }
                                Paint a22 = r1Var.a2("paintChatTimeBackground");
                                if (this.h == null && s2Var2.H()) {
                                    int w10 = (int) (((s2Var2.w() + s2Var2.x()) - org.telegram.messenger.g0.L(8.0f)) - this.c);
                                    f31 = 8.0f;
                                    int v13 = (int) ((s2Var2.v() + s2Var2.z()) - org.telegram.messenger.g0.L(19.0f));
                                    f33 = 19.0f;
                                    f36 = 14.5f;
                                    f34 = f28;
                                    f35 = 1.5f;
                                    f32 = f30;
                                    rectF3 = rectF2;
                                    rectF3.set(w10 - org.telegram.messenger.g0.L(f22), v13 - org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(f22) + this.c + w10, org.telegram.messenger.g0.L(14.5f) + v13);
                                    int alpha6 = a22.getAlpha();
                                    a22.setAlpha((int) (alpha6 * r1Var.l4));
                                    org.telegram.ui.ActionBar.m6.J2.setAlpha((int) (r1Var.l4 * 255.0f));
                                    canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(f22), org.telegram.messenger.g0.L(f22), a22);
                                    a22.setAlpha(alpha6);
                                    canvas2.save();
                                    canvas2.translate(w10, v13);
                                    this.h.draw(canvas2);
                                    canvas2.restore();
                                    org.telegram.ui.ActionBar.m6.J2.setAlpha(ls.e4);
                                } else {
                                    f31 = 8.0f;
                                    f32 = f30;
                                    f33 = 19.0f;
                                    f34 = f28;
                                    f35 = 1.5f;
                                    rectF3 = rectF2;
                                    f36 = 14.5f;
                                }
                                if (r1Var.q2 != null && ((!r1Var.O1 || s2Var2.H()) && r1Var.A2 == 0)) {
                                    if (r1Var.T1 && !r1Var.U1 && r1Var.M1 != 8) {
                                        i29 = (int) (((s2Var2.w() + s2Var2.x()) - org.telegram.messenger.g0.L(f31)) - r1Var.Z1);
                                        i18 = (int) ((s2Var2.v() + s2Var2.z()) - org.telegram.messenger.g0.L(f33));
                                        rectF3.set(i29 - org.telegram.messenger.g0.L(f22), i18 - org.telegram.messenger.g0.L(f35), org.telegram.messenger.g0.L(f22) + r1Var.Z1 + i29, org.telegram.messenger.g0.L(f36) + i18);
                                        canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(f22), org.telegram.messenger.g0.L(f22), r1Var.a2("paintChatTimeBackground"));
                                    } else if (r1Var.O1) {
                                        i29 = i21;
                                    } else {
                                        i29 = (int) (s2Var2.x() + org.telegram.messenger.g0.L(8.5f));
                                        i18 = (int) (s2Var2.z() + org.telegram.messenger.g0.L(f25));
                                        rectF3.set(i29 - org.telegram.messenger.g0.L(f22), i18 - org.telegram.messenger.g0.L(f35), org.telegram.messenger.g0.L(f22) + r1Var.Z1 + i29, org.telegram.messenger.g0.L(r1Var.M1 == 8 ? f36 : 16.5f) + i18);
                                        canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(f22), org.telegram.messenger.g0.L(f22), a22);
                                    }
                                    canvas2.save();
                                    canvas2.translate(i29, i18);
                                    if (r1Var.U1) {
                                        if (r1Var.O1) {
                                            org.telegram.ui.ActionBar.m6.L2.setColor(r1Var.Y1(org.telegram.ui.ActionBar.m6.Ad));
                                        } else if (r1Var.Q5.P3()) {
                                            org.telegram.ui.ActionBar.m6.L2.setColor(r1Var.Y1(org.telegram.ui.ActionBar.m6.Wc));
                                        } else {
                                            org.telegram.ui.ActionBar.m6.L2.setColor(r1Var.Y1(org.telegram.ui.ActionBar.m6.Vc));
                                        }
                                    }
                                    r1Var.q2.draw(canvas2);
                                    canvas2.restore();
                                }
                                r1Var.A1(canvas2, r1Var.o8.i());
                                int i52 = i21;
                                r1Var.P.b(canvas2, r1Var.Ua, i52, r1Var.Qb);
                                r1Var.Q.b(canvas2, r1Var.Ua, i52, r1Var.Qb);
                                if (r1Var.u2) {
                                    if (r1Var.Q5.P3()) {
                                        int Y1 = r1Var.Y1(org.telegram.ui.ActionBar.m6.Ob);
                                        if (r1Var.m8 == null) {
                                            if (r1Var.y2 == 27) {
                                                r1Var.m8 = r1Var.getContext().getResources().getDrawable(R.drawable.mini_call_join).mutate();
                                            } else {
                                                r1Var.m8 = r1Var.Z1("drawableMsgOutInstant");
                                            }
                                            Drawable drawable2 = r1Var.m8;
                                            r1Var.l8 = Y1;
                                            drawable2.setColorFilter(new PorterDuffColorFilter(Y1, PorterDuff.Mode.SRC_IN));
                                        }
                                        if (r1Var.l8 != Y1) {
                                            Drawable drawable3 = r1Var.m8;
                                            r1Var.l8 = Y1;
                                            drawable3.setColorFilter(new PorterDuffColorFilter(Y1, PorterDuff.Mode.SRC_IN));
                                        }
                                        drawable = r1Var.m8;
                                        org.telegram.ui.ActionBar.m6.M2.setColor(Y1);
                                        org.telegram.ui.ActionBar.m6.Y1.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, Y1));
                                        q80 q80Var = this.s;
                                        if (q80Var != null) {
                                            q80Var.g(org.telegram.ui.ActionBar.m6.r1(0.1f, Y1), org.telegram.ui.ActionBar.m6.r1(0.3f, Y1), org.telegram.ui.ActionBar.m6.r1(0.3f, Y1), org.telegram.ui.ActionBar.m6.r1(1.2f, Y1));
                                        }
                                    } else {
                                        int Y12 = r1Var.Y1(org.telegram.ui.ActionBar.m6.Bd);
                                        if (r1Var.o8 != null && !r1Var.Q5.G4()) {
                                            Y12 = r1Var.o8.i();
                                        }
                                        if (r1Var.m8 == null) {
                                            int i53 = r1Var.y2;
                                            if (i53 == 16) {
                                                r1Var.m8 = r1Var.getContext().getResources().getDrawable(R.drawable.mini_external_link).mutate();
                                            } else if (i53 == 27) {
                                                r1Var.m8 = r1Var.getContext().getResources().getDrawable(R.drawable.mini_call_join).mutate();
                                            } else {
                                                r1Var.m8 = r1Var.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                                            }
                                            Drawable drawable4 = r1Var.m8;
                                            r1Var.l8 = Y12;
                                            drawable4.setColorFilter(new PorterDuffColorFilter(Y12, PorterDuff.Mode.SRC_IN));
                                        }
                                        if (r1Var.l8 != Y12) {
                                            Drawable drawable5 = r1Var.m8;
                                            r1Var.l8 = Y12;
                                            drawable5.setColorFilter(new PorterDuffColorFilter(Y12, PorterDuff.Mode.SRC_IN));
                                        }
                                        drawable = r1Var.m8;
                                        org.telegram.ui.ActionBar.m6.M2.setColor(Y12);
                                        org.telegram.ui.ActionBar.m6.Y1.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, Y12));
                                        q80 q80Var2 = this.s;
                                        if (q80Var2 != null) {
                                            q80Var2.g(org.telegram.ui.ActionBar.m6.r1(0.1f, Y12), org.telegram.ui.ActionBar.m6.r1(0.3f, Y12), org.telegram.ui.ActionBar.m6.r1(0.3f, Y12), org.telegram.ui.ActionBar.m6.r1(1.2f, Y12));
                                        }
                                    }
                                    Drawable drawable6 = drawable;
                                    if (z13) {
                                        int L18 = org.telegram.messenger.g0.L(14.0f) + i25 + i38;
                                        int alpha7 = org.telegram.ui.ActionBar.m6.M2.getAlpha();
                                        org.telegram.ui.ActionBar.m6.M2.setAlpha((int) (alpha7 * 0.18f));
                                        canvas2.drawRect(org.telegram.messenger.g0.L(f24) + i52, org.telegram.messenger.g0.L(f32) + r0, (i52 + i26) - org.telegram.messenger.g0.L(7.0f), Math.max(1, org.telegram.messenger.g0.L(0.66f)) + org.telegram.messenger.g0.L(f32) + r0, org.telegram.ui.ActionBar.m6.M2);
                                        org.telegram.ui.ActionBar.m6.M2.setAlpha(alpha7);
                                        int i54 = r1Var.y2;
                                        if (i54 == 27) {
                                            f47 = 20.0f;
                                        } else if (i54 == 0) {
                                            f47 = 15.0f;
                                        }
                                        float L19 = org.telegram.messenger.g0.L(f47) + r1Var.s2;
                                        float A = com.google.android.gms.internal.vision.e2.A(i26, L19, f32, f23);
                                        int i55 = r1Var.y2;
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
                                            if (r1Var.r2 != null) {
                                                canvas2.save();
                                                canvas2.translate(A - r1Var.t2, L18);
                                                xh.f.f(canvas2, r1Var.r2);
                                                canvas2.restore();
                                            }
                                        }
                                        A += L3;
                                        if (r1Var.r2 != null) {
                                        }
                                    } else {
                                        float f56 = f23;
                                        int L27 = org.telegram.messenger.g0.L(r1Var.Q5.G4() ? -5.0f : f24) + i25 + i38;
                                        q80 q80Var3 = this.s;
                                        if (q80Var3 != null && !z11 && !q80Var3.c() && !this.s.d()) {
                                            this.s.a();
                                        }
                                        q80 q80Var4 = this.s;
                                        if (q80Var4 == null && z11) {
                                            q80 q80Var5 = new q80();
                                            this.s = q80Var5;
                                            q80Var5.x.setStrokeWidth(org.telegram.messenger.g0.L(1.25f));
                                            this.s.D = true;
                                        } else if (q80Var4 != null && z11 && (q80Var4.c() || this.s.d())) {
                                            q80 q80Var6 = this.s;
                                            q80Var6.b = -1L;
                                            q80Var6.c = -1L;
                                        }
                                        RectF rectF8 = rectF;
                                        rectF8.set(f56, L27, i52 + r1Var.D2, org.telegram.messenger.g0.L(36.0f) + L27);
                                        float a12 = r1Var.H2.a(0.02f);
                                        boolean z21 = a12 != f34;
                                        if (z21) {
                                            canvas2.save();
                                            canvas2.scale(a12, a12, rectF8.centerX(), rectF8.centerY());
                                        }
                                        r1Var.L2[0] = 0;
                                        r1Var.A0(0);
                                        r1Var.J2[0].setBounds(i52, L27, r1Var.D2 + i52, org.telegram.messenger.g0.L(36.0f) + L27);
                                        r1Var.J2[0].draw(canvas2);
                                        q80 q80Var7 = this.s;
                                        if (q80Var7 == null || q80Var7.c()) {
                                            f37 = f25;
                                        } else {
                                            this.s.e(rectF8);
                                            f37 = f25;
                                            this.s.k(f37);
                                            this.s.draw(canvas2);
                                            r1Var.invalidate();
                                        }
                                        canvas2.drawRoundRect(rectF8, org.telegram.messenger.g0.L(f37), org.telegram.messenger.g0.L(f37), org.telegram.ui.ActionBar.m6.Y1);
                                        int i62 = r1Var.y2;
                                        if (i62 == 0) {
                                            int L28 = ((r1Var.C2 + r1Var.B2) + i52) - org.telegram.messenger.g0.L(15.0f);
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
                                        if (r1Var.r2 != null) {
                                            canvas2.save();
                                            canvas2.translate(i52 + r1Var.B2, org.telegram.messenger.g0.L(10.5f) + L27);
                                            xh.f.f(canvas2, r1Var.r2);
                                            canvas2.restore();
                                        }
                                        if (z21) {
                                            canvas2.restore();
                                        }
                                    }
                                }
                                canvas2.restoreToCount(i27);
                            }
                            if (y1Var2 == null || !y1Var2.t1) {
                                f22 = 4.0f;
                            } else {
                                f22 = 4.0f;
                                i18 = (int) com.google.android.gms.internal.vision.e2.z(f19, y1Var2.L1, (i18 != i17 ? org.telegram.messenger.g0.L(f20) : 0) + y1Var2.q1 + org.telegram.messenger.g0.L(6.0f), i18);
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
                        if (r1Var.Q5.P3()) {
                        }
                        if (r1Var.o2 != null) {
                        }
                        if (this.i != null) {
                        }
                        if (r1Var.p2 != null) {
                        }
                        int i492 = i20;
                        if (r1Var.O1) {
                        }
                        f29 = f10;
                        s2Var2 = s2Var;
                        f30 = f27;
                        i28 = r1Var.M1;
                        if (i28 != 4) {
                        }
                        r1Var.M3 = (int) (s2Var2.x() + org.telegram.messenger.g0.L(8.0f));
                        int z202 = (int) (s2Var2.z() + org.telegram.messenger.g0.L(8.0f));
                        r1Var.N3 = z202;
                        RadialProgress2 radialProgress222 = r1Var.R0;
                        int i512 = r1Var.M3;
                        radialProgress222.r(i512, z202, org.telegram.messenger.g0.L(24.0f) + i512, org.telegram.messenger.g0.L(24.0f) + r1Var.N3);
                        Paint a222 = r1Var.a2("paintChatTimeBackground");
                        if (this.h == null) {
                        }
                        f31 = 8.0f;
                        f32 = f30;
                        f33 = 19.0f;
                        f34 = f28;
                        f35 = 1.5f;
                        rectF3 = rectF2;
                        f36 = 14.5f;
                        if (r1Var.q2 != null) {
                            if (r1Var.T1) {
                            }
                            if (r1Var.O1) {
                            }
                            canvas2.save();
                            canvas2.translate(i29, i18);
                            if (r1Var.U1) {
                            }
                            r1Var.q2.draw(canvas2);
                            canvas2.restore();
                        }
                        r1Var.A1(canvas2, r1Var.o8.i());
                        int i522 = i21;
                        r1Var.P.b(canvas2, r1Var.Ua, i522, r1Var.Qb);
                        r1Var.Q.b(canvas2, r1Var.Ua, i522, r1Var.Qb);
                        if (r1Var.u2) {
                        }
                        canvas2.restoreToCount(i27);
                    }
                    i10 = r1Var.q0 - org.telegram.messenger.g0.L(2.0f);
                    i12 = r1Var.p0;
                    L2 = org.telegram.messenger.g0.L(1.0f);
                }
                i13 = L2 + i12;
            }
            i11 = i13;
            f12 = 1.0f;
            f13 = i11;
            i14 = (int) (backgroundDrawableRight - f13);
            int i372 = r1Var.W1;
            if (y1Var2 == null) {
            }
            i15 = i11;
            int i382 = i372;
            if (r1Var.o8 == null) {
            }
            org.telegram.ui.ActionBar.m6.Y2.setColor(r1Var.o8.a(r1Var.Q5, r1Var.ja, r1Var.ka, r1Var.Qb, 3));
            ok0 ok0Var22 = r1Var.o8;
            int i392 = r1Var.y2;
            ok0Var22.o((i392 != 23 || i392 == 24 || i392 == 28) ? 0.5f : f12);
            if (r1Var.Q5.r4()) {
            }
            if (!z15) {
            }
            if (z15) {
            }
            m1 m1Var6 = r1Var.Sa;
            if (m1Var6 == null) {
            }
            if (r1Var.U1) {
            }
            f14 = f10;
            i16 = i14;
            i17 = i10;
            z11 = z10;
            f15 = f13;
            f16 = f11;
            rectF = rectF4;
            z12 = true;
            z13 = false;
            if (r1Var.O1) {
            }
            f17 = 1.0f;
            f18 = 2.0f;
            i18 = i17;
            if (r1Var.g2 == null) {
            }
            if (!r1Var.T1) {
            }
            int C2 = org.telegram.messenger.f3.C(4.0f, r1Var.Q5.W5(y1Var2), i17);
            i18 = org.telegram.messenger.f3.C(4.0f, r1Var.Q5.W5(y1Var2), i18);
            i17 = C2;
            if (r1Var.O1) {
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
            if (r1Var.Q5.P3()) {
            }
            if (r1Var.o2 != null) {
            }
            if (this.i != null) {
            }
            if (r1Var.p2 != null) {
            }
            int i4922 = i20;
            if (r1Var.O1) {
            }
            f29 = f10;
            s2Var2 = s2Var;
            f30 = f27;
            i28 = r1Var.M1;
            if (i28 != 4) {
            }
            r1Var.M3 = (int) (s2Var2.x() + org.telegram.messenger.g0.L(8.0f));
            int z2022 = (int) (s2Var2.z() + org.telegram.messenger.g0.L(8.0f));
            r1Var.N3 = z2022;
            RadialProgress2 radialProgress2222 = r1Var.R0;
            int i5122 = r1Var.M3;
            radialProgress2222.r(i5122, z2022, org.telegram.messenger.g0.L(24.0f) + i5122, org.telegram.messenger.g0.L(24.0f) + r1Var.N3);
            Paint a2222 = r1Var.a2("paintChatTimeBackground");
            if (this.h == null) {
            }
            f31 = 8.0f;
            f32 = f30;
            f33 = 19.0f;
            f34 = f28;
            f35 = 1.5f;
            rectF3 = rectF2;
            f36 = 14.5f;
            if (r1Var.q2 != null) {
            }
            r1Var.A1(canvas2, r1Var.o8.i());
            int i5222 = i21;
            r1Var.P.b(canvas2, r1Var.Ua, i5222, r1Var.Qb);
            r1Var.Q.b(canvas2, r1Var.Ua, i5222, r1Var.Qb);
            if (r1Var.u2) {
            }
            canvas2.restoreToCount(i27);
        }
    }
}
