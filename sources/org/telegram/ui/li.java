package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class li extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.ls e;

    public li(org.telegram.ui.Components.zs0 zs0Var, boolean z9, int i7, org.telegram.ui.Components.ur0 ur0Var) {
        this.e = zs0Var;
        this.b = z9;
        this.c = i7;
        this.d = ur0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
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
                kVar = ((org.telegram.ui.ActionBar.f2) cnVar).actionBar;
                kVar.invalidate();
                cnVar.l1.invalidate();
                org.telegram.messenger.g0.i3(new dh(this, 2), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i10 = this.c;
                org.telegram.ui.Components.zs0 zs0Var = (org.telegram.ui.Components.zs0) this.e;
                int[] iArr = zs0Var.o1;
                org.telegram.ui.Components.ur0[] ur0VarArr = zs0Var.m0;
                zs0Var.q1 = false;
                boolean z9 = this.b;
                if (z9) {
                    int i11 = zs0Var.s1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.iz.B(i11);
                    } else if (zs0Var.m0(((org.telegram.ui.Components.ur0) this.d).E) >= 5) {
                        org.telegram.messenger.iz.F(zs0Var.s1);
                    }
                }
                for (int i12 = 0; i12 < ur0VarArr.length; i12++) {
                    org.telegram.ui.Components.ur0 ur0Var = ur0VarArr[i12];
                    if (ur0Var != null && ur0Var.h != null && (((i7 = ur0Var.E) == 0 || org.telegram.ui.Components.zs0.z0(i7)) && (adapter = ur0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            zs0Var.v1[0].g(false);
                        }
                        if (z9) {
                            ur0VarArr[i12].x.y1(iArr[i10]);
                            ur0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.b4(ur0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        ur0VarArr[i12].n.setVisibility(8);
                    }
                }
                if (zs0Var.s >= 0) {
                    for (int i13 = 0; i13 < ur0VarArr.length; i13++) {
                        org.telegram.ui.Components.ur0 ur0Var2 = ur0VarArr[i13];
                        if (ur0Var2.E == zs0Var.r1) {
                            if (z9 && (m10 = ur0Var2.r.m(zs0Var.s)) != null) {
                                zs0Var.w = m10.getTop();
                            }
                            org.telegram.ui.Components.ur0 ur0Var3 = ur0VarArr[i13];
                            ur0Var3.x.h1(zs0Var.s, (-ur0Var3.h.getPaddingTop()) + zs0Var.w);
                        }
                    }
                } else {
                    zs0Var.j1();
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
