package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements ri.m, sj0, el0, te.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ nv(qy qyVar, int i7) {
        this.a = i7;
        this.b = qyVar;
    }

    @Override // te.b
    public void K(int i7, float f10, float f11, te.c cVar) {
        this.b.S();
    }

    @Override // org.telegram.ui.Components.el0
    public void a(int i7) {
        int i10;
        cy cyVar;
        switch (this.a) {
            case 2:
                qy qyVar = this.b;
                vx vxVar = qyVar.j0;
                int i11 = qyVar.d1;
                ux uxVar = qyVar.o0;
                xx xxVar = qyVar.l0;
                if (i7 != qyVar.t0 || !uxVar.y.isEmpty()) {
                    qyVar.i0.C0();
                    qyVar.q0.k(i7, 0);
                    if (i7 == qyVar.s0 || i7 == qyVar.t0) {
                        qyVar.p0.d.setText("");
                        if (i7 != qyVar.t0 || (i10 = uxVar.J) < 1) {
                            qx qxVar = qyVar.u1;
                            vxVar.h1((qxVar == null || !qxVar.A()) ? 1 : 0, 0);
                        } else {
                            vxVar.h1(i10, -org.telegram.messenger.g0.L(4.0f));
                        }
                        if (i7 == qyVar.t0) {
                            ArrayList arrayList = org.telegram.messenger.mp.u1(i11).e4;
                            if (!arrayList.isEmpty()) {
                                xxVar.a((String) arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList arrayList2 = org.telegram.messenger.mp.u1(i11).e4;
                        qyVar.k0.H((String) arrayList2.get(i7 - qyVar.u0));
                        int i12 = i7 - qyVar.u0;
                        if (i12 > 0) {
                            xxVar.a((String) arrayList2.get(i12 - 1), true);
                        }
                        if (i7 - qyVar.u0 < arrayList2.size() - 1) {
                            xxVar.a((String) arrayList2.get((i7 - qyVar.u0) + 1), true);
                        }
                    }
                    qyVar.E(2);
                    break;
                }
                break;
            default:
                qy qyVar2 = this.b;
                dw dwVar = qyVar2.H0;
                ArrayList arrayList3 = qyVar2.e1;
                ew ewVar = qyVar2.C0;
                iy iyVar = qyVar2.z0;
                aw awVar = qyVar2.E0;
                if (!qyVar2.T0) {
                    if (i7 != qyVar2.I1) {
                        if (dwVar != null && (cyVar = dwVar.r) != null && cyVar.getSelectedCategory() != null) {
                            dwVar.c(null, false);
                            cyVar.I1(null);
                        }
                        if (i7 != qyVar2.G1) {
                            if (i7 != qyVar2.H1) {
                                if (i7 != qyVar2.J1) {
                                    int i13 = i7 - qyVar2.F1;
                                    if (i13 < arrayList3.size()) {
                                        if (i13 >= arrayList3.size()) {
                                            i13 = arrayList3.size() - 1;
                                        }
                                        qyVar2.J0 = false;
                                        awVar.C0();
                                        qyVar2.H(iyVar.E(arrayList3.get(i13)), 0);
                                        qyVar2.E(0);
                                        qyVar2.p(0);
                                        int i14 = qyVar2.H1;
                                        if (i14 <= 0 && (i14 = qyVar2.G1) <= 0) {
                                            i14 = qyVar2.F1;
                                        }
                                        ewVar.k(i7, i14);
                                        qyVar2.Y1 = false;
                                        qyVar2.Z();
                                        break;
                                    }
                                } else {
                                    awVar.C0();
                                    qyVar2.H(iyVar.E("premium"), 0);
                                    qyVar2.E(0);
                                    int i15 = qyVar2.J1;
                                    ewVar.k(i15, i15 > 0 ? i15 : qyVar2.F1);
                                    break;
                                }
                            } else {
                                awVar.C0();
                                qyVar2.H(iyVar.E("fav"), 0);
                                qyVar2.E(0);
                                int i16 = qyVar2.H1;
                                ewVar.k(i16, i16 > 0 ? i16 : qyVar2.F1);
                                break;
                            }
                        } else {
                            awVar.C0();
                            qyVar2.H(iyVar.E("recent"), 0);
                            qyVar2.E(0);
                            int i17 = qyVar2.G1;
                            ewVar.k(i17, i17 > 0 ? i17 : qyVar2.F1);
                            break;
                        }
                    } else {
                        qyVar2.u1.o(new j41(qyVar2.getContext(), new lw(qyVar2), qyVar2.y1, qyVar2.z1, qyVar2.A1, null, qyVar2.a2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        String str;
        int i10;
        qy qyVar = this.b;
        int i11 = qyVar.D1;
        dx dxVar = qyVar.Q;
        int[] iArr = qyVar.E1;
        iu iuVar = qyVar.C1;
        if (view instanceof yx) {
            yx yxVar = (yx) view;
            if (yxVar.c) {
                View F = dxVar.F(view);
                v4.f1 T = F != null ? dxVar.T(F) : null;
                if (T != null && T.b() <= qyVar.getRecentEmoji().size()) {
                    qyVar.u1.n();
                }
                dxVar.A1(view);
                return true;
            }
            if (yxVar.getSpan() == null && (str = (String) yxVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = !yxVar.c ? (String) org.telegram.messenger.j6.j.get(replace) : null;
                boolean z10 = org.telegram.messenger.j4.a(replace, null, null) != null;
                if (z10 || org.telegram.messenger.k6.l.contains(replace)) {
                    qyVar.S1 = yxVar;
                    qyVar.V1 = qyVar.T1;
                    qyVar.W1 = qyVar.U1;
                    if (z10) {
                        replace = qy.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.j4.a.indexOf(str2) + 1;
                        hu huVar = iuVar.c;
                        int[] iArr2 = huVar.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            huVar.invalidate();
                        }
                    }
                    iuVar.getClass();
                    hu huVar2 = iuVar.c;
                    int i12 = iuVar.e;
                    boolean z11 = org.telegram.messenger.j4.a(replace, null, null) != null;
                    iuVar.d = z11;
                    Drawable[] drawableArr = huVar2.b;
                    int[] iArr3 = huVar2.n;
                    huVar2.f = z11;
                    huVar2.e = replace;
                    if (z11) {
                        drawableArr[0] = org.telegram.messenger.j4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.j4.a(huVar2.e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.j4.a(huVar2.e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.j4.a(huVar2.e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.j4.a(huVar2.e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.j4.a(huVar2.e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.j4.a(huVar2.e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.j4.a(huVar2.e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.j4.a(huVar2.e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.j4.a(huVar2.e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.j4.a(huVar2.e, -2, 4);
                        Pair c10 = org.telegram.messenger.j4.c(replace);
                        if (c10 != null) {
                            int intValue = ((Integer) c10.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                huVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c10.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                huVar2.invalidate();
                            }
                            huVar2.H = iArr3[0] == iArr3[1];
                        }
                        huVar2.J = true;
                    } else {
                        int i13 = 0;
                        while (i13 < 6) {
                            drawableArr[i13] = org.telegram.messenger.j6.f(i13 != 0 ? qy.g(replace, (String) org.telegram.messenger.j4.a.get(i13 - 1)) : replace);
                            i13++;
                        }
                    }
                    huVar2.invalidate();
                    iuVar.setWidth(org.telegram.messenger.g0.L((iuVar.d ? 3 : 0) + 30) + (i12 * 6));
                    iuVar.setHeight(((iuVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(iuVar.d ? 11.66f : 15.0f));
                    int L = org.telegram.messenger.g0.L((iuVar.d ? 3 : 0) + 30) + (i12 * 6);
                    int L2 = ((iuVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(iuVar.d ? 11.66f : 15.0f);
                    yxVar.getLocationOnScreen(iArr);
                    if (iuVar.d) {
                        i10 = 0;
                    } else {
                        i10 = org.telegram.messenger.g0.L((r3 * 4) - (org.telegram.messenger.g0.Q1() ? 5 : 1)) + (huVar2.n[0] * i11);
                    }
                    if (iArr[0] - i10 < org.telegram.messenger.g0.L(5.0f)) {
                        i10 = org.telegram.ui.Cells.c0.i(5.0f, iArr[0] - i10, i10);
                    } else {
                        int i14 = (iArr[0] - i10) + L;
                        Point point = org.telegram.messenger.g0.q;
                        if (i14 > point.x - org.telegram.messenger.g0.L(5.0f)) {
                            i10 += ((iArr[0] - i10) + L) - (point.x - org.telegram.messenger.g0.L(5.0f));
                        }
                    }
                    int i15 = -i10;
                    int top = yxVar.getTop() < 0 ? yxVar.getTop() : 0;
                    huVar2.setArrowX((org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 30.0f : 22.0f) - i15) + ((int) org.telegram.messenger.g0.N(0.5f)));
                    iuVar.setFocusable(true);
                    iuVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i11) / 2) + ((-view.getMeasuredHeight()) - L2)) - top);
                    qyVar.h.requestDisallowInterceptTouchEvent(true);
                    dxVar.d1(true);
                    dxVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ri.m
    public void k(int i7) {
        qy qyVar = this.b;
        dh.g gVar = qyVar.k2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.ed.a(i7, 4)) {
            gVar.h(qyVar.o2.e());
        }
        gVar.e(qyVar.l2, qyVar.getWidth(), qyVar.getHeight());
    }

    @Override // te.b
    public /* synthetic */ void G(float f10, int i7) {
    }
}
