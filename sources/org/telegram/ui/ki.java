package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ki extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.fs e;

    public ki(org.telegram.ui.Components.gt0 gt0Var, boolean z10, int i7, org.telegram.ui.Components.bs0 bs0Var) {
        this.e = gt0Var;
        this.b = z10;
        this.c = i7;
        this.d = bs0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i7;
        v4.i0 adapter;
        switch (this.a) {
            case 0:
                bn bnVar = (bn) this.e;
                bnVar.g6 = true;
                ((org.telegram.ui.ActionBar.h2) bnVar).fragmentBeginToShow = true;
                bnVar.sa = null;
                if (this.b) {
                    bnVar.Ha = false;
                }
                kVar = ((org.telegram.ui.ActionBar.h2) bnVar).actionBar;
                kVar.invalidate();
                bnVar.m1.invalidate();
                org.telegram.messenger.g0.h3(new bh(this, 2), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i10 = this.c;
                org.telegram.ui.Components.gt0 gt0Var = (org.telegram.ui.Components.gt0) this.e;
                int[] iArr = gt0Var.p1;
                org.telegram.ui.Components.bs0[] bs0VarArr = gt0Var.n0;
                gt0Var.r1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i11 = gt0Var.t1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.bz.B(i11);
                    } else if (gt0Var.m0(((org.telegram.ui.Components.bs0) this.d).F) >= 5) {
                        org.telegram.messenger.bz.F(gt0Var.t1);
                    }
                }
                for (int i12 = 0; i12 < bs0VarArr.length; i12++) {
                    org.telegram.ui.Components.bs0 bs0Var = bs0VarArr[i12];
                    if (bs0Var != null && bs0Var.h != null && (((i7 = bs0Var.F) == 0 || org.telegram.ui.Components.gt0.z0(i7)) && (adapter = bs0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            gt0Var.w1[0].g(false);
                        }
                        if (z10) {
                            bs0VarArr[i12].x.y1(iArr[i10]);
                            bs0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.Z3(bs0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        bs0VarArr[i12].n.setVisibility(8);
                    }
                }
                if (gt0Var.s >= 0) {
                    for (int i13 = 0; i13 < bs0VarArr.length; i13++) {
                        org.telegram.ui.Components.bs0 bs0Var2 = bs0VarArr[i13];
                        if (bs0Var2.F == gt0Var.s1) {
                            if (z10 && (m10 = bs0Var2.r.m(gt0Var.s)) != null) {
                                gt0Var.w = m10.getTop();
                            }
                            org.telegram.ui.Components.bs0 bs0Var3 = bs0VarArr[i13];
                            bs0Var3.x.h1(gt0Var.s, (-bs0Var3.h.getPaddingTop()) + gt0Var.w);
                        }
                    }
                } else {
                    gt0Var.j1();
                }
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i7;
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                i7 = ((org.telegram.ui.ActionBar.h2) ((bn) this.e)).currentAccount;
                this.c = org.telegram.messenger.ks.f(i7).q(null, this.c, true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ki(bn bnVar, boolean z10, Runnable runnable) {
        this.e = bnVar;
        this.b = z10;
        this.d = runnable;
    }
}
