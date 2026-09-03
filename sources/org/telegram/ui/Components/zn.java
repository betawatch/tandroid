package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ao b;

    public /* synthetic */ zn(ao aoVar, int i10) {
        this.a = i10;
        this.b = aoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.N = null;
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
                ao aoVar = this.b;
                if (aoVar.N == animator) {
                    aoVar.getSubtitleTextView().setVisibility(4);
                    aoVar.N = null;
                    break;
                }
                break;
            default:
                this.b.N = null;
                break;
        }
    }
}
