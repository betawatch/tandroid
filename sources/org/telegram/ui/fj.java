package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class fj extends v4.s0 {
    public boolean b;
    public final /* synthetic */ an d;
    public float a = 0.0f;
    public final int c = org.telegram.messenger.g0.L(100.0f);

    public fj(an anVar) {
        this.d = anVar;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        an anVar = this.d;
        if (i7 == 0) {
            org.telegram.ui.Cells.q1 q1Var = anVar.D2;
            if (q1Var != null) {
                an.p2(anVar, q1Var, -1, anVar.E2, anVar.F2);
                anVar.D2 = null;
            }
            anVar.x3 = false;
            anVar.y3 = false;
            anVar.z3 = false;
            anVar.A3 = false;
            anVar.C9(true);
            anVar.D9(true);
            if (org.telegram.messenger.iz.o() == 0) {
                int i10 = an.id;
                org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.k1, 512);
            }
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.m1, new Object[0]);
            anVar.z0.setOverScrollMode(0);
            anVar.q9.V();
            anVar.Cd(false);
            anVar.La = false;
            return;
        }
        fi.m3 m3Var = anVar.M1;
        if (m3Var != null && m3Var.V) {
            m3Var.f(true);
        }
        org.telegram.ui.Components.j6 j6Var = anVar.k3;
        if (j6Var != null && j6Var.getVisibility() == 0 && anVar.T9()) {
            org.telegram.messenger.g0.v1(anVar.getParentActivity().getCurrentFocus());
        }
        if (i7 == 2) {
            anVar.P4 = true;
            anVar.z3 = true;
        } else if (i7 == 1) {
            anVar.D2 = null;
            anVar.P4 = true;
            anVar.x3 = true;
            anVar.y3 = true;
            anVar.A3 = true;
            anVar.z3 = true;
        }
        if (org.telegram.messenger.iz.o() == 0) {
            int i11 = an.id;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.j1, 512);
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.l1, new Object[0]);
        ch.r rVar = anVar.ra;
        if (rVar == null || !rVar.d()) {
            return;
        }
        anVar.ra.setHiddenByScroll(true);
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        an anVar = this.d;
        anVar.z0.invalidate();
        boolean z10 = true;
        this.b = i10 < 0;
        int L0 = anVar.B0.L0();
        if (((i10 != 0 && anVar.La && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && anVar.Z4 != 0) {
            if (!this.b || anVar.a5) {
                anVar.Z4 = 0;
            } else if (!anVar.z0.V1 && L0 != -1) {
                int N0 = anVar.B0.N0();
                org.telegram.messenger.ij ijVar = null;
                while (true) {
                    if (N0 < L0) {
                        z9 = false;
                        break;
                    }
                    View m10 = anVar.B0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.q1) {
                        ijVar = ((org.telegram.ui.Cells.q1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.t0) {
                        ijVar = ((org.telegram.ui.Cells.t0) m10).getMessageObject();
                    }
                    if (ijVar != null && anVar.Z4 == ijVar.f1()) {
                        z9 = true;
                        break;
                    }
                    N0--;
                }
                if (!z9 && ijVar != null && ijVar.f1() < anVar.Z4) {
                    anVar.Z4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            anVar.a5 = false;
            if (!anVar.P4 && i10 != 0) {
                anVar.P4 = true;
            }
        }
        if (i10 != 0) {
            anVar.l1.getClass();
            anVar.E9(true);
        }
        if (i10 != 0 && anVar.x3 && !anVar.t3) {
            if (anVar.b8 != Integer.MAX_VALUE) {
                anVar.hb();
                anVar.Cd(false);
            }
            anVar.ic(true);
        }
        if (anVar.O9() && i10 != 0 && anVar.y3 && !anVar.t3) {
            if (anVar.b8 != Integer.MAX_VALUE) {
                anVar.hb();
                anVar.Cd(false);
            }
            anVar.jc(true);
        }
        anVar.o7(true);
        if (L0 != -1) {
            anVar.C0.b();
            if (L0 != 0 || !anVar.U6[0]) {
                h6.m[] mVarArr = anVar.x1.e;
                h6.m mVar = 1 < mVarArr.length ? mVarArr[1] : null;
                boolean z11 = mVar != null && ((te.a) mVar.c).f;
                int i11 = this.c;
                if (i10 > 0) {
                    if (!z11) {
                        float f10 = this.a + i10;
                        this.a = f10;
                        if (f10 > i11) {
                            this.a = 0.0f;
                            anVar.z9 = true;
                            anVar.Zc();
                            anVar.y1 = true;
                        }
                    }
                } else if (anVar.y1 && z11) {
                    float f11 = this.a + i10;
                    this.a = f11;
                    if (f11 < (-i11)) {
                        anVar.z9 = false;
                        anVar.Zc();
                        this.a = 0.0f;
                    }
                }
            } else if (i10 >= 0) {
                anVar.z9 = false;
                anVar.Zc();
            }
        }
        anVar.M9();
        anVar.q9.G();
        ArrayList arrayList = anVar.Qa.F;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (!((hx) arrayList.get(i12)).c) {
                ((hx) arrayList.get(i12)).b -= i10;
            }
        }
        ch.k0 k0Var = ch.k0.B;
        if (k0Var != null) {
            k0Var.r -= i10;
            if (i10 != 0) {
                k0Var.u = true;
            }
        }
        anVar.w7(false);
        fi.m3 m3Var = anVar.L1;
        if (m3Var != null) {
            if (m3Var.V) {
                m3Var.f(true);
            } else if (!anVar.vc) {
                anVar.uc = System.currentTimeMillis();
                org.telegram.messenger.g0.r(new xf(anVar, 29));
                org.telegram.messenger.g0.i3(new ej(anVar, 0), 2000L);
            }
        }
        zk zkVar = anVar.P1;
        if (zkVar != null && zkVar.V) {
            zkVar.f(true);
        }
        fi.m3 m3Var2 = anVar.N1;
        if (m3Var2 == null || !m3Var2.V) {
            org.telegram.messenger.g0.r(new ej(anVar, 1));
            org.telegram.messenger.g0.i3(new ej(anVar, 2), 2000L);
        } else {
            m3Var2.f(true);
        }
        fi.m3 m3Var3 = anVar.O1;
        if (m3Var3 != null) {
            m3Var3.f(true);
        }
        qj qjVar = anVar.Z;
        if (qjVar != null) {
            qjVar.i0();
        }
        bi.p7 p7Var = anVar.Tc;
        if (p7Var != null) {
            p7Var.invalidate();
        }
        jh.a aVar = anVar.qc;
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
