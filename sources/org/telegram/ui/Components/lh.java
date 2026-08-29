package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ uh c;

    public /* synthetic */ lh(uh uhVar, boolean z10, int i10) {
        this.a = i10;
        this.c = uhVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                uh uhVar = this.c;
                ni niVar = uhVar.e;
                boolean z10 = this.b;
                if (z10) {
                    niVar.t1.setVisibility(8);
                } else {
                    niVar.A1.setVisibility(8);
                }
                int dp = z10 ? AndroidUtilities.dp(36.0f) : 0;
                for (int i10 = 0; i10 < niVar.t0.size(); i10++) {
                    ((ph.n3) niVar.t0.valueAt(i10)).setMeasureOffsetY(dp);
                }
                if (uhVar.a == animator) {
                    uhVar.a = null;
                    break;
                }
                break;
            default:
                ni niVar2 = this.c.e;
                boolean z11 = this.b;
                niVar2.x1 = z11;
                if (!z11) {
                    niVar2.y1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ni niVar = this.c.e;
                if (this.b) {
                    niVar.A1.setAlpha(0.0f);
                    niVar.A1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < niVar.t0.size(); i10++) {
                        ((ph.n3) niVar.t0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    break;
                } else {
                    niVar.t1.setAlpha(0.0f);
                    niVar.t1.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
