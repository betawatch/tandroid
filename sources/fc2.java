// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fc2 {
    public final rc2 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public String d;

    public fc2(rc2 rc2Var) {
        this.a = rc2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i;
        int L;
        rc2 rc2Var = this.a;
        ArrayList arrayList = rc2Var.I5;
        if (!arrayList.isEmpty()) {
            int x = (int) motionEvent.getX();
            int P1 = (int) rc2Var.P1(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = rc2Var.getWidthForButtons();
                if (rc2Var.Q5.O3()) {
                    L = (rc2Var.getMeasuredWidth() - widthForButtons) - gm.L(10.0f);
                } else if (rc2Var.v2()) {
                    L = rc2Var.getCompactLeft();
                } else {
                    L = rc2Var.N6 + gm.L(rc2Var.C6 ? 1.0f : 7.0f);
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    wp0 wp0Var = (wp0) arrayList.get(i2);
                    int L2 = (wp0Var.d + rc2Var.e7) - gm.L(2.0f);
                    float f = x;
                    float f2 = widthForButtons;
                    float f3 = (wp0Var.c * f2) + L;
                    if (f >= f3 && f <= (wp0Var.e * f2) + f3 && P1 >= L2 && P1 <= wp0Var.f + L2) {
                        rc2Var.N5 = i2;
                        rc2Var.r2();
                        if (wp0Var.s == null) {
                            fg0 Y = cmb.Y(cmb.v0(cmb.dd, rc2Var.cc), 6, 6);
                            wp0Var.s = Y;
                            Y.setCallback(rc2Var);
                            fg0 fg0Var = wp0Var.s;
                            int i3 = ((int) (wp0Var.c * f2)) + L;
                            fg0Var.setBounds(i3, L2, ((int) (wp0Var.e * f2)) + i3, wp0Var.f + L2);
                        }
                        wp0Var.s.setHotspot(f, P1);
                        wp0Var.s.setState(rc2Var.N2);
                        wp0Var.b(!wp0Var.m);
                        rc2Var.postDelayed(new eh(this, rc2Var.N5, (byte) 27), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (rc2Var.N5 != -1) {
                    rc2Var.playSoundEffect(0);
                    wp0 wp0Var2 = (wp0) arrayList.get(rc2Var.N5);
                    fg0 fg0Var2 = wp0Var2.s;
                    if (fg0Var2 != null) {
                        fg0Var2.setState(StateSet.NOTHING);
                    }
                    wp0Var2.b(false);
                    if (rc2Var.Q5.r1) {
                        Toast.makeText(rc2Var.getContext(), jb6.M0(2131748287, null), 1).show();
                    } else {
                        mc2 mc2Var = rc2Var.eb;
                        if (mc2Var != null && !wp0Var2.m) {
                            ir0 ir0Var = wp0Var2.j;
                            if (ir0Var != null) {
                                mc2Var.B1(rc2Var, ir0Var);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = wp0Var2.i;
                                if (keyboardInlineButton != null) {
                                    mc2Var.L0(rc2Var, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    rc2Var.N5 = -1;
                    rc2Var.r2();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i = rc2Var.N5) != -1) {
                wp0 wp0Var3 = (wp0) arrayList.get(i);
                fg0 fg0Var3 = wp0Var3.s;
                if (fg0Var3 != null) {
                    fg0Var3.setState(StateSet.NOTHING);
                }
                wp0Var3.b(false);
                rc2Var.N5 = -1;
                rc2Var.r2();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0541 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Canvas canvas, ArrayList arrayList, int i) {
        int L;
        int i2;
        int i3;
        yc2 yc2Var;
        boolean z;
        ylb ylbVar;
        boolean z2;
        Path path;
        rc2 rc2Var;
        float a;
        boolean z3;
        int i4;
        int a2;
        qa6 qa6Var;
        boolean z4;
        fg0 fg0Var;
        float f;
        ArrayList arrayList2 = arrayList;
        rc2 rc2Var2 = this.a;
        int i5 = rc2Var2.a6;
        yc2 yc2Var2 = rc2Var2.ub;
        RectF rectF = rc2Var2.c4;
        if (ela.l0) {
            return;
        }
        int widthForButtons = rc2Var2.getWidthForButtons();
        k47 k47Var = rc2Var2.Q5;
        if (k47Var != null && k47Var.O3()) {
            L = (rc2Var2.getMeasuredWidth() - widthForButtons) - gm.L(10.0f);
        } else if (rc2Var2.v2()) {
            L = rc2Var2.getCompactLeft();
        } else {
            L = rc2Var2.N6 + gm.L((rc2Var2.C6 || rc2Var2.K) ? 1.0f : 7.0f);
        }
        if (yc2Var2.x0) {
            L = (int) (L + yc2Var2.h0);
        }
        float L2 = (rc2Var2.e7 - gm.L(2.0f)) + yc2Var2.j0;
        float f2 = 2.0f;
        float f3 = 0.0f;
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            wp0 wp0Var = (wp0) arrayList2.get(i6);
            float f4 = wp0Var.d + wp0Var.f;
            if (f4 > f3) {
                f3 = f4;
            }
        }
        rectF.set(0.0f, L2, rc2Var2.getMeasuredWidth(), L2 + f3);
        if (i != 255) {
            canvas.saveLayerAlpha(rectF, i, 31);
        } else {
            canvas.save();
        }
        int i7 = 0;
        boolean z5 = false;
        while (i7 < arrayList2.size()) {
            wp0 wp0Var2 = (wp0) arrayList2.get(i7);
            float L3 = ((wp0Var2.d + rc2Var2.e7) - gm.L(f2)) + yc2Var2.j0;
            wp0Var2.a();
            if (wp0Var2.b) {
                float f5 = widthForButtons;
                float f6 = (wp0Var2.c * f5) + L;
                float f7 = ((wp0Var2.e * f5) + f6) - f6;
                float L4 = gm.L(3.66f);
                float f8 = f7 - L4;
                int round = Math.round(f8 / gm.L(8.66f));
                i2 = i7;
                float f9 = f8 / round;
                rc2Var2.x();
                float L5 = gm.L(1.0f);
                int i8 = 0;
                while (true) {
                    i3 = i5;
                    if (i8 >= round + 1) {
                        break;
                    }
                    float f10 = (i8 * f9) + f6;
                    int i9 = i8;
                    yc2 yc2Var3 = yc2Var2;
                    rectF.set(f10, L3, f10 + L4, wp0Var2.f + L3);
                    canvas.drawRoundRect(rectF, L5, L5, rc2Var2.c2("paintChatActionBackground"));
                    if (rc2Var2.i2()) {
                        canvas.drawRoundRect(rectF, L5, L5, cmb.g2);
                    }
                    i8 = i9 + 1;
                    i5 = i3;
                    yc2Var2 = yc2Var3;
                }
                yc2Var = yc2Var2;
                rc2Var = rc2Var2;
                i4 = widthForButtons;
            } else {
                i2 = i7;
                i3 = i5;
                yc2Var = yc2Var2;
                float f11 = widthForButtons;
                float f12 = (wp0Var2.c * f11) + L;
                rectF.set(f12, L3, (wp0Var2.e * f11) + f12, wp0Var2.f + L3);
                rc2Var2.x();
                boolean P0 = rc2Var2.P0(wp0Var2.i);
                ir0 ir0Var = wp0Var2.j;
                if (ir0Var != null && rc2Var2.Q5 != null) {
                    byte b = ir0Var.a;
                    if (b == 2) {
                        P0 |= oc7.r1(i3).E2(rc2Var2.Q5.e1(), k47.B0(rc2Var2.Q5.k), true);
                    } else if (b == 1) {
                        z = false;
                        P0 |= oc7.r1(i3).E2(rc2Var2.Q5.e1(), k47.B0(rc2Var2.Q5.k), false);
                        boolean z6 = (rc2Var2.U1 || !rc2Var2.V1) ? z : true;
                        boolean v2 = rc2Var2.v2();
                        ylbVar = rc2Var2.cc;
                        RectF rectF2 = wp0Var2.p;
                        Paint paint = wp0Var2.o;
                        float[] fArr = wp0Var2.q;
                        z2 = P0;
                        path = wp0Var2.n;
                        rc2Var = rc2Var2;
                        a = wp0Var2.a();
                        canvas.save();
                        if (a == 1.0f) {
                            z3 = z6;
                            i4 = widthForButtons;
                            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
                        } else {
                            z3 = z6;
                            i4 = widthForButtons;
                        }
                        Arrays.fill(fArr, gm.L(Math.min(6.75f, gda.U0)));
                        if ((wp0Var2.g & 9) == 9) {
                            float L6 = gm.L(gda.U0);
                            fArr[7] = L6;
                            fArr[6] = L6;
                        }
                        if ((wp0Var2.g & 10) == 10) {
                            float L7 = gm.L(gda.U0);
                            fArr[5] = L7;
                            fArr[4] = L7;
                        }
                        path.rewind();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas.drawPath(path, cmb.U0("paintChatActionBackground", ylbVar));
                        gr0 gr0Var = wp0Var2.k;
                        a2 = gr0Var == null ? gr0Var.a() : 1;
                        if (a2 != 1) {
                            int F = wi8.F(a2);
                            if (F == 1) {
                                paint.setColor(cmb.p1(0.7f, cmb.v0(cmb.Tl, ylbVar)));
                            } else if (F == 2) {
                                paint.setColor(cmb.p1(0.7f, cmb.v0(cmb.Vl, ylbVar)));
                            } else if (F == 3) {
                                paint.setColor(cmb.p1(0.7f, cmb.v0(cmb.Ul, ylbVar)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if ((ylbVar == null ? ylbVar.g() : cmb.b1()) && (a2 == 1 || (ylbVar != null && ylbVar.a()))) {
                            canvas.drawPath(path, cmb.g2);
                        }
                        canvas.save();
                        canvas.clipPath(path);
                        qa6 qa6Var2 = wp0Var2.r;
                        if (z2) {
                            if (qa6Var2 != null && !qa6Var2.d() && !wp0Var2.r.c()) {
                                wp0Var2.r.a();
                            }
                        } else if (qa6Var2 == null) {
                            qa6 qa6Var3 = new qa6();
                            wp0Var2.r = qa6Var3;
                            qa6Var3.j(5.5f);
                            qa6 qa6Var4 = wp0Var2.r;
                            qa6Var4.D = true;
                            qa6Var4.x.setStrokeWidth(gm.N(1.25f));
                        } else if (qa6Var2.c() || wp0Var2.r.d()) {
                            qa6 qa6Var5 = wp0Var2.r;
                            qa6Var5.b = -1L;
                            qa6Var5.c = -1L;
                        }
                        qa6Var = wp0Var2.r;
                        if (qa6Var == null && (z2 || qa6Var.d())) {
                            rectF2.set(rectF);
                            rectF2.inset(gm.N(0.625f), gm.N(0.625f));
                            wp0Var2.r.i(fArr);
                            wp0Var2.r.e(rectF2);
                            int p1 = v2 ? cmb.p1(0.125f, cmb.v0(cmb.Ga, ylbVar)) : cmb.v0(cmb.dd, ylbVar);
                            wp0Var2.r.g(cmb.p1(1.0f, p1), cmb.p1(2.5f, p1), cmb.p1(3.0f, p1), cmb.p1(10.0f, p1));
                            wp0Var2.r.setAlpha(nm7.d4);
                            wp0Var2.r.draw(canvas);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        fg0Var = wp0Var2.s;
                        if (fg0Var != null) {
                            fg0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            wp0Var2.s.setAlpha(nm7.d4);
                            wp0Var2.s.draw(canvas);
                        }
                        canvas.restore();
                        canvas.save();
                        float L8 = (wp0Var2.t == null || wp0Var2.u != null) ? gm.L(26.0f) : 0;
                        float f13 = f2;
                        float z7 = aq1.z(rectF.width() - (wp0Var2.h.j() + (wp0Var2.t == null ? gm.L(4.0f) : 0)), L8, f13, rectF.left);
                        if (wp0Var2.u == null) {
                            f = 3.0f;
                            int centerY = (int) (rectF.centerY() - (gm.L(20.0f) / f13));
                            int i10 = (int) z7;
                            wp0Var2.u.setBounds(i10, centerY, gm.L(20.0f) + i10, gm.L(20.0f) + centerY);
                            wp0Var2.u.setAlpha(wp0Var2.m ? 128 : nm7.d4);
                            wp0Var2.u.draw(canvas);
                        } else {
                            f = 3.0f;
                            if (wp0Var2.t != null) {
                                int centerY2 = (int) (rectF.centerY() - (gm.L(24.0f) / 2.0f));
                                int i11 = (int) z7;
                                wp0Var2.t.setBounds(i11, centerY2, gm.L(24.0f) + i11, gm.L(24.0f) + centerY2);
                                wp0Var2.t.setAlpha(wp0Var2.m ? 128 : nm7.d4);
                                wp0Var2.t.draw(canvas);
                            }
                            wp0Var2.h.p = Math.max(1.0f, (rectF.width() - gm.L(15.0f)) - L8);
                            wp0Var2.h.f(canvas, z7, rectF.centerY(), wp0Var2.m ? 0.5f : 1.0f);
                            canvas.restore();
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kfb.a(wp0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                            if (wp0Var2.j != null) {
                                if (wp0Var2.m) {
                                    Drawable Q0 = cmb.Q0("drawableBotLock", ylbVar);
                                    hg0.t(Q0, (((int) rectF.right) - gm.L(f)) - Q0.getIntrinsicWidth(), rectF.top + gm.L(f));
                                    Q0.draw(canvas);
                                }
                            } else if (kfb.b(wp0Var2.i)) {
                                Drawable Q02 = cmb.Q0("drawableBotWebView", ylbVar);
                                hg0.t(Q02, (((int) rectF.right) - gm.L(f)) - Q02.getIntrinsicWidth(), rectF.top + gm.L(f));
                                Q02.draw(canvas);
                            } else if (tL_inlineButtonTypeUrl != null) {
                                Drawable Q03 = a66.q(tL_inlineButtonTypeUrl.url) ? cmb.Q0("drawableBotWebView", ylbVar) : wp0Var2.l ? cmb.Q0("drawable_botInvite", ylbVar) : cmb.Q0("drawableBotLink", ylbVar);
                                hg0.t(Q03, (((int) rectF.right) - gm.L(f)) - Q03.getIntrinsicWidth(), rectF.top + gm.L(f));
                                Q03.draw(canvas);
                            } else if (kfb.c(wp0Var2.i, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || kfb.c(wp0Var2.i, TL_keyboard.TL_buttonTypeRequestPeer.class)) {
                                Drawable Q04 = cmb.Q0("drawableBotInline", ylbVar);
                                hg0.t(Q04, (((int) rectF.right) - gm.L(f)) - Q04.getIntrinsicWidth(), rectF.top + gm.L(f));
                                Q04.draw(canvas);
                            } else if (kfb.c(wp0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) && z3) {
                                hg0.t(cmb.v4, (((int) rectF.right) - gm.L(5.0f)) - cmb.v4.getIntrinsicWidth(), rectF.top + gm.L(4.0f));
                                cmb.v4.draw(canvas);
                            }
                            canvas.restore();
                            if (z4) {
                                z5 = true;
                            }
                        }
                        z7 += L8;
                        wp0Var2.h.p = Math.max(1.0f, (rectF.width() - gm.L(15.0f)) - L8);
                        wp0Var2.h.f(canvas, z7, rectF.centerY(), wp0Var2.m ? 0.5f : 1.0f);
                        canvas.restore();
                        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl2 = (TL_keyboard.TL_inlineButtonTypeUrl) kfb.a(wp0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                        if (wp0Var2.j != null) {
                        }
                        canvas.restore();
                        if (z4) {
                        }
                    }
                }
                z = false;
                if (rc2Var2.U1) {
                }
                boolean v22 = rc2Var2.v2();
                ylbVar = rc2Var2.cc;
                RectF rectF22 = wp0Var2.p;
                Paint paint2 = wp0Var2.o;
                float[] fArr2 = wp0Var2.q;
                z2 = P0;
                path = wp0Var2.n;
                rc2Var = rc2Var2;
                a = wp0Var2.a();
                canvas.save();
                if (a == 1.0f) {
                }
                Arrays.fill(fArr2, gm.L(Math.min(6.75f, gda.U0)));
                if ((wp0Var2.g & 9) == 9) {
                }
                if ((wp0Var2.g & 10) == 10) {
                }
                path.rewind();
                path.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.drawPath(path, cmb.U0("paintChatActionBackground", ylbVar));
                gr0 gr0Var2 = wp0Var2.k;
                if (gr0Var2 == null) {
                }
                if (a2 != 1) {
                }
                if (ylbVar == null ? ylbVar.g() : cmb.b1()) {
                    canvas.drawPath(path, cmb.g2);
                }
                canvas.save();
                canvas.clipPath(path);
                qa6 qa6Var22 = wp0Var2.r;
                if (z2) {
                }
                qa6Var = wp0Var2.r;
                if (qa6Var == null) {
                }
                z4 = false;
                fg0Var = wp0Var2.s;
                if (fg0Var != null) {
                }
                canvas.restore();
                canvas.save();
                float L82 = (wp0Var2.t == null || wp0Var2.u != null) ? gm.L(26.0f) : 0;
                float f132 = f2;
                float z72 = aq1.z(rectF.width() - (wp0Var2.h.j() + (wp0Var2.t == null ? gm.L(4.0f) : 0)), L82, f132, rectF.left);
                if (wp0Var2.u == null) {
                }
                z72 += L82;
                wp0Var2.h.p = Math.max(1.0f, (rectF.width() - gm.L(15.0f)) - L82);
                wp0Var2.h.f(canvas, z72, rectF.centerY(), wp0Var2.m ? 0.5f : 1.0f);
                canvas.restore();
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl22 = (TL_keyboard.TL_inlineButtonTypeUrl) kfb.a(wp0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (wp0Var2.j != null) {
                }
                canvas.restore();
                if (z4) {
                }
            }
            i7 = i2 + 1;
            arrayList2 = arrayList;
            i5 = i3;
            yc2Var2 = yc2Var;
            rc2Var2 = rc2Var;
            widthForButtons = i4;
            f2 = 2.0f;
        }
        rc2 rc2Var3 = rc2Var2;
        canvas.restore();
        if (z5) {
            rc2Var3.r2();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02dc  */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(k47 k47Var, de deVar, int i, boolean z) {
        HashMap hashMap;
        gr0[][] gr0VarArr;
        int i2;
        int i3;
        int i4;
        HashMap hashMap2;
        HashMap hashMap3;
        int i5;
        HashMap hashMap4;
        ArrayList arrayList;
        int i6;
        byte b;
        long b2;
        wp0 wp0Var;
        int i7;
        int i8;
        CharSequence charSequence;
        HashMap hashMap5;
        HashMap hashMap6;
        CharSequence charSequence2;
        ?? r9;
        CharSequence charSequence3;
        CharSequence m;
        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl;
        uib uibVar;
        String str;
        int i9 = deVar.b;
        rc2 rc2Var = this.a;
        ArrayList arrayList2 = rc2Var.I5;
        int i10 = rc2Var.a6;
        gr0[][] gr0VarArr2 = (gr0[][]) deVar.c;
        int length = gr0VarArr2.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (((1 << i12) & i9) != 0) {
                i11++;
            }
        }
        int L = (i11 * i) + gm.L(1.0f) + (gm.L(48.0f) * length);
        rc2Var.x0 = L;
        rc2Var.J6 = L;
        int L2 = rc2Var.b7 - gm.L(rc2Var.C6 ? 0.0f : 9.0f);
        rc2Var.K5 = L2;
        if (k47Var.x0 > L2) {
            int i13 = -gm.L((rc2Var.X6 ? 71 : z ? 52 : 0) + 10);
            rc2Var.K5 = Math.max(rc2Var.b7, Math.min(k47Var.x0, gm.O1() ? gm.P0() + i13 : b10.z(5.0f, Math.min(rc2Var.getParentWidth(), gm.q.y), i13)));
        }
        if (rc2Var.v2()) {
            rc2Var.K5 = gm.L(2.0f) + (rc2Var.C6 ? rc2Var.b7 - gm.L(8.0f) : rc2Var.getCompactContentWidth());
        }
        HashMap hashMap7 = this.b;
        HashMap hashMap8 = new HashMap(hashMap7);
        StringBuilder sb = k47Var.F0;
        HashMap hashMap9 = this.c;
        if (sb == null || (str = this.d) == null || !str.equals(sb.toString())) {
            StringBuilder sb2 = k47Var.F0;
            if (sb2 != null) {
                this.d = sb2.toString();
            }
            hashMap = null;
        } else {
            hashMap = new HashMap(hashMap9);
        }
        hashMap7.clear();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < length) {
            int length2 = gr0VarArr2[i14].length;
            if (length2 == 0) {
                gr0VarArr = gr0VarArr2;
                i2 = i9;
                i3 = i10;
                i4 = length;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                i5 = i16;
                hashMap4 = hashMap;
                arrayList = arrayList2;
            } else {
                int i17 = length2 - 1;
                gr0VarArr = gr0VarArr2;
                int D = wi8.D(2.0f, rc2Var.K5 - (gm.L(5.0f) * i17), length2);
                i2 = i9;
                int i18 = 0;
                while (i18 < length2) {
                    gr0 gr0Var = gr0VarArr[i14][i18];
                    int i19 = length;
                    int i20 = length2;
                    int i21 = i15;
                    wp0 wp0Var2 = new wp0(new dc2(rc2Var, (byte) 0));
                    wp0Var2.k = gr0Var;
                    if (gr0Var instanceof hr0) {
                        wp0Var2.i = ((hr0) gr0Var).a;
                    } else if (gr0Var instanceof ir0) {
                        wp0Var2.j = (ir0) gr0Var;
                        k47 k47Var2 = rc2Var.Q5;
                        if (k47Var2 != null) {
                            i6 = i17;
                            if (sd2.z(i10, 24, k47.B0(k47Var2.k)) && !sd2.z(i10, 5, k47.B0(rc2Var.Q5.k)) && ((b = wp0Var2.j.a) == 2 || b == 3)) {
                                wp0Var2.m = true;
                            }
                            b2 = gr0Var.b();
                            int c = gr0Var.c();
                            ArrayList arrayList3 = arrayList2;
                            if (b2 == 0) {
                                vm vmVar = new vm(0, i10, b2);
                                wp0Var2.u = vmVar;
                                vmVar.a(new ec2(rc2Var, (byte) 0));
                                wp0Var2.u.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            } else if (c != 0) {
                                Drawable drawable = rc2Var.getResources().getDrawable(c);
                                wp0Var2.t = drawable;
                                drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            }
                            TL_keyboard.KeyboardInlineButton keyboardInlineButton = wp0Var2.i;
                            String f = keyboardInlineButton == null ? Utilities.f(hg9.a(keyboardInlineButton)) : "";
                            String n = td4.n(i14, i18, "_");
                            wp0Var = hashMap == null ? (wp0) hashMap.get(n) : (wp0) hashMap8.get(f);
                            if (wp0Var == null) {
                                System.currentTimeMillis();
                            }
                            hashMap7.put(f, wp0Var2);
                            hashMap9.put(n, wp0Var2);
                            wp0Var2.c = (i18 * (gm.L(5.0f) + D)) / rc2Var.K5;
                            int i22 = i16;
                            wp0Var2.d = hg9.v(2.5f, gm.L(48.0f) * i14, i22);
                            wp0Var2.e = D / rc2Var.K5;
                            wp0Var2.f = gm.L(44.0f);
                            if (i18 == 0) {
                                wp0Var2.g |= 1;
                            }
                            i7 = i6;
                            if (i18 == i7) {
                                wp0Var2.g |= 2;
                            }
                            if (i14 == 0) {
                                wp0Var2.g |= 4;
                            }
                            if (i14 == i19 - 1) {
                                wp0Var2.g |= 8;
                            }
                            TextPaint textPaint = (TextPaint) rc2Var.c2("paintChatBotButton");
                            HashMap hashMap10 = hashMap;
                            int i23 = i10;
                            if (kfb.c(wp0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) || (k47.n1(k47Var.k).flags & 4) == 0) {
                                i8 = D;
                                charSequence = gr0Var.d();
                            } else {
                                i8 = D;
                                charSequence = jb6.M0(2131747115, null);
                            }
                            if ((gr0Var instanceof ir0) || ((ir0) gr0Var).a != 4) {
                                hashMap5 = hashMap9;
                                hashMap6 = hashMap8;
                                charSequence2 = charSequence;
                            } else {
                                SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) ">");
                                hashMap5 = hashMap9;
                                pn2 pn2Var = new pn2(R.drawable.msg_inputarrow, 0);
                                pn2Var.I = 0.8f;
                                pn2Var.J = 0.8f;
                                pn2Var.x = 0.6f;
                                hashMap6 = hashMap8;
                                append.setSpan(pn2Var, append.length() - 1, append.length(), 33);
                                charSequence2 = append;
                            }
                            CharSequence charSequence4 = charSequence2;
                            if (kfb.c(wp0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                charSequence4 = charSequence2;
                                if (k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                    charSequence4 = nxa.T0(charSequence2);
                                }
                            }
                            if (kfb.c(wp0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                                r9 = 0;
                                charSequence3 = charSequence4;
                            } else {
                                SpannableStringBuilder append2 = new SpannableStringBuilder("c ").append(charSequence4);
                                r9 = 0;
                                pn2 pn2Var2 = new pn2(R.drawable.menu_copy_s, 0);
                                pn2Var2.I = 0.9f;
                                pn2Var2.J = 0.9f;
                                append2.setSpan(pn2Var2, 0, 1, 33);
                                charSequence3 = append2;
                            }
                            m = gw3.m(charSequence3, textPaint.getFontMetricsInt(), r9, null, r9);
                            if (wp0Var == null && (uibVar = wp0Var.h) != null && TextUtils.equals(uibVar.i(), m)) {
                                wp0Var2.h = wp0Var.h;
                            } else {
                                wp0Var2.h = new uib(m, textPaint);
                            }
                            arrayList3.add(wp0Var2);
                            if (i18 != i7) {
                                float f2 = wp0Var2.c;
                                float f3 = rc2Var.K5;
                                i15 = Math.max(i21, ((int) (f2 * f3)) + ((int) (wp0Var2.e * f3)));
                            } else {
                                i15 = i21;
                            }
                            tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kfb.a(wp0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                            if (k47Var.p3() && tL_inlineButtonTypeUrl != null) {
                                try {
                                    Uri parse = Uri.parse(tL_inlineButtonTypeUrl.url);
                                    String lowerCase = parse.getHost().toLowerCase();
                                    wp0Var2.l = (parse.getQueryParameter("startgroup") == null && ((("http".equals(parse.getScheme()) || "https".equals(parse.getScheme())) && ("t.me".equals(lowerCase) || "telegram.me".equals(lowerCase) || "telegram.dog".equals(lowerCase))) || ("tg".equals(parse.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r9;
                                } catch (Exception unused) {
                                }
                            }
                            i18++;
                            i17 = i7;
                            length = i19;
                            i10 = i23;
                            D = i8;
                            hashMap9 = hashMap5;
                            hashMap8 = hashMap6;
                            arrayList2 = arrayList3;
                            hashMap = hashMap10;
                            i16 = i22;
                            length2 = i20;
                        }
                    }
                    i6 = i17;
                    b2 = gr0Var.b();
                    int c2 = gr0Var.c();
                    ArrayList arrayList32 = arrayList2;
                    if (b2 == 0) {
                    }
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = wp0Var2.i;
                    if (keyboardInlineButton2 == null) {
                    }
                    String n2 = td4.n(i14, i18, "_");
                    if (hashMap == null) {
                    }
                    if (wp0Var == null) {
                    }
                    hashMap7.put(f, wp0Var2);
                    hashMap9.put(n2, wp0Var2);
                    wp0Var2.c = (i18 * (gm.L(5.0f) + D)) / rc2Var.K5;
                    int i222 = i16;
                    wp0Var2.d = hg9.v(2.5f, gm.L(48.0f) * i14, i222);
                    wp0Var2.e = D / rc2Var.K5;
                    wp0Var2.f = gm.L(44.0f);
                    if (i18 == 0) {
                    }
                    i7 = i6;
                    if (i18 == i7) {
                    }
                    if (i14 == 0) {
                    }
                    if (i14 == i19 - 1) {
                    }
                    TextPaint textPaint2 = (TextPaint) rc2Var.c2("paintChatBotButton");
                    HashMap hashMap102 = hashMap;
                    int i232 = i10;
                    if (kfb.c(wp0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    i8 = D;
                    charSequence = gr0Var.d();
                    if (gr0Var instanceof ir0) {
                    }
                    hashMap5 = hashMap9;
                    hashMap6 = hashMap8;
                    charSequence2 = charSequence;
                    CharSequence charSequence42 = charSequence2;
                    if (kfb.c(wp0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    if (kfb.c(wp0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    }
                    m = gw3.m(charSequence3, textPaint2.getFontMetricsInt(), r9, null, r9);
                    if (wp0Var == null) {
                    }
                    wp0Var2.h = new uib(m, textPaint2);
                    arrayList32.add(wp0Var2);
                    if (i18 != i7) {
                    }
                    tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kfb.a(wp0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                    if (k47Var.p3()) {
                        Uri parse2 = Uri.parse(tL_inlineButtonTypeUrl.url);
                        String lowerCase2 = parse2.getHost().toLowerCase();
                        wp0Var2.l = (parse2.getQueryParameter("startgroup") == null && ((("http".equals(parse2.getScheme()) || "https".equals(parse2.getScheme())) && ("t.me".equals(lowerCase2) || "telegram.me".equals(lowerCase2) || "telegram.dog".equals(lowerCase2))) || ("tg".equals(parse2.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r9;
                    }
                    i18++;
                    i17 = i7;
                    length = i19;
                    i10 = i232;
                    D = i8;
                    hashMap9 = hashMap5;
                    hashMap8 = hashMap6;
                    arrayList2 = arrayList32;
                    hashMap = hashMap102;
                    i16 = i222;
                    length2 = i20;
                }
                i3 = i10;
                i4 = length;
                hashMap2 = hashMap9;
                hashMap3 = hashMap8;
                i5 = i16;
                hashMap4 = hashMap;
                arrayList = arrayList2;
                if ((i2 & (1 << i14)) != 0) {
                    wp0 wp0Var3 = new wp0(new dc2(rc2Var, (byte) 1));
                    wp0Var3.b = true;
                    wp0Var3.d = gm.L(49.0f) + hg9.v(2.5f, gm.L(48.0f) * i14, i5);
                    wp0Var3.f = gm.L(2.0f);
                    wp0Var3.e = (rc2Var.K5 - gm.L(2.0f)) / rc2Var.K5;
                    arrayList.add(wp0Var3);
                    i5 += i;
                }
            }
            i14++;
            arrayList2 = arrayList;
            hashMap = hashMap4;
            gr0VarArr2 = gr0VarArr;
            i9 = i2;
            length = i4;
            hashMap9 = hashMap2;
            hashMap8 = hashMap3;
            i16 = i5;
            i10 = i3;
        }
        if (rc2Var.v2()) {
            return;
        }
        rc2Var.K5 = i15;
    }
}
