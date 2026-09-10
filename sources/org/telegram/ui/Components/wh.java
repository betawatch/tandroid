package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                    yiVar.x1.setVisibility(8);
                } else {
                    yiVar.E1.setVisibility(8);
                }
                int dp = z10 ? AndroidUtilities.dp(36.0f) : 0;
                for (int i10 = 0; i10 < yiVar.x0.size(); i10++) {
                    ((di.u4) yiVar.x0.valueAt(i10)).setMeasureOffsetY(dp);
                }
                if (eiVar.a == animator) {
                    eiVar.a = null;
                    break;
                }
                break;
            default:
                yi yiVar2 = this.c.e;
                boolean z11 = this.b;
                yiVar2.B1 = z11;
                if (!z11) {
                    yiVar2.C1.setVisibility(8);
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
                    yiVar.E1.setAlpha(0.0f);
                    yiVar.E1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < yiVar.x0.size(); i10++) {
                        ((di.u4) yiVar.x0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    break;
                } else {
                    yiVar.x1.setAlpha(0.0f);
                    yiVar.x1.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
