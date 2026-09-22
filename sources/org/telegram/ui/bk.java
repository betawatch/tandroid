package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class bk extends s4.s0 {
    public boolean b;
    public final /* synthetic */ zn d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public bk(zn znVar) {
        this.d = znVar;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        zn znVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = znVar.p2;
            if (u1Var != null) {
                znVar.n2.e(u1Var, -1, znVar.q2, znVar.r2, true);
                znVar.p2 = null;
            }
            znVar.j3 = false;
            znVar.k3 = false;
            znVar.l3 = false;
            znVar.m3 = false;
            znVar.f9(true);
            znVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = zn.Gc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            znVar.x0.setOverScrollMode(0);
            znVar.c9.W();
            znVar.Wc(false);
            znVar.q9(1);
            znVar.sa = false;
            return;
        }
        ci.f4 f4Var = znVar.y1;
        if (f4Var != null && f4Var.V) {
            f4Var.e(true);
        }
        org.telegram.ui.Components.o6 o6Var = znVar.W2;
        if (o6Var != null && o6Var.getVisibility() == 0 && znVar.x9()) {
            AndroidUtilities.hideKeyboard(znVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            znVar.D4 = true;
            znVar.l3 = true;
        } else if (i10 == 1) {
            znVar.p2 = null;
            znVar.D4 = true;
            znVar.j3 = true;
            znVar.k3 = true;
            znVar.m3 = true;
            znVar.l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = zn.Gc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        zg.u uVar = znVar.Y9;
        if (uVar == null || !uVar.d()) {
            return;
        }
        znVar.Y9.setHiddenByScroll(true);
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        boolean z10;
        zn znVar = this.d;
        zn znVar2 = znVar.da;
        if (znVar2 == null) {
            znVar2 = znVar;
        }
        znVar.x0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = znVar.z0.L0();
        if (((i11 != 0 && znVar.sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && znVar.N4 != 0) {
            if (!this.b || znVar.O4) {
                znVar.N4 = 0;
            } else if (!znVar.x0.X1 && L0 != -1) {
                int N0 = znVar.z0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = znVar.z0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.u1) {
                        messageObject = ((org.telegram.ui.Cells.u1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                        messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                    }
                    if (messageObject != null && znVar.N4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < znVar.N4) {
                    znVar.N4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            znVar.O4 = false;
            if (!znVar.D4 && i11 != 0) {
                znVar.D4 = true;
            }
        }
        if (i11 != 0) {
            znVar.q9(1);
            znVar.X0.getClass();
            znVar.h9(true);
        }
        if (i11 != 0 && znVar.j3 && !znVar.f3) {
            if (znVar.L7 != Integer.MAX_VALUE) {
                znVar.Ia();
                znVar.Wc(false);
            }
            znVar.Fb(true);
        }
        if (znVar.t9() && i11 != 0 && znVar.k3 && !znVar.f3) {
            if (znVar.L7 != Integer.MAX_VALUE) {
                znVar.Ia();
                znVar.Wc(false);
            }
            znVar.Gb(true);
        }
        znVar.a7(true);
        if (L0 != -1) {
            znVar.A0.h();
            if (L0 != 0 || !znVar.E6[0]) {
                aa.a[] aVarArr = znVar.j1.e;
                aa.a aVar = 1 < aVarArr.length ? aVarArr[1] : null;
                boolean z12 = aVar != null && ((le.b) aVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.a + i11;
                        this.a = f7;
                        if (f7 > i12) {
                            this.a = 0.0f;
                            znVar.g9 = true;
                            znVar.vc();
                            znVar.k1 = true;
                        }
                    }
                } else if (znVar.k1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        znVar.g9 = false;
                        znVar.vc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                znVar.g9 = false;
                znVar.vc();
            }
        }
        znVar.r9();
        znVar.c9.H();
        ArrayList arrayList = znVar.xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((fz) arrayList.get(i13)).c) {
                ((fz) arrayList.get(i13)).b -= i11;
            }
        }
        zg.l0 l0Var = zg.l0.B;
        if (l0Var != null) {
            l0Var.r -= i11;
            if (i11 != 0) {
                l0Var.u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (iVar = znVar2.F) != null) {
            iVar.f(i10, i11);
        }
        znVar.i7(false);
        ci.f4 f4Var = znVar.x1;
        if (f4Var != null) {
            if (f4Var.V) {
                f4Var.e(true);
            } else if (!znVar.Ub) {
                znVar.Tb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new ug(znVar, 28));
                AndroidUtilities.runOnUIThread(new ug(znVar, 29), 2000L);
            }
        }
        wl wlVar = znVar.B1;
        if (wlVar != null && wlVar.V) {
            wlVar.e(true);
        }
        ci.f4 f4Var2 = znVar.z1;
        if (f4Var2 == null || !f4Var2.V) {
            AndroidUtilities.cancelRunOnUIThread(new ak(znVar, 0));
            AndroidUtilities.runOnUIThread(new ak(znVar, 1), 2000L);
        } else {
            f4Var2.e(true);
        }
        ci.f4 f4Var3 = znVar.A1;
        if (f4Var3 != null) {
            f4Var3.e(true);
        }
        mk mkVar = znVar.Y;
        if (mkVar != null) {
            mkVar.l0();
        }
        yh.c4 c4Var = znVar.pc;
        if (c4Var != null) {
            c4Var.invalidate();
        }
        hh.a aVar2 = znVar.Pb;
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
            if (childAt instanceof org.telegram.ui.Cells.u1 ? aVar2.a(((org.telegram.ui.Cells.u1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.w0 ? aVar2.a(((org.telegram.ui.Cells.w0) childAt).getMessageObject()) : false) {
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
