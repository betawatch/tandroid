package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fy c;

    public /* synthetic */ gx(fy fyVar, boolean z10, int i10) {
        this.a = i10;
        this.c = fyVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                fy fyVar = this.c;
                fyVar.k3.unlock();
                if (fyVar.s1 == animator) {
                    if (this.b) {
                        fyVar.a0[0].a.c1();
                    } else {
                        ay ayVar = fyVar.a0[0].a;
                        if (ayVar.e1) {
                            ayVar.e1 = false;
                            ayVar.J0(false);
                        }
                    }
                    fyVar.s1 = null;
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
        org.telegram.ui.ActionBar.w0 w0Var;
        switch (this.a) {
            case 0:
                fy fyVar = this.c;
                fyVar.k3.unlock();
                if (fyVar.s1 == animator) {
                    fyVar.A4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        fyVar.a0[0].a.c1();
                        xw xwVar = fyVar.A0;
                        if (xwVar != null) {
                            xwVar.setVisibility(8);
                        }
                        fyVar.m3 = true;
                        Activity parentActivity = fyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.o2) fyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        fyVar.f0.setVisibility(8);
                        ax axVar = fyVar.B3;
                        if (axVar != null) {
                            axVar.setVisibility(8);
                        }
                    } else {
                        fyVar.n3 = false;
                        ox oxVar = fyVar.y0;
                        if (oxVar != null) {
                            oxVar.setVisibility(8);
                        }
                        ux uxVar = fyVar.T;
                        if (uxVar != null) {
                            uxVar.c();
                        }
                        ox oxVar2 = fyVar.y0;
                        if (oxVar2 != null) {
                            oxVar2.w0.clear();
                            oxVar2.J();
                        }
                        ay ayVar = fyVar.a0[0].a;
                        if (ayVar.e1) {
                            ayVar.e1 = false;
                            ayVar.J0(false);
                        }
                        fyVar.m3 = false;
                        ax axVar2 = fyVar.B3;
                        if (axVar2 != null) {
                            axVar2.setVisibility(0);
                        }
                    }
                    View view = fyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    fyVar.D4(z10 ? 1.0f : 0.0f);
                    fyVar.a0[0].a.setVerticalScrollBarEnabled(true);
                    ox oxVar3 = fyVar.y0;
                    if (oxVar3 != null) {
                        oxVar3.setBackground(null);
                    }
                    fyVar.s1 = null;
                    break;
                }
                break;
            case 1:
                fy fyVar2 = this.c;
                fyVar2.L3 = null;
                if (!this.b && (w0Var = fyVar2.i0) != null) {
                    w0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                fy fyVar3 = this.c;
                fyVar3.E = null;
                boolean z11 = this.b;
                fyVar3.G = z11;
                if (!z11 && !fyVar3.H) {
                    fyVar3.A0.setVisibility(8);
                }
                if (z11) {
                    fyVar3.t3 = -AndroidUtilities.dp(81.0f);
                    fyVar3.C4(-fyVar3.U3());
                } else {
                    fyVar3.C4(0.0f);
                    fyVar3.t3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    ey[] eyVarArr = fyVar3.a0;
                    if (i11 >= eyVarArr.length) {
                        View view2 = fyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        ey eyVar = eyVarArr[i11];
                        if (eyVar != null) {
                            eyVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
