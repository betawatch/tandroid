package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dj extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.us e;

    public dj(org.telegram.ui.Components.zt0 zt0Var, boolean z10, int i10, org.telegram.ui.Components.ss0 ss0Var) {
        this.e = zt0Var;
        this.b = z10;
        this.c = i10;
        this.d = ss0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        View m10;
        int i10;
        s4.g0 adapter;
        switch (this.a) {
            case 0:
                un unVar = (un) this.e;
                unVar.e6 = true;
                ((org.telegram.ui.ActionBar.k2) unVar).fragmentBeginToShow = true;
                unVar.oa = null;
                if (this.b) {
                    unVar.Da = false;
                }
                lVar = ((org.telegram.ui.ActionBar.k2) unVar).actionBar;
                lVar.invalidate();
                unVar.l1.invalidate();
                org.telegram.messenger.i0.h3(new rh(this, 2), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i11 = this.c;
                org.telegram.ui.Components.zt0 zt0Var = (org.telegram.ui.Components.zt0) this.e;
                int[] iArr = zt0Var.o1;
                org.telegram.ui.Components.ss0[] ss0VarArr = zt0Var.m0;
                zt0Var.q1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i12 = zt0Var.s1;
                    iArr[i11] = i12;
                    if (i11 == 0) {
                        org.telegram.messenger.tz.B(i12);
                    } else if (zt0Var.k0(((org.telegram.ui.Components.ss0) this.d).E) >= 5) {
                        org.telegram.messenger.tz.F(zt0Var.s1);
                    }
                }
                for (int i13 = 0; i13 < ss0VarArr.length; i13++) {
                    org.telegram.ui.Components.ss0 ss0Var = ss0VarArr[i13];
                    if (ss0Var != null && ss0Var.h != null && (((i10 = ss0Var.E) == 0 || org.telegram.ui.Components.zt0.x0(i10)) && (adapter = ss0VarArr[i13].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i13 == 0) {
                            zt0Var.v1[0].g(false);
                        }
                        if (z10) {
                            ss0VarArr[i13].x.y1(iArr[i11]);
                            ss0VarArr[i13].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.i0.a4(ss0VarArr[i13].h);
                            } else {
                                adapter.f();
                            }
                        }
                        ss0VarArr[i13].n.setVisibility(8);
                    }
                }
                if (zt0Var.s >= 0) {
                    for (int i14 = 0; i14 < ss0VarArr.length; i14++) {
                        org.telegram.ui.Components.ss0 ss0Var2 = ss0VarArr[i14];
                        if (ss0Var2.E == zt0Var.r1) {
                            if (z10 && (m10 = ss0Var2.r.m(zt0Var.s)) != null) {
                                zt0Var.w = m10.getTop();
                            }
                            org.telegram.ui.Components.ss0 ss0Var3 = ss0VarArr[i14];
                            ss0Var3.x.h1(zt0Var.s, (-ss0Var3.h.getPaddingTop()) + zt0Var.w);
                        }
                    }
                } else {
                    zt0Var.e1();
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
                i10 = ((org.telegram.ui.ActionBar.k2) ((un) this.e)).currentAccount;
                this.c = org.telegram.messenger.zs.f(i10).q(null, this.c, true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public dj(un unVar, boolean z10, Runnable runnable) {
        this.e = unVar;
        this.b = z10;
        this.d = runnable;
    }
}
