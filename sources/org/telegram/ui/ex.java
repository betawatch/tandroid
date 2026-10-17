package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ex extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ey c;

    public /* synthetic */ ex(ey eyVar, boolean z10, int i10) {
        this.a = i10;
        this.c = eyVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ey eyVar = this.c;
                eyVar.p3.unlock();
                if (eyVar.w1 == animator) {
                    if (this.b) {
                        eyVar.e0[0].a.c1();
                    } else {
                        zx zxVar = eyVar.e0[0].a;
                        if (zxVar.g1) {
                            zxVar.g1 = false;
                            zxVar.K0(false);
                        }
                    }
                    eyVar.w1 = null;
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
        org.telegram.ui.ActionBar.u0 u0Var;
        switch (this.a) {
            case 0:
                ey eyVar = this.c;
                eyVar.p3.unlock();
                if (eyVar.w1 == animator) {
                    eyVar.y4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        eyVar.e0[0].a.c1();
                        vw vwVar = eyVar.E0;
                        if (vwVar != null) {
                            vwVar.setVisibility(8);
                        }
                        eyVar.r3 = true;
                        Activity parentActivity = eyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) eyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        eyVar.j0.setVisibility(8);
                        yw ywVar = eyVar.G3;
                        if (ywVar != null) {
                            ywVar.setVisibility(8);
                        }
                    } else {
                        eyVar.s3 = false;
                        nx nxVar = eyVar.C0;
                        if (nxVar != null) {
                            nxVar.setVisibility(8);
                        }
                        tx txVar = eyVar.X;
                        if (txVar != null) {
                            txVar.c();
                        }
                        nx nxVar2 = eyVar.C0;
                        if (nxVar2 != null) {
                            nxVar2.A0.clear();
                            nxVar2.J();
                        }
                        zx zxVar = eyVar.e0[0].a;
                        if (zxVar.g1) {
                            zxVar.g1 = false;
                            zxVar.K0(false);
                        }
                        eyVar.r3 = false;
                        yw ywVar2 = eyVar.G3;
                        if (ywVar2 != null) {
                            ywVar2.setVisibility(0);
                        }
                    }
                    View view = eyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    eyVar.B4(z10 ? 1.0f : 0.0f);
                    eyVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    nx nxVar3 = eyVar.C0;
                    if (nxVar3 != null) {
                        nxVar3.setBackground(null);
                    }
                    eyVar.w1 = null;
                    break;
                }
                break;
            case 1:
                ey eyVar2 = this.c;
                eyVar2.P3 = null;
                if (!this.b && (u0Var = eyVar2.m0) != null) {
                    u0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                ey eyVar3 = this.c;
                eyVar3.I = null;
                boolean z11 = this.b;
                eyVar3.K = z11;
                if (!z11 && !eyVar3.L) {
                    eyVar3.E0.setVisibility(8);
                }
                if (z11) {
                    eyVar3.y3 = -AndroidUtilities.dp(81.0f);
                    eyVar3.A4(-eyVar3.S3());
                } else {
                    eyVar3.A4(0.0f);
                    eyVar3.y3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    dy[] dyVarArr = eyVar3.e0;
                    if (i11 >= dyVarArr.length) {
                        View view2 = eyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        dy dyVar = dyVarArr[i11];
                        if (dyVar != null) {
                            dyVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
