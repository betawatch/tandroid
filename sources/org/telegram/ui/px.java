package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class px extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ oy c;

    public /* synthetic */ px(oy oyVar, boolean z4, int i10) {
        this.a = i10;
        this.c = oyVar;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                oy oyVar = this.c;
                oyVar.l3.unlock();
                if (oyVar.t1 == animator) {
                    if (this.b) {
                        oyVar.b0[0].a.c1();
                    } else {
                        ky kyVar = oyVar.b0[0].a;
                        if (kyVar.f1) {
                            kyVar.f1 = false;
                            kyVar.J0(false);
                        }
                    }
                    oyVar.t1 = null;
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
                oy oyVar = this.c;
                oyVar.l3.unlock();
                if (oyVar.t1 == animator) {
                    oyVar.A4(false, true);
                    boolean z4 = this.b;
                    if (z4) {
                        oyVar.b0[0].a.c1();
                        gx gxVar = oyVar.B0;
                        if (gxVar != null) {
                            gxVar.setVisibility(8);
                        }
                        oyVar.n3 = true;
                        Activity parentActivity = oyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.p2) oyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        oyVar.g0.setVisibility(8);
                        jx jxVar = oyVar.C3;
                        if (jxVar != null) {
                            jxVar.setVisibility(8);
                        }
                    } else {
                        oyVar.o3 = false;
                        xx xxVar = oyVar.z0;
                        if (xxVar != null) {
                            xxVar.setVisibility(8);
                        }
                        ey eyVar = oyVar.U;
                        if (eyVar != null) {
                            eyVar.c();
                        }
                        xx xxVar2 = oyVar.z0;
                        if (xxVar2 != null) {
                            xxVar2.x0.clear();
                            xxVar2.J();
                        }
                        ky kyVar = oyVar.b0[0].a;
                        if (kyVar.f1) {
                            kyVar.f1 = false;
                            kyVar.J0(false);
                        }
                        oyVar.n3 = false;
                        jx jxVar2 = oyVar.C3;
                        if (jxVar2 != null) {
                            jxVar2.setVisibility(0);
                        }
                    }
                    View view = oyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    oyVar.D4(z4 ? 1.0f : 0.0f);
                    oyVar.b0[0].a.setVerticalScrollBarEnabled(true);
                    xx xxVar3 = oyVar.z0;
                    if (xxVar3 != null) {
                        xxVar3.setBackground(null);
                    }
                    oyVar.t1 = null;
                    break;
                }
                break;
            case 1:
                oy oyVar2 = this.c;
                oyVar2.M3 = null;
                if (!this.b && (w0Var = oyVar2.j0) != null) {
                    w0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                oy oyVar3 = this.c;
                oyVar3.F = null;
                boolean z10 = this.b;
                oyVar3.H = z10;
                if (!z10 && !oyVar3.I) {
                    oyVar3.B0.setVisibility(8);
                }
                if (z10) {
                    oyVar3.u3 = -AndroidUtilities.dp(81.0f);
                    oyVar3.C4(-oyVar3.U3());
                } else {
                    oyVar3.C4(0.0f);
                    oyVar3.u3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    ny[] nyVarArr = oyVar3.b0;
                    if (i11 >= nyVarArr.length) {
                        View view2 = oyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        ny nyVar = nyVarArr[i11];
                        if (nyVar != null) {
                            nyVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
