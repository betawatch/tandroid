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
import di.lb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.q90;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class f1 {
    public final q1 a;
    public final HashMap b;
    public final HashMap c;
    public String d;

    public f1(q1 q1Var) {
        new Path();
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i7;
        int L;
        q1 q1Var = this.a;
        ArrayList arrayList = q1Var.I5;
        ArrayList arrayList2 = q1Var.I5;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int N1 = (int) q1Var.N1(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = q1Var.getWidthForButtons();
                if (q1Var.Q5.P3()) {
                    L = (q1Var.getMeasuredWidth() - widthForButtons) - org.telegram.messenger.g0.L(10.0f);
                } else if (q1Var.u2()) {
                    L = q1Var.getCompactLeft();
                } else {
                    L = q1Var.N6 + org.telegram.messenger.g0.L(q1Var.C6 ? 1.0f : 7.0f);
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    c0 c0Var = (c0) arrayList2.get(i10);
                    int L2 = (c0Var.d + q1Var.e7) - org.telegram.messenger.g0.L(2.0f);
                    float f10 = x10;
                    float f11 = widthForButtons;
                    float f12 = (c0Var.c * f11) + L;
                    if (f10 >= f12 && f10 <= (c0Var.e * f11) + f12 && N1 >= L2 && N1 <= c0Var.f + L2) {
                        q1Var.N5 = i10;
                        q1Var.q2();
                        if (c0Var.s == null) {
                            y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.ed, q1Var.Qb), 6, 6);
                            c0Var.s = a02;
                            a02.setCallback(q1Var);
                            y yVar = c0Var.s;
                            int i11 = ((int) (c0Var.c * f11)) + L;
                            yVar.setBounds(i11, L2, ((int) (c0Var.e * f11)) + i11, c0Var.f + L2);
                        }
                        c0Var.s.setHotspot(f10, N1);
                        c0Var.s.setState(q1Var.N2);
                        c0Var.b(!c0Var.m);
                        q1Var.postDelayed(new ai.w0(this, q1Var.N5, 20), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (q1Var.N5 != -1) {
                    q1Var.playSoundEffect(0);
                    c0 c0Var2 = (c0) arrayList2.get(q1Var.N5);
                    y yVar2 = c0Var2.s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    c0Var2.b(false);
                    if (q1Var.Q5.r1) {
                        Toast.makeText(q1Var.getContext(), hd.M0(2131748530, null), 1).show();
                    } else {
                        l1 l1Var = q1Var.Sa;
                        if (l1Var != null && !c0Var2.m) {
                            org.telegram.messenger.o2 o2Var = c0Var2.j;
                            if (o2Var != null) {
                                l1Var.G(q1Var, o2Var);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = c0Var2.i;
                                if (keyboardInlineButton != null) {
                                    l1Var.k1(q1Var, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    q1Var.N5 = -1;
                    q1Var.q2();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i7 = q1Var.N5) != -1) {
                c0 c0Var3 = (c0) arrayList2.get(i7);
                y yVar3 = c0Var3.s;
                if (yVar3 != null) {
                    yVar3.setState(StateSet.NOTHING);
                }
                c0Var3.b(false);
                q1Var.N5 = -1;
                q1Var.q2();
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
    public final void b(Canvas canvas, ArrayList arrayList, int i7) {
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
        d80 d80Var;
        boolean z13;
        y yVar;
        float f10;
        float f11;
        ArrayList arrayList2 = arrayList;
        if (st0.f0) {
            return;
        }
        q1 q1Var2 = this.a;
        int widthForButtons = q1Var2.getWidthForButtons();
        int i13 = q1Var2.a6;
        x1 x1Var = q1Var2.ib;
        RectF rectF = q1Var2.c4;
        gj gjVar = q1Var2.Q5;
        if (gjVar != null && gjVar.P3()) {
            L = (q1Var2.getMeasuredWidth() - widthForButtons) - org.telegram.messenger.g0.L(10.0f);
        } else if (q1Var2.u2()) {
            L = q1Var2.getCompactLeft();
        } else {
            L = q1Var2.N6 + org.telegram.messenger.g0.L((q1Var2.C6 || q1Var2.K) ? 1.0f : 7.0f);
        }
        if (x1Var.x0) {
            L = (int) (L + x1Var.h0);
        }
        float L2 = (q1Var2.e7 - org.telegram.messenger.g0.L(2.0f)) + x1Var.j0;
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
        if (i7 != 255) {
            canvas.saveLayerAlpha(rectF, i7, 31);
        } else {
            canvas.save();
        }
        int i15 = 0;
        boolean z14 = false;
        while (i15 < arrayList2.size()) {
            c0 c0Var2 = (c0) arrayList2.get(i15);
            float L3 = ((c0Var2.d + q1Var2.e7) - org.telegram.messenger.g0.L(f12)) + x1Var.j0;
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
                    canvas.drawRoundRect(rectF, L5, L5, q1Var2.a2("paintChatActionBackground"));
                    if (q1Var2.h2()) {
                        canvas.drawRoundRect(rectF, L5, L5, org.telegram.ui.ActionBar.j6.h2);
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
                if (o2Var != null && q1Var2.Q5 != null) {
                    int i19 = o2Var.a;
                    if (i19 == 2) {
                        P0 |= np.s1(i11).D2(q1Var2.Q5.e1(), gj.B0(q1Var2.Q5.k), true);
                    } else if (i19 == 1) {
                        z10 = false;
                        P0 |= np.s1(i11).D2(q1Var2.Q5.e1(), gj.B0(q1Var2.Q5.k), false);
                        boolean z15 = (q1Var2.U1 || !q1Var2.V1) ? z10 : true;
                        boolean u22 = q1Var2.u2();
                        e6Var = q1Var2.Qb;
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
                            z12 = u22;
                            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
                        } else {
                            i12 = widthForButtons;
                            z12 = u22;
                        }
                        Arrays.fill(fArr, org.telegram.messenger.g0.L(Math.min(6.75f, gz.Y0)));
                        if ((c0Var2.g & 9) == 9) {
                            float L6 = org.telegram.messenger.g0.L(gz.Y0);
                            fArr[7] = L6;
                            fArr[6] = L6;
                        }
                        if ((c0Var2.g & 10) == 10) {
                            float L7 = org.telegram.messenger.g0.L(gz.Y0);
                            fArr[5] = L7;
                            fArr[4] = L7;
                        }
                        path.rewind();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas.drawPath(path, org.telegram.ui.ActionBar.j6.W0("paintChatActionBackground", e6Var));
                        org.telegram.messenger.m2 m2Var = c0Var2.k;
                        a11 = m2Var == null ? m2Var.a() : 1;
                        if (a11 != 1) {
                            int c10 = p1.g.c(a11);
                            if (c10 == 1) {
                                paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.7f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ul, e6Var)));
                            } else if (c10 == 2) {
                                paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.7f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Wl, e6Var)));
                            } else if (c10 == 3) {
                                paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.7f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Vl, e6Var)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if ((e6Var == null ? e6Var.g() : org.telegram.ui.ActionBar.j6.d1()) && (a11 == 1 || (e6Var != null && e6Var.a()))) {
                            canvas.drawPath(path, org.telegram.ui.ActionBar.j6.h2);
                        }
                        canvas.save();
                        canvas.clipPath(path);
                        if (z11) {
                            d80 d80Var2 = c0Var2.r;
                            if (d80Var2 != null && !d80Var2.d() && !c0Var2.r.c()) {
                                c0Var2.r.a();
                            }
                        } else {
                            d80 d80Var3 = c0Var2.r;
                            if (d80Var3 == null) {
                                d80 d80Var4 = new d80();
                                c0Var2.r = d80Var4;
                                d80Var4.k(5.5f);
                                d80 d80Var5 = c0Var2.r;
                                d80Var5.D = true;
                                d80Var5.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                            } else if (d80Var3.c() || c0Var2.r.d()) {
                                d80 d80Var6 = c0Var2.r;
                                d80Var6.b = -1L;
                                d80Var6.c = -1L;
                            }
                        }
                        d80Var = c0Var2.r;
                        if (d80Var == null && (z11 || d80Var.d())) {
                            rectF2.set(rectF);
                            rectF2.inset(org.telegram.messenger.g0.N(0.625f), org.telegram.messenger.g0.N(0.625f));
                            c0Var2.r.j(fArr);
                            c0Var2.r.e(rectF2);
                            int r12 = z12 ? org.telegram.ui.ActionBar.j6.r1(0.125f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Ha, e6Var)) : org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.ed, e6Var);
                            c0Var2.r.g(org.telegram.ui.ActionBar.j6.r1(f15, r12), org.telegram.ui.ActionBar.j6.r1(2.5f, r12), org.telegram.ui.ActionBar.j6.r1(3.0f, r12), org.telegram.ui.ActionBar.j6.r1(10.0f, r12));
                            c0Var2.r.setAlpha(ns.e4);
                            c0Var2.r.draw(canvas);
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yVar = c0Var2.s;
                        if (yVar == null) {
                            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            c0Var2.s.setAlpha(ns.e4);
                            c0Var2.s.draw(canvas);
                        }
                        canvas.restore();
                        canvas.save();
                        float L8 = (c0Var2.t == null || c0Var2.u != null) ? org.telegram.messenger.g0.L(26.0f) : 0;
                        float f24 = f12;
                        float A = com.google.android.gms.internal.vision.e2.A(rectF.width() - (c0Var2.h.k() + (c0Var2.t == null ? org.telegram.messenger.g0.L(4.0f) : 0)), L8, f24, rectF.left);
                        if (c0Var2.u == null) {
                            int centerY = (int) (rectF.centerY() - (org.telegram.messenger.g0.L(20.0f) / f24));
                            f10 = 3.0f;
                            int i20 = (int) A;
                            c0Var2.u.setBounds(i20, centerY, org.telegram.messenger.g0.L(20.0f) + i20, org.telegram.messenger.g0.L(20.0f) + centerY);
                            c0Var2.u.setAlpha(c0Var2.m ? 128 : ns.e4);
                            c0Var2.u.draw(canvas);
                            A += L8;
                        } else {
                            f10 = 3.0f;
                            if (c0Var2.t != null) {
                                f12 = 2.0f;
                                int centerY2 = (int) (rectF.centerY() - (org.telegram.messenger.g0.L(24.0f) / 2.0f));
                                int i21 = (int) A;
                                c0Var2.t.setBounds(i21, centerY2, org.telegram.messenger.g0.L(24.0f) + i21, org.telegram.messenger.g0.L(24.0f) + centerY2);
                                c0Var2.t.setAlpha(c0Var2.m ? 128 : ns.e4);
                                c0Var2.t.draw(canvas);
                                A += L8;
                                oy0 oy0Var = c0Var2.h;
                                float width = (rectF.width() - org.telegram.messenger.g0.L(15.0f)) - L8;
                                f11 = 1.0f;
                                oy0Var.p = Math.max(1.0f, width);
                                c0Var2.h.f(canvas, A, rectF.centerY(), c0Var2.m ? 0.5f : 1.0f);
                                canvas.restore();
                                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                                if (c0Var2.j != null) {
                                    if (c0Var2.m) {
                                        Drawable S0 = org.telegram.ui.ActionBar.j6.S0("drawableBotLock", e6Var);
                                        z.t(S0, (((int) rectF.right) - org.telegram.messenger.g0.L(f10)) - S0.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(f10));
                                        S0.draw(canvas);
                                    }
                                } else if (cg.c.b(c0Var2.i)) {
                                    Drawable S02 = org.telegram.ui.ActionBar.j6.S0("drawableBotWebView", e6Var);
                                    z.t(S02, (((int) rectF.right) - org.telegram.messenger.g0.L(f10)) - S02.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(f10));
                                    S02.draw(canvas);
                                } else if (tL_inlineButtonTypeUrl != null) {
                                    Drawable S03 = q90.q(tL_inlineButtonTypeUrl.url) ? org.telegram.ui.ActionBar.j6.S0("drawableBotWebView", e6Var) : c0Var2.l ? org.telegram.ui.ActionBar.j6.S0("drawable_botInvite", e6Var) : org.telegram.ui.ActionBar.j6.S0("drawableBotLink", e6Var);
                                    z.t(S03, (((int) rectF.right) - org.telegram.messenger.g0.L(f10)) - S03.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(f10));
                                    S03.draw(canvas);
                                } else if (cg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(c0Var2.i, TL_keyboard.TL_buttonTypeRequestPeer.class)) {
                                    Drawable S04 = org.telegram.ui.ActionBar.j6.S0("drawableBotInline", e6Var);
                                    z.t(S04, (((int) rectF.right) - org.telegram.messenger.g0.L(f10)) - S04.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(f10));
                                    S04.draw(canvas);
                                } else if (cg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) && z16) {
                                    z.t(org.telegram.ui.ActionBar.j6.w4, (((int) rectF.right) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.ui.ActionBar.j6.w4.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(4.0f));
                                    org.telegram.ui.ActionBar.j6.w4.draw(canvas);
                                }
                                canvas.restore();
                                if (z13) {
                                    z14 = true;
                                }
                            }
                        }
                        f12 = 2.0f;
                        oy0 oy0Var2 = c0Var2.h;
                        float width2 = (rectF.width() - org.telegram.messenger.g0.L(15.0f)) - L8;
                        f11 = 1.0f;
                        oy0Var2.p = Math.max(1.0f, width2);
                        c0Var2.h.f(canvas, A, rectF.centerY(), c0Var2.m ? 0.5f : 1.0f);
                        canvas.restore();
                        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl2 = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                        if (c0Var2.j != null) {
                        }
                        canvas.restore();
                        if (z13) {
                        }
                    }
                }
                z10 = false;
                if (q1Var2.U1) {
                }
                boolean u222 = q1Var2.u2();
                e6Var = q1Var2.Qb;
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
                Arrays.fill(fArr2, org.telegram.messenger.g0.L(Math.min(6.75f, gz.Y0)));
                if ((c0Var2.g & 9) == 9) {
                }
                if ((c0Var2.g & 10) == 10) {
                }
                path.rewind();
                path.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.drawPath(path, org.telegram.ui.ActionBar.j6.W0("paintChatActionBackground", e6Var));
                org.telegram.messenger.m2 m2Var2 = c0Var2.k;
                if (m2Var2 == null) {
                }
                if (a11 != 1) {
                }
                if (e6Var == null ? e6Var.g() : org.telegram.ui.ActionBar.j6.d1()) {
                    canvas.drawPath(path, org.telegram.ui.ActionBar.j6.h2);
                }
                canvas.save();
                canvas.clipPath(path);
                if (z11) {
                }
                d80Var = c0Var2.r;
                if (d80Var == null) {
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
                float A2 = com.google.android.gms.internal.vision.e2.A(rectF.width() - (c0Var2.h.k() + (c0Var2.t == null ? org.telegram.messenger.g0.L(4.0f) : 0)), L82, f242, rectF.left);
                if (c0Var2.u == null) {
                }
                f12 = 2.0f;
                oy0 oy0Var22 = c0Var2.h;
                float width22 = (rectF.width() - org.telegram.messenger.g0.L(15.0f)) - L82;
                f11 = 1.0f;
                oy0Var22.p = Math.max(1.0f, width22);
                c0Var2.h.f(canvas, A2, rectF.centerY(), c0Var2.m ? 0.5f : 1.0f);
                canvas.restore();
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl22 = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
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
            q1Var3.q2();
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
    public final void c(gj gjVar, f5.v vVar, int i7, boolean z10) {
        HashMap hashMap;
        org.telegram.messenger.m2[][] m2VarArr;
        int i10;
        int i11;
        HashMap hashMap2;
        HashMap hashMap3;
        ArrayList arrayList;
        HashMap hashMap4;
        boolean z11;
        q1 q1Var;
        int i12;
        char c10;
        int i13;
        final q1 q1Var2;
        ArrayList arrayList2;
        int i14;
        long b10;
        c0 c0Var;
        HashMap hashMap5;
        CharSequence charSequence;
        int i15;
        HashMap hashMap6;
        CharSequence charSequence2;
        ?? r11;
        CharSequence charSequence3;
        CharSequence m10;
        int i16;
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl;
        oy0 oy0Var;
        String str;
        int i17 = vVar.b;
        org.telegram.messenger.m2[][] m2VarArr2 = (org.telegram.messenger.m2[][]) vVar.c;
        int length = m2VarArr2.length;
        int i18 = 0;
        for (int i19 = 0; i19 < length; i19++) {
            if (((1 << i19) & i17) != 0) {
                i18++;
            }
        }
        int L = (i18 * i7) + org.telegram.messenger.g0.L(1.0f) + (org.telegram.messenger.g0.L(48.0f) * length);
        q1 q1Var3 = this.a;
        q1Var3.x0 = L;
        ArrayList arrayList3 = q1Var3.I5;
        int i20 = q1Var3.a6;
        q1Var3.J6 = L;
        int L2 = q1Var3.b7 - org.telegram.messenger.g0.L(q1Var3.C6 ? 0.0f : 9.0f);
        q1Var3.K5 = L2;
        if (gjVar.x0 > L2) {
            int i21 = -org.telegram.messenger.g0.L((q1Var3.X6 ? 71 : z10 ? 52 : 0) + 10);
            q1Var3.K5 = Math.max(q1Var3.b7, Math.min(gjVar.x0, org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() + i21 : i20.D(5.0f, Math.min(q1Var3.getParentWidth(), org.telegram.messenger.g0.q.y), i21)));
        }
        char c11 = 0;
        if (q1Var3.u2()) {
            q1Var3.K5 = org.telegram.messenger.g0.L(2.0f) + (q1Var3.C6 ? q1Var3.b7 - org.telegram.messenger.g0.L(8.0f) : q1Var3.getCompactContentWidth());
        }
        HashMap hashMap7 = this.b;
        HashMap hashMap8 = new HashMap(hashMap7);
        StringBuilder sb2 = gjVar.F0;
        HashMap hashMap9 = this.c;
        if (sb2 == null || (str = this.d) == null || !str.equals(sb2.toString())) {
            StringBuilder sb3 = gjVar.F0;
            if (sb3 != null) {
                this.d = sb3.toString();
            }
            hashMap = null;
        } else {
            hashMap = new HashMap(hashMap9);
        }
        hashMap7.clear();
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i22 < length) {
            int length2 = m2VarArr2[i22].length;
            if (length2 == 0) {
                m2VarArr = m2VarArr2;
                i10 = i17;
                i11 = length;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                q1Var = q1Var3;
                arrayList = arrayList3;
                c10 = c11;
                hashMap4 = hashMap;
                i13 = i24;
                z11 = true;
                i12 = i20;
            } else {
                int i25 = length2 - 1;
                int y10 = i20.y(2.0f, q1Var3.K5 - (org.telegram.messenger.g0.L(5.0f) * i25), length2);
                m2VarArr = m2VarArr2;
                i10 = i17;
                int i26 = i23;
                int i27 = 0;
                while (i27 < length2) {
                    org.telegram.messenger.m2 m2Var = m2VarArr[i22][i27];
                    int i28 = length;
                    int i29 = length2;
                    int i30 = i26;
                    c0 c0Var2 = new c0(new d1(q1Var3, 0));
                    c0Var2.k = m2Var;
                    if (m2Var instanceof org.telegram.messenger.n2) {
                        c0Var2.i = ((org.telegram.messenger.n2) m2Var).a;
                    } else if (m2Var instanceof org.telegram.messenger.o2) {
                        c0Var2.j = (org.telegram.messenger.o2) m2Var;
                        gj gjVar2 = q1Var3.Q5;
                        if (gjVar2 != null) {
                            q1 q1Var4 = q1Var3;
                            if (org.telegram.messenger.t3.z(i20, 24, gj.B0(gjVar2.k))) {
                                q1Var2 = q1Var4;
                                arrayList2 = arrayList3;
                                if (!org.telegram.messenger.t3.z(i20, 5, gj.B0(q1Var2.Q5.k)) && ((i14 = c0Var2.j.a) == 2 || i14 == 3)) {
                                    c0Var2.m = true;
                                }
                                b10 = m2Var.b();
                                int c12 = m2Var.c();
                                if (b10 != 0) {
                                    org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(0, i20, b10);
                                    c0Var2.u = g5Var;
                                    g5Var.b(new org.telegram.ui.Components.m5() { // from class: org.telegram.ui.Cells.e1
                                        @Override // org.telegram.ui.Components.m5
                                        public final void invalidate() {
                                            q1.this.q2();
                                        }
                                    });
                                    c0Var2.u.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                } else if (c12 != 0) {
                                    Drawable drawable = q1Var2.getResources().getDrawable(c12);
                                    c0Var2.t = drawable;
                                    drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                }
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = c0Var2.i;
                                String f10 = keyboardInlineButton != null ? Utilities.f(org.telegram.tgnet.tl.a.a(keyboardInlineButton)) : "";
                                String j3 = com.google.android.gms.internal.vision.e2.j(i22, "_", i27);
                                c0Var = hashMap != null ? (c0) hashMap.get(j3) : (c0) hashMap8.get(f10);
                                if (c0Var == null) {
                                    System.currentTimeMillis();
                                }
                                hashMap7.put(f10, c0Var2);
                                hashMap9.put(j3, c0Var2);
                                c0Var2.c = (i27 * (org.telegram.messenger.g0.L(5.0f) + y10)) / q1Var2.K5;
                                int i31 = i24;
                                c0Var2.d = org.telegram.messenger.k5.C(2.5f, org.telegram.messenger.g0.L(48.0f) * i22, i31);
                                c0Var2.e = y10 / q1Var2.K5;
                                c0Var2.f = org.telegram.messenger.g0.L(44.0f);
                                if (i27 == 0) {
                                    c0Var2.g |= 1;
                                }
                                if (i27 == i25) {
                                    c0Var2.g |= 2;
                                }
                                if (i22 == 0) {
                                    c0Var2.g |= 4;
                                }
                                if (i22 == i28 - 1) {
                                    c0Var2.g |= 8;
                                }
                                TextPaint textPaint = (TextPaint) q1Var2.a2("paintChatBotButton");
                                int i32 = y10;
                                if (cg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) || (gj.n1(gjVar.k).flags & 4) == 0) {
                                    hashMap5 = hashMap9;
                                    charSequence = m2Var.d();
                                } else {
                                    hashMap5 = hashMap9;
                                    charSequence = hd.M0(2131747382, null);
                                }
                                HashMap hashMap10 = hashMap8;
                                if ((m2Var instanceof org.telegram.messenger.o2) || ((org.telegram.messenger.o2) m2Var).a != 4) {
                                    i15 = i20;
                                    hashMap6 = hashMap;
                                    charSequence2 = charSequence;
                                } else {
                                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) ">");
                                    i15 = i20;
                                    eq eqVar = new eq(R.drawable.msg_inputarrow, 0);
                                    eqVar.I = 0.8f;
                                    eqVar.J = 0.8f;
                                    eqVar.x = 0.6f;
                                    hashMap6 = hashMap;
                                    append.setSpan(eqVar, append.length() - 1, append.length(), 33);
                                    charSequence2 = append;
                                }
                                CharSequence charSequence4 = charSequence2;
                                if (cg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                    charSequence4 = charSequence2;
                                    if (gj.n1(gjVar.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                        charSequence4 = lb.T0(charSequence2);
                                    }
                                }
                                if (cg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                                    SpannableStringBuilder append2 = new SpannableStringBuilder("c ").append(charSequence4);
                                    r11 = 0;
                                    eq eqVar2 = new eq(R.drawable.menu_copy_s, 0);
                                    eqVar2.I = 0.9f;
                                    eqVar2.J = 0.9f;
                                    append2.setSpan(eqVar2, 0, 1, 33);
                                    charSequence3 = append2;
                                } else {
                                    r11 = 0;
                                    charSequence3 = charSequence4;
                                }
                                m10 = org.telegram.messenger.j6.m(charSequence3, textPaint.getFontMetricsInt(), r11, null, r11);
                                if (c0Var == null && (oy0Var = c0Var.h) != null && TextUtils.equals(oy0Var.j(), m10)) {
                                    c0Var2.h = c0Var.h;
                                } else {
                                    c0Var2.h = new oy0(m10, textPaint);
                                }
                                ArrayList arrayList4 = arrayList2;
                                arrayList4.add(c0Var2);
                                if (i27 == i25) {
                                    float f11 = c0Var2.c;
                                    float f12 = q1Var2.K5;
                                    i16 = Math.max(i30, ((int) (f11 * f12)) + ((int) (c0Var2.e * f12)));
                                } else {
                                    i16 = i30;
                                }
                                tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                                if (!gjVar.p3() && tL_inlineButtonTypeUrl != null) {
                                    try {
                                        Uri parse = Uri.parse(tL_inlineButtonTypeUrl.url);
                                        String lowerCase = parse.getHost().toLowerCase();
                                        c0Var2.l = (parse.getQueryParameter("startgroup") == null && ((("http".equals(parse.getScheme()) || "https".equals(parse.getScheme())) && ("t.me".equals(lowerCase) || "telegram.me".equals(lowerCase) || "telegram.dog".equals(lowerCase))) || ("tg".equals(parse.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r11;
                                    } catch (Exception unused) {
                                    }
                                }
                                i27++;
                                q1Var3 = q1Var2;
                                arrayList3 = arrayList4;
                                i26 = i16;
                                i20 = i15;
                                length = i28;
                                y10 = i32;
                                hashMap9 = hashMap5;
                                hashMap8 = hashMap10;
                                hashMap = hashMap6;
                                i24 = i31;
                                length2 = i29;
                            } else {
                                q1Var2 = q1Var4;
                                arrayList2 = arrayList3;
                                b10 = m2Var.b();
                                int c122 = m2Var.c();
                                if (b10 != 0) {
                                }
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = c0Var2.i;
                                if (keyboardInlineButton2 != null) {
                                }
                                String j32 = com.google.android.gms.internal.vision.e2.j(i22, "_", i27);
                                if (hashMap != null) {
                                }
                                if (c0Var == null) {
                                }
                                hashMap7.put(f10, c0Var2);
                                hashMap9.put(j32, c0Var2);
                                c0Var2.c = (i27 * (org.telegram.messenger.g0.L(5.0f) + y10)) / q1Var2.K5;
                                int i312 = i24;
                                c0Var2.d = org.telegram.messenger.k5.C(2.5f, org.telegram.messenger.g0.L(48.0f) * i22, i312);
                                c0Var2.e = y10 / q1Var2.K5;
                                c0Var2.f = org.telegram.messenger.g0.L(44.0f);
                                if (i27 == 0) {
                                }
                                if (i27 == i25) {
                                }
                                if (i22 == 0) {
                                }
                                if (i22 == i28 - 1) {
                                }
                                TextPaint textPaint2 = (TextPaint) q1Var2.a2("paintChatBotButton");
                                int i322 = y10;
                                if (cg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                }
                                hashMap5 = hashMap9;
                                charSequence = m2Var.d();
                                HashMap hashMap102 = hashMap8;
                                if (m2Var instanceof org.telegram.messenger.o2) {
                                }
                                i15 = i20;
                                hashMap6 = hashMap;
                                charSequence2 = charSequence;
                                CharSequence charSequence42 = charSequence2;
                                if (cg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                }
                                if (cg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                                }
                                m10 = org.telegram.messenger.j6.m(charSequence3, textPaint2.getFontMetricsInt(), r11, null, r11);
                                if (c0Var == null) {
                                }
                                c0Var2.h = new oy0(m10, textPaint2);
                                ArrayList arrayList42 = arrayList2;
                                arrayList42.add(c0Var2);
                                if (i27 == i25) {
                                }
                                tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                                if (!gjVar.p3()) {
                                    Uri parse2 = Uri.parse(tL_inlineButtonTypeUrl.url);
                                    String lowerCase2 = parse2.getHost().toLowerCase();
                                    c0Var2.l = (parse2.getQueryParameter("startgroup") == null && ((("http".equals(parse2.getScheme()) || "https".equals(parse2.getScheme())) && ("t.me".equals(lowerCase2) || "telegram.me".equals(lowerCase2) || "telegram.dog".equals(lowerCase2))) || ("tg".equals(parse2.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r11;
                                }
                                i27++;
                                q1Var3 = q1Var2;
                                arrayList3 = arrayList42;
                                i26 = i16;
                                i20 = i15;
                                length = i28;
                                y10 = i322;
                                hashMap9 = hashMap5;
                                hashMap8 = hashMap102;
                                hashMap = hashMap6;
                                i24 = i312;
                                length2 = i29;
                            }
                        }
                    }
                    q1Var2 = q1Var3;
                    arrayList2 = arrayList3;
                    b10 = m2Var.b();
                    int c1222 = m2Var.c();
                    if (b10 != 0) {
                    }
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton22 = c0Var2.i;
                    if (keyboardInlineButton22 != null) {
                    }
                    String j322 = com.google.android.gms.internal.vision.e2.j(i22, "_", i27);
                    if (hashMap != null) {
                    }
                    if (c0Var == null) {
                    }
                    hashMap7.put(f10, c0Var2);
                    hashMap9.put(j322, c0Var2);
                    c0Var2.c = (i27 * (org.telegram.messenger.g0.L(5.0f) + y10)) / q1Var2.K5;
                    int i3122 = i24;
                    c0Var2.d = org.telegram.messenger.k5.C(2.5f, org.telegram.messenger.g0.L(48.0f) * i22, i3122);
                    c0Var2.e = y10 / q1Var2.K5;
                    c0Var2.f = org.telegram.messenger.g0.L(44.0f);
                    if (i27 == 0) {
                    }
                    if (i27 == i25) {
                    }
                    if (i22 == 0) {
                    }
                    if (i22 == i28 - 1) {
                    }
                    TextPaint textPaint22 = (TextPaint) q1Var2.a2("paintChatBotButton");
                    int i3222 = y10;
                    if (cg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    hashMap5 = hashMap9;
                    charSequence = m2Var.d();
                    HashMap hashMap1022 = hashMap8;
                    if (m2Var instanceof org.telegram.messenger.o2) {
                    }
                    i15 = i20;
                    hashMap6 = hashMap;
                    charSequence2 = charSequence;
                    CharSequence charSequence422 = charSequence2;
                    if (cg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    if (cg.c.c(c0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    }
                    m10 = org.telegram.messenger.j6.m(charSequence3, textPaint22.getFontMetricsInt(), r11, null, r11);
                    if (c0Var == null) {
                    }
                    c0Var2.h = new oy0(m10, textPaint22);
                    ArrayList arrayList422 = arrayList2;
                    arrayList422.add(c0Var2);
                    if (i27 == i25) {
                    }
                    tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(c0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                    if (!gjVar.p3()) {
                    }
                    i27++;
                    q1Var3 = q1Var2;
                    arrayList3 = arrayList422;
                    i26 = i16;
                    i20 = i15;
                    length = i28;
                    y10 = i3222;
                    hashMap9 = hashMap5;
                    hashMap8 = hashMap1022;
                    hashMap = hashMap6;
                    i24 = i3122;
                    length2 = i29;
                }
                i11 = length;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                arrayList = arrayList3;
                hashMap4 = hashMap;
                int i33 = i24;
                z11 = true;
                int i34 = i26;
                q1Var = q1Var3;
                i12 = i20;
                if ((i10 & (1 << i22)) != 0) {
                    c0 c0Var3 = new c0(new d1(q1Var, 1));
                    c0Var3.b = true;
                    c0Var3.d = org.telegram.messenger.g0.L(49.0f) + org.telegram.messenger.k5.C(2.5f, org.telegram.messenger.g0.L(48.0f) * i22, i33);
                    c10 = 0;
                    c0Var3.f = org.telegram.messenger.g0.L(2.0f);
                    c0Var3.e = (q1Var.K5 - org.telegram.messenger.g0.L(2.0f)) / q1Var.K5;
                    arrayList.add(c0Var3);
                    i13 = i33 + i7;
                    i23 = i34;
                } else {
                    c10 = 0;
                    i23 = i34;
                    i13 = i33;
                }
            }
            i22++;
            q1Var3 = q1Var;
            arrayList3 = arrayList;
            i20 = i12;
            c11 = c10;
            i17 = i10;
            length = i11;
            hashMap9 = hashMap2;
            hashMap8 = hashMap3;
            hashMap = hashMap4;
            i24 = i13;
            m2VarArr2 = m2VarArr;
        }
        q1 q1Var5 = q1Var3;
        if (q1Var5.u2()) {
            return;
        }
        q1Var5.K5 = i23;
    }
}
