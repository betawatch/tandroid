package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ei c;

    public /* synthetic */ wh(ei eiVar, boolean z10, int i10) {
        this.a = i10;
        this.c = eiVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ei eiVar = this.c;
                yi yiVar = eiVar.e;
                boolean z10 = this.b;
                if (z10) {
                    yiVar.A1.setVisibility(8);
                } else {
                    yiVar.H1.setVisibility(8);
                }
                int dp = z10 ? AndroidUtilities.dp(36.0f) : 0;
                for (int i10 = 0; i10 < yiVar.A0.size(); i10++) {
                    ((ei.p4) yiVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
                }
                if (eiVar.a == animator) {
                    eiVar.a = null;
                    break;
                }
                break;
            default:
                yi yiVar2 = this.c.e;
                boolean z11 = this.b;
                yiVar2.E1 = z11;
                if (!z11) {
                    yiVar2.F1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                yi yiVar = this.c.e;
                if (this.b) {
                    yiVar.H1.setAlpha(0.0f);
                    yiVar.H1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < yiVar.A0.size(); i10++) {
                        ((ei.p4) yiVar.A0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    break;
                } else {
                    yiVar.A1.setAlpha(0.0f);
                    yiVar.A1.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
