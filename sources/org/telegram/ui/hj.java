package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hj extends v4.s0 {
    public boolean b;
    public final /* synthetic */ cn d;
    public float a = 0.0f;
    public final int c = org.telegram.messenger.g0.L(100.0f);

    public hj(cn cnVar) {
        this.d = cnVar;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        cn cnVar = this.d;
        if (i7 == 0) {
            org.telegram.ui.Cells.q1 q1Var = cnVar.D2;
            if (q1Var != null) {
                cn.q2(cnVar, q1Var, -1, cnVar.E2, cnVar.F2);
                cnVar.D2 = null;
            }
            cnVar.x3 = false;
            cnVar.y3 = false;
            cnVar.z3 = false;
            cnVar.A3 = false;
            cnVar.D9(true);
            cnVar.E9(true);
            if (org.telegram.messenger.iz.o() == 0) {
                int i10 = cn.kd;
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 512);
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.m1, new Object[0]);
            cnVar.z0.setOverScrollMode(0);
            cnVar.s9.V();
            cnVar.Fd(false);
            cnVar.Na = false;
            return;
        }
        fi.m3 m3Var = cnVar.M1;
        if (m3Var != null && m3Var.V) {
            m3Var.f(true);
        }
        org.telegram.ui.Components.j6 j6Var = cnVar.k3;
        if (j6Var != null && j6Var.getVisibility() == 0 && cnVar.U9()) {
            org.telegram.messenger.g0.v1(cnVar.getParentActivity().getCurrentFocus());
        }
        if (i7 == 2) {
            cnVar.P4 = true;
            cnVar.z3 = true;
        } else if (i7 == 1) {
            cnVar.D2 = null;
            cnVar.P4 = true;
            cnVar.x3 = true;
            cnVar.y3 = true;
            cnVar.A3 = true;
            cnVar.z3 = true;
        }
        if (org.telegram.messenger.iz.o() == 0) {
            int i11 = cn.kd;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 512);
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.l1, new Object[0]);
        ch.r rVar = cnVar.ta;
        if (rVar == null || !rVar.d()) {
            return;
        }
        cnVar.ta.setHiddenByScroll(true);
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        cn cnVar = this.d;
        cnVar.z0.invalidate();
        boolean z10 = true;
        this.b = i10 < 0;
        int L0 = cnVar.B0.L0();
        if (((i10 != 0 && cnVar.Na && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && cnVar.Z4 != 0) {
            if (!this.b || cnVar.a5) {
                cnVar.Z4 = 0;
            } else if (!cnVar.z0.V1 && L0 != -1) {
                int N0 = cnVar.B0.N0();
                org.telegram.messenger.ij ijVar = null;
                while (true) {
                    if (N0 < L0) {
                        z9 = false;
                        break;
                    }
                    View m10 = cnVar.B0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.q1) {
                        ijVar = ((org.telegram.ui.Cells.q1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.t0) {
                        ijVar = ((org.telegram.ui.Cells.t0) m10).getMessageObject();
                    }
                    if (ijVar != null && cnVar.Z4 == ijVar.e1()) {
                        z9 = true;
                        break;
                    }
                    N0--;
                }
                if (!z9 && ijVar != null && ijVar.e1() < cnVar.Z4) {
                    cnVar.Z4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            cnVar.a5 = false;
            if (!cnVar.P4 && i10 != 0) {
                cnVar.P4 = true;
            }
        }
        if (i10 != 0) {
            cnVar.l1.getClass();
            cnVar.F9(true);
        }
        if (i10 != 0 && cnVar.x3 && !cnVar.t3) {
            if (cnVar.b8 != Integer.MAX_VALUE) {
                cnVar.kb();
                cnVar.Fd(false);
            }
            cnVar.lc(true);
        }
        if (cnVar.P9() && i10 != 0 && cnVar.y3 && !cnVar.t3) {
            if (cnVar.b8 != Integer.MAX_VALUE) {
                cnVar.kb();
                cnVar.Fd(false);
            }
            cnVar.mc(true);
        }
        cnVar.p7(true);
        if (L0 != -1) {
            cnVar.C0.b();
            if (L0 != 0 || !cnVar.U6[0]) {
                h6.m[] mVarArr = cnVar.x1.e;
                h6.m mVar = 1 < mVarArr.length ? mVarArr[1] : null;
                boolean z11 = mVar != null && ((te.a) mVar.c).f;
                int i11 = this.c;
                if (i10 > 0) {
                    if (!z11) {
                        float f10 = this.a + i10;
                        this.a = f10;
                        if (f10 > i11) {
                            this.a = 0.0f;
                            cnVar.B9 = true;
                            cnVar.cd();
                            cnVar.y1 = true;
                        }
                    }
                } else if (cnVar.y1 && z11) {
                    float f11 = this.a + i10;
                    this.a = f11;
                    if (f11 < (-i11)) {
                        cnVar.B9 = false;
                        cnVar.cd();
                        this.a = 0.0f;
                    }
                }
            } else if (i10 >= 0) {
                cnVar.B9 = false;
                cnVar.cd();
            }
        }
        cnVar.N9();
        cnVar.s9.G();
        ArrayList arrayList = cnVar.Sa.F;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (!((jx) arrayList.get(i12)).c) {
                ((jx) arrayList.get(i12)).b -= i10;
            }
        }
        ch.k0 k0Var = ch.k0.B;
        if (k0Var != null) {
            k0Var.r -= i10;
            if (i10 != 0) {
                k0Var.u = true;
            }
        }
        cnVar.x7(false);
        fi.m3 m3Var = cnVar.L1;
        if (m3Var != null) {
            if (m3Var.V) {
                m3Var.f(true);
            } else if (!cnVar.xc) {
                cnVar.wc = System.currentTimeMillis();
                org.telegram.messenger.g0.r(new xf(cnVar, 29));
                org.telegram.messenger.g0.i3(new gj(cnVar, 0), 2000L);
            }
        }
        bl blVar = cnVar.P1;
        if (blVar != null && blVar.V) {
            blVar.f(true);
        }
        fi.m3 m3Var2 = cnVar.N1;
        if (m3Var2 == null || !m3Var2.V) {
            org.telegram.messenger.g0.r(new gj(cnVar, 1));
            org.telegram.messenger.g0.i3(new gj(cnVar, 2), 2000L);
        } else {
            m3Var2.f(true);
        }
        fi.m3 m3Var3 = cnVar.O1;
        if (m3Var3 != null) {
            m3Var3.f(true);
        }
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            sjVar.i0();
        }
        bi.p7 p7Var = cnVar.Vc;
        if (p7Var != null) {
            p7Var.invalidate();
        }
        jh.a aVar = cnVar.sc;
        if (aVar == null || aVar.b <= 0) {
            return;
        }
        int childCount = aVar.a.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = aVar.a.getChildAt(i13);
            if (childAt instanceof org.telegram.ui.Cells.q1 ? aVar.a(((org.telegram.ui.Cells.q1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.t0 ? aVar.a(((org.telegram.ui.Cells.t0) childAt).getMessageObject()) : false) {
                break;
            } else {
                i13++;
            }
        }
        if (z10) {
            return;
        }
        aVar.c(0, 0L);
    }
}
