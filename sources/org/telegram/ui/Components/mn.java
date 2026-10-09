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
import org.telegram.ui.fc1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn implements em0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mn(lo loVar, org.telegram.ui.ActionBar.e6 e6Var, yi yiVar, Context context) {
        this.c = loVar;
        this.b = e6Var;
        this.d = yiVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.em0
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                lo loVar = (lo) this.c;
                yi yiVar = (yi) this.d;
                Context context = (Context) this.e;
                z40 z40Var = loVar.y;
                boolean[] zArr = loVar.L;
                c2.a aVar = loVar.N0;
                xn xnVar = loVar.v;
                jo joVar = loVar.r;
                fc1 fc1Var = loVar.s;
                int i11 = loVar.L0;
                org.telegram.ui.ActionBar.e6 e6Var = this.b;
                if (i10 == i11) {
                    th.f fVar = new th.f(loVar.getContext(), e6Var);
                    fVar.k0 = new m2.t(loVar, 7);
                    ArrayList arrayList = loVar.P0;
                    fVar.c0 = null;
                    fVar.o0 = new HashSet(arrayList);
                    fVar.show();
                    break;
                } else if (i10 == loVar.I0) {
                    p80 F = p80.F(yiVar.container, e6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = loVar.T0;
                        if (i12 >= iArr.length) {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ActionBar.n5(loVar, context, view, e6Var, 20), false);
                            F.t = false;
                            F.s = 0;
                            F.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            a31 a2 = a31.a(i13);
                            int i14 = org.telegram.ui.ActionBar.i6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i14, loVar.a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.i6.E8, new zk(loVar, i13, view, 1));
                            i12++;
                        }
                    }
                } else if (i10 == loVar.u0) {
                    loVar.S();
                    break;
                } else {
                    boolean z12 = view instanceof org.telegram.ui.Cells.w8;
                    if (z12 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z13 = loVar.c0;
                        zn znVar = loVar.x;
                        if (znVar != null) {
                            znVar.f();
                        }
                        c2.a[] aVarArr = loVar.O0;
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
                                    lo loVar2 = (lo) aVar.c;
                                    jo joVar2 = loVar2.r;
                                    if (i10 == i16) {
                                        fc1Var.setItemAnimator(xnVar);
                                        int i17 = aVar.b;
                                        if (i17 >= 0) {
                                            s4.d1 K = loVar2.s.K(i17);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            joVar2.m(aVar.b);
                                        }
                                        if (z14) {
                                            joVar2.t(aVar.b + 1, 1);
                                        } else {
                                            joVar2.s(aVar.b + 1, 1);
                                        }
                                        loVar.k0();
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
                            if (i10 == loVar.B0) {
                                z11 = loVar.a0;
                                loVar.a0 = !z11;
                                loVar.U();
                            } else {
                                int i18 = loVar.y0;
                                if (i10 == i18) {
                                    z11 = !loVar.f0;
                                    loVar.f0 = z11;
                                } else if (i10 == loVar.C0) {
                                    if (!loVar.c0 && !loVar.a0) {
                                        loVar.T = !loVar.T;
                                    }
                                    z11 = loVar.T;
                                } else if (i10 == loVar.E0) {
                                    z11 = !loVar.S;
                                    loVar.S = z11;
                                } else if (i10 == loVar.H0) {
                                    if (loVar.U == 0 && loVar.V == 0) {
                                        loVar.U = 86400;
                                        loVar.V = 0;
                                        int i19 = loVar.I0;
                                        loVar.k0();
                                        if (i19 < 0) {
                                            s4.d1 K2 = fc1Var.K(loVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            fc1Var.setItemAnimator(xnVar);
                                            joVar.s(loVar.I0, 3);
                                        }
                                    } else {
                                        loVar.U = 0;
                                        loVar.V = 0;
                                        int i20 = loVar.I0;
                                        loVar.k0();
                                        fc1Var.setItemAnimator(xnVar);
                                        joVar.t(i20, 3);
                                        s4.d1 K3 = fc1Var.K(loVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z11 = (loVar.U == 0 && loVar.V == 0) ? false : true;
                                } else if (i10 == loVar.D0) {
                                    z11 = !loVar.R;
                                    loVar.R = z11;
                                } else if (i10 == loVar.z0) {
                                    z11 = !loVar.g0;
                                    loVar.g0 = z11;
                                    loVar.k0();
                                    int i21 = loVar.y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        fc1Var.setItemAnimator(xnVar);
                                        joVar.o(loVar.y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        fc1Var.setItemAnimator(xnVar);
                                        joVar.u(i18);
                                    }
                                } else if (i10 == loVar.F0) {
                                    boolean z15 = loVar.b0;
                                    z11 = !z15;
                                    loVar.b0 = z11;
                                    if (z15 && loVar.c0) {
                                        boolean z16 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z16) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z16 = true;
                                            }
                                        }
                                    }
                                    int childCount = fc1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.d1 T = fc1Var.T(fc1Var.getChildAt(i23));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.d6) T.a).a.a(loVar.b0, true);
                                        }
                                    }
                                } else if (i10 == loVar.J0) {
                                    z11 = !loVar.W;
                                    loVar.W = z11;
                                } else if (i10 == loVar.G0) {
                                    if (!loVar.e0) {
                                        fc1Var.setItemAnimator(xnVar);
                                        z11 = !loVar.c0;
                                        loVar.c0 = z11;
                                        int i24 = loVar.o0;
                                        loVar.k0();
                                        if (loVar.c0) {
                                            joVar.s(loVar.o0, 3);
                                        } else {
                                            joVar.t(i24, 3);
                                        }
                                        joVar.m(loVar.A0);
                                        if (loVar.c0) {
                                            loVar.R = false;
                                            int i25 = loVar.D0;
                                            if (i25 >= 0) {
                                                s4.d1 K4 = fc1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.a).setChecked(false);
                                                } else {
                                                    joVar.m(loVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = loVar.D0;
                                            if (i26 >= 0 && fc1Var.K(i26) == null) {
                                                joVar.m(loVar.D0);
                                            }
                                        }
                                        loVar.U();
                                        if (loVar.c0 && !loVar.b0) {
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
                        if (loVar.d0 && !loVar.c0) {
                            z40Var.b(true);
                        }
                        fc1Var.getChildCount();
                        for (int i28 = loVar.t0; i28 < loVar.t0 + loVar.M; i28++) {
                            s4.d1 K5 = fc1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.d6) {
                                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view5;
                                    d6Var.m(loVar.c0, true);
                                    d6Var.r.a(zArr[i28 - loVar.t0], z13);
                                    if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == loVar.G0 && !loVar.d0) {
                                        z40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        z40Var.f(d6Var.getCheckBox(), true);
                                        loVar.d0 = true;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        loVar.W();
                        break;
                    }
                }
                break;
            default:
                iw.p((iw) this.c, (ArrayList) this.d, (org.telegram.ui.ActionBar.n2) this.e, this.b, view, i10);
                break;
        }
    }

    public /* synthetic */ mn(iw iwVar, ArrayList arrayList, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.c = iwVar;
        this.d = arrayList;
        this.e = n2Var;
        this.b = e6Var;
    }
}
