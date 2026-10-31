package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ak extends s4.s0 {
    public boolean b;
    public final /* synthetic */ un d;
    public float a = 0.0f;
    public final int c = org.telegram.messenger.i0.L(100.0f);

    public ak(un unVar) {
        this.d = unVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        un unVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.q1 q1Var = unVar.D2;
            if (q1Var != null) {
                unVar.B2.e(q1Var, -1, unVar.E2, unVar.F2, true);
                unVar.D2 = null;
            }
            unVar.x3 = false;
            unVar.y3 = false;
            unVar.z3 = false;
            unVar.A3 = false;
            unVar.s9(true);
            unVar.t9(true);
            if (org.telegram.messenger.tz.o() == 0) {
                int i11 = un.ad;
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.k1, 512);
            }
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.m1, new Object[0]);
            unVar.z0.setOverScrollMode(0);
            unVar.q9.V();
            unVar.sd(false);
            unVar.La = false;
            return;
        }
        vh.p2 p2Var = unVar.M1;
        if (p2Var != null && p2Var.V) {
            p2Var.e(true);
        }
        org.telegram.ui.Components.f6 f6Var = unVar.k3;
        if (f6Var != null && f6Var.getVisibility() == 0 && unVar.J9()) {
            org.telegram.messenger.i0.v1(unVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            unVar.P4 = true;
            unVar.z3 = true;
        } else if (i10 == 1) {
            unVar.D2 = null;
            unVar.P4 = true;
            unVar.x3 = true;
            unVar.y3 = true;
            unVar.A3 = true;
            unVar.z3 = true;
        }
        if (org.telegram.messenger.tz.o() == 0) {
            int i12 = un.ad;
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.j1, 512);
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.l1, new Object[0]);
        sg.s sVar = unVar.ra;
        if (sVar == null || !sVar.d()) {
            return;
        }
        unVar.ra.setHiddenByScroll(true);
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        un unVar = this.d;
        unVar.z0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = unVar.B0.L0();
        if (((i11 != 0 && unVar.La && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && unVar.Z4 != 0) {
            if (!this.b || unVar.a5) {
                unVar.Z4 = 0;
            } else if (!unVar.z0.V1 && L0 != -1) {
                int N0 = unVar.B0.N0();
                org.telegram.messenger.jj jjVar = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = unVar.B0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.q1) {
                        jjVar = ((org.telegram.ui.Cells.q1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.s0) {
                        jjVar = ((org.telegram.ui.Cells.s0) m10).getMessageObject();
                    }
                    if (jjVar != null && unVar.Z4 == jjVar.f1()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && jjVar != null && jjVar.f1() < unVar.Z4) {
                    unVar.Z4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            unVar.a5 = false;
            if (!unVar.P4 && i11 != 0) {
                unVar.P4 = true;
            }
        }
        if (i11 != 0) {
            unVar.l1.getClass();
            unVar.u9(true);
        }
        if (i11 != 0 && unVar.x3 && !unVar.t3) {
            if (unVar.b8 != Integer.MAX_VALUE) {
                unVar.Xa();
                unVar.sd(false);
            }
            unVar.Yb(true);
        }
        if (unVar.E9() && i11 != 0 && unVar.y3 && !unVar.t3) {
            if (unVar.b8 != Integer.MAX_VALUE) {
                unVar.Xa();
                unVar.sd(false);
            }
            unVar.Zb(true);
        }
        unVar.i7(true);
        if (L0 != -1) {
            unVar.C0.b();
            if (L0 != 0 || !unVar.U6[0]) {
                android.support.v4.media.session.a0[] a0VarArr = unVar.x1.e;
                android.support.v4.media.session.a0 a0Var = 1 < a0VarArr.length ? a0VarArr[1] : null;
                boolean z12 = a0Var != null && ((fe.b) a0Var.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.a + i11;
                        this.a = f7;
                        if (f7 > i12) {
                            this.a = 0.0f;
                            unVar.z9 = true;
                            unVar.Pc();
                            unVar.y1 = true;
                        }
                    }
                } else if (unVar.y1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        unVar.z9 = false;
                        unVar.Pc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                unVar.z9 = false;
                unVar.Pc();
            }
        }
        unVar.C9();
        unVar.q9.G();
        ArrayList arrayList = unVar.Qa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((ky) arrayList.get(i13)).c) {
                ((ky) arrayList.get(i13)).b -= i11;
            }
        }
        sg.k0 k0Var = sg.k0.B;
        if (k0Var != null) {
            k0Var.r -= i11;
            if (i11 != 0) {
                k0Var.u = true;
            }
        }
        unVar.q7(false);
        vh.p2 p2Var = unVar.L1;
        if (p2Var != null) {
            if (p2Var.V) {
                p2Var.e(true);
            } else if (!unVar.qc) {
                unVar.pc = System.currentTimeMillis();
                org.telegram.messenger.i0.r(new lg(unVar, 29));
                org.telegram.messenger.i0.h3(new zj(unVar, 0), 2000L);
            }
        }
        wl wlVar = unVar.P1;
        if (wlVar != null && wlVar.V) {
            wlVar.e(true);
        }
        vh.p2 p2Var2 = unVar.N1;
        if (p2Var2 == null || !p2Var2.V) {
            org.telegram.messenger.i0.r(new zj(unVar, 1));
            org.telegram.messenger.i0.h3(new zj(unVar, 2), 2000L);
        } else {
            p2Var2.e(true);
        }
        vh.p2 p2Var3 = unVar.O1;
        if (p2Var3 != null) {
            p2Var3.e(true);
        }
        mk mkVar = unVar.Z;
        if (mkVar != null) {
            mkVar.h0();
        }
        rh.i4 i4Var = unVar.Lc;
        if (i4Var != null) {
            i4Var.invalidate();
        }
        zg.a aVar = unVar.lc;
        if (aVar == null || aVar.b <= 0) {
            return;
        }
        int childCount = aVar.a.getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                z11 = false;
                break;
            }
            View childAt = aVar.a.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.q1 ? aVar.a(((org.telegram.ui.Cells.q1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.s0 ? aVar.a(((org.telegram.ui.Cells.s0) childAt).getMessageObject()) : false) {
                break;
            } else {
                i14++;
            }
        }
        if (z11) {
            return;
        }
        aVar.c(0, 0L);
    }
}
