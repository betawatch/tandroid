package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ej extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public ej(org.telegram.ui.Components.lv0 lv0Var, boolean z10, int i10, org.telegram.ui.Components.eu0 eu0Var) {
        this.e = lv0Var;
        this.b = z10;
        this.c = i10;
        this.d = eu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
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
                AndroidUtilities.runOnUIThread(new dj(this, 0), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.lv0 lv0Var = (org.telegram.ui.Components.lv0) this.e;
                int[] iArr = lv0Var.m1;
                org.telegram.ui.Components.eu0[] eu0VarArr = lv0Var.k0;
                lv0Var.o1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i12 = lv0Var.q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (lv0Var.c0(((org.telegram.ui.Components.eu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(lv0Var.q1);
                    }
                }
                for (int i13 = 0; i13 < eu0VarArr.length; i13++) {
                    org.telegram.ui.Components.eu0 eu0Var = eu0VarArr[i13];
                    if (eu0Var != null && eu0Var.h != null && (((i10 = eu0Var.F) == 0 || org.telegram.ui.Components.lv0.p0(i10)) && (adapter = eu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            lv0Var.t1[0].g(false);
                        }
                        if (z10) {
                            eu0VarArr[i13].x.y1(iArr[i11]);
                            eu0VarArr[i13].h.b0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(eu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        eu0VarArr[i13].r.setVisibility(8);
                    }
                }
                if (lv0Var.s >= 0) {
                    for (int i14 = 0; i14 < eu0VarArr.length; i14++) {
                        org.telegram.ui.Components.eu0 eu0Var2 = eu0VarArr[i14];
                        if (eu0Var2.F == lv0Var.p1) {
                            if (z10 && (m10 = eu0Var2.s.m(lv0Var.s)) != null) {
                                lv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.eu0 eu0Var3 = eu0VarArr[i14];
                            eu0Var3.x.h1(lv0Var.s, (-eu0Var3.h.getPaddingTop()) + lv0Var.v);
                        }
                    }
                } else {
                    lv0Var.X0();
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
