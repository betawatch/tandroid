package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cp0(hi.c2 c2Var, int i7) {
        this.a = 9;
        this.b = c2Var;
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
                jt0 jt0Var = ((fq0) obj).H;
                if (jt0Var.F1) {
                    jt0Var.q1(false);
                    break;
                }
                break;
            case 2:
                ((nr0) obj).a.B1(false);
                break;
            case 3:
                org.telegram.ui.ActionBar.g2 g2Var = ((ur0) obj).f.y1;
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 4:
                ((cp0) obj).run();
                break;
            case 5:
                us0 us0Var = (us0) obj;
                ArrayList arrayList3 = us0Var.f;
                if (us0Var.h) {
                    us0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        if (((org.telegram.messenger.pv) arrayList3.get(i10)).b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.pv) arrayList3.get(i10)).a));
                        }
                    }
                    org.telegram.messenger.qv I1 = us0Var.y.y1.getMessagesController().I1();
                    ArrayList d = org.telegram.messenger.qv.d(I1.j);
                    int i11 = I1.a;
                    if (arrayList4.size() <= (org.telegram.messenger.k10.i(i11).q() ? org.telegram.messenger.np.u1(i11).q6 : org.telegram.messenger.np.u1(i11).p6) && !org.telegram.messenger.qv.k(d, arrayList4)) {
                        I1.p(arrayList4);
                        break;
                    }
                }
                break;
            case 6:
                ((vs0) obj).F();
                break;
            case 7:
                ((du0) obj).V();
                break;
            case 8:
                ((mu0) obj).getClass();
                break;
            case 9:
                ((lv0) obj).l0(0);
                break;
            case 10:
                gv0 gv0Var = (gv0) obj;
                if (!gv0Var.x) {
                    gv0Var.E = 0.0f;
                    break;
                }
                break;
            case 11:
                ((rw0) obj).b();
                break;
            case 12:
                ax0 ax0Var = (ax0) obj;
                int i12 = ax0Var.a;
                ax0Var.I = null;
                yw0 yw0Var = ax0Var.c;
                if (yw0Var != null && yw0Var.getEditField() != null && ax0Var.c.getFieldText() != null) {
                    if (ax0Var.c.a()) {
                        ax0Var.s = false;
                        bi.e3 e3Var = ax0Var.d;
                        if (e3Var != null) {
                            e3Var.invalidate();
                            break;
                        }
                    } else {
                        int selectionStart = ax0Var.c.getEditField().getSelectionStart();
                        int selectionEnd = ax0Var.c.getEditField().getSelectionEnd();
                        if (selectionStart != selectionEnd) {
                            ax0Var.s = false;
                            bi.e3 e3Var2 = ax0Var.d;
                            if (e3Var2 != null) {
                                e3Var2.invalidate();
                                break;
                            }
                        } else {
                            CharSequence fieldText = ax0Var.c.getFieldText();
                            boolean z10 = fieldText instanceof Spanned;
                            org.telegram.messenger.g6[] g6VarArr = z10 ? (org.telegram.messenger.g6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.g6.class) : null;
                            if (g6VarArr == null || g6VarArr.length <= 0 || !org.telegram.messenger.cz.F || !org.telegram.messenger.k10.i(i12).q()) {
                                y5[] y5VarArr = z10 ? (y5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, y5.class) : null;
                                if ((y5VarArr == null || y5VarArr.length == 0) && selectionEnd < 52) {
                                    ax0Var.s = true;
                                    ax0Var.c();
                                    ax0Var.W = null;
                                    String substring = fieldText.toString().substring(0, selectionEnd);
                                    if (substring != null) {
                                        String str = ax0Var.K;
                                        if (str == null || ax0Var.J != 1 || !str.equals(substring) || ax0Var.y || (arrayList = ax0Var.x) == null || arrayList.isEmpty()) {
                                            int i13 = ax0Var.L + 1;
                                            ax0Var.L = i13;
                                            long currentTimeMillis = System.currentTimeMillis();
                                            if (ax0Var.M == null || Math.abs(currentTimeMillis - ax0Var.O) > 360) {
                                                ax0Var.O = currentTimeMillis;
                                                G0 = org.telegram.messenger.g0.G0();
                                            } else {
                                                ax0Var.O = currentTimeMillis;
                                                G0 = ax0Var.M;
                                            }
                                            String[] strArr = G0;
                                            String[] strArr2 = ax0Var.M;
                                            if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                                org.telegram.messenger.si.d0(i12).O(strArr, false);
                                            }
                                            ax0Var.M = strArr;
                                            Runnable runnable = ax0Var.N;
                                            if (runnable != null) {
                                                org.telegram.messenger.g0.r(runnable);
                                                ax0Var.N = null;
                                            }
                                            ax0Var.N = new lp0(ax0Var, strArr, substring, i13, 4);
                                            ArrayList arrayList5 = ax0Var.x;
                                            if (arrayList5 == null || arrayList5.isEmpty()) {
                                                org.telegram.messenger.g0.h3(ax0Var.N, 600L);
                                            } else {
                                                ax0Var.N.run();
                                            }
                                        } else {
                                            ax0Var.w = false;
                                            ax0Var.c();
                                            ax0Var.d.setVisibility(0);
                                            ax0Var.a0 = org.telegram.messenger.g0.L(10.0f);
                                            ax0Var.d.invalidate();
                                        }
                                    }
                                    bi.e3 e3Var3 = ax0Var.d;
                                    if (e3Var3 != null) {
                                        e3Var3.invalidate();
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
                                        ax0Var.s = true;
                                        ax0Var.c();
                                        ax0Var.W = g6Var;
                                        ax0Var.c0 = null;
                                        ax0Var.b0 = null;
                                        if (substring2 != null) {
                                            String str2 = ax0Var.K;
                                            if (str2 == null || ax0Var.J != 2 || !str2.equals(substring2) || ax0Var.y || (arrayList2 = ax0Var.x) == null || arrayList2.isEmpty()) {
                                                int i14 = ax0Var.L + 1;
                                                ax0Var.L = i14;
                                                Runnable runnable2 = ax0Var.N;
                                                if (runnable2 != null) {
                                                    org.telegram.messenger.g0.r(runnable2);
                                                }
                                                ax0Var.N = new org.telegram.ui.f0(ax0Var, substring2, i14, 27);
                                                ArrayList arrayList6 = ax0Var.x;
                                                if (arrayList6 == null || arrayList6.isEmpty()) {
                                                    org.telegram.messenger.g0.h3(ax0Var.N, 600L);
                                                } else {
                                                    ax0Var.N.run();
                                                }
                                            } else {
                                                ax0Var.w = false;
                                                ax0Var.c();
                                                bi.e3 e3Var4 = ax0Var.d;
                                                if (e3Var4 != null) {
                                                    e3Var4.setVisibility(0);
                                                    ax0Var.d.invalidate();
                                                }
                                            }
                                        }
                                        bi.e3 e3Var5 = ax0Var.d;
                                        if (e3Var5 != null) {
                                            e3Var5.invalidate();
                                            break;
                                        }
                                    }
                                }
                            }
                            Runnable runnable3 = ax0Var.N;
                            if (runnable3 != null) {
                                org.telegram.messenger.g0.r(runnable3);
                                ax0Var.N = null;
                            }
                            ax0Var.s = false;
                            bi.e3 e3Var6 = ax0Var.d;
                            if (e3Var6 != null) {
                                e3Var6.invalidate();
                                break;
                            }
                        }
                    }
                } else {
                    ax0Var.s = false;
                    ax0Var.w = true;
                    bi.e3 e3Var7 = ax0Var.d;
                    if (e3Var7 != null) {
                        e3Var7.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                gx0 gx0Var = (gx0) obj;
                gx0Var.L = null;
                gx0Var.b();
                break;
            case 14:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences g12 = org.telegram.messenger.np.g1();
                    g12.edit().putInt("showchattagsinfo", g12.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 15:
                ((ez0) obj).a();
                break;
            case 16:
                ArrayList arrayList7 = ((lz0) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.r1) {
                        ((org.telegram.ui.Cells.r1) arrayList7.get(i15)).l3(false, false);
                        ((org.telegram.ui.Cells.r1) arrayList7.get(i15)).n3(false, false, false);
                    }
                }
                break;
            case 17:
                k01 k01Var = (k01) obj;
                k01Var.K = null;
                k01Var.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(nr.f).start();
                break;
            case 18:
                o01 o01Var = (o01) obj;
                ViewPropertyAnimator duration = o01Var.animate().alpha(0.0f).setListener(new s60(o01Var, 29)).setDuration(300L);
                o01Var.b = duration;
                duration.start();
                break;
            case 19:
                q01 q01Var = (q01) obj;
                org.telegram.messenger.y10 y10Var = q01Var.b;
                if (y10Var != null) {
                    y10Var.a(Long.valueOf(q01Var.a.t));
                    break;
                }
                break;
            case 20:
                a21 a21Var = (a21) ((org.telegram.ui.on) obj).c;
                if (a21Var.l()) {
                    a21Var.m();
                    break;
                }
                break;
            case 21:
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                org.telegram.messenger.ls.f(gjVar.K1).k(org.telegram.messenger.ls.A1, gjVar);
                break;
            case 22:
                ((org.telegram.messenger.r10) obj).a(null, Boolean.FALSE);
                break;
            case 23:
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                break;
            case 24:
                ((l31) obj).c.setVisibility(8);
                break;
            case 25:
                ((org.telegram.ui.ck) obj).c.presentFragment(new org.telegram.ui.sy0());
                break;
            case 26:
                ((v31) obj).requestLayout();
                break;
            case 27:
                ((m41) obj).f();
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
                ((k51) obj).invalidateSelf();
                break;
        }
    }

    public /* synthetic */ cp0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
