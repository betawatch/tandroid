package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dk extends s4.s0 {
    public boolean b;
    public final /* synthetic */ eo d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public dk(eo eoVar) {
        this.d = eoVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        eo eoVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.t1 t1Var = eoVar.p2;
            if (t1Var != null) {
                eoVar.n2.e(t1Var, -1, eoVar.q2, eoVar.r2, true);
                eoVar.p2 = null;
            }
            eoVar.j3 = false;
            eoVar.k3 = false;
            eoVar.l3 = false;
            eoVar.m3 = false;
            eoVar.f9(true);
            eoVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = eo.Hc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            eoVar.x0.setOverScrollMode(0);
            eoVar.c9.W();
            eoVar.Wc(false);
            eoVar.q9(1);
            eoVar.sa = false;
            return;
        }
        bi.x4 x4Var = eoVar.y1;
        if (x4Var != null && x4Var.V) {
            x4Var.e(true);
        }
        org.telegram.ui.Components.o6 o6Var = eoVar.W2;
        if (o6Var != null && o6Var.getVisibility() == 0 && eoVar.x9()) {
            AndroidUtilities.hideKeyboard(eoVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            eoVar.D4 = true;
            eoVar.l3 = true;
        } else if (i10 == 1) {
            eoVar.p2 = null;
            eoVar.D4 = true;
            eoVar.j3 = true;
            eoVar.k3 = true;
            eoVar.m3 = true;
            eoVar.l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = eo.Hc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        yg.v vVar = eoVar.Y9;
        if (vVar == null || !vVar.d()) {
            return;
        }
        eoVar.Y9.setHiddenByScroll(true);
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        zg.e eVar;
        boolean z10;
        eo eoVar = this.d;
        eo eoVar2 = eoVar.da;
        if (eoVar2 == null) {
            eoVar2 = eoVar;
        }
        eoVar.x0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = eoVar.z0.L0();
        if (((i11 != 0 && eoVar.sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && eoVar.N4 != 0) {
            if (!this.b || eoVar.O4) {
                eoVar.N4 = 0;
            } else if (!eoVar.x0.X1 && L0 != -1) {
                int N0 = eoVar.z0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = eoVar.z0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.t1) {
                        messageObject = ((org.telegram.ui.Cells.t1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                        messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                    }
                    if (messageObject != null && eoVar.N4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < eoVar.N4) {
                    eoVar.N4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            eoVar.O4 = false;
            if (!eoVar.D4 && i11 != 0) {
                eoVar.D4 = true;
            }
        }
        if (i11 != 0) {
            eoVar.q9(1);
            eoVar.X0.getClass();
            eoVar.h9(true);
        }
        if (i11 != 0 && eoVar.j3 && !eoVar.f3) {
            if (eoVar.L7 != Integer.MAX_VALUE) {
                eoVar.Ia();
                eoVar.Wc(false);
            }
            eoVar.Fb(true);
        }
        if (eoVar.t9() && i11 != 0 && eoVar.k3 && !eoVar.f3) {
            if (eoVar.L7 != Integer.MAX_VALUE) {
                eoVar.Ia();
                eoVar.Wc(false);
            }
            eoVar.Gb(true);
        }
        eoVar.a7(true);
        if (L0 != -1) {
            eoVar.A0.h();
            if (L0 != 0 || !eoVar.E6[0]) {
                aa.a[] aVarArr = eoVar.j1.e;
                aa.a aVar = 1 < aVarArr.length ? aVarArr[1] : null;
                boolean z12 = aVar != null && ((le.b) aVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.a + i11;
                        this.a = f7;
                        if (f7 > i12) {
                            this.a = 0.0f;
                            eoVar.g9 = true;
                            eoVar.vc();
                            eoVar.k1 = true;
                        }
                    }
                } else if (eoVar.k1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        eoVar.g9 = false;
                        eoVar.vc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                eoVar.g9 = false;
                eoVar.vc();
            }
        }
        eoVar.r9();
        eoVar.c9.H();
        ArrayList arrayList = eoVar.xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((hz) arrayList.get(i13)).c) {
                ((hz) arrayList.get(i13)).b -= i11;
            }
        }
        yg.l0 l0Var = yg.l0.B;
        if (l0Var != null) {
            l0Var.r -= i11;
            if (i11 != 0) {
                l0Var.u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = eoVar2.F) != null) {
            eVar.f(i10, i11);
        }
        eoVar.i7(false);
        bi.x4 x4Var = eoVar.x1;
        if (x4Var != null) {
            if (x4Var.V) {
                x4Var.e(true);
            } else if (!eoVar.Vb) {
                eoVar.Ub = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new vg(eoVar, 28));
                AndroidUtilities.runOnUIThread(new vg(eoVar, 29), 2000L);
            }
        }
        am amVar = eoVar.B1;
        if (amVar != null && amVar.V) {
            amVar.e(true);
        }
        bi.x4 x4Var2 = eoVar.z1;
        if (x4Var2 == null || !x4Var2.V) {
            AndroidUtilities.cancelRunOnUIThread(new ck(eoVar, 0));
            AndroidUtilities.runOnUIThread(new ck(eoVar, 1), 2000L);
        } else {
            x4Var2.e(true);
        }
        bi.x4 x4Var3 = eoVar.A1;
        if (x4Var3 != null) {
            x4Var3.e(true);
        }
        ok okVar = eoVar.Y;
        if (okVar != null) {
            okVar.l0();
        }
        xh.b4 b4Var = eoVar.qc;
        if (b4Var != null) {
            b4Var.invalidate();
        }
        gh.a aVar2 = eoVar.Qb;
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
