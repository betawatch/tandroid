package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ih extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ rh c;

    public /* synthetic */ ih(rh rhVar, boolean z4, int i10) {
        this.a = i10;
        this.c = rhVar;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                rh rhVar = this.c;
                mi miVar = rhVar.e;
                boolean z4 = this.b;
                if (z4) {
                    miVar.u1.setVisibility(8);
                } else {
                    miVar.B1.setVisibility(8);
                }
                int dp = z4 ? AndroidUtilities.dp(36.0f) : 0;
                for (int i10 = 0; i10 < miVar.u0.size(); i10++) {
                    ((sh.n3) miVar.u0.valueAt(i10)).setMeasureOffsetY(dp);
                }
                if (rhVar.a == animator) {
                    rhVar.a = null;
                    break;
                }
                break;
            default:
                mi miVar2 = this.c.e;
                boolean z10 = this.b;
                miVar2.y1 = z10;
                if (!z10) {
                    miVar2.z1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                mi miVar = this.c.e;
                if (this.b) {
                    miVar.B1.setAlpha(0.0f);
                    miVar.B1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < miVar.u0.size(); i10++) {
                        ((sh.n3) miVar.u0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    break;
                } else {
                    miVar.u1.setAlpha(0.0f);
                    miVar.u1.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
