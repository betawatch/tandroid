package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bp0(hi.k2 k2Var, int i7) {
        this.a = 9;
        this.b = k2Var;
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
                ((hi.s1) obj).setVisibility(8);
                break;
            case 1:
                it0 it0Var = ((eq0) obj).H;
                if (it0Var.F1) {
                    it0Var.q1(false);
                    break;
                }
                break;
            case 2:
                ((mr0) obj).a.B1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.g2 g2Var = ((tr0) obj).f.y1;
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 4:
                ((bp0) obj).run();
                break;
            case 5:
                ts0 ts0Var = (ts0) obj;
                ArrayList arrayList3 = ts0Var.f;
                if (ts0Var.h) {
                    ts0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        if (((org.telegram.messenger.ov) arrayList3.get(i10)).b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.ov) arrayList3.get(i10)).a));
                        }
                    }
                    org.telegram.messenger.pv I1 = ts0Var.y.y1.getMessagesController().I1();
                    ArrayList d = org.telegram.messenger.pv.d(I1.j);
                    int i11 = I1.a;
                    if (arrayList4.size() <= (org.telegram.messenger.i10.i(i11).q() ? org.telegram.messenger.mp.u1(i11).q6 : org.telegram.messenger.mp.u1(i11).p6) && !org.telegram.messenger.pv.k(d, arrayList4)) {
                        I1.p(arrayList4);
                        break;
                    }
                }
                break;
            case 6:
                ((us0) obj).F();
                break;
            case 7:
                ((cu0) obj).V();
                break;
            case 8:
                ((lu0) obj).getClass();
                break;
            case 9:
                ((kv0) obj).l0(0);
                break;
            case 10:
                fv0 fv0Var = (fv0) obj;
                if (!fv0Var.x) {
                    fv0Var.E = 0.0f;
                    break;
                }
                break;
            case 11:
                ((qw0) obj).b();
                break;
            case 12:
                zw0 zw0Var = (zw0) obj;
                int i12 = zw0Var.a;
                zw0Var.I = null;
                xw0 xw0Var = zw0Var.c;
                if (xw0Var != null && xw0Var.getEditField() != null && zw0Var.c.getFieldText() != null) {
                    if (zw0Var.c.a()) {
                        zw0Var.s = false;
                        bi.g3 g3Var = zw0Var.d;
                        if (g3Var != null) {
                            g3Var.invalidate();
                            break;
                        }
                    } else {
                        int selectionStart = zw0Var.c.getEditField().getSelectionStart();
                        int selectionEnd = zw0Var.c.getEditField().getSelectionEnd();
                        if (selectionStart != selectionEnd) {
                            zw0Var.s = false;
                            bi.g3 g3Var2 = zw0Var.d;
                            if (g3Var2 != null) {
                                g3Var2.invalidate();
                                break;
                            }
                        } else {
                            CharSequence fieldText = zw0Var.c.getFieldText();
                            boolean z10 = fieldText instanceof Spanned;
                            org.telegram.messenger.g6[] g6VarArr = z10 ? (org.telegram.messenger.g6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.g6.class) : null;
                            if (g6VarArr == null || g6VarArr.length <= 0 || !org.telegram.messenger.bz.F || !org.telegram.messenger.i10.i(i12).q()) {
                                x5[] x5VarArr = z10 ? (x5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, x5.class) : null;
                                if ((x5VarArr == null || x5VarArr.length == 0) && selectionEnd < 52) {
                                    zw0Var.s = true;
                                    zw0Var.c();
                                    zw0Var.W = null;
                                    String substring = fieldText.toString().substring(0, selectionEnd);
                                    if (substring != null) {
                                        String str = zw0Var.K;
                                        if (str == null || zw0Var.J != 1 || !str.equals(substring) || zw0Var.y || (arrayList = zw0Var.x) == null || arrayList.isEmpty()) {
                                            int i13 = zw0Var.L + 1;
                                            zw0Var.L = i13;
                                            long currentTimeMillis = System.currentTimeMillis();
                                            if (zw0Var.M == null || Math.abs(currentTimeMillis - zw0Var.O) > 360) {
                                                zw0Var.O = currentTimeMillis;
                                                G0 = org.telegram.messenger.g0.G0();
                                            } else {
                                                zw0Var.O = currentTimeMillis;
                                                G0 = zw0Var.M;
                                            }
                                            String[] strArr = G0;
                                            String[] strArr2 = zw0Var.M;
                                            if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                                org.telegram.messenger.ri.d0(i12).O(strArr, false);
                                            }
                                            zw0Var.M = strArr;
                                            Runnable runnable = zw0Var.N;
                                            if (runnable != null) {
                                                org.telegram.messenger.g0.r(runnable);
                                                zw0Var.N = null;
                                            }
                                            zw0Var.N = new kp0(zw0Var, strArr, substring, i13, 4);
                                            ArrayList arrayList5 = zw0Var.x;
                                            if (arrayList5 == null || arrayList5.isEmpty()) {
                                                org.telegram.messenger.g0.h3(zw0Var.N, 600L);
                                            } else {
                                                zw0Var.N.run();
                                            }
                                        } else {
                                            zw0Var.w = false;
                                            zw0Var.c();
                                            zw0Var.d.setVisibility(0);
                                            zw0Var.a0 = org.telegram.messenger.g0.L(10.0f);
                                            zw0Var.d.invalidate();
                                        }
                                    }
                                    bi.g3 g3Var3 = zw0Var.d;
                                    if (g3Var3 != null) {
                                        g3Var3.invalidate();
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
                                        zw0Var.s = true;
                                        zw0Var.c();
                                        zw0Var.W = g6Var;
                                        zw0Var.c0 = null;
                                        zw0Var.b0 = null;
                                        if (substring2 != null) {
                                            String str2 = zw0Var.K;
                                            if (str2 == null || zw0Var.J != 2 || !str2.equals(substring2) || zw0Var.y || (arrayList2 = zw0Var.x) == null || arrayList2.isEmpty()) {
                                                int i14 = zw0Var.L + 1;
                                                zw0Var.L = i14;
                                                Runnable runnable2 = zw0Var.N;
                                                if (runnable2 != null) {
                                                    org.telegram.messenger.g0.r(runnable2);
                                                }
                                                zw0Var.N = new org.telegram.ui.f0(zw0Var, substring2, i14, 27);
                                                ArrayList arrayList6 = zw0Var.x;
                                                if (arrayList6 == null || arrayList6.isEmpty()) {
                                                    org.telegram.messenger.g0.h3(zw0Var.N, 600L);
                                                } else {
                                                    zw0Var.N.run();
                                                }
                                            } else {
                                                zw0Var.w = false;
                                                zw0Var.c();
                                                bi.g3 g3Var4 = zw0Var.d;
                                                if (g3Var4 != null) {
                                                    g3Var4.setVisibility(0);
                                                    zw0Var.d.invalidate();
                                                }
                                            }
                                        }
                                        bi.g3 g3Var5 = zw0Var.d;
                                        if (g3Var5 != null) {
                                            g3Var5.invalidate();
                                            break;
                                        }
                                    }
                                }
                            }
                            Runnable runnable3 = zw0Var.N;
                            if (runnable3 != null) {
                                org.telegram.messenger.g0.r(runnable3);
                                zw0Var.N = null;
                            }
                            zw0Var.s = false;
                            bi.g3 g3Var6 = zw0Var.d;
                            if (g3Var6 != null) {
                                g3Var6.invalidate();
                                break;
                            }
                        }
                    }
                } else {
                    zw0Var.s = false;
                    zw0Var.w = true;
                    bi.g3 g3Var7 = zw0Var.d;
                    if (g3Var7 != null) {
                        g3Var7.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                fx0 fx0Var = (fx0) obj;
                fx0Var.L = null;
                fx0Var.b();
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
                ((dz0) obj).a();
                break;
            case 16:
                ArrayList arrayList7 = ((kz0) obj).a;
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
                j01Var.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(kr.f).start();
                break;
            case 18:
                n01 n01Var = (n01) obj;
                ViewPropertyAnimator duration = n01Var.animate().alpha(0.0f).setListener(new p60(n01Var, 29)).setDuration(300L);
                n01Var.b = duration;
                duration.start();
                break;
            case 19:
                p01 p01Var = (p01) obj;
                org.telegram.messenger.w10 w10Var = p01Var.b;
                if (w10Var != null) {
                    w10Var.a(Long.valueOf(p01Var.a.t));
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
                ((org.telegram.messenger.p10) obj).a(null, Boolean.FALSE);
                break;
            case 23:
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                break;
            case 24:
                ((k31) obj).c.setVisibility(8);
                break;
            case 25:
                ((org.telegram.ui.ck) obj).c.presentFragment(new org.telegram.ui.ry0());
                break;
            case 26:
                ((u31) obj).requestLayout();
                break;
            case 27:
                ((l41) obj).f();
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
                ((j51) obj).invalidateSelf();
                break;
        }
    }

    public /* synthetic */ bp0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
