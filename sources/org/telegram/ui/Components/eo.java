package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class eo extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ eo(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
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
                fo foVar = this.b;
                if (foVar.Q == animator) {
                    foVar.getSubtitleTextView().setVisibility(4);
                    foVar.Q = null;
                    break;
                }
                break;
            default:
                this.b.Q = null;
                break;
        }
    }
}
