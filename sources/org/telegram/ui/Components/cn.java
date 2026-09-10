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
import org.telegram.ui.ic1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn implements jl0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cn(zn znVar, org.telegram.ui.ActionBar.f6 f6Var, yi yiVar, Context context) {
        this.c = znVar;
        this.b = f6Var;
        this.d = yiVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                zn znVar = (zn) this.c;
                yi yiVar = (yi) this.d;
                Context context = (Context) this.e;
                s40 s40Var = znVar.y;
                boolean[] zArr = znVar.L;
                c2.a aVar = znVar.N0;
                nn nnVar = znVar.v;
                xn xnVar = znVar.r;
                ic1 ic1Var = znVar.s;
                int i11 = znVar.L0;
                org.telegram.ui.ActionBar.f6 f6Var = this.b;
                if (i10 == i11) {
                    sh.f fVar = new sh.f(znVar.getContext(), f6Var);
                    fVar.k0 = new m.g3(znVar, 7);
                    ArrayList arrayList = znVar.P0;
                    fVar.c0 = null;
                    fVar.o0 = new HashSet(arrayList);
                    fVar.show();
                    break;
                } else if (i10 == znVar.I0) {
                    w70 F = w70.F(yiVar.container, f6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = znVar.T0;
                        if (i12 >= iArr.length) {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.da(znVar, context, view, f6Var, 15), false);
                            F.t = false;
                            F.s = 0;
                            F.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            j21 a2 = j21.a(i13);
                            int i14 = org.telegram.ui.ActionBar.j6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, znVar.a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.j6.E8, new bi.g3(znVar, i13, view, 28));
                            i12++;
                        }
                    }
                } else if (i10 == znVar.u0) {
                    znVar.P();
                    break;
                } else {
                    boolean z12 = view instanceof org.telegram.ui.Cells.x8;
                    if (z12 || (view instanceof org.telegram.ui.Cells.b6)) {
                        boolean z13 = znVar.c0;
                        pn pnVar = znVar.x;
                        if (pnVar != null) {
                            pnVar.f();
                        }
                        c2.a[] aVarArr = znVar.O0;
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
                                    zn znVar2 = (zn) aVar.c;
                                    xn xnVar2 = znVar2.r;
                                    if (i10 == i16) {
                                        ic1Var.setItemAnimator(nnVar);
                                        int i17 = aVar.b;
                                        if (i17 >= 0) {
                                            s4.c1 K = znVar2.s.K(i17);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.b6) {
                                                    ((org.telegram.ui.Cells.b6) view2).setDivider(z11);
                                                }
                                            }
                                            xnVar2.m(aVar.b);
                                        }
                                        if (z14) {
                                            xnVar2.t(aVar.b + 1, 1);
                                        } else {
                                            xnVar2.s(aVar.b + 1, 1);
                                        }
                                        znVar.h0();
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
                            if (i10 == znVar.B0) {
                                z11 = znVar.a0;
                                znVar.a0 = !z11;
                                znVar.R();
                            } else {
                                int i18 = znVar.y0;
                                if (i10 == i18) {
                                    z11 = !znVar.f0;
                                    znVar.f0 = z11;
                                } else if (i10 == znVar.C0) {
                                    if (!znVar.c0 && !znVar.a0) {
                                        znVar.T = !znVar.T;
                                    }
                                    z11 = znVar.T;
                                } else if (i10 == znVar.E0) {
                                    z11 = !znVar.S;
                                    znVar.S = z11;
                                } else if (i10 == znVar.H0) {
                                    if (znVar.U == 0 && znVar.V == 0) {
                                        znVar.U = 86400;
                                        znVar.V = 0;
                                        int i19 = znVar.I0;
                                        znVar.h0();
                                        if (i19 < 0) {
                                            s4.c1 K2 = ic1Var.K(znVar.H0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.b6) {
                                                    ((org.telegram.ui.Cells.b6) view3).setDivider(true);
                                                }
                                            }
                                            ic1Var.setItemAnimator(nnVar);
                                            xnVar.s(znVar.I0, 3);
                                        }
                                    } else {
                                        znVar.U = 0;
                                        znVar.V = 0;
                                        int i20 = znVar.I0;
                                        znVar.h0();
                                        ic1Var.setItemAnimator(nnVar);
                                        xnVar.t(i20, 3);
                                        s4.c1 K3 = ic1Var.K(znVar.H0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.b6) {
                                                ((org.telegram.ui.Cells.b6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z11 = (znVar.U == 0 && znVar.V == 0) ? false : true;
                                } else if (i10 == znVar.D0) {
                                    z11 = !znVar.R;
                                    znVar.R = z11;
                                } else if (i10 == znVar.z0) {
                                    z11 = !znVar.g0;
                                    znVar.g0 = z11;
                                    znVar.h0();
                                    int i21 = znVar.y0;
                                    if (i21 >= 0 && i18 < 0) {
                                        ic1Var.setItemAnimator(nnVar);
                                        xnVar.o(znVar.y0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        ic1Var.setItemAnimator(nnVar);
                                        xnVar.u(i18);
                                    }
                                } else if (i10 == znVar.F0) {
                                    boolean z15 = znVar.b0;
                                    z11 = !z15;
                                    znVar.b0 = z11;
                                    if (z15 && znVar.c0) {
                                        boolean z16 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z16) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z16 = true;
                                            }
                                        }
                                    }
                                    int childCount = ic1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        s4.c1 T = ic1Var.T(ic1Var.getChildAt(i23));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.e6) T.a).a.a(znVar.b0, true);
                                        }
                                    }
                                } else if (i10 == znVar.J0) {
                                    z11 = !znVar.W;
                                    znVar.W = z11;
                                } else if (i10 == znVar.G0) {
                                    if (!znVar.e0) {
                                        ic1Var.setItemAnimator(nnVar);
                                        z11 = !znVar.c0;
                                        znVar.c0 = z11;
                                        int i24 = znVar.o0;
                                        znVar.h0();
                                        if (znVar.c0) {
                                            xnVar.s(znVar.o0, 3);
                                        } else {
                                            xnVar.t(i24, 3);
                                        }
                                        xnVar.m(znVar.A0);
                                        if (znVar.c0) {
                                            znVar.R = false;
                                            int i25 = znVar.D0;
                                            if (i25 >= 0) {
                                                s4.c1 K4 = ic1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.b6) K4.a).setChecked(false);
                                                } else {
                                                    xnVar.m(znVar.D0);
                                                }
                                            }
                                        } else {
                                            int i26 = znVar.D0;
                                            if (i26 >= 0 && ic1Var.K(i26) == null) {
                                                xnVar.m(znVar.D0);
                                            }
                                        }
                                        znVar.R();
                                        if (znVar.c0 && !znVar.b0) {
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
                        if (znVar.d0 && !znVar.c0) {
                            s40Var.b(true);
                        }
                        ic1Var.getChildCount();
                        for (int i28 = znVar.t0; i28 < znVar.t0 + znVar.M; i28++) {
                            s4.c1 K5 = ic1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.e6) {
                                    org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view5;
                                    e6Var.m(znVar.c0, true);
                                    e6Var.r.a(zArr[i28 - znVar.t0], z13);
                                    if (e6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == znVar.G0 && !znVar.d0) {
                                        s40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        s40Var.f(e6Var.getCheckBox(), true);
                                        znVar.d0 = true;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            ((org.telegram.ui.Cells.x8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.b6) {
                            ((org.telegram.ui.Cells.b6) view).setChecked(z11);
                        }
                        znVar.T();
                        break;
                    }
                }
                break;
            default:
                wv.n((wv) this.c, (ArrayList) this.d, (org.telegram.ui.ActionBar.p2) this.e, this.b, view, i10);
                break;
        }
    }

    public /* synthetic */ cn(wv wvVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.c = wvVar;
        this.d = arrayList;
        this.e = p2Var;
        this.b = f6Var;
    }
}
