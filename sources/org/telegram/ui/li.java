package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class li extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.ls e;

    public li(org.telegram.ui.Components.ys0 ys0Var, boolean z9, int i7, org.telegram.ui.Components.tr0 tr0Var) {
        this.e = ys0Var;
        this.b = z9;
        this.c = i7;
        this.d = tr0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.l lVar;
        View m10;
        int i7;
        v4.g0 adapter;
        switch (this.a) {
            case 0:
                cn cnVar = (cn) this.e;
                cnVar.e6 = true;
                ((org.telegram.ui.ActionBar.f2) cnVar).fragmentBeginToShow = true;
                cnVar.qa = null;
                if (this.b) {
                    cnVar.Fa = false;
                }
                lVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                lVar.invalidate();
                cnVar.l1.invalidate();
                org.telegram.messenger.g0.i3(new dh(this, 2), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i10 = this.c;
                org.telegram.ui.Components.ys0 ys0Var = (org.telegram.ui.Components.ys0) this.e;
                int[] iArr = ys0Var.o1;
                org.telegram.ui.Components.tr0[] tr0VarArr = ys0Var.m0;
                ys0Var.q1 = false;
                boolean z9 = this.b;
                if (z9) {
                    int i11 = ys0Var.s1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.iz.B(i11);
                    } else if (ys0Var.m0(((org.telegram.ui.Components.tr0) this.d).E) >= 5) {
                        org.telegram.messenger.iz.F(ys0Var.s1);
                    }
                }
                for (int i12 = 0; i12 < tr0VarArr.length; i12++) {
                    org.telegram.ui.Components.tr0 tr0Var = tr0VarArr[i12];
                    if (tr0Var != null && tr0Var.h != null && (((i7 = tr0Var.E) == 0 || org.telegram.ui.Components.ys0.z0(i7)) && (adapter = tr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            ys0Var.v1[0].g(false);
                        }
                        if (z9) {
                            tr0VarArr[i12].x.y1(iArr[i10]);
                            tr0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.b4(tr0VarArr[i12].h);
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
                        if (tr0Var2.E == ys0Var.r1) {
                            if (z9 && (m10 = tr0Var2.r.m(ys0Var.s)) != null) {
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
                i7 = ((org.telegram.ui.ActionBar.f2) ((cn) this.e)).currentAccount;
                this.c = org.telegram.messenger.qs.f(i7).q(null, this.c, true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public li(cn cnVar, boolean z9, Runnable runnable) {
        this.e = cnVar;
        this.b = z9;
        this.d = runnable;
    }
}
