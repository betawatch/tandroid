package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ej extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public ej(org.telegram.ui.Components.yu0 yu0Var, boolean z10, int i10, org.telegram.ui.Components.rt0 rt0Var) {
        this.e = yu0Var;
        this.b = z10;
        this.c = i10;
        this.d = rt0Var;
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
                ((org.telegram.ui.ActionBar.n2) boVar).fragmentBeginToShow = true;
                boVar.V9 = null;
                if (this.b) {
                    boVar.ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) boVar).actionBar;
                kVar.invalidate();
                boVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new dj(this, 0), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.yu0 yu0Var = (org.telegram.ui.Components.yu0) this.e;
                int[] iArr = yu0Var.m1;
                org.telegram.ui.Components.rt0[] rt0VarArr = yu0Var.k0;
                yu0Var.o1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i12 = yu0Var.q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (yu0Var.c0(((org.telegram.ui.Components.rt0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(yu0Var.q1);
                    }
                }
                for (int i13 = 0; i13 < rt0VarArr.length; i13++) {
                    org.telegram.ui.Components.rt0 rt0Var = rt0VarArr[i13];
                    if (rt0Var != null && rt0Var.h != null && (((i10 = rt0Var.F) == 0 || org.telegram.ui.Components.yu0.p0(i10)) && (adapter = rt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            yu0Var.t1[0].g(false);
                        }
                        if (z10) {
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
                if (yu0Var.s >= 0) {
                    for (int i14 = 0; i14 < rt0VarArr.length; i14++) {
                        org.telegram.ui.Components.rt0 rt0Var2 = rt0VarArr[i14];
                        if (rt0Var2.F == yu0Var.p1) {
                            if (z10 && (m10 = rt0Var2.s.m(yu0Var.s)) != null) {
                                yu0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.rt0 rt0Var3 = rt0VarArr[i14];
                            rt0Var3.x.h1(yu0Var.s, (-rt0Var3.h.getPaddingTop()) + yu0Var.v);
                        }
                    }
                } else {
                    yu0Var.X0();
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
                i10 = ((org.telegram.ui.ActionBar.n2) ((bo) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ej(bo boVar, boolean z10, Runnable runnable) {
        this.e = boVar;
        this.b = z10;
        this.d = runnable;
    }
}
