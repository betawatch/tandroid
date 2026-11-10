package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bw extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zw c;

    public /* synthetic */ bw(zw zwVar, boolean z9, int i7) {
        this.a = i7;
        this.c = zwVar;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                zw zwVar = this.c;
                zwVar.q3.e();
                if (zwVar.x1 == animator) {
                    if (this.b) {
                        zwVar.e0[0].a.c1();
                    } else {
                        vw vwVar = zwVar.e0[0].a;
                        if (vwVar.g1) {
                            vwVar.g1 = false;
                            vwVar.K0(false);
                        }
                    }
                    zwVar.x1 = null;
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
                zw zwVar = this.c;
                zwVar.q3.e();
                if (zwVar.x1 == animator) {
                    zwVar.M4(false, true);
                    boolean z9 = this.b;
                    if (z9) {
                        zwVar.e0[0].a.c1();
                        sv svVar = zwVar.E0;
                        if (svVar != null) {
                            svVar.setVisibility(8);
                        }
                        zwVar.s3 = true;
                        Activity parentActivity = zwVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.f2) zwVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i7);
                        zwVar.j0.setVisibility(8);
                        vv vvVar = zwVar.G3;
                        if (vvVar != null) {
                            vvVar.setVisibility(8);
                        }
                    } else {
                        zwVar.t3 = false;
                        iw iwVar = zwVar.C0;
                        if (iwVar != null) {
                            iwVar.setVisibility(8);
                        }
                        ow owVar = zwVar.X;
                        if (owVar != null) {
                            owVar.c();
                        }
                        iw iwVar2 = zwVar.C0;
                        if (iwVar2 != null) {
                            iwVar2.C0.clear();
                            iwVar2.L();
                        }
                        vw vwVar = zwVar.e0[0].a;
                        if (vwVar.g1) {
                            vwVar.g1 = false;
                            vwVar.K0(false);
                        }
                        zwVar.s3 = false;
                        vv vvVar2 = zwVar.G3;
                        if (vvVar2 != null) {
                            vvVar2.setVisibility(0);
                        }
                    }
                    View view = zwVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    zwVar.P4(z9 ? 1.0f : 0.0f);
                    zwVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    iw iwVar3 = zwVar.C0;
                    if (iwVar3 != null) {
                        iwVar3.setBackground(null);
                    }
                    zwVar.x1 = null;
                    break;
                }
                break;
            case 1:
                zw zwVar2 = this.c;
                zwVar2.P3 = null;
                if (!this.b && (r0Var = zwVar2.m0) != null) {
                    r0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                zw zwVar3 = this.c;
                zwVar3.I = null;
                boolean z10 = this.b;
                zwVar3.K = z10;
                if (!z10 && !zwVar3.L) {
                    zwVar3.E0.setVisibility(8);
                }
                if (z10) {
                    zwVar3.z3 = -org.telegram.messenger.g0.L(81.0f);
                    zwVar3.O4(-zwVar3.g4());
                } else {
                    zwVar3.O4(0.0f);
                    zwVar3.z3 = org.telegram.messenger.g0.L(81.0f);
                }
                int i10 = 0;
                while (true) {
                    yw[] ywVarArr = zwVar3.e0;
                    if (i10 >= ywVarArr.length) {
                        View view2 = zwVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        yw ywVar = ywVarArr[i10];
                        if (ywVar != null) {
                            ywVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
        }
    }
}
