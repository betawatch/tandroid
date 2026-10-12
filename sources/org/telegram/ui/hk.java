package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class hk extends s4.r0 {
    public boolean b;
    public final /* synthetic */ fo d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public hk(fo foVar) {
        this.d = foVar;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        fo foVar = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.u1 u1Var = foVar.p2;
            if (u1Var != null) {
                foVar.n2.e(u1Var, -1, foVar.q2, foVar.r2, true);
                foVar.p2 = null;
            }
            foVar.j3 = false;
            foVar.k3 = false;
            foVar.l3 = false;
            foVar.m3 = false;
            foVar.k9(true);
            foVar.l9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i11 = fo.Hc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            foVar.x0.setOverScrollMode(0);
            foVar.c9.V();
            foVar.ad(false);
            foVar.v9(1);
            foVar.sa = false;
            return;
        }
        di.d4 d4Var = foVar.y1;
        if (d4Var != null && d4Var.V) {
            d4Var.e(true);
        }
        org.telegram.ui.Components.s6 s6Var = foVar.W2;
        if (s6Var != null && s6Var.getVisibility() == 0 && foVar.C9()) {
            AndroidUtilities.hideKeyboard(foVar.getParentActivity().getCurrentFocus());
        }
        if (i10 == 2) {
            foVar.D4 = true;
            foVar.l3 = true;
        } else if (i10 == 1) {
            foVar.p2 = null;
            foVar.D4 = true;
            foVar.j3 = true;
            foVar.k3 = true;
            foVar.m3 = true;
            foVar.l3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i12 = fo.Hc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        ah.f0 f0Var = foVar.Y9;
        if (f0Var == null || !f0Var.d()) {
            return;
        }
        foVar.Y9.setHiddenByScroll(true);
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        boolean z10;
        fo foVar = this.d;
        fo foVar2 = foVar.da;
        if (foVar2 == null) {
            foVar2 = foVar;
        }
        foVar.x0.invalidate();
        boolean z11 = true;
        this.b = i11 < 0;
        int L0 = foVar.z0.L0();
        if (((i11 != 0 && foVar.sa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && foVar.N4 != 0) {
            if (!this.b || foVar.O4) {
                foVar.N4 = 0;
            } else if (!foVar.x0.V1 && L0 != -1) {
                int N0 = foVar.z0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = foVar.z0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.u1) {
                        messageObject = ((org.telegram.ui.Cells.u1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.x0) {
                        messageObject = ((org.telegram.ui.Cells.x0) m10).getMessageObject();
                    }
                    if (messageObject != null && foVar.N4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < foVar.N4) {
                    foVar.N4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            foVar.O4 = false;
            if (!foVar.D4 && i11 != 0) {
                foVar.D4 = true;
            }
        }
        if (i11 != 0) {
            foVar.v9(1);
            foVar.X0.getClass();
            foVar.m9(true);
        }
        if (i11 != 0 && foVar.j3 && !foVar.f3) {
            if (foVar.L7 != Integer.MAX_VALUE) {
                foVar.Ma();
                foVar.ad(false);
            }
            foVar.Jb(true);
        }
        if (foVar.y9() && i11 != 0 && foVar.k3 && !foVar.f3) {
            if (foVar.L7 != Integer.MAX_VALUE) {
                foVar.Ma();
                foVar.ad(false);
            }
            foVar.Kb(true);
        }
        foVar.d7(true);
        if (L0 != -1) {
            foVar.A0.h();
            if (L0 != 0 || !foVar.E6[0]) {
                androidx.biometric.e[] eVarArr = foVar.j1.e;
                androidx.biometric.e eVar = 1 < eVarArr.length ? eVarArr[1] : null;
                boolean z12 = eVar != null && ((ne.b) eVar.c).f;
                int i12 = this.c;
                if (i11 > 0) {
                    if (!z12) {
                        float f7 = this.a + i11;
                        this.a = f7;
                        if (f7 > i12) {
                            this.a = 0.0f;
                            foVar.g9 = true;
                            foVar.zc();
                            foVar.k1 = true;
                        }
                    }
                } else if (foVar.k1 && z12) {
                    float f10 = this.a + i11;
                    this.a = f10;
                    if (f10 < (-i12)) {
                        foVar.g9 = false;
                        foVar.zc();
                        this.a = 0.0f;
                    }
                }
            } else if (i11 >= 0) {
                foVar.g9 = false;
                foVar.zc();
            }
        }
        foVar.w9();
        foVar.c9.G();
        ArrayList arrayList = foVar.xa.F;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (!((jz) arrayList.get(i13)).c) {
                ((jz) arrayList.get(i13)).b -= i11;
            }
        }
        ah.d1 d1Var = ah.d1.B;
        if (d1Var != null) {
            d1Var.r -= i11;
            if (i11 != 0) {
                d1Var.u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (fVar = foVar2.F) != null) {
            fVar.f(i10, i11);
        }
        foVar.l7(false);
        di.d4 d4Var = foVar.x1;
        if (d4Var != null) {
            if (d4Var.V) {
                d4Var.e(true);
            } else if (!foVar.Vb) {
                foVar.Ub = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new xg(foVar, 29));
                AndroidUtilities.runOnUIThread(new gk(foVar, 0), 2000L);
            }
        }
        cm cmVar = foVar.B1;
        if (cmVar != null && cmVar.V) {
            cmVar.e(true);
        }
        di.d4 d4Var2 = foVar.z1;
        if (d4Var2 == null || !d4Var2.V) {
            AndroidUtilities.cancelRunOnUIThread(new gk(foVar, 1));
            AndroidUtilities.runOnUIThread(new gk(foVar, 2), 2000L);
        } else {
            d4Var2.e(true);
        }
        di.d4 d4Var3 = foVar.A1;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
        sk skVar = foVar.Y;
        if (skVar != null) {
            skVar.j0();
        }
        zh.v3 v3Var = foVar.qc;
        if (v3Var != null) {
            v3Var.invalidate();
        }
        ih.a aVar = foVar.Qb;
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
            if (childAt instanceof org.telegram.ui.Cells.u1 ? aVar.a(((org.telegram.ui.Cells.u1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.x0 ? aVar.a(((org.telegram.ui.Cells.x0) childAt).getMessageObject()) : false) {
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
