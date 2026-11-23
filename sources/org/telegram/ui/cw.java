package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cw extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ bx c;

    public /* synthetic */ cw(bx bxVar, boolean z10, int i7) {
        this.a = i7;
        this.c = bxVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                bx bxVar = this.c;
                bxVar.r3.e();
                if (bxVar.y1 == animator) {
                    if (this.b) {
                        bxVar.f0[0].a.c1();
                    } else {
                        xw xwVar = bxVar.f0[0].a;
                        if (xwVar.h1) {
                            xwVar.h1 = false;
                            xwVar.K0(false);
                        }
                    }
                    bxVar.y1 = null;
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
        org.telegram.ui.ActionBar.q0 q0Var;
        switch (this.a) {
            case 0:
                bx bxVar = this.c;
                bxVar.r3.e();
                if (bxVar.y1 == animator) {
                    bxVar.U4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        bxVar.f0[0].a.c1();
                        sv svVar = bxVar.F0;
                        if (svVar != null) {
                            svVar.setVisibility(8);
                        }
                        bxVar.t3 = true;
                        Activity parentActivity = bxVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.g2) bxVar).classGuid;
                        org.telegram.messenger.g0.Z2(parentActivity, i7);
                        bxVar.k0.setVisibility(8);
                        wv wvVar = bxVar.H3;
                        if (wvVar != null) {
                            wvVar.setVisibility(8);
                        }
                    } else {
                        bxVar.u3 = false;
                        jw jwVar = bxVar.D0;
                        if (jwVar != null) {
                            jwVar.setVisibility(8);
                        }
                        pw pwVar = bxVar.Y;
                        if (pwVar != null) {
                            pwVar.c();
                        }
                        jw jwVar2 = bxVar.D0;
                        if (jwVar2 != null) {
                            jwVar2.D0.clear();
                            jwVar2.J();
                        }
                        xw xwVar = bxVar.f0[0].a;
                        if (xwVar.h1) {
                            xwVar.h1 = false;
                            xwVar.K0(false);
                        }
                        bxVar.t3 = false;
                        wv wvVar2 = bxVar.H3;
                        if (wvVar2 != null) {
                            wvVar2.setVisibility(0);
                        }
                    }
                    View view = bxVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    bxVar.X4(z10 ? 1.0f : 0.0f);
                    bxVar.f0[0].a.setVerticalScrollBarEnabled(true);
                    jw jwVar3 = bxVar.D0;
                    if (jwVar3 != null) {
                        jwVar3.setBackground(null);
                    }
                    bxVar.y1 = null;
                    break;
                }
                break;
            case 1:
                bx bxVar2 = this.c;
                bxVar2.T3 = null;
                if (!this.b && (q0Var = bxVar2.n0) != null) {
                    q0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                bx bxVar3 = this.c;
                bxVar3.J = null;
                boolean z11 = this.b;
                bxVar3.L = z11;
                if (!z11 && !bxVar3.M) {
                    bxVar3.F0.setVisibility(8);
                }
                if (z11) {
                    bxVar3.A3 = -org.telegram.messenger.g0.L(81.0f);
                    bxVar3.W4(-bxVar3.g4());
                } else {
                    bxVar3.W4(0.0f);
                    bxVar3.A3 = org.telegram.messenger.g0.L(81.0f);
                }
                int i10 = 0;
                while (true) {
                    ax[] axVarArr = bxVar3.f0;
                    if (i10 >= axVarArr.length) {
                        View view2 = bxVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        ax axVar = axVarArr[i10];
                        if (axVar != null) {
                            axVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
        }
    }
}
