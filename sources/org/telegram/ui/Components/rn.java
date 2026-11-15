package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ rn(sn snVar, int i7) {
        this.a = i7;
        this.b = snVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.R = null;
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
                sn snVar = this.b;
                if (snVar.R == animator) {
                    snVar.getSubtitleTextView().setVisibility(4);
                    snVar.R = null;
                    break;
                }
                break;
            default:
                this.b.R = null;
                break;
        }
    }
}
