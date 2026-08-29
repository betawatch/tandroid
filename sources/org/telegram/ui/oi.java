package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class oi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ oi(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        lj ljVar;
        switch (this.a) {
            case 0:
                tn tnVar = this.b;
                xk xkVar = tnVar.X2;
                if (xkVar != null) {
                    xkVar.setIsMessageTransition(false);
                    tnVar.X2.h(true);
                    tnVar.X2.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                tn tnVar2 = this.b;
                tnVar2.w9 = dp;
                tnVar2.o9();
                break;
            case 2:
                tn tnVar3 = this.b;
                if (tnVar3.fragmentView != null && (ljVar = tnVar3.t0) != null) {
                    ljVar.invalidate();
                    tnVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.L.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ui(this, 3), 2000L);
                break;
            case 5:
                tn tnVar4 = this.b;
                if (animator.equals(tnVar4.c3)) {
                    tnVar4.c3 = null;
                    break;
                }
                break;
            case 6:
                tn tnVar5 = this.b;
                if (animator.equals(tnVar5.c3)) {
                    tnVar5.c3 = null;
                    break;
                }
                break;
            case 7:
                tn tnVar6 = this.b;
                if (animator.equals(tnVar6.d3)) {
                    tnVar6.e3 = 1.0f;
                    tnVar6.lc();
                    tnVar6.d3 = null;
                    break;
                }
                break;
            case 8:
                tn tnVar7 = this.b;
                if (animator.equals(tnVar7.d3)) {
                    tnVar7.e3 = 0.0f;
                    tnVar7.lc();
                    tnVar7.d3 = null;
                    break;
                }
                break;
            case 9:
                this.b.P4 = null;
                break;
            case 10:
                tn tnVar8 = this.b;
                tnVar8.za = 1.0f;
                tnVar8.U.setVisibility(4);
                tnVar8.K0.setVisibility(4);
                tnVar8.o9();
                break;
            default:
                tn tnVar9 = this.b;
                tnVar9.za = 0.0f;
                tnVar9.o9();
                break;
        }
    }
}
