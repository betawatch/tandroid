package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ki extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.fs e;

    public ki(org.telegram.ui.Components.it0 it0Var, boolean z10, int i7, org.telegram.ui.Components.ds0 ds0Var) {
        this.e = it0Var;
        this.b = z10;
        this.c = i7;
        this.d = ds0Var;
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
                ((org.telegram.ui.ActionBar.g2) bnVar).fragmentBeginToShow = true;
                bnVar.sa = null;
                if (this.b) {
                    bnVar.Ha = false;
                }
                kVar = ((org.telegram.ui.ActionBar.g2) bnVar).actionBar;
                kVar.invalidate();
                bnVar.m1.invalidate();
                org.telegram.messenger.g0.h3(new ch(this, 2), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i10 = this.c;
                org.telegram.ui.Components.it0 it0Var = (org.telegram.ui.Components.it0) this.e;
                int[] iArr = it0Var.p1;
                org.telegram.ui.Components.ds0[] ds0VarArr = it0Var.n0;
                it0Var.r1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i11 = it0Var.t1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.bz.B(i11);
                    } else if (it0Var.m0(((org.telegram.ui.Components.ds0) this.d).F) >= 5) {
                        org.telegram.messenger.bz.F(it0Var.t1);
                    }
                }
                for (int i12 = 0; i12 < ds0VarArr.length; i12++) {
                    org.telegram.ui.Components.ds0 ds0Var = ds0VarArr[i12];
                    if (ds0Var != null && ds0Var.h != null && (((i7 = ds0Var.F) == 0 || org.telegram.ui.Components.it0.z0(i7)) && (adapter = ds0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            it0Var.w1[0].g(false);
                        }
                        if (z10) {
                            ds0VarArr[i12].x.y1(iArr[i10]);
                            ds0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.Z3(ds0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        ds0VarArr[i12].n.setVisibility(8);
                    }
                }
                if (it0Var.s >= 0) {
                    for (int i13 = 0; i13 < ds0VarArr.length; i13++) {
                        org.telegram.ui.Components.ds0 ds0Var2 = ds0VarArr[i13];
                        if (ds0Var2.F == it0Var.s1) {
                            if (z10 && (m10 = ds0Var2.r.m(it0Var.s)) != null) {
                                it0Var.w = m10.getTop();
                            }
                            org.telegram.ui.Components.ds0 ds0Var3 = ds0VarArr[i13];
                            ds0Var3.x.h1(it0Var.s, (-ds0Var3.h.getPaddingTop()) + it0Var.w);
                        }
                    }
                } else {
                    it0Var.j1();
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
                i7 = ((org.telegram.ui.ActionBar.g2) ((bn) this.e)).currentAccount;
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
