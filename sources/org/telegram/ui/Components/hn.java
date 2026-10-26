package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn implements zl0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hn(go goVar, org.telegram.ui.ActionBar.u6 u6Var, ti tiVar, Context context) {
        this.c = goVar;
        this.b = u6Var;
        this.d = tiVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.zl0
    public final void c(int i10, View view) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                go goVar = (go) this.c;
                ti tiVar = (ti) this.d;
                Context context = (Context) this.e;
                t40 t40Var = goVar.y;
                boolean[] zArr = goVar.L;
                d5.f fVar = goVar.N0;
                sn snVar = goVar.v;
                eo eoVar = goVar.r;
                org.telegram.ui.za1 za1Var = goVar.s;
                int i11 = goVar.L0;
                org.telegram.ui.ActionBar.u6 u6Var = this.b;
                if (i10 == i11) {
                    vh.f fVar2 = new vh.f(goVar.getContext(), u6Var);
                    fVar2.k0 = new li.e3(goVar, 8);
                    ArrayList arrayList = goVar.P0;
                    fVar2.c0 = null;
                    fVar2.o0 = new HashSet(arrayList);
                    fVar2.show();
                    break;
                } else if (i10 == goVar.I0) {
                    k80 F = k80.F(tiVar.container, u6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = goVar.T0;
                        if (i12 >= iArr.length) {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new m4.v0(goVar, context, view, u6Var, 26), false);
                            F.t = false;
                            F.s = 0;
                            F.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            e31 a2 = e31.a(i13);
                            int i14 = org.telegram.ui.ActionBar.y6.F8;
                            org.telegram.ui.ActionBar.f7.y(goVar, a2, i14, u6Var, PorterDuff.Mode.SRC_IN);
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.y6.E8, new org.telegram.ui.g4(goVar, i13, view, 6));
                            i12++;
                        }
                    }
                } else if (i10 == goVar.u0) {
                    goVar.S();
                    break;
                } else {
                    boolean z12 = view instanceof org.telegram.ui.Cells.a9;
                    if (z12 || (view instanceof org.telegram.ui.Cells.e6)) {
                        boolean z13 = goVar.c0;
                        un unVar = goVar.x;
                        if (unVar != null) {
                            unVar.f();
                        }
                        d5.f[] fVarArr = goVar.O0;
                        int length = fVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                d5.f fVar3 = fVarArr[i15];
                                if (i10 == fVar3.a) {
                                    boolean z14 = fVar3.b;
                                    z11 = !z14;
                                    fVar3.b = z11;
                                    int i16 = fVar.a;
                                    go goVar2 = (go) fVar.c;
                                    eo eoVar2 = goVar2.r;
                                    if (i10 == i16) {
                                        za1Var.setItemAnimator(snVar);
                                        int i17 = fVar.a;
                                        if (i17 >= 0) {
                                            s4.e1 K = goVar2.s.K(i17);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.e6) {
                                                    ((org.telegram.ui.Cells.e6) view2).setDivider(z11);
                                                }
                                            }
                                            eoVar2.m(fVar.a);
                                        }
                                        if (z14) {
                                            eoVar2.t(fVar.a + 1, 1);
                                        } else {
                                            eoVar2.s(fVar.a + 1, 1);
                                        }
                                        goVar.l0();
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
                            if (i10 == goVar.B0) {
                                z11 = goVar.a0;
                                goVar.a0 = !z11;
                                goVar.U();
                            } else {
                                int i18 = goVar.y0;
                                if (i10 == i18) {
                                    z11 = !goVar.f0;
                                    goVar.f0 = z11;
                                } else if (i10 == goVar.C0) {
                                    if (!goVar.c0 && !goVar.a0) {
                                        goVar.T = !goVar.T;
                                    }
                                    z11 = goVar.T;
                                } else if (i10 == goVar.E0) {
                                    z11 = !goVar.S;
                                    goVar.S = z11;
                                } else if (i10 == goVar.H0) {
                                    if (goVar.U == 0 && goVar.V == 0) {
                                        goVar.U = 86400;
                                        goVar.V = 0;
                                        int i19 = goVar.I0;
                                        goVar.l0();
                                        if (i19 < 0) {
                                            s4.e1 K2 = za1Var.K(goVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.e6) {
                                                    ((org.telegram.ui.Cells.e6) view3).setDivider(true);
                                                }
                                            }
                                            za1Var.setItemAnimator(snVar);
                                            eoVar.s(goVar.I0, 3);
                                        }
                                    } else {
                                        goVar.U = 0;
                                        goVar.V = 0;
                                        int i20 = goVar.I0;
                                        goVar.l0();
                                        za1Var.setItemAnimator(snVar);
                                        eoVar.t(i20, 3);
                                        s4.e1 K3 = za1Var.K(goVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.e6) {
                                                ((org.telegram.ui.Cells.e6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z11 = (goVar.U == 0 && goVar.V == 0) ? false : true;
                                } else if (i10 == goVar.D0) {
                                    z11 = !goVar.R;
                                    goVar.R = z11;
                                } else if (i10 == goVar.z0) {
                                    z11 = !goVar.g0;
                                    goVar.g0 = z11;
                                    goVar.l0();
                                    int i21 = goVar.y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        za1Var.setItemAnimator(snVar);
                                        eoVar.o(goVar.y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        za1Var.setItemAnimator(snVar);
                                        eoVar.u(i18);
                                    }
                                } else if (i10 == goVar.F0) {
                                    boolean z15 = goVar.b0;
                                    z11 = !z15;
                                    goVar.b0 = z11;
                                    if (z15 && goVar.c0) {
                                        boolean z16 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z16) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z16 = true;
                                            }
                                        }
                                    }
                                    int childCount = za1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.e1 T = za1Var.T(za1Var.getChildAt(i23));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.h6) T.a).a.a(goVar.b0, true);
                                        }
                                    }
                                } else if (i10 == goVar.J0) {
                                    z11 = !goVar.W;
                                    goVar.W = z11;
                                } else if (i10 == goVar.G0) {
                                    if (!goVar.e0) {
                                        za1Var.setItemAnimator(snVar);
                                        z11 = !goVar.c0;
                                        goVar.c0 = z11;
                                        int i24 = goVar.o0;
                                        goVar.l0();
                                        if (goVar.c0) {
                                            eoVar.s(goVar.o0, 3);
                                        } else {
                                            eoVar.t(i24, 3);
                                        }
                                        eoVar.m(goVar.A0);
                                        if (goVar.c0) {
                                            goVar.R = false;
                                            int i25 = goVar.D0;
                                            if (i25 >= 0) {
                                                s4.e1 K4 = za1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.e6) K4.a).setChecked(false);
                                                } else {
                                                    eoVar.m(goVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = goVar.D0;
                                            if (i26 >= 0 && za1Var.K(i26) == null) {
                                                eoVar.m(goVar.D0);
                                            }
                                        }
                                        goVar.U();
                                        if (goVar.c0 && !goVar.b0) {
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
                        if (goVar.d0 && !goVar.c0) {
                            za1Var.getChildCount();
                            t40Var.b(true);
                        }
                        for (int i28 = goVar.t0; i28 < goVar.t0 + goVar.M; i28++) {
                            s4.e1 K5 = za1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.h6) {
                                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view5;
                                    h6Var.m(goVar.c0, true);
                                    h6Var.r.a(zArr[i28 - goVar.t0], z13);
                                    if (h6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == goVar.G0 && !goVar.d0) {
                                        t40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        t40Var.f(h6Var.getCheckBox(), true);
                                        goVar.d0 = true;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            ((org.telegram.ui.Cells.a9) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.e6) {
                            ((org.telegram.ui.Cells.e6) view).setChecked(z11);
                        }
                        goVar.W();
                        break;
                    }
                }
                break;
            default:
                aw.n((aw) this.c, (ArrayList) this.d, (org.telegram.ui.ActionBar.r2) this.e, this.b, view, i10);
                break;
        }
    }

    public /* synthetic */ hn(aw awVar, ArrayList arrayList, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        this.c = awVar;
        this.d = arrayList;
        this.e = r2Var;
        this.b = u6Var;
    }
}
