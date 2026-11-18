package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class zn extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ao b;

    public /* synthetic */ zn(ao aoVar, int i7) {
        this.a = i7;
        this.b = aoVar;
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
                ao aoVar = this.b;
                if (aoVar.R == animator) {
                    aoVar.getSubtitleTextView().setVisibility(4);
                    aoVar.R = null;
                    break;
                }
                break;
            default:
                this.b.R = null;
                break;
        }
    }
}
