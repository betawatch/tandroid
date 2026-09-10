package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gj extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public gj(org.telegram.ui.Components.iv0 iv0Var, boolean z10, int i10, org.telegram.ui.Components.au0 au0Var) {
        this.e = iv0Var;
        this.b = z10;
        this.c = i10;
        this.d = au0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.a) {
            case 0:
                eo eoVar = (eo) this.e;
                eoVar.O5 = true;
                ((org.telegram.ui.ActionBar.p2) eoVar).fragmentBeginToShow = true;
                eoVar.V9 = null;
                if (this.b) {
                    eoVar.ka = false;
                }
                lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                lVar.invalidate();
                eoVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new fj(this, 0), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.iv0 iv0Var = (org.telegram.ui.Components.iv0) this.e;
                int[] iArr = iv0Var.m1;
                org.telegram.ui.Components.au0[] au0VarArr = iv0Var.k0;
                iv0Var.o1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i12 = iv0Var.q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (iv0Var.c0(((org.telegram.ui.Components.au0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(iv0Var.q1);
                    }
                }
                for (int i13 = 0; i13 < au0VarArr.length; i13++) {
                    org.telegram.ui.Components.au0 au0Var = au0VarArr[i13];
                    if (au0Var != null && au0Var.h != null && (((i10 = au0Var.F) == 0 || org.telegram.ui.Components.iv0.p0(i10)) && (adapter = au0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            iv0Var.t1[0].g(false);
                        }
                        if (z10) {
                            au0VarArr[i13].x.y1(iArr[i11]);
                            au0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(au0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        au0VarArr[i13].r.setVisibility(8);
                    }
                }
                if (iv0Var.s >= 0) {
                    for (int i14 = 0; i14 < au0VarArr.length; i14++) {
                        org.telegram.ui.Components.au0 au0Var2 = au0VarArr[i14];
                        if (au0Var2.F == iv0Var.p1) {
                            if (z10 && (m10 = au0Var2.s.m(iv0Var.s)) != null) {
                                iv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.au0 au0Var3 = au0VarArr[i14];
                            au0Var3.x.h1(iv0Var.s, (-au0Var3.h.getPaddingTop()) + iv0Var.v);
                        }
                    }
                } else {
                    iv0Var.X0();
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
                i10 = ((org.telegram.ui.ActionBar.p2) ((eo) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public gj(eo eoVar, boolean z10, Runnable runnable) {
        this.e = eoVar;
        this.b = z10;
        this.d = runnable;
    }
}
