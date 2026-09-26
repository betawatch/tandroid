package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class uh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ci c;

    public /* synthetic */ uh(ci ciVar, boolean z10, int i10) {
        this.a = i10;
        this.c = ciVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ci ciVar = this.c;
                wi wiVar = ciVar.e;
                boolean z10 = this.b;
                if (z10) {
                    wiVar.x1.setVisibility(8);
                } else {
                    wiVar.E1.setVisibility(8);
                }
                int dp = z10 ? AndroidUtilities.dp(36.0f) : 0;
                for (int i10 = 0; i10 < wiVar.x0.size(); i10++) {
                    ((ei.q4) wiVar.x0.valueAt(i10)).setMeasureOffsetY(dp);
                }
                if (ciVar.a == animator) {
                    ciVar.a = null;
                    break;
                }
                break;
            default:
                wi wiVar2 = this.c.e;
                boolean z11 = this.b;
                wiVar2.B1 = z11;
                if (!z11) {
                    wiVar2.C1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                wi wiVar = this.c.e;
                if (this.b) {
                    wiVar.E1.setAlpha(0.0f);
                    wiVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < wiVar.x0.size(); i10++) {
                        ((ei.q4) wiVar.x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    break;
                } else {
                    wiVar.x1.setAlpha(0.0f);
                    wiVar.x1.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
