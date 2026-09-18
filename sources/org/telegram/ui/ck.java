package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ck extends s4.s0 {
    public boolean b;
    public final /* synthetic */ bo d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public ck(bo boVar) {
        this.d = boVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        bo boVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.t1 t1Var = boVar.p2;
            if (t1Var != null) {
                boVar.n2.e(t1Var, -1, boVar.q2, boVar.r2, true);
                boVar.p2 = null;
            }
            boVar.j3 = false;
            boVar.k3 = false;
            boVar.l3 = false;
            boVar.m3 = false;
            boVar.f9(true);
            boVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = bo.Gc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            boVar.x0.setOverScrollMode(0);
            boVar.c9.W();
            boVar.Wc(false);
            boVar.q9(1);
            boVar.sa = false;
            return;
        }
        ci.f4 f4Var = boVar.y1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
        }
        org.telegram.ui.Components.n6 n6Var = boVar.W2;
        if (n6Var != null && n6Var.getVisibility() == 0 && boVar.x9()) {
            AndroidUtilities.hideKeyboard(boVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            boVar.D4 = true;
            boVar.l3 = true;
        } else if (i10 == 1) {
            boVar.p2 = null;
            boVar.D4 = true;
            boVar.j3 = true;
            boVar.k3 = true;
            boVar.m3 = true;
            boVar.l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = bo.Gc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        zg.t tVar = boVar.Y9;
        if (tVar == null || !tVar.d()) {
            return;
        }
        boVar.Y9.setHiddenByScroll(true);
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        boolean z10;
        bo boVar = this.d;
        bo boVar2 = boVar.da;
        if (boVar2 == null) {
            boVar2 = boVar;
        }
        boVar.x0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = boVar.z0.L0();
        if (((i11 != 0 && boVar.sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && boVar.N4 != 0) {
            if (!this.b || boVar.O4) {
                boVar.N4 = 0;
            } else if (!boVar.x0.X1 && L0 != -1) {
                int N0 = boVar.z0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = boVar.z0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.t1) {
                        messageObject = ((org.telegram.ui.Cells.t1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                        messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                    }
                    if (messageObject != null && boVar.N4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < boVar.N4) {
                    boVar.N4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            boVar.O4 = false;
            if (!boVar.D4 && i11 != 0) {
                boVar.D4 = true;
            }
        }
        if (i11 != 0) {
            boVar.q9(1);
            boVar.X0.getClass();
            boVar.h9(true);
        }
        if (i11 != 0 && boVar.j3 && !boVar.f3) {
            if (boVar.L7 != Integer.MAX_VALUE) {
                boVar.Ia();
                boVar.Wc(false);
            }
            boVar.Fb(true);
        }
        if (boVar.t9() && i11 != 0 && boVar.k3 && !boVar.f3) {
            if (boVar.L7 != Integer.MAX_VALUE) {
                boVar.Ia();
                boVar.Wc(false);
            }
            boVar.Gb(true);
        }
        boVar.a7(true);
        if (L0 != -1) {
            boVar.A0.h();
            if (L0 != 0 || !boVar.E6[0]) {
                aa.a[] aVarArr = boVar.j1.e;
                aa.a aVar = 1 < aVarArr.length ? aVarArr[1] : null;
                boolean z12 = aVar != null && ((le.b) aVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.a + i11;
                        this.a = f7;
                        if (f7 > i12) {
                            this.a = 0.0f;
                            boVar.g9 = true;
                            boVar.vc();
                            boVar.k1 = true;
                        }
                    }
                } else if (boVar.k1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        boVar.g9 = false;
                        boVar.vc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                boVar.g9 = false;
                boVar.vc();
            }
        }
        boVar.r9();
        boVar.c9.H();
        ArrayList arrayList = boVar.xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((hz) arrayList.get(i13)).c) {
                ((hz) arrayList.get(i13)).b -= i11;
            }
        }
        zg.l0 l0Var = zg.l0.B;
        if (l0Var != null) {
            l0Var.r -= i11;
            if (i11 != 0) {
                l0Var.u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (iVar = boVar2.F) != null) {
            iVar.f(i10, i11);
        }
        boVar.i7(false);
        ci.f4 f4Var = boVar.x1;
        if (f4Var != null) {
            if (f4Var.V) {
                f4Var.e(true);
            } else if (!boVar.Ub) {
                boVar.Tb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new wg(boVar, 28));
                AndroidUtilities.runOnUIThread(new wg(boVar, 29), 2000L);
            }
        }
        yl ylVar = boVar.B1;
        if (ylVar != null && ylVar.V) {
            ylVar.e(true);
        }
        ci.f4 f4Var2 = boVar.z1;
        if (f4Var2 == null || !f4Var2.V) {
            AndroidUtilities.cancelRunOnUIThread(new bk(boVar, 0));
            AndroidUtilities.runOnUIThread(new bk(boVar, 1), 2000L);
        } else {
            f4Var2.e(true);
        }
        ci.f4 f4Var3 = boVar.A1;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
        nk nkVar = boVar.Y;
        if (nkVar != null) {
            nkVar.m0();
        }
        yh.e4 e4Var = boVar.pc;
        if (e4Var != null) {
            e4Var.invalidate();
        }
        hh.a aVar2 = boVar.Pb;
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
