package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class aw extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ yw c;

    public /* synthetic */ aw(yw ywVar, boolean z10, int i7) {
        this.a = i7;
        this.c = ywVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                yw ywVar = this.c;
                ywVar.r3.e();
                if (ywVar.y1 == animator) {
                    if (this.b) {
                        ywVar.f0[0].a.c1();
                    } else {
                        uw uwVar = ywVar.f0[0].a;
                        if (uwVar.h1) {
                            uwVar.h1 = false;
                            uwVar.K0(false);
                        }
                    }
                    ywVar.y1 = null;
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
                yw ywVar = this.c;
                ywVar.r3.e();
                if (ywVar.y1 == animator) {
                    ywVar.M4(false, true);
                    boolean z10 = this.b;
                    if (z10) {
                        ywVar.f0[0].a.c1();
                        qv qvVar = ywVar.F0;
                        if (qvVar != null) {
                            qvVar.setVisibility(8);
                        }
                        ywVar.t3 = true;
                        Activity parentActivity = ywVar.getParentActivity();
                        i7 = ((org.telegram.ui.ActionBar.e2) ywVar).classGuid;
                        org.telegram.messenger.g0.a3(parentActivity, i7);
                        ywVar.k0.setVisibility(8);
                        uv uvVar = ywVar.H3;
                        if (uvVar != null) {
                            uvVar.setVisibility(8);
                        }
                    } else {
                        ywVar.u3 = false;
                        hw hwVar = ywVar.D0;
                        if (hwVar != null) {
                            hwVar.setVisibility(8);
                        }
                        nw nwVar = ywVar.Y;
                        if (nwVar != null) {
                            nwVar.c();
                        }
                        hw hwVar2 = ywVar.D0;
                        if (hwVar2 != null) {
                            hwVar2.D0.clear();
                            hwVar2.J();
                        }
                        uw uwVar = ywVar.f0[0].a;
                        if (uwVar.h1) {
                            uwVar.h1 = false;
                            uwVar.K0(false);
                        }
                        ywVar.t3 = false;
                        uv uvVar2 = ywVar.H3;
                        if (uvVar2 != null) {
                            uvVar2.setVisibility(0);
                        }
                    }
                    View view = ywVar.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    ywVar.P4(z10 ? 1.0f : 0.0f);
                    ywVar.f0[0].a.setVerticalScrollBarEnabled(true);
                    hw hwVar3 = ywVar.D0;
                    if (hwVar3 != null) {
                        hwVar3.setBackground(null);
                    }
                    ywVar.y1 = null;
                    break;
                }
                break;
            case 1:
                yw ywVar2 = this.c;
                ywVar2.Q3 = null;
                if (!this.b && (q0Var = ywVar2.n0) != null) {
                    q0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                yw ywVar3 = this.c;
                ywVar3.J = null;
                boolean z11 = this.b;
                ywVar3.L = z11;
                if (!z11 && !ywVar3.M) {
                    ywVar3.F0.setVisibility(8);
                }
                if (z11) {
                    ywVar3.A3 = -org.telegram.messenger.g0.L(81.0f);
                    ywVar3.O4(-ywVar3.g4());
                } else {
                    ywVar3.O4(0.0f);
                    ywVar3.A3 = org.telegram.messenger.g0.L(81.0f);
                }
                int i10 = 0;
                while (true) {
                    xw[] xwVarArr = ywVar3.f0;
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
