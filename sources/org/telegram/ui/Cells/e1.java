package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.Toast;
import ci.wb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.m90;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e1 {
    public final q1 a;
    public final HashMap b;
    public final HashMap c;
    public String d;

    public e1(q1 q1Var) {
        new Path();
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i3;
        int L;
        q1 q1Var = this.a;
        ArrayList arrayList = q1Var.H5;
        ArrayList arrayList2 = q1Var.H5;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int M1 = (int) q1Var.M1(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = q1Var.getWidthForButtons();
                if (q1Var.P5.Q3()) {
                    L = (q1Var.getMeasuredWidth() - widthForButtons) - org.telegram.messenger.g0.L(10.0f);
                } else if (q1Var.t2()) {
                    L = q1Var.getCompactLeft();
                } else {
                    L = q1Var.M6 + org.telegram.messenger.g0.L(q1Var.B6 ? 1.0f : 7.0f);
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    c0 c0Var = (c0) arrayList2.get(i10);
                    int L2 = (c0Var.d + q1Var.d7) - org.telegram.messenger.g0.L(2.0f);
                    float f10 = x10;
                    float f11 = widthForButtons;
                    float f12 = (c0Var.c * f11) + L;
                    if (f10 >= f12 && f10 <= (c0Var.e * f11) + f12 && M1 >= L2 && M1 <= c0Var.f + L2) {
                        q1Var.M5 = i10;
                        q1Var.p2();
                        if (c0Var.s == null) {
                            y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bd, q1Var.Pb), 6, 6);
                            c0Var.s = a02;
                            a02.setCallback(q1Var);
                            y yVar = c0Var.s;
                            int i11 = ((int) (c0Var.c * f11)) + L;
                            yVar.setBounds(i11, L2, ((int) (c0Var.e * f11)) + i11, c0Var.f + L2);
                        }
                        c0Var.s.setHotspot(f10, M1);
                        c0Var.s.setState(q1Var.M2);
                        c0Var.b(!c0Var.m);
                        q1Var.postDelayed(new cg.l0(this, q1Var.M5, 19), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (q1Var.M5 != -1) {
                    q1Var.playSoundEffect(0);
                    c0 c0Var2 = (c0) arrayList2.get(q1Var.M5);
                    y yVar2 = c0Var2.s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    c0Var2.b(false);
                    if (q1Var.P5.p1) {
                        Toast.makeText(q1Var.getContext(), bd.M0(2131748538, null), 1).show();
                    } else {
                        l1 l1Var = q1Var.Ra;
                        if (l1Var != null && !c0Var2.m) {
                            org.telegram.messenger.o2 o2Var = c0Var2.j;
                            if (o2Var != null) {
                                l1Var.H(q1Var, o2Var);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = c0Var2.i;
                                if (keyboardInlineButton != null) {
                                    l1Var.d1(q1Var, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    q1Var.M5 = -1;
                    q1Var.p2();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i3 = q1Var.M5) != -1) {
                c0 c0Var3 = (c0) arrayList2.get(i3);
                y yVar3 = c0Var3.s;
                if (yVar3 != null) {
                    yVar3.setState(StateSet.NOTHING);
                }
                c0Var3.b(false);
                q1Var.M5 = -1;
                q1Var.p2();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x055d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, ArrayList arrayList, int i3) {
        int L;
        int i10;
        int i11;
        boolean z10;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z11;
        Path path;
        q1 q1Var;
        float a10;
        int i12;
        boolean z12;
        int a11;
        w70 w70Var;
        boolean z13;
        y yVar;
        float f10;
        float f11;
        ArrayList arrayList2 = arrayList;
        if (qt0.f0) {
            return;
        }
        q1 q1Var2 = this.a;
        int widthForButtons = q1Var2.getWidthForButtons();
        int i13 = q1Var2.Z5;
        x1 x1Var = q1Var2.hb;
        RectF rectF = q1Var2.b4;
        zi ziVar = q1Var2.P5;
        if (ziVar != null && ziVar.Q3()) {
            L = (q1Var2.getMeasuredWidth() - widthForButtons) - org.telegram.messenger.g0.L(10.0f);
        } else if (q1Var2.t2()) {
            L = q1Var2.getCompactLeft();
        } else {
            L = q1Var2.M6 + org.telegram.messenger.g0.L((q1Var2.B6 || q1Var2.K) ? 1.0f : 7.0f);
        }
        if (x1Var.x0) {
            L = (int) (L + x1Var.h0);
        }
        float L2 = (q1Var2.d7 - org.telegram.messenger.g0.L(2.0f)) + x1Var.j0;
        float f12 = 2.0f;
        float f13 = 0.0f;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            c0 c0Var = (c0) arrayList2.get(i14);
            float f14 = c0Var.d + c0Var.f;
            if (f14 > f13) {
                f13 = f14;
            }
        }
        float f15 = 1.0f;
        rectF.set(0.0f, L2, q1Var2.getMeasuredWidth(), L2 + f13);
        if (i3 != 255) {
            canvas.saveLayerAlpha(rectF, i3, 31);
        } else {
            canvas.save();
        }
        int i15 = 0;
        boolean z14 = false;
        while (i15 < arrayList2.size()) {
            c0 c0Var2 = (c0) arrayList2.get(i15);
            float L3 = ((c0Var2.d + q1Var2.d7) - org.telegram.messenger.g0.L(f12)) + x1Var.j0;
            c0Var2.a();
            if (c0Var2.b) {
                float f16 = widthForButtons;
                float f17 = (c0Var2.c * f16) + L;
                float f18 = ((c0Var2.e * f16) + f17) - f17;
                float L4 = org.telegram.messenger.g0.L(3.66f);
                float f19 = f18 - L4;
                int round = Math.round(f19 / org.telegram.messenger.g0.L(8.66f));
                i10 = i15;
                float f20 = f19 / round;
                q1Var2.x();
                float L5 = org.telegram.messenger.g0.L(f15);
                int i16 = 0;
                while (i16 < round + 1) {
                    float f21 = (i16 * f20) + f17;
                    int i17 = i16;
                    int i18 = i13;
                    rectF.set(f21, L3, f21 + L4, c0Var2.f + L3);
                    canvas.drawRoundRect(rectF, L5, L5, q1Var2.Z1("paintChatActionBackground"));
                    if (q1Var2.g2()) {
                        canvas.drawRoundRect(rectF, L5, L5, org.telegram.ui.ActionBar.k6.h2);
                    }
                    i16 = i17 + 1;
                    i13 = i18;
                }
                i11 = i13;
                q1Var = q1Var2;
                i12 = widthForButtons;
                f11 = f15;
            } else {
                i10 = i15;
                i11 = i13;
                float f22 = widthForButtons;
                float f23 = (c0Var2.c * f22) + L;
                rectF.set(f23, L3, (c0Var2.e * f22) + f23, c0Var2.f + L3);
                q1Var2.x();
                boolean P0 = q1Var2.P0(c0Var2.i);
                org.telegram.messenger.o2 o2Var = c0Var2.j;
                if (o2Var != null && q1Var2.P5 != null) {
                    int i19 = o2Var.a;
                    if (i19 == 2) {
                        P0 |= hp.s1(i11).D2(q1Var2.P5.f1(), zi.B0(q1Var2.P5.k), true);
                    } else if (i19 == 1) {
                        z10 = false;
                        P0 |= hp.s1(i11).D2(q1Var2.P5.f1(), zi.B0(q1Var2.P5.k), false);
                        boolean z15 = (q1Var2.T1 || !q1Var2.U1) ? z10 : true;
                        boolean t22 = q1Var2.t2();
                        e6Var = q1Var2.Pb;
                        RectF rectF2 = c0Var2.p;
                        Paint paint = c0Var2.o;
                        z11 = P0;
                        float[] fArr = c0Var2.q;
                        boolean z16 = z15;
                        path = c0Var2.n;
                        q1Var = q1Var2;
                        a10 = c0Var2.a();
                        canvas.save();
                        if (a10 == f15) {
                            i12 = widthForButtons;
                            z12 = t22;
                            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
                        } else {
                            i12 = widthForButtons;
                            z12 = t22;
                        }
                        Arrays.fill(fArr, org.telegram.messenger.g0.L(Math.min(6.75f, az.Y0)));
                        if ((c0Var2.g & 9) == 9) {
                            float L6 = org.telegram.messenger.g0.L(az.Y0);
                            fArr[7] = L6;
                            fArr[6] = L6;
                        }
                        if ((c0Var2.g & 10) == 10) {
                            float L7 = org.telegram.messenger.g0.L(az.Y0);
                            fArr[5] = L7;
                            fArr[4] = L7;
                        }
                        path.rewind();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas.drawPath(path, org.telegram.ui.ActionBar.k6.W0("paintChatActionBackground", e6Var));
                        org.telegram.messenger.m2 m2Var = c0Var2.k;
                        a11 = m2Var == null ? m2Var.a() : 1;
                        if (a11 != 1) {
                            int c2 = o1.g.c(a11);
                            if (c2 == 1) {
                                paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Rl, e6Var)));
                            } else if (c2 == 2) {
                                paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Tl, e6Var)));
                            } else if (c2 == 3) {
                                paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sl, e6Var)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if ((e6Var == null ? e6Var.g() : org.telegram.ui.ActionBar.k6.d1()) && (a11 == 1 || (e6Var != null && e6Var.a()))) {
                            canvas.drawPath(path, org.telegram.ui.ActionBar.k6.h2);
                        }
                        canvas.save();
                        canvas.clipPath(path);
                        if (z11) {
                            w70 w70Var2 = c0Var2.r;
                            if (w70Var2 != null && !w70Var2.d() && !c0Var2.r.c()) {
                                c0Var2.r.a();
                            }
                        } else {
                            w70 w70Var3 = c0Var2.r;
                            if (w70Var3 == null) {
                                w70 w70Var4 = new w70();
                                c0Var2.r = w70Var4;
                                w70Var4.k(5.5f);
                                w70 w70Var5 = c0Var2.r;
                                w70Var5.D = true;
                                w70Var5.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                            } else if (w70Var3.c() || c0Var2.r.d()) {
                                w70 w70Var6 = c0Var2.r;
                                w70Var6.b = -1L;
                                w70Var6.c = -1L;
                            }
                        }
                        w70Var = c0Var2.r;
                        if (w70Var == null && (z11 || w70Var.d())) {
                            rectF2.set(rectF);
                            rectF2.inset(org.telegram.messenger.g0.N(0.625f), org.telegram.messenger.g0.N(0.625f));
                            c0Var2.r.j(fArr);
                            c0Var2.r.e(rectF2);
                            int r12 = z12 ? org.telegram.ui.ActionBar.k6.r1(0.125f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ha, e6Var)) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.bd, e6Var);
                            c0Var2.r.g(org.telegram.ui.ActionBar.k6.r1(f15, r12), org.telegram.ui.ActionBar.k6.r1(2.5f, r12), org.telegram.ui.ActionBar.k6.r1(3.0f, r12), org.telegram.ui.ActionBar.k6.r1(10.0f, r12));
                            c0Var2.r.setAlpha(hs.e4);
                            c0Var2.r.draw(canvas);
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yVar = c0Var2.s;
                        if (yVar == null) {
                            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            c0Var2.s.setAlpha(hs.e4);
                            c0Var2.s.draw(canvas);
                        }
                        canvas.restore();
                        canvas.save();
                        float L8 = (c0Var2.t == null || c0Var2.u != null) ? org.telegram.messenger.g0.L(26.0f) : 0;
                        float f24 = f12;
                        float z17 = com.google.android.recaptcha.internal.a.z(rectF.width() - (c0Var2.h.k() + (c0Var2.t == null ? org.telegram.messenger.g0.L(4.0f) : 0)), L8, f24, rectF.left);
                        if (c0Var2.u == null) {
                            int centerY = (int) (rectF.centerY() - (org.telegram.messenger.g0.L(20.0f) / f24));
                            f10 = 3.0f;
                            int i20 = (int) z17;
                            c0Var2.u.setBounds(i20, centerY, org.telegram.messenger.g0.L(20.0f) + i20, org.telegram.messenger.g0.L(20.0f) + centerY);
                            c0Var2.u.setAlpha(c0Var2.m ? 128 : hs.e4);
                            c0Var2.u.draw(canvas);
                            z17 += L8;
                        } else {
                            f10 = 3.0f;
                            if (c0Var2.t != null) {
                                f12 = 2.0f;
                                int centerY2 = (int) (rectF.centerY() - (org.telegram.messenger.g0.L(24.0f) / 2.0f));
                                int i21 = (int) z17;
                                c0Var2.t.setBounds(i21, centerY2, org.telegram.messenger.g0.L(24.0f) + i21, org.telegram.messenger.g0.L(24.0f) + centerY2);
                                c0Var2.t.setAlpha(c0Var2.m ? 128 : hs.e4);
                                c0Var2.t.draw(canvas);
                                z17 += L8;
                                ly0 ly0Var = c0Var2.h;
                                float width = (rectF.width() - org.telegram.messenger.g0.L(15.0f)) - L8;
                                f11 = 1.0f;
                                ly0Var.p = Math.max(1.0f, width);
                                c0Var2.h.f(canvas, z17, rectF.centerY(), c0Var2.m ? 0.5f : 1.0f);
                                canvas.restore();
                                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                                if (c0Var2.j != null) {
                                    if (c0Var2.m) {
                                        Drawable S0 = org.telegram.ui.ActionBar.k6.S0("drawableBotLock", e6Var);
                                        z.t(S0, (((int) rectF.right) - org.telegram.messenger.g0.L(f10)) - S0.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(f10));
                                        S0.draw(canvas);
                                    }
                                } else if (dg.c.b(c0Var2.i)) {
                                    Drawable S02 = org.telegram.ui.ActionBar.k6.S0("drawableBotWebView", e6Var);
                                    z.t(S02, (((int) rectF.right) - org.telegram.messenger.g0.L(f10)) - S02.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(f10));
                                    S02.draw(canvas);
                                } else if (tL_inlineButtonTypeUrl != null) {
                                    Drawable S03 = m90.q(tL_inlineButtonTypeUrl.url) ? org.telegram.ui.ActionBar.k6.S0("drawableBotWebView", e6Var) : c0Var2.l ? org.telegram.ui.ActionBar.k6.S0("drawable_botInvite", e6Var) : org.telegram.ui.ActionBar.k6.S0("drawableBotLink", e6Var);
                                    z.t(S03, (((int) rectF.right) - org.telegram.messenger.g0.L(f10)) - S03.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(f10));
                                    S03.draw(canvas);
                                } else if (dg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || dg.c.c(c0Var2.i, TL_keyboard.TL_buttonTypeRequestPeer.class)) {
                                    Drawable S04 = org.telegram.ui.ActionBar.k6.S0("drawableBotInline", e6Var);
                                    z.t(S04, (((int) rectF.right) - org.telegram.messenger.g0.L(f10)) - S04.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(f10));
                                    S04.draw(canvas);
                                } else if (dg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) && z16) {
                                    z.t(org.telegram.ui.ActionBar.k6.w4, (((int) rectF.right) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.ui.ActionBar.k6.w4.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(4.0f));
                                    org.telegram.ui.ActionBar.k6.w4.draw(canvas);
                                }
                                canvas.restore();
                                if (z13) {
                                    z14 = true;
                                }
                            }
                        }
                        f12 = 2.0f;
                        ly0 ly0Var2 = c0Var2.h;
                        float width2 = (rectF.width() - org.telegram.messenger.g0.L(15.0f)) - L8;
                        f11 = 1.0f;
                        ly0Var2.p = Math.max(1.0f, width2);
                        c0Var2.h.f(canvas, z17, rectF.centerY(), c0Var2.m ? 0.5f : 1.0f);
                        canvas.restore();
                        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl2 = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                        if (c0Var2.j != null) {
                        }
                        canvas.restore();
                        if (z13) {
                        }
                    }
                }
                z10 = false;
                if (q1Var2.T1) {
                }
                boolean t222 = q1Var2.t2();
                e6Var = q1Var2.Pb;
                RectF rectF22 = c0Var2.p;
                Paint paint2 = c0Var2.o;
                z11 = P0;
                float[] fArr2 = c0Var2.q;
                boolean z162 = z15;
                path = c0Var2.n;
                q1Var = q1Var2;
                a10 = c0Var2.a();
                canvas.save();
                if (a10 == f15) {
                }
                Arrays.fill(fArr2, org.telegram.messenger.g0.L(Math.min(6.75f, az.Y0)));
                if ((c0Var2.g & 9) == 9) {
                }
                if ((c0Var2.g & 10) == 10) {
                }
                path.rewind();
                path.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.drawPath(path, org.telegram.ui.ActionBar.k6.W0("paintChatActionBackground", e6Var));
                org.telegram.messenger.m2 m2Var2 = c0Var2.k;
                if (m2Var2 == null) {
                }
                if (a11 != 1) {
                }
                if (e6Var == null ? e6Var.g() : org.telegram.ui.ActionBar.k6.d1()) {
                    canvas.drawPath(path, org.telegram.ui.ActionBar.k6.h2);
                }
                canvas.save();
                canvas.clipPath(path);
                if (z11) {
                }
                w70Var = c0Var2.r;
                if (w70Var == null) {
                }
                z13 = false;
                yVar = c0Var2.s;
                if (yVar == null) {
                }
                canvas.restore();
                canvas.save();
                if (c0Var2.t == null) {
                }
                float L82 = (c0Var2.t == null || c0Var2.u != null) ? org.telegram.messenger.g0.L(26.0f) : 0;
                float f242 = f12;
                float z172 = com.google.android.recaptcha.internal.a.z(rectF.width() - (c0Var2.h.k() + (c0Var2.t == null ? org.telegram.messenger.g0.L(4.0f) : 0)), L82, f242, rectF.left);
                if (c0Var2.u == null) {
                }
                f12 = 2.0f;
                ly0 ly0Var22 = c0Var2.h;
                float width22 = (rectF.width() - org.telegram.messenger.g0.L(15.0f)) - L82;
                f11 = 1.0f;
                ly0Var22.p = Math.max(1.0f, width22);
                c0Var2.h.f(canvas, z172, rectF.centerY(), c0Var2.m ? 0.5f : 1.0f);
                canvas.restore();
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl22 = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (c0Var2.j != null) {
                }
                canvas.restore();
                if (z13) {
                }
            }
            i15 = i10 + 1;
            f15 = f11;
            i13 = i11;
            q1Var2 = q1Var;
            widthForButtons = i12;
            arrayList2 = arrayList;
        }
        q1 q1Var3 = q1Var2;
        canvas.restore();
        if (z14) {
            q1Var3.p2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0365 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d2 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031d  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(zi ziVar, e5.u uVar, int i3, boolean z10) {
        HashMap hashMap;
        org.telegram.messenger.m2[][] m2VarArr;
        int i10;
        int i11;
        HashMap hashMap2;
        HashMap hashMap3;
        ArrayList arrayList;
        HashMap hashMap4;
        int i12;
        q1 q1Var;
        int i13;
        char c2;
        int i14;
        final q1 q1Var2;
        ArrayList arrayList2;
        int i15;
        long b10;
        c0 c0Var;
        HashMap hashMap5;
        CharSequence charSequence;
        int i16;
        HashMap hashMap6;
        CharSequence charSequence2;
        ?? r11;
        CharSequence charSequence3;
        CharSequence m10;
        int i17;
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl;
        ly0 ly0Var;
        String str;
        int i18 = uVar.b;
        org.telegram.messenger.m2[][] m2VarArr2 = (org.telegram.messenger.m2[][]) uVar.c;
        int length = m2VarArr2.length;
        int i19 = 0;
        for (int i20 = 0; i20 < length; i20++) {
            if (((1 << i20) & i18) != 0) {
                i19++;
            }
        }
        int L = (i19 * i3) + org.telegram.messenger.g0.L(1.0f) + (org.telegram.messenger.g0.L(48.0f) * length);
        q1 q1Var3 = this.a;
        q1Var3.x0 = L;
        ArrayList arrayList3 = q1Var3.H5;
        int i21 = q1Var3.Z5;
        q1Var3.I6 = L;
        int L2 = q1Var3.a7 - org.telegram.messenger.g0.L(q1Var3.B6 ? 0.0f : 9.0f);
        q1Var3.J5 = L2;
        if (ziVar.v0 > L2) {
            int i22 = -org.telegram.messenger.g0.L((q1Var3.W6 ? 71 : z10 ? 52 : 0) + 10);
            q1Var3.J5 = Math.max(q1Var3.a7, Math.min(ziVar.v0, org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() + i22 : org.telegram.messenger.camera.q.D(5.0f, Math.min(q1Var3.getParentWidth(), org.telegram.messenger.g0.q.y), i22)));
        }
        char c10 = 0;
        if (q1Var3.t2()) {
            q1Var3.J5 = org.telegram.messenger.g0.L(2.0f) + (q1Var3.B6 ? q1Var3.a7 - org.telegram.messenger.g0.L(8.0f) : q1Var3.getCompactContentWidth());
        }
        HashMap hashMap7 = this.b;
        HashMap hashMap8 = new HashMap(hashMap7);
        StringBuilder sb2 = ziVar.D0;
        HashMap hashMap9 = this.c;
        if (sb2 == null || (str = this.d) == null || !str.equals(sb2.toString())) {
            StringBuilder sb3 = ziVar.D0;
            if (sb3 != null) {
                this.d = sb3.toString();
            }
            hashMap = null;
        } else {
            hashMap = new HashMap(hashMap9);
        }
        hashMap7.clear();
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (i23 < length) {
            int length2 = m2VarArr2[i23].length;
            if (length2 == 0) {
                m2VarArr = m2VarArr2;
                i10 = i18;
                i11 = length;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                q1Var = q1Var3;
                arrayList = arrayList3;
                c2 = c10;
                hashMap4 = hashMap;
                i14 = i25;
                i12 = 1;
                i13 = i21;
            } else {
                int i26 = length2 - 1;
                int y9 = org.telegram.messenger.camera.q.y(2.0f, q1Var3.J5 - (org.telegram.messenger.g0.L(5.0f) * i26), length2);
                m2VarArr = m2VarArr2;
                i10 = i18;
                int i27 = i24;
                int i28 = 0;
                while (i28 < length2) {
                    org.telegram.messenger.m2 m2Var = m2VarArr[i23][i28];
                    int i29 = length;
                    int i30 = length2;
                    int i31 = i27;
                    c0 c0Var2 = new c0(new c1(q1Var3, 0));
                    c0Var2.k = m2Var;
                    if (m2Var instanceof org.telegram.messenger.n2) {
                        c0Var2.i = ((org.telegram.messenger.n2) m2Var).a;
                    } else if (m2Var instanceof org.telegram.messenger.o2) {
                        c0Var2.j = (org.telegram.messenger.o2) m2Var;
                        zi ziVar2 = q1Var3.P5;
                        if (ziVar2 != null) {
                            q1 q1Var4 = q1Var3;
                            if (org.telegram.messenger.t3.z(i21, 24, zi.B0(ziVar2.k))) {
                                q1Var2 = q1Var4;
                                arrayList2 = arrayList3;
                                if (!org.telegram.messenger.t3.z(i21, 5, zi.B0(q1Var2.P5.k)) && ((i15 = c0Var2.j.a) == 2 || i15 == 3)) {
                                    c0Var2.m = true;
                                }
                                b10 = m2Var.b();
                                int c11 = m2Var.c();
                                if (b10 != 0) {
                                    org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(0, i21, b10);
                                    c0Var2.u = g5Var;
                                    g5Var.b(new org.telegram.ui.Components.m5() { // from class: org.telegram.ui.Cells.d1
                                        @Override // org.telegram.ui.Components.m5
                                        public final void invalidate() {
                                            q1.this.p2();
                                        }
                                    });
                                    c0Var2.u.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                } else if (c11 != 0) {
                                    Drawable drawable = q1Var2.getResources().getDrawable(c11);
                                    c0Var2.t = drawable;
                                    drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                }
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = c0Var2.i;
                                String f10 = keyboardInlineButton != null ? Utilities.f(org.telegram.tgnet.tl.a.a(keyboardInlineButton)) : "";
                                String i32 = com.google.android.recaptcha.internal.a.i(i23, "_", i28);
                                c0Var = hashMap != null ? (c0) hashMap.get(i32) : (c0) hashMap8.get(f10);
                                if (c0Var == null) {
                                    System.currentTimeMillis();
                                }
                                hashMap7.put(f10, c0Var2);
                                hashMap9.put(i32, c0Var2);
                                c0Var2.c = (i28 * (org.telegram.messenger.g0.L(5.0f) + y9)) / q1Var2.J5;
                                int i33 = i25;
                                c0Var2.d = org.telegram.messenger.k5.C(2.5f, org.telegram.messenger.g0.L(48.0f) * i23, i33);
                                c0Var2.e = y9 / q1Var2.J5;
                                c0Var2.f = org.telegram.messenger.g0.L(44.0f);
                                if (i28 == 0) {
                                    c0Var2.g |= 1;
                                }
                                if (i28 == i26) {
                                    c0Var2.g |= 2;
                                }
                                if (i23 == 0) {
                                    c0Var2.g |= 4;
                                }
                                if (i23 == i29 - 1) {
                                    c0Var2.g |= 8;
                                }
                                TextPaint textPaint = (TextPaint) q1Var2.Z1("paintChatBotButton");
                                int i34 = y9;
                                if (dg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) || (zi.o1(ziVar.k).flags & 4) == 0) {
                                    hashMap5 = hashMap9;
                                    charSequence = m2Var.d();
                                } else {
                                    hashMap5 = hashMap9;
                                    charSequence = bd.M0(2131747390, null);
                                }
                                HashMap hashMap10 = hashMap8;
                                if ((m2Var instanceof org.telegram.messenger.o2) || ((org.telegram.messenger.o2) m2Var).a != 4) {
                                    i16 = i21;
                                    hashMap6 = hashMap;
                                    charSequence2 = charSequence;
                                } else {
                                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) ">");
                                    i16 = i21;
                                    wp wpVar = new wp(R.drawable.msg_inputarrow, 0);
                                    wpVar.I = 0.8f;
                                    wpVar.J = 0.8f;
                                    wpVar.x = 0.6f;
                                    hashMap6 = hashMap;
                                    append.setSpan(wpVar, append.length() - 1, append.length(), 33);
                                    charSequence2 = append;
                                }
                                CharSequence charSequence4 = charSequence2;
                                if (dg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                    charSequence4 = charSequence2;
                                    if (zi.o1(ziVar.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                        charSequence4 = wb.T0(charSequence2);
                                    }
                                }
                                if (dg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                                    SpannableStringBuilder append2 = new SpannableStringBuilder("c ").append(charSequence4);
                                    r11 = 0;
                                    wp wpVar2 = new wp(R.drawable.menu_copy_s, 0);
                                    wpVar2.I = 0.9f;
                                    wpVar2.J = 0.9f;
                                    append2.setSpan(wpVar2, 0, 1, 33);
                                    charSequence3 = append2;
                                } else {
                                    r11 = 0;
                                    charSequence3 = charSequence4;
                                }
                                m10 = org.telegram.messenger.i6.m(charSequence3, textPaint.getFontMetricsInt(), r11, null, r11);
                                if (c0Var == null && (ly0Var = c0Var.h) != null && TextUtils.equals(ly0Var.j(), m10)) {
                                    c0Var2.h = c0Var.h;
                                } else {
                                    c0Var2.h = new ly0(m10, textPaint);
                                }
                                ArrayList arrayList4 = arrayList2;
                                arrayList4.add(c0Var2);
                                if (i28 == i26) {
                                    float f11 = c0Var2.c;
                                    float f12 = q1Var2.J5;
                                    i17 = Math.max(i31, ((int) (f11 * f12)) + ((int) (c0Var2.e * f12)));
                                } else {
                                    i17 = i31;
                                }
                                tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                                if (!ziVar.q3() && tL_inlineButtonTypeUrl != null) {
                                    try {
                                        Uri parse = Uri.parse(tL_inlineButtonTypeUrl.url);
                                        String lowerCase = parse.getHost().toLowerCase();
                                        c0Var2.l = (parse.getQueryParameter("startgroup") == null && ((("http".equals(parse.getScheme()) || "https".equals(parse.getScheme())) && ("t.me".equals(lowerCase) || "telegram.me".equals(lowerCase) || "telegram.dog".equals(lowerCase))) || ("tg".equals(parse.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r11;
                                    } catch (Exception unused) {
                                    }
                                }
                                i28++;
                                q1Var3 = q1Var2;
                                arrayList3 = arrayList4;
                                i27 = i17;
                                i21 = i16;
                                length = i29;
                                y9 = i34;
                                hashMap9 = hashMap5;
                                hashMap8 = hashMap10;
                                hashMap = hashMap6;
                                i25 = i33;
                                length2 = i30;
                            } else {
                                q1Var2 = q1Var4;
                                arrayList2 = arrayList3;
                                b10 = m2Var.b();
                                int c112 = m2Var.c();
                                if (b10 != 0) {
                                }
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = c0Var2.i;
                                if (keyboardInlineButton2 != null) {
                                }
                                String i322 = com.google.android.recaptcha.internal.a.i(i23, "_", i28);
                                if (hashMap != null) {
                                }
                                if (c0Var == null) {
                                }
                                hashMap7.put(f10, c0Var2);
                                hashMap9.put(i322, c0Var2);
                                c0Var2.c = (i28 * (org.telegram.messenger.g0.L(5.0f) + y9)) / q1Var2.J5;
                                int i332 = i25;
                                c0Var2.d = org.telegram.messenger.k5.C(2.5f, org.telegram.messenger.g0.L(48.0f) * i23, i332);
                                c0Var2.e = y9 / q1Var2.J5;
                                c0Var2.f = org.telegram.messenger.g0.L(44.0f);
                                if (i28 == 0) {
                                }
                                if (i28 == i26) {
                                }
                                if (i23 == 0) {
                                }
                                if (i23 == i29 - 1) {
                                }
                                TextPaint textPaint2 = (TextPaint) q1Var2.Z1("paintChatBotButton");
                                int i342 = y9;
                                if (dg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                }
                                hashMap5 = hashMap9;
                                charSequence = m2Var.d();
                                HashMap hashMap102 = hashMap8;
                                if (m2Var instanceof org.telegram.messenger.o2) {
                                }
                                i16 = i21;
                                hashMap6 = hashMap;
                                charSequence2 = charSequence;
                                CharSequence charSequence42 = charSequence2;
                                if (dg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                }
                                if (dg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                                }
                                m10 = org.telegram.messenger.i6.m(charSequence3, textPaint2.getFontMetricsInt(), r11, null, r11);
                                if (c0Var == null) {
                                }
                                c0Var2.h = new ly0(m10, textPaint2);
                                ArrayList arrayList42 = arrayList2;
                                arrayList42.add(c0Var2);
                                if (i28 == i26) {
                                }
                                tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                                if (!ziVar.q3()) {
                                    Uri parse2 = Uri.parse(tL_inlineButtonTypeUrl.url);
                                    String lowerCase2 = parse2.getHost().toLowerCase();
                                    c0Var2.l = (parse2.getQueryParameter("startgroup") == null && ((("http".equals(parse2.getScheme()) || "https".equals(parse2.getScheme())) && ("t.me".equals(lowerCase2) || "telegram.me".equals(lowerCase2) || "telegram.dog".equals(lowerCase2))) || ("tg".equals(parse2.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r11;
                                }
                                i28++;
                                q1Var3 = q1Var2;
                                arrayList3 = arrayList42;
                                i27 = i17;
                                i21 = i16;
                                length = i29;
                                y9 = i342;
                                hashMap9 = hashMap5;
                                hashMap8 = hashMap102;
                                hashMap = hashMap6;
                                i25 = i332;
                                length2 = i30;
                            }
                        }
                    }
                    q1Var2 = q1Var3;
                    arrayList2 = arrayList3;
                    b10 = m2Var.b();
                    int c1122 = m2Var.c();
                    if (b10 != 0) {
                    }
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton22 = c0Var2.i;
                    if (keyboardInlineButton22 != null) {
                    }
                    String i3222 = com.google.android.recaptcha.internal.a.i(i23, "_", i28);
                    if (hashMap != null) {
                    }
                    if (c0Var == null) {
                    }
                    hashMap7.put(f10, c0Var2);
                    hashMap9.put(i3222, c0Var2);
                    c0Var2.c = (i28 * (org.telegram.messenger.g0.L(5.0f) + y9)) / q1Var2.J5;
                    int i3322 = i25;
                    c0Var2.d = org.telegram.messenger.k5.C(2.5f, org.telegram.messenger.g0.L(48.0f) * i23, i3322);
                    c0Var2.e = y9 / q1Var2.J5;
                    c0Var2.f = org.telegram.messenger.g0.L(44.0f);
                    if (i28 == 0) {
                    }
                    if (i28 == i26) {
                    }
                    if (i23 == 0) {
                    }
                    if (i23 == i29 - 1) {
                    }
                    TextPaint textPaint22 = (TextPaint) q1Var2.Z1("paintChatBotButton");
                    int i3422 = y9;
                    if (dg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    hashMap5 = hashMap9;
                    charSequence = m2Var.d();
                    HashMap hashMap1022 = hashMap8;
                    if (m2Var instanceof org.telegram.messenger.o2) {
                    }
                    i16 = i21;
                    hashMap6 = hashMap;
                    charSequence2 = charSequence;
                    CharSequence charSequence422 = charSequence2;
                    if (dg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    if (dg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    }
                    m10 = org.telegram.messenger.i6.m(charSequence3, textPaint22.getFontMetricsInt(), r11, null, r11);
                    if (c0Var == null) {
                    }
                    c0Var2.h = new ly0(m10, textPaint22);
                    ArrayList arrayList422 = arrayList2;
                    arrayList422.add(c0Var2);
                    if (i28 == i26) {
                    }
                    tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) dg.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                    if (!ziVar.q3()) {
                    }
                    i28++;
                    q1Var3 = q1Var2;
                    arrayList3 = arrayList422;
                    i27 = i17;
                    i21 = i16;
                    length = i29;
                    y9 = i3422;
                    hashMap9 = hashMap5;
                    hashMap8 = hashMap1022;
                    hashMap = hashMap6;
                    i25 = i3322;
                    length2 = i30;
                }
                i11 = length;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                arrayList = arrayList3;
                hashMap4 = hashMap;
                int i35 = i25;
                i12 = 1;
                int i36 = i27;
                q1Var = q1Var3;
                i13 = i21;
                if ((i10 & (1 << i23)) != 0) {
                    c0 c0Var3 = new c0(new c1(q1Var, i12));
                    c0Var3.b = true;
                    c0Var3.d = org.telegram.messenger.g0.L(49.0f) + org.telegram.messenger.k5.C(2.5f, org.telegram.messenger.g0.L(48.0f) * i23, i35);
                    c2 = 0;
                    c0Var3.f = org.telegram.messenger.g0.L(2.0f);
                    c0Var3.e = (q1Var.J5 - org.telegram.messenger.g0.L(2.0f)) / q1Var.J5;
                    arrayList.add(c0Var3);
                    i14 = i35 + i3;
                    i24 = i36;
                } else {
                    c2 = 0;
                    i24 = i36;
                    i14 = i35;
                }
            }
            i23++;
            q1Var3 = q1Var;
            arrayList3 = arrayList;
            i21 = i13;
            c10 = c2;
            i18 = i10;
            length = i11;
            hashMap9 = hashMap2;
            hashMap8 = hashMap3;
            hashMap = hashMap4;
            i25 = i14;
            m2VarArr2 = m2VarArr;
        }
        q1 q1Var5 = q1Var3;
        if (q1Var5.t2()) {
            return;
        }
        q1Var5.J5 = i24;
    }
}
