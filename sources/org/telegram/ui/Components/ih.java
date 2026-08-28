package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ih extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ rh c;

    public /* synthetic */ ih(rh rhVar, boolean z10, int i9) {
        this.a = i9;
        this.c = rhVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                rh rhVar = this.c;
                ki kiVar = rhVar.e;
                boolean z10 = this.b;
                if (z10) {
                    kiVar.t1.setVisibility(8);
                } else {
                    kiVar.A1.setVisibility(8);
                }
                int dp = z10 ? AndroidUtilities.dp(36.0f) : 0;
                for (int i9 = 0; i9 < kiVar.t0.size(); i9++) {
                    ((mh.g4) kiVar.t0.valueAt(i9)).setMeasureOffsetY(dp);
                }
                if (rhVar.a == animator) {
                    rhVar.a = null;
                    break;
                }
                break;
            default:
                ki kiVar2 = this.c.e;
                boolean z11 = this.b;
                kiVar2.x1 = z11;
                if (!z11) {
                    kiVar2.y1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ki kiVar = this.c.e;
                if (this.b) {
                    kiVar.A1.setAlpha(0.0f);
                    kiVar.A1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i9 = 0; i9 < kiVar.t0.size(); i9++) {
                        ((mh.g4) kiVar.t0.valueAt(i9)).setMeasureOffsetY(dp);
                    }
                    break;
                } else {
                    kiVar.t1.setAlpha(0.0f);
                    kiVar.t1.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
