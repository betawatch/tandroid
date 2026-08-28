package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pj extends f2.d1 {
    public boolean b;
    public final /* synthetic */ qn d;
    public float a = 0.0f;
    public final int c = AndroidUtilities.dp(100.0f);

    public pj(qn qnVar) {
        this.d = qnVar;
    }

    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        qn qnVar = this.d;
        if (i9 == 0) {
            org.telegram.ui.Cells.t1 t1Var = qnVar.l2;
            if (t1Var != null) {
                qnVar.j2.e(t1Var, -1, qnVar.m2, qnVar.n2, true);
                qnVar.l2 = null;
            }
            qnVar.f3 = false;
            qnVar.g3 = false;
            qnVar.h3 = false;
            qnVar.i3 = false;
            qnVar.f9(true);
            qnVar.g9(true);
            if (SharedConfig.getDevicePerformanceClass() == 0) {
                int i10 = qn.Dc;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startSpoilers, new Object[0]);
            qnVar.t0.setOverScrollMode(0);
            qnVar.Y8.W();
            qnVar.Wc(false);
            qnVar.q9(1);
            qnVar.oa = false;
            return;
        }
        kh.x3 x3Var = qnVar.u1;
        if (x3Var != null && x3Var.R) {
            x3Var.e(true);
        }
        org.telegram.ui.Components.j6 j6Var = qnVar.S2;
        if (j6Var != null && j6Var.getVisibility() == 0 && qnVar.x9()) {
            AndroidUtilities.hideKeyboard(qnVar.getParentActivity().getCurrentFocus());
        }
        if (i9 == 2) {
            qnVar.z4 = true;
            qnVar.h3 = true;
        } else if (i9 == 1) {
            qnVar.l2 = null;
            qnVar.z4 = true;
            qnVar.f3 = true;
            qnVar.g3 = true;
            qnVar.i3 = true;
            qnVar.h3 = true;
        }
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            int i11 = qn.Dc;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopSpoilers, new Object[0]);
        hg.v vVar = qnVar.U9;
        if (vVar == null || !vVar.d()) {
            return;
        }
        qnVar.U9.setHiddenByScroll(true);
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ig.e eVar;
        boolean z10;
        qn qnVar = this.d;
        qn qnVar2 = qnVar.Z9;
        if (qnVar2 == null) {
            qnVar2 = qnVar;
        }
        qnVar.t0.invalidate();
        boolean z11 = true;
        this.b = i10 < 0;
        int L0 = qnVar.v0.L0();
        if (((i10 != 0 && qnVar.oa && recyclerView.getScrollState() == 2) || recyclerView.getScrollState() == 1) && qnVar.J4 != 0) {
            if (!this.b || qnVar.K4) {
                qnVar.J4 = 0;
            } else if (!qnVar.t0.T1 && L0 != -1) {
                int N0 = qnVar.v0.N0();
                MessageObject messageObject = null;
                while (true) {
                    if (N0 < L0) {
                        z10 = false;
                        break;
                    }
                    View m10 = qnVar.v0.m(N0);
                    if (m10 instanceof org.telegram.ui.Cells.t1) {
                        messageObject = ((org.telegram.ui.Cells.t1) m10).getMessageObject();
                    } else if (m10 instanceof org.telegram.ui.Cells.w0) {
                        messageObject = ((org.telegram.ui.Cells.w0) m10).getMessageObject();
                    }
                    if (messageObject != null && qnVar.J4 == messageObject.getId()) {
                        z10 = true;
                        break;
                    }
                    N0--;
                }
                if (!z10 && messageObject != null && messageObject.getId() < qnVar.J4) {
                    qnVar.J4 = 0;
                }
            }
        }
        if (recyclerView.getScrollState() == 1) {
            qnVar.K4 = false;
            if (!qnVar.z4 && i10 != 0) {
                qnVar.z4 = true;
            }
        }
        if (i10 != 0) {
            qnVar.q9(1);
            qnVar.T0.getClass();
            qnVar.h9(true);
        }
        if (i10 != 0 && qnVar.f3 && !qnVar.b3) {
            if (qnVar.H7 != Integer.MAX_VALUE) {
                qnVar.Ia();
                qnVar.Wc(false);
            }
            qnVar.Fb(true);
        }
        if (qnVar.t9() && i10 != 0 && qnVar.g3 && !qnVar.b3) {
            if (qnVar.H7 != Integer.MAX_VALUE) {
                qnVar.Ia();
                qnVar.Wc(false);
            }
            qnVar.Gb(true);
        }
        qnVar.a7(true);
        if (L0 != -1) {
            qnVar.w0.h();
            if (L0 != 0 || !qnVar.A6[0]) {
                j4.c[] cVarArr = qnVar.f1.e;
                j4.c cVar = 1 < cVarArr.length ? cVarArr[1] : null;
                boolean z12 = cVar != null && ((td.a) cVar.c).f;
                int i11 = this.c;
                if (i10 > 0) {
                    if (!z12) {
                        float f10 = this.a + i10;
                        this.a = f10;
                        if (f10 > i11) {
                            this.a = 0.0f;
                            qnVar.c9 = true;
                            qnVar.vc();
                            qnVar.g1 = true;
                        }
                    }
                } else if (qnVar.g1 && z12) {
                    float f11 = this.a + i10;
                    this.a = f11;
                    if (f11 < (-i11)) {
                        qnVar.c9 = false;
                        qnVar.vc();
                        this.a = 0.0f;
                    }
                }
            } else if (i10 >= 0) {
                qnVar.c9 = false;
                qnVar.vc();
            }
        }
        qnVar.r9();
        qnVar.Y8.H();
        ArrayList arrayList = qnVar.ta.B;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (!((oy) arrayList.get(i12)).c) {
                ((oy) arrayList.get(i12)).b -= i10;
            }
        }
        hg.n0 n0Var = hg.n0.B;
        if (n0Var != null) {
            n0Var.r -= i10;
            if (i10 != 0) {
                n0Var.u = true;
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && (eVar = qnVar2.B) != null) {
            eVar.f(i9, i10);
        }
        qnVar.i7(false);
        kh.x3 x3Var = qnVar.t1;
        if (x3Var != null) {
            if (x3Var.R) {
                x3Var.e(true);
            } else if (!qnVar.Rb) {
                qnVar.Qb = System.currentTimeMillis();
                AndroidUtilities.cancelRunOnUIThread(new jg(qnVar, 28));
                AndroidUtilities.runOnUIThread(new jg(qnVar, 29), 2000L);
            }
        }
        ml mlVar = qnVar.x1;
        if (mlVar != null && mlVar.R) {
            mlVar.e(true);
        }
        kh.x3 x3Var2 = qnVar.v1;
        if (x3Var2 == null || !x3Var2.R) {
            AndroidUtilities.cancelRunOnUIThread(new oj(qnVar, 0));
            AndroidUtilities.runOnUIThread(new oj(qnVar, 1), 2000L);
        } else {
            x3Var2.e(true);
        }
        kh.x3 x3Var3 = qnVar.w1;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
        ak akVar = qnVar.U;
        if (akVar != null) {
            akVar.k0();
        }
        gh.p5 p5Var = qnVar.mc;
        if (p5Var != null) {
            p5Var.invalidate();
        }
        pg.a aVar = qnVar.Mb;
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
            if (childAt instanceof org.telegram.ui.Cells.t1 ? aVar.a(((org.telegram.ui.Cells.t1) childAt).getMessageObject()) : childAt instanceof org.telegram.ui.Cells.w0 ? aVar.a(((org.telegram.ui.Cells.w0) childAt).getMessageObject()) : false) {
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
