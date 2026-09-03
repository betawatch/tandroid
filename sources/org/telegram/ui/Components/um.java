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
import org.telegram.ui.qb1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements il0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ um(rn rnVar, org.telegram.ui.ActionBar.g6 g6Var, mi miVar, Context context) {
        this.c = rnVar;
        this.b = g6Var;
        this.d = miVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        boolean z4;
        boolean z10;
        switch (this.a) {
            case 0:
                rn rnVar = (rn) this.c;
                mi miVar = (mi) this.d;
                Context context = (Context) this.e;
                m40 m40Var = rnVar.y;
                boolean[] zArr = rnVar.I;
                b7.l0 l0Var = rnVar.K0;
                fn fnVar = rnVar.v;
                pn pnVar = rnVar.r;
                qb1 qb1Var = rnVar.s;
                int i11 = rnVar.I0;
                org.telegram.ui.ActionBar.g6 g6Var = this.b;
                if (i10 == i11) {
                    hh.f fVar = new hh.f(rnVar.getContext(), g6Var);
                    fVar.h0 = new androidx.biometric.f0(rnVar, 26);
                    ArrayList arrayList = rnVar.M0;
                    fVar.Z = null;
                    fVar.l0 = new HashSet(arrayList);
                    fVar.show();
                    break;
                } else if (i10 == rnVar.F0) {
                    q70 F = q70.F(miVar.container, g6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = rnVar.Q0;
                        if (i12 >= iArr.length) {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ih(rnVar, context, view, g6Var, 10), false);
                            F.t = false;
                            F.s = 0;
                            F.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            x11 a2 = x11.a(i13);
                            int i14 = org.telegram.ui.ActionBar.k6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i14, rnVar.a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.k6.E8, new bh.a(rnVar, i13, view, 28));
                            i12++;
                        }
                    }
                } else if (i10 == rnVar.r0) {
                    rnVar.P();
                    break;
                } else {
                    boolean z11 = view instanceof org.telegram.ui.Cells.s8;
                    if (z11 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z12 = rnVar.W;
                        hn hnVar = rnVar.x;
                        if (hnVar != null) {
                            hnVar.f();
                        }
                        b7.l0[] l0VarArr = rnVar.L0;
                        int length = l0VarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                b7.l0 l0Var2 = l0VarArr[i15];
                                if (i10 == l0Var2.b) {
                                    boolean z13 = l0Var2.a;
                                    z10 = !z13;
                                    l0Var2.a = z10;
                                    int i16 = l0Var.b;
                                    rn rnVar2 = (rn) l0Var.c;
                                    pn pnVar2 = rnVar2.r;
                                    if (i10 == i16) {
                                        qb1Var.setItemAnimator(fnVar);
                                        int i17 = l0Var.b;
                                        if (i17 >= 0) {
                                            f2.m1 K = rnVar2.s.K(i17);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z10);
                                                }
                                            }
                                            pnVar2.m(l0Var.b);
                                        }
                                        if (z13) {
                                            pnVar2.t(l0Var.b + 1, 1);
                                        } else {
                                            pnVar2.s(l0Var.b + 1, 1);
                                        }
                                        rnVar.h0();
                                    }
                                    z4 = true;
                                } else {
                                    i15++;
                                }
                            } else {
                                z4 = false;
                                z10 = false;
                            }
                        }
                        if (!z4) {
                            if (i10 == rnVar.y0) {
                                z10 = rnVar.U;
                                rnVar.U = !z10;
                                rnVar.R();
                            } else {
                                int i18 = rnVar.v0;
                                if (i10 == i18) {
                                    z10 = !rnVar.c0;
                                    rnVar.c0 = z10;
                                } else if (i10 == rnVar.z0) {
                                    if (!rnVar.W && !rnVar.U) {
                                        rnVar.Q = !rnVar.Q;
                                    }
                                    z10 = rnVar.Q;
                                } else if (i10 == rnVar.B0) {
                                    z10 = !rnVar.P;
                                    rnVar.P = z10;
                                } else if (i10 == rnVar.E0) {
                                    if (rnVar.R == 0 && rnVar.S == 0) {
                                        rnVar.R = 86400;
                                        rnVar.S = 0;
                                        int i19 = rnVar.F0;
                                        rnVar.h0();
                                        if (i19 < 0) {
                                            f2.m1 K2 = qb1Var.K(rnVar.E0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            qb1Var.setItemAnimator(fnVar);
                                            pnVar.s(rnVar.F0, 3);
                                        }
                                    } else {
                                        rnVar.R = 0;
                                        rnVar.S = 0;
                                        int i20 = rnVar.F0;
                                        rnVar.h0();
                                        qb1Var.setItemAnimator(fnVar);
                                        pnVar.t(i20, 3);
                                        f2.m1 K3 = qb1Var.K(rnVar.E0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z10 = (rnVar.R == 0 && rnVar.S == 0) ? false : true;
                                } else if (i10 == rnVar.A0) {
                                    z10 = !rnVar.O;
                                    rnVar.O = z10;
                                } else if (i10 == rnVar.w0) {
                                    z10 = !rnVar.d0;
                                    rnVar.d0 = z10;
                                    rnVar.h0();
                                    int i21 = rnVar.v0;
                                    if (i21 >= 0 && i18 < 0) {
                                        qb1Var.setItemAnimator(fnVar);
                                        pnVar.o(rnVar.v0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        qb1Var.setItemAnimator(fnVar);
                                        pnVar.u(i18);
                                    }
                                } else if (i10 == rnVar.C0) {
                                    boolean z14 = rnVar.V;
                                    z10 = !z14;
                                    rnVar.V = z10;
                                    if (z14 && rnVar.W) {
                                        boolean z15 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z15) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z15 = true;
                                            }
                                        }
                                    }
                                    int childCount = qb1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        f2.m1 T = qb1Var.T(qb1Var.getChildAt(i23));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.c6) T.a).a.a(rnVar.V, true);
                                        }
                                    }
                                } else if (i10 == rnVar.G0) {
                                    z10 = !rnVar.T;
                                    rnVar.T = z10;
                                } else if (i10 == rnVar.D0) {
                                    if (!rnVar.b0) {
                                        qb1Var.setItemAnimator(fnVar);
                                        z10 = !rnVar.W;
                                        rnVar.W = z10;
                                        int i24 = rnVar.l0;
                                        rnVar.h0();
                                        if (rnVar.W) {
                                            pnVar.s(rnVar.l0, 3);
                                        } else {
                                            pnVar.t(i24, 3);
                                        }
                                        pnVar.m(rnVar.x0);
                                        if (rnVar.W) {
                                            rnVar.O = false;
                                            int i25 = rnVar.A0;
                                            if (i25 >= 0) {
                                                f2.m1 K4 = qb1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.a).setChecked(false);
                                                } else {
                                                    pnVar.m(rnVar.A0);
                                                }
                                            }
                                        } else {
                                            int i26 = rnVar.A0;
                                            if (i26 >= 0 && qb1Var.K(i26) == null) {
                                                pnVar.m(rnVar.A0);
                                            }
                                        }
                                        rnVar.R();
                                        if (rnVar.W && !rnVar.V) {
                                            boolean z16 = false;
                                            for (int i27 = 0; i27 < zArr.length; i27++) {
                                                if (z16) {
                                                    zArr[i27] = false;
                                                } else if (zArr[i27]) {
                                                    z16 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (rnVar.a0 && !rnVar.W) {
                            m40Var.b(true);
                        }
                        qb1Var.getChildCount();
                        for (int i28 = rnVar.q0; i28 < rnVar.q0 + rnVar.J; i28++) {
                            f2.m1 K5 = qb1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.c6) {
                                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view5;
                                    c6Var.m(rnVar.W, true);
                                    c6Var.r.a(zArr[i28 - rnVar.q0], z12);
                                    if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == rnVar.D0 && !rnVar.a0) {
                                        m40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        m40Var.f(c6Var.getCheckBox(), true);
                                        rnVar.a0 = true;
                                    }
                                }
                            }
                        }
                        if (z11) {
                            ((org.telegram.ui.Cells.s8) view).setChecked(z10);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z10);
                        }
                        rnVar.T();
                        break;
                    }
                }
                break;
            default:
                ov.n((ov) this.c, (ArrayList) this.d, (org.telegram.ui.ActionBar.p2) this.e, this.b, view, i10);
                break;
        }
    }

    public /* synthetic */ um(ov ovVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.c = ovVar;
        this.d = arrayList;
        this.e = p2Var;
        this.b = g6Var;
    }
}
