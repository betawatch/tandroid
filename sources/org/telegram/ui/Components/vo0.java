package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vo0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((wo0) obj).b.b1(1);
                break;
            case 1:
                tp0 tp0Var = (tp0) obj;
                rp0[] rp0VarArr = tp0Var.a;
                if (tp0Var.b != 1) {
                    for (rp0 rp0Var : rp0VarArr) {
                        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) rp0Var.f;
                        u5Var.setAlpha(1.0f);
                        u5Var.setScaleX(1.0f);
                        u5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.u5) rp0Var.h).setAlpha(0.0f);
                    }
                    tp0Var.E = false;
                    org.telegram.messenger.i0.h3(tp0Var.G, 4000L);
                    break;
                } else {
                    tp0Var.E = !tp0Var.E;
                    int length = rp0VarArr.length;
                    while (i11 < length) {
                        rp0 rp0Var2 = rp0VarArr[i11];
                        org.telegram.ui.ActionBar.u5 u5Var2 = (org.telegram.ui.ActionBar.u5) rp0Var2.f;
                        org.telegram.ui.ActionBar.u5 u5Var3 = (org.telegram.ui.ActionBar.u5) rp0Var2.h;
                        u5Var2.setPivotX(0.0f);
                        u5Var3.setPivotX(0.0f);
                        if (tp0Var.E) {
                            u5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            u5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            u5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            u5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                        i11++;
                    }
                    org.telegram.messenger.i0.h3(tp0Var.G, 4000L);
                    break;
                }
            case 2:
                ((rp0) obj).setVisibility(8);
                break;
            case 3:
                au0 au0Var = ((vq0) obj).G;
                if (au0Var.E1) {
                    au0Var.m1(false);
                    break;
                }
                break;
            case 4:
                ((es0) obj).a.x1(false);
                break;
            case 5:
                org.telegram.ui.ActionBar.k2 k2Var = ((ks0) obj).f.x1;
                if (k2Var != null) {
                    k2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 6:
                ((vo0) obj).run();
                break;
            case 7:
                jt0 jt0Var = (jt0) obj;
                ArrayList arrayList3 = jt0Var.f;
                if (jt0Var.h) {
                    jt0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    while (i11 < arrayList3.size()) {
                        if (((org.telegram.messenger.gw) arrayList3.get(i11)).b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.gw) arrayList3.get(i11)).a));
                        }
                        i11++;
                    }
                    org.telegram.messenger.hw F1 = jt0Var.y.x1.getMessagesController().F1();
                    ArrayList d = org.telegram.messenger.hw.d(F1.j);
                    int i12 = F1.a;
                    if (arrayList4.size() <= (org.telegram.messenger.e20.i(i12).q() ? org.telegram.messenger.wp.r1(i12).o6 : org.telegram.messenger.wp.r1(i12).n6) && !org.telegram.messenger.hw.k(d, arrayList4)) {
                        F1.p(arrayList4);
                        break;
                    }
                }
                break;
            case 8:
                ((mt0) obj).F();
                break;
            case 9:
                ((vu0) obj).V();
                break;
            case 10:
                ((ev0) obj).getClass();
                break;
            case 11:
                ((cw0) obj).l0(0);
                break;
            case 12:
                xv0 xv0Var = (xv0) obj;
                if (!xv0Var.x) {
                    xv0Var.D = 0.0f;
                    break;
                }
                break;
            case 13:
                ((kx0) obj).b();
                break;
            case 14:
                tx0 tx0Var = (tx0) obj;
                int i13 = tx0Var.a;
                tx0Var.H = null;
                rx0 rx0Var = tx0Var.c;
                if (rx0Var != null && rx0Var.getEditField() != null && tx0Var.c.getFieldText() != null) {
                    int selectionStart = tx0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = tx0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        tx0Var.s = false;
                        jg.l0 l0Var = tx0Var.d;
                        if (l0Var != null) {
                            l0Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = tx0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        org.telegram.messenger.h6[] h6VarArr = z10 ? (org.telegram.messenger.h6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.h6.class) : null;
                        if (h6VarArr == null || h6VarArr.length <= 0 || !org.telegram.messenger.uz.F || !org.telegram.messenger.e20.i(i13).q()) {
                            o5[] o5VarArr = z10 ? (o5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, o5.class) : null;
                            if ((o5VarArr == null || o5VarArr.length == 0) && selectionEnd < 52) {
                                tx0Var.s = true;
                                tx0Var.c();
                                tx0Var.V = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = tx0Var.J;
                                    if (str == null || tx0Var.I != 1 || !str.equals(substring) || tx0Var.y || (arrayList = tx0Var.x) == null || arrayList.isEmpty()) {
                                        int i14 = tx0Var.K + 1;
                                        tx0Var.K = i14;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (tx0Var.L == null || Math.abs(currentTimeMillis - tx0Var.N) > 360) {
                                            tx0Var.N = currentTimeMillis;
                                            G0 = org.telegram.messenger.i0.G0();
                                        } else {
                                            tx0Var.N = currentTimeMillis;
                                            G0 = tx0Var.L;
                                        }
                                        String[] strArr = tx0Var.L;
                                        if (strArr == null || !Arrays.equals(G0, strArr)) {
                                            org.telegram.messenger.vi.b0(i13).M(G0, false);
                                        }
                                        tx0Var.L = G0;
                                        Runnable runnable = tx0Var.M;
                                        if (runnable != null) {
                                            org.telegram.messenger.i0.r(runnable);
                                            tx0Var.M = null;
                                        }
                                        tx0Var.M = new ag.g3(tx0Var, G0, substring, i14, 27);
                                        ArrayList arrayList5 = tx0Var.x;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            org.telegram.messenger.i0.h3(tx0Var.M, 600L);
                                        } else {
                                            tx0Var.M.run();
                                        }
                                    } else {
                                        tx0Var.w = false;
                                        tx0Var.c();
                                        tx0Var.d.setVisibility(0);
                                        tx0Var.W = org.telegram.messenger.i0.L(10.0f);
                                        tx0Var.d.invalidate();
                                    }
                                }
                                jg.l0 l0Var2 = tx0Var.d;
                                if (l0Var2 != null) {
                                    l0Var2.invalidate();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.h6 h6Var = h6VarArr[h6VarArr.length - 1];
                            if (h6Var != null) {
                                Spanned spanned = (Spanned) fieldText;
                                int spanStart = spanned.getSpanStart(h6Var);
                                int spanEnd = spanned.getSpanEnd(h6Var);
                                if (selectionStart == spanEnd) {
                                    String substring2 = fieldText.toString().substring(spanStart, spanEnd);
                                    tx0Var.s = true;
                                    tx0Var.c();
                                    tx0Var.V = h6Var;
                                    tx0Var.b0 = null;
                                    tx0Var.a0 = null;
                                    if (substring2 != null) {
                                        String str2 = tx0Var.J;
                                        if (str2 == null || tx0Var.I != 2 || !str2.equals(substring2) || tx0Var.y || (arrayList2 = tx0Var.x) == null || arrayList2.isEmpty()) {
                                            int i15 = tx0Var.K + 1;
                                            tx0Var.K = i15;
                                            Runnable runnable2 = tx0Var.M;
                                            if (runnable2 != null) {
                                                org.telegram.messenger.i0.r(runnable2);
                                            }
                                            tx0Var.M = new ki0(tx0Var, substring2, i15, 11);
                                            ArrayList arrayList6 = tx0Var.x;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                org.telegram.messenger.i0.h3(tx0Var.M, 600L);
                                            } else {
                                                tx0Var.M.run();
                                            }
                                        } else {
                                            tx0Var.w = false;
                                            tx0Var.c();
                                            jg.l0 l0Var3 = tx0Var.d;
                                            if (l0Var3 != null) {
                                                l0Var3.setVisibility(0);
                                                tx0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    jg.l0 l0Var4 = tx0Var.d;
                                    if (l0Var4 != null) {
                                        l0Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = tx0Var.M;
                        if (runnable3 != null) {
                            org.telegram.messenger.i0.r(runnable3);
                            tx0Var.M = null;
                        }
                        tx0Var.s = false;
                        jg.l0 l0Var5 = tx0Var.d;
                        if (l0Var5 != null) {
                            l0Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    tx0Var.s = false;
                    tx0Var.w = true;
                    jg.l0 l0Var6 = tx0Var.d;
                    if (l0Var6 != null) {
                        l0Var6.invalidate();
                        break;
                    }
                }
                break;
            case 15:
                zx0 zx0Var = (zx0) obj;
                zx0Var.K = null;
                zx0Var.b();
                break;
            case 16:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences d12 = org.telegram.messenger.wp.d1();
                    d12.edit().putInt("showchattagsinfo", d12.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 17:
                ((yz0) obj).a();
                break;
            case 18:
                ArrayList arrayList7 = ((f01) obj).a;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    ((View) arrayList7.get(i16)).setVisibility(8);
                    if (arrayList7.get(i16) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).f3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).h3(false, false, false);
                    }
                }
                break;
            case 19:
                f11 f11Var = (f11) obj;
                f11Var.J = null;
                f11Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f).start();
                break;
            case 20:
                j11 j11Var = (j11) obj;
                ViewPropertyAnimator duration = j11Var.animate().alpha(0.0f).setListener(new t60(j11Var, 29)).setDuration(300L);
                j11Var.b = duration;
                duration.start();
                break;
            case 21:
                l11 l11Var = (l11) obj;
                org.telegram.messenger.r20 r20Var = l11Var.b;
                if (r20Var != null) {
                    r20Var.a(Long.valueOf(l11Var.a.t));
                    break;
                }
                break;
            case 22:
                p21 p21Var = (p21) ((ha0) obj).c;
                if (p21Var.l()) {
                    p21Var.m();
                    break;
                }
                break;
            case 23:
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) obj;
                org.telegram.messenger.at.f(kjVar.I1).k(org.telegram.messenger.at.A1, kjVar);
                break;
            case 24:
                ((org.telegram.messenger.k20) obj).a(null, Boolean.FALSE);
                break;
            case 25:
                ((org.telegram.ui.ActionBar.k1) obj).dismiss();
                break;
            case 26:
                ((x31) obj).c.setVisibility(8);
                break;
            case 27:
                ((org.telegram.ui.xk) obj).c.presentFragment(new org.telegram.ui.e01());
                break;
            case 28:
                ((h41) obj).requestLayout();
                break;
            default:
                ((z41) obj).f();
                break;
        }
    }

    public /* synthetic */ vo0(vh.o1 o1Var, int i10) {
        this.a = 11;
        this.b = o1Var;
    }
}
