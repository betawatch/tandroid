package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class th extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ bi c;

    public /* synthetic */ th(bi biVar, boolean z10, int i10) {
        this.a = i10;
        this.c = biVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                bi biVar = this.c;
                vi viVar = biVar.e;
                boolean z10 = this.b;
                if (z10) {
                    viVar.x1.setVisibility(8);
                } else {
                    viVar.E1.setVisibility(8);
                }
                int dp = z10 ? AndroidUtilities.dp(36.0f) : 0;
                for (int i10 = 0; i10 < viVar.x0.size(); i10++) {
                    ((fi.r4) viVar.x0.valueAt(i10)).setMeasureOffsetY(dp);
                }
                if (biVar.a == animator) {
                    biVar.a = null;
                    break;
                }
                break;
            default:
                vi viVar2 = this.c.e;
                boolean z11 = this.b;
                viVar2.B1 = z11;
                if (!z11) {
                    viVar2.C1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                vi viVar = this.c.e;
                if (this.b) {
                    viVar.E1.setAlpha(0.0f);
                    viVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < viVar.x0.size(); i10++) {
                        ((fi.r4) viVar.x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    break;
                } else {
                    viVar.x1.setAlpha(0.0f);
                    viVar.x1.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
