package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dw extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cx c;

    public /* synthetic */ dw(cx cxVar, boolean z10, int i7) {
        this.a = i7;
        this.c = cxVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                cx cxVar = this.c;
                cxVar.r3.e();
                if (cxVar.y1 == animator) {
                    if (this.b) {
                        cxVar.f0[0].a.c1();
                    } else {
                        yw ywVar = cxVar.f0[0].a;
                        if (ywVar.h1) {
                            ywVar.h1 = false;
                            ywVar.K0(false);
                        }
                    }
                    cxVar.y1 = null;
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
        int i7;
        org.telegram.ui.ActionBar.r0 r0Var;
        switch (this.a) {
            case 0:
                cx cxVar = this.c;
                cxVar.r3.e();
                if (cxVar.y1 == animator) {
                    cxVar.U4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        cxVar.f0[0].a.c1();
                        tv tvVar = cxVar.F0;
                        if (tvVar != null) {
                            tvVar.setVisibility(8);
                        }
                        cxVar.t3 = true;
                        Activity parentActivity = cxVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.h2) cxVar).classGuid;
                        org.telegram.messenger.g0.Z2(parentActivity, i7);
                        cxVar.k0.setVisibility(8);
                        xv xvVar = cxVar.H3;
                        if (xvVar != null) {
                            xvVar.setVisibility(8);
                        }
                    } else {
                        cxVar.u3 = false;
                        kw kwVar = cxVar.D0;
                        if (kwVar != null) {
                            kwVar.setVisibility(8);
                        }
                        qw qwVar = cxVar.Y;
                        if (qwVar != null) {
                            qwVar.c();
                        }
                        kw kwVar2 = cxVar.D0;
                        if (kwVar2 != null) {
                            kwVar2.D0.clear();
                            kwVar2.H();
                        }
                        yw ywVar = cxVar.f0[0].a;
                        if (ywVar.h1) {
                            ywVar.h1 = false;
                            ywVar.K0(false);
                        }
                        cxVar.t3 = false;
                        xv xvVar2 = cxVar.H3;
                        if (xvVar2 != null) {
                            xvVar2.setVisibility(0);
                        }
                    }
                    View view = cxVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    cxVar.X4(z10 ? 1.0f : 0.0f);
                    cxVar.f0[0].a.setVerticalScrollBarEnabled(true);
                    kw kwVar3 = cxVar.D0;
                    if (kwVar3 != null) {
                        kwVar3.setBackground(null);
                    }
                    cxVar.y1 = null;
                    break;
                }
                break;
            case 1:
                cx cxVar2 = this.c;
                cxVar2.T3 = null;
                if (!this.b && (r0Var = cxVar2.n0) != null) {
                    r0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                cx cxVar3 = this.c;
                cxVar3.J = null;
                boolean z11 = this.b;
                cxVar3.L = z11;
                if (!z11 && !cxVar3.M) {
                    cxVar3.F0.setVisibility(8);
                }
                if (z11) {
                    cxVar3.A3 = -org.telegram.messenger.g0.L(81.0f);
                    cxVar3.W4(-cxVar3.g4());
                } else {
                    cxVar3.W4(0.0f);
                    cxVar3.A3 = org.telegram.messenger.g0.L(81.0f);
                }
                int i10 = 0;
                while (true) {
                    bx[] bxVarArr = cxVar3.f0;
                    if (i10 >= bxVarArr.length) {
                        View view2 = cxVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        bx bxVar = bxVarArr[i10];
                        if (bxVar != null) {
                            bxVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
        }
    }
}
