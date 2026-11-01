package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class cx extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zx c;

    public /* synthetic */ cx(zx zxVar, boolean z10, int i10) {
        this.a = i10;
        this.c = zxVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                zx zxVar = this.c;
                zxVar.p3.e();
                if (zxVar.w1 == animator) {
                    if (this.b) {
                        zxVar.e0[0].a.c1();
                    } else {
                        vx vxVar = zxVar.e0[0].a;
                        if (vxVar.g1) {
                            vxVar.g1 = false;
                            vxVar.K0(false);
                        }
                    }
                    zxVar.w1 = null;
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
                zx zxVar = this.c;
                zxVar.p3.e();
                if (zxVar.w1 == animator) {
                    zxVar.M4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        zxVar.e0[0].a.c1();
                        tw twVar = zxVar.E0;
                        if (twVar != null) {
                            twVar.setVisibility(8);
                        }
                        zxVar.r3 = true;
                        Activity parentActivity = zxVar.getParentActivity();
                        i10 = ((org.telegram.ui.ActionBar.k2) zxVar).classGuid;
                        org.telegram.messenger.i0.Z2(parentActivity, i10);
                        zxVar.j0.setVisibility(8);
                        ww wwVar = zxVar.F3;
                        if (wwVar != null) {
                            wwVar.setVisibility(8);
                        }
                    } else {
                        zxVar.s3 = false;
                        jx jxVar = zxVar.C0;
                        if (jxVar != null) {
                            jxVar.setVisibility(8);
                        }
                        ox oxVar = zxVar.X;
                        if (oxVar != null) {
                            oxVar.c();
                        }
                        jx jxVar2 = zxVar.C0;
                        if (jxVar2 != null) {
                            jxVar2.C0.clear();
                            jxVar2.L();
                        }
                        vx vxVar = zxVar.e0[0].a;
                        if (vxVar.g1) {
                            vxVar.g1 = false;
                            vxVar.K0(false);
                        }
                        zxVar.r3 = false;
                        ww wwVar2 = zxVar.F3;
                        if (wwVar2 != null) {
                            wwVar2.setVisibility(0);
                        }
                    }
                    View view = zxVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    zxVar.P4(z10 ? 1.0f : 0.0f);
                    zxVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    jx jxVar3 = zxVar.C0;
                    if (jxVar3 != null) {
                        jxVar3.setBackground(null);
                    }
                    zxVar.w1 = null;
                    break;
                }
                break;
            case 1:
                zx zxVar2 = this.c;
                zxVar2.O3 = null;
                if (!this.b && (t0Var = zxVar2.m0) != null) {
                    t0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                zx zxVar3 = this.c;
                zxVar3.I = null;
                boolean z11 = this.b;
                zxVar3.K = z11;
                if (!z11 && !zxVar3.L) {
                    zxVar3.E0.setVisibility(8);
                }
                if (z11) {
                    zxVar3.y3 = -org.telegram.messenger.i0.L(81.0f);
                    zxVar3.O4(-zxVar3.g4());
                } else {
                    zxVar3.O4(0.0f);
                    zxVar3.y3 = org.telegram.messenger.i0.L(81.0f);
                }
                int i11 = 0;
                while (true) {
                    yx[] yxVarArr = zxVar3.e0;
                    if (i11 >= yxVarArr.length) {
                        View view2 = zxVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        yx yxVar = yxVarArr[i11];
                        if (yxVar != null) {
                            yxVar.a.requestLayout();
                        }
                        i11++;
                    }
                }
                break;
        }
    }
}
