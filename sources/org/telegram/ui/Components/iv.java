package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv implements ri.m, ij0, uk0, te.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ ly b;

    public /* synthetic */ iv(ly lyVar, int i7) {
        this.a = i7;
        this.b = lyVar;
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        this.b.S();
    }

    @Override // org.telegram.ui.Components.uk0
    public void a(int i7) {
        int i10;
        xx xxVar;
        switch (this.a) {
            case 2:
                ly lyVar = this.b;
                rx rxVar = lyVar.j0;
                int i11 = lyVar.d1;
                qx qxVar = lyVar.o0;
                tx txVar = lyVar.l0;
                if (i7 != lyVar.t0 || !qxVar.y.isEmpty()) {
                    lyVar.i0.C0();
                    lyVar.q0.k(i7, 0);
                    if (i7 == lyVar.s0 || i7 == lyVar.t0) {
                        lyVar.p0.d.setText("");
                        if (i7 != lyVar.t0 || (i10 = qxVar.J) < 1) {
                            mx mxVar = lyVar.u1;
                            rxVar.h1((mxVar == null || !mxVar.A()) ? 1 : 0, 0);
                        } else {
                            rxVar.h1(i10, -org.telegram.messenger.g0.L(4.0f));
                        }
                        if (i7 == lyVar.t0) {
                            ArrayList arrayList = org.telegram.messenger.np.s1(i11).c4;
                            if (!arrayList.isEmpty()) {
                                txVar.a((String) arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList arrayList2 = org.telegram.messenger.np.s1(i11).c4;
                        lyVar.k0.H((String) arrayList2.get(i7 - lyVar.u0));
                        int i12 = i7 - lyVar.u0;
                        if (i12 > 0) {
                            txVar.a((String) arrayList2.get(i12 - 1), true);
                        }
                        if (i7 - lyVar.u0 < arrayList2.size() - 1) {
                            txVar.a((String) arrayList2.get((i7 - lyVar.u0) + 1), true);
                        }
                    }
                    lyVar.F(2);
                    break;
                }
                break;
            default:
                ly lyVar2 = this.b;
                yv yvVar = lyVar2.H0;
                ArrayList arrayList3 = lyVar2.e1;
                zv zvVar = lyVar2.C0;
                dy dyVar = lyVar2.z0;
                vv vvVar = lyVar2.E0;
                if (!lyVar2.T0) {
                    if (i7 != lyVar2.I1) {
                        if (yvVar != null && (xxVar = yvVar.r) != null && xxVar.getSelectedCategory() != null) {
                            yvVar.c(null, false);
                            xxVar.I1(null);
                        }
                        if (i7 != lyVar2.G1) {
                            if (i7 != lyVar2.H1) {
                                if (i7 != lyVar2.J1) {
                                    int i13 = i7 - lyVar2.F1;
                                    if (i13 < arrayList3.size()) {
                                        if (i13 >= arrayList3.size()) {
                                            i13 = arrayList3.size() - 1;
                                        }
                                        lyVar2.J0 = false;
                                        vvVar.C0();
                                        lyVar2.I(dyVar.E(arrayList3.get(i13)), 0);
                                        lyVar2.F(0);
                                        lyVar2.p(0);
                                        int i14 = lyVar2.H1;
                                        if (i14 <= 0 && (i14 = lyVar2.G1) <= 0) {
                                            i14 = lyVar2.F1;
                                        }
                                        zvVar.k(i7, i14);
                                        lyVar2.Y1 = false;
                                        lyVar2.Z();
                                        break;
                                    }
                                } else {
                                    vvVar.C0();
                                    lyVar2.I(dyVar.E("premium"), 0);
                                    lyVar2.F(0);
                                    int i15 = lyVar2.J1;
                                    zvVar.k(i15, i15 > 0 ? i15 : lyVar2.F1);
                                    break;
                                }
                            } else {
                                vvVar.C0();
                                lyVar2.I(dyVar.E("fav"), 0);
                                lyVar2.F(0);
                                int i16 = lyVar2.H1;
                                zvVar.k(i16, i16 > 0 ? i16 : lyVar2.F1);
                                break;
                            }
                        } else {
                            vvVar.C0();
                            lyVar2.I(dyVar.E("recent"), 0);
                            lyVar2.F(0);
                            int i17 = lyVar2.G1;
                            zvVar.k(i17, i17 > 0 ? i17 : lyVar2.F1);
                            break;
                        }
                    } else {
                        lyVar2.u1.o(new x31(lyVar2.getContext(), new gw(lyVar2), lyVar2.y1, lyVar2.z1, lyVar2.A1, null, lyVar2.a2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        String str;
        int i10;
        ly lyVar = this.b;
        int i11 = lyVar.D1;
        yw ywVar = lyVar.Q;
        int[] iArr = lyVar.E1;
        du duVar = lyVar.C1;
        if (view instanceof ux) {
            ux uxVar = (ux) view;
            if (uxVar.c) {
                View F = ywVar.F(view);
                v4.e1 T = F != null ? ywVar.T(F) : null;
                if (T != null && T.b() <= lyVar.getRecentEmoji().size()) {
                    lyVar.u1.n();
                }
                ywVar.A1(view);
                return true;
            }
            if (uxVar.getSpan() == null && (str = (String) uxVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = !uxVar.c ? (String) org.telegram.messenger.j6.j.get(replace) : null;
                boolean z10 = org.telegram.messenger.h4.a(replace, null, null) != null;
                if (z10 || org.telegram.messenger.k6.l.contains(replace)) {
                    lyVar.S1 = uxVar;
                    lyVar.V1 = lyVar.T1;
                    lyVar.W1 = lyVar.U1;
                    if (z10) {
                        replace = ly.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.h4.a.indexOf(str2) + 1;
                        cu cuVar = duVar.c;
                        int[] iArr2 = cuVar.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            cuVar.invalidate();
                        }
                    }
                    duVar.getClass();
                    cu cuVar2 = duVar.c;
                    int i12 = duVar.e;
                    boolean z11 = org.telegram.messenger.h4.a(replace, null, null) != null;
                    duVar.d = z11;
                    Drawable[] drawableArr = cuVar2.b;
                    int[] iArr3 = cuVar2.n;
                    cuVar2.f = z11;
                    cuVar2.e = replace;
                    if (z11) {
                        drawableArr[0] = org.telegram.messenger.h4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.h4.a(cuVar2.e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.h4.a(cuVar2.e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.h4.a(cuVar2.e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.h4.a(cuVar2.e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.h4.a(cuVar2.e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.h4.a(cuVar2.e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.h4.a(cuVar2.e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.h4.a(cuVar2.e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.h4.a(cuVar2.e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.h4.a(cuVar2.e, -2, 4);
                        Pair c10 = org.telegram.messenger.h4.c(replace);
                        if (c10 != null) {
                            int intValue = ((Integer) c10.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                cuVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c10.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                cuVar2.invalidate();
                            }
                            cuVar2.H = iArr3[0] == iArr3[1];
                        }
                        cuVar2.J = true;
                    } else {
                        int i13 = 0;
                        while (i13 < 6) {
                            drawableArr[i13] = org.telegram.messenger.j6.f(i13 != 0 ? ly.g(replace, (String) org.telegram.messenger.h4.a.get(i13 - 1)) : replace);
                            i13++;
                        }
                    }
                    cuVar2.invalidate();
                    duVar.setWidth(org.telegram.messenger.g0.L((duVar.d ? 3 : 0) + 30) + (i12 * 6));
                    duVar.setHeight(((duVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(duVar.d ? 11.66f : 15.0f));
                    int L = org.telegram.messenger.g0.L((duVar.d ? 3 : 0) + 30) + (i12 * 6);
                    int L2 = ((duVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(duVar.d ? 11.66f : 15.0f);
                    uxVar.getLocationOnScreen(iArr);
                    if (duVar.d) {
                        i10 = 0;
                    } else {
                        i10 = org.telegram.messenger.g0.L((r3 * 4) - (org.telegram.messenger.g0.Q1() ? 5 : 1)) + (cuVar2.n[0] * i11);
                    }
                    if (iArr[0] - i10 < org.telegram.messenger.g0.L(5.0f)) {
                        i10 = org.telegram.messenger.i20.D(5.0f, iArr[0] - i10, i10);
                    } else {
                        int i14 = (iArr[0] - i10) + L;
                        Point point = org.telegram.messenger.g0.q;
                        if (i14 > point.x - org.telegram.messenger.g0.L(5.0f)) {
                            i10 += ((iArr[0] - i10) + L) - (point.x - org.telegram.messenger.g0.L(5.0f));
                        }
                    }
                    int i15 = -i10;
                    int top = uxVar.getTop() < 0 ? uxVar.getTop() : 0;
                    cuVar2.setArrowX((org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 30.0f : 22.0f) - i15) + ((int) org.telegram.messenger.g0.N(0.5f)));
                    duVar.setFocusable(true);
                    duVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i11) / 2) + ((-view.getMeasuredHeight()) - L2)) - top);
                    lyVar.h.requestDisallowInterceptTouchEvent(true);
                    ywVar.d1(true);
                    ywVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ri.m
    public void l(int i7) {
        ly lyVar = this.b;
        dh.g gVar = lyVar.k2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.zc.a(i7, 4)) {
            gVar.h(lyVar.o2.e());
        }
        gVar.e(lyVar.l2, lyVar.getWidth(), lyVar.getHeight());
    }

    @Override // te.b
    public /* synthetic */ void E(float f10, int i7) {
    }
}
