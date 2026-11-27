// default package

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class hz3 implements ry4, t69, vu9, s84 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o24 b;

    public /* synthetic */ hz3(o24 o24Var, byte b) {
        this.a = b;
        this.b = o24Var;
    }

    @Override // vu9
    public final void a(int i) {
        int i2;
        b24 b24Var;
        byte b = this.a;
        o24 o24Var = this.b;
        switch (b) {
            case 2:
                u14 u14Var = o24Var.j0;
                int i3 = o24Var.d1;
                t14 t14Var = o24Var.o0;
                w14 w14Var = o24Var.l0;
                if (i != o24Var.t0 || !t14Var.y.isEmpty()) {
                    o24Var.i0.E0();
                    o24Var.q0.k(i, 0);
                    if (i == o24Var.s0 || i == o24Var.t0) {
                        o24Var.p0.d.setText("");
                        if (i != o24Var.t0 || (i2 = t14Var.J) < 1) {
                            p14 p14Var = o24Var.u1;
                            u14Var.g1((p14Var == null || !p14Var.A()) ? 1 : 0, 0);
                        } else {
                            u14Var.g1(i2, -hl.L(4.0f));
                        }
                        if (i == o24Var.t0) {
                            ArrayList arrayList = uc7.s1(i3).x3;
                            if (!arrayList.isEmpty()) {
                                w14Var.a((String) arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList arrayList2 = uc7.s1(i3).x3;
                        o24Var.k0.H((String) arrayList2.get(i - o24Var.u0));
                        int i4 = i - o24Var.u0;
                        if (i4 > 0) {
                            w14Var.a((String) arrayList2.get(i4 - 1), true);
                        }
                        if (i - o24Var.u0 < arrayList2.size() - 1) {
                            w14Var.a((String) arrayList2.get((i - o24Var.u0) + 1), true);
                        }
                    }
                    o24Var.D(2);
                    break;
                }
                break;
            default:
                a04 a04Var = o24Var.H0;
                ArrayList arrayList3 = o24Var.e1;
                b04 b04Var = o24Var.C0;
                g24 g24Var = o24Var.z0;
                wz3 wz3Var = o24Var.E0;
                if (!o24Var.T0) {
                    if (i != o24Var.I1) {
                        if (a04Var != null && (b24Var = a04Var.r) != null && b24Var.getSelectedCategory() != null) {
                            a04Var.b(null, false);
                            b24Var.J1(null);
                        }
                        if (i != o24Var.G1) {
                            if (i != o24Var.H1) {
                                if (i != o24Var.J1) {
                                    int i5 = i - o24Var.F1;
                                    if (i5 < arrayList3.size()) {
                                        if (i5 >= arrayList3.size()) {
                                            i5 = arrayList3.size() - 1;
                                        }
                                        o24Var.J0 = false;
                                        wz3Var.E0();
                                        o24Var.F(g24Var.E(arrayList3.get(i5)), 0);
                                        o24Var.D(0);
                                        o24Var.m(0);
                                        int i6 = o24Var.H1;
                                        if (i6 <= 0 && (i6 = o24Var.G1) <= 0) {
                                            i6 = o24Var.F1;
                                        }
                                        b04Var.k(i, i6);
                                        o24Var.Y1 = false;
                                        o24Var.Y();
                                        break;
                                    }
                                } else {
                                    wz3Var.E0();
                                    o24Var.F(g24Var.E("premium"), 0);
                                    o24Var.D(0);
                                    int i7 = o24Var.J1;
                                    b04Var.k(i7, i7 > 0 ? i7 : o24Var.F1);
                                    break;
                                }
                            } else {
                                wz3Var.E0();
                                o24Var.F(g24Var.E("fav"), 0);
                                o24Var.D(0);
                                int i8 = o24Var.H1;
                                b04Var.k(i8, i8 > 0 ? i8 : o24Var.F1);
                                break;
                            }
                        } else {
                            wz3Var.E0();
                            o24Var.F(g24Var.E("recent"), 0);
                            o24Var.D(0);
                            int i9 = o24Var.G1;
                            b04Var.k(i9, i9 > 0 ? i9 : o24Var.F1);
                            break;
                        }
                    } else {
                        o24Var.u1.g(new d6c(o24Var.getContext(), new j04(o24Var), o24Var.y1, o24Var.z1, o24Var.A1, null, o24Var.a2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // t69
    public final boolean e(int i, View view) {
        String str;
        int i2;
        o24 o24Var = this.b;
        int i3 = o24Var.D1;
        int[] iArr = o24Var.E1;
        b14 b14Var = o24Var.Q;
        bx3 bx3Var = o24Var.C1;
        if (view instanceof x14) {
            x14 x14Var = (x14) view;
            if (x14Var.c) {
                View G = b14Var.G(view);
                f89 U = G != null ? b14Var.U(G) : null;
                if (U != null && U.b() <= o24Var.getRecentEmoji().size()) {
                    o24Var.u1.n();
                }
                b14Var.B1(view);
                return true;
            }
            if (x14Var.getSpan() == null && (str = (String) x14Var.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = !x14Var.c ? (String) pv3.j.get(replace) : null;
                boolean z = jr2.a(replace, null, null) != null;
                if (z || jx3.l.contains(replace)) {
                    o24Var.S1 = x14Var;
                    o24Var.V1 = o24Var.T1;
                    o24Var.W1 = o24Var.U1;
                    if (z) {
                        replace = o24.c(replace, str2);
                    } else {
                        int indexOf = jr2.a.indexOf(str2) + 1;
                        ax3 ax3Var = bx3Var.c;
                        int[] iArr2 = ax3Var.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            ax3Var.invalidate();
                        }
                    }
                    bx3Var.getClass();
                    ax3 ax3Var2 = bx3Var.c;
                    int i4 = bx3Var.e;
                    boolean z2 = jr2.a(replace, null, null) != null;
                    bx3Var.d = z2;
                    Drawable[] drawableArr = ax3Var2.b;
                    int[] iArr3 = ax3Var2.n;
                    ax3Var2.f = z2;
                    ax3Var2.e = replace;
                    if (z2) {
                        drawableArr[0] = jr2.a(replace, -1, -1);
                        drawableArr[1] = jr2.a(ax3Var2.e, 0, -2);
                        drawableArr[2] = jr2.a(ax3Var2.e, 1, -2);
                        drawableArr[3] = jr2.a(ax3Var2.e, 2, -2);
                        drawableArr[4] = jr2.a(ax3Var2.e, 3, -2);
                        drawableArr[5] = jr2.a(ax3Var2.e, 4, -2);
                        drawableArr[6] = jr2.a(ax3Var2.e, -2, 0);
                        drawableArr[7] = jr2.a(ax3Var2.e, -2, 1);
                        drawableArr[8] = jr2.a(ax3Var2.e, -2, 2);
                        drawableArr[9] = jr2.a(ax3Var2.e, -2, 3);
                        drawableArr[10] = jr2.a(ax3Var2.e, -2, 4);
                        Pair c = jr2.c(replace);
                        if (c != null) {
                            int intValue = ((Integer) c.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                ax3Var2.invalidate();
                            }
                            int intValue2 = ((Integer) c.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                ax3Var2.invalidate();
                            }
                            ax3Var2.H = iArr3[0] == iArr3[1];
                        }
                        ax3Var2.J = true;
                    } else {
                        int i5 = 0;
                        while (i5 < 6) {
                            drawableArr[i5] = pv3.f(i5 != 0 ? o24.c(replace, (String) jr2.a.get(i5 - 1)) : replace);
                            i5++;
                        }
                    }
                    ax3Var2.invalidate();
                    bx3Var.setWidth(hl.L((bx3Var.d ? 3 : 0) + 30) + (i4 * 6));
                    bx3Var.setHeight(((bx3Var.d ? 2 : 1) * i4) + hl.L(bx3Var.d ? 11.66f : 15.0f));
                    int L = hl.L((bx3Var.d ? 3 : 0) + 30) + (i4 * 6);
                    int L2 = ((bx3Var.d ? 2 : 1) * i4) + hl.L(bx3Var.d ? 11.66f : 15.0f);
                    x14Var.getLocationOnScreen(iArr);
                    if (bx3Var.d) {
                        i2 = 0;
                    } else {
                        i2 = hl.L((r4 << 2) - (hl.O1() ? 5 : 1)) + (ax3Var2.n[0] * i3);
                    }
                    if (iArr[0] - i2 < hl.L(5.0f)) {
                        i2 = c00.A(5.0f, iArr[0] - i2, i2);
                    } else {
                        int i6 = (iArr[0] - i2) + L;
                        Point point = hl.q;
                        if (i6 > point.x - hl.L(5.0f)) {
                            i2 += ((iArr[0] - i2) + L) - (point.x - hl.L(5.0f));
                        }
                    }
                    int i7 = -i2;
                    int top = x14Var.getTop() < 0 ? x14Var.getTop() : 0;
                    ax3Var2.setArrowX((hl.L(hl.O1() ? 30.0f : 22.0f) - i7) + ((int) hl.N(0.5f)));
                    bx3Var.setFocusable(true);
                    bx3Var.showAsDropDown(view, i7, (((view.getMeasuredHeight() - i3) / 2) + ((-view.getMeasuredHeight()) - L2)) - top);
                    o24Var.h.requestDisallowInterceptTouchEvent(true);
                    b14Var.f1(true);
                    b14Var.B1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ry4
    public final void k(int i) {
        o24 o24Var = this.b;
        tq3 tq3Var = o24Var.k2;
        if (Build.VERSION.SDK_INT < 31 || tq3Var == null) {
            return;
        }
        if (vsd.a(i, 4)) {
            tq3Var.h(o24Var.n2.e());
        }
        tq3Var.e(o24Var.l2, o24Var.getWidth(), o24Var.getHeight());
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        this.b.R();
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
