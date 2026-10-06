package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class cj extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public cj(org.telegram.ui.Components.qv0 qv0Var, boolean z10, int i10, org.telegram.ui.Components.ju0 ju0Var) {
        this.e = qv0Var;
        this.b = z10;
        this.c = i10;
        this.d = ju0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.a) {
            case 0:
                yn ynVar = (yn) this.e;
                ynVar.M5 = true;
                ((org.telegram.ui.ActionBar.n2) ynVar).fragmentBeginToShow = true;
                ynVar.T9 = null;
                if (this.b) {
                    ynVar.ia = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) ynVar).actionBar;
                kVar.invalidate();
                ynVar.V0.invalidate();
                AndroidUtilities.runOnUIThread(new bj(this, 0), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.qv0 qv0Var = (org.telegram.ui.Components.qv0) this.e;
                int[] iArr = qv0Var.m1;
                org.telegram.ui.Components.ju0[] ju0VarArr = qv0Var.k0;
                qv0Var.o1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i12 = qv0Var.q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (qv0Var.c0(((org.telegram.ui.Components.ju0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(qv0Var.q1);
                    }
                }
                for (int i13 = 0; i13 < ju0VarArr.length; i13++) {
                    org.telegram.ui.Components.ju0 ju0Var = ju0VarArr[i13];
                    if (ju0Var != null && ju0Var.h != null && (((i10 = ju0Var.F) == 0 || org.telegram.ui.Components.qv0.p0(i10)) && (adapter = ju0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            qv0Var.t1[0].g(false);
                        }
                        if (z10) {
                            ju0VarArr[i13].x.y1(iArr[i11]);
                            ju0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(ju0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        ju0VarArr[i13].r.setVisibility(8);
                    }
                }
                if (qv0Var.s >= 0) {
                    for (int i14 = 0; i14 < ju0VarArr.length; i14++) {
                        org.telegram.ui.Components.ju0 ju0Var2 = ju0VarArr[i14];
                        if (ju0Var2.F == qv0Var.p1) {
                            if (z10 && (m10 = ju0Var2.s.m(qv0Var.s)) != null) {
                                qv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.ju0 ju0Var3 = ju0VarArr[i14];
                            ju0Var3.x.h1(qv0Var.s, (-ju0Var3.h.getPaddingTop()) + qv0Var.v);
                        }
                    }
                } else {
                    qv0Var.X0();
                }
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i10;
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                i10 = ((org.telegram.ui.ActionBar.n2) ((yn) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public cj(yn ynVar, boolean z10, Runnable runnable) {
        this.e = ynVar;
        this.b = z10;
        this.d = runnable;
    }
}
