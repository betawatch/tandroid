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
import org.telegram.ui.wb1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm implements kl0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wm(vn vnVar, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar, Context context) {
        this.c = vnVar;
        this.b = d6Var;
        this.d = wiVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                vn vnVar = (vn) this.c;
                wi wiVar = (wi) this.d;
                Context context = (Context) this.e;
                j40 j40Var = vnVar.y;
                boolean[] zArr = vnVar.L;
                c2.a aVar = vnVar.N0;
                in inVar = vnVar.v;
                tn tnVar = vnVar.r;
                wb1 wb1Var = vnVar.s;
                int i11 = vnVar.L0;
                org.telegram.ui.ActionBar.d6 d6Var = this.b;
                if (i10 == i11) {
                    th.f fVar = new th.f(vnVar.getContext(), d6Var);
                    fVar.k0 = new l.d(vnVar);
                    ArrayList arrayList = vnVar.P0;
                    fVar.c0 = null;
                    fVar.o0 = new HashSet(arrayList);
                    fVar.show();
                    break;
                } else if (i10 == vnVar.I0) {
                    y70 F = y70.F(wiVar.container, d6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = vnVar.T0;
                        if (i12 >= iArr.length) {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ActionBar.l5(vnVar, context, view, d6Var, 20), false);
                            F.t = false;
                            F.s = 0;
                            F.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            i21 a2 = i21.a(i13);
                            int i14 = org.telegram.ui.ActionBar.h6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i14, vnVar.a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.h6.E8, new xm(vnVar, i13, view, 0));
                            i12++;
                        }
                    }
                } else if (i10 == vnVar.u0) {
                    vnVar.P();
                    break;
                } else {
                    boolean z12 = view instanceof org.telegram.ui.Cells.w8;
                    if (z12 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z13 = vnVar.c0;
                        kn knVar = vnVar.x;
                        if (knVar != null) {
                            knVar.f();
                        }
                        c2.a[] aVarArr = vnVar.O0;
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
                                    vn vnVar2 = (vn) aVar.c;
                                    tn tnVar2 = vnVar2.r;
                                    if (i10 == i16) {
                                        wb1Var.setItemAnimator(inVar);
                                        int i17 = aVar.b;
                                        if (i17 >= 0) {
                                            s4.c1 K = vnVar2.s.K(i17);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            tnVar2.m(aVar.b);
                                        }
                                        if (z14) {
                                            tnVar2.t(aVar.b + 1, 1);
                                        } else {
                                            tnVar2.s(aVar.b + 1, 1);
                                        }
                                        vnVar.h0();
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
                            if (i10 == vnVar.B0) {
                                z11 = vnVar.a0;
                                vnVar.a0 = !z11;
                                vnVar.R();
                            } else {
                                int i18 = vnVar.y0;
                                if (i10 == i18) {
                                    z11 = !vnVar.f0;
                                    vnVar.f0 = z11;
                                } else if (i10 == vnVar.C0) {
                                    if (!vnVar.c0 && !vnVar.a0) {
                                        vnVar.T = !vnVar.T;
                                    }
                                    z11 = vnVar.T;
                                } else if (i10 == vnVar.E0) {
                                    z11 = !vnVar.S;
                                    vnVar.S = z11;
                                } else if (i10 == vnVar.H0) {
                                    if (vnVar.U == 0 && vnVar.V == 0) {
                                        vnVar.U = 86400;
                                        vnVar.V = 0;
                                        int i19 = vnVar.I0;
                                        vnVar.h0();
                                        if (i19 < 0) {
                                            s4.c1 K2 = wb1Var.K(vnVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            wb1Var.setItemAnimator(inVar);
                                            tnVar.s(vnVar.I0, 3);
                                        }
                                    } else {
                                        vnVar.U = 0;
                                        vnVar.V = 0;
                                        int i20 = vnVar.I0;
                                        vnVar.h0();
                                        wb1Var.setItemAnimator(inVar);
                                        tnVar.t(i20, 3);
                                        s4.c1 K3 = wb1Var.K(vnVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z11 = (vnVar.U == 0 && vnVar.V == 0) ? false : true;
                                } else if (i10 == vnVar.D0) {
                                    z11 = !vnVar.R;
                                    vnVar.R = z11;
                                } else if (i10 == vnVar.z0) {
                                    z11 = !vnVar.g0;
                                    vnVar.g0 = z11;
                                    vnVar.h0();
                                    int i21 = vnVar.y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        wb1Var.setItemAnimator(inVar);
                                        tnVar.o(vnVar.y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        wb1Var.setItemAnimator(inVar);
                                        tnVar.u(i18);
                                    }
                                } else if (i10 == vnVar.F0) {
                                    boolean z15 = vnVar.b0;
                                    z11 = !z15;
                                    vnVar.b0 = z11;
                                    if (z15 && vnVar.c0) {
                                        boolean z16 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z16) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z16 = true;
                                            }
                                        }
                                    }
                                    int childCount = wb1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.c1 T = wb1Var.T(wb1Var.getChildAt(i23));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.d6) T.a).a.a(vnVar.b0, true);
                                        }
                                    }
                                } else if (i10 == vnVar.J0) {
                                    z11 = !vnVar.W;
                                    vnVar.W = z11;
                                } else if (i10 == vnVar.G0) {
                                    if (!vnVar.e0) {
                                        wb1Var.setItemAnimator(inVar);
                                        z11 = !vnVar.c0;
                                        vnVar.c0 = z11;
                                        int i24 = vnVar.o0;
                                        vnVar.h0();
                                        if (vnVar.c0) {
                                            tnVar.s(vnVar.o0, 3);
                                        } else {
                                            tnVar.t(i24, 3);
                                        }
                                        tnVar.m(vnVar.A0);
                                        if (vnVar.c0) {
                                            vnVar.R = false;
                                            int i25 = vnVar.D0;
                                            if (i25 >= 0) {
                                                s4.c1 K4 = wb1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.a).setChecked(false);
                                                } else {
                                                    tnVar.m(vnVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = vnVar.D0;
                                            if (i26 >= 0 && wb1Var.K(i26) == null) {
                                                tnVar.m(vnVar.D0);
                                            }
                                        }
                                        vnVar.R();
                                        if (vnVar.c0 && !vnVar.b0) {
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
                        if (vnVar.d0 && !vnVar.c0) {
                            j40Var.b(true);
                        }
                        wb1Var.getChildCount();
                        for (int i28 = vnVar.t0; i28 < vnVar.t0 + vnVar.M; i28++) {
                            s4.c1 K5 = wb1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.d6) {
                                    org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view5;
                                    d6Var2.m(vnVar.c0, true);
                                    d6Var2.r.a(zArr[i28 - vnVar.t0], z13);
                                    if (d6Var2.getTop() > AndroidUtilities.dp(40.0f) && i10 == vnVar.G0 && !vnVar.d0) {
                                        j40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        j40Var.f(d6Var2.getCheckBox(), true);
                                        vnVar.d0 = true;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        vnVar.T();
                        break;
                    }
                }
                break;
            default:
                tv.n((tv) this.c, (ArrayList) this.d, (org.telegram.ui.ActionBar.m2) this.e, this.b, view, i10);
                break;
        }
    }

    public /* synthetic */ wm(tv tvVar, ArrayList arrayList, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.c = tvVar;
        this.d = arrayList;
        this.e = m2Var;
        this.b = d6Var;
    }
}
