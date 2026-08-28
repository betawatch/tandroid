package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class li extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ li(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ij ijVar;
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                uk ukVar = qnVar.X2;
                if (ukVar != null) {
                    ukVar.setIsMessageTransition(false);
                    qnVar.X2.h(true);
                    qnVar.X2.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                qn qnVar2 = this.b;
                qnVar2.w9 = dp;
                qnVar2.o9();
                break;
            case 2:
                qn qnVar3 = this.b;
                if (qnVar3.fragmentView != null && (ijVar = qnVar3.t0) != null) {
                    ijVar.invalidate();
                    qnVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.L.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ri(this, 3), 2000L);
                break;
            case 5:
                qn qnVar4 = this.b;
                if (animator.equals(qnVar4.c3)) {
                    qnVar4.c3 = null;
                    break;
                }
                break;
            case 6:
                qn qnVar5 = this.b;
                if (animator.equals(qnVar5.c3)) {
                    qnVar5.c3 = null;
                    break;
                }
                break;
            case 7:
                qn qnVar6 = this.b;
                if (animator.equals(qnVar6.d3)) {
                    qnVar6.e3 = 1.0f;
                    qnVar6.lc();
                    qnVar6.d3 = null;
                    break;
                }
                break;
            case 8:
                qn qnVar7 = this.b;
                if (animator.equals(qnVar7.d3)) {
                    qnVar7.e3 = 0.0f;
                    qnVar7.lc();
                    qnVar7.d3 = null;
                    break;
                }
                break;
            case 9:
                this.b.P4 = null;
                break;
            case 10:
                qn qnVar8 = this.b;
                qnVar8.za = 1.0f;
                qnVar8.U.setVisibility(4);
                qnVar8.K0.setVisibility(4);
                qnVar8.o9();
                break;
            default:
                qn qnVar9 = this.b;
                qnVar9.za = 0.0f;
                qnVar9.o9();
                break;
        }
    }
}
