package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarLayout b;

    public /* synthetic */ r(ActionBarLayout actionBarLayout, int i7) {
        this.a = i7;
        this.b = actionBarLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        ActionBarLayout actionBarLayout = this.b;
        switch (i7) {
            case 0:
                Drawable drawable = ActionBarLayout.v1;
                actionBarLayout.H(false);
                break;
            default:
                Drawable drawable2 = ActionBarLayout.v1;
                actionBarLayout.H(false);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.B0 = System.currentTimeMillis();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
