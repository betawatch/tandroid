package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bj extends u4.t0 {
    public boolean b;
    public final /* synthetic */ wm d;
    public float a = 0.0f;
    public final int c = org.telegram.messenger.g0.L(100.0f);

    public bj(wm wmVar) {
        this.d = wmVar;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        wm wmVar = this.d;
        if (i3 == 0) {
            org.telegram.ui.Cells.q1 q1Var = wmVar.E2;
            if (q1Var != null) {
                wm.p2(wmVar, q1Var, -1, wmVar.F2, wmVar.G2);
                wmVar.E2 = null;
            }
            wmVar.y3 = false;
            wmVar.z3 = false;
            wmVar.A3 = false;
            wmVar.B3 = false;
            wmVar.C9(true);
            wmVar.D9(true);
            if (org.telegram.messenger.az.o() == 0) {
                int i10 = wm.jd;
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 512);
            }
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.m1, new Object[0]);
            wmVar.A0.setOverScrollMode(0);
            wmVar.r9.V();
            wmVar.Cd(false);
            wmVar.Ma = false;
            return;
        }
        gi.l3 l3Var = wmVar.N1;
        if (l3Var != null && l3Var.W) {
            l3Var.f(true);
        }
        org.telegram.ui.Components.h6 h6Var = wmVar.l3;
        if (h6Var != null && h6Var.getVisibility() == 0 && wmVar.T9()) {
            org.telegram.messenger.g0.v1(wmVar.getParentActivity().getCurrentFocus());
        }
        if (i3 == 2) {
            wmVar.Q4 = true;
            wmVar.A3 = true;
        } else if (i3 == 1) {
            wmVar.E2 = null;
            wmVar.Q4 = true;
            wmVar.y3 = true;
            wmVar.z3 = true;
            wmVar.B3 = true;
            wmVar.A3 = true;
        }
        if (org.telegram.messenger.az.o() == 0) {
            int i11 = wm.jd;
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.j1, 512);
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.l1, new Object[0]);
        dh.r rVar = wmVar.sa;
        if (rVar == null || !rVar.d()) {
            return;
        }
        wmVar.sa.setHiddenByScroll(true);
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        boolean z10;
        wm wmVar = this.d;
        wmVar.A0.invalidate();
        boolean z11 = true;
        this.b = i10 < 0;
        int L0 = wmVar.C0.L0();
        if (((i10 != 0 && wmVar.Ma && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && wmVar.a5 != 0) {
            if (!this.b || wmVar.b5) {
                wmVar.a5 = 0;
            } else if (!wmVar.A0.W1 && L0 != -1) {
                int N0 = wmVar.C0.N0();
                org.telegram.messenger.zi ziVar = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = wmVar.C0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.q1) {
                        ziVar = ((org.telegram.ui.Cells.q1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.t0) {
                        ziVar = ((org.telegram.ui.Cells.t0) m10).getMessageObject();
                    }
                    if (ziVar != null && wmVar.a5 == ziVar.f1()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && ziVar != null && ziVar.f1() < wmVar.a5) {
                    wmVar.a5 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            wmVar.b5 = false;
            if (!wmVar.Q4 && i10 != 0) {
                wmVar.Q4 = true;
            }
        }
        if (i10 != 0) {
            wmVar.m1.getClass();
            wmVar.E9(true);
        }
        if (i10 != 0 && wmVar.y3 && !wmVar.u3) {
            if (wmVar.c8 != Integer.MAX_VALUE) {
                wmVar.hb();
                wmVar.Cd(false);
            }
            wmVar.ic(true);
        }
        if (wmVar.O9() && i10 != 0 && wmVar.z3 && !wmVar.u3) {
            if (wmVar.c8 != Integer.MAX_VALUE) {
                wmVar.hb();
                wmVar.Cd(false);
            }
            wmVar.jc(true);
        }
        wmVar.o7(true);
        if (L0 != -1) {
            wmVar.D0.b();
            if (L0 != 0 || !wmVar.V6[0]) {
                k4.j[] jVarArr = wmVar.y1.e;
                k4.j jVar = 1 < jVarArr.length ? jVarArr[1] : null;
                boolean z12 = jVar != null && ((qe.a) jVar.b).f;
                int i11 = this.c;
                if (i10 > 0) {
                    if (!z12) {
                        float f10 = this.a + i10;
                        this.a = f10;
                        if (f10 > i11) {
                            this.a = 0.0f;
                            wmVar.A9 = true;
                            wmVar.Zc();
                            wmVar.z1 = true;
                        }
                    }
                } else if (wmVar.z1 && z12) {
                    float f11 = this.a + i10;
                    this.a = f11;
                    if (f11 < (-i11)) {
                        wmVar.A9 = false;
                        wmVar.Zc();
                        this.a = 0.0f;
                    }
                }
            } else if (i10 >= 0) {
                wmVar.A9 = false;
                wmVar.Zc();
            }
        }
        wmVar.M9();
        wmVar.r9.G();
        ArrayList arrayList = wmVar.Ra.G;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (!((ex) arrayList.get(i12)).c) {
                ((ex) arrayList.get(i12)).b -= i10;
            }
        }
        dh.j0 j0Var = dh.j0.B;
        if (j0Var != null) {
            j0Var.r -= i10;
            if (i10 != 0) {
                j0Var.u = true;
            }
        }
        wmVar.w7(false);
        gi.l3 l3Var = wmVar.M1;
        if (l3Var != null) {
            if (l3Var.W) {
                l3Var.f(true);
            } else if (!wmVar.wc) {
                wmVar.vc = System.currentTimeMillis();
                org.telegram.messenger.g0.r(new tf(wmVar, 29));
                org.telegram.messenger.g0.i3(new aj(wmVar, 0), 2000L);
            }
        }
        vk vkVar = wmVar.Q1;
        if (vkVar != null && vkVar.W) {
            vkVar.f(true);
        }
        gi.l3 l3Var2 = wmVar.O1;
        if (l3Var2 == null || !l3Var2.W) {
            org.telegram.messenger.g0.r(new aj(wmVar, 1));
            org.telegram.messenger.g0.i3(new aj(wmVar, 2), 2000L);
        } else {
            l3Var2.f(true);
        }
        gi.l3 l3Var3 = wmVar.P1;
        if (l3Var3 != null) {
            l3Var3.f(true);
        }
        mj mjVar = wmVar.a0;
        if (mjVar != null) {
            mjVar.i0();
        }
        ci.q6 q6Var = wmVar.Uc;
        if (q6Var != null) {
            q6Var.invalidate();
        }
        kh.a aVar = wmVar.rc;
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
