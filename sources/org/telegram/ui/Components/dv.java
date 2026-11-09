package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv implements oi.m, ej0, qk0, te.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ hy b;

    public /* synthetic */ dv(hy hyVar, int i7) {
        this.a = i7;
        this.b = hyVar;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.b.R();
    }

    @Override // org.telegram.ui.Components.qk0
    public void a(int i7) {
        int i10;
        tx txVar;
        switch (this.a) {
            case 2:
                hy hyVar = this.b;
                nx nxVar = hyVar.i0;
                int i11 = hyVar.c1;
                mx mxVar = hyVar.n0;
                px pxVar = hyVar.k0;
                if (i7 != hyVar.s0 || !mxVar.y.isEmpty()) {
                    hyVar.h0.C0();
                    hyVar.p0.k(i7, 0);
                    if (i7 == hyVar.r0 || i7 == hyVar.s0) {
                        hyVar.o0.d.setText("");
                        if (i7 != hyVar.s0 || (i10 = mxVar.I) < 1) {
                            ix ixVar = hyVar.t1;
                            nxVar.h1((ixVar == null || !ixVar.A()) ? 1 : 0, 0);
                        } else {
                            nxVar.h1(i10, -org.telegram.messenger.g0.L(4.0f));
                        }
                        if (i7 == hyVar.s0) {
                            ArrayList arrayList = org.telegram.messenger.qp.s1(i11).b4;
                            if (!arrayList.isEmpty()) {
                                pxVar.a((String) arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList arrayList2 = org.telegram.messenger.qp.s1(i11).b4;
                        hyVar.j0.H((String) arrayList2.get(i7 - hyVar.t0));
                        int i12 = i7 - hyVar.t0;
                        if (i12 > 0) {
                            pxVar.a((String) arrayList2.get(i12 - 1), true);
                        }
                        if (i7 - hyVar.t0 < arrayList2.size() - 1) {
                            pxVar.a((String) arrayList2.get((i7 - hyVar.t0) + 1), true);
                        }
                    }
                    hyVar.E(2);
                    break;
                }
                break;
            default:
                hy hyVar2 = this.b;
                tv tvVar = hyVar2.G0;
                ArrayList arrayList3 = hyVar2.d1;
                uv uvVar = hyVar2.B0;
                yx yxVar = hyVar2.y0;
                qv qvVar = hyVar2.D0;
                if (!hyVar2.S0) {
                    if (i7 != hyVar2.H1) {
                        if (tvVar != null && (txVar = tvVar.r) != null && txVar.getSelectedCategory() != null) {
                            tvVar.c(null, false);
                            txVar.I1(null);
                        }
                        if (i7 != hyVar2.F1) {
                            if (i7 != hyVar2.G1) {
                                if (i7 != hyVar2.I1) {
                                    int i13 = i7 - hyVar2.E1;
                                    if (i13 < arrayList3.size()) {
                                        if (i13 >= arrayList3.size()) {
                                            i13 = arrayList3.size() - 1;
                                        }
                                        hyVar2.I0 = false;
                                        qvVar.C0();
                                        hyVar2.H(yxVar.E(arrayList3.get(i13)), 0);
                                        hyVar2.E(0);
                                        hyVar2.p(0);
                                        int i14 = hyVar2.G1;
                                        if (i14 <= 0 && (i14 = hyVar2.F1) <= 0) {
                                            i14 = hyVar2.E1;
                                        }
                                        uvVar.k(i7, i14);
                                        hyVar2.X1 = false;
                                        hyVar2.Z();
                                        break;
                                    }
                                } else {
                                    qvVar.C0();
                                    hyVar2.H(yxVar.E("premium"), 0);
                                    hyVar2.E(0);
                                    int i15 = hyVar2.I1;
                                    uvVar.k(i15, i15 > 0 ? i15 : hyVar2.E1);
                                    break;
                                }
                            } else {
                                qvVar.C0();
                                hyVar2.H(yxVar.E("fav"), 0);
                                hyVar2.E(0);
                                int i16 = hyVar2.G1;
                                uvVar.k(i16, i16 > 0 ? i16 : hyVar2.E1);
                                break;
                            }
                        } else {
                            qvVar.C0();
                            hyVar2.H(yxVar.E("recent"), 0);
                            hyVar2.E(0);
                            int i17 = hyVar2.F1;
                            uvVar.k(i17, i17 > 0 ? i17 : hyVar2.E1);
                            break;
                        }
                    } else {
                        hyVar2.t1.o(new u31(hyVar2.getContext(), new bw(hyVar2), hyVar2.x1, hyVar2.y1, hyVar2.z1, null, hyVar2.Z1));
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        String str;
        int i10;
        hy hyVar = this.b;
        int i11 = hyVar.C1;
        tw twVar = hyVar.P;
        int[] iArr = hyVar.D1;
        yt ytVar = hyVar.B1;
        if (view instanceof qx) {
            qx qxVar = (qx) view;
            if (qxVar.c) {
                View F = twVar.F(view);
                v4.d1 T = F != null ? twVar.T(F) : null;
                if (T != null && T.b() <= hyVar.getRecentEmoji().size()) {
                    hyVar.t1.n();
                }
                twVar.A1(view);
                return true;
            }
            if (qxVar.getSpan() == null && (str = (String) qxVar.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = !qxVar.c ? (String) org.telegram.messenger.i6.j.get(replace) : null;
                boolean z9 = org.telegram.messenger.h4.a(replace, null, null) != null;
                if (z9 || org.telegram.messenger.j6.l.contains(replace)) {
                    hyVar.R1 = qxVar;
                    hyVar.U1 = hyVar.S1;
                    hyVar.V1 = hyVar.T1;
                    if (z9) {
                        replace = hy.g(replace, str2);
                    } else {
                        int indexOf = org.telegram.messenger.h4.a.indexOf(str2) + 1;
                        xt xtVar = ytVar.c;
                        int[] iArr2 = xtVar.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            xtVar.invalidate();
                        }
                    }
                    ytVar.getClass();
                    xt xtVar2 = ytVar.c;
                    int i12 = ytVar.e;
                    boolean z10 = org.telegram.messenger.h4.a(replace, null, null) != null;
                    ytVar.d = z10;
                    Drawable[] drawableArr = xtVar2.b;
                    int[] iArr3 = xtVar2.n;
                    xtVar2.f = z10;
                    xtVar2.e = replace;
                    if (z10) {
                        drawableArr[0] = org.telegram.messenger.h4.a(replace, -1, -1);
                        drawableArr[1] = org.telegram.messenger.h4.a(xtVar2.e, 0, -2);
                        drawableArr[2] = org.telegram.messenger.h4.a(xtVar2.e, 1, -2);
                        drawableArr[3] = org.telegram.messenger.h4.a(xtVar2.e, 2, -2);
                        drawableArr[4] = org.telegram.messenger.h4.a(xtVar2.e, 3, -2);
                        drawableArr[5] = org.telegram.messenger.h4.a(xtVar2.e, 4, -2);
                        drawableArr[6] = org.telegram.messenger.h4.a(xtVar2.e, -2, 0);
                        drawableArr[7] = org.telegram.messenger.h4.a(xtVar2.e, -2, 1);
                        drawableArr[8] = org.telegram.messenger.h4.a(xtVar2.e, -2, 2);
                        drawableArr[9] = org.telegram.messenger.h4.a(xtVar2.e, -2, 3);
                        drawableArr[10] = org.telegram.messenger.h4.a(xtVar2.e, -2, 4);
                        Pair c10 = org.telegram.messenger.h4.c(replace);
                        if (c10 != null) {
                            int intValue = ((Integer) c10.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                xtVar2.invalidate();
                            }
                            int intValue2 = ((Integer) c10.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                xtVar2.invalidate();
                            }
                            xtVar2.G = iArr3[0] == iArr3[1];
                        }
                        xtVar2.I = true;
                    } else {
                        int i13 = 0;
                        while (i13 < 6) {
                            drawableArr[i13] = org.telegram.messenger.i6.f(i13 != 0 ? hy.g(replace, (String) org.telegram.messenger.h4.a.get(i13 - 1)) : replace);
                            i13++;
                        }
                    }
                    xtVar2.invalidate();
                    ytVar.setWidth(org.telegram.messenger.g0.L((ytVar.d ? 3 : 0) + 30) + (i12 * 6));
                    ytVar.setHeight(((ytVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(ytVar.d ? 11.66f : 15.0f));
                    int L = org.telegram.messenger.g0.L((ytVar.d ? 3 : 0) + 30) + (i12 * 6);
                    int L2 = ((ytVar.d ? 2 : 1) * i12) + org.telegram.messenger.g0.L(ytVar.d ? 11.66f : 15.0f);
                    qxVar.getLocationOnScreen(iArr);
                    if (ytVar.d) {
                        i10 = 0;
                    } else {
                        i10 = org.telegram.messenger.g0.L((r3 * 4) - (org.telegram.messenger.g0.Q1() ? 5 : 1)) + (xtVar2.n[0] * i11);
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
                    int top = qxVar.getTop() < 0 ? qxVar.getTop() : 0;
                    xtVar2.setArrowX((org.telegram.messenger.g0.L(org.telegram.messenger.g0.Q1() ? 30.0f : 22.0f) - i15) + ((int) org.telegram.messenger.g0.N(0.5f)));
                    ytVar.setFocusable(true);
                    ytVar.showAsDropDown(view, i15, (((view.getMeasuredHeight() - i11) / 2) + ((-view.getMeasuredHeight()) - L2)) - top);
                    hyVar.h.requestDisallowInterceptTouchEvent(true);
                    twVar.d1(true);
                    twVar.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // oi.m
    public void l(int i7) {
        hy hyVar = this.b;
        dh.g gVar = hyVar.j2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.zc.a(i7, 4)) {
            gVar.h(hyVar.n2.e());
        }
        gVar.e(hyVar.k2, hyVar.getWidth(), hyVar.getHeight());
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }
}
