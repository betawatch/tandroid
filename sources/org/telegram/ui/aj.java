package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class aj extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public aj(org.telegram.ui.Components.zu0 zu0Var, boolean z4, int i10, org.telegram.ui.Components.rt0 rt0Var) {
        this.e = zu0Var;
        this.b = z4;
        this.c = i10;
        this.d = rt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m9;
        int i10;
        f2.p0 adapter;
        switch (this.a) {
            case 0:
                xn xnVar = (xn) this.e;
                xnVar.L5 = true;
                ((org.telegram.ui.ActionBar.p2) xnVar).fragmentBeginToShow = true;
                xnVar.S9 = null;
                if (this.b) {
                    xnVar.ha = false;
                }
                kVar = ((org.telegram.ui.ActionBar.p2) xnVar).actionBar;
                kVar.invalidate();
                xnVar.U0.invalidate();
                AndroidUtilities.runOnUIThread(new zi(this, 0), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.zu0 zu0Var = (org.telegram.ui.Components.zu0) this.e;
                int[] iArr = zu0Var.j1;
                org.telegram.ui.Components.rt0[] rt0VarArr = zu0Var.h0;
                zu0Var.l1 = false;
                boolean z4 = this.b;
                if (z4) {
                    int i12 = zu0Var.n1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (zu0Var.c0(((org.telegram.ui.Components.rt0) this.d).C) >= 5) {
                        SharedConfig.setStoriesColumnsCount(zu0Var.n1);
                    }
                }
                for (int i13 = 0; i13 < rt0VarArr.length; i13++) {
                    org.telegram.ui.Components.rt0 rt0Var = rt0VarArr[i13];
                    if (rt0Var != null && rt0Var.h != null && (((i10 = rt0Var.C) == 0 || org.telegram.ui.Components.zu0.p0(i10)) && (adapter = rt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            zu0Var.q1[0].g(false);
                        }
                        if (z4) {
                            rt0VarArr[i13].x.y1(iArr[i11]);
                            rt0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(rt0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        rt0VarArr[i13].r.setVisibility(8);
                    }
                }
                if (zu0Var.s >= 0) {
                    for (int i14 = 0; i14 < rt0VarArr.length; i14++) {
                        org.telegram.ui.Components.rt0 rt0Var2 = rt0VarArr[i14];
                        if (rt0Var2.C == zu0Var.m1) {
                            if (z4 && (m9 = rt0Var2.s.m(zu0Var.s)) != null) {
                                zu0Var.v = m9.getTop();
                            }
                            org.telegram.ui.Components.rt0 rt0Var3 = rt0VarArr[i14];
                            rt0Var3.x.h1(zu0Var.s, (-rt0Var3.h.getPaddingTop()) + zu0Var.v);
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
                i10 = ((org.telegram.ui.ActionBar.p2) ((xn) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public aj(xn xnVar, boolean z4, Runnable runnable) {
        this.e = xnVar;
        this.b = z4;
        this.d = runnable;
    }
}
