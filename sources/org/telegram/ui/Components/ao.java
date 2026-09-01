package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ao extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ ao(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
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
                bo boVar = this.b;
                if (boVar.N == animator) {
                    boVar.getSubtitleTextView().setVisibility(4);
                    boVar.N = null;
                    break;
                }
                break;
            default:
                this.b.N = null;
                break;
        }
    }
}
