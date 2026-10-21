package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class oi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ oi(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nj njVar;
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                org.telegram.ui.Components.r60 r60Var = qnVar.b3;
                if (r60Var != null) {
                    r60Var.setIsMessageTransition(false);
                    qnVar.b3.c(true);
                    qnVar.b3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                qn qnVar2 = this.b;
                qnVar2.A9 = dp;
                qnVar2.t9();
                break;
            case 2:
                qn qnVar3 = this.b;
                if (qnVar3.fragmentView != null && (njVar = qnVar3.x0) != null) {
                    njVar.invalidate();
                    qnVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.P.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ti(this, 4), 2000L);
                break;
            case 5:
                qn qnVar4 = this.b;
                if (animator.equals(qnVar4.g3)) {
                    qnVar4.g3 = null;
                    break;
                }
                break;
            case 6:
                qn qnVar5 = this.b;
                if (animator.equals(qnVar5.g3)) {
                    qnVar5.g3 = null;
                    break;
                }
                break;
            case 7:
                qn qnVar6 = this.b;
                if (animator.equals(qnVar6.h3)) {
                    qnVar6.i3 = 1.0f;
                    qnVar6.qc();
                    qnVar6.h3 = null;
                    break;
                }
                break;
            case 8:
                qn qnVar7 = this.b;
                if (animator.equals(qnVar7.h3)) {
                    qnVar7.i3 = 0.0f;
                    qnVar7.qc();
                    qnVar7.h3 = null;
                    break;
                }
                break;
            case 9:
                this.b.T4 = null;
                break;
            case 10:
                qn qnVar8 = this.b;
                qnVar8.Ea = 1.0f;
                qnVar8.Y.setVisibility(4);
                qnVar8.O0.setVisibility(4);
                qnVar8.t9();
                break;
            default:
                qn qnVar9 = this.b;
                qnVar9.Ea = 0.0f;
                qnVar9.t9();
                break;
        }
    }
}
