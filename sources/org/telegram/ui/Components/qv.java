package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv implements ri.m, sj0, el0, te.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;

    public /* synthetic */ qv(ty tyVar, int i7) {
        this.a = i7;
        this.b = tyVar;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.b.S();
    }

    @Override // org.telegram.ui.Components.el0
    public void a(int i7) {
        int i10;
        fy fyVar;
        switch (this.a) {
            case 2:
                ty tyVar = this.b;
                yx yxVar = tyVar.j0;
                int i11 = tyVar.d1;
                xx xxVar = tyVar.o0;
                ay ayVar = tyVar.l0;
                if (i7 != tyVar.t0 || !xxVar.y.isEmpty()) {
                    tyVar.i0.C0();
                    tyVar.q0.k(i7, 0);
                    if (i7 == tyVar.s0 || i7 == tyVar.t0) {
                        tyVar.p0.d.setText("");
                        if (i7 != tyVar.t0 || (i10 = xxVar.J) < 1) {
                            tx txVar = tyVar.u1;
                            yxVar.h1((txVar == null || !txVar.A()) ? 1 : 0, 0);
                        } else {
                            yxVar.h1(i10, -org.telegram.messenger.g0.L(4.0f));
                        }
                        if (i7 == tyVar.t0) {
                            ArrayList arrayList = org.telegram.messenger.np.u1(i11).e4;
                            if (!arrayList.isEmpty()) {
                                ayVar.a((String) arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList arrayList2 = org.telegram.messenger.np.u1(i11).e4;
                        tyVar.k0.H((String) arrayList2.get(i7 - tyVar.u0));
                        int i12 = i7 - tyVar.u0;
                        if (i12 > 0) {
                            ayVar.a((String) arrayList2.get(i12 - 1), true);
                        }
                        if (i7 - tyVar.u0 < arrayList2.size() - 1) {
                            ayVar.a((String) arrayList2.get((i7 - tyVar.u0) + 1), true);
                        }
                    }
                    tyVar.F(2);
                    break;
                }
                break;
            default:
                ty tyVar2 = this.b;
                gw gwVar = tyVar2.H0;
                ArrayList arrayList3 = tyVar2.e1;
                hw hwVar = tyVar2.C0;
                ly lyVar = tyVar2.z0;
                dw dwVar = tyVar2.E0;
                if (!tyVar2.T0) {
                    if (i7 != tyVar2.I1) {
                        if (gwVar != null && (fyVar = gwVar.r) != null && fyVar.getSelectedCategory() != null) {
                            gwVar.c(null, false);
                            fyVar.I1(null);
                        }
                        if (i7 != tyVar2.G1) {
                            if (i7 != tyVar2.H1) {
                                if (i7 != tyVar2.J1) {
                                    int i13 = i7 - tyVar2.F1;
                                    if (i13 < arrayList3.size()) {
                                        if (i13 >= arrayList3.size()) {
                                            i13 = arrayList3.size() - 1;
                                        }
                                        tyVar2.J0 = false;
                                        dwVar.C0();
                                        tyVar2.I(lyVar.E(arrayList3.get(i13)), 0);
                                        tyVar2.F(0);
                                        tyVar2.p(0);
                                        int i14 = tyVar2.H1;
                                        if (i14 <= 0 && (i14 = tyVar2.G1) <= 0) {
                                            i14 = tyVar2.F1;
                                        }
                                        hwVar.k(i7, i14);
                                        tyVar2.Y1 = false;
                                        tyVar2.Z();
                                        break;
                                    }
                                } else {
                                    dwVar.C0();
                                    tyVar2.I(lyVar.E("premium"), 0);
                                    tyVar2.F(0);
                                    int i15 = tyVar2.J1;
                                    hwVar.k(i15, i15 > 0 ? i15 : tyVar2.F1);
                                    break;
                                }
                            } else {
                                dwVar.C0();
                                tyVar2.I(lyVar.E("fav"), 0);
                                tyVar2.F(0);
                                int i16 = tyVar2.H1;
                                hwVar.k(i16, i16 > 0 ? i16 : tyVar2.F1);
                                break;
                            }
                        } else {
                            dwVar.C0();
                            tyVar2.I(lyVar.E("recent"), 0);
                            tyVar2.F(0);
                            int i17 = tyVar2.G1;
                            hwVar.k(i17, i17 > 0 ? i17 : tyVar2.F1);
                            break;
                        }
                    } else {
                        tyVar2.u1.o(new k41(tyVar2.getContext(), new ow(tyVar2), tyVar2.y1, tyVar2.z1, tyVar2.A1, null, tyVar2.a2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        String str;
        int i10;
        ty tyVar = this.b;
        int i11 = tyVar.D1;
        gx gxVar = tyVar.Q;
        int[] iArr = tyVar.E1;
        ku kuVar = tyVar.C1;
        if (view instanceof cy) {
            cy cyVar = (cy) view;
            if (cyVar.c) {
                View F = gxVar.F(view);
                v4.f1 T = F != null ? gxVar.T(F) : null;
                if (T != null && T.b() <= tyVar.getRecentEmoji().size()) {
                    tyVar.u1.n();
                }
                gxVar.A1(view);
                return true;
            }
            if (cyVar.getSpan() == null && (str = (String) cyVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = !cyVar.c ? (String) org.telegram.messenger.j6.j.get(replace) : null;
                boolean z10 = org.telegram.messenger.j4.a(replace, null, null) != null;
                if (z10 || org.telegram.messenger.k6.l.contains(replace)) {
                    tyVar.S1 = cyVar;
                    tyVar.V1 = tyVar.T1;
                    tyVar.W1 = tyVar.U1;
                    if (z10) {
                        replace = ty.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.j4.a.indexOf(str2) + 1;
                        ju juVar = kuVar.c;
                        int[] iArr2 = juVar.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            juVar.invalidate();
                        }
                    }
                    kuVar.getClass();
                    ju juVar2 = kuVar.c;
                    int i12 = kuVar.e;
                    boolean z11 = org.telegram.messenger.j4.a(replace, null, null) != null;
                    kuVar.d = z11;
                    Drawable[] drawableArr = juVar2.b;
                    int[] iArr3 = juVar2.n;
                    juVar2.f = z11;
                    juVar2.e = replace;
                    if (z11) {
                        drawableArr[0] = org.telegram.messenger.j4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.j4.a(juVar2.e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.j4.a(juVar2.e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.j4.a(juVar2.e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.j4.a(juVar2.e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.j4.a(juVar2.e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.j4.a(juVar2.e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.j4.a(juVar2.e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.j4.a(juVar2.e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.j4.a(juVar2.e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.j4.a(juVar2.e, -2, 4);
                        Pair c10 = org.telegram.messenger.j4.c(replace);
                        if (c10 != null) {
                            int intValue = ((Integer) c10.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                juVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c10.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                juVar2.invalidate();
                            }
                            juVar2.H = iArr3[0] == iArr3[1];
                        }
                        juVar2.J = true;
                    } else {
                        int i13 = 0;
                        while (i13 < 6) {
                            drawableArr[i13] = org.telegram.messenger.j6.f(i13 != 0 ? ty.g(replace, (String) org.telegram.messenger.j4.a.get(i13 - 1)) : replace);
                            i13++;
                        }
                    }
                    juVar2.invalidate();
                    kuVar.setWidth(org.telegram.messenger.g0.L((kuVar.d ? 3 : 0) + 30) + (i12 * 6));
                    kuVar.setHeight(((kuVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(kuVar.d ? 11.66f : 15.0f));
                    int L = org.telegram.messenger.g0.L((kuVar.d ? 3 : 0) + 30) + (i12 * 6);
                    int L2 = ((kuVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(kuVar.d ? 11.66f : 15.0f);
                    cyVar.getLocationOnScreen(iArr);
                    if (kuVar.d) {
                        i10 = 0;
                    } else {
                        i10 = org.telegram.messenger.g0.L((r3 * 4) - (org.telegram.messenger.g0.Q1() ? 5 : 1)) + (juVar2.n[0] * i11);
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
                    int top = cyVar.getTop() < 0 ? cyVar.getTop() : 0;
                    juVar2.setArrowX((org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 30.0f : 22.0f) - i15) + ((int) org.telegram.messenger.g0.N(0.5f)));
                    kuVar.setFocusable(true);
                    kuVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i11) / 2) + ((-view.getMeasuredHeight()) - L2)) - top);
                    tyVar.h.requestDisallowInterceptTouchEvent(true);
                    gxVar.d1(true);
                    gxVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ri.m
    public void l(int i7) {
        ty tyVar = this.b;
        dh.g gVar = tyVar.k2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.dd.a(i7, 4)) {
            gVar.h(tyVar.o2.e());
        }
        gVar.e(tyVar.l2, tyVar.getWidth(), tyVar.getHeight());
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }
}
