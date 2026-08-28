package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ex extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dy c;

    public /* synthetic */ ex(dy dyVar, boolean z10, int i9) {
        this.a = i9;
        this.c = dyVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                dy dyVar = this.c;
                dyVar.k3.unlock();
                if (dyVar.s1 == animator) {
                    if (this.b) {
                        dyVar.a0[0].a.c1();
                    } else {
                        yx yxVar = dyVar.a0[0].a;
                        if (yxVar.e1) {
                            yxVar.e1 = false;
                            yxVar.J0(false);
                        }
                    }
                    dyVar.s1 = null;
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
        int i9;
        org.telegram.ui.ActionBar.w0 w0Var;
        switch (this.a) {
            case 0:
                dy dyVar = this.c;
                dyVar.k3.unlock();
                if (dyVar.s1 == animator) {
                    dyVar.A4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        dyVar.a0[0].a.c1();
                        vw vwVar = dyVar.A0;
                        if (vwVar != null) {
                            vwVar.setVisibility(8);
                        }
                        dyVar.m3 = true;
                        Activity parentActivity = dyVar.getParentActivity();
                        i9 = ((org.telegram.ui.ActionBar.o2) dyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i9);
                        dyVar.f0.setVisibility(8);
                        yw ywVar = dyVar.B3;
                        if (ywVar != null) {
                            ywVar.setVisibility(8);
                        }
                    } else {
                        dyVar.n3 = false;
                        mx mxVar = dyVar.y0;
                        if (mxVar != null) {
                            mxVar.setVisibility(8);
                        }
                        sx sxVar = dyVar.T;
                        if (sxVar != null) {
                            sxVar.c();
                        }
                        mx mxVar2 = dyVar.y0;
                        if (mxVar2 != null) {
                            mxVar2.w0.clear();
                            mxVar2.J();
                        }
                        yx yxVar = dyVar.a0[0].a;
                        if (yxVar.e1) {
                            yxVar.e1 = false;
                            yxVar.J0(false);
                        }
                        dyVar.m3 = false;
                        yw ywVar2 = dyVar.B3;
                        if (ywVar2 != null) {
                            ywVar2.setVisibility(0);
                        }
                    }
                    View view = dyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    dyVar.D4(z10 ? 1.0f : 0.0f);
                    dyVar.a0[0].a.setVerticalScrollBarEnabled(true);
                    mx mxVar3 = dyVar.y0;
                    if (mxVar3 != null) {
                        mxVar3.setBackground(null);
                    }
                    dyVar.s1 = null;
                    break;
                }
                break;
            case 1:
                dy dyVar2 = this.c;
                dyVar2.L3 = null;
                if (!this.b && (w0Var = dyVar2.i0) != null) {
                    w0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                dy dyVar3 = this.c;
                dyVar3.E = null;
                boolean z11 = this.b;
                dyVar3.G = z11;
                if (!z11 && !dyVar3.H) {
                    dyVar3.A0.setVisibility(8);
                }
                if (z11) {
                    dyVar3.t3 = -AndroidUtilities.dp(81.0f);
                    dyVar3.C4(-dyVar3.U3());
                } else {
                    dyVar3.C4(0.0f);
                    dyVar3.t3 = AndroidUtilities.dp(81.0f);
                }
                int i10 = 0;
                while (true) {
                    cy[] cyVarArr = dyVar3.a0;
                    if (i10 >= cyVarArr.length) {
                        View view2 = dyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        cy cyVar = cyVarArr[i10];
                        if (cyVar != null) {
                            cyVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
        }
    }
}
