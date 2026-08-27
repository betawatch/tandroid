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
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jm implements pk0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jm(in inVar, org.telegram.ui.ActionBar.c6 c6Var, gi giVar, Context context) {
        this.c = inVar;
        this.b = c6Var;
        this.d = giVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void a(int i10, View view) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                in inVar = (in) this.c;
                gi giVar = (gi) this.d;
                Context context = (Context) this.e;
                x30 x30Var = inVar.y;
                boolean[] zArr = inVar.H;
                m.a aVar = inVar.J0;
                vm vmVar = inVar.v;
                gn gnVar = inVar.r;
                ta1 ta1Var = inVar.s;
                int i11 = inVar.H0;
                org.telegram.ui.ActionBar.c6 c6Var = this.b;
                if (i10 == i11) {
                    ch.h hVar = new ch.h(inVar.getContext(), c6Var);
                    hVar.g0 = new n2.b0(inVar, 9);
                    ArrayList arrayList = inVar.L0;
                    hVar.Y = null;
                    hVar.k0 = new HashSet(arrayList);
                    hVar.show();
                    break;
                } else if (i10 == inVar.E0) {
                    b70 F = b70.F(giVar.container, c6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = inVar.P0;
                        if (i12 >= iArr.length) {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.yf(inVar, context, view, c6Var, 14), false);
                            F.t = false;
                            F.s = 0;
                            F.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            c11 a2 = c11.a(i13);
                            int i14 = org.telegram.ui.ActionBar.g6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i14, inVar.a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.g6.E8, new km(inVar, i13, view, 0));
                            i12++;
                        }
                    }
                } else if (i10 == inVar.q0) {
                    inVar.P();
                    break;
                } else {
                    boolean z12 = view instanceof org.telegram.ui.Cells.p8;
                    if (z12 || (view instanceof org.telegram.ui.Cells.x5)) {
                        boolean z13 = inVar.V;
                        ym ymVar = inVar.x;
                        if (ymVar != null) {
                            ymVar.f();
                        }
                        m.a[] aVarArr = inVar.K0;
                        int length = aVarArr.length;
                        int i15 = 0;
                        while (true) {
                            if (i15 < length) {
                                m.a aVar2 = aVarArr[i15];
                                if (i10 == aVar2.b) {
                                    boolean z14 = aVar2.a;
                                    z11 = !z14;
                                    aVar2.a = z11;
                                    int i16 = aVar.b;
                                    in inVar2 = (in) aVar.c;
                                    gn gnVar2 = inVar2.r;
                                    if (i10 == i16) {
                                        ta1Var.setItemAnimator(vmVar);
                                        int i17 = aVar.b;
                                        if (i17 >= 0) {
                                            f2.o1 K = inVar2.s.K(i17);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.x5) {
                                                    ((org.telegram.ui.Cells.x5) view2).setDivider(z11);
                                                }
                                            }
                                            gnVar2.m(aVar.b);
                                        }
                                        if (z14) {
                                            gnVar2.t(aVar.b + 1, 1);
                                        } else {
                                            gnVar2.s(aVar.b + 1, 1);
                                        }
                                        inVar.h0();
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
                            if (i10 == inVar.x0) {
                                z11 = inVar.T;
                                inVar.T = !z11;
                                inVar.R();
                            } else {
                                int i18 = inVar.u0;
                                if (i10 == i18) {
                                    z11 = !inVar.b0;
                                    inVar.b0 = z11;
                                } else if (i10 == inVar.y0) {
                                    if (!inVar.V && !inVar.T) {
                                        inVar.P = !inVar.P;
                                    }
                                    z11 = inVar.P;
                                } else if (i10 == inVar.A0) {
                                    z11 = !inVar.O;
                                    inVar.O = z11;
                                } else if (i10 == inVar.D0) {
                                    if (inVar.Q == 0 && inVar.R == 0) {
                                        inVar.Q = 86400;
                                        inVar.R = 0;
                                        int i19 = inVar.E0;
                                        inVar.h0();
                                        if (i19 < 0) {
                                            f2.o1 K2 = ta1Var.K(inVar.D0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.x5) {
                                                    ((org.telegram.ui.Cells.x5) view3).setDivider(true);
                                                }
                                            }
                                            ta1Var.setItemAnimator(vmVar);
                                            gnVar.s(inVar.E0, 3);
                                        }
                                    } else {
                                        inVar.Q = 0;
                                        inVar.R = 0;
                                        int i20 = inVar.E0;
                                        inVar.h0();
                                        ta1Var.setItemAnimator(vmVar);
                                        gnVar.t(i20, 3);
                                        f2.o1 K3 = ta1Var.K(inVar.D0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.x5) {
                                                ((org.telegram.ui.Cells.x5) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z11 = (inVar.Q == 0 && inVar.R == 0) ? false : true;
                                } else if (i10 == inVar.z0) {
                                    z11 = !inVar.N;
                                    inVar.N = z11;
                                } else if (i10 == inVar.v0) {
                                    z11 = !inVar.c0;
                                    inVar.c0 = z11;
                                    inVar.h0();
                                    int i21 = inVar.u0;
                                    if (i21 >= 0 && i18 < 0) {
                                        ta1Var.setItemAnimator(vmVar);
                                        gnVar.o(inVar.u0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        ta1Var.setItemAnimator(vmVar);
                                        gnVar.u(i18);
                                    }
                                } else if (i10 == inVar.B0) {
                                    boolean z15 = inVar.U;
                                    z11 = !z15;
                                    inVar.U = z11;
                                    if (z15 && inVar.V) {
                                        boolean z16 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z16) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z16 = true;
                                            }
                                        }
                                    }
                                    int childCount = ta1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        f2.o1 T = ta1Var.T(ta1Var.getChildAt(i23));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.z5) T.a).a.a(inVar.U, true);
                                        }
                                    }
                                } else if (i10 == inVar.F0) {
                                    z11 = !inVar.S;
                                    inVar.S = z11;
                                } else if (i10 == inVar.C0) {
                                    if (!inVar.a0) {
                                        ta1Var.setItemAnimator(vmVar);
                                        z11 = !inVar.V;
                                        inVar.V = z11;
                                        int i24 = inVar.k0;
                                        inVar.h0();
                                        if (inVar.V) {
                                            gnVar.s(inVar.k0, 3);
                                        } else {
                                            gnVar.t(i24, 3);
                                        }
                                        gnVar.m(inVar.w0);
                                        if (inVar.V) {
                                            inVar.N = false;
                                            int i25 = inVar.z0;
                                            if (i25 >= 0) {
                                                f2.o1 K4 = ta1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.x5) K4.a).setChecked(false);
                                                } else {
                                                    gnVar.m(inVar.z0);
                                                }
                                            }
                                        } else {
                                            int i26 = inVar.z0;
                                            if (i26 >= 0 && ta1Var.K(i26) == null) {
                                                gnVar.m(inVar.z0);
                                            }
                                        }
                                        inVar.R();
                                        if (inVar.V && !inVar.U) {
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
                        if (inVar.W && !inVar.V) {
                            x30Var.b(true);
                        }
                        ta1Var.getChildCount();
                        for (int i28 = inVar.p0; i28 < inVar.p0 + inVar.I; i28++) {
                            f2.o1 K5 = ta1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.z5) {
                                    org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view5;
                                    z5Var.m(inVar.V, true);
                                    z5Var.r.a(zArr[i28 - inVar.p0], z13);
                                    if (z5Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == inVar.C0 && !inVar.W) {
                                        x30Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        x30Var.f(z5Var.getCheckBox(), true);
                                        inVar.W = true;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            ((org.telegram.ui.Cells.p8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.x5) {
                            ((org.telegram.ui.Cells.x5) view).setChecked(z11);
                        }
                        inVar.T();
                        break;
                    }
                }
                break;
            default:
                cv.n((cv) this.c, (ArrayList) this.d, (org.telegram.ui.ActionBar.n2) this.e, this.b, view, i10);
                break;
        }
    }

    public /* synthetic */ jm(cv cvVar, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.c = cvVar;
        this.d = arrayList;
        this.e = n2Var;
        this.b = c6Var;
    }
}
