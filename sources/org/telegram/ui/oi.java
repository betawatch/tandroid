package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class oi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ oi(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nj njVar;
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                org.telegram.ui.Components.s60 s60Var = snVar.n3;
                if (s60Var != null) {
                    s60Var.setIsMessageTransition(false);
                    snVar.n3.c(true);
                    snVar.n3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                sn snVar2 = this.b;
                snVar2.M9 = dp;
                snVar2.t9();
                break;
            case 2:
                sn snVar3 = this.b;
                if (snVar3.fragmentView != null && (njVar = snVar3.x0) != null) {
                    njVar.invalidate();
                    snVar3.fragmentView.invalidate();
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
                sn snVar4 = this.b;
                if (animator.equals(snVar4.s3)) {
                    snVar4.s3 = null;
                    break;
                }
                break;
            case 6:
                sn snVar5 = this.b;
                if (animator.equals(snVar5.s3)) {
                    snVar5.s3 = null;
                    break;
                }
                break;
            case 7:
                sn snVar6 = this.b;
                if (animator.equals(snVar6.t3)) {
                    snVar6.u3 = 1.0f;
                    snVar6.sc();
                    snVar6.t3 = null;
                    break;
                }
                break;
            case 8:
                sn snVar7 = this.b;
                if (animator.equals(snVar7.t3)) {
                    snVar7.u3 = 0.0f;
                    snVar7.sc();
                    snVar7.t3 = null;
                    break;
                }
                break;
            case 9:
                this.b.f5 = null;
                break;
            case 10:
                sn snVar8 = this.b;
                snVar8.Qa = 1.0f;
                snVar8.Y.setVisibility(4);
                snVar8.a1.setVisibility(4);
                snVar8.t9();
                break;
            default:
                sn snVar9 = this.b;
                snVar9.Qa = 0.0f;
                snVar9.t9();
                break;
        }
    }
}
