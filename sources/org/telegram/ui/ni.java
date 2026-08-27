package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ni extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ ni(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        kj kjVar;
        switch (this.a) {
            case 0:
                rn rnVar = this.b;
                wk wkVar = rnVar.X2;
                if (wkVar != null) {
                    wkVar.setIsMessageTransition(false);
                    rnVar.X2.h(true);
                    rnVar.X2.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                rn rnVar2 = this.b;
                rnVar2.w9 = dp;
                rnVar2.o9();
                break;
            case 2:
                rn rnVar3 = this.b;
                if (rnVar3.fragmentView != null && (kjVar = rnVar3.t0) != null) {
                    kjVar.invalidate();
                    rnVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.L.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new ti(this, 3), 2000L);
                break;
            case 5:
                rn rnVar4 = this.b;
                if (animator.equals(rnVar4.c3)) {
                    rnVar4.c3 = null;
                    break;
                }
                break;
            case 6:
                rn rnVar5 = this.b;
                if (animator.equals(rnVar5.c3)) {
                    rnVar5.c3 = null;
                    break;
                }
                break;
            case 7:
                rn rnVar6 = this.b;
                if (animator.equals(rnVar6.d3)) {
                    rnVar6.e3 = 1.0f;
                    rnVar6.lc();
                    rnVar6.d3 = null;
                    break;
                }
                break;
            case 8:
                rn rnVar7 = this.b;
                if (animator.equals(rnVar7.d3)) {
                    rnVar7.e3 = 0.0f;
                    rnVar7.lc();
                    rnVar7.d3 = null;
                    break;
                }
                break;
            case 9:
                this.b.P4 = null;
                break;
            case 10:
                rn rnVar8 = this.b;
                rnVar8.za = 1.0f;
                rnVar8.U.setVisibility(4);
                rnVar8.K0.setVisibility(4);
                rnVar8.o9();
                break;
            default:
                rn rnVar9 = this.b;
                rnVar9.za = 0.0f;
                rnVar9.o9();
                break;
        }
    }
}
