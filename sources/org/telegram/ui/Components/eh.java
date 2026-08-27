package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class eh extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nh c;

    public /* synthetic */ eh(nh nhVar, boolean z10, int i10) {
        this.a = i10;
        this.c = nhVar;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                nh nhVar = this.c;
                gi giVar = nhVar.e;
                boolean z10 = this.b;
                if (z10) {
                    giVar.t1.setVisibility(8);
                } else {
                    giVar.A1.setVisibility(8);
                }
                int dp = z10 ? AndroidUtilities.dp(36.0f) : 0;
                for (int i10 = 0; i10 < giVar.t0.size(); i10++) {
                    ((nh.e4) giVar.t0.valueAt(i10)).setMeasureOffsetY(dp);
                }
                if (nhVar.a == animator) {
                    nhVar.a = null;
                    break;
                }
                break;
            default:
                gi giVar2 = this.c.e;
                boolean z11 = this.b;
                giVar2.x1 = z11;
                if (!z11) {
                    giVar2.y1.setVisibility(8);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                gi giVar = this.c.e;
                if (this.b) {
                    giVar.A1.setAlpha(0.0f);
                    giVar.A1.setVisibility(0);
                    int dp = AndroidUtilities.dp(36.0f);
                    for (int i10 = 0; i10 < giVar.t0.size(); i10++) {
                        ((nh.e4) giVar.t0.valueAt(i10)).setMeasureOffsetY(dp);
                    }
                    break;
                } else {
                    giVar.t1.setAlpha(0.0f);
                    giVar.t1.setVisibility(0);
                    break;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
