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
import di.pb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.r90;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g1 {
    public final r1 a;
    public final HashMap b;
    public final HashMap c;
    public String d;

    public g1(r1 r1Var) {
        new Path();
        this.b = new HashMap();
        this.c = new HashMap();
        this.a = r1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i7;
        int L;
        r1 r1Var = this.a;
        ArrayList arrayList = r1Var.I5;
        ArrayList arrayList2 = r1Var.I5;
        if (!arrayList.isEmpty()) {
            int x10 = (int) motionEvent.getX();
            int N1 = (int) r1Var.N1(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = r1Var.getWidthForButtons();
                if (r1Var.Q5.P3()) {
                    L = (r1Var.getMeasuredWidth() - widthForButtons) - org.telegram.messenger.g0.L(10.0f);
                } else if (r1Var.u2()) {
                    L = r1Var.getCompactLeft();
                } else {
                    L = r1Var.N6 + org.telegram.messenger.g0.L(r1Var.C6 ? 1.0f : 7.0f);
                }
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    d0 d0Var = (d0) arrayList2.get(i10);
                    int L2 = (d0Var.d + r1Var.e7) - org.telegram.messenger.g0.L(2.0f);
                    float f10 = x10;
                    float f11 = widthForButtons;
                    float f12 = (d0Var.c * f11) + L;
                    if (f10 >= f12 && f10 <= (d0Var.e * f11) + f12 && N1 >= L2 && N1 <= d0Var.f + L2) {
                        r1Var.N5 = i10;
                        r1Var.q2();
                        if (d0Var.s == null) {
                            y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.ed, r1Var.Qb), 6, 6);
                            d0Var.s = a02;
                            a02.setCallback(r1Var);
                            y yVar = d0Var.s;
                            int i11 = ((int) (d0Var.c * f11)) + L;
                            yVar.setBounds(i11, L2, ((int) (d0Var.e * f11)) + i11, d0Var.f + L2);
                        }
                        d0Var.s.setHotspot(f10, N1);
                        d0Var.s.setState(r1Var.N2);
                        d0Var.b(!d0Var.m);
                        r1Var.postDelayed(new ai.u0(this, r1Var.N5, 25), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (r1Var.N5 != -1) {
                    r1Var.playSoundEffect(0);
                    d0 d0Var2 = (d0) arrayList2.get(r1Var.N5);
                    y yVar2 = d0Var2.s;
                    if (yVar2 != null) {
                        yVar2.setState(StateSet.NOTHING);
                    }
                    d0Var2.b(false);
                    if (r1Var.Q5.r1) {
                        Toast.makeText(r1Var.getContext(), gd.N0(2131748337, null), 1).show();
                    } else {
                        m1 m1Var = r1Var.Sa;
                        if (m1Var != null && !d0Var2.m) {
                            org.telegram.messenger.p2 p2Var = d0Var2.j;
                            if (p2Var != null) {
                                m1Var.L(r1Var, p2Var);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = d0Var2.i;
                                if (keyboardInlineButton != null) {
                                    m1Var.m1(r1Var, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    r1Var.N5 = -1;
                    r1Var.q2();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i7 = r1Var.N5) != -1) {
                d0 d0Var3 = (d0) arrayList2.get(i7);
                y yVar3 = d0Var3.s;
                if (yVar3 != null) {
                    yVar3.setState(StateSet.NOTHING);
                }
                d0Var3.b(false);
                r1Var.N5 = -1;
                r1Var.q2();
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
        org.telegram.ui.ActionBar.i6 i6Var;
        boolean z11;
        Path path;
        r1 r1Var;
        float a10;
        int i12;
        boolean z12;
        int a11;
        n80 n80Var;
        boolean z13;
        y yVar;
        float f10;
        float f11;
        ArrayList arrayList2 = arrayList;
        if (cu0.f0) {
            return;
        }
        r1 r1Var2 = this.a;
        int widthForButtons = r1Var2.getWidthForButtons();
        int i13 = r1Var2.a6;
        y1 y1Var = r1Var2.ib;
        RectF rectF = r1Var2.c4;
        fj fjVar = r1Var2.Q5;
        if (fjVar != null && fjVar.P3()) {
            L = (r1Var2.getMeasuredWidth() - widthForButtons) - org.telegram.messenger.g0.L(10.0f);
        } else if (r1Var2.u2()) {
            L = r1Var2.getCompactLeft();
        } else {
            L = r1Var2.N6 + org.telegram.messenger.g0.L((r1Var2.C6 || r1Var2.K) ? 1.0f : 7.0f);
        }
        if (y1Var.x0) {
            L = (int) (L + y1Var.h0);
        }
        float L2 = (r1Var2.e7 - org.telegram.messenger.g0.L(2.0f)) + y1Var.j0;
        float f12 = 2.0f;
        float f13 = 0.0f;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            d0 d0Var = (d0) arrayList2.get(i14);
            float f14 = d0Var.d + d0Var.f;
            if (f14 > f13) {
                f13 = f14;
            }
        }
        float f15 = 1.0f;
        rectF.set(0.0f, L2, r1Var2.getMeasuredWidth(), L2 + f13);
        if (i7 != 255) {
            canvas.saveLayerAlpha(rectF, i7, 31);
        } else {
            canvas.save();
        }
        int i15 = 0;
        boolean z14 = false;
        while (i15 < arrayList2.size()) {
            d0 d0Var2 = (d0) arrayList2.get(i15);
            float L3 = ((d0Var2.d + r1Var2.e7) - org.telegram.messenger.g0.L(f12)) + y1Var.j0;
            d0Var2.a();
            if (d0Var2.b) {
                float f16 = widthForButtons;
                float f17 = (d0Var2.c * f16) + L;
                float f18 = ((d0Var2.e * f16) + f17) - f17;
                float L4 = org.telegram.messenger.g0.L(3.66f);
                float f19 = f18 - L4;
                int round = Math.round(f19 / org.telegram.messenger.g0.L(8.66f));
                i10 = i15;
                float f20 = f19 / round;
                r1Var2.z();
                float L5 = org.telegram.messenger.g0.L(f15);
                int i16 = 0;
                while (i16 < round + 1) {
                    float f21 = (i16 * f20) + f17;
                    int i17 = i16;
                    int i18 = i13;
                    rectF.set(f21, L3, f21 + L4, d0Var2.f + L3);
                    canvas.drawRoundRect(rectF, L5, L5, r1Var2.a2("paintChatActionBackground"));
                    if (r1Var2.h2()) {
                        canvas.drawRoundRect(rectF, L5, L5, org.telegram.ui.ActionBar.n6.h2);
                    }
                    i16 = i17 + 1;
                    i13 = i18;
                }
                i11 = i13;
                r1Var = r1Var2;
                i12 = widthForButtons;
                f11 = f15;
            } else {
                i10 = i15;
                i11 = i13;
                float f22 = widthForButtons;
                float f23 = (d0Var2.c * f22) + L;
                rectF.set(f23, L3, (d0Var2.e * f22) + f23, d0Var2.f + L3);
                r1Var2.z();
                boolean P0 = r1Var2.P0(d0Var2.i);
                org.telegram.messenger.p2 p2Var = d0Var2.j;
                if (p2Var != null && r1Var2.Q5 != null) {
                    int i19 = p2Var.a;
                    if (i19 == 2) {
                        P0 |= mp.u1(i11).J2(r1Var2.Q5.e1(), fj.B0(r1Var2.Q5.k), true);
                    } else if (i19 == 1) {
                        z10 = false;
                        P0 |= mp.u1(i11).J2(r1Var2.Q5.e1(), fj.B0(r1Var2.Q5.k), false);
                        boolean z15 = (r1Var2.U1 || !r1Var2.V1) ? z10 : true;
                        boolean u22 = r1Var2.u2();
                        i6Var = r1Var2.Qb;
                        RectF rectF2 = d0Var2.p;
                        Paint paint = d0Var2.o;
                        z11 = P0;
                        float[] fArr = d0Var2.q;
                        boolean z16 = z15;
                        path = d0Var2.n;
                        r1Var = r1Var2;
                        a10 = d0Var2.a();
                        canvas.save();
                        if (a10 == f15) {
                            i12 = widthForButtons;
                            z12 = u22;
                            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
                        } else {
                            i12 = widthForButtons;
                            z12 = u22;
                        }
                        Arrays.fill(fArr, org.telegram.messenger.g0.L(Math.min(6.75f, bz.Y0)));
                        if ((d0Var2.g & 9) == 9) {
                            float L6 = org.telegram.messenger.g0.L(bz.Y0);
                            fArr[7] = L6;
                            fArr[6] = L6;
                        }
                        if ((d0Var2.g & 10) == 10) {
                            float L7 = org.telegram.messenger.g0.L(bz.Y0);
                            fArr[5] = L7;
                            fArr[4] = L7;
                        }
                        path.rewind();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas.drawPath(path, org.telegram.ui.ActionBar.n6.W0("paintChatActionBackground", i6Var));
                        org.telegram.messenger.n2 n2Var = d0Var2.k;
                        a11 = n2Var == null ? n2Var.a() : 1;
                        if (a11 != 1) {
                            int c10 = p1.g.c(a11);
                            if (c10 == 1) {
                                paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.7f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ul, i6Var)));
                            } else if (c10 == 2) {
                                paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.7f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Wl, i6Var)));
                            } else if (c10 == 3) {
                                paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.7f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Vl, i6Var)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if ((i6Var == null ? i6Var.h() : org.telegram.ui.ActionBar.n6.d1()) && (a11 == 1 || (i6Var != null && i6Var.b()))) {
                            canvas.drawPath(path, org.telegram.ui.ActionBar.n6.h2);
                        }
                        canvas.save();
                        canvas.clipPath(path);
                        if (z11) {
                            n80 n80Var2 = d0Var2.r;
                            if (n80Var2 != null && !n80Var2.d() && !d0Var2.r.c()) {
                                d0Var2.r.a();
                            }
                        } else {
                            n80 n80Var3 = d0Var2.r;
                            if (n80Var3 == null) {
                                n80 n80Var4 = new n80();
                                d0Var2.r = n80Var4;
                                n80Var4.k(5.5f);
                                n80 n80Var5 = d0Var2.r;
                                n80Var5.D = true;
                                n80Var5.x.setStrokeWidth(org.telegram.messenger.g0.N(1.25f));
                            } else if (n80Var3.c() || d0Var2.r.d()) {
                                n80 n80Var6 = d0Var2.r;
                                n80Var6.b = -1L;
                                n80Var6.c = -1L;
                            }
                        }
                        n80Var = d0Var2.r;
                        if (n80Var == null && (z11 || n80Var.d())) {
                            rectF2.set(rectF);
                            rectF2.inset(org.telegram.messenger.g0.N(0.625f), org.telegram.messenger.g0.N(0.625f));
                            d0Var2.r.j(fArr);
                            d0Var2.r.e(rectF2);
                            int r12 = z12 ? org.telegram.ui.ActionBar.n6.r1(0.125f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ha, i6Var)) : org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.ed, i6Var);
                            d0Var2.r.g(org.telegram.ui.ActionBar.n6.r1(f15, r12), org.telegram.ui.ActionBar.n6.r1(2.5f, r12), org.telegram.ui.ActionBar.n6.r1(3.0f, r12), org.telegram.ui.ActionBar.n6.r1(10.0f, r12));
                            d0Var2.r.setAlpha(ks.e4);
                            d0Var2.r.draw(canvas);
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        yVar = d0Var2.s;
                        if (yVar == null) {
                            yVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            d0Var2.s.setAlpha(ks.e4);
                            d0Var2.s.draw(canvas);
                        }
                        canvas.restore();
                        canvas.save();
                        float L8 = (d0Var2.t == null || d0Var2.u != null) ? org.telegram.messenger.g0.L(26.0f) : 0;
                        float f24 = f12;
                        float A = com.google.android.gms.internal.vision.e2.A(rectF.width() - (d0Var2.h.k() + (d0Var2.t == null ? org.telegram.messenger.g0.L(4.0f) : 0)), L8, f24, rectF.left);
                        if (d0Var2.u == null) {
                            int centerY = (int) (rectF.centerY() - (org.telegram.messenger.g0.L(20.0f) / f24));
                            f10 = 3.0f;
                            int i20 = (int) A;
                            d0Var2.u.setBounds(i20, centerY, org.telegram.messenger.g0.L(20.0f) + i20, org.telegram.messenger.g0.L(20.0f) + centerY);
                            d0Var2.u.setAlpha(d0Var2.m ? 128 : ks.e4);
                            d0Var2.u.draw(canvas);
                            A += L8;
                        } else {
                            f10 = 3.0f;
                            if (d0Var2.t != null) {
                                f12 = 2.0f;
                                int centerY2 = (int) (rectF.centerY() - (org.telegram.messenger.g0.L(24.0f) / 2.0f));
                                int i21 = (int) A;
                                d0Var2.t.setBounds(i21, centerY2, org.telegram.messenger.g0.L(24.0f) + i21, org.telegram.messenger.g0.L(24.0f) + centerY2);
                                d0Var2.t.setAlpha(d0Var2.m ? 128 : ks.e4);
                                d0Var2.t.draw(canvas);
                                A += L8;
                                wy0 wy0Var = d0Var2.h;
                                float width = (rectF.width() - org.telegram.messenger.g0.L(15.0f)) - L8;
                                f11 = 1.0f;
                                wy0Var.p = Math.max(1.0f, width);
                                d0Var2.h.f(canvas, A, rectF.centerY(), d0Var2.m ? 0.5f : 1.0f);
                                canvas.restore();
                                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(d0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                                if (d0Var2.j != null) {
                                    if (d0Var2.m) {
                                        Drawable S0 = org.telegram.ui.ActionBar.n6.S0("drawableBotLock", i6Var);
                                        z.u(S0, (((int) rectF.right) - org.telegram.messenger.g0.L(f10)) - S0.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(f10));
                                        S0.draw(canvas);
                                    }
                                } else if (cg.c.b(d0Var2.i)) {
                                    Drawable S02 = org.telegram.ui.ActionBar.n6.S0("drawableBotWebView", i6Var);
                                    z.u(S02, (((int) rectF.right) - org.telegram.messenger.g0.L(f10)) - S02.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(f10));
                                    S02.draw(canvas);
                                } else if (tL_inlineButtonTypeUrl != null) {
                                    Drawable S03 = r90.q(tL_inlineButtonTypeUrl.url) ? org.telegram.ui.ActionBar.n6.S0("drawableBotWebView", i6Var) : d0Var2.l ? org.telegram.ui.ActionBar.n6.S0("drawable_botInvite", i6Var) : org.telegram.ui.ActionBar.n6.S0("drawableBotLink", i6Var);
                                    z.u(S03, (((int) rectF.right) - org.telegram.messenger.g0.L(f10)) - S03.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(f10));
                                    S03.draw(canvas);
                                } else if (cg.c.c(d0Var2.i, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || cg.c.c(d0Var2.i, TL_keyboard.TL_buttonTypeRequestPeer.class)) {
                                    Drawable S04 = org.telegram.ui.ActionBar.n6.S0("drawableBotInline", i6Var);
                                    z.u(S04, (((int) rectF.right) - org.telegram.messenger.g0.L(f10)) - S04.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(f10));
                                    S04.draw(canvas);
                                } else if (cg.c.c(d0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) && z16) {
                                    z.u(org.telegram.ui.ActionBar.n6.w4, (((int) rectF.right) - org.telegram.messenger.g0.L(5.0f)) - org.telegram.ui.ActionBar.n6.w4.getIntrinsicWidth(), rectF.top + org.telegram.messenger.g0.L(4.0f));
                                    org.telegram.ui.ActionBar.n6.w4.draw(canvas);
                                }
                                canvas.restore();
                                if (z13) {
                                    z14 = true;
                                }
                            }
                        }
                        f12 = 2.0f;
                        wy0 wy0Var2 = d0Var2.h;
                        float width2 = (rectF.width() - org.telegram.messenger.g0.L(15.0f)) - L8;
                        f11 = 1.0f;
                        wy0Var2.p = Math.max(1.0f, width2);
                        d0Var2.h.f(canvas, A, rectF.centerY(), d0Var2.m ? 0.5f : 1.0f);
                        canvas.restore();
                        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl2 = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(d0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                        if (d0Var2.j != null) {
                        }
                        canvas.restore();
                        if (z13) {
                        }
                    }
                }
                z10 = false;
                if (r1Var2.U1) {
                }
                boolean u222 = r1Var2.u2();
                i6Var = r1Var2.Qb;
                RectF rectF22 = d0Var2.p;
                Paint paint2 = d0Var2.o;
                z11 = P0;
                float[] fArr2 = d0Var2.q;
                boolean z162 = z15;
                path = d0Var2.n;
                r1Var = r1Var2;
                a10 = d0Var2.a();
                canvas.save();
                if (a10 == f15) {
                }
                Arrays.fill(fArr2, org.telegram.messenger.g0.L(Math.min(6.75f, bz.Y0)));
                if ((d0Var2.g & 9) == 9) {
                }
                if ((d0Var2.g & 10) == 10) {
                }
                path.rewind();
                path.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.drawPath(path, org.telegram.ui.ActionBar.n6.W0("paintChatActionBackground", i6Var));
                org.telegram.messenger.n2 n2Var2 = d0Var2.k;
                if (n2Var2 == null) {
                }
                if (a11 != 1) {
                }
                if (i6Var == null ? i6Var.h() : org.telegram.ui.ActionBar.n6.d1()) {
                    canvas.drawPath(path, org.telegram.ui.ActionBar.n6.h2);
                }
                canvas.save();
                canvas.clipPath(path);
                if (z11) {
                }
                n80Var = d0Var2.r;
                if (n80Var == null) {
                }
                z13 = false;
                yVar = d0Var2.s;
                if (yVar == null) {
                }
                canvas.restore();
                canvas.save();
                if (d0Var2.t == null) {
                }
                float L82 = (d0Var2.t == null || d0Var2.u != null) ? org.telegram.messenger.g0.L(26.0f) : 0;
                float f242 = f12;
                float A2 = com.google.android.gms.internal.vision.e2.A(rectF.width() - (d0Var2.h.k() + (d0Var2.t == null ? org.telegram.messenger.g0.L(4.0f) : 0)), L82, f242, rectF.left);
                if (d0Var2.u == null) {
                }
                f12 = 2.0f;
                wy0 wy0Var22 = d0Var2.h;
                float width22 = (rectF.width() - org.telegram.messenger.g0.L(15.0f)) - L82;
                f11 = 1.0f;
                wy0Var22.p = Math.max(1.0f, width22);
                d0Var2.h.f(canvas, A2, rectF.centerY(), d0Var2.m ? 0.5f : 1.0f);
                canvas.restore();
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl22 = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(d0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (d0Var2.j != null) {
                }
                canvas.restore();
                if (z13) {
                }
            }
            i15 = i10 + 1;
            f15 = f11;
            i13 = i11;
            r1Var2 = r1Var;
            widthForButtons = i12;
            arrayList2 = arrayList;
        }
        r1 r1Var3 = r1Var2;
        canvas.restore();
        if (z14) {
            r1Var3.q2();
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
    public final void c(fj fjVar, b3.j jVar, int i7, boolean z10) {
        HashMap hashMap;
        org.telegram.messenger.n2[][] n2VarArr;
        int i10;
        int i11;
        HashMap hashMap2;
        HashMap hashMap3;
        ArrayList arrayList;
        HashMap hashMap4;
        boolean z11;
        r1 r1Var;
        int i12;
        char c10;
        int i13;
        final r1 r1Var2;
        ArrayList arrayList2;
        int i14;
        long b10;
        d0 d0Var;
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
        wy0 wy0Var;
        String str;
        int i17 = jVar.b;
        org.telegram.messenger.n2[][] n2VarArr2 = (org.telegram.messenger.n2[][]) jVar.c;
        int length = n2VarArr2.length;
        int i18 = 0;
        for (int i19 = 0; i19 < length; i19++) {
            if (((1 << i19) & i17) != 0) {
                i18++;
            }
        }
        int L = (i18 * i7) + org.telegram.messenger.g0.L(1.0f) + (org.telegram.messenger.g0.L(48.0f) * length);
        r1 r1Var3 = this.a;
        r1Var3.x0 = L;
        ArrayList arrayList3 = r1Var3.I5;
        int i20 = r1Var3.a6;
        r1Var3.J6 = L;
        int L2 = r1Var3.b7 - org.telegram.messenger.g0.L(r1Var3.C6 ? 0.0f : 9.0f);
        r1Var3.K5 = L2;
        if (fjVar.x0 > L2) {
            int i21 = -org.telegram.messenger.g0.L((r1Var3.X6 ? 71 : z10 ? 52 : 0) + 10);
            r1Var3.K5 = Math.max(r1Var3.b7, Math.min(fjVar.x0, org.telegram.messenger.g0.Q1() ? org.telegram.messenger.g0.Q0() + i21 : c0.i(5.0f, Math.min(r1Var3.getParentWidth(), org.telegram.messenger.g0.q.y), i21)));
        }
        char c11 = 0;
        if (r1Var3.u2()) {
            r1Var3.K5 = org.telegram.messenger.g0.L(2.0f) + (r1Var3.C6 ? r1Var3.b7 - org.telegram.messenger.g0.L(8.0f) : r1Var3.getCompactContentWidth());
        }
        HashMap hashMap7 = this.b;
        HashMap hashMap8 = new HashMap(hashMap7);
        StringBuilder sb2 = fjVar.F0;
        HashMap hashMap9 = this.c;
        if (sb2 == null || (str = this.d) == null || !str.equals(sb2.toString())) {
            StringBuilder sb3 = fjVar.F0;
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
            int length2 = n2VarArr2[i22].length;
            if (length2 == 0) {
                n2VarArr = n2VarArr2;
                i10 = i17;
                i11 = length;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                r1Var = r1Var3;
                arrayList = arrayList3;
                c10 = c11;
                hashMap4 = hashMap;
                i13 = i24;
                z11 = true;
                i12 = i20;
            } else {
                int i25 = length2 - 1;
                int z12 = m10.z(2.0f, r1Var3.K5 - (org.telegram.messenger.g0.L(5.0f) * i25), length2);
                n2VarArr = n2VarArr2;
                i10 = i17;
                int i26 = i23;
                int i27 = 0;
                while (i27 < length2) {
                    org.telegram.messenger.n2 n2Var = n2VarArr[i22][i27];
                    int i28 = length;
                    int i29 = length2;
                    int i30 = i26;
                    d0 d0Var2 = new d0(new e1(r1Var3, 0));
                    d0Var2.k = n2Var;
                    if (n2Var instanceof org.telegram.messenger.o2) {
                        d0Var2.i = ((org.telegram.messenger.o2) n2Var).a;
                    } else if (n2Var instanceof org.telegram.messenger.p2) {
                        d0Var2.j = (org.telegram.messenger.p2) n2Var;
                        fj fjVar2 = r1Var3.Q5;
                        if (fjVar2 != null) {
                            r1 r1Var4 = r1Var3;
                            if (org.telegram.messenger.v3.z(i20, 24, fj.B0(fjVar2.k))) {
                                r1Var2 = r1Var4;
                                arrayList2 = arrayList3;
                                if (!org.telegram.messenger.v3.z(i20, 5, fj.B0(r1Var2.Q5.k)) && ((i14 = d0Var2.j.a) == 2 || i14 == 3)) {
                                    d0Var2.m = true;
                                }
                                b10 = n2Var.b();
                                int c12 = n2Var.c();
                                if (b10 != 0) {
                                    org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(0, i20, b10);
                                    d0Var2.u = o5Var;
                                    o5Var.b(new org.telegram.ui.Components.u5() { // from class: org.telegram.ui.Cells.f1
                                        @Override // org.telegram.ui.Components.u5
                                        public final void invalidate() {
                                            r1.this.q2();
                                        }
                                    });
                                    d0Var2.u.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                } else if (c12 != 0) {
                                    Drawable drawable = r1Var2.getResources().getDrawable(c12);
                                    d0Var2.t = drawable;
                                    drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                }
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = d0Var2.i;
                                String f10 = keyboardInlineButton != null ? Utilities.f(org.telegram.tgnet.tl.a.a(keyboardInlineButton)) : "";
                                String j3 = com.google.android.gms.internal.vision.e2.j(i22, "_", i27);
                                d0Var = hashMap != null ? (d0) hashMap.get(j3) : (d0) hashMap8.get(f10);
                                if (d0Var == null) {
                                    System.currentTimeMillis();
                                }
                                hashMap7.put(f10, d0Var2);
                                hashMap9.put(j3, d0Var2);
                                d0Var2.c = (i27 * (org.telegram.messenger.g0.L(5.0f) + z12)) / r1Var2.K5;
                                int i31 = i24;
                                d0Var2.d = org.telegram.messenger.f3.C(2.5f, org.telegram.messenger.g0.L(48.0f) * i22, i31);
                                d0Var2.e = z12 / r1Var2.K5;
                                d0Var2.f = org.telegram.messenger.g0.L(44.0f);
                                if (i27 == 0) {
                                    d0Var2.g |= 1;
                                }
                                if (i27 == i25) {
                                    d0Var2.g |= 2;
                                }
                                if (i22 == 0) {
                                    d0Var2.g |= 4;
                                }
                                if (i22 == i28 - 1) {
                                    d0Var2.g |= 8;
                                }
                                TextPaint textPaint = (TextPaint) r1Var2.a2("paintChatBotButton");
                                int i32 = z12;
                                if (cg.c.c(d0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) || (fj.n1(fjVar.k).flags & 4) == 0) {
                                    hashMap5 = hashMap9;
                                    charSequence = n2Var.d();
                                } else {
                                    hashMap5 = hashMap9;
                                    charSequence = gd.N0(2131747188, null);
                                }
                                HashMap hashMap10 = hashMap8;
                                if ((n2Var instanceof org.telegram.messenger.p2) || ((org.telegram.messenger.p2) n2Var).a != 4) {
                                    i15 = i20;
                                    hashMap6 = hashMap;
                                    charSequence2 = charSequence;
                                } else {
                                    SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) ">");
                                    i15 = i20;
                                    kq kqVar = new kq(R.drawable.msg_inputarrow, 0);
                                    kqVar.I = 0.8f;
                                    kqVar.J = 0.8f;
                                    kqVar.x = 0.6f;
                                    hashMap6 = hashMap;
                                    append.setSpan(kqVar, append.length() - 1, append.length(), 33);
                                    charSequence2 = append;
                                }
                                CharSequence charSequence4 = charSequence2;
                                if (cg.c.c(d0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                    charSequence4 = charSequence2;
                                    if (fj.n1(fjVar.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                        charSequence4 = pb.T0(charSequence2);
                                    }
                                }
                                if (cg.c.c(d0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                                    SpannableStringBuilder append2 = new SpannableStringBuilder("c ").append(charSequence4);
                                    r11 = 0;
                                    kq kqVar2 = new kq(R.drawable.menu_copy_s, 0);
                                    kqVar2.I = 0.9f;
                                    kqVar2.J = 0.9f;
                                    append2.setSpan(kqVar2, 0, 1, 33);
                                    charSequence3 = append2;
                                } else {
                                    r11 = 0;
                                    charSequence3 = charSequence4;
                                }
                                m10 = org.telegram.messenger.j6.m(charSequence3, textPaint.getFontMetricsInt(), r11, null, r11);
                                if (d0Var == null && (wy0Var = d0Var.h) != null && TextUtils.equals(wy0Var.j(), m10)) {
                                    d0Var2.h = d0Var.h;
                                } else {
                                    d0Var2.h = new wy0(m10, textPaint);
                                }
                                ArrayList arrayList4 = arrayList2;
                                arrayList4.add(d0Var2);
                                if (i27 == i25) {
                                    float f11 = d0Var2.c;
                                    float f12 = r1Var2.K5;
                                    i16 = Math.max(i30, ((int) (f11 * f12)) + ((int) (d0Var2.e * f12)));
                                } else {
                                    i16 = i30;
                                }
                                tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(d0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                                if (!fjVar.p3() && tL_inlineButtonTypeUrl != null) {
                                    try {
                                        Uri parse = Uri.parse(tL_inlineButtonTypeUrl.url);
                                        String lowerCase = parse.getHost().toLowerCase();
                                        d0Var2.l = (parse.getQueryParameter("startgroup") == null && ((("http".equals(parse.getScheme()) || "https".equals(parse.getScheme())) && ("t.me".equals(lowerCase) || "telegram.me".equals(lowerCase) || "telegram.dog".equals(lowerCase))) || ("tg".equals(parse.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r11;
                                    } catch (Exception unused) {
                                    }
                                }
                                i27++;
                                r1Var3 = r1Var2;
                                arrayList3 = arrayList4;
                                i26 = i16;
                                i20 = i15;
                                length = i28;
                                z12 = i32;
                                hashMap9 = hashMap5;
                                hashMap8 = hashMap10;
                                hashMap = hashMap6;
                                i24 = i31;
                                length2 = i29;
                            } else {
                                r1Var2 = r1Var4;
                                arrayList2 = arrayList3;
                                b10 = n2Var.b();
                                int c122 = n2Var.c();
                                if (b10 != 0) {
                                }
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = d0Var2.i;
                                if (keyboardInlineButton2 != null) {
                                }
                                String j32 = com.google.android.gms.internal.vision.e2.j(i22, "_", i27);
                                if (hashMap != null) {
                                }
                                if (d0Var == null) {
                                }
                                hashMap7.put(f10, d0Var2);
                                hashMap9.put(j32, d0Var2);
                                d0Var2.c = (i27 * (org.telegram.messenger.g0.L(5.0f) + z12)) / r1Var2.K5;
                                int i312 = i24;
                                d0Var2.d = org.telegram.messenger.f3.C(2.5f, org.telegram.messenger.g0.L(48.0f) * i22, i312);
                                d0Var2.e = z12 / r1Var2.K5;
                                d0Var2.f = org.telegram.messenger.g0.L(44.0f);
                                if (i27 == 0) {
                                }
                                if (i27 == i25) {
                                }
                                if (i22 == 0) {
                                }
                                if (i22 == i28 - 1) {
                                }
                                TextPaint textPaint2 = (TextPaint) r1Var2.a2("paintChatBotButton");
                                int i322 = z12;
                                if (cg.c.c(d0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                }
                                hashMap5 = hashMap9;
                                charSequence = n2Var.d();
                                HashMap hashMap102 = hashMap8;
                                if (n2Var instanceof org.telegram.messenger.p2) {
                                }
                                i15 = i20;
                                hashMap6 = hashMap;
                                charSequence2 = charSequence;
                                CharSequence charSequence42 = charSequence2;
                                if (cg.c.c(d0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                }
                                if (cg.c.c(d0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                                }
                                m10 = org.telegram.messenger.j6.m(charSequence3, textPaint2.getFontMetricsInt(), r11, null, r11);
                                if (d0Var == null) {
                                }
                                d0Var2.h = new wy0(m10, textPaint2);
                                ArrayList arrayList42 = arrayList2;
                                arrayList42.add(d0Var2);
                                if (i27 == i25) {
                                }
                                tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(d0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                                if (!fjVar.p3()) {
                                    Uri parse2 = Uri.parse(tL_inlineButtonTypeUrl.url);
                                    String lowerCase2 = parse2.getHost().toLowerCase();
                                    d0Var2.l = (parse2.getQueryParameter("startgroup") == null && ((("http".equals(parse2.getScheme()) || "https".equals(parse2.getScheme())) && ("t.me".equals(lowerCase2) || "telegram.me".equals(lowerCase2) || "telegram.dog".equals(lowerCase2))) || ("tg".equals(parse2.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r11;
                                }
                                i27++;
                                r1Var3 = r1Var2;
                                arrayList3 = arrayList42;
                                i26 = i16;
                                i20 = i15;
                                length = i28;
                                z12 = i322;
                                hashMap9 = hashMap5;
                                hashMap8 = hashMap102;
                                hashMap = hashMap6;
                                i24 = i312;
                                length2 = i29;
                            }
                        }
                    }
                    r1Var2 = r1Var3;
                    arrayList2 = arrayList3;
                    b10 = n2Var.b();
                    int c1222 = n2Var.c();
                    if (b10 != 0) {
                    }
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton22 = d0Var2.i;
                    if (keyboardInlineButton22 != null) {
                    }
                    String j322 = com.google.android.gms.internal.vision.e2.j(i22, "_", i27);
                    if (hashMap != null) {
                    }
                    if (d0Var == null) {
                    }
                    hashMap7.put(f10, d0Var2);
                    hashMap9.put(j322, d0Var2);
                    d0Var2.c = (i27 * (org.telegram.messenger.g0.L(5.0f) + z12)) / r1Var2.K5;
                    int i3122 = i24;
                    d0Var2.d = org.telegram.messenger.f3.C(2.5f, org.telegram.messenger.g0.L(48.0f) * i22, i3122);
                    d0Var2.e = z12 / r1Var2.K5;
                    d0Var2.f = org.telegram.messenger.g0.L(44.0f);
                    if (i27 == 0) {
                    }
                    if (i27 == i25) {
                    }
                    if (i22 == 0) {
                    }
                    if (i22 == i28 - 1) {
                    }
                    TextPaint textPaint22 = (TextPaint) r1Var2.a2("paintChatBotButton");
                    int i3222 = z12;
                    if (cg.c.c(d0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    hashMap5 = hashMap9;
                    charSequence = n2Var.d();
                    HashMap hashMap1022 = hashMap8;
                    if (n2Var instanceof org.telegram.messenger.p2) {
                    }
                    i15 = i20;
                    hashMap6 = hashMap;
                    charSequence2 = charSequence;
                    CharSequence charSequence422 = charSequence2;
                    if (cg.c.c(d0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    if (cg.c.c(d0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    }
                    m10 = org.telegram.messenger.j6.m(charSequence3, textPaint22.getFontMetricsInt(), r11, null, r11);
                    if (d0Var == null) {
                    }
                    d0Var2.h = new wy0(m10, textPaint22);
                    ArrayList arrayList422 = arrayList2;
                    arrayList422.add(d0Var2);
                    if (i27 == i25) {
                    }
                    tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) cg.c.a(d0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                    if (!fjVar.p3()) {
                    }
                    i27++;
                    r1Var3 = r1Var2;
                    arrayList3 = arrayList422;
                    i26 = i16;
                    i20 = i15;
                    length = i28;
                    z12 = i3222;
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
                r1Var = r1Var3;
                i12 = i20;
                if ((i10 & (1 << i22)) != 0) {
                    d0 d0Var3 = new d0(new e1(r1Var, 1));
                    d0Var3.b = true;
                    d0Var3.d = org.telegram.messenger.g0.L(49.0f) + org.telegram.messenger.f3.C(2.5f, org.telegram.messenger.g0.L(48.0f) * i22, i33);
                    c10 = 0;
                    d0Var3.f = org.telegram.messenger.g0.L(2.0f);
                    d0Var3.e = (r1Var.K5 - org.telegram.messenger.g0.L(2.0f)) / r1Var.K5;
                    arrayList.add(d0Var3);
                    i13 = i33 + i7;
                    i23 = i34;
                } else {
                    c10 = 0;
                    i23 = i34;
                    i13 = i33;
                }
            }
            i22++;
            r1Var3 = r1Var;
            arrayList3 = arrayList;
            i20 = i12;
            c11 = c10;
            i17 = i10;
            length = i11;
            hashMap9 = hashMap2;
            hashMap8 = hashMap3;
            hashMap = hashMap4;
            i24 = i13;
            n2VarArr2 = n2VarArr;
        }
        r1 r1Var5 = r1Var3;
        if (r1Var5.u2()) {
            return;
        }
        r1Var5.K5 = i23;
    }
}
