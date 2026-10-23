package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class cx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ cy c;

    public /* synthetic */ cx(cy cyVar, boolean z10, int i10) {
        this.a = i10;
        this.c = cyVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                cy cyVar = this.c;
                cyVar.p3.unlock();
                if (cyVar.w1 == animator) {
                    if (this.b) {
                        cyVar.e0[0].a.c1();
                    } else {
                        xx xxVar = cyVar.e0[0].a;
                        if (xxVar.g1) {
                            xxVar.g1 = false;
                            xxVar.K0(false);
                        }
                    }
                    cyVar.w1 = null;
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
                cy cyVar = this.c;
                cyVar.p3.unlock();
                if (cyVar.w1 == animator) {
                    cyVar.y4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        cyVar.e0[0].a.c1();
                        tw twVar = cyVar.E0;
                        if (twVar != null) {
                            twVar.setVisibility(8);
                        }
                        cyVar.r3 = true;
                        Activity parentActivity = cyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) cyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        cyVar.j0.setVisibility(8);
                        ww wwVar = cyVar.G3;
                        if (wwVar != null) {
                            wwVar.setVisibility(8);
                        }
                    } else {
                        cyVar.s3 = false;
                        lx lxVar = cyVar.C0;
                        if (lxVar != null) {
                            lxVar.setVisibility(8);
                        }
                        rx rxVar = cyVar.X;
                        if (rxVar != null) {
                            rxVar.c();
                        }
                        lx lxVar2 = cyVar.C0;
                        if (lxVar2 != null) {
                            lxVar2.A0.clear();
                            lxVar2.J();
                        }
                        xx xxVar = cyVar.e0[0].a;
                        if (xxVar.g1) {
                            xxVar.g1 = false;
                            xxVar.K0(false);
                        }
                        cyVar.r3 = false;
                        ww wwVar2 = cyVar.G3;
                        if (wwVar2 != null) {
                            wwVar2.setVisibility(0);
                        }
                    }
                    View view = cyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    cyVar.B4(z10 ? 1.0f : 0.0f);
                    cyVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    lx lxVar3 = cyVar.C0;
                    if (lxVar3 != null) {
                        lxVar3.setBackground(null);
                    }
                    cyVar.w1 = null;
                    break;
                }
                break;
            case 1:
                cy cyVar2 = this.c;
                cyVar2.P3 = null;
                if (!this.b && (u0Var = cyVar2.m0) != null) {
                    u0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                cy cyVar3 = this.c;
                cyVar3.I = null;
                boolean z11 = this.b;
                cyVar3.K = z11;
                if (!z11 && !cyVar3.L) {
                    cyVar3.E0.setVisibility(8);
                }
                if (z11) {
                    cyVar3.y3 = -AndroidUtilities.dp(81.0f);
                    cyVar3.A4(-cyVar3.S3());
                } else {
                    cyVar3.A4(0.0f);
                    cyVar3.y3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    ay[] ayVarArr = cyVar3.e0;
                    if (i11 >= ayVarArr.length) {
                        View view2 = cyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        ay ayVar = ayVarArr[i11];
                        if (ayVar != null) {
                            ayVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
