package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.text.Spanned;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ir0(fi.d2 d2Var, int i7) {
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
                org.telegram.ui.ActionBar.f2 f2Var = ((jr0) obj).f.x1;
                if (f2Var != null) {
                    f2Var.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    break;
                }
                break;
            case 1:
                ((ir0) obj).run();
                break;
            case 2:
                is0 is0Var = (is0) obj;
                ArrayList arrayList3 = is0Var.f;
                if (is0Var.h) {
                    is0Var.h = false;
                    ArrayList arrayList4 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        if (((org.telegram.messenger.uv) arrayList3.get(i10)).b) {
                            arrayList4.add(Long.valueOf(((org.telegram.messenger.uv) arrayList3.get(i10)).a));
                        }
                    }
                    org.telegram.messenger.vv G1 = is0Var.y.x1.getMessagesController().G1();
                    ArrayList d = org.telegram.messenger.vv.d(G1.j);
                    int i11 = G1.a;
                    if (arrayList4.size() <= (org.telegram.messenger.p10.i(i11).q() ? org.telegram.messenger.qp.s1(i11).n6 : org.telegram.messenger.qp.s1(i11).m6) && !org.telegram.messenger.vv.k(d, arrayList4)) {
                        G1.p(arrayList4);
                        break;
                    }
                }
                break;
            case 3:
                ((js0) obj).F();
                break;
            case 4:
                ((rt0) obj).V();
                break;
            case 5:
                ((au0) obj).getClass();
                break;
            case 6:
                ((yu0) obj).l0(0);
                break;
            case 7:
                tu0 tu0Var = (tu0) obj;
                if (!tu0Var.x) {
                    tu0Var.D = 0.0f;
                    break;
                }
                break;
            case 8:
                ((fw0) obj).b();
                break;
            case 9:
                ow0 ow0Var = (ow0) obj;
                int i12 = ow0Var.a;
                ow0Var.H = null;
                mw0 mw0Var = ow0Var.c;
                if (mw0Var != null && mw0Var.getEditField() != null && ow0Var.c.getFieldText() != null) {
                    int selectionStart = ow0Var.c.getEditField().getSelectionStart();
                    int selectionEnd = ow0Var.c.getEditField().getSelectionEnd();
                    if (selectionStart != selectionEnd) {
                        ow0Var.s = false;
                        bi.e5 e5Var = ow0Var.d;
                        if (e5Var != null) {
                            e5Var.invalidate();
                            break;
                        }
                    } else {
                        CharSequence fieldText = ow0Var.c.getFieldText();
                        boolean z9 = fieldText instanceof Spanned;
                        org.telegram.messenger.f6[] f6VarArr = z9 ? (org.telegram.messenger.f6[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd - 24), selectionEnd, org.telegram.messenger.f6.class) : null;
                        if (f6VarArr == null || f6VarArr.length <= 0 || !org.telegram.messenger.iz.F || !org.telegram.messenger.p10.i(i12).q()) {
                            r5[] r5VarArr = z9 ? (r5[]) ((Spanned) fieldText).getSpans(Math.max(0, selectionEnd), selectionEnd, r5.class) : null;
                            if ((r5VarArr == null || r5VarArr.length == 0) && selectionEnd < 52) {
                                ow0Var.s = true;
                                ow0Var.c();
                                ow0Var.V = null;
                                String substring = fieldText.toString().substring(0, selectionEnd);
                                if (substring != null) {
                                    String str = ow0Var.J;
                                    if (str == null || ow0Var.I != 1 || !str.equals(substring) || ow0Var.y || (arrayList = ow0Var.x) == null || arrayList.isEmpty()) {
                                        int i13 = ow0Var.K + 1;
                                        ow0Var.K = i13;
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (ow0Var.L == null || Math.abs(currentTimeMillis - ow0Var.N) > 360) {
                                            ow0Var.N = currentTimeMillis;
                                            G0 = org.telegram.messenger.g0.G0();
                                        } else {
                                            ow0Var.N = currentTimeMillis;
                                            G0 = ow0Var.L;
                                        }
                                        String[] strArr = G0;
                                        String[] strArr2 = ow0Var.L;
                                        if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                                            org.telegram.messenger.ui.b0(i12).M(strArr, false);
                                        }
                                        ow0Var.L = strArr;
                                        Runnable runnable = ow0Var.M;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                            ow0Var.M = null;
                                        }
                                        ow0Var.M = new pp0(ow0Var, strArr, substring, i13, 2);
                                        ArrayList arrayList5 = ow0Var.x;
                                        if (arrayList5 == null || arrayList5.isEmpty()) {
                                            org.telegram.messenger.g0.i3(ow0Var.M, 600L);
                                        } else {
                                            ow0Var.M.run();
                                        }
                                    } else {
                                        ow0Var.w = false;
                                        ow0Var.c();
                                        ow0Var.d.setVisibility(0);
                                        ow0Var.W = org.telegram.messenger.g0.L(10.0f);
                                        ow0Var.d.invalidate();
                                    }
                                }
                                bi.e5 e5Var2 = ow0Var.d;
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
                                    ow0Var.s = true;
                                    ow0Var.c();
                                    ow0Var.V = f6Var;
                                    ow0Var.b0 = null;
                                    ow0Var.a0 = null;
                                    if (substring2 != null) {
                                        String str2 = ow0Var.J;
                                        if (str2 == null || ow0Var.I != 2 || !str2.equals(substring2) || ow0Var.y || (arrayList2 = ow0Var.x) == null || arrayList2.isEmpty()) {
                                            int i14 = ow0Var.K + 1;
                                            ow0Var.K = i14;
                                            Runnable runnable2 = ow0Var.M;
                                            if (runnable2 != null) {
                                                org.telegram.messenger.g0.r(runnable2);
                                            }
                                            ow0Var.M = new org.telegram.ui.q8((Object) ow0Var, substring2, i14, 24);
                                            ArrayList arrayList6 = ow0Var.x;
                                            if (arrayList6 == null || arrayList6.isEmpty()) {
                                                org.telegram.messenger.g0.i3(ow0Var.M, 600L);
                                            } else {
                                                ow0Var.M.run();
                                            }
                                        } else {
                                            ow0Var.w = false;
                                            ow0Var.c();
                                            bi.e5 e5Var3 = ow0Var.d;
                                            if (e5Var3 != null) {
                                                e5Var3.setVisibility(0);
                                                ow0Var.d.invalidate();
                                            }
                                        }
                                    }
                                    bi.e5 e5Var4 = ow0Var.d;
                                    if (e5Var4 != null) {
                                        e5Var4.invalidate();
                                        break;
                                    }
                                }
                            }
                        }
                        Runnable runnable3 = ow0Var.M;
                        if (runnable3 != null) {
                            org.telegram.messenger.g0.r(runnable3);
                            ow0Var.M = null;
                        }
                        ow0Var.s = false;
                        bi.e5 e5Var5 = ow0Var.d;
                        if (e5Var5 != null) {
                            e5Var5.invalidate();
                            break;
                        }
                    }
                } else {
                    ow0Var.s = false;
                    ow0Var.w = true;
                    bi.e5 e5Var6 = ow0Var.d;
                    if (e5Var6 != null) {
                        e5Var6.invalidate();
                        break;
                    }
                }
                break;
            case 10:
                uw0 uw0Var = (uw0) obj;
                uw0Var.K = null;
                uw0Var.b();
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
                ((ty0) obj).a();
                break;
            case 13:
                ArrayList arrayList7 = ((az0) obj).a;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    ((View) arrayList7.get(i15)).setVisibility(8);
                    if (arrayList7.get(i15) instanceof org.telegram.ui.Cells.q1) {
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i15)).j3(false, false);
                        ((org.telegram.ui.Cells.q1) arrayList7.get(i15)).l3(false, false, false);
                    }
                }
                break;
            case 14:
                zz0 zz0Var = (zz0) obj;
                zz0Var.J = null;
                zz0Var.H.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(xq.f).start();
                break;
            case 15:
                d01 d01Var = (d01) obj;
                ViewPropertyAnimator duration = d01Var.animate().alpha(0.0f).setListener(new e60(d01Var, 29)).setDuration(300L);
                d01Var.b = duration;
                duration.start();
                break;
            case 16:
                f01 f01Var = (f01) obj;
                org.telegram.messenger.c20 c20Var = f01Var.b;
                if (c20Var != null) {
                    c20Var.a(Long.valueOf(f01Var.a.t));
                    break;
                }
                break;
            case 17:
                s01 s01Var = (s01) obj;
                long j3 = s01Var.b;
                if (!s01Var.d && s01Var.y > 0.0f && (b0Var = (v4.b0) s01Var.r.getLayoutManager()) != null && b0Var.N0() >= s01Var.s.c.size() - 3) {
                    org.telegram.messenger.k00 k00Var = org.telegram.messenger.qp.s1(s01Var.a).q7;
                    long j10 = -j3;
                    if (!k00Var.e(j10)) {
                        k00Var.o(j10);
                        break;
                    }
                }
                break;
            case 18:
                m11 m11Var = (m11) ((t9) obj).c;
                if (m11Var.l()) {
                    m11Var.m();
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
                ((u21) obj).c.setVisibility(8);
                break;
            case 23:
                ((org.telegram.ui.bk) obj).c.presentFragment(new org.telegram.ui.qy0());
                break;
            case 24:
                ((d31) obj).requestLayout();
                break;
            case 25:
                ((v31) obj).f();
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
                ((s41) obj).invalidateSelf();
                break;
            case 28:
                sy syVar = ((h51) obj).b;
                if (syVar != null) {
                    syVar.c(false, true, false);
                    break;
                }
                break;
            default:
                t51 t51Var = (t51) obj;
                l2.i0 i0Var = t51Var.d;
                if (i0Var != null) {
                    TextureView textureView = t51Var.n;
                    i0Var.F1();
                    if (textureView != null && textureView == i0Var.X) {
                        i0Var.F1();
                        i0Var.s1();
                        i0Var.x1(null);
                        i0Var.q1(0, 0);
                    }
                    t51Var.d.z1(t51Var.n);
                    ArrayList arrayList8 = t51Var.N;
                    if (arrayList8 != null) {
                        t51Var.k0(arrayList8, t51Var.O);
                    } else if (t51Var.U) {
                        t51Var.l0(t51Var.Q, t51Var.S, t51Var.R, t51Var.T);
                    } else {
                        t51Var.j0(t51Var.Q, t51Var.S);
                    }
                    t51Var.h0();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ir0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }
}
