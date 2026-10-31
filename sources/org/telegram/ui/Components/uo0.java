package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uo0(Object obj, int i10) {
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
                ((vo0) obj).b.b1(1);
                break;
            case 1:
                sp0 sp0Var = (sp0) obj;
                qp0[] qp0VarArr = sp0Var.a;
                if (sp0Var.b != 1) {
                    for (qp0 qp0Var : qp0VarArr) {
                        org.telegram.ui.ActionBar.u5 u5Var = (org.telegram.ui.ActionBar.u5) qp0Var.f;
                        u5Var.setAlpha(1.0f);
                        u5Var.setScaleX(1.0f);
                        u5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.u5) qp0Var.h).setAlpha(0.0f);
                    }
                    sp0Var.E = false;
                    org.telegram.messenger.i0.h3(sp0Var.G, 4000L);
                    break;
                } else {
                    sp0Var.E = !sp0Var.E;
                    int length = qp0VarArr.length;
                    while (i11 < length) {
                        qp0 qp0Var2 = qp0VarArr[i11];
                        org.telegram.ui.ActionBar.u5 u5Var2 = (org.telegram.ui.ActionBar.u5) qp0Var2.f;
                        org.telegram.ui.ActionBar.u5 u5Var3 = (org.telegram.ui.ActionBar.u5) qp0Var2.h;
                        u5Var2.setPivotX(0.0f);
                        u5Var3.setPivotX(0.0f);
                        if (sp0Var.E) {
                            u5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            u5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            u5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            u5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                        i11++;
                    }
                    org.telegram.messenger.i0.h3(sp0Var.G, 4000L);
                    break;
                }
            case 2:
                ((qp0) obj).setVisibility(8);
                break;
            case 3:
                zt0 zt0Var = ((uq0) obj).G;
                if (zt0Var.E1) {
                    zt0Var.l1(false);
                    break;
                }
                break;
            case 4:
                ((ds0) obj).a.w1(false);
                break;
            case 5:
                org.telegram.ui.ActionBar.k2 k2Var = ((js0) obj).f.x1;
                if (k2Var != null) {
                    k2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 6:
                ((uo0) obj).run();
                break;
            case 7:
                it0 it0Var = (it0) obj;
                ArrayList arrayList3 = it0Var.f;
                if (it0Var.h) {
                    it0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    while (i11 < arrayList3.size()) {
                        if (((org.telegram.messenger.fw) arrayList3.get(i11)).b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.fw) arrayList3.get(i11)).a));
                        }
                        i11++;
                    }
                    org.telegram.messenger.gw F1 = it0Var.y.x1.getMessagesController().F1();
                    ArrayList d = org.telegram.messenger.gw.d(F1.j);
                    int i12 = F1.a;
                    if (arrayList4.size() <= (org.telegram.messenger.d20.i(i12).q() ? org.telegram.messenger.vp.r1(i12).o6 : org.telegram.messenger.vp.r1(i12).n6) && !org.telegram.messenger.gw.k(d, arrayList4)) {
                        F1.p(arrayList4);
                        break;
                    }
                }
                break;
            case 8:
                ((lt0) obj).F();
                break;
            case 9:
                ((uu0) obj).V();
                break;
            case 10:
                ((dv0) obj).getClass();
                break;
            case 11:
                ((bw0) obj).l0(0);
                break;
            case 12:
                wv0 wv0Var = (wv0) obj;
                if (!wv0Var.x) {
                    wv0Var.D = 0.0f;
                    break;
                }
                break;
            case 13:
                ((jx0) obj).b();
                break;
            case 14:
                sx0 sx0Var = (sx0) obj;
                int i13 = sx0Var.a;
                sx0Var.H = null;
                qx0 qx0Var = sx0Var.c;
                if (qx0Var != null && qx0Var.getEditField() != null && sx0Var.c.getFieldText() != null) {
                    int selectionStart = sx0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = sx0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        sx0Var.s = false;
                        jg.l0 l0Var = sx0Var.d;
                        if (l0Var != null) {
                            l0Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = sx0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        org.telegram.messenger.h6[] h6VarArr = z10 ? (org.telegram.messenger.h6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.h6.class) : null;
                        if (h6VarArr == null || h6VarArr.length <= 0 || !org.telegram.messenger.tz.F || !org.telegram.messenger.d20.i(i13).q()) {
                            o5[] o5VarArr = z10 ? (o5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, o5.class) : null;
                            if ((o5VarArr == null || o5VarArr.length == 0) && selectionEnd < 52) {
                                sx0Var.s = true;
                                sx0Var.c();
                                sx0Var.V = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = sx0Var.J;
                                    if (str == null || sx0Var.I != 1 || !str.equals(substring) || sx0Var.y || (arrayList = sx0Var.x) == null || arrayList.isEmpty()) {
                                        int i14 = sx0Var.K + 1;
                                        sx0Var.K = i14;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (sx0Var.L == null || Math.abs(currentTimeMillis - sx0Var.N) > 360) {
                                            sx0Var.N = currentTimeMillis;
                                            G0 = org.telegram.messenger.i0.G0();
                                        } else {
                                            sx0Var.N = currentTimeMillis;
                                            G0 = sx0Var.L;
                                        }
                                        String[] strArr = sx0Var.L;
                                        if (strArr == null || !Arrays.equals(G0, strArr)) {
                                            org.telegram.messenger.ui.b0(i13).M(G0, false);
                                        }
                                        sx0Var.L = G0;
                                        Runnable runnable = sx0Var.M;
                                        if (runnable != null) {
                                            org.telegram.messenger.i0.r(runnable);
                                            sx0Var.M = null;
                                        }
                                        sx0Var.M = new ag.g3(sx0Var, G0, substring, i14, 27);
                                        ArrayList arrayList5 = sx0Var.x;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            org.telegram.messenger.i0.h3(sx0Var.M, 600L);
                                        } else {
                                            sx0Var.M.run();
                                        }
                                    } else {
                                        sx0Var.w = false;
                                        sx0Var.c();
                                        sx0Var.d.setVisibility(0);
                                        sx0Var.W = org.telegram.messenger.i0.L(10.0f);
                                        sx0Var.d.invalidate();
                                    }
                                }
                                jg.l0 l0Var2 = sx0Var.d;
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
                                    sx0Var.s = true;
                                    sx0Var.c();
                                    sx0Var.V = h6Var;
                                    sx0Var.b0 = null;
                                    sx0Var.a0 = null;
                                    if (substring2 != null) {
                                        String str2 = sx0Var.J;
                                        if (str2 == null || sx0Var.I != 2 || !str2.equals(substring2) || sx0Var.y || (arrayList2 = sx0Var.x) == null || arrayList2.isEmpty()) {
                                            int i15 = sx0Var.K + 1;
                                            sx0Var.K = i15;
                                            Runnable runnable2 = sx0Var.M;
                                            if (runnable2 != null) {
                                                org.telegram.messenger.i0.r(runnable2);
                                            }
                                            sx0Var.M = new ji0(sx0Var, substring2, i15, 11);
                                            ArrayList arrayList6 = sx0Var.x;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                org.telegram.messenger.i0.h3(sx0Var.M, 600L);
                                            } else {
                                                sx0Var.M.run();
                                            }
                                        } else {
                                            sx0Var.w = false;
                                            sx0Var.c();
                                            jg.l0 l0Var3 = sx0Var.d;
                                            if (l0Var3 != null) {
                                                l0Var3.setVisibility(0);
                                                sx0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    jg.l0 l0Var4 = sx0Var.d;
                                    if (l0Var4 != null) {
                                        l0Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = sx0Var.M;
                        if (runnable3 != null) {
                            org.telegram.messenger.i0.r(runnable3);
                            sx0Var.M = null;
                        }
                        sx0Var.s = false;
                        jg.l0 l0Var5 = sx0Var.d;
                        if (l0Var5 != null) {
                            l0Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    sx0Var.s = false;
                    sx0Var.w = true;
                    jg.l0 l0Var6 = sx0Var.d;
                    if (l0Var6 != null) {
                        l0Var6.invalidate();
                        break;
                    }
                }
                break;
            case 15:
                yx0 yx0Var = (yx0) obj;
                yx0Var.K = null;
                yx0Var.b();
                break;
            case 16:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences d12 = org.telegram.messenger.vp.d1();
                    d12.edit().putInt("showchattagsinfo", d12.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 17:
                ((xz0) obj).a();
                break;
            case 18:
                ArrayList arrayList7 = ((e01) obj).a;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    ((View) arrayList7.get(i16)).setVisibility(8);
                    if (arrayList7.get(i16) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).f3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i16)).h3(false, false, false);
                    }
                }
                break;
            case 19:
                e11 e11Var = (e11) obj;
                e11Var.J = null;
                e11Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(gr.f).start();
                break;
            case 20:
                i11 i11Var = (i11) obj;
                ViewPropertyAnimator duration = i11Var.animate().alpha(0.0f).setListener(new t60(i11Var, 29)).setDuration(300L);
                i11Var.b = duration;
                duration.start();
                break;
            case 21:
                k11 k11Var = (k11) obj;
                org.telegram.messenger.q20 q20Var = k11Var.b;
                if (q20Var != null) {
                    q20Var.a(Long.valueOf(k11Var.a.t));
                    break;
                }
                break;
            case 22:
                o21 o21Var = (o21) ((ha0) obj).c;
                if (o21Var.l()) {
                    o21Var.m();
                    break;
                }
                break;
            case 23:
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                org.telegram.messenger.zs.f(jjVar.I1).k(org.telegram.messenger.zs.A1, jjVar);
                break;
            case 24:
                ((org.telegram.messenger.j20) obj).a(null, Boolean.FALSE);
                break;
            case 25:
                ((org.telegram.ui.ActionBar.k1) obj).dismiss();
                break;
            case 26:
                ((w31) obj).c.setVisibility(8);
                break;
            case 27:
                ((org.telegram.ui.xk) obj).c.presentFragment(new org.telegram.ui.e01());
                break;
            case 28:
                ((g41) obj).requestLayout();
                break;
            default:
                ((y41) obj).f();
                break;
        }
    }

    public /* synthetic */ uo0(vh.o1 o1Var, int i10) {
        this.a = 11;
        this.b = o1Var;
    }
}
