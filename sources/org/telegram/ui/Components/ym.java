package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.xb1;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ym implements ml0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ym(xn xnVar, org.telegram.ui.ActionBar.d6 d6Var, xi xiVar, Context context) {
        this.c = xnVar;
        this.b = d6Var;
        this.d = xiVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                xn xnVar = (xn) this.c;
                xi xiVar = (xi) this.d;
                Context context = (Context) this.e;
                m40 m40Var = xnVar.y;
                boolean[] zArr = xnVar.L;
                c2.a aVar = xnVar.N0;
                kn knVar = xnVar.v;
                vn vnVar = xnVar.r;
                xb1 xb1Var = xnVar.s;
                int i11 = xnVar.L0;
                org.telegram.ui.ActionBar.d6 d6Var = this.b;
                if (i10 == i11) {
                    th.f fVar = new th.f(xnVar.getContext(), d6Var);
                    fVar.k0 = new l2.g(xnVar, 8);
                    ArrayList arrayList = xnVar.P0;
                    fVar.c0 = null;
                    fVar.o0 = new HashSet(arrayList);
                    fVar.show();
                    break;
                } else if (i10 == xnVar.I0) {
                    b80 F = b80.F(xiVar.container, d6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = xnVar.T0;
                        if (i12 >= iArr.length) {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ActionBar.m5(xnVar, context, view, d6Var, 19), false);
                            F.t = false;
                            F.s = 0;
                            F.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            u21 a2 = u21.a(i13);
                            int i14 = org.telegram.ui.ActionBar.i6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i14, xnVar.a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.i6.E8, new zm(xnVar, i13, view, 0));
                            i12++;
                        }
                    }
                } else if (i10 == xnVar.u0) {
                    xnVar.N();
                    break;
                } else {
                    boolean z12 = view instanceof org.telegram.ui.Cells.w8;
                    if (z12 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z13 = xnVar.c0;
                        mn mnVar = xnVar.x;
                        if (mnVar != null) {
                            mnVar.f();
                        }
                        c2.a[] aVarArr = xnVar.O0;
                        int length = aVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                c2.a aVar2 = aVarArr[i15];
                                if (i10 == aVar2.b) {
                                    boolean z14 = aVar2.a;
                                    z11 = !z14;
                                    aVar2.a = z11;
                                    int i16 = aVar.b;
                                    xn xnVar2 = (xn) aVar.c;
                                    vn vnVar2 = xnVar2.r;
                                    if (i10 == i16) {
                                        xb1Var.setItemAnimator(knVar);
                                        int i17 = aVar.b;
                                        if (i17 >= 0) {
                                            s4.c1 K = xnVar2.s.K(i17);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            vnVar2.m(aVar.b);
                                        }
                                        if (z14) {
                                            vnVar2.t(aVar.b + 1, 1);
                                        } else {
                                            vnVar2.s(aVar.b + 1, 1);
                                        }
                                        xnVar.h0();
                                    }
                                    z10 = true;
                                } else {
                                    i15++;
                                }
                            } else {
                                z10 = false;
                                z11 = false;
                            }
                        }
                        if (!z10) {
                            if (i10 == xnVar.B0) {
                                z11 = xnVar.a0;
                                xnVar.a0 = !z11;
                                xnVar.P();
                            } else {
                                int i18 = xnVar.y0;
                                if (i10 == i18) {
                                    z11 = !xnVar.f0;
                                    xnVar.f0 = z11;
                                } else if (i10 == xnVar.C0) {
                                    if (!xnVar.c0 && !xnVar.a0) {
                                        xnVar.T = !xnVar.T;
                                    }
                                    z11 = xnVar.T;
                                } else if (i10 == xnVar.E0) {
                                    z11 = !xnVar.S;
                                    xnVar.S = z11;
                                } else if (i10 == xnVar.H0) {
                                    if (xnVar.U == 0 && xnVar.V == 0) {
                                        xnVar.U = 86400;
                                        xnVar.V = 0;
                                        int i19 = xnVar.I0;
                                        xnVar.h0();
                                        if (i19 < 0) {
                                            s4.c1 K2 = xb1Var.K(xnVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            xb1Var.setItemAnimator(knVar);
                                            vnVar.s(xnVar.I0, 3);
                                        }
                                    } else {
                                        xnVar.U = 0;
                                        xnVar.V = 0;
                                        int i20 = xnVar.I0;
                                        xnVar.h0();
                                        xb1Var.setItemAnimator(knVar);
                                        vnVar.t(i20, 3);
                                        s4.c1 K3 = xb1Var.K(xnVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z11 = (xnVar.U == 0 && xnVar.V == 0) ? false : true;
                                } else if (i10 == xnVar.D0) {
                                    z11 = !xnVar.R;
                                    xnVar.R = z11;
                                } else if (i10 == xnVar.z0) {
                                    z11 = !xnVar.g0;
                                    xnVar.g0 = z11;
                                    xnVar.h0();
                                    int i21 = xnVar.y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        xb1Var.setItemAnimator(knVar);
                                        vnVar.o(xnVar.y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        xb1Var.setItemAnimator(knVar);
                                        vnVar.u(i18);
                                    }
                                } else if (i10 == xnVar.F0) {
                                    boolean z15 = xnVar.b0;
                                    z11 = !z15;
                                    xnVar.b0 = z11;
                                    if (z15 && xnVar.c0) {
                                        boolean z16 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z16) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z16 = true;
                                            }
                                        }
                                    }
                                    int childCount = xb1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.c1 T = xb1Var.T(xb1Var.getChildAt(i23));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.d6) T.a).a.a(xnVar.b0, true);
                                        }
                                    }
                                } else if (i10 == xnVar.J0) {
                                    z11 = !xnVar.W;
                                    xnVar.W = z11;
                                } else if (i10 == xnVar.G0) {
                                    if (!xnVar.e0) {
                                        xb1Var.setItemAnimator(knVar);
                                        z11 = !xnVar.c0;
                                        xnVar.c0 = z11;
                                        int i24 = xnVar.o0;
                                        xnVar.h0();
                                        if (xnVar.c0) {
                                            vnVar.s(xnVar.o0, 3);
                                        } else {
                                            vnVar.t(i24, 3);
                                        }
                                        vnVar.m(xnVar.A0);
                                        if (xnVar.c0) {
                                            xnVar.R = false;
                                            int i25 = xnVar.D0;
                                            if (i25 >= 0) {
                                                s4.c1 K4 = xb1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.a).setChecked(false);
                                                } else {
                                                    vnVar.m(xnVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = xnVar.D0;
                                            if (i26 >= 0 && xb1Var.K(i26) == null) {
                                                vnVar.m(xnVar.D0);
                                            }
                                        }
                                        xnVar.P();
                                        if (xnVar.c0 && !xnVar.b0) {
                                            boolean z17 = false;
                                            for (int i27 = 0; i27 < zArr.length; i27++) {
                                                if (z17) {
                                                    zArr[i27] = false;
                                                } else if (zArr[i27]) {
                                                    z17 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (xnVar.d0 && !xnVar.c0) {
                            m40Var.b(true);
                        }
                        xb1Var.getChildCount();
                        for (int i28 = xnVar.t0; i28 < xnVar.t0 + xnVar.M; i28++) {
                            s4.c1 K5 = xb1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.d6) {
                                    org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view5;
                                    d6Var2.m(xnVar.c0, true);
                                    d6Var2.r.a(zArr[i28 - xnVar.t0], z13);
                                    if (d6Var2.getTop() > AndroidUtilities.dp(40.0f) && i10 == xnVar.G0 && !xnVar.d0) {
                                        m40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        m40Var.f(d6Var2.getCheckBox(), true);
                                        xnVar.d0 = true;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        xnVar.R();
                        break;
                    }
                }
                break;
            default:
                wv.n((wv) this.c, (ArrayList) this.d, (org.telegram.ui.ActionBar.n2) this.e, this.b, view, i10);
                break;
        }
    }

    public /* synthetic */ ym(wv wvVar, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.c = wvVar;
        this.d = arrayList;
        this.e = n2Var;
        this.b = d6Var;
    }
}
