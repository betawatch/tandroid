package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kr0(fi.d2 d2Var, int i7) {
        this.a = 6;
        this.b = d2Var;
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
                org.telegram.ui.ActionBar.f2 f2Var = ((lr0) obj).f.x1;
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 1:
                ((kr0) obj).run();
                break;
            case 2:
                ks0 ks0Var = (ks0) obj;
                ArrayList arrayList3 = ks0Var.f;
                if (ks0Var.h) {
                    ks0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        if (((org.telegram.messenger.uv) arrayList3.get(i10)).b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.uv) arrayList3.get(i10)).a));
                        }
                    }
                    org.telegram.messenger.vv G1 = ks0Var.y.x1.getMessagesController().G1();
                    ArrayList d = org.telegram.messenger.vv.d(G1.j);
                    int i11 = G1.a;
                    if (arrayList4.size() <= (org.telegram.messenger.p10.i(i11).q() ? org.telegram.messenger.qp.s1(i11).n6 : org.telegram.messenger.qp.s1(i11).m6) && !org.telegram.messenger.vv.k(d, arrayList4)) {
                        G1.p(arrayList4);
                        break;
                    }
                }
                break;
            case 3:
                ((ls0) obj).F();
                break;
            case 4:
                ((tt0) obj).V();
                break;
            case 5:
                ((cu0) obj).getClass();
                break;
            case 6:
                ((av0) obj).l0(0);
                break;
            case 7:
                vu0 vu0Var = (vu0) obj;
                if (!vu0Var.x) {
                    vu0Var.D = 0.0f;
                    break;
                }
                break;
            case 8:
                ((gw0) obj).b();
                break;
            case 9:
                pw0 pw0Var = (pw0) obj;
                int i12 = pw0Var.a;
                pw0Var.H = null;
                nw0 nw0Var = pw0Var.c;
                if (nw0Var != null && nw0Var.getEditField() != null && pw0Var.c.getFieldText() != null) {
                    int selectionStart = pw0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = pw0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        pw0Var.s = false;
                        bi.e5 e5Var = pw0Var.d;
                        if (e5Var != null) {
                            e5Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = pw0Var.c.getFieldText();
                        boolean z9 = fieldText instanceof Spanned;
                        org.telegram.messenger.f6[] f6VarArr = z9 ? (org.telegram.messenger.f6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.f6.class) : null;
                        if (f6VarArr == null || f6VarArr.length <= 0 || !org.telegram.messenger.iz.F || !org.telegram.messenger.p10.i(i12).q()) {
                            r5[] r5VarArr = z9 ? (r5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, r5.class) : null;
                            if ((r5VarArr == null || r5VarArr.length == 0) && selectionEnd < 52) {
                                pw0Var.s = true;
                                pw0Var.c();
                                pw0Var.V = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = pw0Var.J;
                                    if (str == null || pw0Var.I != 1 || !str.equals(substring) || pw0Var.y || (arrayList = pw0Var.x) == null || arrayList.isEmpty()) {
                                        int i13 = pw0Var.K + 1;
                                        pw0Var.K = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (pw0Var.L == null || Math.abs(currentTimeMillis - pw0Var.N) > 360) {
                                            pw0Var.N = currentTimeMillis;
                                            G0 = org.telegram.messenger.g0.G0();
                                        } else {
                                            pw0Var.N = currentTimeMillis;
                                            G0 = pw0Var.L;
                                        }
                                        String[] strArr = G0;
                                        String[] strArr2 = pw0Var.L;
                                        if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                            org.telegram.messenger.ui.b0(i12).M(strArr, false);
                                        }
                                        pw0Var.L = strArr;
                                        Runnable runnable = pw0Var.M;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                            pw0Var.M = null;
                                        }
                                        pw0Var.M = new qp0(pw0Var, strArr, substring, i13, 2);
                                        ArrayList arrayList5 = pw0Var.x;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            org.telegram.messenger.g0.i3(pw0Var.M, 600L);
                                        } else {
                                            pw0Var.M.run();
                                        }
                                    } else {
                                        pw0Var.w = false;
                                        pw0Var.c();
                                        pw0Var.d.setVisibility(0);
                                        pw0Var.W = org.telegram.messenger.g0.L(10.0f);
                                        pw0Var.d.invalidate();
                                    }
                                }
                                bi.e5 e5Var2 = pw0Var.d;
                                if (e5Var2 != null) {
                                    e5Var2.invalidate();
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.f6 f6Var = f6VarArr[f6VarArr.length - 1];
                            if (f6Var != null) {
                                Spanned spanned = (Spanned) fieldText;
                                int spanStart = spanned.getSpanStart(f6Var);
                                int spanEnd = spanned.getSpanEnd(f6Var);
                                if (selectionStart == spanEnd) {
                                    String substring2 = fieldText.toString().substring(spanStart, spanEnd);
                                    pw0Var.s = true;
                                    pw0Var.c();
                                    pw0Var.V = f6Var;
                                    pw0Var.b0 = null;
                                    pw0Var.a0 = null;
                                    if (substring2 != null) {
                                        String str2 = pw0Var.J;
                                        if (str2 == null || pw0Var.I != 2 || !str2.equals(substring2) || pw0Var.y || (arrayList2 = pw0Var.x) == null || arrayList2.isEmpty()) {
                                            int i14 = pw0Var.K + 1;
                                            pw0Var.K = i14;
                                            Runnable runnable2 = pw0Var.M;
                                            if (runnable2 != null) {
                                                org.telegram.messenger.g0.r(runnable2);
                                            }
                                            pw0Var.M = new org.telegram.ui.q8((Object) pw0Var, substring2, i14, 24);
                                            ArrayList arrayList6 = pw0Var.x;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                org.telegram.messenger.g0.i3(pw0Var.M, 600L);
                                            } else {
                                                pw0Var.M.run();
                                            }
                                        } else {
                                            pw0Var.w = false;
                                            pw0Var.c();
                                            bi.e5 e5Var3 = pw0Var.d;
                                            if (e5Var3 != null) {
                                                e5Var3.setVisibility(0);
                                                pw0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    bi.e5 e5Var4 = pw0Var.d;
                                    if (e5Var4 != null) {
                                        e5Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = pw0Var.M;
                        if (runnable3 != null) {
                            org.telegram.messenger.g0.r(runnable3);
                            pw0Var.M = null;
                        }
                        pw0Var.s = false;
                        bi.e5 e5Var5 = pw0Var.d;
                        if (e5Var5 != null) {
                            e5Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    pw0Var.s = false;
                    pw0Var.w = true;
                    bi.e5 e5Var6 = pw0Var.d;
                    if (e5Var6 != null) {
                        e5Var6.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                vw0 vw0Var = (vw0) obj;
                vw0Var.K = null;
                vw0Var.b();
                break;
            case 11:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences e12 = org.telegram.messenger.qp.e1();
                    e12.edit().putInt("showchattagsinfo", e12.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 12:
                ((uy0) obj).a();
                break;
            case 13:
                ArrayList arrayList7 = ((bz0) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i15)).j3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i15)).l3(false, false, false);
                    }
                }
                break;
            case 14:
                a01 a01Var = (a01) obj;
                a01Var.J = null;
                a01Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f).start();
                break;
            case 15:
                e01 e01Var = (e01) obj;
                ViewPropertyAnimator duration = e01Var.animate().alpha(0.0f).setListener(new f60(e01Var, 29)).setDuration(300L);
                e01Var.b = duration;
                duration.start();
                break;
            case 16:
                g01 g01Var = (g01) obj;
                org.telegram.messenger.c20 c20Var = g01Var.b;
                if (c20Var != null) {
                    c20Var.a(Long.valueOf(g01Var.a.t));
                    break;
                }
                break;
            case 17:
                t01 t01Var = (t01) obj;
                long j3 = t01Var.b;
                if (!t01Var.d && t01Var.y > 0.0f && (b0Var = (v4.b0) t01Var.r.getLayoutManager()) != null && b0Var.N0() >= t01Var.s.c.size() - 3) {
                    org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(t01Var.a).q7;
                    long j10 = -j3;
                    if (!k00Var.e(j10)) {
                        k00Var.o(j10);
                        break;
                    }
                }
                break;
            case 18:
                n11 n11Var = (n11) ((t9) obj).c;
                if (n11Var.l()) {
                    n11Var.m();
                    break;
                }
                break;
            case 19:
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                org.telegram.messenger.qs.f(ijVar.I1).k(org.telegram.messenger.qs.A1, ijVar);
                break;
            case 20:
                ((org.telegram.messenger.v10) obj).a(null, Boolean.FALSE);
                break;
            case 21:
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                break;
            case 22:
                ((v21) obj).c.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.dk) obj).c.presentFragment(new org.telegram.ui.ty0());
                break;
            case 24:
                ((e31) obj).requestLayout();
                break;
            case 25:
                ((w31) obj).f();
                break;
            case 26:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.i0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 27:
                ((t41) obj).invalidateSelf();
                break;
            case 28:
                sy syVar = ((i51) obj).b;
                if (syVar != null) {
                    syVar.c(false, true, false);
                    break;
                }
                break;
            default:
                u51 u51Var = (u51) obj;
                l2.i0 i0Var = u51Var.d;
                if (i0Var != null) {
                    TextureView textureView = u51Var.n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    u51Var.d.z1(u51Var.n);
                    ArrayList arrayList8 = u51Var.N;
                    if (arrayList8 != null) {
                        u51Var.k0(arrayList8, u51Var.O);
                    } else if (u51Var.U) {
                        u51Var.l0(u51Var.Q, u51Var.S, u51Var.R, u51Var.T);
                    } else {
                        u51Var.j0(u51Var.Q, u51Var.S);
                    }
                    u51Var.h0();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kr0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
