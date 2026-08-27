package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gy c;

    public /* synthetic */ hx(gy gyVar, boolean z10, int i10) {
        this.a = i10;
        this.c = gyVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                gy gyVar = this.c;
                gyVar.k3.unlock();
                if (gyVar.s1 == animator) {
                    if (this.b) {
                        gyVar.a0[0].a.c1();
                    } else {
                        cy cyVar = gyVar.a0[0].a;
                        if (cyVar.e1) {
                            cyVar.e1 = false;
                            cyVar.J0(false);
                        }
                    }
                    gyVar.s1 = null;
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
        org.telegram.ui.ActionBar.v0 v0Var;
        switch (this.a) {
            case 0:
                gy gyVar = this.c;
                gyVar.k3.unlock();
                if (gyVar.s1 == animator) {
                    gyVar.A4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        gyVar.a0[0].a.c1();
                        yw ywVar = gyVar.A0;
                        if (ywVar != null) {
                            ywVar.setVisibility(8);
                        }
                        gyVar.m3 = true;
                        Activity parentActivity = gyVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.n2) gyVar).classGuid;
                        AndroidUtilities.requestAdjustResize(parentActivity, i10);
                        gyVar.f0.setVisibility(8);
                        bx bxVar = gyVar.B3;
                        if (bxVar != null) {
                            bxVar.setVisibility(8);
                        }
                    } else {
                        gyVar.n3 = false;
                        px pxVar = gyVar.y0;
                        if (pxVar != null) {
                            pxVar.setVisibility(8);
                        }
                        vx vxVar = gyVar.T;
                        if (vxVar != null) {
                            vxVar.c();
                        }
                        px pxVar2 = gyVar.y0;
                        if (pxVar2 != null) {
                            pxVar2.w0.clear();
                            pxVar2.J();
                        }
                        cy cyVar = gyVar.a0[0].a;
                        if (cyVar.e1) {
                            cyVar.e1 = false;
                            cyVar.J0(false);
                        }
                        gyVar.m3 = false;
                        bx bxVar2 = gyVar.B3;
                        if (bxVar2 != null) {
                            bxVar2.setVisibility(0);
                        }
                    }
                    View view = gyVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    gyVar.D4(z10 ? 1.0f : 0.0f);
                    gyVar.a0[0].a.setVerticalScrollBarEnabled(true);
                    px pxVar3 = gyVar.y0;
                    if (pxVar3 != null) {
                        pxVar3.setBackground(null);
                    }
                    gyVar.s1 = null;
                    break;
                }
                break;
            case 1:
                gy gyVar2 = this.c;
                gyVar2.L3 = null;
                if (!this.b && (v0Var = gyVar2.i0) != null) {
                    v0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                gy gyVar3 = this.c;
                gyVar3.E = null;
                boolean z11 = this.b;
                gyVar3.G = z11;
                if (!z11 && !gyVar3.H) {
                    gyVar3.A0.setVisibility(8);
                }
                if (z11) {
                    gyVar3.t3 = -AndroidUtilities.dp(81.0f);
                    gyVar3.C4(-gyVar3.U3());
                } else {
                    gyVar3.C4(0.0f);
                    gyVar3.t3 = AndroidUtilities.dp(81.0f);
                }
                int i11 = 0;
                while (true) {
                    fy[] fyVarArr = gyVar3.a0;
                    if (i11 >= fyVarArr.length) {
                        View view2 = gyVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        fy fyVar = fyVarArr[i11];
                        if (fyVar != null) {
                            fyVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
