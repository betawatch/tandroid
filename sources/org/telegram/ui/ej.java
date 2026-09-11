package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ej extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public ej(org.telegram.ui.Components.xu0 xu0Var, boolean z10, int i10, org.telegram.ui.Components.qt0 qt0Var) {
        this.e = xu0Var;
        this.b = z10;
        this.c = i10;
        this.d = qt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.a) {
            case 0:
                co coVar = (co) this.e;
                coVar.O5 = true;
                ((org.telegram.ui.ActionBar.n2) coVar).fragmentBeginToShow = true;
                coVar.V9 = null;
                if (this.b) {
                    coVar.ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                kVar.invalidate();
                coVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new dj(this, 0), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.xu0 xu0Var = (org.telegram.ui.Components.xu0) this.e;
                int[] iArr = xu0Var.m1;
                org.telegram.ui.Components.qt0[] qt0VarArr = xu0Var.k0;
                xu0Var.o1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i12 = xu0Var.q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (xu0Var.c0(((org.telegram.ui.Components.qt0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(xu0Var.q1);
                    }
                }
                for (int i13 = 0; i13 < qt0VarArr.length; i13++) {
                    org.telegram.ui.Components.qt0 qt0Var = qt0VarArr[i13];
                    if (qt0Var != null && qt0Var.h != null && (((i10 = qt0Var.F) == 0 || org.telegram.ui.Components.xu0.p0(i10)) && (adapter = qt0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            xu0Var.t1[0].g(false);
                        }
                        if (z10) {
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
                if (xu0Var.s >= 0) {
                    for (int i14 = 0; i14 < qt0VarArr.length; i14++) {
                        org.telegram.ui.Components.qt0 qt0Var2 = qt0VarArr[i14];
                        if (qt0Var2.F == xu0Var.p1) {
                            if (z10 && (m10 = qt0Var2.s.m(xu0Var.s)) != null) {
                                xu0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.qt0 qt0Var3 = qt0VarArr[i14];
                            qt0Var3.x.h1(xu0Var.s, (-qt0Var3.h.getPaddingTop()) + xu0Var.v);
                        }
                    }
                } else {
                    xu0Var.X0();
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
                i10 = ((org.telegram.ui.ActionBar.n2) ((co) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ej(co coVar, boolean z10, Runnable runnable) {
        this.e = coVar;
        this.b = z10;
        this.d = runnable;
    }
}
