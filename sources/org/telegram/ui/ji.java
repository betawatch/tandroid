package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ji extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.ls e;

    public ji(org.telegram.ui.Components.xs0 xs0Var, boolean z9, int i7, org.telegram.ui.Components.sr0 sr0Var) {
        this.e = xs0Var;
        this.b = z9;
        this.c = i7;
        this.d = sr0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i7;
        v4.g0 adapter;
        switch (this.a) {
            case 0:
                an anVar = (an) this.e;
                anVar.e6 = true;
                ((org.telegram.ui.ActionBar.f2) anVar).fragmentBeginToShow = true;
                anVar.oa = null;
                if (this.b) {
                    anVar.Da = false;
                }
                kVar = ((org.telegram.ui.ActionBar.f2) anVar).actionBar;
                kVar.invalidate();
                anVar.l1.invalidate();
                org.telegram.messenger.g0.i3(new bh(this, 2), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i10 = this.c;
                org.telegram.ui.Components.xs0 xs0Var = (org.telegram.ui.Components.xs0) this.e;
                int[] iArr = xs0Var.o1;
                org.telegram.ui.Components.sr0[] sr0VarArr = xs0Var.m0;
                xs0Var.q1 = false;
                boolean z9 = this.b;
                if (z9) {
                    int i11 = xs0Var.s1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.iz.B(i11);
                    } else if (xs0Var.m0(((org.telegram.ui.Components.sr0) this.d).E) >= 5) {
                        org.telegram.messenger.iz.F(xs0Var.s1);
                    }
                }
                for (int i12 = 0; i12 < sr0VarArr.length; i12++) {
                    org.telegram.ui.Components.sr0 sr0Var = sr0VarArr[i12];
                    if (sr0Var != null && sr0Var.h != null && (((i7 = sr0Var.E) == 0 || org.telegram.ui.Components.xs0.z0(i7)) && (adapter = sr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            xs0Var.v1[0].g(false);
                        }
                        if (z9) {
                            sr0VarArr[i12].x.y1(iArr[i10]);
                            sr0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.b4(sr0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        sr0VarArr[i12].n.setVisibility(8);
                    }
                }
                if (xs0Var.s >= 0) {
                    for (int i13 = 0; i13 < sr0VarArr.length; i13++) {
                        org.telegram.ui.Components.sr0 sr0Var2 = sr0VarArr[i13];
                        if (sr0Var2.E == xs0Var.r1) {
                            if (z9 && (m10 = sr0Var2.r.m(xs0Var.s)) != null) {
                                xs0Var.w = m10.getTop();
                            }
                            org.telegram.ui.Components.sr0 sr0Var3 = sr0VarArr[i13];
                            sr0Var3.x.h1(xs0Var.s, (-sr0Var3.h.getPaddingTop()) + xs0Var.w);
                        }
                    }
                } else {
                    xs0Var.h1();
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
                i7 = ((org.telegram.ui.ActionBar.f2) ((an) this.e)).currentAccount;
                this.c = org.telegram.messenger.qs.f(i7).q(null, this.c, true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ji(an anVar, boolean z9, Runnable runnable) {
        this.e = anVar;
        this.b = z9;
        this.d = runnable;
    }
}
