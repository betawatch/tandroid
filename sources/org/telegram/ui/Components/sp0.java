package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sp0(gi.c2 c2Var, int i3) {
        this.a = 8;
        this.b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] G0;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ws0 ws0Var = ((tp0) obj).H;
                if (ws0Var.F1) {
                    ws0Var.o1(false);
                    break;
                }
                break;
            case 1:
                ((cr0) obj).a.z1(false);
                break;
            case 2:
                org.telegram.ui.ActionBar.d2 d2Var = ((ir0) obj).f.y1;
                if (d2Var != null) {
                    d2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 3:
                ((sp0) obj).run();
                break;
            case 4:
                hs0 hs0Var = (hs0) obj;
                ArrayList arrayList3 = hs0Var.f;
                if (hs0Var.h) {
                    hs0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        if (((org.telegram.messenger.mv) arrayList3.get(i10)).b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.mv) arrayList3.get(i10)).a));
                        }
                    }
                    org.telegram.messenger.nv G1 = hs0Var.y.y1.getMessagesController().G1();
                    ArrayList d = org.telegram.messenger.nv.d(G1.j);
                    int i11 = G1.a;
                    if (arrayList4.size() <= (org.telegram.messenger.h10.i(i11).q() ? org.telegram.messenger.hp.s1(i11).n6 : org.telegram.messenger.hp.s1(i11).m6) && !org.telegram.messenger.nv.k(d, arrayList4)) {
                        G1.p(arrayList4);
                        break;
                    }
                }
                break;
            case 5:
                ((is0) obj).F();
                break;
            case 6:
                ((qt0) obj).V();
                break;
            case 7:
                ((zt0) obj).getClass();
                break;
            case 8:
                ((xu0) obj).l0(0);
                break;
            case 9:
                su0 su0Var = (su0) obj;
                if (!su0Var.x) {
                    su0Var.E = 0.0f;
                    break;
                }
                break;
            case 10:
                ((ew0) obj).b();
                break;
            case 11:
                ow0 ow0Var = (ow0) obj;
                int i12 = ow0Var.a;
                ow0Var.I = null;
                mw0 mw0Var = ow0Var.c;
                if (mw0Var != null && mw0Var.getEditField() != null && ow0Var.c.getFieldText() != null) {
                    int selectionStart = ow0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = ow0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        ow0Var.s = false;
                        kw0 kw0Var = ow0Var.d;
                        if (kw0Var != null) {
                            kw0Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = ow0Var.c.getFieldText();
                        boolean z10 = fieldText instanceof Spanned;
                        org.telegram.messenger.f6[] f6VarArr = z10 ? (org.telegram.messenger.f6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.f6.class) : null;
                        if (f6VarArr == null || f6VarArr.length <= 0 || !org.telegram.messenger.az.F || !org.telegram.messenger.h10.i(i12).q()) {
                            p5[] p5VarArr = z10 ? (p5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, p5.class) : null;
                            if ((p5VarArr == null || p5VarArr.length == 0) && selectionEnd < 52) {
                                ow0Var.s = true;
                                ow0Var.c();
                                ow0Var.W = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = ow0Var.K;
                                    if (str == null || ow0Var.J != 1 || !str.equals(substring) || ow0Var.y || (arrayList = ow0Var.x) == null || arrayList.isEmpty()) {
                                        int i13 = ow0Var.L + 1;
                                        ow0Var.L = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (ow0Var.M == null || Math.abs(currentTimeMillis - ow0Var.O) > 360) {
                                            ow0Var.O = currentTimeMillis;
                                            G0 = org.telegram.messenger.g0.G0();
                                        } else {
                                            ow0Var.O = currentTimeMillis;
                                            G0 = ow0Var.M;
                                        }
                                        String[] strArr = G0;
                                        String[] strArr2 = ow0Var.M;
                                        if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                            org.telegram.messenger.li.b0(i12).M(strArr, false);
                                        }
                                        ow0Var.M = strArr;
                                        Runnable runnable = ow0Var.N;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                            ow0Var.N = null;
                                        }
                                        ow0Var.N = new zo0(ow0Var, strArr, substring, i13, 3);
                                        ArrayList arrayList5 = ow0Var.x;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            org.telegram.messenger.g0.i3(ow0Var.N, 600L);
                                        } else {
                                            ow0Var.N.run();
                                        }
                                    } else {
                                        ow0Var.w = false;
                                        ow0Var.c();
                                        ow0Var.d.setVisibility(0);
                                        ow0Var.a0 = org.telegram.messenger.g0.L(10.0f);
                                        ow0Var.d.invalidate();
                                    }
                                }
                                kw0 kw0Var2 = ow0Var.d;
                                if (kw0Var2 != null) {
                                    kw0Var2.invalidate();
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
                                    ow0Var.s = true;
                                    ow0Var.c();
                                    ow0Var.W = f6Var;
                                    ow0Var.c0 = null;
                                    ow0Var.b0 = null;
                                    if (substring2 != null) {
                                        String str2 = ow0Var.K;
                                        if (str2 == null || ow0Var.J != 2 || !str2.equals(substring2) || ow0Var.y || (arrayList2 = ow0Var.x) == null || arrayList2.isEmpty()) {
                                            int i14 = ow0Var.L + 1;
                                            ow0Var.L = i14;
                                            Runnable runnable2 = ow0Var.N;
                                            if (runnable2 != null) {
                                                org.telegram.messenger.g0.r(runnable2);
                                            }
                                            ow0Var.N = new org.telegram.ui.f4(ow0Var, substring2, i14, 25);
                                            ArrayList arrayList6 = ow0Var.x;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                org.telegram.messenger.g0.i3(ow0Var.N, 600L);
                                            } else {
                                                ow0Var.N.run();
                                            }
                                        } else {
                                            ow0Var.w = false;
                                            ow0Var.c();
                                            kw0 kw0Var3 = ow0Var.d;
                                            if (kw0Var3 != null) {
                                                kw0Var3.setVisibility(0);
                                                ow0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    kw0 kw0Var4 = ow0Var.d;
                                    if (kw0Var4 != null) {
                                        kw0Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = ow0Var.N;
                        if (runnable3 != null) {
                            org.telegram.messenger.g0.r(runnable3);
                            ow0Var.N = null;
                        }
                        ow0Var.s = false;
                        kw0 kw0Var5 = ow0Var.d;
                        if (kw0Var5 != null) {
                            kw0Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    ow0Var.s = false;
                    ow0Var.w = true;
                    kw0 kw0Var6 = ow0Var.d;
                    if (kw0Var6 != null) {
                        kw0Var6.invalidate();
                        break;
                    }
                }
                break;
            case 12:
                uw0 uw0Var = (uw0) obj;
                uw0Var.L = null;
                uw0Var.b();
                break;
            case 13:
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    SharedPreferences e12 = org.telegram.messenger.hp.e1();
                    e12.edit().putInt("showchattagsinfo", e12.getInt("showchattagsinfo", 3) - 1).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 14:
                ((sy0) obj).a();
                break;
            case 15:
                ArrayList arrayList7 = ((zy0) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i15)).h3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i15)).j3(false, false, false);
                    }
                }
                break;
            case 16:
                yz0 yz0Var = (yz0) obj;
                yz0Var.K = null;
                yz0Var.I.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f).start();
                break;
            case 17:
                c01 c01Var = (c01) obj;
                ViewPropertyAnimator duration = c01Var.animate().alpha(0.0f).setListener(new a60(c01Var, 29)).setDuration(300L);
                c01Var.b = duration;
                duration.start();
                break;
            case 18:
                e01 e01Var = (e01) obj;
                org.telegram.messenger.u10 u10Var = e01Var.b;
                if (u10Var != null) {
                    u10Var.a(Long.valueOf(e01Var.a.t));
                    break;
                }
                break;
            case 19:
                g11 g11Var = (g11) ((s9) obj).c;
                if (g11Var.l()) {
                    g11Var.m();
                    break;
                }
                break;
            case 20:
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                org.telegram.messenger.hs.f(ziVar.I1).k(org.telegram.messenger.hs.A1, ziVar);
                break;
            case 21:
                ((org.telegram.messenger.n10) obj).a(null, Boolean.FALSE);
                break;
            case 22:
                ((org.telegram.ui.ActionBar.f1) obj).dismiss();
                break;
            case 23:
                ((p21) obj).c.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.xj) obj).c.presentFragment(new org.telegram.ui.gy0());
                break;
            case 25:
                ((y21) obj).requestLayout();
                break;
            case 26:
                ((p31) obj).f();
                break;
            case 27:
                UndoView undoView = (UndoView) obj;
                int i16 = UndoView.j0;
                undoView.getClass();
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 28:
                ((o41) obj).invalidateSelf();
                break;
            default:
                py pyVar = ((b51) obj).b;
                if (pyVar != null) {
                    pyVar.c(false, true, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ sp0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }
}
