package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ej extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public ej(org.telegram.ui.Components.bw0 bw0Var, boolean z10, int i10, org.telegram.ui.Components.uu0 uu0Var) {
        this.e = bw0Var;
        this.b = z10;
        this.c = i10;
        this.d = uu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.i0 adapter;
        switch (this.a) {
            case 0:
                zn znVar = (zn) this.e;
                znVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) znVar).fragmentBeginToShow = true;
                znVar.V9 = null;
                if (this.b) {
                    znVar.ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.invalidate();
                znVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new cj(this, 1), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.bw0 bw0Var = (org.telegram.ui.Components.bw0) this.e;
                int[] iArr = bw0Var.m1;
                org.telegram.ui.Components.uu0[] uu0VarArr = bw0Var.k0;
                bw0Var.o1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i12 = bw0Var.q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (bw0Var.c0(((org.telegram.ui.Components.uu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(bw0Var.q1);
                    }
                }
                for (int i13 = 0; i13 < uu0VarArr.length; i13++) {
                    org.telegram.ui.Components.uu0 uu0Var = uu0VarArr[i13];
                    if (uu0Var != null && uu0Var.h != null && (((i10 = uu0Var.F) == 0 || org.telegram.ui.Components.bw0.p0(i10)) && (adapter = uu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            bw0Var.t1[0].g(false);
                        }
                        if (z10) {
                            uu0VarArr[i13].x.y1(iArr[i11]);
                            uu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(uu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        uu0VarArr[i13].r.setVisibility(8);
                    }
                }
                if (bw0Var.s >= 0) {
                    for (int i14 = 0; i14 < uu0VarArr.length; i14++) {
                        org.telegram.ui.Components.uu0 uu0Var2 = uu0VarArr[i14];
                        if (uu0Var2.F == bw0Var.p1) {
                            if (z10 && (m10 = uu0Var2.s.m(bw0Var.s)) != null) {
                                bw0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.uu0 uu0Var3 = uu0VarArr[i14];
                            uu0Var3.x.h1(bw0Var.s, (-uu0Var3.h.getPaddingTop()) + bw0Var.v);
                        }
                    }
                } else {
                    bw0Var.X0();
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
                i10 = ((org.telegram.ui.ActionBar.n2) ((zn) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ej(zn znVar, boolean z10, Runnable runnable) {
        this.e = znVar;
        this.b = z10;
        this.d = runnable;
    }
}
