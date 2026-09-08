package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class bk extends s4.s0 {
    public boolean b;
    public final /* synthetic */ co d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public bk(co coVar) {
        this.d = coVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        co coVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.t1 t1Var = coVar.p2;
            if (t1Var != null) {
                coVar.n2.e(t1Var, -1, coVar.q2, coVar.r2, true);
                coVar.p2 = null;
            }
            coVar.j3 = false;
            coVar.k3 = false;
            coVar.l3 = false;
            coVar.m3 = false;
            coVar.f9(true);
            coVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = co.Hc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            coVar.x0.setOverScrollMode(0);
            coVar.c9.W();
            coVar.Wc(false);
            coVar.q9(1);
            coVar.sa = false;
            return;
        }
        di.f4 f4Var = coVar.y1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
        }
        org.telegram.ui.Components.q6 q6Var = coVar.W2;
        if (q6Var != null && q6Var.getVisibility() == 0 && coVar.x9()) {
            AndroidUtilities.hideKeyboard(coVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            coVar.D4 = true;
            coVar.l3 = true;
        } else if (i10 == 1) {
            coVar.p2 = null;
            coVar.D4 = true;
            coVar.j3 = true;
            coVar.k3 = true;
            coVar.m3 = true;
            coVar.l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = co.Hc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        ah.g0 g0Var = coVar.Y9;
        if (g0Var == null || !g0Var.d()) {
            return;
        }
        coVar.Y9.setHiddenByScroll(true);
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        boolean z10;
        co coVar = this.d;
        co coVar2 = coVar.da;
        if (coVar2 == null) {
            coVar2 = coVar;
        }
        coVar.x0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = coVar.z0.L0();
        if (((i11 != 0 && coVar.sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && coVar.N4 != 0) {
            if (!this.b || coVar.O4) {
                coVar.N4 = 0;
            } else if (!coVar.x0.X1 && L0 != -1) {
                int N0 = coVar.z0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = coVar.z0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.t1) {
                        messageObject = ((org.telegram.ui.Cells.t1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                        messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                    }
                    if (messageObject != null && coVar.N4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < coVar.N4) {
                    coVar.N4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            coVar.O4 = false;
            if (!coVar.D4 && i11 != 0) {
                coVar.D4 = true;
            }
        }
        if (i11 != 0) {
            coVar.q9(1);
            coVar.X0.getClass();
            coVar.h9(true);
        }
        if (i11 != 0 && coVar.j3 && !coVar.f3) {
            if (coVar.L7 != Integer.MAX_VALUE) {
                coVar.Ia();
                coVar.Wc(false);
            }
            coVar.Fb(true);
        }
        if (coVar.t9() && i11 != 0 && coVar.k3 && !coVar.f3) {
            if (coVar.L7 != Integer.MAX_VALUE) {
                coVar.Ia();
                coVar.Wc(false);
            }
            coVar.Gb(true);
        }
        coVar.a7(true);
        if (L0 != -1) {
            coVar.A0.h();
            if (L0 != 0 || !coVar.E6[0]) {
                aa.a[] aVarArr = coVar.j1.e;
                aa.a aVar = 1 < aVarArr.length ? aVarArr[1] : null;
                boolean z12 = aVar != null && ((le.b) aVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.a + i11;
                        this.a = f7;
                        if (f7 > i12) {
                            this.a = 0.0f;
                            coVar.g9 = true;
                            coVar.vc();
                            coVar.k1 = true;
                        }
                    }
                } else if (coVar.k1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        coVar.g9 = false;
                        coVar.vc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                coVar.g9 = false;
                coVar.vc();
            }
        }
        coVar.r9();
        coVar.c9.H();
        ArrayList arrayList = coVar.xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((fz) arrayList.get(i13)).c) {
                ((fz) arrayList.get(i13)).b -= i11;
            }
        }
        ah.e1 e1Var = ah.e1.B;
        if (e1Var != null) {
            e1Var.r -= i11;
            if (i11 != 0) {
                e1Var.u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = coVar2.F) != null) {
            fVar.f(i10, i11);
        }
        coVar.i7(false);
        di.f4 f4Var = coVar.x1;
        if (f4Var != null) {
            if (f4Var.V) {
                f4Var.e(true);
            } else if (!coVar.Vb) {
                coVar.Ub = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new ug(coVar, 28));
                AndroidUtilities.runOnUIThread(new ug(coVar, 29), 2000L);
            }
        }
        yl ylVar = coVar.B1;
        if (ylVar != null && ylVar.V) {
            ylVar.e(true);
        }
        di.f4 f4Var2 = coVar.z1;
        if (f4Var2 == null || !f4Var2.V) {
            AndroidUtilities.cancelRunOnUIThread(new ak(coVar, 0));
            AndroidUtilities.runOnUIThread(new ak(coVar, 1), 2000L);
        } else {
            f4Var2.e(true);
        }
        di.f4 f4Var3 = coVar.A1;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
        mk mkVar = coVar.Y;
        if (mkVar != null) {
            mkVar.l0();
        }
        zh.a4 a4Var = coVar.qc;
        if (a4Var != null) {
            a4Var.invalidate();
        }
        ih.a aVar2 = coVar.Qb;
        if (aVar2 == null || aVar2.b <= 0) {
            return;
        }
        int childCount = aVar2.a.getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                z11 = false;
                break;
            }
            View childAt = aVar2.a.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.t1 ? aVar2.a(((org.telegram.ui.Cells.t1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.w0 ? aVar2.a(((org.telegram.ui.Cells.w0) childAt).getMessageObject()) : false) {
                break;
            } else {
                i14++;
            }
        }
        if (z11) {
            return;
        }
        aVar2.c(0, 0L);
    }
}
