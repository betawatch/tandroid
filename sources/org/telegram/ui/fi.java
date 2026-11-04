package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ org.telegram.messenger.cs e;

    public fi(org.telegram.ui.Components.ws0 ws0Var, boolean z10, int i3, org.telegram.ui.Components.rr0 rr0Var) {
        this.e = ws0Var;
        this.b = z10;
        this.c = i3;
        this.d = rr0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        View m10;
        int i3;
        u4.h0 adapter;
        switch (this.a) {
            case 0:
                wm wmVar = (wm) this.e;
                wmVar.f6 = true;
                ((org.telegram.ui.ActionBar.d2) wmVar).fragmentBeginToShow = true;
                wmVar.pa = null;
                if (this.b) {
                    wmVar.Ea = false;
                }
                kVar = ((org.telegram.ui.ActionBar.d2) wmVar).actionBar;
                kVar.invalidate();
                wmVar.m1.invalidate();
                org.telegram.messenger.g0.i3(new xg(this, 2), 32L);
                ((Runnable) this.d).run();
                break;
            default:
                int i10 = this.c;
                org.telegram.ui.Components.ws0 ws0Var = (org.telegram.ui.Components.ws0) this.e;
                int[] iArr = ws0Var.p1;
                org.telegram.ui.Components.rr0[] rr0VarArr = ws0Var.n0;
                ws0Var.r1 = false;
                boolean z10 = this.b;
                if (z10) {
                    int i11 = ws0Var.t1;
                    iArr[i10] = i11;
                    if (i10 == 0) {
                        org.telegram.messenger.az.B(i11);
                    } else if (ws0Var.m0(((org.telegram.ui.Components.rr0) this.d).F) >= 5) {
                        org.telegram.messenger.az.F(ws0Var.t1);
                    }
                }
                for (int i12 = 0; i12 < rr0VarArr.length; i12++) {
                    org.telegram.ui.Components.rr0 rr0Var = rr0VarArr[i12];
                    if (rr0Var != null && rr0Var.h != null && (((i3 = rr0Var.F) == 0 || org.telegram.ui.Components.ws0.z0(i3)) && (adapter = rr0VarArr[i12].h.getAdapter()) != null)) {
                        int b10 = adapter.b();
                        if (i12 == 0) {
                            ws0Var.w1[0].g(false);
                        }
                        if (z10) {
                            rr0VarArr[i12].x.y1(iArr[i10]);
                            rr0VarArr[i12].h.a0();
                            if (adapter.b() == b10) {
                                org.telegram.messenger.g0.b4(rr0VarArr[i12].h);
                            } else {
                                adapter.f();
                            }
                        }
                        rr0VarArr[i12].n.setVisibility(8);
                    }
                }
                if (ws0Var.s >= 0) {
                    for (int i13 = 0; i13 < rr0VarArr.length; i13++) {
                        org.telegram.ui.Components.rr0 rr0Var2 = rr0VarArr[i13];
                        if (rr0Var2.F == ws0Var.s1) {
                            if (z10 && (m10 = rr0Var2.r.m(ws0Var.s)) != null) {
                                ws0Var.w = m10.getTop();
                            }
                            org.telegram.ui.Components.rr0 rr0Var3 = rr0VarArr[i13];
                            rr0Var3.x.h1(ws0Var.s, (-rr0Var3.h.getPaddingTop()) + ws0Var.w);
                        }
                    }
                } else {
                    ws0Var.h1();
                }
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i3;
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                i3 = ((org.telegram.ui.ActionBar.d2) ((wm) this.e)).currentAccount;
                this.c = org.telegram.messenger.hs.f(i3).q(null, this.c, true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public fi(wm wmVar, boolean z10, Runnable runnable) {
        this.e = wmVar;
        this.b = z10;
        this.d = runnable;
    }
}
