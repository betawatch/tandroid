package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                li liVar = rhVar.e;
                boolean z4 = this.b;
                if (z4) {
                    liVar.u1.setVisibility(8);
                } else {
                    liVar.B1.setVisibility(8);
                }
                int dp = z4 ? AndroidUtilities.dp(36.0f) : 0;
                for (int i10 = 0; i10 < liVar.u0.size(); i10++) {
                    ((rh.n3) liVar.u0.valueAt(i10)).setMeasureOffsetY(dp);
                }
                if (rhVar.a == animator) {
                    rhVar.a = null;
                    break;
                }
                break;
            default:
                li liVar2 = this.c.e;
                boolean z10 = this.b;
                liVar2.y1 = z10;
                if (!z10) {
                    liVar2.z1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                li liVar = this.c.e;
                if (this.b) {
                    liVar.B1.setAlpha(0.0f);
                    liVar.B1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < liVar.u0.size(); i10++) {
                        ((rh.n3) liVar.u0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    break;
                } else {
                    liVar.u1.setAlpha(0.0f);
                    liVar.u1.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
