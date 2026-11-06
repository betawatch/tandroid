package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cv implements oi.m, dj0, pk0, te.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy b;

    public /* synthetic */ cv(gy gyVar, int i7) {
        this.a = i7;
        this.b = gyVar;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.b.R();
    }

    @Override // org.telegram.ui.Components.pk0
    public void a(int i7) {
        int i10;
        sx sxVar;
        switch (this.a) {
            case 2:
                gy gyVar = this.b;
                mx mxVar = gyVar.i0;
                int i11 = gyVar.c1;
                lx lxVar = gyVar.n0;
                ox oxVar = gyVar.k0;
                if (i7 != gyVar.s0 || !lxVar.y.isEmpty()) {
                    gyVar.h0.C0();
                    gyVar.p0.k(i7, 0);
                    if (i7 == gyVar.r0 || i7 == gyVar.s0) {
                        gyVar.o0.d.setText("");
                        if (i7 != gyVar.s0 || (i10 = lxVar.I) < 1) {
                            hx hxVar = gyVar.t1;
                            mxVar.h1((hxVar == null || !hxVar.A()) ? 1 : 0, 0);
                        } else {
                            mxVar.h1(i10, -org.telegram.messenger.g0.L(4.0f));
                        }
                        if (i7 == gyVar.s0) {
                            ArrayList arrayList = org.telegram.messenger.qp.s1(i11).b4;
                            if (!arrayList.isEmpty()) {
                                oxVar.a((String) arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList arrayList2 = org.telegram.messenger.qp.s1(i11).b4;
                        gyVar.j0.H((String) arrayList2.get(i7 - gyVar.t0));
                        int i12 = i7 - gyVar.t0;
                        if (i12 > 0) {
                            oxVar.a((String) arrayList2.get(i12 - 1), true);
                        }
                        if (i7 - gyVar.t0 < arrayList2.size() - 1) {
                            oxVar.a((String) arrayList2.get((i7 - gyVar.t0) + 1), true);
                        }
                    }
                    gyVar.E(2);
                    break;
                }
                break;
            default:
                gy gyVar2 = this.b;
                sv svVar = gyVar2.G0;
                ArrayList arrayList3 = gyVar2.d1;
                tv tvVar = gyVar2.B0;
                xx xxVar = gyVar2.y0;
                pv pvVar = gyVar2.D0;
                if (!gyVar2.S0) {
                    if (i7 != gyVar2.H1) {
                        if (svVar != null && (sxVar = svVar.r) != null && sxVar.getSelectedCategory() != null) {
                            svVar.c(null, false);
                            sxVar.I1(null);
                        }
                        if (i7 != gyVar2.F1) {
                            if (i7 != gyVar2.G1) {
                                if (i7 != gyVar2.I1) {
                                    int i13 = i7 - gyVar2.E1;
                                    if (i13 < arrayList3.size()) {
                                        if (i13 >= arrayList3.size()) {
                                            i13 = arrayList3.size() - 1;
                                        }
                                        gyVar2.I0 = false;
                                        pvVar.C0();
                                        gyVar2.H(xxVar.E(arrayList3.get(i13)), 0);
                                        gyVar2.E(0);
                                        gyVar2.p(0);
                                        int i14 = gyVar2.G1;
                                        if (i14 <= 0 && (i14 = gyVar2.F1) <= 0) {
                                            i14 = gyVar2.E1;
                                        }
                                        tvVar.k(i7, i14);
                                        gyVar2.X1 = false;
                                        gyVar2.Z();
                                        break;
                                    }
                                } else {
                                    pvVar.C0();
                                    gyVar2.H(xxVar.E("premium"), 0);
                                    gyVar2.E(0);
                                    int i15 = gyVar2.I1;
                                    tvVar.k(i15, i15 > 0 ? i15 : gyVar2.E1);
                                    break;
                                }
                            } else {
                                pvVar.C0();
                                gyVar2.H(xxVar.E("fav"), 0);
                                gyVar2.E(0);
                                int i16 = gyVar2.G1;
                                tvVar.k(i16, i16 > 0 ? i16 : gyVar2.E1);
                                break;
                            }
                        } else {
                            pvVar.C0();
                            gyVar2.H(xxVar.E("recent"), 0);
                            gyVar2.E(0);
                            int i17 = gyVar2.F1;
                            tvVar.k(i17, i17 > 0 ? i17 : gyVar2.E1);
                            break;
                        }
                    } else {
                        gyVar2.t1.o(new t31(gyVar2.getContext(), new aw(gyVar2), gyVar2.x1, gyVar2.y1, gyVar2.z1, null, gyVar2.Z1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        String str;
        int i10;
        gy gyVar = this.b;
        int i11 = gyVar.C1;
        sw swVar = gyVar.P;
        int[] iArr = gyVar.D1;
        xt xtVar = gyVar.B1;
        if (view instanceof px) {
            px pxVar = (px) view;
            if (pxVar.c) {
                View F = swVar.F(view);
                v4.d1 T = F != null ? swVar.T(F) : null;
                if (T != null && T.b() <= gyVar.getRecentEmoji().size()) {
                    gyVar.t1.n();
                }
                swVar.A1(view);
                return true;
            }
            if (pxVar.getSpan() == null && (str = (String) pxVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = !pxVar.c ? (String) org.telegram.messenger.i6.j.get(replace) : null;
                boolean z9 = org.telegram.messenger.h4.a(replace, null, null) != null;
                if (z9 || org.telegram.messenger.j6.l.contains(replace)) {
                    gyVar.R1 = pxVar;
                    gyVar.U1 = gyVar.S1;
                    gyVar.V1 = gyVar.T1;
                    if (z9) {
                        replace = gy.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.h4.a.indexOf(str2) + 1;
                        wt wtVar = xtVar.c;
                        int[] iArr2 = wtVar.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            wtVar.invalidate();
                        }
                    }
                    xtVar.getClass();
                    wt wtVar2 = xtVar.c;
                    int i12 = xtVar.e;
                    boolean z10 = org.telegram.messenger.h4.a(replace, null, null) != null;
                    xtVar.d = z10;
                    Drawable[] drawableArr = wtVar2.b;
                    int[] iArr3 = wtVar2.n;
                    wtVar2.f = z10;
                    wtVar2.e = replace;
                    if (z10) {
                        drawableArr[0] = org.telegram.messenger.h4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.h4.a(wtVar2.e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.h4.a(wtVar2.e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.h4.a(wtVar2.e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.h4.a(wtVar2.e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.h4.a(wtVar2.e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.h4.a(wtVar2.e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.h4.a(wtVar2.e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.h4.a(wtVar2.e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.h4.a(wtVar2.e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.h4.a(wtVar2.e, -2, 4);
                        Pair c10 = org.telegram.messenger.h4.c(replace);
                        if (c10 != null) {
                            int intValue = ((Integer) c10.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                wtVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c10.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                wtVar2.invalidate();
                            }
                            wtVar2.G = iArr3[0] == iArr3[1];
                        }
                        wtVar2.I = true;
                    } else {
                        int i13 = 0;
                        while (i13 < 6) {
                            drawableArr[i13] = org.telegram.messenger.i6.f(i13 != 0 ? gy.g(replace, (String) org.telegram.messenger.h4.a.get(i13 - 1)) : replace);
                            i13++;
                        }
                    }
                    wtVar2.invalidate();
                    xtVar.setWidth(org.telegram.messenger.g0.L((xtVar.d ? 3 : 0) + 30) + (i12 * 6));
                    xtVar.setHeight(((xtVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(xtVar.d ? 11.66f : 15.0f));
                    int L = org.telegram.messenger.g0.L((xtVar.d ? 3 : 0) + 30) + (i12 * 6);
                    int L2 = ((xtVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(xtVar.d ? 11.66f : 15.0f);
                    pxVar.getLocationOnScreen(iArr);
                    if (xtVar.d) {
                        i10 = 0;
                    } else {
                        i10 = org.telegram.messenger.g0.L((r3 * 4) - (org.telegram.messenger.g0.Q1() ? 5 : 1)) + (wtVar2.n[0] * i11);
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
                    int top = pxVar.getTop() < 0 ? pxVar.getTop() : 0;
                    wtVar2.setArrowX((org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 30.0f : 22.0f) - i15) + ((int) org.telegram.messenger.g0.N(0.5f)));
                    xtVar.setFocusable(true);
                    xtVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i11) / 2) + ((-view.getMeasuredHeight()) - L2)) - top);
                    gyVar.h.requestDisallowInterceptTouchEvent(true);
                    swVar.d1(true);
                    swVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // oi.m
    public void l(int i7) {
        gy gyVar = this.b;
        dh.g gVar = gyVar.j2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.zc.a(i7, 4)) {
            gVar.h(gyVar.n2.e());
        }
        gVar.e(gyVar.k2, gyVar.getWidth(), gyVar.getHeight());
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }
}
