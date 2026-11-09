package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class aw extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ yw c;

    public /* synthetic */ aw(yw ywVar, boolean z9, int i7) {
        this.a = i7;
        this.c = ywVar;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                yw ywVar = this.c;
                ywVar.q3.e();
                if (ywVar.x1 == animator) {
                    if (this.b) {
                        ywVar.e0[0].a.c1();
                    } else {
                        uw uwVar = ywVar.e0[0].a;
                        if (uwVar.g1) {
                            uwVar.g1 = false;
                            uwVar.K0(false);
                        }
                    }
                    ywVar.x1 = null;
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
                yw ywVar = this.c;
                ywVar.q3.e();
                if (ywVar.x1 == animator) {
                    ywVar.M4(false, true);
                    boolean z9 = this.b;
                    if (z9) {
                        ywVar.e0[0].a.c1();
                        rv rvVar = ywVar.E0;
                        if (rvVar != null) {
                            rvVar.setVisibility(8);
                        }
                        ywVar.s3 = true;
                        Activity parentActivity = ywVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.f2) ywVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i7);
                        ywVar.j0.setVisibility(8);
                        uv uvVar = ywVar.G3;
                        if (uvVar != null) {
                            uvVar.setVisibility(8);
                        }
                    } else {
                        ywVar.t3 = false;
                        hw hwVar = ywVar.C0;
                        if (hwVar != null) {
                            hwVar.setVisibility(8);
                        }
                        nw nwVar = ywVar.X;
                        if (nwVar != null) {
                            nwVar.c();
                        }
                        hw hwVar2 = ywVar.C0;
                        if (hwVar2 != null) {
                            hwVar2.C0.clear();
                            hwVar2.L();
                        }
                        uw uwVar = ywVar.e0[0].a;
                        if (uwVar.g1) {
                            uwVar.g1 = false;
                            uwVar.K0(false);
                        }
                        ywVar.s3 = false;
                        uv uvVar2 = ywVar.G3;
                        if (uvVar2 != null) {
                            uvVar2.setVisibility(0);
                        }
                    }
                    View view = ywVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    ywVar.P4(z9 ? 1.0f : 0.0f);
                    ywVar.e0[0].a.setVerticalScrollBarEnabled(true);
                    hw hwVar3 = ywVar.C0;
                    if (hwVar3 != null) {
                        hwVar3.setBackground(null);
                    }
                    ywVar.x1 = null;
                    break;
                }
                break;
            case 1:
                yw ywVar2 = this.c;
                ywVar2.P3 = null;
                if (!this.b && (r0Var = ywVar2.m0) != null) {
                    r0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                yw ywVar3 = this.c;
                ywVar3.I = null;
                boolean z10 = this.b;
                ywVar3.K = z10;
                if (!z10 && !ywVar3.L) {
                    ywVar3.E0.setVisibility(8);
                }
                if (z10) {
                    ywVar3.z3 = -org.telegram.messenger.g0.L(81.0f);
                    ywVar3.O4(-ywVar3.g4());
                } else {
                    ywVar3.O4(0.0f);
                    ywVar3.z3 = org.telegram.messenger.g0.L(81.0f);
                }
                int i10 = 0;
                while (true) {
                    xw[] xwVarArr = ywVar3.e0;
                    if (i10 >= xwVarArr.length) {
                        View view2 = ywVar3.fragmentView;
                        if (view2 != null) {
                            view2.requestLayout();
                            break;
                        }
                    } else {
                        xw xwVar = xwVarArr[i10];
                        if (xwVar != null) {
                            xwVar.a.requestLayout();
                        }
                        i10++;
                    }
                }
                break;
        }
    }
}
