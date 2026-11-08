package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class jn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn b;

    public /* synthetic */ jn(kn knVar, int i7) {
        this.a = i7;
        this.b = knVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.Q = null;
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
                kn knVar = this.b;
                if (knVar.Q == animator) {
                    knVar.getSubtitleTextView().setVisibility(4);
                    knVar.Q = null;
                    break;
                }
                break;
            default:
                this.b.Q = null;
                break;
        }
    }
}
