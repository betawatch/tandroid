package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ap0(hi.d2 d2Var, int i7) {
        this.a = 9;
        this.b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((hi.k1) obj).setVisibility(8);
                break;
            case 1:
                gt0 gt0Var = ((dq0) obj).H;
                if (gt0Var.F1) {
                    gt0Var.q1(false);
                    break;
                }
                break;
            case 2:
                ((lr0) obj).a.B1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.h2 h2Var = ((sr0) obj).f.y1;
                if (h2Var != null) {
                    h2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 4:
                ((ap0) obj).run();
                break;
            case 5:
                rs0 rs0Var = (rs0) obj;
                ArrayList arrayList3 = rs0Var.f;
                if (rs0Var.h) {
                    rs0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        if (((org.telegram.messenger.ov) arrayList3.get(i10)).b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.ov) arrayList3.get(i10)).a));
                        }
                    }
                    org.telegram.messenger.pv I1 = rs0Var.y.y1.getMessagesController().I1();
                    ArrayList d = org.telegram.messenger.pv.d(I1.j);
                    int i11 = I1.a;
                    if (arrayList4.size() <= (org.telegram.messenger.j10.i(i11).q() ? org.telegram.messenger.mp.u1(i11).q6 : org.telegram.messenger.mp.u1(i11).p6) && !org.telegram.messenger.pv.k(d, arrayList4)) {
                        I1.p(arrayList4);
                        break;
                    }
                }
                break;
            case 6:
                ((ss0) obj).F();
                break;
            case 7:
                ((au0) obj).V();
                break;
            case 8:
                ((ju0) obj).getClass();
                break;
            case 9:
                ((iv0) obj).l0(0);
                break;
            case 10:
                dv0 dv0Var = (dv0) obj;
                if (!dv0Var.x) {
                    dv0Var.E = 0.0f;
                    break;
                }
                break;
            case 11:
                ((pw0) obj).b();
                break;
            case 12:
                yw0 yw0Var = (yw0) obj;
                int i12 = yw0Var.a;
                yw0Var.I = null;
                ww0 ww0Var = yw0Var.c;
                if (ww0Var != null && ww0Var.getEditField() != null && yw0Var.c.getFieldText() != null) {
                    if (yw0Var.c.a()) {
                        yw0Var.s = false;
                        bi.a3 a3Var = yw0Var.d;
                        if (a3Var != null) {
                            a3Var.invalidate();
                            break;
                        }
                    } else {
                        int selectionStart = yw0Var.c.getEditField().getSelectionStart();
                        int selectionEnd = yw0Var.c.getEditField().getSelectionEnd();
                        if (selectionStart != selectionEnd) {
                            yw0Var.s = false;
                            bi.a3 a3Var2 = yw0Var.d;
                            if (a3Var2 != null) {
                                a3Var2.invalidate();
                                break;
                            }
                        } else {
                            CharSequence fieldText = yw0Var.c.getFieldText();
                            boolean z10 = fieldText instanceof Spanned;
                            org.telegram.messenger.g6[] g6VarArr = z10 ? (org.telegram.messenger.g6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.g6.class) : null;
                            if (g6VarArr == null || g6VarArr.length <= 0 || !org.telegram.messenger.bz.F || !org.telegram.messenger.j10.i(i12).q()) {
                                x5[] x5VarArr = z10 ? (x5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, x5.class) : null;
                                if ((x5VarArr == null || x5VarArr.length == 0) && selectionEnd < 52) {
                                    yw0Var.s = true;
                                    yw0Var.c();
                                    yw0Var.W = null;
                                    String substring = fieldText.toString().substring(0, selectionEnd);
                                    if (substring != null) {
                                        String str = yw0Var.K;
                                        if (str == null || yw0Var.J != 1 || !str.equals(substring) || yw0Var.y || (arrayList = yw0Var.x) == null || arrayList.isEmpty()) {
                                            int i13 = yw0Var.L + 1;
                                            yw0Var.L = i13;
                                            long currentTimeMillis = System.currentTimeMillis();
                                            if (yw0Var.M == null || Math.abs(currentTimeMillis - yw0Var.O) > 360) {
                                                yw0Var.O = currentTimeMillis;
                                                G0 = org.telegram.messenger.g0.G0();
                                            } else {
                                                yw0Var.O = currentTimeMillis;
                                                G0 = yw0Var.M;
                                            }
                                            String[] strArr = G0;
                                            String[] strArr2 = yw0Var.M;
                                            if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                                org.telegram.messenger.ri.d0(i12).O(strArr, false);
                                            }
                                            yw0Var.M = strArr;
                                            Runnable runnable = yw0Var.N;
                                            if (runnable != null) {
                                                org.telegram.messenger.g0.r(runnable);
                                                yw0Var.N = null;
                                            }
                                            yw0Var.N = new kp0(yw0Var, strArr, substring, i13, 3);
                                            ArrayList arrayList5 = yw0Var.x;
                                            if (arrayList5 == null || arrayList5.isEmpty()) {
                                                org.telegram.messenger.g0.h3(yw0Var.N, 600L);
                                            } else {
                                                yw0Var.N.run();
                                            }
                                        } else {
                                            yw0Var.w = false;
                                            yw0Var.c();
                                            yw0Var.d.setVisibility(0);
                                            yw0Var.a0 = org.telegram.messenger.g0.L(10.0f);
                                            yw0Var.d.invalidate();
                                        }
                                    }
                                    bi.a3 a3Var3 = yw0Var.d;
                                    if (a3Var3 != null) {
                                        a3Var3.invalidate();
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
                                        yw0Var.s = true;
                                        yw0Var.c();
                                        yw0Var.W = g6Var;
                                        yw0Var.c0 = null;
                                        yw0Var.b0 = null;
                                        if (substring2 != null) {
                                            String str2 = yw0Var.K;
                                            if (str2 == null || yw0Var.J != 2 || !str2.equals(substring2) || yw0Var.y || (arrayList2 = yw0Var.x) == null || arrayList2.isEmpty()) {
                                                int i14 = yw0Var.L + 1;
                                                yw0Var.L = i14;
                                                Runnable runnable2 = yw0Var.N;
                                                if (runnable2 != null) {
                                                    org.telegram.messenger.g0.r(runnable2);
                                                }
                                                yw0Var.N = new org.telegram.ui.b0(yw0Var, substring2, i14, 28);
                                                ArrayList arrayList6 = yw0Var.x;
                                                if (arrayList6 == null || arrayList6.isEmpty()) {
                                                    org.telegram.messenger.g0.h3(yw0Var.N, 600L);
                                                } else {
                                                    yw0Var.N.run();
                                                }
                                            } else {
                                                yw0Var.w = false;
                                                yw0Var.c();
                                                bi.a3 a3Var4 = yw0Var.d;
                                                if (a3Var4 != null) {
                                                    a3Var4.setVisibility(0);
                                                    yw0Var.d.invalidate();
                                                }
                                            }
                                        }
                                        bi.a3 a3Var5 = yw0Var.d;
                                        if (a3Var5 != null) {
                                            a3Var5.invalidate();
                                            break;
                                        }
                                    }
                                }
                            }
                            Runnable runnable3 = yw0Var.N;
                            if (runnable3 != null) {
                                org.telegram.messenger.g0.r(runnable3);
                                yw0Var.N = null;
                            }
                            yw0Var.s = false;
                            bi.a3 a3Var6 = yw0Var.d;
                            if (a3Var6 != null) {
                                a3Var6.invalidate();
                                break;
                            }
                        }
                    }
                } else {
                    yw0Var.s = false;
                    yw0Var.w = true;
                    bi.a3 a3Var7 = yw0Var.d;
                    if (a3Var7 != null) {
                        a3Var7.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                ex0 ex0Var = (ex0) obj;
                ex0Var.L = null;
                ex0Var.b();
                break;
            case 14:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences g12 = org.telegram.messenger.mp.g1();
                    g12.edit().putInt("showchattagsinfo", g12.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 15:
                ((cz0) obj).a();
                break;
            case 16:
                ArrayList arrayList7 = ((jz0) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.r1) {
                        ((org.telegram.ui.Cells.r1) arrayList7.get(i15)).l3(false, false);
                        ((org.telegram.ui.Cells.r1) arrayList7.get(i15)).n3(false, false, false);
                    }
                }
                break;
            case 17:
                j01 j01Var = (j01) obj;
                j01Var.K = null;
                j01Var.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(lr.f).start();
                break;
            case 18:
                n01 n01Var = (n01) obj;
                ViewPropertyAnimator duration = n01Var.animate().alpha(0.0f).setListener(new q60(n01Var, 29)).setDuration(300L);
                n01Var.b = duration;
                duration.start();
                break;
            case 19:
                p01 p01Var = (p01) obj;
                org.telegram.messenger.x10 x10Var = p01Var.b;
                if (x10Var != null) {
                    x10Var.a(Long.valueOf(p01Var.a.t));
                    break;
                }
                break;
            case 20:
                z11 z11Var = (z11) ((org.telegram.ui.on) obj).c;
                if (z11Var.l()) {
                    z11Var.m();
                    break;
                }
                break;
            case 21:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                org.telegram.messenger.ks.f(fjVar.K1).k(org.telegram.messenger.ks.A1, fjVar);
                break;
            case 22:
                ((org.telegram.messenger.q10) obj).a(null, Boolean.FALSE);
                break;
            case 23:
                ((org.telegram.ui.ActionBar.h1) obj).dismiss();
                break;
            case 24:
                ((j31) obj).c.setVisibility(8);
                break;
            case 25:
                ((org.telegram.ui.ck) obj).c.presentFragment(new org.telegram.ui.sy0());
                break;
            case 26:
                ((s31) obj).requestLayout();
                break;
            case 27:
                ((j41) obj).f();
                break;
            case 28:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.j0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                ((h51) obj).invalidateSelf();
                break;
        }
    }

    public /* synthetic */ ap0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
