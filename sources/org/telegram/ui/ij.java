package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ij extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public ij(org.telegram.ui.Components.xv0 xv0Var, boolean z10, int i10, org.telegram.ui.Components.qu0 qu0Var) {
        this.e = xv0Var;
        this.b = z10;
        this.c = i10;
        this.d = qu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.g0 adapter;
        switch (this.a) {
            case 0:
                fo foVar = (fo) this.e;
                foVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) foVar).fragmentBeginToShow = true;
                foVar.V9 = null;
                if (this.b) {
                    foVar.ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                kVar.invalidate();
                foVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new gj(this, 1), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) this.e;
                int[] iArr = xv0Var.m1;
                org.telegram.ui.Components.qu0[] qu0VarArr = xv0Var.k0;
                xv0Var.o1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i12 = xv0Var.q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (xv0Var.c0(((org.telegram.ui.Components.qu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(xv0Var.q1);
                    }
                }
                for (int i13 = 0; i13 < qu0VarArr.length; i13++) {
                    org.telegram.ui.Components.qu0 qu0Var = qu0VarArr[i13];
                    if (qu0Var != null && qu0Var.h != null && (((i10 = qu0Var.F) == 0 || org.telegram.ui.Components.xv0.p0(i10)) && (adapter = qu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            xv0Var.t1[0].g(false);
                        }
                        if (z10) {
                            qu0VarArr[i13].x.y1(iArr[i11]);
                            qu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(qu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        qu0VarArr[i13].r.setVisibility(8);
                    }
                }
                if (xv0Var.s >= 0) {
                    for (int i14 = 0; i14 < qu0VarArr.length; i14++) {
                        org.telegram.ui.Components.qu0 qu0Var2 = qu0VarArr[i14];
                        if (qu0Var2.F == xv0Var.p1) {
                            if (z10 && (m10 = qu0Var2.s.m(xv0Var.s)) != null) {
                                xv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.qu0 qu0Var3 = qu0VarArr[i14];
                            qu0Var3.x.h1(xv0Var.s, (-qu0Var3.h.getPaddingTop()) + xv0Var.v);
                        }
                    }
                } else {
                    xv0Var.X0();
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
                i10 = ((org.telegram.ui.ActionBar.m2) ((fo) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ij(fo foVar, boolean z10, Runnable runnable) {
        this.e = foVar;
        this.b = z10;
        this.d = runnable;
    }
}
