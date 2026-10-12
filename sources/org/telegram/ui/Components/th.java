package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                    viVar.A1.setVisibility(8);
                } else {
                    viVar.H1.setVisibility(8);
                }
                int dp = z10 ? AndroidUtilities.dp(36.0f) : 0;
                for (int i10 = 0; i10 < viVar.A0.size(); i10++) {
                    ((fi.q4) viVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
                }
                if (biVar.a == animator) {
                    biVar.a = null;
                    break;
                }
                break;
            default:
                vi viVar2 = this.c.e;
                boolean z11 = this.b;
                viVar2.E1 = z11;
                if (!z11) {
                    viVar2.F1.setVisibility(8);
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
                    viVar.H1.setAlpha(0.0f);
                    viVar.H1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < viVar.A0.size(); i10++) {
                        ((fi.q4) viVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    break;
                } else {
                    viVar.A1.setAlpha(0.0f);
                    viVar.A1.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
