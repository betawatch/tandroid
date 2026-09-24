package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class bj extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public bj(org.telegram.ui.Components.jv0 jv0Var, boolean z10, int i10, org.telegram.ui.Components.cu0 cu0Var) {
        this.e = jv0Var;
        this.b = z10;
        this.c = i10;
        this.d = cu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i10;
        s4.h0 adapter;
        switch (this.a) {
            case 0:
                wn wnVar = (wn) this.e;
                wnVar.O5 = true;
                ((org.telegram.ui.ActionBar.m2) wnVar).fragmentBeginToShow = true;
                wnVar.V9 = null;
                if (this.b) {
                    wnVar.ka = false;
                }
                kVar = ((org.telegram.ui.ActionBar.m2) wnVar).actionBar;
                kVar.invalidate();
                wnVar.X0.invalidate();
                AndroidUtilities.runOnUIThread(new aj(this, 0), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.jv0 jv0Var = (org.telegram.ui.Components.jv0) this.e;
                int[] iArr = jv0Var.m1;
                org.telegram.ui.Components.cu0[] cu0VarArr = jv0Var.k0;
                jv0Var.o1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i12 = jv0Var.q1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        SharedConfig.setMediaColumnsCount(i12);
                    } else if (jv0Var.c0(((org.telegram.ui.Components.cu0) this.d).F) >= 5) {
                        SharedConfig.setStoriesColumnsCount(jv0Var.q1);
                    }
                }
                for (int i13 = 0; i13 < cu0VarArr.length; i13++) {
                    org.telegram.ui.Components.cu0 cu0Var = cu0VarArr[i13];
                    if (cu0Var != null && cu0Var.h != null && (((i10 = cu0Var.F) == 0 || org.telegram.ui.Components.jv0.p0(i10)) && (adapter = cu0VarArr[i13].h.getAdapter()) != null)) {
                        int h = adapter.h();
                        if (i13 == 0) {
                            jv0Var.t1[0].g(false);
                        }
                        if (z10) {
                            cu0VarArr[i13].x.y1(iArr[i11]);
                            cu0VarArr[i13].h.a0();
                            if (adapter.h() == h) {
                                AndroidUtilities.updateVisibleRows(cu0VarArr[i13].h);
                            } else {
                                adapter.l();
                            }
                        }
                        cu0VarArr[i13].r.setVisibility(8);
                    }
                }
                if (jv0Var.s >= 0) {
                    for (int i14 = 0; i14 < cu0VarArr.length; i14++) {
                        org.telegram.ui.Components.cu0 cu0Var2 = cu0VarArr[i14];
                        if (cu0Var2.F == jv0Var.p1) {
                            if (z10 && (m10 = cu0Var2.s.m(jv0Var.s)) != null) {
                                jv0Var.v = m10.getTop();
                            }
                            org.telegram.ui.Components.cu0 cu0Var3 = cu0VarArr[i14];
                            cu0Var3.x.h1(jv0Var.s, (-cu0Var3.h.getPaddingTop()) + jv0Var.v);
                        }
                    }
                } else {
                    jv0Var.X0();
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
                i10 = ((org.telegram.ui.ActionBar.m2) ((wn) this.e)).currentAccount;
                this.c = NotificationCenter.getInstance(i10).setAnimationInProgress(this.c, null);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public bj(wn wnVar, boolean z10, Runnable runnable) {
        this.e = wnVar;
        this.b = z10;
        this.d = runnable;
    }
}
