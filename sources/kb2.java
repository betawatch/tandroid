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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class kb2 {
    public final wb2 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public String d;

    public kb2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        int i;
        int L;
        wb2 wb2Var = this.a;
        ArrayList arrayList = wb2Var.I5;
        if (!arrayList.isEmpty()) {
            int x = (int) motionEvent.getX();
            int P1 = (int) wb2Var.P1(motionEvent);
            if (motionEvent.getAction() == 0) {
                int widthForButtons = wb2Var.getWidthForButtons();
                if (wb2Var.Q5.O3()) {
                    L = (wb2Var.getMeasuredWidth() - widthForButtons) - hl.L(10.0f);
                } else if (wb2Var.v2()) {
                    L = wb2Var.getCompactLeft();
                } else {
                    L = wb2Var.N6 + hl.L(wb2Var.C6 ? 1.0f : 7.0f);
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    wo0 wo0Var = (wo0) arrayList.get(i2);
                    int L2 = (wo0Var.d + wb2Var.e7) - hl.L(2.0f);
                    float f = x;
                    float f2 = widthForButtons;
                    float f3 = (wo0Var.c * f2) + L;
                    if (f >= f3 && f <= (wo0Var.e * f2) + f3 && P1 >= L2 && P1 <= wo0Var.f + L2) {
                        wb2Var.N5 = i2;
                        wb2Var.r2();
                        if (wo0Var.s == null) {
                            hf0 Y = aob.Y(aob.v0(aob.ed, wb2Var.cc), 6, 6);
                            wo0Var.s = Y;
                            Y.setCallback(wb2Var);
                            hf0 hf0Var = wo0Var.s;
                            int i3 = ((int) (wo0Var.c * f2)) + L;
                            hf0Var.setBounds(i3, L2, ((int) (wo0Var.e * f2)) + i3, wo0Var.f + L2);
                        }
                        wo0Var.s.setHotspot(f, P1);
                        wo0Var.s.setState(wb2Var.N2);
                        wo0Var.b(!wo0Var.m);
                        wb2Var.postDelayed(new zd(this, wb2Var.N5, (byte) 27), ViewConfiguration.getLongPressTimeout() - 1);
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (wb2Var.N5 != -1) {
                    wb2Var.playSoundEffect(0);
                    wo0 wo0Var2 = (wo0) arrayList.get(wb2Var.N5);
                    hf0 hf0Var2 = wo0Var2.s;
                    if (hf0Var2 != null) {
                        hf0Var2.setState(StateSet.NOTHING);
                    }
                    wo0Var2.b(false);
                    if (wb2Var.Q5.r1) {
                        Toast.makeText(wb2Var.getContext(), ob6.M0(2131748284, null), 1).show();
                    } else {
                        rb2 rb2Var = wb2Var.eb;
                        if (rb2Var != null && !wo0Var2.m) {
                            iq0 iq0Var = wo0Var2.j;
                            if (iq0Var != null) {
                                rb2Var.y1(wb2Var, iq0Var);
                            } else {
                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = wo0Var2.i;
                                if (keyboardInlineButton != null) {
                                    rb2Var.I0(wb2Var, keyboardInlineButton);
                                }
                            }
                        }
                    }
                    wb2Var.N5 = -1;
                    wb2Var.r2();
                    return false;
                }
            } else if (motionEvent.getAction() == 3 && (i = wb2Var.N5) != -1) {
                wo0 wo0Var3 = (wo0) arrayList.get(i);
                hf0 hf0Var3 = wo0Var3.s;
                if (hf0Var3 != null) {
                    hf0Var3.setState(StateSet.NOTHING);
                }
                wo0Var3.b(false);
                wb2Var.N5 = -1;
                wb2Var.r2();
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
        dc2 dc2Var;
        boolean z;
        vnb vnbVar;
        boolean z2;
        Path path;
        wb2 wb2Var;
        float a;
        boolean z3;
        int i4;
        int a2;
        va6 va6Var;
        boolean z4;
        hf0 hf0Var;
        float f;
        ArrayList arrayList2 = arrayList;
        wb2 wb2Var2 = this.a;
        int i5 = wb2Var2.a6;
        dc2 dc2Var2 = wb2Var2.ub;
        RectF rectF = wb2Var2.c4;
        if (wma.f0) {
            return;
        }
        int widthForButtons = wb2Var2.getWidthForButtons();
        r47 r47Var = wb2Var2.Q5;
        if (r47Var != null && r47Var.O3()) {
            L = (wb2Var2.getMeasuredWidth() - widthForButtons) - hl.L(10.0f);
        } else if (wb2Var2.v2()) {
            L = wb2Var2.getCompactLeft();
        } else {
            L = wb2Var2.N6 + hl.L((wb2Var2.C6 || wb2Var2.K) ? 1.0f : 7.0f);
        }
        if (dc2Var2.x0) {
            L = (int) (L + dc2Var2.h0);
        }
        float L2 = (wb2Var2.e7 - hl.L(2.0f)) + dc2Var2.j0;
        float f2 = 2.0f;
        float f3 = 0.0f;
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            wo0 wo0Var = (wo0) arrayList2.get(i6);
            float f4 = wo0Var.d + wo0Var.f;
            if (f4 > f3) {
                f3 = f4;
            }
        }
        rectF.set(0.0f, L2, wb2Var2.getMeasuredWidth(), L2 + f3);
        if (i != 255) {
            canvas.saveLayerAlpha(rectF, i, 31);
        } else {
            canvas.save();
        }
        int i7 = 0;
        boolean z5 = false;
        while (i7 < arrayList2.size()) {
            wo0 wo0Var2 = (wo0) arrayList2.get(i7);
            float L3 = ((wo0Var2.d + wb2Var2.e7) - hl.L(f2)) + dc2Var2.j0;
            wo0Var2.a();
            if (wo0Var2.b) {
                float f5 = widthForButtons;
                float f6 = (wo0Var2.c * f5) + L;
                float f7 = ((wo0Var2.e * f5) + f6) - f6;
                float L4 = hl.L(3.66f);
                float f8 = f7 - L4;
                int round = Math.round(f8 / hl.L(8.66f));
                i2 = i7;
                float f9 = f8 / round;
                wb2Var2.C();
                float L5 = hl.L(1.0f);
                int i8 = 0;
                while (true) {
                    i3 = i5;
                    if (i8 >= round + 1) {
                        break;
                    }
                    float f10 = (i8 * f9) + f6;
                    int i9 = i8;
                    dc2 dc2Var3 = dc2Var2;
                    rectF.set(f10, L3, f10 + L4, wo0Var2.f + L3);
                    canvas.drawRoundRect(rectF, L5, L5, wb2Var2.c2("paintChatActionBackground"));
                    if (wb2Var2.i2()) {
                        canvas.drawRoundRect(rectF, L5, L5, aob.h2);
                    }
                    i8 = i9 + 1;
                    i5 = i3;
                    dc2Var2 = dc2Var3;
                }
                dc2Var = dc2Var2;
                wb2Var = wb2Var2;
                i4 = widthForButtons;
            } else {
                i2 = i7;
                i3 = i5;
                dc2Var = dc2Var2;
                float f11 = widthForButtons;
                float f12 = (wo0Var2.c * f11) + L;
                rectF.set(f12, L3, (wo0Var2.e * f11) + f12, wo0Var2.f + L3);
                wb2Var2.C();
                boolean P0 = wb2Var2.P0(wo0Var2.i);
                iq0 iq0Var = wo0Var2.j;
                if (iq0Var != null && wb2Var2.Q5 != null) {
                    byte b = iq0Var.a;
                    if (b == 2) {
                        P0 |= uc7.s1(i3).H2(wb2Var2.Q5.e1(), r47.B0(wb2Var2.Q5.k), true);
                    } else if (b == 1) {
                        z = false;
                        P0 |= uc7.s1(i3).H2(wb2Var2.Q5.e1(), r47.B0(wb2Var2.Q5.k), false);
                        boolean z6 = (wb2Var2.U1 || !wb2Var2.V1) ? z : true;
                        boolean v2 = wb2Var2.v2();
                        vnbVar = wb2Var2.cc;
                        RectF rectF2 = wo0Var2.p;
                        Paint paint = wo0Var2.o;
                        float[] fArr = wo0Var2.q;
                        z2 = P0;
                        path = wo0Var2.n;
                        wb2Var = wb2Var2;
                        a = wo0Var2.a();
                        canvas.save();
                        if (a == 1.0f) {
                            z3 = z6;
                            i4 = widthForButtons;
                            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
                        } else {
                            z3 = z6;
                            i4 = widthForButtons;
                        }
                        Arrays.fill(fArr, hl.L(Math.min(6.75f, xea.U0)));
                        if ((wo0Var2.g & 9) == 9) {
                            float L6 = hl.L(xea.U0);
                            fArr[7] = L6;
                            fArr[6] = L6;
                        }
                        if ((wo0Var2.g & 10) == 10) {
                            float L7 = hl.L(xea.U0);
                            fArr[5] = L7;
                            fArr[4] = L7;
                        }
                        path.rewind();
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas.drawPath(path, aob.U0("paintChatActionBackground", vnbVar));
                        gq0 gq0Var = wo0Var2.k;
                        a2 = gq0Var == null ? gq0Var.a() : 1;
                        if (a2 != 1) {
                            int F = ik8.F(a2);
                            if (F == 1) {
                                paint.setColor(aob.p1(0.7f, aob.v0(aob.Ul, vnbVar)));
                            } else if (F == 2) {
                                paint.setColor(aob.p1(0.7f, aob.v0(aob.Wl, vnbVar)));
                            } else if (F == 3) {
                                paint.setColor(aob.p1(0.7f, aob.v0(aob.Vl, vnbVar)));
                            }
                            canvas.drawPath(path, paint);
                        }
                        if ((vnbVar == null ? vnbVar.g() : aob.b1()) && (a2 == 1 || (vnbVar != null && vnbVar.a()))) {
                            canvas.drawPath(path, aob.h2);
                        }
                        canvas.save();
                        canvas.clipPath(path);
                        va6 va6Var2 = wo0Var2.r;
                        if (z2) {
                            if (va6Var2 != null && !va6Var2.d() && !wo0Var2.r.c()) {
                                wo0Var2.r.a();
                            }
                        } else if (va6Var2 == null) {
                            va6 va6Var3 = new va6();
                            wo0Var2.r = va6Var3;
                            va6Var3.j(5.5f);
                            va6 va6Var4 = wo0Var2.r;
                            va6Var4.D = true;
                            va6Var4.x.setStrokeWidth(hl.N(1.25f));
                        } else if (va6Var2.c() || wo0Var2.r.d()) {
                            va6 va6Var5 = wo0Var2.r;
                            va6Var5.b = -1L;
                            va6Var5.c = -1L;
                        }
                        va6Var = wo0Var2.r;
                        if (va6Var == null && (z2 || va6Var.d())) {
                            rectF2.set(rectF);
                            rectF2.inset(hl.N(0.625f), hl.N(0.625f));
                            wo0Var2.r.i(fArr);
                            wo0Var2.r.e(rectF2);
                            int p1 = v2 ? aob.p1(0.125f, aob.v0(aob.Ha, vnbVar)) : aob.v0(aob.ed, vnbVar);
                            wo0Var2.r.g(aob.p1(1.0f, p1), aob.p1(2.5f, p1), aob.p1(3.0f, p1), aob.p1(10.0f, p1));
                            wo0Var2.r.setAlpha(jn7.d4);
                            wo0Var2.r.draw(canvas);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        hf0Var = wo0Var2.s;
                        if (hf0Var != null) {
                            hf0Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            wo0Var2.s.setAlpha(jn7.d4);
                            wo0Var2.s.draw(canvas);
                        }
                        canvas.restore();
                        canvas.save();
                        float L8 = (wo0Var2.t == null || wo0Var2.u != null) ? hl.L(26.0f) : 0;
                        float f13 = f2;
                        float z7 = bp1.z(rectF.width() - (wo0Var2.h.j() + (wo0Var2.t == null ? hl.L(4.0f) : 0)), L8, f13, rectF.left);
                        if (wo0Var2.u == null) {
                            f = 3.0f;
                            int centerY = (int) (rectF.centerY() - (hl.L(20.0f) / f13));
                            int i10 = (int) z7;
                            wo0Var2.u.setBounds(i10, centerY, hl.L(20.0f) + i10, hl.L(20.0f) + centerY);
                            wo0Var2.u.setAlpha(wo0Var2.m ? 128 : jn7.d4);
                            wo0Var2.u.draw(canvas);
                        } else {
                            f = 3.0f;
                            if (wo0Var2.t != null) {
                                int centerY2 = (int) (rectF.centerY() - (hl.L(24.0f) / 2.0f));
                                int i11 = (int) z7;
                                wo0Var2.t.setBounds(i11, centerY2, hl.L(24.0f) + i11, hl.L(24.0f) + centerY2);
                                wo0Var2.t.setAlpha(wo0Var2.m ? 128 : jn7.d4);
                                wo0Var2.t.draw(canvas);
                            }
                            wo0Var2.h.p = Math.max(1.0f, (rectF.width() - hl.L(15.0f)) - L8);
                            wo0Var2.h.f(canvas, z7, rectF.centerY(), wo0Var2.m ? 0.5f : 1.0f);
                            canvas.restore();
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ehb.a(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                            if (wo0Var2.j != null) {
                                if (wo0Var2.m) {
                                    Drawable Q0 = aob.Q0("drawableBotLock", vnbVar);
                                    jf0.w(Q0, (((int) rectF.right) - hl.L(f)) - Q0.getIntrinsicWidth(), rectF.top + hl.L(f));
                                    Q0.draw(canvas);
                                }
                            } else if (ehb.b(wo0Var2.i)) {
                                Drawable Q02 = aob.Q0("drawableBotWebView", vnbVar);
                                jf0.w(Q02, (((int) rectF.right) - hl.L(f)) - Q02.getIntrinsicWidth(), rectF.top + hl.L(f));
                                Q02.draw(canvas);
                            } else if (tL_inlineButtonTypeUrl != null) {
                                Drawable Q03 = e66.q(tL_inlineButtonTypeUrl.url) ? aob.Q0("drawableBotWebView", vnbVar) : wo0Var2.l ? aob.Q0("drawable_botInvite", vnbVar) : aob.Q0("drawableBotLink", vnbVar);
                                jf0.w(Q03, (((int) rectF.right) - hl.L(f)) - Q03.getIntrinsicWidth(), rectF.top + hl.L(f));
                                Q03.draw(canvas);
                            } else if (ehb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ehb.c(wo0Var2.i, TL_keyboard.TL_buttonTypeRequestPeer.class)) {
                                Drawable Q04 = aob.Q0("drawableBotInline", vnbVar);
                                jf0.w(Q04, (((int) rectF.right) - hl.L(f)) - Q04.getIntrinsicWidth(), rectF.top + hl.L(f));
                                Q04.draw(canvas);
                            } else if (ehb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) && z3) {
                                jf0.w(aob.w4, (((int) rectF.right) - hl.L(5.0f)) - aob.w4.getIntrinsicWidth(), rectF.top + hl.L(4.0f));
                                aob.w4.draw(canvas);
                            }
                            canvas.restore();
                            if (z4) {
                                z5 = true;
                            }
                        }
                        z7 += L8;
                        wo0Var2.h.p = Math.max(1.0f, (rectF.width() - hl.L(15.0f)) - L8);
                        wo0Var2.h.f(canvas, z7, rectF.centerY(), wo0Var2.m ? 0.5f : 1.0f);
                        canvas.restore();
                        TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl2 = (TL_keyboard.TL_inlineButtonTypeUrl) ehb.a(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                        if (wo0Var2.j != null) {
                        }
                        canvas.restore();
                        if (z4) {
                        }
                    }
                }
                z = false;
                if (wb2Var2.U1) {
                }
                boolean v22 = wb2Var2.v2();
                vnbVar = wb2Var2.cc;
                RectF rectF22 = wo0Var2.p;
                Paint paint2 = wo0Var2.o;
                float[] fArr2 = wo0Var2.q;
                z2 = P0;
                path = wo0Var2.n;
                wb2Var = wb2Var2;
                a = wo0Var2.a();
                canvas.save();
                if (a == 1.0f) {
                }
                Arrays.fill(fArr2, hl.L(Math.min(6.75f, xea.U0)));
                if ((wo0Var2.g & 9) == 9) {
                }
                if ((wo0Var2.g & 10) == 10) {
                }
                path.rewind();
                path.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.drawPath(path, aob.U0("paintChatActionBackground", vnbVar));
                gq0 gq0Var2 = wo0Var2.k;
                if (gq0Var2 == null) {
                }
                if (a2 != 1) {
                }
                if (vnbVar == null ? vnbVar.g() : aob.b1()) {
                    canvas.drawPath(path, aob.h2);
                }
                canvas.save();
                canvas.clipPath(path);
                va6 va6Var22 = wo0Var2.r;
                if (z2) {
                }
                va6Var = wo0Var2.r;
                if (va6Var == null) {
                }
                z4 = false;
                hf0Var = wo0Var2.s;
                if (hf0Var != null) {
                }
                canvas.restore();
                canvas.save();
                float L82 = (wo0Var2.t == null || wo0Var2.u != null) ? hl.L(26.0f) : 0;
                float f132 = f2;
                float z72 = bp1.z(rectF.width() - (wo0Var2.h.j() + (wo0Var2.t == null ? hl.L(4.0f) : 0)), L82, f132, rectF.left);
                if (wo0Var2.u == null) {
                }
                z72 += L82;
                wo0Var2.h.p = Math.max(1.0f, (rectF.width() - hl.L(15.0f)) - L82);
                wo0Var2.h.f(canvas, z72, rectF.centerY(), wo0Var2.m ? 0.5f : 1.0f);
                canvas.restore();
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl22 = (TL_keyboard.TL_inlineButtonTypeUrl) ehb.a(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (wo0Var2.j != null) {
                }
                canvas.restore();
                if (z4) {
                }
            }
            i7 = i2 + 1;
            arrayList2 = arrayList;
            i5 = i3;
            dc2Var2 = dc2Var;
            wb2Var2 = wb2Var;
            widthForButtons = i4;
            f2 = 2.0f;
        }
        wb2 wb2Var3 = wb2Var2;
        canvas.restore();
        if (z5) {
            wb2Var3.r2();
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
    public final void c(r47 r47Var, ed edVar, int i, boolean z) {
        HashMap hashMap;
        gq0[][] gq0VarArr;
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
        wo0 wo0Var;
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
        pkb pkbVar;
        String str;
        int i9 = edVar.b;
        wb2 wb2Var = this.a;
        ArrayList arrayList2 = wb2Var.I5;
        int i10 = wb2Var.a6;
        gq0[][] gq0VarArr2 = (gq0[][]) edVar.c;
        int length = gq0VarArr2.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (((1 << i12) & i9) != 0) {
                i11++;
            }
        }
        int L = (i11 * i) + hl.L(1.0f) + (hl.L(48.0f) * length);
        wb2Var.x0 = L;
        wb2Var.J6 = L;
        int L2 = wb2Var.b7 - hl.L(wb2Var.C6 ? 0.0f : 9.0f);
        wb2Var.K5 = L2;
        if (r47Var.x0 > L2) {
            int i13 = -hl.L((wb2Var.X6 ? 71 : z ? 52 : 0) + 10);
            wb2Var.K5 = Math.max(wb2Var.b7, Math.min(r47Var.x0, hl.O1() ? hl.P0() + i13 : c00.A(5.0f, Math.min(wb2Var.getParentWidth(), hl.q.y), i13)));
        }
        if (wb2Var.v2()) {
            wb2Var.K5 = hl.L(2.0f) + (wb2Var.C6 ? wb2Var.b7 - hl.L(8.0f) : wb2Var.getCompactContentWidth());
        }
        HashMap hashMap7 = this.b;
        HashMap hashMap8 = new HashMap(hashMap7);
        StringBuilder sb = r47Var.F0;
        HashMap hashMap9 = this.c;
        if (sb == null || (str = this.d) == null || !str.equals(sb.toString())) {
            StringBuilder sb2 = r47Var.F0;
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
            int length2 = gq0VarArr2[i14].length;
            if (length2 == 0) {
                gq0VarArr = gq0VarArr2;
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
                gq0VarArr = gq0VarArr2;
                int D = ik8.D(2.0f, wb2Var.K5 - (hl.L(5.0f) * i17), length2);
                i2 = i9;
                int i18 = 0;
                while (i18 < length2) {
                    gq0 gq0Var = gq0VarArr[i14][i18];
                    int i19 = length;
                    int i20 = length2;
                    int i21 = i15;
                    wo0 wo0Var2 = new wo0(new ib2(wb2Var, (byte) 0));
                    wo0Var2.k = gq0Var;
                    if (gq0Var instanceof hq0) {
                        wo0Var2.i = ((hq0) gq0Var).a;
                    } else if (gq0Var instanceof iq0) {
                        wo0Var2.j = (iq0) gq0Var;
                        r47 r47Var2 = wb2Var.Q5;
                        if (r47Var2 != null) {
                            i6 = i17;
                            if (xc2.z(i10, 24, r47.B0(r47Var2.k)) && !xc2.z(i10, 5, r47.B0(wb2Var.Q5.k)) && ((b = wo0Var2.j.a) == 2 || b == 3)) {
                                wo0Var2.m = true;
                            }
                            b2 = gq0Var.b();
                            int c = gq0Var.c();
                            ArrayList arrayList3 = arrayList2;
                            if (b2 == 0) {
                                wl wlVar = new wl(0, i10, b2);
                                wo0Var2.u = wlVar;
                                wlVar.a(new jb2(wb2Var, (byte) 0));
                                wo0Var2.u.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            } else if (c != 0) {
                                Drawable drawable = wb2Var.getResources().getDrawable(c);
                                wo0Var2.t = drawable;
                                drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                            }
                            TL_keyboard.KeyboardInlineButton keyboardInlineButton = wo0Var2.i;
                            String f = keyboardInlineButton == null ? Utilities.f(uh9.a(keyboardInlineButton)) : "";
                            String m2 = qd4.m(i14, i18, "_");
                            wo0Var = hashMap == null ? (wo0) hashMap.get(m2) : (wo0) hashMap8.get(f);
                            if (wo0Var == null) {
                                System.currentTimeMillis();
                            }
                            hashMap7.put(f, wo0Var2);
                            hashMap9.put(m2, wo0Var2);
                            wo0Var2.c = (i18 * (hl.L(5.0f) + D)) / wb2Var.K5;
                            int i22 = i16;
                            wo0Var2.d = uh9.w(2.5f, hl.L(48.0f) * i14, i22);
                            wo0Var2.e = D / wb2Var.K5;
                            wo0Var2.f = hl.L(44.0f);
                            if (i18 == 0) {
                                wo0Var2.g |= 1;
                            }
                            i7 = i6;
                            if (i18 == i7) {
                                wo0Var2.g |= 2;
                            }
                            if (i14 == 0) {
                                wo0Var2.g |= 4;
                            }
                            if (i14 == i19 - 1) {
                                wo0Var2.g |= 8;
                            }
                            TextPaint textPaint = (TextPaint) wb2Var.c2("paintChatBotButton");
                            HashMap hashMap10 = hashMap;
                            int i23 = i10;
                            if (ehb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class) || (r47.n1(r47Var.k).flags & 4) == 0) {
                                i8 = D;
                                charSequence = gq0Var.d();
                            } else {
                                i8 = D;
                                charSequence = ob6.M0(2131747109, null);
                            }
                            if ((gq0Var instanceof iq0) || ((iq0) gq0Var).a != 4) {
                                hashMap5 = hashMap9;
                                hashMap6 = hashMap8;
                                charSequence2 = charSequence;
                            } else {
                                SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) ">");
                                hashMap5 = hashMap9;
                                wm2 wm2Var = new wm2(R.drawable.msg_inputarrow, 0);
                                wm2Var.I = 0.8f;
                                wm2Var.J = 0.8f;
                                wm2Var.x = 0.6f;
                                hashMap6 = hashMap8;
                                append.setSpan(wm2Var, append.length() - 1, append.length(), 33);
                                charSequence2 = append;
                            }
                            CharSequence charSequence4 = charSequence2;
                            if (ehb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                                charSequence4 = charSequence2;
                                if (r47.n1(r47Var.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                    charSequence4 = nza.T0(charSequence2);
                                }
                            }
                            if (ehb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                                r9 = 0;
                                charSequence3 = charSequence4;
                            } else {
                                SpannableStringBuilder append2 = new SpannableStringBuilder("c ").append(charSequence4);
                                r9 = 0;
                                wm2 wm2Var2 = new wm2(R.drawable.menu_copy_s, 0);
                                wm2Var2.I = 0.9f;
                                wm2Var2.J = 0.9f;
                                append2.setSpan(wm2Var2, 0, 1, 33);
                                charSequence3 = append2;
                            }
                            m = pv3.m(charSequence3, textPaint.getFontMetricsInt(), r9, null, r9);
                            if (wo0Var == null && (pkbVar = wo0Var.h) != null && TextUtils.equals(pkbVar.i(), m)) {
                                wo0Var2.h = wo0Var.h;
                            } else {
                                wo0Var2.h = new pkb(m, textPaint);
                            }
                            arrayList3.add(wo0Var2);
                            if (i18 != i7) {
                                float f2 = wo0Var2.c;
                                float f3 = wb2Var.K5;
                                i15 = Math.max(i21, ((int) (f2 * f3)) + ((int) (wo0Var2.e * f3)));
                            } else {
                                i15 = i21;
                            }
                            tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ehb.a(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                            if (r47Var.p3() && tL_inlineButtonTypeUrl != null) {
                                try {
                                    Uri parse = Uri.parse(tL_inlineButtonTypeUrl.url);
                                    String lowerCase = parse.getHost().toLowerCase();
                                    wo0Var2.l = (parse.getQueryParameter("startgroup") == null && ((("http".equals(parse.getScheme()) || "https".equals(parse.getScheme())) && ("t.me".equals(lowerCase) || "telegram.me".equals(lowerCase) || "telegram.dog".equals(lowerCase))) || ("tg".equals(parse.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r9;
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
                    b2 = gq0Var.b();
                    int c2 = gq0Var.c();
                    ArrayList arrayList32 = arrayList2;
                    if (b2 == 0) {
                    }
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = wo0Var2.i;
                    if (keyboardInlineButton2 == null) {
                    }
                    String m22 = qd4.m(i14, i18, "_");
                    if (hashMap == null) {
                    }
                    if (wo0Var == null) {
                    }
                    hashMap7.put(f, wo0Var2);
                    hashMap9.put(m22, wo0Var2);
                    wo0Var2.c = (i18 * (hl.L(5.0f) + D)) / wb2Var.K5;
                    int i222 = i16;
                    wo0Var2.d = uh9.w(2.5f, hl.L(48.0f) * i14, i222);
                    wo0Var2.e = D / wb2Var.K5;
                    wo0Var2.f = hl.L(44.0f);
                    if (i18 == 0) {
                    }
                    i7 = i6;
                    if (i18 == i7) {
                    }
                    if (i14 == 0) {
                    }
                    if (i14 == i19 - 1) {
                    }
                    TextPaint textPaint2 = (TextPaint) wb2Var.c2("paintChatBotButton");
                    HashMap hashMap102 = hashMap;
                    int i232 = i10;
                    if (ehb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    i8 = D;
                    charSequence = gq0Var.d();
                    if (gq0Var instanceof iq0) {
                    }
                    hashMap5 = hashMap9;
                    hashMap6 = hashMap8;
                    charSequence2 = charSequence;
                    CharSequence charSequence42 = charSequence2;
                    if (ehb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeBuy.class)) {
                    }
                    if (ehb.c(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    }
                    m = pv3.m(charSequence3, textPaint2.getFontMetricsInt(), r9, null, r9);
                    if (wo0Var == null) {
                    }
                    wo0Var2.h = new pkb(m, textPaint2);
                    arrayList32.add(wo0Var2);
                    if (i18 != i7) {
                    }
                    tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ehb.a(wo0Var2.i, TL_keyboard.TL_inlineButtonTypeUrl.class);
                    if (r47Var.p3()) {
                        Uri parse2 = Uri.parse(tL_inlineButtonTypeUrl.url);
                        String lowerCase2 = parse2.getHost().toLowerCase();
                        wo0Var2.l = (parse2.getQueryParameter("startgroup") == null && ((("http".equals(parse2.getScheme()) || "https".equals(parse2.getScheme())) && ("t.me".equals(lowerCase2) || "telegram.me".equals(lowerCase2) || "telegram.dog".equals(lowerCase2))) || ("tg".equals(parse2.getScheme()) && (tL_inlineButtonTypeUrl.url.startsWith("tg:resolve") || tL_inlineButtonTypeUrl.url.startsWith("tg://resolve"))))) ? true : r9;
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
                    wo0 wo0Var3 = new wo0(new ib2(wb2Var, (byte) 1));
                    wo0Var3.b = true;
                    wo0Var3.d = hl.L(49.0f) + uh9.w(2.5f, hl.L(48.0f) * i14, i5);
                    wo0Var3.f = hl.L(2.0f);
                    wo0Var3.e = (wb2Var.K5 - hl.L(2.0f)) / wb2Var.K5;
                    arrayList.add(wo0Var3);
                    i5 += i;
                }
            }
            i14++;
            arrayList2 = arrayList;
            hashMap = hashMap4;
            gq0VarArr2 = gq0VarArr;
            i9 = i2;
            length = i4;
            hashMap9 = hashMap2;
            hashMap8 = hashMap3;
            i16 = i5;
            i10 = i3;
        }
        if (wb2Var.v2()) {
            return;
        }
        wb2Var.K5 = i15;
    }
}
