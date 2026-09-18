package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fj extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public fj(org.telegram.ui.Components.zu0 zu0Var, boolean z10, int i10, org.telegram.ui.Components.st0 st0Var) {
        this.e = zu0Var;
        this.b = z10;
        this.c = i10;
        this.d = st0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.a) {
            case 0:
                bo boVar = (bo) this.e;
                boVar.O5 = true;
                ((org.telegram.ui.ActionBar.o2) boVar).fragmentBeginToShow = true;
                boVar.V9 = null;
                if (this.b) {
                    boVar.ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                kVar.invalidate();
                boVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new ej(this, 0), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.zu0 zu0Var = (org.telegram.ui.Components.zu0) this.e;
                int[] iArr = zu0Var.m1;
                org.telegram.ui.Components.st0[] st0VarArr = zu0Var.k0;
                zu0Var.o1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i12 = zu0Var.q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (zu0Var.c0(((org.telegram.ui.Components.st0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(zu0Var.q1);
                    }
                }
                for (int i13 = 0; i13 < st0VarArr.length; i13++) {
                    org.telegram.ui.Components.st0 st0Var = st0VarArr[i13];
                    if (st0Var != null && st0Var.h != null && (((i10 = st0Var.F) == 0 || org.telegram.ui.Components.zu0.p0(i10)) && (adapter = st0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            zu0Var.t1[0].g(false);
                        }
                        if (z10) {
                            st0VarArr[i13].x.y1(iArr[i11]);
                            st0VarArr[i13].h.b0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(st0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        st0VarArr[i13].r.setVisibility(8);
                    }
                }
                if (zu0Var.s >= 0) {
                    for (int i14 = 0; i14 < st0VarArr.length; i14++) {
                        org.telegram.ui.Components.st0 st0Var2 = st0VarArr[i14];
                        if (st0Var2.F == zu0Var.p1) {
                            if (z10 && (m10 = st0Var2.s.m(zu0Var.s)) != null) {
                                zu0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.st0 st0Var3 = st0VarArr[i14];
                            st0Var3.x.h1(zu0Var.s, (-st0Var3.h.getPaddingTop()) + zu0Var.v);
                        }
                    }
                } else {
                    zu0Var.X0();
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
                i10 = ((org.telegram.ui.ActionBar.o2) ((bo) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public fj(bo boVar, boolean z10, Runnable runnable) {
        this.e = boVar;
        this.b = z10;
        this.d = runnable;
    }
}
