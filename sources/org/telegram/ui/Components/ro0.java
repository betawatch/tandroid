package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ro0(hi.c2 c2Var, int i7) {
        this.a = 9;
        this.b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        v4.b0 b0Var;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((hi.k1) obj).setVisibility(8);
                break;
            case 1:
                ys0 ys0Var = ((vp0) obj).H;
                if (ys0Var.F1) {
                    ys0Var.q1(false);
                    break;
                }
                break;
            case 2:
                ((dr0) obj).a.B1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.e2 e2Var = ((kr0) obj).f.y1;
                if (e2Var != null) {
                    e2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 4:
                ((ro0) obj).run();
                break;
            case 5:
                js0 js0Var = (js0) obj;
                ArrayList arrayList3 = js0Var.f;
                if (js0Var.h) {
                    js0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        if (((org.telegram.messenger.sv) arrayList3.get(i10)).b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.sv) arrayList3.get(i10)).a));
                        }
                    }
                    org.telegram.messenger.tv G1 = js0Var.y.y1.getMessagesController().G1();
                    ArrayList d = org.telegram.messenger.tv.d(G1.j);
                    int i11 = G1.a;
                    if (arrayList4.size() <= (org.telegram.messenger.m10.i(i11).q() ? org.telegram.messenger.np.s1(i11).o6 : org.telegram.messenger.np.s1(i11).n6) && !org.telegram.messenger.tv.k(d, arrayList4)) {
                        G1.p(arrayList4);
                        break;
                    }
                }
                break;
            case 6:
                ((ks0) obj).F();
                break;
            case 7:
                ((st0) obj).V();
                break;
            case 8:
                ((bu0) obj).getClass();
                break;
            case 9:
                ((av0) obj).l0(0);
                break;
            case 10:
                vu0 vu0Var = (vu0) obj;
                if (!vu0Var.x) {
                    vu0Var.E = 0.0f;
                    break;
                }
                break;
            case 11:
                ((iw0) obj).b();
                break;
            case 12:
                rw0 rw0Var = (rw0) obj;
                int i12 = rw0Var.a;
                rw0Var.I = null;
                pw0 pw0Var = rw0Var.c;
                if (pw0Var != null && pw0Var.getEditField() != null && rw0Var.c.getFieldText() != null) {
                    if (rw0Var.c.a()) {
                        rw0Var.s = false;
                        bi.g2 g2Var = rw0Var.d;
                        if (g2Var != null) {
                            g2Var.invalidate();
                            break;
                        }
                    } else {
                        int selectionStart = rw0Var.c.getEditField().getSelectionStart();
                        int selectionEnd = rw0Var.c.getEditField().getSelectionEnd();
                        if (selectionStart != selectionEnd) {
                            rw0Var.s = false;
                            bi.g2 g2Var2 = rw0Var.d;
                            if (g2Var2 != null) {
                                g2Var2.invalidate();
                                break;
                            }
                        } else {
                            CharSequence fieldText = rw0Var.c.getFieldText();
                            boolean z10 = fieldText instanceof Spanned;
                            org.telegram.messenger.g6[] g6VarArr = z10 ? (org.telegram.messenger.g6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.g6.class) : null;
                            if (g6VarArr == null || g6VarArr.length <= 0 || !org.telegram.messenger.gz.F || !org.telegram.messenger.m10.i(i12).q()) {
                                p5[] p5VarArr = z10 ? (p5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, p5.class) : null;
                                if ((p5VarArr == null || p5VarArr.length == 0) && selectionEnd < 52) {
                                    rw0Var.s = true;
                                    rw0Var.c();
                                    rw0Var.W = null;
                                    String substring = fieldText.toString().substring(0, selectionEnd);
                                    if (substring != null) {
                                        String str = rw0Var.K;
                                        if (str == null || rw0Var.J != 1 || !str.equals(substring) || rw0Var.y || (arrayList = rw0Var.x) == null || arrayList.isEmpty()) {
                                            int i13 = rw0Var.L + 1;
                                            rw0Var.L = i13;
                                            long currentTimeMillis = System.currentTimeMillis();
                                            if (rw0Var.M == null || Math.abs(currentTimeMillis - rw0Var.O) > 360) {
                                                rw0Var.O = currentTimeMillis;
                                                G0 = org.telegram.messenger.g0.G0();
                                            } else {
                                                rw0Var.O = currentTimeMillis;
                                                G0 = rw0Var.M;
                                            }
                                            String[] strArr = G0;
                                            String[] strArr2 = rw0Var.M;
                                            if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                                org.telegram.messenger.si.b0(i12).M(strArr, false);
                                            }
                                            rw0Var.M = strArr;
                                            Runnable runnable = rw0Var.N;
                                            if (runnable != null) {
                                                org.telegram.messenger.g0.r(runnable);
                                                rw0Var.N = null;
                                            }
                                            rw0Var.N = new sp0(rw0Var, strArr, substring, i13, 2);
                                            ArrayList arrayList5 = rw0Var.x;
                                            if (arrayList5 == null || arrayList5.isEmpty()) {
                                                org.telegram.messenger.g0.i3(rw0Var.N, 600L);
                                            } else {
                                                rw0Var.N.run();
                                            }
                                        } else {
                                            rw0Var.w = false;
                                            rw0Var.c();
                                            rw0Var.d.setVisibility(0);
                                            rw0Var.a0 = org.telegram.messenger.g0.L(10.0f);
                                            rw0Var.d.invalidate();
                                        }
                                    }
                                    bi.g2 g2Var3 = rw0Var.d;
                                    if (g2Var3 != null) {
                                        g2Var3.invalidate();
                                        break;
                                    }
                                }
                            } else {
                                org.telegram.messenger.g6 g6Var = g6VarArr[g6VarArr.length - 1];
                                if (g6Var != null) {
                                    Spanned spanned = (Spanned) fieldText;
                                    int spanStart = spanned.getSpanStart(g6Var);
                                    int spanEnd = spanned.getSpanEnd(g6Var);
                                    if (selectionStart == spanEnd) {
                                        String substring2 = fieldText.toString().substring(spanStart, spanEnd);
                                        rw0Var.s = true;
                                        rw0Var.c();
                                        rw0Var.W = g6Var;
                                        rw0Var.c0 = null;
                                        rw0Var.b0 = null;
                                        if (substring2 != null) {
                                            String str2 = rw0Var.K;
                                            if (str2 == null || rw0Var.J != 2 || !str2.equals(substring2) || rw0Var.y || (arrayList2 = rw0Var.x) == null || arrayList2.isEmpty()) {
                                                int i14 = rw0Var.L + 1;
                                                rw0Var.L = i14;
                                                Runnable runnable2 = rw0Var.N;
                                                if (runnable2 != null) {
                                                    org.telegram.messenger.g0.r(runnable2);
                                                }
                                                rw0Var.N = new org.telegram.ui.f0(rw0Var, substring2, i14, 27);
                                                ArrayList arrayList6 = rw0Var.x;
                                                if (arrayList6 == null || arrayList6.isEmpty()) {
                                                    org.telegram.messenger.g0.i3(rw0Var.N, 600L);
                                                } else {
                                                    rw0Var.N.run();
                                                }
                                            } else {
                                                rw0Var.w = false;
                                                rw0Var.c();
                                                bi.g2 g2Var4 = rw0Var.d;
                                                if (g2Var4 != null) {
                                                    g2Var4.setVisibility(0);
                                                    rw0Var.d.invalidate();
                                                }
                                            }
                                        }
                                        bi.g2 g2Var5 = rw0Var.d;
                                        if (g2Var5 != null) {
                                            g2Var5.invalidate();
                                            break;
                                        }
                                    }
                                }
                            }
                            Runnable runnable3 = rw0Var.N;
                            if (runnable3 != null) {
                                org.telegram.messenger.g0.r(runnable3);
                                rw0Var.N = null;
                            }
                            rw0Var.s = false;
                            bi.g2 g2Var6 = rw0Var.d;
                            if (g2Var6 != null) {
                                g2Var6.invalidate();
                                break;
                            }
                        }
                    }
                } else {
                    rw0Var.s = false;
                    rw0Var.w = true;
                    bi.g2 g2Var7 = rw0Var.d;
                    if (g2Var7 != null) {
                        g2Var7.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                xw0 xw0Var = (xw0) obj;
                xw0Var.L = null;
                xw0Var.b();
                break;
            case 14:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences e12 = org.telegram.messenger.np.e1();
                    e12.edit().putInt("showchattagsinfo", e12.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 15:
                ((vy0) obj).a();
                break;
            case 16:
                ArrayList arrayList7 = ((cz0) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i15)).k3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i15)).m3(false, false, false);
                    }
                }
                break;
            case 17:
                b01 b01Var = (b01) obj;
                b01Var.K = null;
                b01Var.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(er.f).start();
                break;
            case 18:
                f01 f01Var = (f01) obj;
                ViewPropertyAnimator duration = f01Var.animate().alpha(0.0f).setListener(new h60(f01Var, 29)).setDuration(300L);
                f01Var.b = duration;
                duration.start();
                break;
            case 19:
                h01 h01Var = (h01) obj;
                org.telegram.messenger.z10 z10Var = h01Var.b;
                if (z10Var != null) {
                    z10Var.a(Long.valueOf(h01Var.a.t));
                    break;
                }
                break;
            case 20:
                v01 v01Var = (v01) obj;
                long j3 = v01Var.b;
                if (!v01Var.d && v01Var.y > 0.0f && (b0Var = (v4.b0) v01Var.r.getLayoutManager()) != null && b0Var.N0() >= v01Var.s.c.size() - 3) {
                    org.telegram.messenger.h00 h00Var = org.telegram.messenger.np.s1(v01Var.a).r7;
                    long j10 = -j3;
                    if (!h00Var.e(j10)) {
                        h00Var.o(j10);
                        break;
                    }
                }
                break;
            case 21:
                p11 p11Var = (p11) ((org.telegram.ui.nn) obj).c;
                if (p11Var.l()) {
                    p11Var.m();
                    break;
                }
                break;
            case 22:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                org.telegram.messenger.ns.f(gjVar.K1).k(org.telegram.messenger.ns.A1, gjVar);
                break;
            case 23:
                ((org.telegram.messenger.s10) obj).a(null, Boolean.FALSE);
                break;
            case 24:
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                break;
            case 25:
                ((z21) obj).c.setVisibility(8);
                break;
            case 26:
                ((org.telegram.ui.bk) obj).c.presentFragment(new org.telegram.ui.oy0());
                break;
            case 27:
                ((i31) obj).requestLayout();
                break;
            case 28:
                ((z31) obj).f();
                break;
            default:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.j0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }

    public /* synthetic */ ro0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
