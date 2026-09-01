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
import org.telegram.ui.kb1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements jl0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vm(sn snVar, org.telegram.ui.ActionBar.g6 g6Var, mi miVar, Context context) {
        this.c = snVar;
        this.b = g6Var;
        this.d = miVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void f(int i10, View view) {
        boolean z4;
        boolean z10;
        switch (this.a) {
            case 0:
                sn snVar = (sn) this.c;
                mi miVar = (mi) this.d;
                Context context = (Context) this.e;
                m40 m40Var = snVar.y;
                boolean[] zArr = snVar.I;
                b7.l0 l0Var = snVar.K0;
                gn gnVar = snVar.v;
                qn qnVar = snVar.r;
                kb1 kb1Var = snVar.s;
                int i11 = snVar.I0;
                org.telegram.ui.ActionBar.g6 g6Var = this.b;
                if (i10 == i11) {
                    hh.f fVar = new hh.f(snVar.getContext(), g6Var);
                    fVar.h0 = new androidx.biometric.f0(snVar, 26);
                    ArrayList arrayList = snVar.M0;
                    fVar.Z = null;
                    fVar.l0 = new HashSet(arrayList);
                    fVar.show();
                    break;
                } else if (i10 == snVar.F0) {
                    q70 F = q70.F(miVar.container, g6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = snVar.Q0;
                        if (i12 >= iArr.length) {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ih(snVar, context, view, g6Var, 10), false);
                            F.t = false;
                            F.s = 0;
                            F.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            y11 a2 = y11.a(i13);
                            int i14 = org.telegram.ui.ActionBar.k6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i14, snVar.a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.k6.E8, new bh.a(snVar, i13, view, 28));
                            i12++;
                        }
                    }
                } else if (i10 == snVar.r0) {
                    snVar.P();
                    break;
                } else {
                    boolean z11 = view instanceof org.telegram.ui.Cells.s8;
                    if (z11 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z12 = snVar.W;
                        in inVar = snVar.x;
                        if (inVar != null) {
                            inVar.f();
                        }
                        b7.l0[] l0VarArr = snVar.L0;
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
                                    sn snVar2 = (sn) l0Var.c;
                                    qn qnVar2 = snVar2.r;
                                    if (i10 == i16) {
                                        kb1Var.setItemAnimator(gnVar);
                                        int i17 = l0Var.b;
                                        if (i17 >= 0) {
                                            f2.m1 K = snVar2.s.K(i17);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z10);
                                                }
                                            }
                                            qnVar2.m(l0Var.b);
                                        }
                                        if (z13) {
                                            qnVar2.t(l0Var.b + 1, 1);
                                        } else {
                                            qnVar2.s(l0Var.b + 1, 1);
                                        }
                                        snVar.h0();
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
                            if (i10 == snVar.y0) {
                                z10 = snVar.U;
                                snVar.U = !z10;
                                snVar.R();
                            } else {
                                int i18 = snVar.v0;
                                if (i10 == i18) {
                                    z10 = !snVar.c0;
                                    snVar.c0 = z10;
                                } else if (i10 == snVar.z0) {
                                    if (!snVar.W && !snVar.U) {
                                        snVar.Q = !snVar.Q;
                                    }
                                    z10 = snVar.Q;
                                } else if (i10 == snVar.B0) {
                                    z10 = !snVar.P;
                                    snVar.P = z10;
                                } else if (i10 == snVar.E0) {
                                    if (snVar.R == 0 && snVar.S == 0) {
                                        snVar.R = 86400;
                                        snVar.S = 0;
                                        int i19 = snVar.F0;
                                        snVar.h0();
                                        if (i19 < 0) {
                                            f2.m1 K2 = kb1Var.K(snVar.E0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            kb1Var.setItemAnimator(gnVar);
                                            qnVar.s(snVar.F0, 3);
                                        }
                                    } else {
                                        snVar.R = 0;
                                        snVar.S = 0;
                                        int i20 = snVar.F0;
                                        snVar.h0();
                                        kb1Var.setItemAnimator(gnVar);
                                        qnVar.t(i20, 3);
                                        f2.m1 K3 = kb1Var.K(snVar.E0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z10 = (snVar.R == 0 && snVar.S == 0) ? false : true;
                                } else if (i10 == snVar.A0) {
                                    z10 = !snVar.O;
                                    snVar.O = z10;
                                } else if (i10 == snVar.w0) {
                                    z10 = !snVar.d0;
                                    snVar.d0 = z10;
                                    snVar.h0();
                                    int i21 = snVar.v0;
                                    if (i21 >= 0 && i18 < 0) {
                                        kb1Var.setItemAnimator(gnVar);
                                        qnVar.o(snVar.v0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        kb1Var.setItemAnimator(gnVar);
                                        qnVar.u(i18);
                                    }
                                } else if (i10 == snVar.C0) {
                                    boolean z14 = snVar.V;
                                    z10 = !z14;
                                    snVar.V = z10;
                                    if (z14 && snVar.W) {
                                        boolean z15 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z15) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z15 = true;
                                            }
                                        }
                                    }
                                    int childCount = kb1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        f2.m1 T = kb1Var.T(kb1Var.getChildAt(i23));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.c6) T.a).a.a(snVar.V, true);
                                        }
                                    }
                                } else if (i10 == snVar.G0) {
                                    z10 = !snVar.T;
                                    snVar.T = z10;
                                } else if (i10 == snVar.D0) {
                                    if (!snVar.b0) {
                                        kb1Var.setItemAnimator(gnVar);
                                        z10 = !snVar.W;
                                        snVar.W = z10;
                                        int i24 = snVar.l0;
                                        snVar.h0();
                                        if (snVar.W) {
                                            qnVar.s(snVar.l0, 3);
                                        } else {
                                            qnVar.t(i24, 3);
                                        }
                                        qnVar.m(snVar.x0);
                                        if (snVar.W) {
                                            snVar.O = false;
                                            int i25 = snVar.A0;
                                            if (i25 >= 0) {
                                                f2.m1 K4 = kb1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.a).setChecked(false);
                                                } else {
                                                    qnVar.m(snVar.A0);
                                                }
                                            }
                                        } else {
                                            int i26 = snVar.A0;
                                            if (i26 >= 0 && kb1Var.K(i26) == null) {
                                                qnVar.m(snVar.A0);
                                            }
                                        }
                                        snVar.R();
                                        if (snVar.W && !snVar.V) {
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
                        if (snVar.a0 && !snVar.W) {
                            m40Var.b(true);
                        }
                        kb1Var.getChildCount();
                        for (int i28 = snVar.q0; i28 < snVar.q0 + snVar.J; i28++) {
                            f2.m1 K5 = kb1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.c6) {
                                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view5;
                                    c6Var.m(snVar.W, true);
                                    c6Var.r.a(zArr[i28 - snVar.q0], z12);
                                    if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == snVar.D0 && !snVar.a0) {
                                        m40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        m40Var.f(c6Var.getCheckBox(), true);
                                        snVar.a0 = true;
                                    }
                                }
                            }
                        }
                        if (z11) {
                            ((org.telegram.ui.Cells.s8) view).setChecked(z10);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z10);
                        }
                        snVar.T();
                        break;
                    }
                }
                break;
            default:
                ov.n((ov) this.c, (ArrayList) this.d, (org.telegram.ui.ActionBar.p2) this.e, this.b, view, i10);
                break;
        }
    }

    public /* synthetic */ vm(ov ovVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.c = ovVar;
        this.d = arrayList;
        this.e = p2Var;
        this.b = g6Var;
    }
}
