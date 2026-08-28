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
import org.telegram.ui.va1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mm implements mk0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mm(jn jnVar, org.telegram.ui.ActionBar.b6 b6Var, ki kiVar, Context context) {
        this.c = jnVar;
        this.b = b6Var;
        this.d = kiVar;
        this.e = context;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                jn jnVar = (jn) this.c;
                ki kiVar = (ki) this.d;
                Context context = (Context) this.e;
                s30 s30Var = jnVar.y;
                boolean[] zArr = jnVar.H;
                m.a aVar = jnVar.J0;
                xm xmVar = jnVar.v;
                hn hnVar = jnVar.r;
                va1 va1Var = jnVar.s;
                int i10 = jnVar.H0;
                org.telegram.ui.ActionBar.b6 b6Var = this.b;
                if (i9 == i10) {
                    bh.j jVar = new bh.j(jnVar.getContext(), b6Var);
                    jVar.g0 = new n5.a0(jnVar, 7);
                    ArrayList arrayList = jnVar.L0;
                    jVar.Y = null;
                    jVar.k0 = new HashSet(arrayList);
                    jVar.show();
                    break;
                } else if (i9 == jnVar.E0) {
                    x60 F = x60.F(kiVar.container, b6Var, view);
                    int i11 = 0;
                    while (true) {
                        int[] iArr = jnVar.P0;
                        if (i11 >= iArr.length) {
                            F.c(R.drawable.msg_customize, LocaleController.getString(R.string.PollV2PollDurationOptionCustom), new org.telegram.ui.k6(jnVar, context, view, b6Var, 18), false);
                            F.t = false;
                            F.s = 0;
                            F.Z();
                            break;
                        } else {
                            int i12 = iArr[i11];
                            b11 a2 = b11.a(i12);
                            int i13 = org.telegram.ui.ActionBar.f6.F8;
                            a2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i13, jnVar.a), PorterDuff.Mode.SRC_IN));
                            F.b(0, a2, LocaleController.formatPluralString("Hours", i12 / 3600, new Object[0]), i13, org.telegram.ui.ActionBar.f6.E8, new org.telegram.ui.rl(jnVar, i12, view, 1));
                            i11++;
                        }
                    }
                } else if (i9 == jnVar.q0) {
                    jnVar.O();
                    break;
                } else {
                    boolean z12 = view instanceof org.telegram.ui.Cells.t8;
                    if (z12 || (view instanceof org.telegram.ui.Cells.a6)) {
                        boolean z13 = jnVar.V;
                        zm zmVar = jnVar.x;
                        if (zmVar != null) {
                            zmVar.f();
                        }
                        m.a[] aVarArr = jnVar.K0;
                        int length = aVarArr.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 < length) {
                                m.a aVar2 = aVarArr[i14];
                                if (i9 == aVar2.b) {
                                    boolean z14 = aVar2.a;
                                    z11 = !z14;
                                    aVar2.a = z11;
                                    int i15 = aVar.b;
                                    jn jnVar2 = (jn) aVar.c;
                                    hn hnVar2 = jnVar2.r;
                                    if (i9 == i15) {
                                        va1Var.setItemAnimator(xmVar);
                                        int i16 = aVar.b;
                                        if (i16 >= 0) {
                                            f2.q1 K = jnVar2.s.K(i16);
                                            if (K != null) {
                                                View view2 = K.a;
                                                if (view2 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view2).setDivider(z11);
                                                }
                                            }
                                            hnVar2.m(aVar.b);
                                        }
                                        if (z14) {
                                            hnVar2.t(aVar.b + 1, 1);
                                        } else {
                                            hnVar2.s(aVar.b + 1, 1);
                                        }
                                        jnVar.g0();
                                    }
                                    z10 = true;
                                } else {
                                    i14++;
                                }
                            } else {
                                z10 = false;
                                z11 = false;
                            }
                        }
                        if (!z10) {
                            if (i9 == jnVar.x0) {
                                z11 = jnVar.T;
                                jnVar.T = !z11;
                                jnVar.Q();
                            } else {
                                int i17 = jnVar.u0;
                                if (i9 == i17) {
                                    z11 = !jnVar.b0;
                                    jnVar.b0 = z11;
                                } else if (i9 == jnVar.y0) {
                                    if (!jnVar.V && !jnVar.T) {
                                        jnVar.P = !jnVar.P;
                                    }
                                    z11 = jnVar.P;
                                } else if (i9 == jnVar.A0) {
                                    z11 = !jnVar.O;
                                    jnVar.O = z11;
                                } else if (i9 == jnVar.D0) {
                                    if (jnVar.Q == 0 && jnVar.R == 0) {
                                        jnVar.Q = 86400;
                                        jnVar.R = 0;
                                        int i18 = jnVar.E0;
                                        jnVar.g0();
                                        if (i18 < 0) {
                                            f2.q1 K2 = va1Var.K(jnVar.D0);
                                            if (K2 != null) {
                                                View view3 = K2.a;
                                                if (view3 instanceof org.telegram.ui.Cells.a6) {
                                                    ((org.telegram.ui.Cells.a6) view3).setDivider(true);
                                                }
                                            }
                                            va1Var.setItemAnimator(xmVar);
                                            hnVar.s(jnVar.E0, 3);
                                        }
                                    } else {
                                        jnVar.Q = 0;
                                        jnVar.R = 0;
                                        int i19 = jnVar.E0;
                                        jnVar.g0();
                                        va1Var.setItemAnimator(xmVar);
                                        hnVar.t(i19, 3);
                                        f2.q1 K3 = va1Var.K(jnVar.D0);
                                        if (K3 != null) {
                                            View view4 = K3.a;
                                            if (view4 instanceof org.telegram.ui.Cells.a6) {
                                                ((org.telegram.ui.Cells.a6) view4).setDivider(false);
                                            }
                                        }
                                    }
                                    z11 = (jnVar.Q == 0 && jnVar.R == 0) ? false : true;
                                } else if (i9 == jnVar.z0) {
                                    z11 = !jnVar.N;
                                    jnVar.N = z11;
                                } else if (i9 == jnVar.v0) {
                                    z11 = !jnVar.c0;
                                    jnVar.c0 = z11;
                                    jnVar.g0();
                                    int i20 = jnVar.u0;
                                    if (i20 >= 0 && i17 < 0) {
                                        va1Var.setItemAnimator(xmVar);
                                        hnVar.o(jnVar.u0);
                                    } else if (i17 >= 0 && i20 < 0) {
                                        va1Var.setItemAnimator(xmVar);
                                        hnVar.u(i17);
                                    }
                                } else if (i9 == jnVar.B0) {
                                    boolean z15 = jnVar.U;
                                    z11 = !z15;
                                    jnVar.U = z11;
                                    if (z15 && jnVar.V) {
                                        boolean z16 = false;
                                        for (int i21 = 0; i21 < zArr.length; i21++) {
                                            if (z16) {
                                                zArr[i21] = false;
                                            } else if (zArr[i21]) {
                                                z16 = true;
                                            }
                                        }
                                    }
                                    int childCount = va1Var.getChildCount();
                                    for (int i22 = 0; i22 < childCount; i22++) {
                                        f2.q1 T = va1Var.T(va1Var.getChildAt(i22));
                                        if (T.f == 5) {
                                            ((org.telegram.ui.Cells.c6) T.a).a.a(jnVar.U, true);
                                        }
                                    }
                                } else if (i9 == jnVar.F0) {
                                    z11 = !jnVar.S;
                                    jnVar.S = z11;
                                } else if (i9 == jnVar.C0) {
                                    if (!jnVar.a0) {
                                        va1Var.setItemAnimator(xmVar);
                                        z11 = !jnVar.V;
                                        jnVar.V = z11;
                                        int i23 = jnVar.k0;
                                        jnVar.g0();
                                        if (jnVar.V) {
                                            hnVar.s(jnVar.k0, 3);
                                        } else {
                                            hnVar.t(i23, 3);
                                        }
                                        hnVar.m(jnVar.w0);
                                        if (jnVar.V) {
                                            jnVar.N = false;
                                            int i24 = jnVar.z0;
                                            if (i24 >= 0) {
                                                f2.q1 K4 = va1Var.K(i24);
                                                if (K4 != null) {
                                                    ((org.telegram.ui.Cells.a6) K4.a).setChecked(false);
                                                } else {
                                                    hnVar.m(jnVar.z0);
                                                }
                                            }
                                        } else {
                                            int i25 = jnVar.z0;
                                            if (i25 >= 0 && va1Var.K(i25) == null) {
                                                hnVar.m(jnVar.z0);
                                            }
                                        }
                                        jnVar.Q();
                                        if (jnVar.V && !jnVar.U) {
                                            boolean z17 = false;
                                            for (int i26 = 0; i26 < zArr.length; i26++) {
                                                if (z17) {
                                                    zArr[i26] = false;
                                                } else if (zArr[i26]) {
                                                    z17 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (jnVar.W && !jnVar.V) {
                            s30Var.b(true);
                        }
                        va1Var.getChildCount();
                        for (int i27 = jnVar.p0; i27 < jnVar.p0 + jnVar.I; i27++) {
                            f2.q1 K5 = va1Var.K(i27);
                            if (K5 != null) {
                                View view5 = K5.a;
                                if (view5 instanceof org.telegram.ui.Cells.c6) {
                                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view5;
                                    c6Var.m(jnVar.V, true);
                                    c6Var.r.a(zArr[i27 - jnVar.p0], z13);
                                    if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i9 == jnVar.C0 && !jnVar.W) {
                                        s30Var.setText(LocaleController.getString(R.string.PollTapToSelect));
                                        s30Var.f(c6Var.getCheckBox(), true);
                                        jnVar.W = true;
                                    }
                                }
                            }
                        }
                        if (z12) {
                            ((org.telegram.ui.Cells.t8) view).setChecked(z11);
                        } else if (view instanceof org.telegram.ui.Cells.a6) {
                            ((org.telegram.ui.Cells.a6) view).setChecked(z11);
                        }
                        jnVar.S();
                        break;
                    }
                }
                break;
            default:
                dv.n((dv) this.c, (ArrayList) this.d, (org.telegram.ui.ActionBar.o2) this.e, this.b, view, i9);
                break;
        }
    }

    public /* synthetic */ mm(dv dvVar, ArrayList arrayList, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        this.c = dvVar;
        this.d = arrayList;
        this.e = o2Var;
        this.b = b6Var;
    }
}
