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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.ua0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d1 {
    public final q1 a;
    public final HashMap b;
    public final HashMap c;
    public String d;

    public d1(q1 q1Var) {
        new Path();
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i10;
        int L;
        q1 q1Var = this.a;
        ArrayList arrayList = q1Var.G5;
        ArrayList arrayList2 = q1Var.G5;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int K1 = (int) q1Var.K1(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = q1Var.getWidthForButtons();
                if (q1Var.O5.P3()) {
                    L = (q1Var.getMeasuredWidth() - widthForButtons) - org.telegram.messenger.i0.L(10.0f);
                } else if (q1Var.r2()) {
                    L = q1Var.getCompactLeft();
                } else {
                    L = q1Var.L6 + org.telegram.messenger.i0.L(q1Var.A6 ? 1.0f : 7.0f);
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    c0 c0Var = (c0) arrayList2.get(i11);
                    int L2 = (c0Var.d + q1Var.c7) - org.telegram.messenger.i0.L(2.0f);
                    float f7 = x10;
                    float f10 = widthForButtons;
                    float f11 = (c0Var.c * f10) + L;
                    if (f7 >= f11 && f7 <= (c0Var.e * f10) + f11 && K1 >= L2 && K1 <= c0Var.f + L2) {
                        q1Var.L5 = i11;
                        q1Var.n2();
                        if (c0Var.s == null) {
                            y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.bd, q1Var.Ob), 6, 6);
                            c0Var.s = a02;
                            a02.setCallback(q1Var);
                            y yVar = c0Var.s;
                            int i12 = ((int) (c0Var.c * f10)) + L;
                            yVar.setBounds(i12, L2, ((int) (c0Var.e * f10)) + i12, c0Var.f + L2);
                        }
                        c0Var.s.setHotspot(f7, K1);
                        c0Var.s.setState(q1Var.L2);
                        c0Var.b(!c0Var.m);
                        q1Var.postDelayed(new ag.d3(this, q1Var.L5, 14), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (q1Var.L5 != -1) {
                    q1Var.playSoundEffect(0);
                    c0 c0Var2 = (c0) arrayList2.get(q1Var.L5);
                    y yVar2 = c0Var2.s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    c0Var2.b(false);
                    if (q1Var.O5.p1) {
                        Toast.makeText(q1Var.getContext(), cd.L0(2131748545, null), 1).show();
                    } else {
                        l1 l1Var = q1Var.Qa;
                        if (l1Var != null && !c0Var2.m) {
                            org.telegram.messenger.s2 s2Var = c0Var2.j;
                            if (s2Var != null) {
                                l1Var.G(q1Var, s2Var);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = c0Var2.i;
                                if (keyboardInlineButton != null) {
                                    l1Var.W0(q1Var, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    q1Var.L5 = -1;
                    q1Var.n2();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i10 = q1Var.L5) != -1) {
                c0 c0Var3 = (c0) arrayList2.get(i10);
                y yVar3 = c0Var3.s;
                if (yVar3 != null) {
                    yVar3.setState(StateSet.NOTHING);
                }
                c0Var3.b(false);
                q1Var.L5 = -1;
                q1Var.n2();
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
    public final void b(Canvas canvas, ArrayList arrayList, int i10) {
        int L;
        int i11;
        int i12;
        boolean z10;
        org.telegram.ui.ActionBar.p6 p6Var;
        boolean z11;
        Path path;
        q1 q1Var;
        float a2;
        int i13;
        boolean z12;
        int a10;
        t80 t80Var;
        boolean z13;
        y yVar;
        float f7;
        float f10;
        ArrayList arrayList2 = arrayList;
        if (uu0.e0) {
            return;
        }
        q1 q1Var2 = this.a;
        int widthForButtons = q1Var2.getWidthForButtons();
        int i14 = q1Var2.Y5;
        x1 x1Var = q1Var2.gb;
        RectF rectF = q1Var2.a4;
        jj jjVar = q1Var2.O5;
        if (jjVar != null && jjVar.P3()) {
            L = (q1Var2.getMeasuredWidth() - widthForButtons) - org.telegram.messenger.i0.L(10.0f);
        } else if (q1Var2.r2()) {
            L = q1Var2.getCompactLeft();
        } else {
            L = q1Var2.L6 + org.telegram.messenger.i0.L((q1Var2.A6 || q1Var2.J) ? 1.0f : 7.0f);
        }
        if (x1Var.x0) {
            L = (int) (L + x1Var.h0);
        }
        float L2 = (q1Var2.c7 - org.telegram.messenger.i0.L(2.0f)) + x1Var.j0;
        float f11 = 2.0f;
        float f12 = 0.0f;
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            c0 c0Var = (c0) arrayList2.get(i15);
            float f13 = c0Var.d + c0Var.f;
            if (f13 > f12) {
                f12 = f13;
            }
        }
        float f14 = 1.0f;
        rectF.set(0.0f, L2, q1Var2.getMeasuredWidth(), L2 + f12);
        if (i10 != 255) {
            canvas.saveLayerAlpha(rectF, i10, 31);
        } else {
            canvas.save();
        }
        int i16 = 0;
        boolean z14 = false;
        while (i16 < arrayList2.size()) {
            c0 c0Var2 = (c0) arrayList2.get(i16);
            float L3 = ((c0Var2.d + q1Var2.c7) - org.telegram.messenger.i0.L(f11)) + x1Var.j0;
            c0Var2.a();
            if (c0Var2.b) {
                float f15 = widthForButtons;
                float f16 = (c0Var2.c * f15) + L;
                float f17 = ((c0Var2.e * f15) + f16) - f16;
                float L4 = org.telegram.messenger.i0.L(3.66f);
                float f18 = f17 - L4;
                int round = Math.round(f18 / org.telegram.messenger.i0.L(8.66f));
                i11 = i16;
                float f19 = f18 / round;
                q1Var2.z();
                float L5 = org.telegram.messenger.i0.L(f14);
                int i17 = 0;
                while (i17 < round + 1) {
                    float f20 = (i17 * f19) + f16;
                    int i18 = i17;
                    int i19 = i14;
                    rectF.set(f20, L3, f20 + L4, c0Var2.f + L3);
                    canvas.drawRoundRect(rectF, L5, L5, q1Var2.X1("paintChatActionBackground"));
                    if (q1Var2.e2()) {
                        canvas.drawRoundRect(rectF, L5, L5, org.telegram.ui.ActionBar.t6.h2);
                    }
                    i17 = i18 + 1;
                    i14 = i19;
                }
                i12 = i14;
                q1Var = q1Var2;
                i13 = widthForButtons;
                f10 = f14;
            } else {
                i11 = i16;
                i12 = i14;
                float f21 = widthForButtons;
                float f22 = (c0Var2.c * f21) + L;
                rectF.set(f22, L3, (c0Var2.e * f21) + f22, c0Var2.f + L3);
                q1Var2.z();
                boolean N0 = q1Var2.N0(c0Var2.i);
                org.telegram.messenger.s2 s2Var = c0Var2.j;
                if (s2Var != null && q1Var2.O5 != null) {
                    int i20 = s2Var.a;
                    if (i20 == 2) {
                        N0 |= vp.r1(i12).C2(q1Var2.O5.f1(), jj.B0(q1Var2.O5.k), true);
                    } else if (i20 == 1) {
                        z10 = false;
                        N0 |= vp.r1(i12).C2(q1Var2.O5.f1(), jj.B0(q1Var2.O5.k), false);
                        boolean z15 = (q1Var2.S1 || !q1Var2.T1) ? z10 : true;
                        boolean r22 = q1Var2.r2();
                        p6Var = q1Var2.Ob;
                        RectF rectF2 = c0Var2.p;
                        Paint paint = c0Var2.o;
                        z11 = N0;
                        float[] fArr = c0Var2.q;
                        boolean z16 = z15;
                        path = c0Var2.n;
                        q1Var = q1Var2;
                        a2 = c0Var2.a();
                        canvas.save();
                        if (a2 == f14) {
                            i13 = widthForButtons;
                            z12 = r22;
                            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
                        } else {
                            i13 = widthForButtons;
                            z12 = r22;
                        }
                        Arrays.fill(fArr, org.telegram.messenger.i0.L(Math.min(6.75f, tz.Y0)));
                        if ((c0Var2.g & 9) == 9) {
                            float L6 = org.telegram.messenger.i0.L(tz.Y0);
                            fArr[7] = L6;
                            fArr[6] = L6;
                        }
                        if ((c0Var2.g & 10) == 10) {
                            float L7 = org.telegram.messenger.i0.L(tz.Y0);
                            fArr[5] = L7;
                            fArr[4] = L7;
                        }
                        path.rewind();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas.drawPath(path, org.telegram.ui.ActionBar.t6.W0("paintChatActionBackground", p6Var));
                        org.telegram.messenger.q2 q2Var = c0Var2.k;
                        a10 = q2Var == null ? q2Var.a() : 1;
                        if (a10 != 1) {
                            int c10 = m1.j.c(a10);
                            if (c10 == 1) {
                                paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.7f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Rl, p6Var)));
                            } else if (c10 == 2) {
                                paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.7f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Tl, p6Var)));
                            } else if (c10 == 3) {
                                paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.7f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sl, p6Var)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if ((p6Var == null ? p6Var.g() : org.telegram.ui.ActionBar.t6.d1()) && (a10 == 1 || (p6Var != null && p6Var.a()))) {
                            canvas.drawPath(path, org.telegram.ui.ActionBar.t6.h2);
                        }
                        canvas.save();
                        canvas.clipPath(path);
                        if (z11) {
                            t80 t80Var2 = c0Var2.r;
                            if (t80Var2 != null && !t80Var2.d() && !c0Var2.r.c()) {
                                c0Var2.r.a();
                            }
                        } else {
                            t80 t80Var3 = c0Var2.r;
                            if (t80Var3 == null) {
                                t80 t80Var4 = new t80();
                                c0Var2.r = t80Var4;
                                t80Var4.k(5.5f);
                                t80 t80Var5 = c0Var2.r;
                                t80Var5.D = true;
                                t80Var5.x.setStrokeWidth(org.telegram.messenger.i0.N(1.25f));
                            } else if (t80Var3.c() || c0Var2.r.d()) {
                                t80 t80Var6 = c0Var2.r;
                                t80Var6.b = -1L;
                                t80Var6.c = -1L;
                            }
                        }
                        t80Var = c0Var2.r;
                        if (t80Var == null && (z11 || t80Var.d())) {
                            rectF2.set(rectF);
                            rectF2.inset(org.telegram.messenger.i0.N(0.625f), org.telegram.messenger.i0.N(0.625f));
                            c0Var2.r.j(fArr);
                            c0Var2.r.e(rectF2);
                            int r12 = z12 ? org.telegram.ui.ActionBar.t6.r1(0.125f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ha, p6Var)) : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.bd, p6Var);
                            c0Var2.r.g(org.telegram.ui.ActionBar.t6.r1(f14, r12), org.telegram.ui.ActionBar.t6.r1(2.5f, r12), org.telegram.ui.ActionBar.t6.r1(3.0f, r12), org.telegram.ui.ActionBar.t6.r1(10.0f, r12));
                            c0Var2.r.setAlpha(zs.e4);
                            c0Var2.r.draw(canvas);
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yVar = c0Var2.s;
                        if (yVar == null) {
                            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            c0Var2.s.setAlpha(zs.e4);
                            c0Var2.s.draw(canvas);
                        }
                        canvas.restore();
                        canvas.save();
                        float L8 = (c0Var2.t == null || c0Var2.u != null) ? org.telegram.messenger.i0.L(26.0f) : 0;
                        float f23 = f11;
                        float B = c3.i0.B(rectF.width() - (c0Var2.h.k() + (c0Var2.t == null ? org.telegram.messenger.i0.L(4.0f) : 0)), L8, f23, rectF.left);
                        if (c0Var2.u == null) {
                            int centerY = (int) (rectF.centerY() - (org.telegram.messenger.i0.L(20.0f) / f23));
                            f7 = 3.0f;
                            int i21 = (int) B;
                            c0Var2.u.setBounds(i21, centerY, org.telegram.messenger.i0.L(20.0f) + i21, org.telegram.messenger.i0.L(20.0f) + centerY);
                            c0Var2.u.setAlpha(c0Var2.m ? 128 : zs.e4);
                            c0Var2.u.draw(canvas);
                            B += L8;
                        } else {
                            f7 = 3.0f;
                            if (c0Var2.t != null) {
                                f11 = 2.0f;
                                int centerY2 = (int) (rectF.centerY() - (org.telegram.messenger.i0.L(24.0f) / 2.0f));
                                int i22 = (int) B;
                                c0Var2.t.setBounds(i22, centerY2, org.telegram.messenger.i0.L(24.0f) + i22, org.telegram.messenger.i0.L(24.0f) + centerY2);
                                c0Var2.t.setAlpha(c0Var2.m ? 128 : zs.e4);
                                c0Var2.t.draw(canvas);
                                B += L8;
                                qz0 qz0Var = c0Var2.h;
                                float width = (rectF.width() - org.telegram.messenger.i0.L(15.0f)) - L8;
                                f10 = 1.0f;
                                qz0Var.p = Math.max(1.0f, width);
                                c0Var2.h.f(canvas, B, rectF.centerY(), c0Var2.m ? 0.5f : 1.0f);
                                canvas.restore();
                                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                                if (c0Var2.j != null) {
                                    if (c0Var2.m) {
                                        Drawable S0 = org.telegram.ui.ActionBar.t6.S0("drawableBotLock", p6Var);
                                        z.u(S0, (((int) rectF.right) - org.telegram.messenger.i0.L(f7)) - S0.getIntrinsicWidth(), rectF.top + org.telegram.messenger.i0.L(f7));
                                        S0.draw(canvas);
                                    }
                                } else if (sf.c.b(c0Var2.i)) {
                                    Drawable S02 = org.telegram.ui.ActionBar.t6.S0("drawableBotWebView", p6Var);
                                    z.u(S02, (((int) rectF.right) - org.telegram.messenger.i0.L(f7)) - S02.getIntrinsicWidth(), rectF.top + org.telegram.messenger.i0.L(f7));
                                    S02.draw(canvas);
                                } else if (tL_inlineButtonTypeUrl != null) {
                                    Drawable S03 = ua0.q(tL_inlineButtonTypeUrl.url) ? org.telegram.ui.ActionBar.t6.S0("drawableBotWebView", p6Var) : c0Var2.l ? org.telegram.ui.ActionBar.t6.S0("drawable_botInvite", p6Var) : org.telegram.ui.ActionBar.t6.S0("drawableBotLink", p6Var);
                                    z.u(S03, (((int) rectF.right) - org.telegram.messenger.i0.L(f7)) - S03.getIntrinsicWidth(), rectF.top + org.telegram.messenger.i0.L(f7));
                                    S03.draw(canvas);
                                } else if (sf.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || sf.c.c(c0Var2.i, TL_keyboard.TL_buttonTypeRequestPeer.class)) {
                                    Drawable S04 = org.telegram.ui.ActionBar.t6.S0("drawableBotInline", p6Var);
                                    z.u(S04, (((int) rectF.right) - org.telegram.messenger.i0.L(f7)) - S04.getIntrinsicWidth(), rectF.top + org.telegram.messenger.i0.L(f7));
                                    S04.draw(canvas);
                                } else if (sf.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) && z16) {
                                    z.u(org.telegram.ui.ActionBar.t6.w4, (((int) rectF.right) - org.telegram.messenger.i0.L(5.0f)) - org.telegram.ui.ActionBar.t6.w4.getIntrinsicWidth(), rectF.top + org.telegram.messenger.i0.L(4.0f));
                                    org.telegram.ui.ActionBar.t6.w4.draw(canvas);
                                }
                                canvas.restore();
                                if (z13) {
                                    z14 = true;
                                }
                            }
                        }
                        f11 = 2.0f;
                        qz0 qz0Var2 = c0Var2.h;
                        float width2 = (rectF.width() - org.telegram.messenger.i0.L(15.0f)) - L8;
                        f10 = 1.0f;
                        qz0Var2.p = Math.max(1.0f, width2);
                        c0Var2.h.f(canvas, B, rectF.centerY(), c0Var2.m ? 0.5f : 1.0f);
                        canvas.restore();
                        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl2 = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                        if (c0Var2.j != null) {
                        }
                        canvas.restore();
                        if (z13) {
                        }
                    }
                }
                z10 = false;
                if (q1Var2.S1) {
                }
                boolean r222 = q1Var2.r2();
                p6Var = q1Var2.Ob;
                RectF rectF22 = c0Var2.p;
                Paint paint2 = c0Var2.o;
                z11 = N0;
                float[] fArr2 = c0Var2.q;
                boolean z162 = z15;
                path = c0Var2.n;
                q1Var = q1Var2;
                a2 = c0Var2.a();
                canvas.save();
                if (a2 == f14) {
                }
                Arrays.fill(fArr2, org.telegram.messenger.i0.L(Math.min(6.75f, tz.Y0)));
                if ((c0Var2.g & 9) == 9) {
                }
                if ((c0Var2.g & 10) == 10) {
                }
                path.rewind();
                path.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.drawPath(path, org.telegram.ui.ActionBar.t6.W0("paintChatActionBackground", p6Var));
                org.telegram.messenger.q2 q2Var2 = c0Var2.k;
                if (q2Var2 == null) {
                }
                if (a10 != 1) {
                }
                if (p6Var == null ? p6Var.g() : org.telegram.ui.ActionBar.t6.d1()) {
                    canvas.drawPath(path, org.telegram.ui.ActionBar.t6.h2);
                }
                canvas.save();
                canvas.clipPath(path);
                if (z11) {
                }
                t80Var = c0Var2.r;
                if (t80Var == null) {
                }
                z13 = false;
                yVar = c0Var2.s;
                if (yVar == null) {
                }
                canvas.restore();
                canvas.save();
                if (c0Var2.t == null) {
                }
                float L82 = (c0Var2.t == null || c0Var2.u != null) ? org.telegram.messenger.i0.L(26.0f) : 0;
                float f232 = f11;
                float B2 = c3.i0.B(rectF.width() - (c0Var2.h.k() + (c0Var2.t == null ? org.telegram.messenger.i0.L(4.0f) : 0)), L82, f232, rectF.left);
                if (c0Var2.u == null) {
                }
                f11 = 2.0f;
                qz0 qz0Var22 = c0Var2.h;
                float width22 = (rectF.width() - org.telegram.messenger.i0.L(15.0f)) - L82;
                f10 = 1.0f;
                qz0Var22.p = Math.max(1.0f, width22);
                c0Var2.h.f(canvas, B2, rectF.centerY(), c0Var2.m ? 0.5f : 1.0f);
                canvas.restore();
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl22 = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (c0Var2.j != null) {
                }
                canvas.restore();
                if (z13) {
                }
            }
            i16 = i11 + 1;
            f14 = f10;
            i14 = i12;
            q1Var2 = q1Var;
            widthForButtons = i13;
            arrayList2 = arrayList;
        }
        q1 q1Var3 = q1Var2;
        canvas.restore();
        if (z14) {
            q1Var3.n2();
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
    public final void c(jj jjVar, c5.x xVar, int i10, boolean z10) {
        HashMap hashMap;
        org.telegram.messenger.q2[][] q2VarArr;
        int i11;
        int i12;
        HashMap hashMap2;
        HashMap hashMap3;
        ArrayList arrayList;
        HashMap hashMap4;
        int i13;
        q1 q1Var;
        int i14;
        char c10;
        int i15;
        final q1 q1Var2;
        ArrayList arrayList2;
        int i16;
        long b10;
        c0 c0Var;
        HashMap hashMap5;
        CharSequence charSequence;
        int i17;
        HashMap hashMap6;
        CharSequence charSequence2;
        ?? r11;
        CharSequence charSequence3;
        CharSequence m10;
        int i18;
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl;
        qz0 qz0Var;
        String str;
        int i19 = xVar.b;
        org.telegram.messenger.q2[][] q2VarArr2 = (org.telegram.messenger.q2[][]) xVar.c;
        int length = q2VarArr2.length;
        int i20 = 0;
        for (int i21 = 0; i21 < length; i21++) {
            if (((1 << i21) & i19) != 0) {
                i20++;
            }
        }
        int L = (i20 * i10) + org.telegram.messenger.i0.L(1.0f) + (org.telegram.messenger.i0.L(48.0f) * length);
        q1 q1Var3 = this.a;
        q1Var3.w0 = L;
        ArrayList arrayList3 = q1Var3.G5;
        int i22 = q1Var3.Y5;
        q1Var3.H6 = L;
        int L2 = q1Var3.Z6 - org.telegram.messenger.i0.L(q1Var3.A6 ? 0.0f : 9.0f);
        q1Var3.I5 = L2;
        if (jjVar.v0 > L2) {
            int i23 = -org.telegram.messenger.i0.L((q1Var3.V6 ? 71 : z10 ? 52 : 0) + 10);
            q1Var3.I5 = Math.max(q1Var3.Z6, Math.min(jjVar.v0, org.telegram.messenger.i0.Q1() ? org.telegram.messenger.i0.Q0() + i23 : z20.D(5.0f, Math.min(q1Var3.getParentWidth(), org.telegram.messenger.i0.q.y), i23)));
        }
        char c11 = 0;
        if (q1Var3.r2()) {
            q1Var3.I5 = org.telegram.messenger.i0.L(2.0f) + (q1Var3.A6 ? q1Var3.Z6 - org.telegram.messenger.i0.L(8.0f) : q1Var3.getCompactContentWidth());
        }
        HashMap hashMap7 = this.b;
        HashMap hashMap8 = new HashMap(hashMap7);
        StringBuilder sb2 = jjVar.D0;
        HashMap hashMap9 = this.c;
        if (sb2 == null || (str = this.d) == null || !str.equals(sb2.toString())) {
            StringBuilder sb3 = jjVar.D0;
            if (sb3 != null) {
                this.d = sb3.toString();
            }
            hashMap = null;
        } else {
            hashMap = new HashMap(hashMap9);
        }
        hashMap7.clear();
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        while (i24 < length) {
            int length2 = q2VarArr2[i24].length;
            if (length2 == 0) {
                q2VarArr = q2VarArr2;
                i11 = i19;
                i12 = length;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                q1Var = q1Var3;
                arrayList = arrayList3;
                c10 = c11;
                hashMap4 = hashMap;
                i15 = i26;
                i13 = 1;
                i14 = i22;
            } else {
                int i27 = length2 - 1;
                int y3 = z20.y(2.0f, q1Var3.I5 - (org.telegram.messenger.i0.L(5.0f) * i27), length2);
                q2VarArr = q2VarArr2;
                i11 = i19;
                int i28 = i25;
                int i29 = 0;
                while (i29 < length2) {
                    org.telegram.messenger.q2 q2Var = q2VarArr[i24][i29];
                    int i30 = length;
                    int i31 = length2;
                    int i32 = i28;
                    c0 c0Var2 = new c0(new b1(q1Var3, 0));
                    c0Var2.k = q2Var;
                    if (q2Var instanceof org.telegram.messenger.r2) {
                        c0Var2.i = ((org.telegram.messenger.r2) q2Var).a;
                    } else if (q2Var instanceof org.telegram.messenger.s2) {
                        c0Var2.j = (org.telegram.messenger.s2) q2Var;
                        jj jjVar2 = q1Var3.O5;
                        if (jjVar2 != null) {
                            q1 q1Var4 = q1Var3;
                            if (org.telegram.messenger.w3.z(i22, 24, jj.B0(jjVar2.k))) {
                                q1Var2 = q1Var4;
                                arrayList2 = arrayList3;
                                if (!org.telegram.messenger.w3.z(i22, 5, jj.B0(q1Var2.O5.k)) && ((i16 = c0Var2.j.a) == 2 || i16 == 3)) {
                                    c0Var2.m = true;
                                }
                                b10 = q2Var.b();
                                int c12 = q2Var.c();
                                if (b10 != 0) {
                                    org.telegram.ui.Components.f5 f5Var = new org.telegram.ui.Components.f5(0, i22, b10);
                                    c0Var2.u = f5Var;
                                    f5Var.b(new org.telegram.ui.Components.l5() { // from class: org.telegram.ui.Cells.c1
                                        @Override // org.telegram.ui.Components.l5
                                        public final void invalidate() {
                                            q1.this.n2();
                                        }
                                    });
                                    c0Var2.u.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                } else if (c12 != 0) {
                                    Drawable drawable = q1Var2.getResources().getDrawable(c12);
                                    c0Var2.t = drawable;
                                    drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                }
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = c0Var2.i;
                                String f7 = keyboardInlineButton != null ? Utilities.f(org.telegram.tgnet.tl.a.a(keyboardInlineButton)) : "";
                                String i33 = a1.g.i(i24, i29, "_");
                                c0Var = hashMap != null ? (c0) hashMap.get(i33) : (c0) hashMap8.get(f7);
                                if (c0Var == null) {
                                    System.currentTimeMillis();
                                }
                                hashMap7.put(f7, c0Var2);
                                hashMap9.put(i33, c0Var2);
                                c0Var2.c = (i29 * (org.telegram.messenger.i0.L(5.0f) + y3)) / q1Var2.I5;
                                int i34 = i26;
                                c0Var2.d = org.telegram.messenger.m5.C(2.5f, org.telegram.messenger.i0.L(48.0f) * i24, i34);
                                c0Var2.e = y3 / q1Var2.I5;
                                c0Var2.f = org.telegram.messenger.i0.L(44.0f);
                                if (i29 == 0) {
                                    c0Var2.g |= 1;
                                }
                                if (i29 == i27) {
                                    c0Var2.g |= 2;
                                }
                                if (i24 == 0) {
                                    c0Var2.g |= 4;
                                }
                                if (i24 == i30 - 1) {
                                    c0Var2.g |= 8;
                                }
                                TextPaint textPaint = (TextPaint) q1Var2.X1("paintChatBotButton");
                                int i35 = y3;
                                if (sf.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) || (jj.o1(jjVar.k).flags & 4) == 0) {
                                    hashMap5 = hashMap9;
                                    charSequence = q2Var.d();
                                } else {
                                    hashMap5 = hashMap9;
                                    charSequence = cd.L0(2131747398, null);
                                }
                                HashMap hashMap10 = hashMap8;
                                if ((q2Var instanceof org.telegram.messenger.s2) || ((org.telegram.messenger.s2) q2Var).a != 4) {
                                    i17 = i22;
                                    hashMap6 = hashMap;
                                    charSequence2 = charSequence;
                                } else {
                                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) ">");
                                    i17 = i22;
                                    dq dqVar = new dq(R.drawable.msg_inputarrow, 0);
                                    dqVar.H = 0.8f;
                                    dqVar.I = 0.8f;
                                    dqVar.x = 0.6f;
                                    hashMap6 = hashMap;
                                    append.setSpan(dqVar, append.length() - 1, append.length(), 33);
                                    charSequence2 = append;
                                }
                                CharSequence charSequence4 = charSequence2;
                                if (sf.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                    charSequence4 = charSequence2;
                                    if (jj.o1(jjVar.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                        charSequence4 = rh.h8.S0(charSequence2);
                                    }
                                }
                                if (sf.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                                    SpannableStringBuilder append2 = new SpannableStringBuilder("c ").append(charSequence4);
                                    r11 = 0;
                                    dq dqVar2 = new dq(R.drawable.menu_copy_s, 0);
                                    dqVar2.H = 0.9f;
                                    dqVar2.I = 0.9f;
                                    append2.setSpan(dqVar2, 0, 1, 33);
                                    charSequence3 = append2;
                                } else {
                                    r11 = 0;
                                    charSequence3 = charSequence4;
                                }
                                m10 = org.telegram.messenger.k6.m(charSequence3, textPaint.getFontMetricsInt(), r11, null, r11);
                                if (c0Var == null && (qz0Var = c0Var.h) != null && TextUtils.equals(qz0Var.j(), m10)) {
                                    c0Var2.h = c0Var.h;
                                } else {
                                    c0Var2.h = new qz0(m10, textPaint);
                                }
                                ArrayList arrayList4 = arrayList2;
                                arrayList4.add(c0Var2);
                                if (i29 == i27) {
                                    float f10 = c0Var2.c;
                                    float f11 = q1Var2.I5;
                                    i18 = Math.max(i32, ((int) (f10 * f11)) + ((int) (c0Var2.e * f11)));
                                } else {
                                    i18 = i32;
                                }
                                tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                                if (!jjVar.p3() && tL_inlineButtonTypeUrl != null) {
                                    try {
                                        Uri parse = Uri.parse(tL_inlineButtonTypeUrl.url);
                                        String lowerCase = parse.getHost().toLowerCase();
                                        c0Var2.l = (parse.getQueryParameter("startgroup") == null && ((("http".equals(parse.getScheme()) || "https".equals(parse.getScheme())) && ("t.me".equals(lowerCase) || "telegram.me".equals(lowerCase) || "telegram.dog".equals(lowerCase))) || ("tg".equals(parse.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r11;
                                    } catch (Exception unused) {
                                    }
                                }
                                i29++;
                                q1Var3 = q1Var2;
                                arrayList3 = arrayList4;
                                i28 = i18;
                                i22 = i17;
                                length = i30;
                                y3 = i35;
                                hashMap9 = hashMap5;
                                hashMap8 = hashMap10;
                                hashMap = hashMap6;
                                i26 = i34;
                                length2 = i31;
                            } else {
                                q1Var2 = q1Var4;
                                arrayList2 = arrayList3;
                                b10 = q2Var.b();
                                int c122 = q2Var.c();
                                if (b10 != 0) {
                                }
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = c0Var2.i;
                                if (keyboardInlineButton2 != null) {
                                }
                                String i332 = a1.g.i(i24, i29, "_");
                                if (hashMap != null) {
                                }
                                if (c0Var == null) {
                                }
                                hashMap7.put(f7, c0Var2);
                                hashMap9.put(i332, c0Var2);
                                c0Var2.c = (i29 * (org.telegram.messenger.i0.L(5.0f) + y3)) / q1Var2.I5;
                                int i342 = i26;
                                c0Var2.d = org.telegram.messenger.m5.C(2.5f, org.telegram.messenger.i0.L(48.0f) * i24, i342);
                                c0Var2.e = y3 / q1Var2.I5;
                                c0Var2.f = org.telegram.messenger.i0.L(44.0f);
                                if (i29 == 0) {
                                }
                                if (i29 == i27) {
                                }
                                if (i24 == 0) {
                                }
                                if (i24 == i30 - 1) {
                                }
                                TextPaint textPaint2 = (TextPaint) q1Var2.X1("paintChatBotButton");
                                int i352 = y3;
                                if (sf.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                }
                                hashMap5 = hashMap9;
                                charSequence = q2Var.d();
                                HashMap hashMap102 = hashMap8;
                                if (q2Var instanceof org.telegram.messenger.s2) {
                                }
                                i17 = i22;
                                hashMap6 = hashMap;
                                charSequence2 = charSequence;
                                CharSequence charSequence42 = charSequence2;
                                if (sf.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                }
                                if (sf.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                                }
                                m10 = org.telegram.messenger.k6.m(charSequence3, textPaint2.getFontMetricsInt(), r11, null, r11);
                                if (c0Var == null) {
                                }
                                c0Var2.h = new qz0(m10, textPaint2);
                                ArrayList arrayList42 = arrayList2;
                                arrayList42.add(c0Var2);
                                if (i29 == i27) {
                                }
                                tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                                if (!jjVar.p3()) {
                                    Uri parse2 = Uri.parse(tL_inlineButtonTypeUrl.url);
                                    String lowerCase2 = parse2.getHost().toLowerCase();
                                    c0Var2.l = (parse2.getQueryParameter("startgroup") == null && ((("http".equals(parse2.getScheme()) || "https".equals(parse2.getScheme())) && ("t.me".equals(lowerCase2) || "telegram.me".equals(lowerCase2) || "telegram.dog".equals(lowerCase2))) || ("tg".equals(parse2.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r11;
                                }
                                i29++;
                                q1Var3 = q1Var2;
                                arrayList3 = arrayList42;
                                i28 = i18;
                                i22 = i17;
                                length = i30;
                                y3 = i352;
                                hashMap9 = hashMap5;
                                hashMap8 = hashMap102;
                                hashMap = hashMap6;
                                i26 = i342;
                                length2 = i31;
                            }
                        }
                    }
                    q1Var2 = q1Var3;
                    arrayList2 = arrayList3;
                    b10 = q2Var.b();
                    int c1222 = q2Var.c();
                    if (b10 != 0) {
                    }
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton22 = c0Var2.i;
                    if (keyboardInlineButton22 != null) {
                    }
                    String i3322 = a1.g.i(i24, i29, "_");
                    if (hashMap != null) {
                    }
                    if (c0Var == null) {
                    }
                    hashMap7.put(f7, c0Var2);
                    hashMap9.put(i3322, c0Var2);
                    c0Var2.c = (i29 * (org.telegram.messenger.i0.L(5.0f) + y3)) / q1Var2.I5;
                    int i3422 = i26;
                    c0Var2.d = org.telegram.messenger.m5.C(2.5f, org.telegram.messenger.i0.L(48.0f) * i24, i3422);
                    c0Var2.e = y3 / q1Var2.I5;
                    c0Var2.f = org.telegram.messenger.i0.L(44.0f);
                    if (i29 == 0) {
                    }
                    if (i29 == i27) {
                    }
                    if (i24 == 0) {
                    }
                    if (i24 == i30 - 1) {
                    }
                    TextPaint textPaint22 = (TextPaint) q1Var2.X1("paintChatBotButton");
                    int i3522 = y3;
                    if (sf.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    hashMap5 = hashMap9;
                    charSequence = q2Var.d();
                    HashMap hashMap1022 = hashMap8;
                    if (q2Var instanceof org.telegram.messenger.s2) {
                    }
                    i17 = i22;
                    hashMap6 = hashMap;
                    charSequence2 = charSequence;
                    CharSequence charSequence422 = charSequence2;
                    if (sf.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    if (sf.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    }
                    m10 = org.telegram.messenger.k6.m(charSequence3, textPaint22.getFontMetricsInt(), r11, null, r11);
                    if (c0Var == null) {
                    }
                    c0Var2.h = new qz0(m10, textPaint22);
                    ArrayList arrayList422 = arrayList2;
                    arrayList422.add(c0Var2);
                    if (i29 == i27) {
                    }
                    tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) sf.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                    if (!jjVar.p3()) {
                    }
                    i29++;
                    q1Var3 = q1Var2;
                    arrayList3 = arrayList422;
                    i28 = i18;
                    i22 = i17;
                    length = i30;
                    y3 = i3522;
                    hashMap9 = hashMap5;
                    hashMap8 = hashMap1022;
                    hashMap = hashMap6;
                    i26 = i3422;
                    length2 = i31;
                }
                i12 = length;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                arrayList = arrayList3;
                hashMap4 = hashMap;
                int i36 = i26;
                i13 = 1;
                int i37 = i28;
                q1Var = q1Var3;
                i14 = i22;
                if ((i11 & (1 << i24)) != 0) {
                    c0 c0Var3 = new c0(new b1(q1Var, i13));
                    c0Var3.b = true;
                    c0Var3.d = org.telegram.messenger.i0.L(49.0f) + org.telegram.messenger.m5.C(2.5f, org.telegram.messenger.i0.L(48.0f) * i24, i36);
                    c10 = 0;
                    c0Var3.f = org.telegram.messenger.i0.L(2.0f);
                    c0Var3.e = (q1Var.I5 - org.telegram.messenger.i0.L(2.0f)) / q1Var.I5;
                    arrayList.add(c0Var3);
                    i15 = i36 + i10;
                    i25 = i37;
                } else {
                    c10 = 0;
                    i25 = i37;
                    i15 = i36;
                }
            }
            i24++;
            q1Var3 = q1Var;
            arrayList3 = arrayList;
            i22 = i14;
            c11 = c10;
            i19 = i11;
            length = i12;
            hashMap9 = hashMap2;
            hashMap8 = hashMap3;
            hashMap = hashMap4;
            i26 = i15;
            q2VarArr2 = q2VarArr;
        }
        q1 q1Var5 = q1Var3;
        if (q1Var5.r2()) {
            return;
        }
        q1Var5.I5 = i25;
    }
}
