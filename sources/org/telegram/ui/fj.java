package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class fj extends v4.t0 {
    public boolean b;
    public final /* synthetic */ an d;
    public float a = 0.0f;
    public final int c = org.telegram.messenger.g0.L(100.0f);

    public fj(an anVar) {
        this.d = anVar;
    }

    @Override // v4.t0
    public final void a(RecyclerView recyclerView, int i7) {
        an anVar = this.d;
        if (i7 == 0) {
            org.telegram.ui.Cells.q1 q1Var = anVar.E2;
            if (q1Var != null) {
                an.q2(anVar, q1Var, -1, anVar.F2, anVar.G2);
                anVar.E2 = null;
            }
            anVar.y3 = false;
            anVar.z3 = false;
            anVar.A3 = false;
            anVar.B3 = false;
            anVar.E9(true);
            anVar.F9(true);
            if (org.telegram.messenger.gz.o() == 0) {
                int i10 = an.ld;
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.k1, 512);
            }
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.m1, new Object[0]);
            anVar.A0.setOverScrollMode(0);
            anVar.t9.V();
            anVar.Gd(false);
            anVar.Oa = false;
            return;
        }
        hi.l3 l3Var = anVar.N1;
        if (l3Var != null && l3Var.W) {
            l3Var.f(true);
        }
        org.telegram.ui.Components.h6 h6Var = anVar.l3;
        if (h6Var != null && h6Var.getVisibility() == 0 && anVar.V9()) {
            org.telegram.messenger.g0.v1(anVar.getParentActivity().getCurrentFocus());
        }
        if (i7 == 2) {
            anVar.Q4 = true;
            anVar.A3 = true;
        } else if (i7 == 1) {
            anVar.E2 = null;
            anVar.Q4 = true;
            anVar.y3 = true;
            anVar.z3 = true;
            anVar.B3 = true;
            anVar.A3 = true;
        }
        if (org.telegram.messenger.gz.o() == 0) {
            int i11 = an.ld;
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.j1, 512);
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.l1, new Object[0]);
        ch.r rVar = anVar.ua;
        if (rVar == null || !rVar.d()) {
            return;
        }
        anVar.ua.setHiddenByScroll(true);
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        an anVar = this.d;
        anVar.A0.invalidate();
        boolean z11 = true;
        this.b = i10 < 0;
        int L0 = anVar.C0.L0();
        if (((i10 != 0 && anVar.Oa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && anVar.a5 != 0) {
            if (!this.b || anVar.b5) {
                anVar.a5 = 0;
            } else if (!anVar.A0.W1 && L0 != -1) {
                int N0 = anVar.C0.N0();
                org.telegram.messenger.gj gjVar = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = anVar.C0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.q1) {
                        gjVar = ((org.telegram.ui.Cells.q1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.t0) {
                        gjVar = ((org.telegram.ui.Cells.t0) m10).getMessageObject();
                    }
                    if (gjVar != null && anVar.a5 == gjVar.e1()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && gjVar != null && gjVar.e1() < anVar.a5) {
                    anVar.a5 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            anVar.b5 = false;
            if (!anVar.Q4 && i10 != 0) {
                anVar.Q4 = true;
            }
        }
        if (i10 != 0) {
            anVar.m1.getClass();
            anVar.G9(true);
        }
        if (i10 != 0 && anVar.y3 && !anVar.u3) {
            if (anVar.c8 != Integer.MAX_VALUE) {
                anVar.lb();
                anVar.Gd(false);
            }
            anVar.mc(true);
        }
        if (anVar.Q9() && i10 != 0 && anVar.z3 && !anVar.u3) {
            if (anVar.c8 != Integer.MAX_VALUE) {
                anVar.lb();
                anVar.Gd(false);
            }
            anVar.nc(true);
        }
        anVar.p7(true);
        if (L0 != -1) {
            anVar.D0.b();
            if (L0 != 0 || !anVar.V6[0]) {
                h6.m[] mVarArr = anVar.y1.e;
                h6.m mVar = 1 < mVarArr.length ? mVarArr[1] : null;
                boolean z12 = mVar != null && ((te.a) mVar.c).f;
                int i11 = this.c;
                if (i10 > 0) {
                    if (!z12) {
                        float f10 = this.a + i10;
                        this.a = f10;
                        if (f10 > i11) {
                            this.a = 0.0f;
                            anVar.C9 = true;
                            anVar.dd();
                            anVar.z1 = true;
                        }
                    }
                } else if (anVar.z1 && z12) {
                    float f11 = this.a + i10;
                    this.a = f11;
                    if (f11 < (-i11)) {
                        anVar.C9 = false;
                        anVar.dd();
                        this.a = 0.0f;
                    }
                }
            } else if (i10 >= 0) {
                anVar.C9 = false;
                anVar.dd();
            }
        }
        anVar.O9();
        anVar.t9.G();
        ArrayList arrayList = anVar.Ta.G;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (!((ix) arrayList.get(i12)).c) {
                ((ix) arrayList.get(i12)).b -= i10;
            }
        }
        ch.l0 l0Var = ch.l0.B;
        if (l0Var != null) {
            l0Var.r -= i10;
            if (i10 != 0) {
                l0Var.u = true;
            }
        }
        anVar.x7(false);
        hi.l3 l3Var = anVar.M1;
        if (l3Var != null) {
            if (l3Var.W) {
                l3Var.f(true);
            } else if (!anVar.yc) {
                anVar.xc = System.currentTimeMillis();
                org.telegram.messenger.g0.r(new uf(anVar, 29));
                org.telegram.messenger.g0.i3(new ej(anVar, 0), 2000L);
            }
        }
        zk zkVar = anVar.Q1;
        if (zkVar != null && zkVar.W) {
            zkVar.f(true);
        }
        hi.l3 l3Var2 = anVar.O1;
        if (l3Var2 == null || !l3Var2.W) {
            org.telegram.messenger.g0.r(new ej(anVar, 1));
            org.telegram.messenger.g0.i3(new ej(anVar, 2), 2000L);
        } else {
            l3Var2.f(true);
        }
        hi.l3 l3Var3 = anVar.P1;
        if (l3Var3 != null) {
            l3Var3.f(true);
        }
        qj qjVar = anVar.a0;
        if (qjVar != null) {
            qjVar.x0();
        }
        di.h6 h6Var = anVar.Wc;
        if (h6Var != null) {
            h6Var.invalidate();
        }
        jh.a aVar = anVar.tc;
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
            if (childAt instanceof org.telegram.ui.Cells.q1 ? aVar.a(((org.telegram.ui.Cells.q1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.t0 ? aVar.a(((org.telegram.ui.Cells.t0) childAt).getMessageObject()) : false) {
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
