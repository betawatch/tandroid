package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ yn(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
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
                zn znVar = this.b;
                if (znVar.N == animator) {
                    znVar.getSubtitleTextView().setVisibility(4);
                    znVar.N = null;
                    break;
                }
                break;
            default:
                this.b.N = null;
                break;
        }
    }
}
