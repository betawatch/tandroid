package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.xa1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn implements am0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gn(fo foVar, org.telegram.ui.ActionBar.g6 g6Var, ti tiVar, Context context) {
        this.c = foVar;
        this.b = g6Var;
        this.d = tiVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.am0
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                fo foVar = (fo) this.c;
                ti tiVar = (ti) this.d;
                Context context = (Context) this.e;
                r40 r40Var = foVar.y;
                boolean[] zArr = foVar.L;
                c5.f fVar = foVar.N0;
                rn rnVar = foVar.v;
                co coVar = foVar.r;
                xa1 xa1Var = foVar.s;
                int i11 = foVar.L0;
                org.telegram.ui.ActionBar.g6 g6Var = this.b;
                if (i10 == i11) {
                    uh.f fVar2 = new uh.f(foVar.getContext(), g6Var);
                    fVar2.k0 = new l2.f(foVar, 9);
                    ArrayList arrayList = foVar.P0;
                    fVar2.c0 = null;
                    fVar2.o0 = new HashSet(arrayList);
                    fVar2.show();
                    break;
                } else if (i10 == foVar.I0) {
                    j80 F = j80.F(tiVar.container, g6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = foVar.T0;
                        if (i12 >= iArr.length) {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.messenger.camera.i(foVar, context, view, g6Var, 23), false);
                            F.t = false;
                            F.s = 0;
                            F.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            w21 a2 = w21.a(i13);
                            int i14 = org.telegram.ui.ActionBar.k6.F8;
                            org.telegram.ui.ActionBar.r6.z(foVar, a2, i14, g6Var, PorterDuff.Mode.SRC_IN);
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.k6.E8, new org.telegram.ui.h4(foVar, i13, view, 6));
                            i12++;
                        }
                    }
                } else if (i10 == foVar.u0) {
                    foVar.S();
                    break;
                } else {
                    boolean z12 = view instanceof org.telegram.ui.Cells.w8;
                    if (z12 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z13 = foVar.c0;
                        tn tnVar = foVar.x;
                        if (tnVar != null) {
                            tnVar.f();
                        }
                        c5.f[] fVarArr = foVar.O0;
                        int length = fVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                c5.f fVar3 = fVarArr[i15];
                                if (i10 == fVar3.a) {
                                    boolean z14 = fVar3.b;
                                    z11 = !z14;
                                    fVar3.b = z11;
                                    int i16 = fVar.a;
                                    fo foVar2 = (fo) fVar.c;
                                    co coVar2 = foVar2.r;
                                    if (i10 == i16) {
                                        xa1Var.setItemAnimator(rnVar);
                                        int i17 = fVar.a;
                                        if (i17 >= 0) {
                                            s4.b1 K = foVar2.s.K(i17);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            coVar2.m(fVar.a);
                                        }
                                        if (z14) {
                                            coVar2.t(fVar.a + 1, 1);
                                        } else {
                                            coVar2.s(fVar.a + 1, 1);
                                        }
                                        foVar.l0();
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
                            if (i10 == foVar.B0) {
                                z11 = foVar.a0;
                                foVar.a0 = !z11;
                                foVar.U();
                            } else {
                                int i18 = foVar.y0;
                                if (i10 == i18) {
                                    z11 = !foVar.f0;
                                    foVar.f0 = z11;
                                } else if (i10 == foVar.C0) {
                                    if (!foVar.c0 && !foVar.a0) {
                                        foVar.T = !foVar.T;
                                    }
                                    z11 = foVar.T;
                                } else if (i10 == foVar.E0) {
                                    z11 = !foVar.S;
                                    foVar.S = z11;
                                } else if (i10 == foVar.H0) {
                                    if (foVar.U == 0 && foVar.V == 0) {
                                        foVar.U = 86400;
                                        foVar.V = 0;
                                        int i19 = foVar.I0;
                                        foVar.l0();
                                        if (i19 < 0) {
                                            s4.b1 K2 = xa1Var.K(foVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            xa1Var.setItemAnimator(rnVar);
                                            coVar.s(foVar.I0, 3);
                                        }
                                    } else {
                                        foVar.U = 0;
                                        foVar.V = 0;
                                        int i20 = foVar.I0;
                                        foVar.l0();
                                        xa1Var.setItemAnimator(rnVar);
                                        coVar.t(i20, 3);
                                        s4.b1 K3 = xa1Var.K(foVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z11 = (foVar.U == 0 && foVar.V == 0) ? false : true;
                                } else if (i10 == foVar.D0) {
                                    z11 = !foVar.R;
                                    foVar.R = z11;
                                } else if (i10 == foVar.z0) {
                                    z11 = !foVar.g0;
                                    foVar.g0 = z11;
                                    foVar.l0();
                                    int i21 = foVar.y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        xa1Var.setItemAnimator(rnVar);
                                        coVar.o(foVar.y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        xa1Var.setItemAnimator(rnVar);
                                        coVar.u(i18);
                                    }
                                } else if (i10 == foVar.F0) {
                                    boolean z15 = foVar.b0;
                                    z11 = !z15;
                                    foVar.b0 = z11;
                                    if (z15 && foVar.c0) {
                                        boolean z16 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z16) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z16 = true;
                                            }
                                        }
                                    }
                                    int childCount = xa1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.b1 T = xa1Var.T(xa1Var.getChildAt(i23));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.d6) T.a).a.a(foVar.b0, true);
                                        }
                                    }
                                } else if (i10 == foVar.J0) {
                                    z11 = !foVar.W;
                                    foVar.W = z11;
                                } else if (i10 == foVar.G0) {
                                    if (!foVar.e0) {
                                        xa1Var.setItemAnimator(rnVar);
                                        z11 = !foVar.c0;
                                        foVar.c0 = z11;
                                        int i24 = foVar.o0;
                                        foVar.l0();
                                        if (foVar.c0) {
                                            coVar.s(foVar.o0, 3);
                                        } else {
                                            coVar.t(i24, 3);
                                        }
                                        coVar.m(foVar.A0);
                                        if (foVar.c0) {
                                            foVar.R = false;
                                            int i25 = foVar.D0;
                                            if (i25 >= 0) {
                                                s4.b1 K4 = xa1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.a).setChecked(false);
                                                } else {
                                                    coVar.m(foVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = foVar.D0;
                                            if (i26 >= 0 && xa1Var.K(i26) == null) {
                                                coVar.m(foVar.D0);
                                            }
                                        }
                                        foVar.U();
                                        if (foVar.c0 && !foVar.b0) {
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
                        if (foVar.d0 && !foVar.c0) {
                            xa1Var.getChildCount();
                            r40Var.b(true);
                        }
                        for (int i28 = foVar.t0; i28 < foVar.t0 + foVar.M; i28++) {
                            s4.b1 K5 = xa1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.d6) {
                                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view5;
                                    d6Var.m(foVar.c0, true);
                                    d6Var.r.a(zArr[i28 - foVar.t0], z13);
                                    if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == foVar.G0 && !foVar.d0) {
                                        r40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        r40Var.f(d6Var.getCheckBox(), true);
                                        foVar.d0 = true;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        foVar.W();
                        break;
                    }
                }
                break;
            default:
                aw.n((aw) this.c, (ArrayList) this.d, (org.telegram.ui.ActionBar.o2) this.e, this.b, view, i10);
                break;
        }
    }

    public /* synthetic */ gn(aw awVar, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.c = awVar;
        this.d = arrayList;
        this.e = o2Var;
        this.b = g6Var;
    }
}
