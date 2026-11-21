package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class bo extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ bo(co coVar, int i7) {
        this.a = i7;
        this.b = coVar;
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
                co coVar = this.b;
                if (coVar.R == animator) {
                    coVar.getSubtitleTextView().setVisibility(4);
                    coVar.R = null;
                    break;
                }
                break;
            default:
                this.b.R = null;
                break;
        }
    }
}
