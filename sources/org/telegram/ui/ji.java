package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ji extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.is e;

    public ji(org.telegram.ui.Components.ys0 ys0Var, boolean z10, int i7, org.telegram.ui.Components.tr0 tr0Var) {
        this.e = ys0Var;
        this.b = z10;
        this.c = i7;
        this.d = tr0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i7;
        v4.h0 adapter;
        switch (this.a) {
            case 0:
                an anVar = (an) this.e;
                anVar.f6 = true;
                ((org.telegram.ui.ActionBar.e2) anVar).fragmentBeginToShow = true;
                anVar.ra = null;
                if (this.b) {
                    anVar.Ga = false;
                }
                kVar = ((org.telegram.ui.ActionBar.e2) anVar).actionBar;
                kVar.invalidate();
                anVar.m1.invalidate();
                org.telegram.messenger.g0.i3(new bh(this, 2), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i10 = this.c;
                org.telegram.ui.Components.ys0 ys0Var = (org.telegram.ui.Components.ys0) this.e;
                int[] iArr = ys0Var.p1;
                org.telegram.ui.Components.tr0[] tr0VarArr = ys0Var.n0;
                ys0Var.r1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i11 = ys0Var.t1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.gz.B(i11);
                    } else if (ys0Var.m0(((org.telegram.ui.Components.tr0) this.d).F) >= 5) {
                        org.telegram.messenger.gz.F(ys0Var.t1);
                    }
                }
                for (int i12 = 0; i12 < tr0VarArr.length; i12++) {
                    org.telegram.ui.Components.tr0 tr0Var = tr0VarArr[i12];
                    if (tr0Var != null && tr0Var.h != null && (((i7 = tr0Var.F) == 0 || org.telegram.ui.Components.ys0.z0(i7)) && (adapter = tr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            ys0Var.w1[0].g(false);
                        }
                        if (z10) {
                            tr0VarArr[i12].x.y1(iArr[i10]);
                            tr0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.a4(tr0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        tr0VarArr[i12].n.setVisibility(8);
                    }
                }
                if (ys0Var.s >= 0) {
                    for (int i13 = 0; i13 < tr0VarArr.length; i13++) {
                        org.telegram.ui.Components.tr0 tr0Var2 = tr0VarArr[i13];
                        if (tr0Var2.F == ys0Var.s1) {
                            if (z10 && (m10 = tr0Var2.r.m(ys0Var.s)) != null) {
                                ys0Var.w = m10.getTop();
                            }
                            org.telegram.ui.Components.tr0 tr0Var3 = tr0VarArr[i13];
                            tr0Var3.x.h1(ys0Var.s, (-tr0Var3.h.getPaddingTop()) + ys0Var.w);
                        }
                    }
                } else {
                    ys0Var.j1();
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
                i7 = ((org.telegram.ui.ActionBar.e2) ((an) this.e)).currentAccount;
                this.c = org.telegram.messenger.ns.f(i7).q(null, this.c, true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ji(an anVar, boolean z10, Runnable runnable) {
        this.e = anVar;
        this.b = z10;
        this.d = runnable;
    }
}
