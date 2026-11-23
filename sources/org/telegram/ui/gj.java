package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gj extends v4.u0 {
    public boolean b;
    public final /* synthetic */ bn d;
    public float a = 0.0f;
    public final int c = org.telegram.messenger.g0.L(100.0f);

    public gj(bn bnVar) {
        this.d = bnVar;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        bn bnVar = this.d;
        if (i7 == 0) {
            org.telegram.ui.Cells.r1 r1Var = bnVar.E2;
            if (r1Var != null) {
                bn.q2(bnVar, r1Var, -1, bnVar.F2, bnVar.G2);
                bnVar.E2 = null;
            }
            bnVar.y3 = false;
            bnVar.z3 = false;
            bnVar.A3 = false;
            bnVar.B3 = false;
            bnVar.E9(true);
            bnVar.F9(true);
            if (org.telegram.messenger.bz.o() == 0) {
                int i10 = bn.md;
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.k1, 512);
            }
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.m1, new Object[0]);
            bnVar.A0.setOverScrollMode(0);
            bnVar.u9.V();
            bnVar.Gd(false);
            bnVar.Pa = false;
            return;
        }
        hi.u3 u3Var = bnVar.N1;
        if (u3Var != null && u3Var.W) {
            u3Var.f(true);
        }
        org.telegram.ui.Components.n6 n6Var = bnVar.l3;
        if (n6Var != null && n6Var.getVisibility() == 0 && bnVar.V9()) {
            org.telegram.messenger.g0.v1(bnVar.getParentActivity().getCurrentFocus());
        }
        if (i7 == 2) {
            bnVar.R4 = true;
            bnVar.A3 = true;
        } else if (i7 == 1) {
            bnVar.E2 = null;
            bnVar.R4 = true;
            bnVar.y3 = true;
            bnVar.z3 = true;
            bnVar.B3 = true;
            bnVar.A3 = true;
        }
        if (org.telegram.messenger.bz.o() == 0) {
            int i11 = bn.md;
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.j1, 512);
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.l1, new Object[0]);
        ch.s sVar = bnVar.va;
        if (sVar == null || !sVar.d()) {
            return;
        }
        bnVar.va.setHiddenByScroll(true);
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        bn bnVar = this.d;
        bnVar.A0.invalidate();
        boolean z11 = true;
        this.b = i10 < 0;
        int L0 = bnVar.C0.L0();
        if (((i10 != 0 && bnVar.Pa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && bnVar.b5 != 0) {
            if (!this.b || bnVar.c5) {
                bnVar.b5 = 0;
            } else if (!bnVar.A0.W1 && L0 != -1) {
                int N0 = bnVar.C0.N0();
                org.telegram.messenger.fj fjVar = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = bnVar.C0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.r1) {
                        fjVar = ((org.telegram.ui.Cells.r1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.v0) {
                        fjVar = ((org.telegram.ui.Cells.v0) m10).getMessageObject();
                    }
                    if (fjVar != null && bnVar.b5 == fjVar.e1()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && fjVar != null && fjVar.e1() < bnVar.b5) {
                    bnVar.b5 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            bnVar.c5 = false;
            if (!bnVar.R4 && i10 != 0) {
                bnVar.R4 = true;
            }
        }
        if (i10 != 0) {
            bnVar.m1.getClass();
            bnVar.G9(true);
        }
        if (i10 != 0 && bnVar.y3 && !bnVar.u3) {
            if (bnVar.d8 != Integer.MAX_VALUE) {
                bnVar.lb();
                bnVar.Gd(false);
            }
            bnVar.mc(true);
        }
        if (bnVar.Q9() && i10 != 0 && bnVar.z3 && !bnVar.u3) {
            if (bnVar.d8 != Integer.MAX_VALUE) {
                bnVar.lb();
                bnVar.Gd(false);
            }
            bnVar.nc(true);
        }
        bnVar.p7(true);
        if (L0 != -1) {
            bnVar.D0.b();
            if (L0 != 0 || !bnVar.W6[0]) {
                h6.m[] mVarArr = bnVar.y1.e;
                h6.m mVar = 1 < mVarArr.length ? mVarArr[1] : null;
                boolean z12 = mVar != null && ((te.a) mVar.c).f;
                int i11 = this.c;
                if (i10 > 0) {
                    if (!z12) {
                        float f10 = this.a + i10;
                        this.a = f10;
                        if (f10 > i11) {
                            this.a = 0.0f;
                            bnVar.D9 = true;
                            bnVar.dd();
                            bnVar.z1 = true;
                        }
                    }
                } else if (bnVar.z1 && z12) {
                    float f11 = this.a + i10;
                    this.a = f11;
                    if (f11 < (-i11)) {
                        bnVar.D9 = false;
                        bnVar.dd();
                        this.a = 0.0f;
                    }
                }
            } else if (i10 >= 0) {
                bnVar.D9 = false;
                bnVar.dd();
            }
        }
        bnVar.O9();
        bnVar.u9.G();
        ArrayList arrayList = bnVar.Ua.G;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (!((lx) arrayList.get(i12)).c) {
                ((lx) arrayList.get(i12)).b -= i10;
            }
        }
        ch.l0 l0Var = ch.l0.B;
        if (l0Var != null) {
            l0Var.r -= i10;
            if (i10 != 0) {
                l0Var.u = true;
            }
        }
        bnVar.x7(false);
        hi.u3 u3Var = bnVar.M1;
        if (u3Var != null) {
            if (u3Var.W) {
                u3Var.f(true);
            } else if (!bnVar.zc) {
                bnVar.yc = System.currentTimeMillis();
                org.telegram.messenger.g0.r(new vf(bnVar, 29));
                org.telegram.messenger.g0.h3(new fj(bnVar, 0), 2000L);
            }
        }
        al alVar = bnVar.Q1;
        if (alVar != null && alVar.W) {
            alVar.f(true);
        }
        hi.u3 u3Var2 = bnVar.O1;
        if (u3Var2 == null || !u3Var2.W) {
            org.telegram.messenger.g0.r(new fj(bnVar, 1));
            org.telegram.messenger.g0.h3(new fj(bnVar, 2), 2000L);
        } else {
            u3Var2.f(true);
        }
        hi.u3 u3Var3 = bnVar.P1;
        if (u3Var3 != null) {
            u3Var3.f(true);
        }
        rj rjVar = bnVar.a0;
        if (rjVar != null) {
            rjVar.J0();
        }
        di.k6 k6Var = bnVar.Xc;
        if (k6Var != null) {
            k6Var.invalidate();
        }
        jh.a aVar = bnVar.uc;
        if (aVar == null || aVar.b <= 0) {
            return;
        }
        int childCount = aVar.a.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                z11 = false;
                break;
            }
            View childAt = aVar.a.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.r1 ? aVar.a(((org.telegram.ui.Cells.r1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.v0 ? aVar.a(((org.telegram.ui.Cells.v0) childAt).getMessageObject()) : false) {
                break;
            } else {
                i13++;
            }
        }
        if (z11) {
            return;
        }
        aVar.c(0, 0L);
    }
}
