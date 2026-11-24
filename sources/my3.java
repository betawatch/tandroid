// default package

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class my3 implements mw4, e39, cr9, x74 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t14 b;

    public /* synthetic */ my3(t14 t14Var, byte b) {
        this.a = b;
        this.b = t14Var;
    }

    @Override // cr9
    public final void a(int i) {
        int i2;
        g14 g14Var;
        byte b = this.a;
        t14 t14Var = this.b;
        switch (b) {
            case 2:
                z04 z04Var = t14Var.j0;
                int i3 = t14Var.d1;
                y04 y04Var = t14Var.o0;
                b14 b14Var = t14Var.l0;
                if (i != t14Var.t0 || !y04Var.y.isEmpty()) {
                    t14Var.i0.D0();
                    t14Var.q0.k(i, 0);
                    if (i == t14Var.s0 || i == t14Var.t0) {
                        t14Var.p0.d.setText("");
                        if (i != t14Var.t0 || (i2 = y04Var.J) < 1) {
                            u04 u04Var = t14Var.u1;
                            z04Var.g1((u04Var == null || !u04Var.A()) ? 1 : 0, 0);
                        } else {
                            z04Var.g1(i2, -gl.L(4.0f));
                        }
                        if (i == t14Var.t0) {
                            ArrayList arrayList = na7.q1(i3).x3;
                            if (!arrayList.isEmpty()) {
                                b14Var.a((String) arrayList.get(0), true);
                            }
                        }
                    } else {
                        ArrayList arrayList2 = na7.q1(i3).x3;
                        t14Var.k0.H((String) arrayList2.get(i - t14Var.u0));
                        int i4 = i - t14Var.u0;
                        if (i4 > 0) {
                            b14Var.a((String) arrayList2.get(i4 - 1), true);
                        }
                        if (i - t14Var.u0 < arrayList2.size() - 1) {
                            b14Var.a((String) arrayList2.get((i - t14Var.u0) + 1), true);
                        }
                    }
                    t14Var.E(2);
                    break;
                }
                break;
            default:
                fz3 fz3Var = t14Var.H0;
                ArrayList arrayList3 = t14Var.e1;
                gz3 gz3Var = t14Var.C0;
                l14 l14Var = t14Var.z0;
                bz3 bz3Var = t14Var.E0;
                if (!t14Var.T0) {
                    if (i != t14Var.I1) {
                        if (fz3Var != null && (g14Var = fz3Var.r) != null && g14Var.getSelectedCategory() != null) {
                            fz3Var.b(null, false);
                            g14Var.I1(null);
                        }
                        if (i != t14Var.G1) {
                            if (i != t14Var.H1) {
                                if (i != t14Var.J1) {
                                    int i5 = i - t14Var.F1;
                                    if (i5 < arrayList3.size()) {
                                        if (i5 >= arrayList3.size()) {
                                            i5 = arrayList3.size() - 1;
                                        }
                                        t14Var.J0 = false;
                                        bz3Var.D0();
                                        t14Var.G(l14Var.E(arrayList3.get(i5)), 0);
                                        t14Var.E(0);
                                        t14Var.m(0);
                                        int i6 = t14Var.H1;
                                        if (i6 <= 0 && (i6 = t14Var.G1) <= 0) {
                                            i6 = t14Var.F1;
                                        }
                                        gz3Var.k(i, i6);
                                        t14Var.Y1 = false;
                                        t14Var.Z();
                                        break;
                                    }
                                } else {
                                    bz3Var.D0();
                                    t14Var.G(l14Var.E("premium"), 0);
                                    t14Var.E(0);
                                    int i7 = t14Var.J1;
                                    gz3Var.k(i7, i7 > 0 ? i7 : t14Var.F1);
                                    break;
                                }
                            } else {
                                bz3Var.D0();
                                t14Var.G(l14Var.E("fav"), 0);
                                t14Var.E(0);
                                int i8 = t14Var.H1;
                                gz3Var.k(i8, i8 > 0 ? i8 : t14Var.F1);
                                break;
                            }
                        } else {
                            bz3Var.D0();
                            t14Var.G(l14Var.E("recent"), 0);
                            t14Var.E(0);
                            int i9 = t14Var.G1;
                            gz3Var.k(i9, i9 > 0 ? i9 : t14Var.F1);
                            break;
                        }
                    } else {
                        t14Var.u1.g(new d2c(t14Var.getContext(), new oz3(t14Var), t14Var.y1, t14Var.z1, t14Var.A1, null, t14Var.a2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // e39
    public final boolean d(int i, View view) {
        String str;
        int i2;
        t14 t14Var = this.b;
        int i3 = t14Var.D1;
        int[] iArr = t14Var.E1;
        g04 g04Var = t14Var.Q;
        gw3 gw3Var = t14Var.C1;
        if (view instanceof c14) {
            c14 c14Var = (c14) view;
            if (c14Var.c) {
                View F = g04Var.F(view);
                s49 T = F != null ? g04Var.T(F) : null;
                if (T != null && T.b() <= t14Var.getRecentEmoji().size()) {
                    t14Var.u1.n();
                }
                g04Var.A1(view);
                return true;
            }
            if (c14Var.getSpan() == null && (str = (String) c14Var.getTag()) != null) {
                String replace = str.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                String str2 = !c14Var.c ? (String) vu3.j.get(replace) : null;
                boolean z = qq2.a(replace, null, null) != null;
                if (z || ow3.l.contains(replace)) {
                    t14Var.S1 = c14Var;
                    t14Var.V1 = t14Var.T1;
                    t14Var.W1 = t14Var.U1;
                    if (z) {
                        replace = t14.c(replace, str2);
                    } else {
                        int indexOf = qq2.a.indexOf(str2) + 1;
                        fw3 fw3Var = gw3Var.c;
                        int[] iArr2 = fw3Var.n;
                        if (iArr2[0] != indexOf) {
                            iArr2[0] = indexOf;
                            fw3Var.invalidate();
                        }
                    }
                    gw3Var.getClass();
                    fw3 fw3Var2 = gw3Var.c;
                    int i4 = gw3Var.e;
                    boolean z2 = qq2.a(replace, null, null) != null;
                    gw3Var.d = z2;
                    Drawable[] drawableArr = fw3Var2.b;
                    int[] iArr3 = fw3Var2.n;
                    fw3Var2.f = z2;
                    fw3Var2.e = replace;
                    if (z2) {
                        drawableArr[0] = qq2.a(replace, -1, -1);
                        drawableArr[1] = qq2.a(fw3Var2.e, 0, -2);
                        drawableArr[2] = qq2.a(fw3Var2.e, 1, -2);
                        drawableArr[3] = qq2.a(fw3Var2.e, 2, -2);
                        drawableArr[4] = qq2.a(fw3Var2.e, 3, -2);
                        drawableArr[5] = qq2.a(fw3Var2.e, 4, -2);
                        drawableArr[6] = qq2.a(fw3Var2.e, -2, 0);
                        drawableArr[7] = qq2.a(fw3Var2.e, -2, 1);
                        drawableArr[8] = qq2.a(fw3Var2.e, -2, 2);
                        drawableArr[9] = qq2.a(fw3Var2.e, -2, 3);
                        drawableArr[10] = qq2.a(fw3Var2.e, -2, 4);
                        Pair c = qq2.c(replace);
                        if (c != null) {
                            int intValue = ((Integer) c.first).intValue();
                            if (iArr3[0] != intValue) {
                                iArr3[0] = intValue;
                                fw3Var2.invalidate();
                            }
                            int intValue2 = ((Integer) c.second).intValue();
                            if (iArr3[1] != intValue2) {
                                iArr3[1] = intValue2;
                                fw3Var2.invalidate();
                            }
                            fw3Var2.H = iArr3[0] == iArr3[1];
                        }
                        fw3Var2.J = true;
                    } else {
                        int i5 = 0;
                        while (i5 < 6) {
                            drawableArr[i5] = vu3.f(i5 != 0 ? t14.c(replace, (String) qq2.a.get(i5 - 1)) : replace);
                            i5++;
                        }
                    }
                    fw3Var2.invalidate();
                    gw3Var.setWidth(gl.L((gw3Var.d ? 3 : 0) + 30) + (i4 * 6));
                    gw3Var.setHeight(((gw3Var.d ? 2 : 1) * i4) + gl.L(gw3Var.d ? 11.66f : 15.0f));
                    int L = gl.L((gw3Var.d ? 3 : 0) + 30) + (i4 * 6);
                    int L2 = ((gw3Var.d ? 2 : 1) * i4) + gl.L(gw3Var.d ? 11.66f : 15.0f);
                    c14Var.getLocationOnScreen(iArr);
                    if (gw3Var.d) {
                        i2 = 0;
                    } else {
                        i2 = gl.L((r4 << 2) - (gl.O1() ? 5 : 1)) + (fw3Var2.n[0] * i3);
                    }
                    if (iArr[0] - i2 < gl.L(5.0f)) {
                        i2 = b00.z(5.0f, iArr[0] - i2, i2);
                    } else {
                        int i6 = (iArr[0] - i2) + L;
                        Point point = gl.q;
                        if (i6 > point.x - gl.L(5.0f)) {
                            i2 += ((iArr[0] - i2) + L) - (point.x - gl.L(5.0f));
                        }
                    }
                    int i7 = -i2;
                    int top = c14Var.getTop() < 0 ? c14Var.getTop() : 0;
                    fw3Var2.setArrowX((gl.L(gl.O1() ? 30.0f : 22.0f) - i7) + ((int) gl.N(0.5f)));
                    gw3Var.setFocusable(true);
                    gw3Var.showAsDropDown(view, i7, (((view.getMeasuredHeight() - i3) / 2) + ((-view.getMeasuredHeight()) - L2)) - top);
                    t14Var.h.requestDisallowInterceptTouchEvent(true);
                    g04Var.e1(true);
                    g04Var.A1(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // mw4
    public final void j(int i) {
        t14 t14Var = this.b;
        cq3 cq3Var = t14Var.k2;
        if (Build.VERSION.SDK_INT < 31 || cq3Var == null) {
            return;
        }
        if (fod.a(i, 4)) {
            cq3Var.h(t14Var.n2.e());
        }
        cq3Var.e(t14Var.l2, t14Var.getWidth(), t14Var.getHeight());
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        this.b.S();
    }

    @Override // x74
    public final void D(float f, int i) {
    }
}
