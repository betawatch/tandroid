package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ay c;

    public /* synthetic */ dx(ay ayVar, boolean z10, int i10) {
        this.a = i10;
        this.c = ayVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ay ayVar = this.c;
                ayVar.p3.e();
                if (ayVar.w1 == animator) {
                    if (this.b) {
                        ayVar.e0[0].a.c1();
                    } else {
                        wx wxVar = ayVar.e0[0].a;
                        if (wxVar.g1) {
                            wxVar.g1 = false;
                            wxVar.K0(false);
                        }
                    }
                    ayVar.w1 = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        org.telegram.ui.ActionBar.t0 t0Var;
        switch (this.a) {
            case 0:
                ay ayVar = this.c;
                ayVar.p3.e();
                if (ayVar.w1 == animator) {
                    ayVar.L4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        ayVar.e0[0].a.c1();
                        uw uwVar = ayVar.E0;
                        if (uwVar != null) {
                            uwVar.setVisibility(8);
                        }
                        ayVar.r3 = true;
                        Activity parentActivity = ayVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.k2) ayVar).classGuid;
                        org.telegram.messenger.i0.Z2(parentActivity, i10);
                        ayVar.j0.setVisibility(8);
                        xw xwVar = ayVar.F3;
                        if (xwVar != null) {
                            xwVar.setVisibility(8);
                        }
                    } else {
                        ayVar.s3 = false;
                        kx kxVar = ayVar.C0;
                        if (kxVar != null) {
                            kxVar.setVisibility(8);
                        }
                        px pxVar = ayVar.X;
                        if (pxVar != null) {
                            pxVar.c();
                        }
                        kx kxVar2 = ayVar.C0;
                        if (kxVar2 != null) {
                            kxVar2.C0.clear();
                            kxVar2.L();
                        }
                        wx wxVar = ayVar.e0[0].a;
                        if (wxVar.g1) {
                            wxVar.g1 = false;
                            wxVar.K0(false);
                        }
                        ayVar.r3 = false;
                        xw xwVar2 = ayVar.F3;
                        if (xwVar2 != null) {
                            xwVar2.setVisibility(0);
                        }
                    }
                    View view = ayVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    ayVar.O4(z10 ? 1.0f : 0.0f);
                    ayVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    kx kxVar3 = ayVar.C0;
                    if (kxVar3 != null) {
                        kxVar3.setBackground(null);
                    }
                    ayVar.w1 = null;
                    break;
                }
                break;
            case 1:
                ay ayVar2 = this.c;
                ayVar2.O3 = null;
                if (!this.b && (t0Var = ayVar2.m0) != null) {
                    t0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                ay ayVar3 = this.c;
                ayVar3.I = null;
                boolean z11 = this.b;
                ayVar3.K = z11;
                if (!z11 && !ayVar3.L) {
                    ayVar3.E0.setVisibility(8);
                }
                if (z11) {
                    ayVar3.y3 = -org.telegram.messenger.i0.L(81.0f);
                    ayVar3.N4(-ayVar3.f4());
                } else {
                    ayVar3.N4(0.0f);
                    ayVar3.y3 = org.telegram.messenger.i0.L(81.0f);
                }
                int i11 = 0;
                while (true) {
                    zx[] zxVarArr = ayVar3.e0;
                    if (i11 >= zxVarArr.length) {
                        View view2 = ayVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        zx zxVar = zxVarArr[i11];
                        if (zxVar != null) {
                            zxVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
