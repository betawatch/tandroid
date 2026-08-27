package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ qn(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.M = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                rn rnVar = this.b;
                if (rnVar.M == animator) {
                    rnVar.getSubtitleTextView().setVisibility(4);
                    rnVar.M = null;
                    break;
                }
                break;
            default:
                this.b.M = null;
                break;
        }
    }
}
