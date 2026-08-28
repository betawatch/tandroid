package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ sn(tn tnVar, int i9) {
        this.a = i9;
        this.b = tnVar;
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
                tn tnVar = this.b;
                if (tnVar.M == animator) {
                    tnVar.getSubtitleTextView().setVisibility(4);
                    tnVar.M = null;
                    break;
                }
                break;
            default:
                this.b.M = null;
                break;
        }
    }
}
