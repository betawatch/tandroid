package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarLayout b;

    public /* synthetic */ s(ActionBarLayout actionBarLayout, int i10) {
        this.a = i10;
        this.b = actionBarLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        ActionBarLayout actionBarLayout = this.b;
        switch (i10) {
            case 0:
                Drawable drawable = ActionBarLayout.p1;
                actionBarLayout.F(false);
                break;
            default:
                Drawable drawable2 = ActionBarLayout.p1;
                actionBarLayout.F(false);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.v0 = System.currentTimeMillis();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
