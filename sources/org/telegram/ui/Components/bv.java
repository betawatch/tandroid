package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bv implements pi.m, hj0, tk0, qe.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ bv(ey eyVar, int i3) {
        this.a = i3;
        this.b = eyVar;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        this.b.R();
    }

    @Override // org.telegram.ui.Components.tk0
    public void a(int i3) {
        int i10;
        qx qxVar;
        switch (this.a) {
            case 2:
                ey eyVar = this.b;
                kx kxVar = eyVar.j0;
                int i11 = eyVar.d1;
                jx jxVar = eyVar.o0;
                mx mxVar = eyVar.l0;
                if (i3 != eyVar.t0 || !jxVar.y.isEmpty()) {
                    eyVar.i0.C0();
                    eyVar.q0.k(i3, 0);
                    if (i3 == eyVar.s0 || i3 == eyVar.t0) {
                        eyVar.p0.d.setText("");
                        if (i3 != eyVar.t0 || (i10 = jxVar.J) < 1) {
                            fx fxVar = eyVar.u1;
                            kxVar.h1((fxVar == null || !fxVar.A()) ? 1 : 0, 0);
                        } else {
                            kxVar.h1(i10, -org.telegram.messenger.g0.L(4.0f));
                        }
                        if (i3 == eyVar.t0) {
                            ArrayList arrayList = org.telegram.messenger.hp.s1(i11).c4;
                            if (!arrayList.isEmpty()) {
                                mxVar.a((String) arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList arrayList2 = org.telegram.messenger.hp.s1(i11).c4;
                        eyVar.k0.H((String) arrayList2.get(i3 - eyVar.u0));
                        int i12 = i3 - eyVar.u0;
                        if (i12 > 0) {
                            mxVar.a((String) arrayList2.get(i12 - 1), true);
                        }
                        if (i3 - eyVar.u0 < arrayList2.size() - 1) {
                            mxVar.a((String) arrayList2.get((i3 - eyVar.u0) + 1), true);
                        }
                    }
                    eyVar.E(2);
                    break;
                }
                break;
            default:
                ey eyVar2 = this.b;
                rv rvVar = eyVar2.H0;
                ArrayList arrayList3 = eyVar2.e1;
                sv svVar = eyVar2.C0;
                vx vxVar = eyVar2.z0;
                ov ovVar = eyVar2.E0;
                if (!eyVar2.T0) {
                    if (i3 != eyVar2.I1) {
                        if (rvVar != null && (qxVar = rvVar.r) != null && qxVar.getSelectedCategory() != null) {
                            rvVar.c(null, false);
                            qxVar.I1(null);
                        }
                        if (i3 != eyVar2.G1) {
                            if (i3 != eyVar2.H1) {
                                if (i3 != eyVar2.J1) {
                                    int i13 = i3 - eyVar2.F1;
                                    if (i13 < arrayList3.size()) {
                                        if (i13 >= arrayList3.size()) {
                                            i13 = arrayList3.size() - 1;
                                        }
                                        eyVar2.J0 = false;
                                        ovVar.C0();
                                        eyVar2.H(vxVar.E(arrayList3.get(i13)), 0);
                                        eyVar2.E(0);
                                        eyVar2.p(0);
                                        int i14 = eyVar2.H1;
                                        if (i14 <= 0 && (i14 = eyVar2.G1) <= 0) {
                                            i14 = eyVar2.F1;
                                        }
                                        svVar.k(i3, i14);
                                        eyVar2.Y1 = false;
                                        eyVar2.Z();
                                        break;
                                    }
                                } else {
                                    ovVar.C0();
                                    eyVar2.H(vxVar.E("premium"), 0);
                                    eyVar2.E(0);
                                    int i15 = eyVar2.J1;
                                    svVar.k(i15, i15 > 0 ? i15 : eyVar2.F1);
                                    break;
                                }
                            } else {
                                ovVar.C0();
                                eyVar2.H(vxVar.E("fav"), 0);
                                eyVar2.E(0);
                                int i16 = eyVar2.H1;
                                svVar.k(i16, i16 > 0 ? i16 : eyVar2.F1);
                                break;
                            }
                        } else {
                            ovVar.C0();
                            eyVar2.H(vxVar.E("recent"), 0);
                            eyVar2.E(0);
                            int i17 = eyVar2.G1;
                            svVar.k(i17, i17 > 0 ? i17 : eyVar2.F1);
                            break;
                        }
                    } else {
                        eyVar2.u1.o(new n31(eyVar2.getContext(), new zv(eyVar2), eyVar2.y1, eyVar2.z1, eyVar2.A1, null, eyVar2.a2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        String str;
        int i10;
        ey eyVar = this.b;
        int i11 = eyVar.D1;
        rw rwVar = eyVar.Q;
        int[] iArr = eyVar.E1;
        wt wtVar = eyVar.C1;
        if (view instanceof nx) {
            nx nxVar = (nx) view;
            if (nxVar.c) {
                View F = rwVar.F(view);
                u4.d1 T = F != null ? rwVar.T(F) : null;
                if (T != null && T.b() <= eyVar.getRecentEmoji().size()) {
                    eyVar.u1.n();
                }
                rwVar.A1(view);
                return true;
            }
            if (nxVar.getSpan() == null && (str = (String) nxVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = !nxVar.c ? (String) org.telegram.messenger.i6.j.get(replace) : null;
                boolean z10 = org.telegram.messenger.h4.a(replace, null, null) != null;
                if (z10 || org.telegram.messenger.j6.l.contains(replace)) {
                    eyVar.S1 = nxVar;
                    eyVar.V1 = eyVar.T1;
                    eyVar.W1 = eyVar.U1;
                    if (z10) {
                        replace = ey.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.h4.a.indexOf(str2) + 1;
                        vt vtVar = wtVar.c;
                        int[] iArr2 = vtVar.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            vtVar.invalidate();
                        }
                    }
                    wtVar.getClass();
                    vt vtVar2 = wtVar.c;
                    int i12 = wtVar.e;
                    boolean z11 = org.telegram.messenger.h4.a(replace, null, null) != null;
                    wtVar.d = z11;
                    Drawable[] drawableArr = vtVar2.b;
                    int[] iArr3 = vtVar2.n;
                    vtVar2.f = z11;
                    vtVar2.e = replace;
                    if (z11) {
                        drawableArr[0] = org.telegram.messenger.h4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.h4.a(vtVar2.e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.h4.a(vtVar2.e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.h4.a(vtVar2.e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.h4.a(vtVar2.e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.h4.a(vtVar2.e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.h4.a(vtVar2.e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.h4.a(vtVar2.e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.h4.a(vtVar2.e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.h4.a(vtVar2.e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.h4.a(vtVar2.e, -2, 4);
                        Pair c2 = org.telegram.messenger.h4.c(replace);
                        if (c2 != null) {
                            int intValue = ((Integer) c2.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                vtVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c2.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                vtVar2.invalidate();
                            }
                            vtVar2.H = iArr3[0] == iArr3[1];
                        }
                        vtVar2.J = true;
                    } else {
                        int i13 = 0;
                        while (i13 < 6) {
                            drawableArr[i13] = org.telegram.messenger.i6.f(i13 != 0 ? ey.g(replace, (String) org.telegram.messenger.h4.a.get(i13 - 1)) : replace);
                            i13++;
                        }
                    }
                    vtVar2.invalidate();
                    wtVar.setWidth(org.telegram.messenger.g0.L((wtVar.d ? 3 : 0) + 30) + (i12 * 6));
                    wtVar.setHeight(((wtVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(wtVar.d ? 11.66f : 15.0f));
                    int L = org.telegram.messenger.g0.L((wtVar.d ? 3 : 0) + 30) + (i12 * 6);
                    int L2 = ((wtVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(wtVar.d ? 11.66f : 15.0f);
                    nxVar.getLocationOnScreen(iArr);
                    if (wtVar.d) {
                        i10 = 0;
                    } else {
                        i10 = org.telegram.messenger.g0.L((r3 * 4) - (org.telegram.messenger.g0.Q1() ? 5 : 1)) + (vtVar2.n[0] * i11);
                    }
                    if (iArr[0] - i10 < org.telegram.messenger.g0.L(5.0f)) {
                        i10 = org.telegram.messenger.camera.q.D(5.0f, iArr[0] - i10, i10);
                    } else {
                        int i14 = (iArr[0] - i10) + L;
                        Point point = org.telegram.messenger.g0.q;
                        if (i14 > point.x - org.telegram.messenger.g0.L(5.0f)) {
                            i10 += ((iArr[0] - i10) + L) - (point.x - org.telegram.messenger.g0.L(5.0f));
                        }
                    }
                    int i15 = -i10;
                    int top = nxVar.getTop() < 0 ? nxVar.getTop() : 0;
                    vtVar2.setArrowX((org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 30.0f : 22.0f) - i15) + ((int) org.telegram.messenger.g0.N(0.5f)));
                    wtVar.setFocusable(true);
                    wtVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i11) / 2) + ((-view.getMeasuredHeight()) - L2)) - top);
                    eyVar.h.requestDisallowInterceptTouchEvent(true);
                    rwVar.d1(true);
                    rwVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // pi.m
    public void l(int i3) {
        ey eyVar = this.b;
        eh.g gVar = eyVar.k2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (x7.u.a(i3, 4)) {
            gVar.h(eyVar.o2.e());
        }
        gVar.e(eyVar.l2, eyVar.getWidth(), eyVar.getHeight());
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
    }
}
