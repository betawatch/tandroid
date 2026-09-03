package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class cj extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public cj(org.telegram.ui.Components.yu0 yu0Var, boolean z4, int i10, org.telegram.ui.Components.qt0 qt0Var) {
        this.e = yu0Var;
        this.b = z4;
        this.c = i10;
        this.d = qt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m9;
        int i10;
        f2.o0 adapter;
        switch (this.a) {
            case 0:
                zn znVar = (zn) this.e;
                znVar.L5 = true;
                ((org.telegram.ui.ActionBar.p2) znVar).fragmentBeginToShow = true;
                znVar.S9 = null;
                if (this.b) {
                    znVar.ha = false;
                }
                kVar = ((org.telegram.ui.ActionBar.p2) znVar).actionBar;
                kVar.invalidate();
                znVar.U0.invalidate();
                AndroidUtilities.runOnUIThread(new bj(this, 0), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.yu0 yu0Var = (org.telegram.ui.Components.yu0) this.e;
                int[] iArr = yu0Var.j1;
                org.telegram.ui.Components.qt0[] qt0VarArr = yu0Var.h0;
                yu0Var.l1 = false;
                boolean z4 = this.b;
                if (z4) {
                    int i12 = yu0Var.n1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (yu0Var.c0(((org.telegram.ui.Components.qt0) this.d).C) >= 5) {
                        SharedConfig.setStoriesColumnsCount(yu0Var.n1);
                    }
                }
                for (int i13 = 0; i13 < qt0VarArr.length; i13++) {
                    org.telegram.ui.Components.qt0 qt0Var = qt0VarArr[i13];
                    if (qt0Var != null && qt0Var.h != null && (((i10 = qt0Var.C) == 0 || org.telegram.ui.Components.yu0.p0(i10)) && (adapter = qt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            yu0Var.q1[0].g(false);
                        }
                        if (z4) {
                            qt0VarArr[i13].x.y1(iArr[i11]);
                            qt0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(qt0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        qt0VarArr[i13].r.setVisibility(8);
                    }
                }
                if (yu0Var.s >= 0) {
                    for (int i14 = 0; i14 < qt0VarArr.length; i14++) {
                        org.telegram.ui.Components.qt0 qt0Var2 = qt0VarArr[i14];
                        if (qt0Var2.C == yu0Var.m1) {
                            if (z4 && (m9 = qt0Var2.s.m(yu0Var.s)) != null) {
                                yu0Var.v = m9.getTop();
                            }
                            org.telegram.ui.Components.qt0 qt0Var3 = qt0VarArr[i14];
                            qt0Var3.x.h1(yu0Var.s, (-qt0Var3.h.getPaddingTop()) + yu0Var.v);
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
                i10 = ((org.telegram.ui.ActionBar.p2) ((zn) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public cj(zn znVar, boolean z4, Runnable runnable) {
        this.e = znVar;
        this.b = z4;
        this.d = runnable;
    }
}
