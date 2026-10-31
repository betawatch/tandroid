package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarLayout b;

    public /* synthetic */ r(ActionBarLayout actionBarLayout, int i10) {
        this.a = i10;
        this.b = actionBarLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        ActionBarLayout actionBarLayout = this.b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.v1;
                actionBarLayout.G(false);
                break;
            default:
                Drawable drawable2 = ActionBarLayout.v1;
                actionBarLayout.G(false);
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
