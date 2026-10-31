package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov implements ei.n, ik0, sl0, fe.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ vy b;

    public /* synthetic */ ov(vy vyVar, int i10) {
        this.a = i10;
        this.b = vyVar;
    }

    @Override // org.telegram.ui.Components.sl0
    public void a(int i10) {
        int i11;
        hy hyVar;
        switch (this.a) {
            case 2:
                vy vyVar = this.b;
                ay ayVar = vyVar.i0;
                int i12 = vyVar.c1;
                zx zxVar = vyVar.n0;
                dy dyVar = vyVar.k0;
                if (i10 != vyVar.s0 || !zxVar.y.isEmpty()) {
                    vyVar.h0.C0();
                    vyVar.p0.k(i10, 0);
                    if (i10 == vyVar.r0 || i10 == vyVar.s0) {
                        vyVar.o0.d.setText("");
                        if (i10 != vyVar.s0 || (i11 = zxVar.I) < 1) {
                            vx vxVar = vyVar.t1;
                            ayVar.h1((vxVar == null || !vxVar.A()) ? 1 : 0, 0);
                        } else {
                            ayVar.h1(i11, -org.telegram.messenger.i0.L(4.0f));
                        }
                        if (i10 == vyVar.s0) {
                            ArrayList arrayList = org.telegram.messenger.vp.r1(i12).d4;
                            if (!arrayList.isEmpty()) {
                                dyVar.a((String) arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList arrayList2 = org.telegram.messenger.vp.r1(i12).d4;
                        vyVar.j0.H((String) arrayList2.get(i10 - vyVar.t0));
                        int i13 = i10 - vyVar.t0;
                        if (i13 > 0) {
                            dyVar.a((String) arrayList2.get(i13 - 1), true);
                        }
                        if (i10 - vyVar.t0 < arrayList2.size() - 1) {
                            dyVar.a((String) arrayList2.get((i10 - vyVar.t0) + 1), true);
                        }
                    }
                    vyVar.G(2);
                    break;
                }
                break;
            default:
                vy vyVar2 = this.b;
                fw fwVar = vyVar2.G0;
                ArrayList arrayList3 = vyVar2.d1;
                gw gwVar = vyVar2.B0;
                ny nyVar = vyVar2.y0;
                bw bwVar = vyVar2.D0;
                if (!vyVar2.S0) {
                    if (i10 != vyVar2.H1) {
                        if (fwVar != null && (hyVar = fwVar.r) != null && hyVar.getSelectedCategory() != null) {
                            fwVar.c(null, false);
                            hyVar.I1(null);
                        }
                        if (i10 != vyVar2.F1) {
                            if (i10 != vyVar2.G1) {
                                if (i10 != vyVar2.I1) {
                                    int i14 = i10 - vyVar2.E1;
                                    if (i14 < arrayList3.size()) {
                                        if (i14 >= arrayList3.size()) {
                                            i14 = arrayList3.size() - 1;
                                        }
                                        vyVar2.I0 = false;
                                        bwVar.C0();
                                        vyVar2.I(nyVar.E(arrayList3.get(i14)), 0);
                                        vyVar2.G(0);
                                        vyVar2.p(0);
                                        int i15 = vyVar2.G1;
                                        if (i15 <= 0 && (i15 = vyVar2.F1) <= 0) {
                                            i15 = vyVar2.E1;
                                        }
                                        gwVar.k(i10, i15);
                                        vyVar2.X1 = false;
                                        vyVar2.Z();
                                        break;
                                    }
                                } else {
                                    bwVar.C0();
                                    vyVar2.I(nyVar.E("premium"), 0);
                                    vyVar2.G(0);
                                    int i16 = vyVar2.I1;
                                    gwVar.k(i16, i16 > 0 ? i16 : vyVar2.E1);
                                    break;
                                }
                            } else {
                                bwVar.C0();
                                vyVar2.I(nyVar.E("fav"), 0);
                                vyVar2.G(0);
                                int i17 = vyVar2.G1;
                                gwVar.k(i17, i17 > 0 ? i17 : vyVar2.E1);
                                break;
                            }
                        } else {
                            bwVar.C0();
                            vyVar2.I(nyVar.E("recent"), 0);
                            vyVar2.G(0);
                            int i18 = vyVar2.F1;
                            gwVar.k(i18, i18 > 0 ? i18 : vyVar2.E1);
                            break;
                        }
                    } else {
                        vyVar2.t1.o(new w41(vyVar2.getContext(), new ow(vyVar2), vyVar2.x1, vyVar2.y1, vyVar2.z1, null, vyVar2.Z1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        String str;
        int i11;
        vy vyVar = this.b;
        int i12 = vyVar.C1;
        hx hxVar = vyVar.P;
        int[] iArr = vyVar.D1;
        ju juVar = vyVar.B1;
        if (view instanceof ey) {
            ey eyVar = (ey) view;
            if (eyVar.c) {
                View F = hxVar.F(view);
                s4.c1 T = F != null ? hxVar.T(F) : null;
                if (T != null && T.b() <= vyVar.getRecentEmoji().size()) {
                    vyVar.t1.n();
                }
                hxVar.A1(view);
                return true;
            }
            if (eyVar.getSpan() == null && (str = (String) eyVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = !eyVar.c ? (String) org.telegram.messenger.k6.j.get(replace) : null;
                boolean z10 = org.telegram.messenger.k4.a(replace, null, null) != null;
                if (z10 || org.telegram.messenger.l6.l.contains(replace)) {
                    vyVar.R1 = eyVar;
                    vyVar.U1 = vyVar.S1;
                    vyVar.V1 = vyVar.T1;
                    if (z10) {
                        replace = vy.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.k4.a.indexOf(str2) + 1;
                        iu iuVar = juVar.c;
                        int[] iArr2 = iuVar.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            iuVar.invalidate();
                        }
                    }
                    juVar.getClass();
                    iu iuVar2 = juVar.c;
                    int i13 = juVar.e;
                    boolean z11 = org.telegram.messenger.k4.a(replace, null, null) != null;
                    juVar.d = z11;
                    Drawable[] drawableArr = iuVar2.b;
                    int[] iArr3 = iuVar2.n;
                    iuVar2.f = z11;
                    iuVar2.e = replace;
                    if (z11) {
                        drawableArr[0] = org.telegram.messenger.k4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.k4.a(iuVar2.e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.k4.a(iuVar2.e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.k4.a(iuVar2.e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.k4.a(iuVar2.e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.k4.a(iuVar2.e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.k4.a(iuVar2.e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.k4.a(iuVar2.e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.k4.a(iuVar2.e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.k4.a(iuVar2.e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.k4.a(iuVar2.e, -2, 4);
                        Pair c10 = org.telegram.messenger.k4.c(replace);
                        if (c10 != null) {
                            int intValue = ((Integer) c10.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                iuVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c10.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                iuVar2.invalidate();
                            }
                            iuVar2.G = iArr3[0] == iArr3[1];
                        }
                        iuVar2.I = true;
                    } else {
                        int i14 = 0;
                        while (i14 < 6) {
                            drawableArr[i14] = org.telegram.messenger.k6.f(i14 != 0 ? vy.g(replace, (String) org.telegram.messenger.k4.a.get(i14 - 1)) : replace);
                            i14++;
                        }
                    }
                    iuVar2.invalidate();
                    juVar.setWidth(org.telegram.messenger.i0.L((juVar.d ? 3 : 0) + 30) + (i13 * 6));
                    juVar.setHeight(((juVar.d ? 2 : 1) * i13) + org.telegram.messenger.i0.L(juVar.d ? 11.66f : 15.0f));
                    int L = org.telegram.messenger.i0.L((juVar.d ? 3 : 0) + 30) + (i13 * 6);
                    int L2 = ((juVar.d ? 2 : 1) * i13) + org.telegram.messenger.i0.L(juVar.d ? 11.66f : 15.0f);
                    eyVar.getLocationOnScreen(iArr);
                    if (juVar.d) {
                        i11 = 0;
                    } else {
                        i11 = org.telegram.messenger.i0.L((r3 * 4) - (org.telegram.messenger.i0.Q1() ? 5 : 1)) + (iuVar2.n[0] * i12);
                    }
                    if (iArr[0] - i11 < org.telegram.messenger.i0.L(5.0f)) {
                        i11 = org.telegram.messenger.z20.D(5.0f, iArr[0] - i11, i11);
                    } else {
                        int i15 = (iArr[0] - i11) + L;
                        Point point = org.telegram.messenger.i0.q;
                        if (i15 > point.x - org.telegram.messenger.i0.L(5.0f)) {
                            i11 += ((iArr[0] - i11) + L) - (point.x - org.telegram.messenger.i0.L(5.0f));
                        }
                    }
                    int i16 = -i11;
                    int top = eyVar.getTop() < 0 ? eyVar.getTop() : 0;
                    iuVar2.setArrowX((org.telegram.messenger.i0.L(org.telegram.messenger.i0.Q1() ? 30.0f : 22.0f) - i16) + ((int) org.telegram.messenger.i0.N(0.5f)));
                    juVar.setFocusable(true);
                    juVar.showAsDropDown(view, i16, (((view.getMeasuredHeight() - i12) / 2) + ((-view.getMeasuredHeight()) - L2)) - top);
                    vyVar.h.requestDisallowInterceptTouchEvent(true);
                    hxVar.d1(true);
                    hxVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ei.n
    public void j(int i10) {
        vy vyVar = this.b;
        tg.f fVar = vyVar.j2;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (v7.u7.a(i10, 4)) {
            fVar.h(vyVar.n2.e());
        }
        fVar.e(vyVar.k2, vyVar.getWidth(), vyVar.getHeight());
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.b.S();
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }
}
