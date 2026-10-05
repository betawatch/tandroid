package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class vh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ci c;

    public /* synthetic */ vh(ci ciVar, boolean z10, int i10) {
        this.a = i10;
        this.c = ciVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ci ciVar = this.c;
                xi xiVar = ciVar.e;
                boolean z10 = this.b;
                if (z10) {
                    xiVar.x1.setVisibility(8);
                } else {
                    xiVar.E1.setVisibility(8);
                }
                int dp = z10 ? AndroidUtilities.dp(36.0f) : 0;
                for (int i10 = 0; i10 < xiVar.x0.size(); i10++) {
                    ((ei.r4) xiVar.x0.valueAt(i10)).setMeasureOffsetY(dp);
                }
                if (ciVar.a == animator) {
                    ciVar.a = null;
                    break;
                }
                break;
            default:
                xi xiVar2 = this.c.e;
                boolean z11 = this.b;
                xiVar2.B1 = z11;
                if (!z11) {
                    xiVar2.C1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                xi xiVar = this.c.e;
                if (this.b) {
                    xiVar.E1.setAlpha(0.0f);
                    xiVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < xiVar.x0.size(); i10++) {
                        ((ei.r4) xiVar.x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    break;
                } else {
                    xiVar.x1.setAlpha(0.0f);
                    xiVar.x1.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
