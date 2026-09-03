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
import org.telegram.ui.rb1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm implements hl0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sm(pn pnVar, org.telegram.ui.ActionBar.f6 f6Var, li liVar, Context context) {
        this.c = pnVar;
        this.b = f6Var;
        this.d = liVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.hl0
    public final void d(int i10, View view) {
        boolean z4;
        boolean z10;
        switch (this.a) {
            case 0:
                pn pnVar = (pn) this.c;
                li liVar = (li) this.d;
                Context context = (Context) this.e;
                l40 l40Var = pnVar.y;
                boolean[] zArr = pnVar.I;
                b7.l0 l0Var = pnVar.K0;
                dn dnVar = pnVar.v;
                nn nnVar = pnVar.r;
                rb1 rb1Var = pnVar.s;
                int i11 = pnVar.I0;
                org.telegram.ui.ActionBar.f6 f6Var = this.b;
                if (i10 == i11) {
                    gh.f fVar = new gh.f(pnVar.getContext(), f6Var);
                    fVar.h0 = new o3.c(pnVar, 4);
                    ArrayList arrayList = pnVar.M0;
                    fVar.Z = null;
                    fVar.l0 = new HashSet(arrayList);
                    fVar.show();
                    break;
                } else if (i10 == pnVar.F0) {
                    p70 F = p70.F(liVar.container, f6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = pnVar.Q0;
                        if (i12 >= iArr.length) {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.kh(pnVar, context, view, f6Var, 10), false);
                            F.t = false;
                            F.s = 0;
                            F.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            x11 a2 = x11.a(i13);
                            int i14 = org.telegram.ui.ActionBar.j6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, pnVar.a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.j6.E8, new ah.a(pnVar, i13, view, 28));
                            i12++;
                        }
                    }
                } else if (i10 == pnVar.r0) {
                    pnVar.P();
                    break;
                } else {
                    boolean z11 = view instanceof org.telegram.ui.Cells.r8;
                    if (z11 || (view instanceof org.telegram.ui.Cells.z5)) {
                        boolean z12 = pnVar.W;
                        fn fnVar = pnVar.x;
                        if (fnVar != null) {
                            fnVar.f();
                        }
                        b7.l0[] l0VarArr = pnVar.L0;
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
                                    pn pnVar2 = (pn) l0Var.c;
                                    nn nnVar2 = pnVar2.r;
                                    if (i10 == i16) {
                                        rb1Var.setItemAnimator(dnVar);
                                        int i17 = l0Var.b;
                                        if (i17 >= 0) {
                                            f2.l1 K = pnVar2.s.K(i17);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.z5) {
                                                    ((org.telegram.ui.Cells.z5) view2).setDivider(z10);
                                                }
                                            }
                                            nnVar2.m(l0Var.b);
                                        }
                                        if (z13) {
                                            nnVar2.t(l0Var.b + 1, 1);
                                        } else {
                                            nnVar2.s(l0Var.b + 1, 1);
                                        }
                                        pnVar.h0();
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
                            if (i10 == pnVar.y0) {
                                z10 = pnVar.U;
                                pnVar.U = !z10;
                                pnVar.R();
                            } else {
                                int i18 = pnVar.v0;
                                if (i10 == i18) {
                                    z10 = !pnVar.c0;
                                    pnVar.c0 = z10;
                                } else if (i10 == pnVar.z0) {
                                    if (!pnVar.W && !pnVar.U) {
                                        pnVar.Q = !pnVar.Q;
                                    }
                                    z10 = pnVar.Q;
                                } else if (i10 == pnVar.B0) {
                                    z10 = !pnVar.P;
                                    pnVar.P = z10;
                                } else if (i10 == pnVar.E0) {
                                    if (pnVar.R == 0 && pnVar.S == 0) {
                                        pnVar.R = 86400;
                                        pnVar.S = 0;
                                        int i19 = pnVar.F0;
                                        pnVar.h0();
                                        if (i19 < 0) {
                                            f2.l1 K2 = rb1Var.K(pnVar.E0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.z5) {
                                                    ((org.telegram.ui.Cells.z5) view3).setDivider(true);
                                                }
                                            }
                                            rb1Var.setItemAnimator(dnVar);
                                            nnVar.s(pnVar.F0, 3);
                                        }
                                    } else {
                                        pnVar.R = 0;
                                        pnVar.S = 0;
                                        int i20 = pnVar.F0;
                                        pnVar.h0();
                                        rb1Var.setItemAnimator(dnVar);
                                        nnVar.t(i20, 3);
                                        f2.l1 K3 = rb1Var.K(pnVar.E0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.z5) {
                                                ((org.telegram.ui.Cells.z5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z10 = (pnVar.R == 0 && pnVar.S == 0) ? false : true;
                                } else if (i10 == pnVar.A0) {
                                    z10 = !pnVar.O;
                                    pnVar.O = z10;
                                } else if (i10 == pnVar.w0) {
                                    z10 = !pnVar.d0;
                                    pnVar.d0 = z10;
                                    pnVar.h0();
                                    int i21 = pnVar.v0;
                                    if (i21 >= 0 && i18 < 0) {
                                        rb1Var.setItemAnimator(dnVar);
                                        nnVar.o(pnVar.v0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        rb1Var.setItemAnimator(dnVar);
                                        nnVar.u(i18);
                                    }
                                } else if (i10 == pnVar.C0) {
                                    boolean z14 = pnVar.V;
                                    z10 = !z14;
                                    pnVar.V = z10;
                                    if (z14 && pnVar.W) {
                                        boolean z15 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z15) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z15 = true;
                                            }
                                        }
                                    }
                                    int childCount = rb1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        f2.l1 T = rb1Var.T(rb1Var.getChildAt(i23));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.b6) T.a).a.a(pnVar.V, true);
                                        }
                                    }
                                } else if (i10 == pnVar.G0) {
                                    z10 = !pnVar.T;
                                    pnVar.T = z10;
                                } else if (i10 == pnVar.D0) {
                                    if (!pnVar.b0) {
                                        rb1Var.setItemAnimator(dnVar);
                                        z10 = !pnVar.W;
                                        pnVar.W = z10;
                                        int i24 = pnVar.l0;
                                        pnVar.h0();
                                        if (pnVar.W) {
                                            nnVar.s(pnVar.l0, 3);
                                        } else {
                                            nnVar.t(i24, 3);
                                        }
                                        nnVar.m(pnVar.x0);
                                        if (pnVar.W) {
                                            pnVar.O = false;
                                            int i25 = pnVar.A0;
                                            if (i25 >= 0) {
                                                f2.l1 K4 = rb1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.z5) K4.a).setChecked(false);
                                                } else {
                                                    nnVar.m(pnVar.A0);
                                                }
                                            }
                                        } else {
                                            int i26 = pnVar.A0;
                                            if (i26 >= 0 && rb1Var.K(i26) == null) {
                                                nnVar.m(pnVar.A0);
                                            }
                                        }
                                        pnVar.R();
                                        if (pnVar.W && !pnVar.V) {
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
                        if (pnVar.a0 && !pnVar.W) {
                            l40Var.b(true);
                        }
                        rb1Var.getChildCount();
                        for (int i28 = pnVar.q0; i28 < pnVar.q0 + pnVar.J; i28++) {
                            f2.l1 K5 = rb1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.b6) {
                                    org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view5;
                                    b6Var.m(pnVar.W, true);
                                    b6Var.r.a(zArr[i28 - pnVar.q0], z12);
                                    if (b6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == pnVar.D0 && !pnVar.a0) {
                                        l40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        l40Var.f(b6Var.getCheckBox(), true);
                                        pnVar.a0 = true;
                                    }
                                }
                            }
                        }
                        if (z11) {
                            ((org.telegram.ui.Cells.r8) view).setChecked(z10);
                        } else if (view instanceof org.telegram.ui.Cells.z5) {
                            ((org.telegram.ui.Cells.z5) view).setChecked(z10);
                        }
                        pnVar.T();
                        break;
                    }
                }
                break;
            default:
                lv.n((lv) this.c, (ArrayList) this.d, (org.telegram.ui.ActionBar.p2) this.e, this.b, view, i10);
                break;
        }
    }

    public /* synthetic */ sm(lv lvVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.c = lvVar;
        this.d = arrayList;
        this.e = p2Var;
        this.b = f6Var;
    }
}
