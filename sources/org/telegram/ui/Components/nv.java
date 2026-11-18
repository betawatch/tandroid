package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements ri.m, qj0, cl0, te.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ nv(ry ryVar, int i7) {
        this.a = i7;
        this.b = ryVar;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.b.S();
    }

    @Override // org.telegram.ui.Components.cl0
    public void a(int i7) {
        int i10;
        dy dyVar;
        switch (this.a) {
            case 2:
                ry ryVar = this.b;
                wx wxVar = ryVar.j0;
                int i11 = ryVar.d1;
                vx vxVar = ryVar.o0;
                yx yxVar = ryVar.l0;
                if (i7 != ryVar.t0 || !vxVar.y.isEmpty()) {
                    ryVar.i0.C0();
                    ryVar.q0.k(i7, 0);
                    if (i7 == ryVar.s0 || i7 == ryVar.t0) {
                        ryVar.p0.d.setText("");
                        if (i7 != ryVar.t0 || (i10 = vxVar.J) < 1) {
                            rx rxVar = ryVar.u1;
                            wxVar.h1((rxVar == null || !rxVar.A()) ? 1 : 0, 0);
                        } else {
                            wxVar.h1(i10, -org.telegram.messenger.g0.L(4.0f));
                        }
                        if (i7 == ryVar.t0) {
                            ArrayList arrayList = org.telegram.messenger.mp.u1(i11).e4;
                            if (!arrayList.isEmpty()) {
                                yxVar.a((String) arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList arrayList2 = org.telegram.messenger.mp.u1(i11).e4;
                        ryVar.k0.H((String) arrayList2.get(i7 - ryVar.u0));
                        int i12 = i7 - ryVar.u0;
                        if (i12 > 0) {
                            yxVar.a((String) arrayList2.get(i12 - 1), true);
                        }
                        if (i7 - ryVar.u0 < arrayList2.size() - 1) {
                            yxVar.a((String) arrayList2.get((i7 - ryVar.u0) + 1), true);
                        }
                    }
                    ryVar.F(2);
                    break;
                }
                break;
            default:
                ry ryVar2 = this.b;
                ew ewVar = ryVar2.H0;
                ArrayList arrayList3 = ryVar2.e1;
                fw fwVar = ryVar2.C0;
                jy jyVar = ryVar2.z0;
                aw awVar = ryVar2.E0;
                if (!ryVar2.T0) {
                    if (i7 != ryVar2.I1) {
                        if (ewVar != null && (dyVar = ewVar.r) != null && dyVar.getSelectedCategory() != null) {
                            ewVar.c(null, false);
                            dyVar.I1(null);
                        }
                        if (i7 != ryVar2.G1) {
                            if (i7 != ryVar2.H1) {
                                if (i7 != ryVar2.J1) {
                                    int i13 = i7 - ryVar2.F1;
                                    if (i13 < arrayList3.size()) {
                                        if (i13 >= arrayList3.size()) {
                                            i13 = arrayList3.size() - 1;
                                        }
                                        ryVar2.J0 = false;
                                        awVar.C0();
                                        ryVar2.I(jyVar.E(arrayList3.get(i13)), 0);
                                        ryVar2.F(0);
                                        ryVar2.p(0);
                                        int i14 = ryVar2.H1;
                                        if (i14 <= 0 && (i14 = ryVar2.G1) <= 0) {
                                            i14 = ryVar2.F1;
                                        }
                                        fwVar.k(i7, i14);
                                        ryVar2.Y1 = false;
                                        ryVar2.Z();
                                        break;
                                    }
                                } else {
                                    awVar.C0();
                                    ryVar2.I(jyVar.E("premium"), 0);
                                    ryVar2.F(0);
                                    int i15 = ryVar2.J1;
                                    fwVar.k(i15, i15 > 0 ? i15 : ryVar2.F1);
                                    break;
                                }
                            } else {
                                awVar.C0();
                                ryVar2.I(jyVar.E("fav"), 0);
                                ryVar2.F(0);
                                int i16 = ryVar2.H1;
                                fwVar.k(i16, i16 > 0 ? i16 : ryVar2.F1);
                                break;
                            }
                        } else {
                            awVar.C0();
                            ryVar2.I(jyVar.E("recent"), 0);
                            ryVar2.F(0);
                            int i17 = ryVar2.G1;
                            fwVar.k(i17, i17 > 0 ? i17 : ryVar2.F1);
                            break;
                        }
                    } else {
                        ryVar2.u1.o(new h41(ryVar2.getContext(), new mw(ryVar2), ryVar2.y1, ryVar2.z1, ryVar2.A1, null, ryVar2.a2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        String str;
        int i10;
        ry ryVar = this.b;
        int i11 = ryVar.D1;
        ex exVar = ryVar.Q;
        int[] iArr = ryVar.E1;
        iu iuVar = ryVar.C1;
        if (view instanceof zx) {
            zx zxVar = (zx) view;
            if (zxVar.c) {
                View F = exVar.F(view);
                v4.f1 T = F != null ? exVar.T(F) : null;
                if (T != null && T.b() <= ryVar.getRecentEmoji().size()) {
                    ryVar.u1.n();
                }
                exVar.A1(view);
                return true;
            }
            if (zxVar.getSpan() == null && (str = (String) zxVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = !zxVar.c ? (String) org.telegram.messenger.j6.j.get(replace) : null;
                boolean z10 = org.telegram.messenger.j4.a(replace, null, null) != null;
                if (z10 || org.telegram.messenger.k6.l.contains(replace)) {
                    ryVar.S1 = zxVar;
                    ryVar.V1 = ryVar.T1;
                    ryVar.W1 = ryVar.U1;
                    if (z10) {
                        replace = ry.g(replace, str2);
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
                            drawableArr[i13] = org.telegram.messenger.j6.f(i13 != 0 ? ry.g(replace, (String) org.telegram.messenger.j4.a.get(i13 - 1)) : replace);
                            i13++;
                        }
                    }
                    huVar2.invalidate();
                    iuVar.setWidth(org.telegram.messenger.g0.L((iuVar.d ? 3 : 0) + 30) + (i12 * 6));
                    iuVar.setHeight(((iuVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(iuVar.d ? 11.66f : 15.0f));
                    int L = org.telegram.messenger.g0.L((iuVar.d ? 3 : 0) + 30) + (i12 * 6);
                    int L2 = ((iuVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(iuVar.d ? 11.66f : 15.0f);
                    zxVar.getLocationOnScreen(iArr);
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
                    int top = zxVar.getTop() < 0 ? zxVar.getTop() : 0;
                    huVar2.setArrowX((org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 30.0f : 22.0f) - i15) + ((int) org.telegram.messenger.g0.N(0.5f)));
                    iuVar.setFocusable(true);
                    iuVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i11) / 2) + ((-view.getMeasuredHeight()) - L2)) - top);
                    ryVar.h.requestDisallowInterceptTouchEvent(true);
                    exVar.d1(true);
                    exVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ri.m
    public void l(int i7) {
        ry ryVar = this.b;
        dh.g gVar = ryVar.k2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.dd.a(i7, 4)) {
            gVar.h(ryVar.o2.e());
        }
        gVar.e(ryVar.l2, ryVar.getWidth(), ryVar.getHeight());
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }
}
