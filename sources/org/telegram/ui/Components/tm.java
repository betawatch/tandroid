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
import org.telegram.ui.jb1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements il0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tm(qn qnVar, org.telegram.ui.ActionBar.f6 f6Var, li liVar, Context context) {
        this.c = qnVar;
        this.b = f6Var;
        this.d = liVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final void f(int i10, View view) {
        boolean z4;
        boolean z10;
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.c;
                li liVar = (li) this.d;
                Context context = (Context) this.e;
                k40 k40Var = qnVar.y;
                boolean[] zArr = qnVar.I;
                b7.l0 l0Var = qnVar.K0;
                en enVar = qnVar.v;
                on onVar = qnVar.r;
                jb1 jb1Var = qnVar.s;
                int i11 = qnVar.I0;
                org.telegram.ui.ActionBar.f6 f6Var = this.b;
                if (i10 == i11) {
                    gh.f fVar = new gh.f(qnVar.getContext(), f6Var);
                    fVar.h0 = new androidx.biometric.f0(qnVar, 28);
                    ArrayList arrayList = qnVar.M0;
                    fVar.Z = null;
                    fVar.l0 = new HashSet(arrayList);
                    fVar.show();
                    break;
                } else if (i10 == qnVar.F0) {
                    o70 F = o70.F(liVar.container, f6Var, view);
                    int i12 = 0;
                    while (true) {
                        int[] iArr = qnVar.Q0;
                        if (i12 >= iArr.length) {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.ih(qnVar, context, view, f6Var, 10), false);
                            F.t = false;
                            F.s = 0;
                            F.Z();
                            break;
                        } else {
                            int i13 = iArr[i12];
                            x11 a2 = x11.a(i13);
                            int i14 = org.telegram.ui.ActionBar.j6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i14, qnVar.a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i13 / 3600, new Object[0]), i14, org.telegram.ui.ActionBar.j6.E8, new ah.a(qnVar, i13, view, 28));
                            i12++;
                        }
                    }
                } else if (i10 == qnVar.r0) {
                    qnVar.P();
                    break;
                } else {
                    boolean z11 = view instanceof org.telegram.ui.Cells.s8;
                    if (z11 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z12 = qnVar.W;
                        gn gnVar = qnVar.x;
                        if (gnVar != null) {
                            gnVar.f();
                        }
                        b7.l0[] l0VarArr = qnVar.L0;
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
                                    qn qnVar2 = (qn) l0Var.c;
                                    on onVar2 = qnVar2.r;
                                    if (i10 == i16) {
                                        jb1Var.setItemAnimator(enVar);
                                        int i17 = l0Var.b;
                                        if (i17 >= 0) {
                                            f2.l1 K = qnVar2.s.K(i17);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z10);
                                                }
                                            }
                                            onVar2.m(l0Var.b);
                                        }
                                        if (z13) {
                                            onVar2.t(l0Var.b + 1, 1);
                                        } else {
                                            onVar2.s(l0Var.b + 1, 1);
                                        }
                                        qnVar.h0();
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
                            if (i10 == qnVar.y0) {
                                z10 = qnVar.U;
                                qnVar.U = !z10;
                                qnVar.R();
                            } else {
                                int i18 = qnVar.v0;
                                if (i10 == i18) {
                                    z10 = !qnVar.c0;
                                    qnVar.c0 = z10;
                                } else if (i10 == qnVar.z0) {
                                    if (!qnVar.W && !qnVar.U) {
                                        qnVar.Q = !qnVar.Q;
                                    }
                                    z10 = qnVar.Q;
                                } else if (i10 == qnVar.B0) {
                                    z10 = !qnVar.P;
                                    qnVar.P = z10;
                                } else if (i10 == qnVar.E0) {
                                    if (qnVar.R == 0 && qnVar.S == 0) {
                                        qnVar.R = 86400;
                                        qnVar.S = 0;
                                        int i19 = qnVar.F0;
                                        qnVar.h0();
                                        if (i19 < 0) {
                                            f2.l1 K2 = jb1Var.K(qnVar.E0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            jb1Var.setItemAnimator(enVar);
                                            onVar.s(qnVar.F0, 3);
                                        }
                                    } else {
                                        qnVar.R = 0;
                                        qnVar.S = 0;
                                        int i20 = qnVar.F0;
                                        qnVar.h0();
                                        jb1Var.setItemAnimator(enVar);
                                        onVar.t(i20, 3);
                                        f2.l1 K3 = jb1Var.K(qnVar.E0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z10 = (qnVar.R == 0 && qnVar.S == 0) ? false : true;
                                } else if (i10 == qnVar.A0) {
                                    z10 = !qnVar.O;
                                    qnVar.O = z10;
                                } else if (i10 == qnVar.w0) {
                                    z10 = !qnVar.d0;
                                    qnVar.d0 = z10;
                                    qnVar.h0();
                                    int i21 = qnVar.v0;
                                    if (i21 >= 0 && i18 < 0) {
                                        jb1Var.setItemAnimator(enVar);
                                        onVar.o(qnVar.v0);
                                    } else if (i18 >= 0 && i21 < 0) {
                                        jb1Var.setItemAnimator(enVar);
                                        onVar.u(i18);
                                    }
                                } else if (i10 == qnVar.C0) {
                                    boolean z14 = qnVar.V;
                                    z10 = !z14;
                                    qnVar.V = z10;
                                    if (z14 && qnVar.W) {
                                        boolean z15 = false;
                                        for (int i22 = 0; i22 < zArr.length; i22++) {
                                            if (z15) {
                                                zArr[i22] = false;
                                            } else if (zArr[i22]) {
                                                z15 = true;
                                            }
                                        }
                                    }
                                    int childCount = jb1Var.getChildCount();
                                    for (int i23 = 0; i23 < childCount; i23++) {
                                        f2.l1 T = jb1Var.T(jb1Var.getChildAt(i23));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.c6) T.a).a.a(qnVar.V, true);
                                        }
                                    }
                                } else if (i10 == qnVar.G0) {
                                    z10 = !qnVar.T;
                                    qnVar.T = z10;
                                } else if (i10 == qnVar.D0) {
                                    if (!qnVar.b0) {
                                        jb1Var.setItemAnimator(enVar);
                                        z10 = !qnVar.W;
                                        qnVar.W = z10;
                                        int i24 = qnVar.l0;
                                        qnVar.h0();
                                        if (qnVar.W) {
                                            onVar.s(qnVar.l0, 3);
                                        } else {
                                            onVar.t(i24, 3);
                                        }
                                        onVar.m(qnVar.x0);
                                        if (qnVar.W) {
                                            qnVar.O = false;
                                            int i25 = qnVar.A0;
                                            if (i25 >= 0) {
                                                f2.l1 K4 = jb1Var.K(i25);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.a).setChecked(false);
                                                } else {
                                                    onVar.m(qnVar.A0);
                                                }
                                            }
                                        } else {
                                            int i26 = qnVar.A0;
                                            if (i26 >= 0 && jb1Var.K(i26) == null) {
                                                onVar.m(qnVar.A0);
                                            }
                                        }
                                        qnVar.R();
                                        if (qnVar.W && !qnVar.V) {
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
                        if (qnVar.a0 && !qnVar.W) {
                            k40Var.b(true);
                        }
                        jb1Var.getChildCount();
                        for (int i28 = qnVar.q0; i28 < qnVar.q0 + qnVar.J; i28++) {
                            f2.l1 K5 = jb1Var.K(i28);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.c6) {
                                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view5;
                                    c6Var.m(qnVar.W, true);
                                    c6Var.r.a(zArr[i28 - qnVar.q0], z12);
                                    if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == qnVar.D0 && !qnVar.a0) {
                                        k40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        k40Var.f(c6Var.getCheckBox(), true);
                                        qnVar.a0 = true;
                                    }
                                }
                            }
                        }
                        if (z11) {
                            ((org.telegram.ui.Cells.s8) view).setChecked(z10);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z10);
                        }
                        qnVar.T();
                        break;
                    }
                }
                break;
            default:
                mv.n((mv) this.c, (ArrayList) this.d, (org.telegram.ui.ActionBar.p2) this.e, this.b, view, i10);
                break;
        }
    }

    public /* synthetic */ tm(mv mvVar, ArrayList arrayList, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.c = mvVar;
        this.d = arrayList;
        this.e = p2Var;
        this.b = f6Var;
    }
}
