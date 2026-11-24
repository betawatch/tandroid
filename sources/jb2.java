// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jb2 {
    public final gb2 a;
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
    public ye7 q;
    public int r;
    public r86 s;
    public Path t;
    public Paint u;
    public boolean v;
    public n41 w;
    public ff0 x;

    public jb2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0acf  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0bc7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0cf3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0e4d  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0e8b  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0f27  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0feb  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0f91  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0fdd  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x1043  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x1276  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x1314  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x1319  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x1379  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x1462  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x147e  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x13a5  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x1316  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0ce4  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x063d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, float f) {
        float f2;
        int L;
        int extraTextX;
        int i;
        int L2;
        int U1;
        int i2;
        int L3;
        float f3;
        int i3;
        int i4;
        n79 n79Var;
        byte b;
        boolean z;
        float f4;
        int i5;
        int i6;
        float f5;
        boolean z2;
        RectF rectF;
        int i7;
        byte b2;
        int i8;
        float f6;
        boolean z3;
        int i9;
        float f7;
        int i10;
        float f8;
        int i11;
        int i12;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        int i13;
        ImageReceiver imageReceiver;
        int i14;
        float f14;
        ImageReceiver imageReceiver2;
        nb2 nb2Var;
        int i15;
        RectF rectF2;
        int i16;
        ml mlVar;
        float f15;
        float f16;
        byte b3;
        float f17;
        float f18;
        float f19;
        float f20;
        RectF rectF3;
        float f21;
        Drawable drawable;
        Drawable mutate;
        float f22;
        boolean z4;
        r86 r86Var;
        float f23;
        byte b4;
        int L4;
        Drawable b22;
        boolean z5;
        int i17;
        byte b5;
        float f24;
        ix ixVar;
        k27 k27Var;
        n79 n79Var2;
        float f25;
        ImageReceiver imageReceiver3;
        int i18;
        float f26;
        int i19;
        float f27;
        float v;
        float f28;
        float f29;
        int i20;
        float f30;
        byte b6;
        ix ixVar2;
        float f31;
        float f32;
        float f33;
        float f34;
        float f35;
        int i21;
        Canvas canvas2 = canvas;
        gb2 gb2Var = this.a;
        RadialProgress2 radialProgress2 = gb2Var.Q0;
        ImageReceiver imageReceiver4 = gb2Var.V0;
        RectF rectF4 = gb2Var.M2;
        RectF rectF5 = gb2Var.c4;
        nb2 nb2Var2 = gb2Var.ub;
        ml mlVar2 = gb2Var.U0;
        if (gb2Var.Q5.q4() || gb2Var.Q5.F4() || gb2Var.R1 || gb2Var.T1 || gb2Var.U1) {
            int saveCount = canvas2.getSaveCount();
            float backgroundDrawableRight = ((gb2Var.getBackgroundDrawableRight() + (nb2Var2 != null ? nb2Var2.i0 : 0.0f)) - gl.L(10 + ((!gb2Var.Q5.O3() || gb2Var.C6 || gb2Var.K) ? 0 : 6))) - gb2Var.getExtraTextX();
            if (gb2Var.T1) {
                U1 = gl.L(14.0f) + gb2Var.gb;
                L2 = gb2Var.p0 - gl.L(10.0f);
            } else {
                if (gb2Var.U1) {
                    U1 = gb2Var.gb + gl.L(14.0f);
                    i2 = gb2Var.p0;
                    L3 = gl.L(1.0f);
                } else {
                    if (!gb2Var.Q5.q4()) {
                        if (gb2Var.Q5.O3()) {
                            i = gb2Var.getExtraTextX() + gl.L(12.0f) + gb2Var.N6;
                            f2 = 1.0f;
                            if (gb2Var.Q5.D == 19) {
                                i -= Math.max(0, (gl.L(14.0f) + (Math.max(gb2Var.X7, gb2Var.Z7) + i)) - gl.q.x);
                            }
                        } else {
                            f2 = 1.0f;
                            boolean z6 = gb2Var.C6;
                            int i22 = gb2Var.N6;
                            if (z6) {
                                L = gl.L(12.0f) + i22;
                                extraTextX = gb2Var.getExtraTextX();
                            } else {
                                L = gl.L(gb2Var.K ? 12.0f : 18.0f) + i22;
                                extraTextX = gb2Var.getExtraTextX();
                            }
                            i = L + extraTextX;
                        }
                        L2 = ((int) (i + nb2Var2.h0)) - gl.L(1.33f);
                        int i23 = gb2Var.q0;
                        U1 = nb2Var2.s2 ? gl.U1(nb2Var2.L1, nb2Var2.r2, i23) : i23;
                        f3 = L2;
                        i3 = (int) (backgroundDrawableRight - f3);
                        int i24 = gb2Var.W1;
                        if (nb2Var2 == null && nb2Var2.J1) {
                            i4 = L2;
                            i24 = gl.U1(nb2Var2.L1, nb2Var2.I1, i24);
                        } else {
                            i4 = L2;
                        }
                        int i25 = i24;
                        n79Var = gb2Var.o8;
                        if (n79Var == null) {
                            n79Var = new n79(gb2Var);
                            gb2Var.o8 = n79Var;
                        }
                        bkb.X2.setColor(n79Var.a(gb2Var.Q5, gb2Var.va, gb2Var.wa, gb2Var.cc, 3));
                        n79 n79Var3 = gb2Var.o8;
                        byte b7 = gb2Var.y2;
                        n79Var3.r = (b7 != 23 || b7 == 24 || b7 == 28) ? 0.5f : f2;
                        boolean z7 = (gb2Var.Q5.q4() || gb2Var.x1) ? false : true;
                        boolean z8 = !(!z7 || !gb2Var.u2 || (b = gb2Var.y2) == 26 || b == 9 || b == 2 || b == 13 || b == 11 || b == 25 || b == 1 || b == 29 || b == 18 || b == 22) || ((b = gb2Var.y2) == 6 && this.j != 0);
                        boolean z9 = z7 && (!gb2Var.u2 || b == 9 || b == 2 || b == 11 || b == 25 || b == 13 || b == 1 || b == 29 || b == 18 || b == 22 || b == 32 || gb2Var.x1 || b == 26);
                        bb2 bb2Var = gb2Var.eb;
                        z = bb2Var == null && bb2Var.A1(gb2Var, 2);
                        if (!gb2Var.U1 || gb2Var.Q5.v3() || gb2Var.Q5.F4()) {
                            f4 = f;
                            i5 = i3;
                            i6 = U1;
                            f5 = f3;
                            z2 = z;
                            rectF = rectF4;
                            i7 = i4;
                            b2 = 1;
                            i8 = 0;
                            f6 = 10.0f;
                            z3 = false;
                        } else {
                            if (this.w == null) {
                                f31 = 2.0f;
                                this.w = new n41(gb2Var, 2.0f, 2.0f);
                            } else {
                                f31 = 2.0f;
                            }
                            canvas2.save();
                            float f36 = f31;
                            float a = this.w.a(0.01f);
                            canvas2.scale(a, a, (i3 / f36) + f3, ((i25 + (gb2Var.u2 ? gl.L(42.0f) : 0)) / f36) + U1);
                            RectF rectF6 = gl.P;
                            rectF6.set(f3, U1 - gl.L(6.0f), i4 + i3, U1 + i25 + (gb2Var.u2 ? gl.L(42.0f) : 0));
                            gb2Var.o8.o(z);
                            float floor = (float) Math.floor(gba.U0 / (gb2Var.Q5.q4() ? f36 : 3.0f));
                            n79 n79Var4 = gb2Var.o8;
                            if (z8) {
                                boolean z10 = nb2Var2.t1;
                                boolean z11 = gb2Var.x1;
                                if (z10) {
                                    f34 = nb2Var2.L1;
                                    if (!z11) {
                                        f34 = f2 - f34;
                                    }
                                } else {
                                    f34 = z11 ? f2 : 0.0f;
                                }
                                float f37 = f2 - f34;
                                f32 = floor;
                                float L5 = gl.L(18.0f) + mlVar2.O0;
                                StaticLayout staticLayout = gb2Var.g2;
                                if (staticLayout != null) {
                                    f35 = f37;
                                    i21 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                                } else {
                                    f35 = f37;
                                    i21 = 0;
                                }
                                f33 = (L5 + i21) * f35;
                            } else {
                                f32 = floor;
                                f33 = 0.0f;
                            }
                            n79Var4.j(f33);
                            i6 = U1;
                            f5 = f3;
                            z2 = z;
                            rectF = rectF4;
                            i7 = i4;
                            i5 = i3;
                            float f38 = f32;
                            f6 = 10.0f;
                            n79Var4.c(f38, f32, f32, f, canvas, rectF6);
                            int i26 = gb2Var.o8.x;
                            ff0 ff0Var = this.x;
                            if (ff0Var == null) {
                                gb2Var.db = i26;
                                ff0 Y = bkb.Y(i26, 0, 0);
                                this.x = Y;
                                Y.setCallback(gb2Var);
                                bkb.D1(this.x, 3.0f, 6.0f, 6.0f, 3.0f);
                                this.x.setCallback(gb2Var);
                            } else if (gb2Var.db != i26) {
                                gb2Var.db = i26;
                                bkb.F1(ff0Var, i26, true);
                            }
                            i8 = 0;
                            this.x.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                            this.x.draw(canvas);
                            gb2Var.o8.f(canvas, rectF6, f);
                            b2 = 1;
                            gb2Var.o8.g(f38, f38, f38, f, canvas, rectF6);
                            f4 = f;
                            canvas2 = canvas;
                            z3 = true;
                        }
                        if (gb2Var.O1 || !z7) {
                            i9 = i6;
                            f7 = 1.0f;
                            i10 = i9;
                        } else {
                            int L6 = i5 - gl.L(17.0f);
                            if (gb2Var.x1) {
                                mlVar2.L0 = ((i7 + i5) - mlVar2.N0) - gl.L(6.0f);
                                mlVar2.M0 = 0.0f;
                                i9 = i6;
                            } else {
                                mlVar2.L0 = (gb2Var.U1 ? -gl.L(6.3f) : gl.L(f6)) + i7;
                                i9 = i6;
                                mlVar2.M0 = i9;
                            }
                            if (nb2Var2 == null || !nb2Var2.t1) {
                                f30 = 2.0f;
                                if (!gb2Var.x1 && (b6 = gb2Var.M1) != 7 && b6 != b2) {
                                    mlVar2.l0(L6);
                                }
                            } else {
                                if (!gb2Var.x1 && gb2Var.M1 != b2) {
                                    mlVar2.l0((int) gl.R1(nb2Var2.p1, L6, nb2Var2.L1));
                                }
                                mlVar2.L0 = gl.R1(nb2Var2.r1, mlVar2.r(), nb2Var2.L1) - (mlVar2.N0 / 2.0f);
                                f30 = 2.0f;
                                mlVar2.M0 = gl.R1(nb2Var2.s1, mlVar2.s(), nb2Var2.L1) - (mlVar2.O0 / 2.0f);
                            }
                            if (!gb2Var.x1 && gb2Var.y1) {
                                int L7 = gl.L(48.0f);
                                float f39 = L7;
                                float f40 = f30;
                                int z12 = (int) oo1.z(mlVar2.N0, f39, f40, mlVar2.L0);
                                gb2Var.K3 = z12;
                                int z13 = (int) oo1.z(mlVar2.O0, f39, f40, mlVar2.M0);
                                gb2Var.L3 = z13;
                                radialProgress2.p(z12, z13, z12 + L7, z13 + L7);
                            }
                            if (gb2Var.Kb && MediaController.w().D(gb2Var.Q5) && (ixVar2 = MediaController.w().M0) != null && ixVar2.d && canvas2.isHardwareAccelerated()) {
                                gb2Var.wb = true;
                                gb2Var.R9 = true;
                            } else {
                                bb2 bb2Var2 = gb2Var.eb;
                                if (bb2Var2 == null || bb2Var2.Z1() == null || !gb2Var.eb.Z1().f(gb2Var)) {
                                    f7 = 1.0f;
                                    if (f4 != 1.0f) {
                                        mlVar2.setAlpha(f4);
                                        if (gb2Var.x()) {
                                            gb2Var.wb = mlVar2.g(canvas2);
                                        } else {
                                            gb2Var.wb = true;
                                        }
                                        if (gb2Var.Q5.t2()) {
                                            imageReceiver4.setAlpha(f4);
                                            gb2Var.N0(canvas2);
                                            imageReceiver4.setAlpha(1.0f);
                                        }
                                        mlVar2.setAlpha(1.0f);
                                    } else {
                                        if (gb2Var.x()) {
                                            gb2Var.wb = mlVar2.g(canvas2);
                                        } else {
                                            gb2Var.wb = true;
                                        }
                                        if (gb2Var.Q5.t2()) {
                                            gb2Var.N0(canvas2);
                                        }
                                    }
                                    i10 = (int) (mlVar2.O0 + gl.L(6.0f) + i9);
                                }
                            }
                            f7 = 1.0f;
                            i10 = (int) (mlVar2.O0 + gl.L(6.0f) + i9);
                        }
                        if (gb2Var.g2 == null) {
                            if (gb2Var.h2 != null) {
                                i10 += gl.L(f7);
                            }
                            int L8 = i10 - gl.L(f7);
                            int alpha = bkb.X2.getAlpha();
                            f8 = f7;
                            if (f4 != f7) {
                                bkb.X2.setAlpha((int) (alpha * f4));
                            }
                            canvas2.save();
                            if (Math.abs(gb2Var.d2) > f8) {
                                f29 = ((i5 - gl.L(gb2Var.U1 ? 0.0f : 20.0f)) - gb2Var.f2) - gb2Var.d2;
                            } else {
                                f29 = 0.0f;
                            }
                            float f41 = f5;
                            float L9 = f29 + (gb2Var.U1 ? i8 : gl.L(f6)) + f41;
                            i11 = L8;
                            canvas2.translate(L9, i10 - gl.L(f8));
                            qla.f(canvas2, gb2Var.g2);
                            canvas2.restore();
                            if (gb2Var.h2 != null) {
                                float L10 = L9 + gb2Var.e2 + gl.L(12.0f);
                                gb2Var.k2 = L10;
                                gb2Var.l2 = i10;
                                i20 = i10;
                                f5 = f41;
                                rectF5.set(L10 - gl.L(6.0f), gb2Var.l2 - gl.L(2.0f), gb2Var.k2 + gb2Var.i2 + gl.L(6.0f), gb2Var.l2 + gb2Var.j2 + gl.L(2.0f));
                                n41 n41Var = gb2Var.n2;
                                if (n41Var == null) {
                                    n41Var = new n41(gb2Var);
                                    gb2Var.n2 = n41Var;
                                }
                                float a2 = n41Var.a(0.1f);
                                int i27 = a2 != f8 ? 1 : i8;
                                if (i27 != 0) {
                                    canvas2.save();
                                    canvas2.scale(a2, a2, rectF5.centerX(), rectF5.centerY());
                                }
                                bkb.L2.setColor(bkb.X2.getColor());
                                int alpha2 = bkb.L2.getAlpha();
                                bkb.L2.setAlpha((int) (alpha * 0.11f));
                                int i28 = i27;
                                canvas2.drawRoundRect(rectF5, rectF5.height(), rectF5.height(), bkb.L2);
                                bkb.L2.setAlpha(alpha2);
                                bkb.b3.setColor(bkb.X2.getColor());
                                bkb.b3.setAlpha(bkb.X2.getAlpha());
                                canvas2.save();
                                canvas2.translate(gb2Var.k2, gb2Var.l2);
                                gb2Var.h2.draw(canvas2);
                                canvas2.restore();
                                if (i28 != 0) {
                                    canvas2.restore();
                                }
                            } else {
                                i20 = i10;
                                f5 = f41;
                            }
                            i10 = gb2Var.g2.getLineBottom(r2.getLineCount() - 1) + i20;
                            bkb.X2.setAlpha(alpha);
                        } else {
                            f8 = f7;
                            i11 = i8;
                        }
                        if ((!gb2Var.T1 || gb2Var.U1) && gb2Var.Q5.V5(nb2Var2) != 0) {
                            i9 = de9.w(4.0f, gb2Var.Q5.V5(nb2Var2), i9);
                            i10 = de9.w(4.0f, gb2Var.Q5.V5(nb2Var2), i10);
                        }
                        int i29 = i9;
                        if (gb2Var.O1 && z8) {
                            if (gb2Var.x1) {
                                float f42 = (nb2Var2 == null || !nb2Var2.t1) ? 1.0f : nb2Var2.L1;
                                if (i10 != i29) {
                                    i10 = (int) ((gl.L(2.0f) * f42) + i10);
                                }
                                int L11 = i5 - gl.L(17.0f);
                                f9 = 4.0f;
                                if (gb2Var.x1 || gb2Var.y2 != 17) {
                                    f25 = f42;
                                    i12 = i7;
                                    imageReceiver3 = imageReceiver4;
                                    f10 = f6;
                                    i18 = i29;
                                    f26 = 0.0f;
                                } else {
                                    Rect rect = gl.Q;
                                    int L12 = gl.L(f6) + i7;
                                    imageReceiver3 = imageReceiver4;
                                    float f43 = f6;
                                    i18 = i29;
                                    f10 = f43;
                                    rect.set(L12, i10, de9.w(f43, i7, L11), ((int) mlVar2.O0) + i10);
                                    RectF rectF7 = gl.P;
                                    rectF7.set(rect);
                                    if (this.b == null) {
                                        TLRPC.PhotoSize photoSize = gb2Var.e4;
                                        if (photoSize == null || photoSize.gradientTopColor == 0 || photoSize.gradientBottomColor == 0) {
                                            f25 = f42;
                                            i12 = i7;
                                            if (mlVar2.n() != null) {
                                                int[] b8 = kee.b(mlVar2.n(), bkb.h1());
                                                this.b = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b8);
                                                TLRPC.PhotoSize photoSize2 = gb2Var.e4;
                                                if (photoSize2 != null) {
                                                    photoSize2.gradientTopColor = b8[i8];
                                                    photoSize2.gradientBottomColor = b8[1];
                                                }
                                            }
                                        } else {
                                            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                                            f25 = f42;
                                            TLRPC.PhotoSize photoSize3 = gb2Var.e4;
                                            i12 = i7;
                                            this.b = new GradientDrawable(orientation, new int[]{photoSize3.gradientTopColor, photoSize3.gradientBottomColor});
                                        }
                                    } else {
                                        f25 = f42;
                                        i12 = i7;
                                    }
                                    if (this.b != null) {
                                        canvas2.save();
                                        Path path = gb2Var.U9;
                                        if (path != null) {
                                            path.rewind();
                                        } else {
                                            gb2Var.U9 = new Path();
                                        }
                                        gb2Var.U9.addRoundRect(rectF7, gl.L(4.0f), gl.L(4.0f), Path.Direction.CW);
                                        canvas2.clipPath(gb2Var.U9);
                                        this.b.setBounds(rect);
                                        this.b.draw(canvas2);
                                        canvas2.restore();
                                    }
                                    f26 = (((gb2Var.D2 - mlVar2.N0) - gl.L(f10)) - (nb2Var2 == null ? 0.0f : gb2Var.Q5.O3() ? nb2Var2.h0 : -nb2Var2.i0)) / 2.0f;
                                }
                                if (gb2Var.A2 != 0) {
                                    float L13 = gl.L(f10) + i12;
                                    mlVar2.L0 = oo1.z(this.r, mlVar2.N0, 2.0f, f26 + L13);
                                    float f44 = i10;
                                    mlVar2.M0 = f44;
                                    rectF5.set(L13, f44, r5 + r10, mlVar2.x());
                                    bkb.L2.setColor(bm2.o(gb2Var.A2, (int) (f4 * 255.0f)));
                                    canvas2.drawRoundRect(rectF5, gl.L(4.0f), gl.L(4.0f), bkb.L2);
                                } else {
                                    mlVar2.L0 = f26 + f5 + gl.L(f10);
                                    mlVar2.M0 = i10;
                                }
                                if (gb2Var.y2 != 17) {
                                    if (nb2Var2 != null && nb2Var2.t1) {
                                        if (!gb2Var.x1 && gb2Var.M1 != 1) {
                                            mlVar2.l0((int) gl.R1(nb2Var2.p1, L11, nb2Var2.L1));
                                        }
                                        mlVar2.L0 = gl.R1(nb2Var2.r1, mlVar2.r(), nb2Var2.L1) - (mlVar2.N0 / 2.0f);
                                        mlVar2.M0 = gl.R1(nb2Var2.s1, mlVar2.s(), nb2Var2.L1) - (mlVar2.O0 / 2.0f);
                                    } else if (!gb2Var.x1 && gb2Var.M1 != 1) {
                                        mlVar2.l0(L11);
                                    }
                                }
                                if (this.j != 0) {
                                    rectF5.set(mlVar2.L0, mlVar2.M0, mlVar2.w(), mlVar2.x());
                                    if (this.l == 0) {
                                        f12 = 0.0f;
                                        bkb.L2.setShader(null);
                                        bkb.L2.setColor(this.j);
                                        if (f4 != 1.0f) {
                                            bkb.L2.setAlpha((int) (f4 * 255.0f));
                                        }
                                    } else if (this.m == 0) {
                                        f12 = 0.0f;
                                        LinearGradient linearGradient = this.p;
                                        if (linearGradient == null) {
                                            Rect d = wd0.d(wd0.c(gl.q1(this.o, i8)), (int) rectF5.width(), (int) rectF5.height());
                                            linearGradient = new LinearGradient(d.left, d.top, d.right, d.bottom, new int[]{this.j, this.l}, (float[]) null, Shader.TileMode.CLAMP);
                                            this.p = linearGradient;
                                        }
                                        bkb.L2.setShader(linearGradient);
                                        if (f4 != 1.0f) {
                                            bkb.L2.setAlpha((int) (f4 * 255.0f));
                                        }
                                    } else if (this.q == null) {
                                        ye7 ye7Var = new ye7(true, this.j, this.l, this.m, this.n);
                                        this.q = ye7Var;
                                        f12 = 0.0f;
                                        if (this.k < 0.0f) {
                                            mlVar2.W(ye7Var.k);
                                        }
                                        if (!mlVar2.D()) {
                                            this.q.u(gl.L(4.0f));
                                        }
                                    } else {
                                        f12 = 0.0f;
                                    }
                                    ye7 ye7Var2 = this.q;
                                    if (ye7Var2 != null) {
                                        ye7Var2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                                        this.q.draw(canvas2);
                                        i19 = i10;
                                        i13 = i18;
                                        i14 = i5;
                                        f27 = f25;
                                    } else if (gb2Var.A2 != 0) {
                                        i19 = i10;
                                        i13 = i18;
                                        i14 = i5;
                                        f27 = f25;
                                        canvas2.drawRect(mlVar2.L0, mlVar2.M0, mlVar2.w(), mlVar2.x(), bkb.L2);
                                    } else {
                                        i19 = i10;
                                        i13 = i18;
                                        i14 = i5;
                                        f27 = f25;
                                        canvas2.drawRoundRect(rectF5, gl.L(4.0f), gl.L(4.0f), bkb.L2);
                                    }
                                    bkb.L2.setShader(null);
                                    bkb.L2.setAlpha(kk7.d4);
                                } else {
                                    i19 = i10;
                                    i13 = i18;
                                    i14 = i5;
                                    f27 = f25;
                                    f12 = 0.0f;
                                }
                                if (gb2Var.O1 && gb2Var.u2 && gb2Var.y2 != 9) {
                                    if (gb2Var.y1) {
                                        int L14 = gl.L(48.0f);
                                        float f45 = L14;
                                        f11 = 2.0f;
                                        int z14 = (int) oo1.z(mlVar2.N0, f45, 2.0f, mlVar2.L0);
                                        gb2Var.K3 = z14;
                                        int z15 = (int) oo1.z(mlVar2.O0, f45, 2.0f, mlVar2.M0);
                                        gb2Var.L3 = z15;
                                        radialProgress2.p(z14, z15, z14 + L14, L14 + z15);
                                    } else {
                                        f11 = 2.0f;
                                    }
                                    bb2 bb2Var3 = gb2Var.eb;
                                    if (bb2Var3 != null && bb2Var3.Z1() != null && gb2Var.eb.Z1().f(gb2Var)) {
                                        imageReceiver = imageReceiver3;
                                    } else if (f4 != 1.0f) {
                                        mlVar2.setAlpha(f4);
                                        if (gb2Var.x()) {
                                            gb2Var.wb = mlVar2.g(canvas2);
                                        } else {
                                            gb2Var.wb = true;
                                        }
                                        imageReceiver = imageReceiver3;
                                        if (gb2Var.Q5.t2()) {
                                            imageReceiver.setAlpha(f4);
                                            gb2Var.N0(canvas2);
                                            f28 = 1.0f;
                                            imageReceiver.setAlpha(1.0f);
                                        } else {
                                            f28 = 1.0f;
                                        }
                                        mlVar2.setAlpha(f28);
                                    } else {
                                        imageReceiver = imageReceiver3;
                                        if (gb2Var.x()) {
                                            gb2Var.wb = mlVar2.g(canvas2);
                                        } else {
                                            gb2Var.wb = true;
                                        }
                                        if (gb2Var.Q5.t2()) {
                                            gb2Var.N0(canvas2);
                                        }
                                    }
                                } else {
                                    imageReceiver = imageReceiver3;
                                    f11 = 2.0f;
                                }
                                if (nb2Var2 == null || !nb2Var2.h) {
                                    f13 = 6.0f;
                                    v = de9.v(mlVar2.O0, gl.L(6.0f), f27, i19);
                                } else {
                                    f13 = 6.0f;
                                    v = de9.v(nb2Var2.q0, gl.L(6.0f), f27, i19);
                                }
                                i10 = (int) v;
                                if (gb2Var.Q5.O3()) {
                                    TextPaint textPaint = bkb.X2;
                                    int i30 = bkb.Vc;
                                    f14 = f11;
                                    int i31 = (int) (f4 * 255.0f);
                                    textPaint.setColor(bm2.o(gb2Var.a2(i30), i31));
                                    bkb.Y2.setColor(bm2.o(gb2Var.a2(i30), i31));
                                } else {
                                    f14 = f11;
                                    TextPaint textPaint2 = bkb.X2;
                                    int i32 = bkb.Uc;
                                    int i33 = (int) (f4 * 255.0f);
                                    textPaint2.setColor(bm2.o(gb2Var.a2(i32), i33));
                                    bkb.Y2.setColor(bm2.o(gb2Var.a2(i32), i33));
                                }
                                if (gb2Var.o2 != null) {
                                    if (i10 != i13) {
                                        i10 += gl.L(f9);
                                    }
                                    if (i11 == 0) {
                                        i11 = i10 - gl.L(1.0f);
                                    }
                                    canvas2.save();
                                    canvas2.translate(gl.L(f10) + i12 + (Math.abs(this.g) > 1 ? ((i14 - gl.L(20.0f)) - this.f) - this.g : 0), (i10 - gl.L(3.0f)) + (!nb2Var2.s2 ? (-nb2Var2.k0) + nb2Var2.j0 : f12));
                                    TextPaint paint = gb2Var.o2.getPaint();
                                    int alpha3 = paint.getAlpha();
                                    paint.setAlpha((int) (alpha3 * f4));
                                    qla.f(canvas2, gb2Var.o2);
                                    paint.setAlpha(alpha3);
                                    canvas2.restore();
                                    i10 += gb2Var.o2.getLineBottom(r4.getLineCount() - 1);
                                }
                                if (this.i != null) {
                                    if (i10 != i13) {
                                        i10 += gl.L(f14);
                                    }
                                    if (i11 == 0) {
                                        i11 = i10 - gl.L(1.0f);
                                    }
                                    canvas2.save();
                                    canvas2.translate(gl.L(f10) + i12 + (Math.abs(this.e) > 1 ? ((i14 - gl.L(20.0f)) - this.d) - this.e : 0), (i10 - gl.L(3.0f)) + (!nb2Var2.s2 ? (-nb2Var2.k0) + nb2Var2.j0 : f12));
                                    TextPaint paint2 = this.i.getPaint();
                                    int alpha4 = paint2.getAlpha();
                                    paint2.setAlpha((int) (alpha4 * f4));
                                    qla.f(canvas2, this.i);
                                    paint2.setAlpha(alpha4);
                                    canvas2.restore();
                                    i10 += this.i.getLineBottom(r4.getLineCount() - 1);
                                }
                                if (gb2Var.p2 != null) {
                                    if (i10 != i13) {
                                        i10 += gl.L(f14);
                                    }
                                    int i34 = i10;
                                    if (i11 == 0) {
                                        i11 = i34 - gl.L(1.0f);
                                    }
                                    gb2Var.Y1 = i34 - gl.L(3.0f);
                                    canvas2.save();
                                    canvas2.translate(gl.L(f10) + i12 + (Math.abs(gb2Var.c2) > 1 ? ((i14 - gl.L(20.0f)) - gb2Var.b2) - gb2Var.c2 : 0), gb2Var.Y1 + (!nb2Var2.s2 ? (-nb2Var2.k0) + nb2Var2.j0 : f12));
                                    if (gb2Var.y0 == -10 && gb2Var.u4.g(canvas2)) {
                                        gb2Var.invalidate();
                                    }
                                    gb2Var.o1(canvas2, -2);
                                    bb2 bb2Var4 = gb2Var.eb;
                                    if (bb2Var4 != null && bb2Var4.E2() != null && gb2Var.getDelegate().E2().y(gb2Var.Q5)) {
                                        gb2Var.eb.E2().X(gb2Var.Q5.O3(), gb2Var.p2, canvas2);
                                    }
                                    TextPaint paint3 = gb2Var.p2.getPaint();
                                    if (z3 && (k27Var = gb2Var.Q5) != null && !k27Var.O3() && (n79Var2 = gb2Var.o8) != null) {
                                        paint3.linkColor = n79Var2.h();
                                    }
                                    int alpha5 = paint3.getAlpha();
                                    paint3.setAlpha((int) (alpha5 * f4));
                                    qla.f(canvas2, gb2Var.p2);
                                    paint3.setAlpha(alpha5);
                                    StaticLayout staticLayout2 = gb2Var.p2;
                                    imageReceiver2 = imageReceiver;
                                    i15 = i14;
                                    rectF2 = rectF5;
                                    i16 = saveCount;
                                    nb2Var = nb2Var2;
                                    mlVar = mlVar2;
                                    gm.drawAnimatedEmojis(canvas2, staticLayout2, gb2Var.Oa, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, gb2Var.L1(1, staticLayout2.getPaint().getColor()));
                                    canvas2.restore();
                                    paint3.linkColor = gb2Var.a2(gb2Var.Q5.O3() ? bkb.Xc : bkb.Wc);
                                    i10 = gb2Var.p2.getLineBottom(r2.getLineCount() - 1) + i34;
                                } else {
                                    imageReceiver2 = imageReceiver;
                                    nb2Var = nb2Var2;
                                    i15 = i14;
                                    rectF2 = rectF5;
                                    i16 = saveCount;
                                    mlVar = mlVar2;
                                }
                                int i35 = i11;
                                if (gb2Var.O1 || !z9) {
                                    f15 = f;
                                    f16 = f14;
                                } else {
                                    if (i10 != i13) {
                                        i10 += gl.L(f14);
                                    }
                                    int L15 = i15 - gl.L(17.0f);
                                    if (gb2Var.x1) {
                                        mlVar.L0 = ((i12 + i15) - mlVar.N0) - gl.L(f13);
                                        mlVar.M0 = i35;
                                    } else {
                                        mlVar.L0 = i12 + (gb2Var.U1 ? -gl.L(6.3f) : gl.L(f10));
                                        mlVar.M0 = i10;
                                    }
                                    if (nb2Var != null && nb2Var.t1) {
                                        if (!gb2Var.x1 && gb2Var.M1 != 1) {
                                            mlVar.l0((int) gl.R1(nb2Var.p1, L15, nb2Var.L1));
                                        }
                                        mlVar.L0 = gl.R1(nb2Var.r1, mlVar.r(), nb2Var.L1) - (mlVar.N0 / f14);
                                        mlVar.M0 = gl.R1(nb2Var.s1, mlVar.s(), nb2Var.L1) - (mlVar.O0 / f14);
                                    } else if (!gb2Var.x1 && (b5 = gb2Var.M1) != 7 && b5 != 1) {
                                        mlVar.l0(L15);
                                    }
                                    if (gb2Var.x1 || !gb2Var.y1) {
                                        f16 = f14;
                                    } else {
                                        int L16 = gl.L(48.0f);
                                        float f46 = L16;
                                        f16 = f14;
                                        int z16 = (int) oo1.z(mlVar.N0, f46, f16, mlVar.L0);
                                        gb2Var.K3 = z16;
                                        int z17 = (int) oo1.z(mlVar.O0, f46, f16, mlVar.M0);
                                        gb2Var.L3 = z17;
                                        radialProgress2.p(z16, z17, z16 + L16, L16 + z17);
                                    }
                                    if (gb2Var.Kb && MediaController.w().D(gb2Var.Q5) && (ixVar = MediaController.w().M0) != null && ixVar.d && canvas2.isHardwareAccelerated()) {
                                        gb2Var.wb = true;
                                        gb2Var.R9 = true;
                                    } else {
                                        bb2 bb2Var5 = gb2Var.eb;
                                        if (bb2Var5 == null || bb2Var5.Z1() == null || !gb2Var.eb.Z1().f(gb2Var)) {
                                            f15 = f;
                                            if (f != 1.0f) {
                                                mlVar.setAlpha(f15);
                                                if (gb2Var.x()) {
                                                    gb2Var.wb = mlVar.g(canvas2);
                                                } else {
                                                    gb2Var.wb = true;
                                                }
                                                if (gb2Var.Q5.t2()) {
                                                    ImageReceiver imageReceiver5 = imageReceiver2;
                                                    imageReceiver5.setAlpha(f15);
                                                    gb2Var.N0(canvas2);
                                                    f24 = 1.0f;
                                                    imageReceiver5.setAlpha(1.0f);
                                                } else {
                                                    f24 = 1.0f;
                                                }
                                                mlVar.setAlpha(f24);
                                            } else {
                                                if (gb2Var.x()) {
                                                    gb2Var.wb = mlVar.g(canvas2);
                                                } else {
                                                    gb2Var.wb = true;
                                                }
                                                if (gb2Var.Q5.t2()) {
                                                    gb2Var.N0(canvas2);
                                                }
                                            }
                                        }
                                    }
                                    f15 = f;
                                }
                                b3 = gb2Var.M1;
                                if (b3 != 4 || b3 == 2) {
                                    gb2Var.M3 = (int) (mlVar.L0 + gl.L(8.0f));
                                    int L17 = (int) (mlVar.M0 + gl.L(8.0f));
                                    gb2Var.N3 = L17;
                                    RadialProgress2 radialProgress22 = gb2Var.R0;
                                    int i36 = gb2Var.M3;
                                    radialProgress22.p(i36, L17, gl.L(24.0f) + i36, gl.L(24.0f) + gb2Var.N3);
                                }
                                Paint c2 = gb2Var.c2("paintChatTimeBackground");
                                if (this.h == null && mlVar.R0) {
                                    int L18 = (int) (((mlVar.L0 + mlVar.N0) - gl.L(8.0f)) - this.c);
                                    f17 = 8.0f;
                                    int L19 = (int) ((mlVar.M0 + mlVar.O0) - gl.L(19.0f));
                                    f19 = 19.0f;
                                    f21 = 14.5f;
                                    f20 = 1.5f;
                                    f18 = f16;
                                    rectF3 = rectF2;
                                    rectF3.set(L18 - gl.L(f9), L19 - gl.L(1.5f), gl.L(f9) + this.c + L18, gl.L(14.5f) + L19);
                                    int alpha6 = c2.getAlpha();
                                    c2.setAlpha((int) (alpha6 * gb2Var.l4));
                                    bkb.I2.setAlpha((int) (gb2Var.l4 * 255.0f));
                                    canvas2.drawRoundRect(rectF3, gl.L(f9), gl.L(f9), c2);
                                    c2.setAlpha(alpha6);
                                    canvas2.save();
                                    canvas2.translate(L18, L19);
                                    this.h.draw(canvas2);
                                    canvas2.restore();
                                    bkb.I2.setAlpha(kk7.d4);
                                } else {
                                    f17 = 8.0f;
                                    f18 = f16;
                                    f19 = 19.0f;
                                    f20 = 1.5f;
                                    rectF3 = rectF2;
                                    f21 = 14.5f;
                                }
                                if (gb2Var.q2 != null && ((!(z5 = gb2Var.O1) || mlVar.R0) && gb2Var.A2 == 0)) {
                                    if (gb2Var.T1 && !gb2Var.U1 && gb2Var.M1 != 8) {
                                        i17 = (int) (((mlVar.L0 + mlVar.N0) - gl.L(f17)) - gb2Var.Z1);
                                        i10 = (int) ((mlVar.M0 + mlVar.O0) - gl.L(f19));
                                        rectF3.set(i17 - gl.L(f9), i10 - gl.L(f20), gl.L(f9) + gb2Var.Z1 + i17, gl.L(f21) + i10);
                                        canvas2.drawRoundRect(rectF3, gl.L(f9), gl.L(f9), gb2Var.c2("paintChatTimeBackground"));
                                    } else if (z5) {
                                        i17 = i12;
                                    } else {
                                        int L20 = (int) (mlVar.L0 + gl.L(8.5f));
                                        i10 = (int) (mlVar.M0 + gl.L(f13));
                                        rectF3.set(L20 - gl.L(f9), i10 - gl.L(f20), gl.L(f9) + gb2Var.Z1 + L20, gl.L(gb2Var.M1 == 8 ? f21 : 16.5f) + i10);
                                        canvas2.drawRoundRect(rectF3, gl.L(f9), gl.L(f9), c2);
                                        i17 = L20;
                                    }
                                    canvas2.save();
                                    canvas2.translate(i17, i10);
                                    if (gb2Var.U1) {
                                        if (gb2Var.O1) {
                                            bkb.K2.setColor(gb2Var.a2(bkb.zd));
                                        } else if (gb2Var.Q5.O3()) {
                                            bkb.K2.setColor(gb2Var.a2(bkb.Vc));
                                        } else {
                                            bkb.K2.setColor(gb2Var.a2(bkb.Uc));
                                        }
                                    }
                                    gb2Var.q2.draw(canvas2);
                                    canvas2.restore();
                                }
                                gb2Var.C1(canvas2, gb2Var.o8.h());
                                int i37 = i12;
                                gb2Var.P.b(canvas2, gb2Var.gb, i37, gb2Var.cc);
                                gb2Var.Q.b(canvas2, gb2Var.gb, i37, gb2Var.cc);
                                if (gb2Var.u2) {
                                    if (gb2Var.Q5.O3()) {
                                        int a22 = gb2Var.a2(bkb.Nb);
                                        if (gb2Var.m8 == null) {
                                            if (gb2Var.y2 == 27) {
                                                b22 = gb2Var.getContext().getResources().getDrawable(R.drawable.mini_call_join).mutate();
                                                gb2Var.m8 = b22;
                                            } else {
                                                b22 = gb2Var.b2("drawableMsgOutInstant");
                                                gb2Var.m8 = b22;
                                            }
                                            gb2Var.l8 = a22;
                                            b22.setColorFilter(new PorterDuffColorFilter(a22, PorterDuff.Mode.SRC_IN));
                                        }
                                        if (gb2Var.l8 != a22) {
                                            Drawable drawable2 = gb2Var.m8;
                                            gb2Var.l8 = a22;
                                            drawable2.setColorFilter(new PorterDuffColorFilter(a22, PorterDuff.Mode.SRC_IN));
                                        }
                                        drawable = gb2Var.m8;
                                        bkb.L2.setColor(a22);
                                        bkb.X1.setColor(bkb.p1(0.1f, a22));
                                        r86 r86Var2 = this.s;
                                        if (r86Var2 != null) {
                                            r86Var2.g(bkb.p1(0.1f, a22), bkb.p1(0.3f, a22), bkb.p1(0.3f, a22), bkb.p1(1.2f, a22));
                                        }
                                    } else {
                                        int a23 = gb2Var.a2(bkb.Ad);
                                        if (gb2Var.o8 != null && !gb2Var.Q5.F4()) {
                                            a23 = gb2Var.o8.h();
                                        }
                                        if (gb2Var.m8 == null) {
                                            byte b9 = gb2Var.y2;
                                            if (b9 == 16) {
                                                mutate = gb2Var.getContext().getResources().getDrawable(R.drawable.mini_external_link).mutate();
                                                gb2Var.m8 = mutate;
                                            } else if (b9 == 27) {
                                                mutate = gb2Var.getContext().getResources().getDrawable(R.drawable.mini_call_join).mutate();
                                                gb2Var.m8 = mutate;
                                            } else {
                                                mutate = gb2Var.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                                                gb2Var.m8 = mutate;
                                            }
                                            gb2Var.l8 = a23;
                                            mutate.setColorFilter(new PorterDuffColorFilter(a23, PorterDuff.Mode.SRC_IN));
                                        }
                                        if (gb2Var.l8 != a23) {
                                            Drawable drawable3 = gb2Var.m8;
                                            gb2Var.l8 = a23;
                                            drawable3.setColorFilter(new PorterDuffColorFilter(a23, PorterDuff.Mode.SRC_IN));
                                        }
                                        drawable = gb2Var.m8;
                                        bkb.L2.setColor(a23);
                                        bkb.X1.setColor(bkb.p1(0.1f, a23));
                                        r86 r86Var3 = this.s;
                                        if (r86Var3 != null) {
                                            r86Var3.g(bkb.p1(0.1f, a23), bkb.p1(0.3f, a23), bkb.p1(0.3f, a23), bkb.p1(1.2f, a23));
                                        }
                                    }
                                    Drawable drawable4 = drawable;
                                    if (z3) {
                                        int L21 = gl.L(14.0f) + i13 + i25;
                                        int alpha7 = bkb.L2.getAlpha();
                                        bkb.L2.setAlpha((int) (alpha7 * 0.18f));
                                        canvas.drawRect(gl.L(f10) + i37, gl.L(f18) + r3, (i37 + i15) - gl.L(7.0f), Math.max(1, gl.L(0.66f)) + gl.L(f18) + r3, bkb.L2);
                                        canvas2 = canvas;
                                        bkb.L2.setAlpha(alpha7);
                                        byte b10 = gb2Var.y2;
                                        float L22 = gl.L(b10 == 27 ? 20.0f : b10 == 0 ? 15.0f : f12) + gb2Var.s2;
                                        float z18 = oo1.z(i15, L22, f18, f5);
                                        byte b11 = gb2Var.y2;
                                        if (b11 == 0) {
                                            float L23 = gl.L(1.0f) + L21;
                                            int L24 = gl.L(9.0f);
                                            int L25 = gl.L(13.0f);
                                            if (drawable4 != null) {
                                                int i38 = (int) z18;
                                                int i39 = (int) L23;
                                                drawable4.setBounds(i38, i39, L24 + i38, L25 + i39);
                                            }
                                            drawable4.setAlpha((int) (f15 * 255.0f));
                                            drawable4.draw(canvas2);
                                            L4 = gl.L(15.0f);
                                        } else if (b11 == 27) {
                                            int i40 = (int) z18;
                                            int i41 = L21;
                                            drawable4.setBounds(i40, i41, drawable4.getIntrinsicWidth() + i40, drawable4.getIntrinsicHeight() + i41);
                                            drawable4.setAlpha((int) (f15 * 255.0f));
                                            drawable4.draw(canvas2);
                                            L4 = gl.L(20.0f);
                                        } else {
                                            if (b11 == 16) {
                                                z18 -= gl.L(11.0f);
                                                float L26 = L22 + z18 + gl.L(f9);
                                                float L27 = L21 - gl.L(2.0f);
                                                int L28 = gl.L(18.0f);
                                                int L29 = gl.L(18.0f);
                                                if (drawable4 != null) {
                                                    int i42 = (int) L26;
                                                    int i43 = (int) L27;
                                                    drawable4.setBounds(i42, i43, L28 + i42, L29 + i43);
                                                }
                                                drawable4.setAlpha((int) (f15 * 255.0f));
                                                drawable4.draw(canvas2);
                                            }
                                            if (gb2Var.r2 != null) {
                                                canvas2.save();
                                                canvas2.translate(z18 - gb2Var.t2, L21);
                                                qla.f(canvas2, gb2Var.r2);
                                                canvas2.restore();
                                            }
                                        }
                                        z18 += L4;
                                        if (gb2Var.r2 != null) {
                                        }
                                    } else {
                                        float f47 = f5;
                                        int i44 = i13 + i25;
                                        if (gb2Var.Q5.F4()) {
                                            f10 = -5.0f;
                                        }
                                        int L30 = gl.L(f10) + i44;
                                        r86 r86Var4 = this.s;
                                        if (r86Var4 != null && !z2 && !r86Var4.c() && !this.s.d()) {
                                            this.s.a();
                                        }
                                        r86 r86Var5 = this.s;
                                        if (r86Var5 == null) {
                                            if (z2) {
                                                r86 r86Var6 = new r86();
                                                this.s = r86Var6;
                                                r86Var6.x.setStrokeWidth(gl.L(1.25f));
                                                this.s.D = true;
                                            }
                                        } else if (z2 && (r86Var5.c() || this.s.d())) {
                                            r86 r86Var7 = this.s;
                                            f22 = 9.0f;
                                            r86Var7.b = -1L;
                                            r86Var7.c = -1L;
                                            RectF rectF8 = rectF;
                                            rectF8.set(f47, L30, gb2Var.D2 + i37, gl.L(36.0f) + L30);
                                            float a3 = gb2Var.H2.a(0.02f);
                                            z4 = a3 == 1.0f;
                                            if (z4) {
                                                canvas2.save();
                                                canvas2.scale(a3, a3, rectF8.centerX(), rectF8.centerY());
                                            }
                                            gb2Var.L2[0] = 0;
                                            gb2Var.B0(0);
                                            gb2Var.J2[0].setBounds(i37, L30, gb2Var.D2 + i37, gl.L(36.0f) + L30);
                                            gb2Var.J2[0].draw(canvas2);
                                            r86Var = this.s;
                                            if (r86Var != null || r86Var.c()) {
                                                f23 = f13;
                                            } else {
                                                this.s.e(rectF8);
                                                f23 = f13;
                                                this.s.j(f23);
                                                this.s.draw(canvas2);
                                                gb2Var.invalidate();
                                            }
                                            canvas2.drawRoundRect(rectF8, gl.L(f23), gl.L(f23), bkb.X1);
                                            b4 = gb2Var.y2;
                                            if (b4 != 0) {
                                                int L31 = ((gb2Var.C2 + gb2Var.B2) + i37) - gl.L(15.0f);
                                                int L32 = gl.L(11.5f) + L30;
                                                int L33 = gl.L(f22);
                                                int L34 = gl.L(13.0f);
                                                if (drawable4 != null) {
                                                    drawable4.setBounds(L31, L32, L33 + L31, L34 + L32);
                                                }
                                                drawable4.setAlpha((int) (f15 * 255.0f));
                                                drawable4.draw(canvas2);
                                            } else if (b4 == 16) {
                                                if (this.u == null) {
                                                    Paint paint4 = new Paint(1);
                                                    this.u = paint4;
                                                    paint4.setStyle(Paint.Style.STROKE);
                                                    this.u.setStrokeCap(Paint.Cap.ROUND);
                                                    this.u.setStrokeJoin(Paint.Join.ROUND);
                                                }
                                                this.u.setColor(bkb.L2.getColor());
                                                this.u.setStrokeWidth(gl.N(1.333f));
                                                Path path2 = this.t;
                                                if (path2 == null) {
                                                    this.t = new Path();
                                                } else {
                                                    path2.rewind();
                                                }
                                                this.t.moveTo(rectF8.right - gl.L(11.0f), rectF8.top + gl.L(f23));
                                                this.t.lineTo(rectF8.right - gl.L(f23), rectF8.top + gl.L(f23));
                                                this.t.lineTo(rectF8.right - gl.L(f23), rectF8.top + gl.L(11.0f));
                                                this.t.moveTo(rectF8.right - gl.N(11.66f), rectF8.top + gl.L(11.66f));
                                                this.t.lineTo(rectF8.right - gl.L(f23), rectF8.top + gl.L(f23));
                                                canvas2.drawPath(this.t, this.u);
                                            }
                                            if (gb2Var.r2 != null) {
                                                canvas2.save();
                                                canvas2.translate(gb2Var.B2 + i37, gl.L(10.5f) + L30);
                                                qla.f(canvas2, gb2Var.r2);
                                                canvas2.restore();
                                            }
                                            if (z4) {
                                                canvas2.restore();
                                            }
                                        }
                                        f22 = 9.0f;
                                        RectF rectF82 = rectF;
                                        rectF82.set(f47, L30, gb2Var.D2 + i37, gl.L(36.0f) + L30);
                                        float a32 = gb2Var.H2.a(0.02f);
                                        if (a32 == 1.0f) {
                                        }
                                        if (z4) {
                                        }
                                        gb2Var.L2[0] = 0;
                                        gb2Var.B0(0);
                                        gb2Var.J2[0].setBounds(i37, L30, gb2Var.D2 + i37, gl.L(36.0f) + L30);
                                        gb2Var.J2[0].draw(canvas2);
                                        r86Var = this.s;
                                        if (r86Var != null) {
                                        }
                                        f23 = f13;
                                        canvas2.drawRoundRect(rectF82, gl.L(f23), gl.L(f23), bkb.X1);
                                        b4 = gb2Var.y2;
                                        if (b4 != 0) {
                                        }
                                        if (gb2Var.r2 != null) {
                                        }
                                        if (z4) {
                                        }
                                    }
                                }
                                canvas2.restoreToCount(i16);
                            }
                            if (nb2Var2 != null && nb2Var2.t1) {
                                i10 = (int) tb4.A(f8, nb2Var2.L1, (i10 != i29 ? gl.L(2.0f) : i8) + nb2Var2.q1 + gl.L(6.0f), i10);
                            }
                        }
                        i12 = i7;
                        f9 = 4.0f;
                        f10 = f6;
                        f11 = 2.0f;
                        f12 = 0.0f;
                        f13 = 6.0f;
                        i13 = i29;
                        imageReceiver = imageReceiver4;
                        i14 = i5;
                        if (gb2Var.Q5.O3()) {
                        }
                        if (gb2Var.o2 != null) {
                        }
                        if (this.i != null) {
                        }
                        if (gb2Var.p2 != null) {
                        }
                        int i352 = i11;
                        if (gb2Var.O1) {
                        }
                        f15 = f;
                        f16 = f14;
                        b3 = gb2Var.M1;
                        if (b3 != 4) {
                        }
                        gb2Var.M3 = (int) (mlVar.L0 + gl.L(8.0f));
                        int L172 = (int) (mlVar.M0 + gl.L(8.0f));
                        gb2Var.N3 = L172;
                        RadialProgress2 radialProgress222 = gb2Var.R0;
                        int i362 = gb2Var.M3;
                        radialProgress222.p(i362, L172, gl.L(24.0f) + i362, gl.L(24.0f) + gb2Var.N3);
                        Paint c22 = gb2Var.c2("paintChatTimeBackground");
                        if (this.h == null) {
                        }
                        f17 = 8.0f;
                        f18 = f16;
                        f19 = 19.0f;
                        f20 = 1.5f;
                        rectF3 = rectF2;
                        f21 = 14.5f;
                        if (gb2Var.q2 != null) {
                            if (gb2Var.T1) {
                            }
                            if (z5) {
                            }
                            canvas2.save();
                            canvas2.translate(i17, i10);
                            if (gb2Var.U1) {
                            }
                            gb2Var.q2.draw(canvas2);
                            canvas2.restore();
                        }
                        gb2Var.C1(canvas2, gb2Var.o8.h());
                        int i372 = i12;
                        gb2Var.P.b(canvas2, gb2Var.gb, i372, gb2Var.cc);
                        gb2Var.Q.b(canvas2, gb2Var.gb, i372, gb2Var.cc);
                        if (gb2Var.u2) {
                        }
                        canvas2.restoreToCount(i16);
                    }
                    U1 = gb2Var.q0 - gl.L(2.0f);
                    i2 = gb2Var.p0;
                    L3 = gl.L(1.0f);
                }
                L2 = L3 + i2;
            }
            f2 = 1.0f;
            f3 = L2;
            i3 = (int) (backgroundDrawableRight - f3);
            int i242 = gb2Var.W1;
            if (nb2Var2 == null) {
            }
            i4 = L2;
            int i252 = i242;
            n79Var = gb2Var.o8;
            if (n79Var == null) {
            }
            bkb.X2.setColor(n79Var.a(gb2Var.Q5, gb2Var.va, gb2Var.wa, gb2Var.cc, 3));
            n79 n79Var32 = gb2Var.o8;
            byte b72 = gb2Var.y2;
            n79Var32.r = (b72 != 23 || b72 == 24 || b72 == 28) ? 0.5f : f2;
            if (gb2Var.Q5.q4()) {
            }
            if (!z7) {
            }
            if (z7) {
            }
            bb2 bb2Var6 = gb2Var.eb;
            if (bb2Var6 == null) {
            }
            if (gb2Var.U1) {
            }
            f4 = f;
            i5 = i3;
            i6 = U1;
            f5 = f3;
            z2 = z;
            rectF = rectF4;
            i7 = i4;
            b2 = 1;
            i8 = 0;
            f6 = 10.0f;
            z3 = false;
            if (gb2Var.O1) {
            }
            i9 = i6;
            f7 = 1.0f;
            i10 = i9;
            if (gb2Var.g2 == null) {
            }
            if (!gb2Var.T1) {
            }
            i9 = de9.w(4.0f, gb2Var.Q5.V5(nb2Var2), i9);
            i10 = de9.w(4.0f, gb2Var.Q5.V5(nb2Var2), i10);
            int i292 = i9;
            if (gb2Var.O1) {
                if (gb2Var.x1) {
                }
            }
            i12 = i7;
            f9 = 4.0f;
            f10 = f6;
            f11 = 2.0f;
            f12 = 0.0f;
            f13 = 6.0f;
            i13 = i292;
            imageReceiver = imageReceiver4;
            i14 = i5;
            if (gb2Var.Q5.O3()) {
            }
            if (gb2Var.o2 != null) {
            }
            if (this.i != null) {
            }
            if (gb2Var.p2 != null) {
            }
            int i3522 = i11;
            if (gb2Var.O1) {
            }
            f15 = f;
            f16 = f14;
            b3 = gb2Var.M1;
            if (b3 != 4) {
            }
            gb2Var.M3 = (int) (mlVar.L0 + gl.L(8.0f));
            int L1722 = (int) (mlVar.M0 + gl.L(8.0f));
            gb2Var.N3 = L1722;
            RadialProgress2 radialProgress2222 = gb2Var.R0;
            int i3622 = gb2Var.M3;
            radialProgress2222.p(i3622, L1722, gl.L(24.0f) + i3622, gl.L(24.0f) + gb2Var.N3);
            Paint c222 = gb2Var.c2("paintChatTimeBackground");
            if (this.h == null) {
            }
            f17 = 8.0f;
            f18 = f16;
            f19 = 19.0f;
            f20 = 1.5f;
            rectF3 = rectF2;
            f21 = 14.5f;
            if (gb2Var.q2 != null) {
            }
            gb2Var.C1(canvas2, gb2Var.o8.h());
            int i3722 = i12;
            gb2Var.P.b(canvas2, gb2Var.gb, i3722, gb2Var.cc);
            gb2Var.Q.b(canvas2, gb2Var.gb, i3722, gb2Var.cc);
            if (gb2Var.u2) {
            }
            canvas2.restoreToCount(i16);
        }
    }
}
